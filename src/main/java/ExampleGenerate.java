import org.rdfhdt.hdt.enums.RDFNotation;
import org.rdfhdt.hdt.hdt.HDT;
import org.rdfhdt.hdt.hdt.HDTManager;
import org.rdfhdt.hdt.options.HDTSpecification;

public class ExampleGenerate {

    public static void main(String[] args) throws Exception {
        // Configuration variables
        String baseURI = "http://example.com/mydataset";
        String rdfInput = "C:\\resources\\100-lubm.ttl";
        String inputType = "turtle";
        String hdtOutput = "C:\\resources\\100-lubm.hdt";

        // Create HDT from RDF file
        HDT hdt = HDTManager.generateHDT(
                rdfInput,         // Input RDF File
                baseURI,          // Base URI
                RDFNotation.parse(inputType), // Input Type
                new HDTSpecification(),   // HDT Options
                null              // Progress Listener
        );

        // OPTIONAL: Add additional domain-specific properties to the header:
        //Header header = hdt.getHeader();
        //header.insert("myResource1", "property" , "value");

        // Save generated HDT to a file
        hdt.saveToHDT(hdtOutput, null);
    }


}