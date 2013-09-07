package com.slimshady.javapuzzlers;

import static org.junit.Assert.*;

import org.junit.Test;

public class Puzzle_1Test {

  @Test
  public void oneShouldBeOdd() {
    assertTrue(Puzzle_1.isOdd(1));
  }

  @Test
  public void zeroShouldNotBeOdd() {
    assertFalse(Puzzle_1.isOdd(0));
  }

  @Test
  public void minusOneShouldBeOdd() {
    assertTrue(Puzzle_1.isOdd(-1));
  }

}
