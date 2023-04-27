/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanticwebcarontology;


import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.query.Query ;
import com.hp.hpl.jena.query.QueryExecution ;
import com.hp.hpl.jena.query.QueryExecutionFactory ;
import com.hp.hpl.jena.query.QueryFactory ;
import com.hp.hpl.jena.query.QuerySolution ;
import com.hp.hpl.jena.query.ResultSet ;
import com.hp.hpl.jena.query.ResultSetFormatter;
import org.openjena.atlas.io.IndentedWriter ;
import com.hp.hpl.jena.util.FileManager;
import java.io.*;
import jena.query;


import com.hp.hpl.jena.ontology.*;
import static com.hp.hpl.jena.ontology.OntModelSpec.OWL_MEM;
import static com.hp.hpl.jena.ontology.OntModelSpec.OWL_MEM_MICRO_RULE_INF;
import static com.hp.hpl.jena.sparql.engine.http.Service.base;
import java.util.Iterator;
/*
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.impl.StmtIteratorImpl;
import com.hp.hpl.jena.reasoner.Reasoner;
import com.hp.hpl.jena.reasoner.ReasonerRegistry;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.util.iterator.Filter;
*/



public class SemanticWebCarOntology {

    //public static String my_file="C:\\Users\\Mediamarkt\\Desktop\\KRWEB\\VehicleRecomendation.owl"; 
    //public OntModel model;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        MainWindow a=new MainWindow();
        a.setVisible(true);
        String o=a.my_file();
        System.out.println(o);
      
        
        
        
        
        
        // TODO code application logic here
        
    // create an empty model
    
//Model model = ModelFactory.createOntologyModel();
    //InfModel inf = ModelFactory.createRDFSModel(model);

    
    // use the FileManager to find the input file
    String uri="http://www.semanticweb.org/car_ontology#";
    //String NS=uri + "#";
    
  OntModel model = ModelFactory.createOntologyModel( OWL_MEM ); 
    InputStream in = FileManager.get().open( "C:\\Users\\Mediamarkt\\Desktop\\KRWEB\\VehicleRecomenndation(steady).owl" );
    if (in == null) {
        throw new IllegalArgumentException(
                                 "File: " + "C:\\Users\\Mediamarkt\\Desktop\\KRWEB\\VehicleRecomenndation.owl(steady)" + " not found");
    }
    
    
    // read the RDF/XML file
    model.read(in, "RDF/XML");
   // OntModel inf = ModelFactory.createOntologyModel( OWL_MEM_MICRO_RULE_INF, model );
     //       
       //  OntClass paper = model.getOntClass( NS + "Person" );
//Individual p1 = model.createIndividual( NS + "MYPERSSN", paper );




    /*OntClass c = model.createClass( "http://www.semanticweb.org/car_ontology#" + "SUV" );
    Individual i = model.createIndividual( "http://www.semanticweb.org/car_ontology#" + "SUVVVVVVVV",c);
   Resource v1=model.createResource();
    //v1.addProperty()
    i.addRDFType(OWL2.NamedIndividual);
    System.out.print("Done");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Mediamarkt\\Desktop\\KRWEB\\test.txt"))) {
            writer.write(v1.toString());
            // write it to standard out
            //model.write(System.out);
    */
    
    
    
    /*Resource Mitsos = model.createResource(uri);
    Individual p =model.createProperty(uri,"owns");
        Mitsos.addIndividualRDF.type, "http://www.semanticweb.org/car_ontology#Person");
        Mitsos.addProperty(p, "Marin");*/
        //OntClass paper = model.getOntClass( uri + "Person" );
        
        
        
/*Individual p1 = model.createIndividual( uri+"marino",model.createResource(uri+"Person"));
p1.addRDFType(OWL2.NamedIndividual);
      OutputStream out = new FileOutputStream("C:\\Users\\Mediamarkt\\Desktop\\KRWEB\\x.owl");
model.write( out); // readable rdf/xml
out.close();
  */      
        
    
    
    
    
    
    
    
    //SPARQL queries
   /* String per="Person";
    */
    //Literal per=(Literal)p;
    /*
    String queryString ="PREFIX owl: <http://www.w3.org/2002/07/owl#>"+
        "PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
        "PREFIX my: <http://www.semanticweb.org/car_ontology#>"+
        "PREFIX xsd:<http://www.w3.org/2001/XMLSchema#>"+
        
        "SELECT ?x "+
            " WHERE {?x a my:Person}" ;

            

    Query query = QueryFactory.create(queryString) ;


    QueryExecution qexec = QueryExecutionFactory.create(query, model) ;
    ResultSet rs = qexec.execSelect() ;
    
    for (;rs.hasNext() ; ) {
      QuerySolution r = rs.nextSolution() ;
        RDFNode x = r.get("x"); 
        //RDFNode y=r.get("y");
        
        //Print results like JENA API in terminal
        
        ResultSetFormatter.out(System.out, rs, query);
    
    //if (y.isLiteral()){Literal str=(Literal)y;System.out.println(str);}
    
 //String  yt=y.asNode().getLocalName();
//System.out.println(yt);
   
/*
String c=x.toString();
   //String rep=c.replace("^^http://www.w3.org/2001/XMLSchema#integer","");
   if(c.contains("http://www.semanticweb.org/car_ontology#")){
     String rep=c.replace("http://www.semanticweb.org/car_ontology#","");
   System.out.println(rep);
    *
    qexec.close();
    
          
    

    }*/

}
}