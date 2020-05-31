import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class BowlingGameTest {

    @Test
    public void should_be_10_plus_following_two_balls_strike_bottles_when_calculate_first_game_score_give_first_score_STRIKE_and_second_game_not_STRIKE(){
        BowlingGame bowlingGame = new BowlingGame();
        Bowling bowling1 = new Bowling();
        bowling1.setScore(10);
        Bowling bowling2 = new Bowling();
        bowling2.setScore(5);
        bowlingGame.throwBowling(bowling1,null);
        bowlingGame.throwBowling(bowling2,bowling2);
        int score = bowlingGame.calculateSingleGameScore(0);

        System.out.println(bowlingGame.bowlingScore.get(0).get(0));

        assertEquals(20,score);
    }
}
