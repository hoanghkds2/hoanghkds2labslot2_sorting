import Common.Library;
import Controller.Sorting_Controller;
import Model.Element;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSize_array(library.getInt("Enter size of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.createArray(element.size_array));
        new Sorting_Controller(element).run();
    }
}