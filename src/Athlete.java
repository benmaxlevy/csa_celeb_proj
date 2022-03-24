import java.util.Map;
import java.util.HashMap;

public class Athlete extends Celebrity{
    private Map<String, String> hints = new HashMap<String, String>();
    private String name;

    public Athlete(){
        super();
    }

    public Athlete(String name, String sport, String team, String number, String position, String height, String weight, String age){
        super(name, sport);
        hints.put("team", team);
        hints.put("number", number);
        hints.put("position", position);
        hints.put("height", height);
        hints.put("weight", weight);
        hints.put("age", age);
        this.name = name;

    }

    public String getClue(){
        // originally set to the person's sport; change
        // get random key and value in hints map

        String key = hints.keySet().toArray()[(int)(Math.random() * hints.size())] + ": ";
        String value = hints.get(key.substring(0, key.length() - 2));
        return key + value;
    }

    public boolean checkAnswer(String answer){
        return answer.equals(this.name);
    }
}
