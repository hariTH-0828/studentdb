function validate() {
    var userID = document.getElementById('userid');
    var password = document.getElementById("password");

    if (userID != "" || password != "") {
        alert(userID + " : userID " + password + " : Password");
    } else {
        alert("Null input is not valid");
    }
}