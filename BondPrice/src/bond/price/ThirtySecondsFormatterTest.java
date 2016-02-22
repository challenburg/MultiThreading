package bond.price;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThirtySecondsFormatterTest {
	ThirtySecondsFormatter formatter = new ThirtySecondsFormatter();

	// test one digit integer part
	@Test
	public void testConvertOneDigitInt() {
		double num = 9.03125;
		assertEquals("09-01", formatter.convert(num));
	}

	// test two digits integer part
	@Test
	public void testConvertTwoDigitInt() {
		double num = 90.03125;
		assertEquals("90-01", formatter.convert(num));
	}

	// test one digit decimal part
	@Test
	public void testConvertOneDigitDec() {
		double num = 90.03125;
		assertEquals("90-01", formatter.convert(num));
	}

	// test two digits decimal part
	@Test
	public void testConvertTwoDigitDec() {
		double num = 90.96875;
		assertEquals("90-31", formatter.convert(num));
	}

	// test invalid input1, not integer times of 1/32
	@Test
	public void testConvertInvalidInput1() {
		double num = 90.96876;
		assertEquals("invalid input, please try again", formatter.convert(num));
	}

	// test invalid input2, negative number
	@Test
	public void testConvertInvalidInput2() {
		double num = -90.96876;
		assertEquals("invalid input, please try again", formatter.convert(num));
	}
}
