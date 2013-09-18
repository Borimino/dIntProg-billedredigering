
/**
 * Write a description of class SimpleFilters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleFilters
{
    private Image img;
    
    /**
     * Constructor for objects of class SimpleFilters
     */
    public SimpleFilters(Image i)
    {
        img = i;
    }
    
    /**
     * Brightens the picture by adding factor to each pixel
     */
    public void brighten(int factor)
    {
        for(Pixel p : img.getPixels())
        {
            p.setValue(p.getValue()+factor);
        }
        img.pixelsUpdated();
    }
    
    /**
     * Darkens the picture by subtracting factor from each pixel
     */
    public void darken(int factor)
    {
        for(Pixel p : img.getPixels())
        {
            p.setValue(p.getValue()-factor);
        }
        img.pixelsUpdated();
    }
    
    /**
     * Inverts the picture
     */
    public void invert()
    {
        for(Pixel p : img.getPixels())
        {
            p.setValue(255-p.getValue());
        }
        img.pixelsUpdated();
    }
    
    public void solarize()
    {
        for(Pixel p : img.getPixels())
        {
            if(p.getValue()<127)
            {
                p.setValue(255-p.getValue());
            }
        }
        img.pixelsUpdated();
    }
}
