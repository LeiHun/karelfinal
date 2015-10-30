import kareltherobot.*;
/**
 * driver class TreasureDriver - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class TreasureDriver implements Directions
{
    public static void main(String[] args)
    {
        World.reset();
        World.setDelay(10);
        World.readWorld("treasureWorld.kwld");
        World.setTrace(true);
        World.setVisible(true);
        
        TreasureBot hunter = new TreasureBot(2,2,North,0);
        hunter.work();
        
    }
}
