import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class BowlingGameTest {

    @Test
    public void should_be_10_plus_following_two_balls_strike_bottles_when_calculate_first_game_score_given_first_game_STRIKE_and_second_game_not_STRIKE(){
        BowlingGame bowlingGame = new BowlingGame();
        Bowling bowling1 = new Bowling();
        bowling1.setScore(10);
        Bowling bowling2 = new Bowling();
        bowling2.setScore(5);
        bowlingGame.throwBowling(bowling1,null);
        bowlingGame.throwBowling(bowling2,bowling2);

        int score = bowlingGame.calculateSingleGameScore(1);

        assertEquals(20,score);
    }


    @Test
    public void should_be_20_plus_following_one_ball_strike_bottles_when_calculate_first_game_score_given_first_game_and_second_game_both_STRIKE() {
        BowlingGame bowlingGame = new BowlingGame();
        Bowling bowling1 = new Bowling();
        bowling1.setScore(10);
        Bowling bowling2 = new Bowling();
        bowling2.setScore(5);
        bowlingGame.throwBowling(bowling1, null);
        bowlingGame.throwBowling(bowling1, null);
        bowlingGame.throwBowling(bowling2, bowling2);

        int score = bowlingGame.calculateSingleGameScore(1);

        assertEquals(25, score);
    }

    @Test
    public void should_be_10_plus_following_one_ball_strike_bottles_when_calculate_first_game_score_given_first_game_SPARE() {
        BowlingGame bowlingGame = new BowlingGame();
        Bowling bowling1 = new Bowling();
        bowling1.setScore(5);
        bowlingGame.throwBowling(bowling1, bowling1);
        bowlingGame.throwBowling(bowling1, bowling1);

        int score = bowlingGame.calculateSingleGameScore(1);

        assertEquals(15, score);
    }

    @Test
    public void should_be_10_plus_following_two_balls_strike_bottles_when_calculate_tenth_game_score_given_tenth_game_STRIKE() {
        BowlingGame bowlingGame = new BowlingGame();
        Bowling bowling1 = new Bowling();
        bowling1.setScore(4);
        for (int i = 0; i < 9; i++) {
            bowlingGame.throwBowling(bowling1, bowling1);
        }
        Bowling bowling2 = new Bowling();
        bowling2.setScore(10);
        bowlingGame.throwBowling(bowling2,bowling2,bowling2);

        int score = bowlingGame.calculateSingleGameScore(10);

        assertEquals(30, score);
    }

    @Test
    public void should_be_10_plus_following_one_ball_strike_bottles_when_calculate_tenth_game_score_given_tenth_game_SPARE() {
        BowlingGame bowlingGame = new BowlingGame();
        Bowling bowling1 = new Bowling();
        bowling1.setScore(4);
        for (int i = 0; i < 9; i++) {
            bowlingGame.throwBowling(bowling1, bowling1);
        }
        Bowling bowling2 = new Bowling();
        bowling2.setScore(5);
        bowlingGame.throwBowling(bowling2,bowling2,bowling2);

        int score = bowlingGame.calculateSingleGameScore(10);

        assertEquals(15, score);
    }

    @Test
    public void should_be_two_ball_strike_bottles_num_when_calculate_game_score_given_the_second_ball_have_not_strike_all_bottles() {
        BowlingGame bowlingGame = new BowlingGame();
        Bowling bowling1 = new Bowling();
        bowling1.setScore(4);
        bowlingGame.throwBowling(bowling1, bowling1);

        int score = bowlingGame.calculateSingleGameScore(1);

        assertEquals(8, score);
    }

    @Test
    public void should_be_280_plus_last_two_balls_strike_bottles_when_calculate_final_score_given_all_games_are_STRIKE() {
        BowlingGame bowlingGame = new BowlingGame();
        Bowling bowling1 = new Bowling();
        bowling1.setScore(10);
        for (int i = 0; i < 9; i++) {
            bowlingGame.throwBowling(bowling1, null);
        }
        bowlingGame.throwBowling(bowling1,bowling1,bowling1);
        int score = bowlingGame.calculateFinalGameScore();

        assertEquals(300, score);
    }

    @Test
    public void should_be_100_plus_first_ball_of_second_to_tenth_game_strike_bottles_plus_last_ball_strike_bottles_when_calculate_final_score_given_all_games_are_SPARE() {
        BowlingGame bowlingGame = new BowlingGame();
        Bowling bowling1 = new Bowling();
        bowling1.setScore(5);
        for (int i = 0; i < 9; i++) {
            bowlingGame.throwBowling(bowling1, bowling1);
        }
        bowlingGame.throwBowling(bowling1,bowling1,bowling1);
        int score = bowlingGame.calculateFinalGameScore();

        assertEquals(150, score);
    }
}
