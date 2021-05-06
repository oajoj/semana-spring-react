package com.devsuperior.dsvendas.services;

import java.util.List;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //registra a classe como um componente do sistema que poderá ser injetado em outros componentes
public class SaleService {
    
    @Autowired
    private SaleRepository repository;
    @Autowired
    private SellerRepository sellerRepository;
    /*
    * Garante que as operações sejam resolvidas neste momento do service. ReadOnly evita
    * o trancamento no banco
    */
    @Transactional(readOnly = true) 
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll(); //Guarda os Sellers na memória evitando consulta constante ao banco
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return repository.successGroupedBySeller();
    }
}
