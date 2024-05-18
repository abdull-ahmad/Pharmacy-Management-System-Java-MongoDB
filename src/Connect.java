
import com.itextpdf.text.log.LoggerFactory;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.util.logging.Logger;

public class Connect {
    public static MongoClient mongoClient;
    public static MongoDatabase database;

    public static void main(String[] args) {
        mongoClient = MongoClients.create("mongodb://localhost:27017");
        database = mongoClient.getDatabase("Pharmacy");
        Logger mongoLogger = (Logger) LoggerFactory.getLogger("org.mongodb.driver");
    }
}
