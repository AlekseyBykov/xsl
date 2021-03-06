package alekseybykov.portfolio.xslt;

import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.transform.TransformerException;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * @author Aleksey Bykov
 * @since 04.04.2020
 */
public class XSLTTest extends XSLTTestBase {

	@Test
	public void testBaseTransformations() throws TransformerException, IOException, SAXException {
		String transformed = transform("core.xsl", "core.xml");
		String expected = loadFixture("core-fixture.xml");

		assertTrue(isXmlSimilar(transformed, expected));
	}

	@Test
	public void testXslIf() throws TransformerException, IOException, SAXException {
		String transformed = transform("xsl-if.xsl", "xsl-if.xml");
		String expected = loadFixture("xsl-if-fixture.xml");

		assertTrue(isXmlSimilar(transformed, expected));
	}

	@Test
	public void testXslChoose() throws TransformerException, IOException, SAXException {
		String transformed = transform("xsl-choose.xsl", "xsl-choose.xml");
		String expected = loadFixture("xsl-choose-fixture.xml");

		assertTrue(isXmlSimilar(transformed, expected));
	}

	@Test
	public void testXslKey() throws TransformerException, IOException, SAXException {
		String transformed = transform("xsl-key.xsl", "xsl-key.xml");
		String expected = loadFixture("xsl-key-fixture.xml");

		assertTrue(isXmlSimilar(transformed, expected));
	}

	@Test
	public void testXslApplyTemplate() throws TransformerException, IOException, SAXException {
		String transformed = transform("xsl-apply-template.xsl", "xsl-apply-template.xml");
		String expected = loadFixture("xsl-apply-template-fixture.xml");

		assertTrue(isXmlSimilar(transformed, expected));
	}
}
