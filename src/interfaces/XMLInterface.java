package interfaces;

import java.util.List;
import pojos.Medication;
import pojos.Supplier;
import xml.PharmacyWrapper;

public interface XMLInterface{

	/**
	 * Exports a list of medications to an XML file.
	 * * @param medications the list of medications
	 * @param fileName    the output file name
	 */
	void exportMedications(List<Medication> medications, String fileName);

	/**
	 * Imports medications from an XML file.
	 * * @param fileName the XML file name
	 * @return the list of imported medications
	 */
	List<Medication> importMedications(String fileName);

	/**
	 * Exports a list of suppliers to an XML file.
	 * * @param suppliers  the list of suppliers
	 * @param fileName   the output file name
	 */
	void exportSuppliers(List<Supplier> suppliers, String fileName);

	/**
	 * Imports suppliers from an XML file.
	 * * @param fileName the XML file name
	 * @return the list of imported suppliers
	 */
	List<Supplier> importSuppliers(String fileName);

	/**
	 * Exports the whole database to an XML file.
	 * * @param project  the PharmacyWrapper containing all data
	 * @param fileName the output file name
	 */
	void exportWholeDatabase(PharmacyWrapper project, String fileName);

	/**
	 * Imports the whole database from an XML file.
	 * * @param fileName the XML file name
	 * @return the PharmacyWrapper containing all imported data
	 */
	PharmacyWrapper importWholeDatabase(String fileName);

	/**
	 * Validates an XML file against its XSD schema.
	 * * @param xmlFile the path to the XML file
	 * @param xsdFile the path to the XSD file
	 */
	void validateXML(String xmlFile, String xsdFile);

}
