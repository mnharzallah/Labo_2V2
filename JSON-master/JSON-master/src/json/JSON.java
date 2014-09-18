
package json;
import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class JSON {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String jsonTxt = FileReader.loadFileIntoString("json/library.json", "UTF-8");
        JSONArray jours = (JSONArray) JSONSerializer.toJSON(jsonTxt);
        
        int documentCount = jours.size();
        for (int i = 0; i < documentCount; i++) {
            JSONObject document = jours.getJSONObject(i);
                System.out.println(document);
        }
        //Manipulation d'un tableau JSON simple
        jours.remove(0);
        jours.remove(1);
        jours.add(1, "samedi");
        jours.add("samedi");
        jours.add("dimanche");
        System.out.println(jours);
    }
}