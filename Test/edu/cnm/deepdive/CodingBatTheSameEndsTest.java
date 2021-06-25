package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatTheSameEnds.sameEnds;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheSameEndsTest {

  private int[][] sameArrayParams = {
      {5, 6, 45, 99, 13, 5, 6},
      {5, 6, 45, 99, 13, 5, 6},
      {5, 6, 45, 99, 13, 5, 6},
      {1, 2, 5, 2, 1},
      {1, 2, 5, 2, 1},
      {1, 2, 5, 2, 1},
      {1, 2, 5, 2, 1},
      {1, 1, 1},
      {1, 1, 1},
      {1, 1, 1},
      {1, 1, 1},
      {1},
      {4, 2, 4, 5}
  };

  private int[] sameIntParams = {1, 2, 3, 1, 2, 0, 5, 0, 1, 2, 3, 1, 0, 1};

  private boolean[] sameExpected = {false, true, false, true, false, true, true, true, true, true,
      true, true, true, false};

  @Test
  void sameTest() {
    for (int i = 0; i < sameArrayParams.length; i++) {
      boolean actual = sameEnds(sameArrayParams[i], sameIntParams[i]);
      Assertions.assertEquals(actual, sameExpected[i]);
    }
  }

}