public class JackOLantern {
    private String[][] faceFeatures;
    private String replace;
    private int row;
    private int column;
    public JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }
    public void edit(String replace, int row, int column)
    {
        faceFeatures[row][column] = replace;
    }
    public void fill(String str)
    {
        for (int i = 0; i < faceFeatures.length; i++)
        {
            for (int j = 0; j < faceFeatures[i].length; i++)
            {
                faceFeatures[i][j] = str;
            }
        }
    }
    public String toString()
    {
        
    }
}
