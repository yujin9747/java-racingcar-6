package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class UserInputManager {

    private static final String INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ROUND_MESSAGE = "시도할 회수는 몇회인가요?";

    public static String getCarWithComma() {
        System.out.println(INPUT_MESSAGE);
        return Console.readLine();
    }

    public static String getRoundStr() {
        System.out.println(INPUT_ROUND_MESSAGE);
        return Console.readLine();
    }
}