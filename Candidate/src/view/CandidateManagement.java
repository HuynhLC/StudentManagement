package view;

import Controller.Manager;
import java.util.ArrayList;
import model.Candidate;

public class CandidateManagement extends Menu {
    ArrayList<Candidate> candidates = new ArrayList<>();
    public CandidateManagement(String title, String[] s) {
        super(title,s);
    }
    @Override
    public void execute(int choice) { {
         switch (choice) {
                case 1:
                    Manager.createCandidate(candidates, 0);
                    break;
                case 2:
                    Manager.createCandidate(candidates, 1);
                    break;
                case 3:
                    Manager.createCandidate(candidates, 2);
                    break;
                case 4:
                    Manager.searchCandidate(candidates);
                    break;
                case 5:
                    return;
            }
        }
    }
}
