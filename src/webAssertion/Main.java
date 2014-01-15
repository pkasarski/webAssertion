/**
 * 
 */
package webAssertion;

/**
 * @author Patrick Kasarski
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != 2)
			displayHelp();
		else if (!args[0].equals("true") && !args[0].equals("false"))
			displayHelp();

		else {
			webAssertion.Assertion assertion = new Assertion(args[0], args[1]);

		}
	}

	private static void displayHelp() {
		// @formatter:off
		final String HELP_MSG =
				"Usage:\n" +
				"website-assertion [boolean] [XPath query]";
		// @formatter:on
		System.out.println(HELP_MSG);
	}

}
