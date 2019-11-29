package ca.ciccc.typinggame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ca.ciccc.typinggame.model.Word;
import ca.ciccc.typinggame.model.WordGenerator;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

public class WordGeneratorTest {

  @Test
  public void test() {
    try {
      WordGenerator wordGenerator =
          new WordGenerator(getClass().getResource("../../../wordlist.txt").toURI());
      String expected1 = new Word("African-American").getStr();
      String actual1 = wordGenerator.generateWord(16).getStr();
      assertEquals(expected1, actual1);

      int expected2 = 1;
      int actual2 = wordGenerator.generateWord(1).getStr().length();
      assertEquals(expected2, actual2);

      // wordGenerator.generateWord(15) is empty so the method is looking for generateWord(14).
      // Therefore, expected number will be 14.
      int expected3 = 14;
      int actual3 = wordGenerator.generateWord(15).getStr().length();
      assertEquals(expected3, actual3);

      int expected4 = 0;
      int actual4 = wordGenerator.generateWord(0).getStr().length();
      assertEquals(expected4, actual4);
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
  }
}