package Collectionproblem;

public class CollegeLibrary implements Library {

//Implementing Interface method
    public String BookName(String name) {
        return (name += " :_ technology bookname");
    }

    public String CollegeLocation(String Locationname) {
        return (Locationname += " : ");
    }

    public String Author(String Aname) {
        return (Aname += " : name of author");
    }

    public String Publisher(String Publishername) {
        return (Publishername += " : name of publisher");
    }

    public String PublishPlace(String PlaceOfpublished) {
        return (PlaceOfpublished += " : place of publish");
    }

    public String place(String Yearof) {
        return (Yearof += " :  published year");
    }
}
