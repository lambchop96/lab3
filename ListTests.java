import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
	@Test 
	public void testFilter() {
    List<String> input1 = new ArrayList<>();
    input1.add("apple");
    input1.add("banana");
    input1.add("kiwi");
    input1.add("grape");
    input1.add("lemon");

    List<String> expected = new ArrayList<>();
    input1.add("apple");
    input1.add("banana");
    input1.add("grape");

    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(expected, input1);
  }

  /*
  @Test 
	public void testMerge() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
  }
  */
}
