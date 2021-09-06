public class User {
    private int iduser;
    private String firstName;
    private String lastName;
    private int age;
    private double money;
    private String phoneNumber;
    private String email;
    
    public User(int iduser, String firstName, String lastName, int age, double money, String phoneNumber, String email) {
        this.iduser = iduser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.money = money;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    
    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
