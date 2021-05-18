import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {

  private Set<Integer> numbers;

  @BeforeEach
  void setUp() {
    numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
  }

  @Test
  void givenSetExpectedSize_whenGettingSetSize_thenEquals() {
    // Given
    int expectedSetSize = 3;

    // When
    int actualSetSize = numbers.size();

    // Then
    assertEquals(expectedSetSize, actualSetSize);
  }
}
