<!DOCTYPE html>
<html lang="en">
<head>
    
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Auto-Completion using AJAX</title>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body onload="init()">
    <div class="container">
        <h1>Auto-Completion using AJAX</h1>
        <div class="description">
            <p>This example shows how you can do real-time auto-completion using Asynchronous JavaScript and XML (Ajax) interactions.</p>
            <p>In the form below, enter a name. Possible names that will be completed are displayed below the form. For example, try typing in "Bach," "Mozart," or "Stravinsky," then click on one of the selections to see composer details.</p>
        </div>
        <form name="autofillform" action="autocomplete">
            <table border="0" cellpadding="5"> 
                <tbody>
                    <tr>
                        <td><strong>Composer Name:</strong></td>
                        <td>
                            <input type="text" size="40" id="complete-field" onkeyup="doCompletion()">
                        </td>
                    </tr>
                    <tr>
                        <td id="auto-row" colspan="2">
                            <table id="complete-table" class="popupBox"></table>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </div>
    <script type="text/javascript" src="javascript.js"></script>
</body>
</html>
