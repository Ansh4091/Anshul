import java.net.HttpURLConnection;
import java.net.URL;

public class callurl {

	public static void main(String[] args) {
		try 
		{
			URL url = new URL("https://localhost:8097/get?message=MessageValue&type=ENCRYPT");
			HttpURLConnection hr = (HttpURLConnection) url.openConnection();
			System.out.println(hr.getResponseCode());
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
