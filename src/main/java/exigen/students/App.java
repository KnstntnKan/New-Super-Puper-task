package exigen.students;

public class App {

    public static String getAnswer(String question){
        String output = "";
        output = output.concat(printQuestion(question));
        output = output.concat("\n\n");
        output = output.concat(printAnswer());
        return output;
    }
    
    private static String printQuestion(String question) {
        String questionOut = "Можно ли тебе " + question;
        if (!questionOut.endsWith("?")) {
            questionOut += "?";
        }
        return questionOut;
    }

    private static String printAnswer() {
        return new DefaultReplyGenerator().generate();
    }
}
