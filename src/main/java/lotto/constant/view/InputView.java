package lotto.constant.view;

public enum InputView {
    PURCHASE_MESSAGE("구입금액을 입력해 주세요."),
    WINNING_NUMBER_MESSAGE("당첨 번호를 입력해 주세요."),
    BONUS_NUMBER_MESSAGE("보너스 번호를 입력해 주세요.");

    private final String message;

    InputView(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}