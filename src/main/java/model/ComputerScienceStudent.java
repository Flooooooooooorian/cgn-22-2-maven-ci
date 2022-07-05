package model;

public class ComputerScienceStudent extends Student{

    private String favoriteProgrammingLanguage;

    public ComputerScienceStudent(String id, String name, String favoriteProgrammingLanguage) {
        super(id, name);
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }



    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    @Override
    public String getCourse() {
        return "Informatik";
    }
}
