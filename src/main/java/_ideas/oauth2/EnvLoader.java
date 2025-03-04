package _ideas.oauth2;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;


public class EnvLoader {
    public static void loadEnv() {
        Dotenv env = Dotenv.configure().load();
        for (DotenvEntry dotenvEntry : env.entries()) {
            System.setProperty(dotenvEntry.getKey(), dotenvEntry.getValue());
        }
    }
}
