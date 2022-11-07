package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {

    private static final boolean CORRECT = true;
    private static final int RANDOM_NUMBERS_LENGTH = 3;

    public Answer createAnswer() {
        List<Character> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < RANDOM_NUMBERS_LENGTH) {
            Character randomNumber =
                Character.forDigit(Randoms.pickNumberInRange(1, 9), 10);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return new Answer(randomNumbers);
    }

    public static boolean endMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        return CORRECT;
    }
}
