import java.util.ArrayList;

public class Celebrity
{
    private String clue;
    private String answer;
    public Celebrity()
    {}
    public Celebrity(String answer, String clue)
    {
        this.answer = answer;
        this.clue = clue;
    }
    public String getClue()
    {
        return clue;
    }
    public String getAnswer()
    {
        return answer;
    }
    public void setClue(String clue)
    {
        this.clue = clue;
    }
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
    public String toString()
    {
        return "The Celebrity's name is: " + answer
                + ". The clue for this celebrity is: " + clue;
    }
}

