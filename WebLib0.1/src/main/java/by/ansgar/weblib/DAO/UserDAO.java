package by.ansgar.weblib.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.weblib.entity.Users;

public interface UserDAO {

	public void addUsers(Users users) throws SQLException;

	public void updateUsers(Users users) throws SQLException;

	public Users getUsersById(int id) throws SQLException;
	
	public Users getUserByName(String login);

	public List<Users> users() throws SQLException;

	public void deleteUsersById(Users users, int id) throws SQLException;
	
}
