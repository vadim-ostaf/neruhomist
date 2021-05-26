package Model;

public class UserModel {
    final private String TableName = "users";
    private String name;
    private String l_name;
    private String type;
    private String password;

    public UserModel(String name, String l_name, String type, String password) {
        this.name = name;
        this.l_name = l_name;
        this.type = type;
        this.password = password;
    }

    public String getTableName() {
        return TableName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
