import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    List<List> bowlingScore = new ArrayList<>(10);

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

    public void throwBowling(Bowling bowling1, Bowling bowling2, Bowling bowling3){
        List<Integer> singleBowlingScore = new ArrayList<>();
        singleBowlingScore.add(bowling1.getScore());
        singleBowlingScore.add(bowling2.getScore());
        singleBowlingScore.add(bowling3.getScore());
        bowlingScore.add(singleBowlingScore);
    }


    public int calculateSingleGameScore(int times) {
        //times 表示第几次
        int score = 0;
        int currentScore = 0;
        for (int i = 0; i < bowlingScore.get(times-1).size(); i++) {
            currentScore += (int)bowlingScore.get(times-1).get(i);
        }
        if(times != 10){
            if((int)bowlingScore.get(times-1).get(0) == 10 && (int)bowlingScore.get(times).get(0) != 10){
                score = 10 +  (int)bowlingScore.get(times).get(0)+ (int) bowlingScore.get(times).get(1);
            }
            else if((int)bowlingScore.get(times-1).get(0) == 10 && (int)bowlingScore.get(times).get(0) == 10){
                score = 20 + (int)bowlingScore.get(times+1).get(0);
            }
            else if(currentScore == 10 && times != 10){
                score = 10 + (int)bowlingScore.get(times).get(0);
            }
        }
        else {
            score = currentScore;
        }
        return score;
    }

}
