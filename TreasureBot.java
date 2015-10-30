import kareltherobot.*;
public class TreasureBot extends Robot implements Directions
{
    int dir;
    public TreasureBot(int st, int ave, Direction dir, int beeps)
    {
        super(st,ave,dir,beeps);
    }
    private void turnRight()
    {
       turnLeft(); turnLeft(); turnLeft(); 
    }
    private void turnAround()
    {
        turnLeft(); turnLeft();
    }
    
    public void faceNorth()
    {
        if(facingSouth())
        {
            turnAround();
        }
        
        if(facingEast())
        {
            turnLeft();
        }
        
        if(facingWest())
        {
            turnRight();
        }
    }
    public void faceSouth()
    {
        if(facingNorth())
        {
            turnAround();
        }
        
        if(facingEast())
        {
            turnRight();
        }
        
        if(facingWest())
        {
            turnLeft();
        }
    }
    public void faceEast()
    {
        if(facingSouth())
        {
            turnLeft();
        }
        
        if(facingNorth())
        {
            turnRight();
        }
        
        if(facingWest())
        {
            turnAround();
        }
    }
    public void faceWest()
    {
        if(facingSouth())
        {
            turnRight();
        }
        
        if(facingEast())
        {
            turnAround();
        }
        
        if(facingNorth())
        {
            turnLeft();
        }
    }
    
    public void work()
    {
              
          while(!nextToABeeper() )
          {
              move();
              while(nextToABeeper() )
              { 
                  moveToNextClue();
                }
           }
        
    }
    public int countBeepers()
    {
        int dir=0;
        while(nextToABeeper() )
        {
            pickBeeper();
            dir++;
        }
        return dir;
    }
    public void moveToNextClue()
    {
        int dir=countBeepers();
       if(dir==1)
        { 
            faceNorth();
        }
       if(dir==2)
       {
           faceWest();
        }
       if(dir==3)
       {
           faceSouth();
       }
       if(dir==4)
       {
           faceEast();
       }
       if(dir==5)
       {
           turnOff();
        }
    }

}
   


