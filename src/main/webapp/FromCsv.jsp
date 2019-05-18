<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
    <!--Load the AJAX API-->
    
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script src="jquery.csv.js"></script> 
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(BasicLine);

   
        function BasicLine() {
            $.get("example.csv", function(csvString) {
                var arrayData = $.csv.toArrays(csvString, 
                                              {onParseValue: $.csv.hooks.castToScalar}),
                    data      = new google.visualization.arrayToDataTable(arrayData),
                    options   = {
                                  hAxis: {
                                    title: 'Time'
                                  },
                                  vAxis: {
                                    title: 'Temperature'
                                  },
                                  backgroundColor: '#f1f8e9'
                                },
                    chart     = new google.visualization
                                  .LineChart(document.getElementById('chart_div'));
                chart.draw(data, options);
            },
            'text');
        }
        
        
</script>
   
   </head>

<body>
    <!--Div that will hold the pie chart-->
    <div id="chart_div"></div>
</body>

</html>