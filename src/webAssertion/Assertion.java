/**
 * 
 */
package webAssertion;

/**
 * @author Patrick Kasarski
 * 
 */
public class Assertion {
	// the aspect of the site you want to test, as an XPath query
	private final String query;
	// whether you are interested in this query being true or false
	private final boolean tf;
	
	private driver = new WebD

	/**
	 * @param xPath
	 * @param tf
	 */
	public Assertion(String bool, String query) {
		this.tf = Boolean.parseBoolean(bool);
		this.query = query;
	}

	public boolean test() {

	}
}
