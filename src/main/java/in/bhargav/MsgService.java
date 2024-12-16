package in.bhargav;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MsgService {
	
	private static final String Provider_URL="https://api.restful-api.dev/objects/";
	
	
	public void getMsg() {
		
		
        RestTemplate rt = new  RestTemplate();
        
           ResponseEntity<String> forEntity = rt.getForEntity(Provider_URL, String.class);
        
           HttpStatusCode statusCode = forEntity.getStatusCode();
           
           
           String body = forEntity.getBody();
           
           System.out.println("Status Code : "+ statusCode.value());
           
           System.out.println("Response Body: " + body);
           
	}
	
}
