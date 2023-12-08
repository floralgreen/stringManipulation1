public class StringHandler {

    public StringBuilder stringsAreEqual(String firstString, String secondString) {
        StringBuilder result = new StringBuilder();
        if (firstString.toLowerCase().equals(secondString)) {
            result.append("Le due stringhe sono uguali");
            return result;
        } else {
            result.append("Le due stringhe sono differenti");
            return result;
        }
    }

}
