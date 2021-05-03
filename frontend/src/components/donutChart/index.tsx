import Chart from 'react-apexcharts'

const DonutChart = () =>{
    const mockData = {
        series: [477138, 79848, 54568, 445464, 11213],
        labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    }

    const options = {
        legend: {
            show: true
        }
    }

    return(
        <Chart
            options = {{...options, labels: mockData.labels}}
            series = {mockData.series}
            type = "donut"
            height = "240"
        />
    );
}

export default DonutChart;