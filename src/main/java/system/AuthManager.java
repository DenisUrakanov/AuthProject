package system;

public class AuthManager {
    public boolean isAuth(String username,String password){
        return username.equals("admin") && password.equals("123456");
    }
}
