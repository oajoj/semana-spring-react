//import React from 'react';

import DataTable from "components/dataTable";
import Footer from "components/footer";
import NavBar from "components/navbar";

function App() {
  return (
    <div>
      <>
        <NavBar />
        <div className="container">
          <h1 className="text-primary">Olá mundo</h1>
          <DataTable />
        </div>
        <Footer />
      </>
    </div>
  );
}

export default App;
