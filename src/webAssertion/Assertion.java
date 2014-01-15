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
	private String query;
	// whether you are interested in this query being true or false
	private boolean tf;

	public boolean test() {

	}

	/**
	 * @param xPath
	 * @param tf
	 */
	public Assertion(String xPath, boolean tf) {
		query = xPath;
		this.tf = tf;
	}

	public String getXPath() {
		return query;
	}

	public void setXPath(String xPath) {
		query = xPath;
	}

	public boolean isTf() {
		return tf;
	}

	public void setTf(boolean tf) {
		this.tf = tf;
	}

}
