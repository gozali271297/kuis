package com.sample.multiplechoicequiz;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Siapa nama anda?",
            "2. Apa nama jurusan kuliah anda?",
            "3. Siapa nama dosen mata kuliah perangkat keras anda?",
            "4. Berapa nomor nim belangkang anda?",
            "5. Tahun berapa anda masuk universitas yudharta?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Imam", "Gozali", "Ali", "Imam Gozali"},
            {"PAI", "IT", "Pertanian", "Sikologi"},
            {"Cahya Bagus", "Imron", "Walidini", "Lutfi"},
            {"12", "27", "30", "34"},
            {"2016", "2017", "2018", "2019"}
    };

    private String mCorrectAnswers[] = {"Imam Gozali", "IT", "Cahya Bagus", "34", "2016"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}