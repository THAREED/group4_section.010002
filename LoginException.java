public class LoginException extends Exception
{
	public LoginException() 
	{
		super("Please, Enter your username and password.");
	}
	public LoginException(String str) 
	{
		super("Username or password is incorrect, please fill in again.");
	}
}
