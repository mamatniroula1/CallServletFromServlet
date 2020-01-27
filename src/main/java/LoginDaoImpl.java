import java.sql.*;

public class LoginDaoImpl implements loginDao {


    @Override
    public String validateUser(String username, String password) {
        String role="norole";
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/cubic", "root", "");
            String query= "select role from kubiko where userID=? and password=?";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.executeQuery();
            preparedStatement.setString(1, "username");
            preparedStatement.setString(2,"password");
            ResultSet resultSet= preparedStatement.executeQuery();

            if(resultSet.next()){
                role= resultSet.getString(1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
