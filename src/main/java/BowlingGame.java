import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    List<List> bowlingScore = new ArrayList<>(11);

    public void throwBowling(Bowling bowling1,Bowling bowling2) {
        List<Integer> singleBowlingScore = new ArrayList<>();
        if(bowling1.getScore() == 10){
            singleBowlingScore.add(10);
        }
        else{
           singleBowlingScore.add(bowling1.getScore());
           singleBowlingScore.add(bowling2.getScore());
        }
        bowlingScore.add(singleBowlingScore);
    }


    public int calculateSingleGameScore(int times) {
        int score = 10;
        int currentScore = (int)bowlingScore.get(times).get(0);
        if(currentScore == 10 && (int)bowlingScore.get(times+1).get(0) != 10){ 
            score = 10 +  (int)bowlingScore.get(times+1).get(0)+ (int) bowlingScore.get(times+1).get(1);
        }
        return score;
    }

}
