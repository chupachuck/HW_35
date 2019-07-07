package core;
import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class SubstractTest {
	
	@Test
	public void substract_test_instanceOf() {
		assertThat(Calculator.substract(4, 2), instanceOf(Double.class));}
	
	@Test
	public void substract_test_2_param() {
		assertThat(Calculator.substract(4, 2), equalTo(2.0));
	}
	
	@Test
	public void substract_test_3_param() {
		assertThat(Calculator.substract(8, 2, 3), equalTo(3.0));
	}
	
	@Test
	public void substract_test_4_param() {
		assertThat(Calculator.substract(54, 12, 2, 10), equalTo(30.0));
	}

}
