import org.rdfhdt.hdt.hdt.HDT;
import org.rdfhdt.hdt.hdt.HDTManager;
import org.rdfhdt.hdt.triples.IteratorTripleString;
import org.rdfhdt.hdt.triples.TripleString;

public class ExampleExecution {

    // Load an HDT and perform a search. (examples/ExampleSearch.java)
    public static void main(String[] args) throws Exception {
        // Load HDT file.
        // NOTE: Use loadIndexedHDT() for ?P?, ?PO or ??O queries
        HDT hdt = HDTManager.loadIndexedHDT("C:\\resources\\100-lubm.hdt", null);

        // Search pattern: Empty string means "any"
        IteratorTripleString it = hdt.search("http://www.Department1.University0.edu/Course8", "", "");

        while(it.hasNext()) {
            TripleString ts = it.next();
            System.out.println(ts);
        }
    }
}
