import java.util.Scanner;

public class QuestionService {

    Questions[] questions = new Questions[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Questions(1, "which language  founded in 1995?", "java", "cpp", "python", "JavaScript",
                "java");
        questions[1] = new Questions(2, "what size of double ", "2", "3", "4", "8", "8");
        questions[2] = new Questions(3, "what size of char", "1", "2", "3", "4", "2");
        questions[3] = new Questions(4, "what size of int ", "1", "2", "3", "4", "4");
        questions[4] = new Questions(5, "what size of long", "2", "4", "6", "8", "8");
    }

    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Questions q=questions[i];
            String actualAnswer=q.getAnswer();
            String userAnswer=selection[i];
            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your Score is: "+score);
    }

    public void playQuiz() {
        // after displaying question wait for answer
        int im = 0;
        for (Questions q : questions) {
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            String x[] = q.getOpt();
            for (int i = 0; i < 4; i++) {
                System.out.println(x[i]);
            }
            Scanner sc = new Scanner(System.in);
            selection[im] = sc.nextLine();
            im++;

        }

    }

    public void displayQuestions() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].getQuestion());
        }
    }
}
