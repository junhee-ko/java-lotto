package lotto.domain;

import lotto.input.WinningNumber;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LottoBucketTest {

  @Test
  void matchNumberCount() {
    // Given
    WinningNumber winningNumber = new WinningNumber(new int[]{1, 2, 3, 4, 5, 6});

    LottoBucket lottoBucket = new LottoBucket(asList(
        new Lotto(numberCount -> asList(8, 21, 23, 41, 42, 43)),
        new Lotto(numberCount -> asList(3, 5, 11, 16, 32, 38)),
        new Lotto(numberCount -> asList(7, 11, 16, 35, 36, 44)),
        new Lotto(numberCount -> asList(1, 8, 11, 31, 41, 42)),
        new Lotto(numberCount -> asList(13, 14, 16, 38, 42, 45)),
        new Lotto(numberCount -> asList(7, 11, 30, 40, 42, 43)),
        new Lotto(numberCount -> asList(2, 13, 22, 32, 38, 45)),
        new Lotto(numberCount -> asList(23, 25, 33, 36, 39, 41)),
        new Lotto(numberCount -> asList(1, 3, 5, 14, 22, 45)),
        new Lotto(numberCount -> asList(5, 9, 38, 41, 43, 44)),
        new Lotto(numberCount -> asList(2, 8, 9, 18, 19, 21)),
        new Lotto(numberCount -> asList(13, 14, 18, 21, 23, 35)),
        new Lotto(numberCount -> asList(17, 21, 29, 37, 42, 45)),
        new Lotto(numberCount -> asList(3, 8, 27, 30, 35, 44))
    ));

    MatchNumberCount expectedMatchNumberCount = new MatchNumberCount(new HashMap<Integer, Integer>() {{
      put(3, 1);
      put(4, 0);
      put(5, 0);
      put(6, 0);
    }});

    // When
    MatchNumberCount actualMatchNumberCount = lottoBucket.getMatchNumberCountWith(winningNumber);

    // Then
    assertEquals(expectedMatchNumberCount, actualMatchNumberCount);
  }
}