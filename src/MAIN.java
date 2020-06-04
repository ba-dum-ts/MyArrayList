import java.util.ArrayList;

public class MAIN {
    static ArrayList<Number> list = new ArrayList<>();

    public static void main(String args[]){
        list.add(420);
        list.add(9.11);
        list.add(21);

        for(int n = 0; n < list.size(); n++){
            System.out.println("Element " + n + " contains: " + list.get(n));
        }
    }

    public static void RemoveFirst(){ // tar bort element i början
        if(list.isEmpty()){ // om listan är tom
            System.out.println("list is empty");
        }

        else{ // tar bort
            list.remove(0);
        }
    }

    public static void RemoveLast(){ // tar bort element i slutet
        if(list.isEmpty()){ // om listan är tom
            System.out.println("list is empty");
        }

        else{ // tar bort
            list.remove(list.size() -1);
        }
    }

    public static void AddLast(Number data){ // lägger till element i slutet
        list.add(data); // lägger till
    }

    public static void InsertAt(int index, Number data){ // lägger till element i en specific position
        if(list.isEmpty()){ // om listan är tom
            System.out.println("list is empty");
            return; // avslutar metod
        }

        try{ // lägger till i specifik position
            list.add(index, data);
        }

        catch(IndexOutOfBoundsException e){ // om index är större än antal elementer i listan slängs det en exception
            System.out.println("position given is out of reach");
        }
    }

    public static void RemoveAt(int index){ // tar bort element i en specific position
        if(list.isEmpty()){ // om listan är tom
            System.out.println("list is empty");
            return; // avslutar metod
        }

        try{ // tar bort ur specifik position
            list.remove(index);
        }

        catch(IndexOutOfBoundsException e){// om index är större än antal elementer i listan slängs det en exception
            System.out.println("position given is out of reach");
        }
    }
}
