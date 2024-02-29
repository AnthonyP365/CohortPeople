package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String githubHandle;
    private String favoriteColor;
    private String birthMonth;
    private boolean havePets;

    public Person(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGitHubHandle() {
        return githubHandle;
    }

    public void setGithubHandle(String githubHandle) {
        this.githubHandle = githubHandle;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public boolean isHavePets() {
        return havePets;
    }

    public void setHavePets(boolean havePets) {
        this.havePets = havePets;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.githubHandle + ", " + this.favoriteColor + ", " + this.birthMonth + ", " + this.havePets;
    }
}
