package java_object_class;

public class ObjectInitialaizationByReference {

    int id;
    String name;

}

class Student {
    public static void main(String[] args) {

        // Object Initialization by making  a reference
        ObjectInitialaizationByReference objectInitialaizationByReference = new ObjectInitialaizationByReference();
        objectInitialaizationByReference.id = 1;
        objectInitialaizationByReference.name = "Oshama";

        System.out.println(objectInitialaizationByReference.id + " " + objectInitialaizationByReference.name);
    }
}
