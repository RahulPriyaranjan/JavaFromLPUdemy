import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
       // LinkedList<String> placesToVisit =  new LinkedList<>();
        var placesToVist = new LinkedList<String>();
        placesToVist.add("Mumbai");
        placesToVist.add(0,"Delhi");
       // System.out.println(placesToVist);

        addMorePlaces(placesToVist);
       // removeElements(placesToVist);
       // System.out.println("Total places to visit is finally: "+placesToVist);
       // retrieveElements(placesToVist);
        printItinerary3(placesToVist);

    }

    public static void addMorePlaces(LinkedList<String> placesToVisit) {
        placesToVisit.addFirst("London");
        placesToVisit.addLast("Beijing");
       // System.out.println(placesToVisit);
       // System.out.println();
        //Queue methods:
        placesToVisit.offer("Melbourne");
        placesToVisit.offerFirst("Sydney");
        //System.out.println(placesToVisit);
        //Stack methods:
        placesToVisit.push("Tokyo");
       // System.out.println(placesToVisit);
        System.out.println("Pushing to master");
    }

    public static void removeElements(LinkedList<String> placesToNotVisit) {
        placesToNotVisit.remove(4);
        placesToNotVisit.remove("Tokyo");
        System.out.println(placesToNotVisit);
        System.out.println();

        String s1 = placesToNotVisit.remove();
        System.out.println(s1+" removed");
        System.out.println(placesToNotVisit);

        String s2 = placesToNotVisit.removeFirst();
        System.out.println(s2+" removed");
        System.out.println(placesToNotVisit);

        String s3 = placesToNotVisit.removeLast();
        System.out.println(s3+" removed");
        System.out.println(placesToNotVisit);   
    }
    public static void retrieveElements(LinkedList<String> placesToVisit) {
        System.out.println("Retrieved element "+placesToVisit.get(4));

        System.out.println("First Element is "+placesToVisit.getFirst());
        System.out.println("Last element is "+ placesToVisit.getLast());
        //Get the index of the element in the list using indexOf.
        System.out.println("Delhi is at: " +placesToVisit.indexOf("Delhi"));
        System.out.println("Sydney is at : "+placesToVisit.indexOf("Sydney"));
        //Using Queue, which is first in first out
        System.out.println("Retrieved through element: "+placesToVisit.element());
        //Using stack:
        System.out.println("Element through peek first: "+placesToVisit.peekFirst());
        System.out.println("Element through peek last: "+placesToVisit.peekLast());
    }

    public static void printItinerary(LinkedList<String> listOfPlaces){

        System.out.println("Trip starts at: "+listOfPlaces.getFirst());
        for(int i =1; i<listOfPlaces.size();i++){
            System.out.println("---> from:  "+listOfPlaces.get(i-1)+" to "+listOfPlaces.get(i));
        }
        System.out.println("Trip ends at: "+listOfPlaces.getLast());
    }
    public static void printItinerary2(LinkedList<String> listOfPlaces){

        System.out.println("Trip starts at: "+listOfPlaces.getFirst());
        String previousTown = listOfPlaces.getFirst();
        for( String places: listOfPlaces){
            System.out.println("---> from:  "+previousTown+" to "+places);
            previousTown = places;
        }
        System.out.println("Trip ends at: "+listOfPlaces.getLast());
    }

    public static void printItinerary3(LinkedList<String> listOfPlaces){

        System.out.println("Trip starts at: "+listOfPlaces.getFirst());
        String previousTown = listOfPlaces.getFirst();
        ListIterator<String> iterator = listOfPlaces.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("---> from: "+previousTown+ " to "+town);
            previousTown =town;
        }
        System.out.println("Trip ends at: "+listOfPlaces.getLast());
    }
}
