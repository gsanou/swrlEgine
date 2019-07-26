import org.semanticweb.owlapi.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class lookFor {

    public static OWLIndividual x = null;
    public  static boolean f = false;
    public  static boolean fE = false;
    public static void getSomething(OWLIndividual ind, OWLOntology ont, String ns, OWLDataFactory df, OWLIndividual basInd, boolean f1, OWLClassExpression clas, List<OWLIndividual> clasCollection) {

        System.out.println("Welcome to get!!!"+ ind);
        List<OWLIndividual> listEq = new ArrayList<>();
        x = isItWhatILookingFor.hasNecessary(ind,ont,ns,df,clas, clasCollection);
        if (x != null) {
            System.out.println("Found  ");
            System.out.println(ind + " hasEquipment " + x);
        }
       else if(isSomeProtected.IsProtected(ind, ont, ns, df,listEq) && f1){
            System.out.println("found protected Eqipment with" + ind );
        }
        else{
            f1 =true;
            for (OWLIndividual i: connectionWith.hasConnection(ind,ont,ns,df)) {
                System.out.println("----------------");
                if( !i.equals(basInd)){
                    getSomething(i, ont, ns, df, ind, f1, clas, clasCollection);
                }
            }
        }
    }
    public static void getTT_TV_CBR(OWLIndividual ind, OWLOntology ont, String ns, OWLDataFactory df, OWLIndividual basInd, Collection<OWLIndividual> cnWithCBR, boolean f1, List<OWLIndividual> listTCTR, List<OWLIndividual> listTVTR, List<OWLIndividual> listCBR, List<OWLIndividual> listEq ){
        System.out.println("Welcome to get!!!"+ ind);
       // boolean fE= false
        fE= isSomeProtected.IsProtected(ind,ont,ns,df,listEq);
        f = isItWhatILookingFor.foundBreaker(ind,ont,ns,df,listTCTR,listTVTR,listCBR);
        if (f) {
            System.out.println("Found Breaker ");
            cnWithCBR.add(ind);
        }
        else if(fE && f1){
            System.out.println("found protected Eqipment with" + ind );
        }
//        else if(isSomeProtected.IsProtectedConnected(ind,ont,ns,df)!=null){
//            listEq.add(isSomeProtected.IsProtectedConnected(ind,ont,ns,df));
//        }
        else{
            f1 =true;
            for (OWLIndividual i: connectionWith.hasConnection(ind,ont,ns,df)) {
                System.out.println("----------------");
                if( !i.equals(basInd)){
                    getTT_TV_CBR(i, ont, ns, df, ind, cnWithCBR, f1, listTCTR, listTVTR, listCBR,listEq);
                }
            }
        }
    }
    public static void getTT_TV_CBR2(OWLIndividual ind, OWLOntology ont, String ns, OWLDataFactory df, OWLIndividual basInd, boolean f1, List<OWLIndividual> listTCTR, List<OWLIndividual> listTVTR, List<OWLIndividual> listCBR ){
        System.out.println("Welcome to get!!!"+ ind);
        List<OWLIndividual> listEq = new ArrayList<>();
       //  OWLClassExpression tctr_e = df.getOWLClass(IRI.create(ns+"TCTR"));
        f = isItWhatILookingFor.foundBreaker2(ind,ont,ns,df,listTCTR,listTVTR,listCBR);
        if (f) {
             System.out.println("Found tctr ");
        }
        else if(isSomeProtected.IsProtected(ind, ont, ns, df,listEq) && f1){
            System.out.println("found protected Eqipment with" + ind );
        }
        else{
            f1 =true;
            for (OWLIndividual i: connectionWith.hasConnection(ind,ont,ns,df)) {
                System.out.println("----------------");
                if( !i.equals(basInd)){
                    getTT_TV_CBR2(i, ont, ns, df, ind, f1, listTCTR, listTVTR, listCBR);
                }
            }
        }
    }
    public static void getConnectedEquipment(OWLIndividual ind, OWLOntology ont, String ns, OWLDataFactory df, OWLIndividual basInd, OWLClassExpression clas, List<OWLIndividual> clasCollection, OWLIndividual basCbr) {
        System.out.println("welcome to connect "+ ind +"and " + basCbr);
        x = isItWhatILookingFor.foundConnected(ind,ont,ns,df,clas, clasCollection, basCbr);
        if (x == null ) {
            for (OWLIndividual i : connectionWith.hasConnection(ind, ont, ns, df)) {
                System.out.println("----------------");
                if (!i.equals(basInd)) {
                    getConnectedEquipment(i, ont, ns, df, ind, clas, clasCollection, basCbr);
                }
            }
        }
        else {
            System.out.println("found " + x);
        }
    }
}
