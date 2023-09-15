package view;

public class Main {

    public static void main(String[] args) {
        String s[] = {"Experience","Fresher","Internship","Searching","Exit"};
        CandidateManagement menu = new CandidateManagement("Candidate Management System", s);
        menu.run();
    }
}
