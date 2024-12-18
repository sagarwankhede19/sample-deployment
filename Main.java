import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Example JSON processing using Jackson
        String json = "{\"name\":\"Sagar\",\"role\":\"Software Engineer\"}";
        ObjectMapper mapper = new ObjectMapper();
        var user = mapper.readTree(json);
        System.out.println("User Name: " + user.get("name").asText());
        System.out.println("User Role: " + user.get("role").asText());
    }
}

// cmnd
//jbang --deps com.fasterxml.jackson.core:jackson-databind:2.15.0 Main.java