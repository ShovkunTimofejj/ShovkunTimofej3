package quest;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Question {
    private final String question;
    private final String answerOption1;
    private final String answerOption2;
    private final String answerOption3;
    private final String answerOption4;
    private int rightAnswer;
}
