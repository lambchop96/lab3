import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3, 6, 9 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9, 6, 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = { 7, 8, 9 };
    assertArrayEquals(new int[]{ 9, 8, 7 }, ArrayExamples.reversed(input1));
  }
}
