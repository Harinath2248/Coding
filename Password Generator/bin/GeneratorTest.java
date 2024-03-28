import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class GeneratorTest {
	
	private final Password password= new Password("Secret");
	private final Alphabet firstAlphabet = new Alphabet(true,false,false,false);
	private final Alphabet secondAlphabet = new Alphabet(false,true,true,true);
	private final Generator generator = new Generator(true,false,false,false);
	private final Password generatedPassword = generator.GeneratePassword(4);
//	private final Password generatedPassword = generator.GeneratePassword(4);

	@Test
	void test1() {
@@ -34,11 +34,5 @@ void test4() {
	void test5() {
		assertEquals(generator.alphabet.getAlphabet().length(), 26);
	}


	@Test
	void test6() {
		assertEquals(generatedPassword.Length, 4);
		System.out.println(generatedPassword);
	}

}