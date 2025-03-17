public class User {
    private String firstname;
    private String lastname;
    /*  private String fullname;
      public String setfullname() {
      return firstname + " " + lastname;
  }
  */
    public User(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname =lastname;
    }
    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getfirstname(){
        return firstname;
    }
    public void setlastname(String lastname) {
        this.lastname = lastname;
    }
    public String getlastname(){
        return lastname;
    }
}
