<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Composer Information</title>
    <style>
        body {
            font-family: Arial, sans-serif; 
            background-color: #f9f9f9; 
            margin: 20px; 
        }
        
        h1 {
            text-align: center; 
        }

        table {
            width: 50%; 
            margin: auto; 
            border-collapse: collapse; 
            background-color: #ffffff; 
            box-shadow: 0px 4px 8px 0px rgba(0, 0, 0, 0.2); 
        }
        
        th {
            background-color: lightgray; 
            color: white; 
            padding: 10px; 
            text-align: center; 
            font-size: 16px; 
        }
        
        td {
            padding: 10px; 
            border: 1px solid #dddddd; 
            text-align: left;
        }

        a.link {
            color: gray; 
            text-decoration: none; 
            font-weight: bold; 
        }

        a.link:hover {
            text-decoration: underline; 
        }
    </style>
</head>
<body>

<h1>Composer Information</h1>

<table>
    <tr>
        <th colspan="2">Composer Details</th>
    </tr>
    <tr>
        <td>First Name:</td>
        <td>${requestScope.composer.firstName}</td>
    </tr>
    <tr>
        <td>Last Name:</td>
        <td>${requestScope.composer.lastName}</td>
    </tr>
    <tr>
        <td>ID:</td>
        <td>${requestScope.composer.id}</td>
    </tr>
    <tr>
        <td>Category:</td>
        <td>${requestScope.composer.category}</td>
    </tr>
</table>

<p style="text-align: center;">Go back to <a href="index.jsp" class="link">application home</a>.</p>

</body>
</html>
