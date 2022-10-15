import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
	/*
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

    ListExamples.filter(input1, );
    assertArrayEquals(expected, input1);
  }
  */

  @Test 
	public void testMerge() {
    List<String> input1 = new ArrayList<>();
    input1.add("apple");
    input1.add("banana");

    List<String> input2 = new ArrayList<>();
    input2.add("apricot");
    input2.add("orange");
    input2.add("grape");

    List<String> expected = new ArrayList<>();
    expected.add("apple");
    expected.add("apricot");
    expected.add("banana");
    expected.add("orange");
    expected.add("grape");
    
    assertEquals(expected, ListExamples.merge(input1, input2));
  }
}
