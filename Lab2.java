public class Lab2
{       
      public static void turnRight() //turns player right
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
      
  }
  public static void turnAround() //turns player around 
  {
   Robot.turnLeft();
  Robot.turnLeft();
  }
  public static void cleanOne() //lighten one square
  {
      Robot.makeLight();
      Robot.move();
    }
    
  public static void cleanFive() //lighten 5 squares assuming that the first square is clean
  {    
      Robot.move();
      cleanOne();
      cleanOne();
      cleanOne();
      cleanOne();
      cleanOne();

  
  }
  
  
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    

    cleanFive();
    Robot.turnLeft();
    cleanFive();
    Robot.turnLeft();
    cleanFive();
    Robot.turnLeft();
    cleanFive();
    
    
    
  }

public static void darkenOne() //make one square dark 
{
    Robot.makeDark();
    Robot.move();
}

public static void darkenNine() //make eight squares dark assuming first square is light
{
    darkenOne();
    darkenOne();
    darkenOne();
    darkenOne();
    darkenOne();
    darkenOne();
    darkenOne();
    darkenOne();
    Robot.makeDark();
}
  
public static void darkenSix() //make six squares dark, assuming first square is DARK
{
    Robot.move();
    darkenOne();
    darkenOne();
    darkenOne();
    darkenOne();
    darkenOne();
    Robot.makeDark();
}

public static void moveSix() //move six squares without darkening/lightening
{
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
}
 public static void moveTwo() //move two squares without darkening/lightening
{
    Robot.move();
    Robot.move();
}
public static void darkenAndAdvance() //darken 6 squares and advance to next comb spot 
{
    darkenSix();
    turnAround();
    moveSix();
    Robot.turnLeft();
    moveTwo();
    Robot.turnLeft();
    
}

  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    darkenNine();
    turnRight();
    darkenAndAdvance();     
    darkenAndAdvance();       
    darkenAndAdvance();     
    darkenAndAdvance();
    darkenSix();
    

    
    
  }
  
  public static void darkenNext() //darkens the spot the next spot you move to
  {
      Robot.move();
      Robot.makeDark();
    }
    
  public static void darkenColumn() //darken vertical 8 spaces with light spaces in between
  {
      Robot.makeDark();
      Robot.move();
      darkenNext();
      Robot.move();
      darkenNext();
      Robot.move();
      darkenNext();
      Robot.move();

      
    }
    public static void positionRight() //position for next column by turning rigt
    {
        turnRight();
        Robot.move();
        turnRight();
    }
    public static void positionLeft() //position for next column by turning left
    {
        Robot.turnLeft();
        Robot.move();
        Robot.turnLeft();
    }
    public static void checkerFour() //darken 4 columns 
    {
        darkenColumn();
        positionRight();
        darkenColumn();
        positionLeft();
        darkenColumn();
        positionRight();
        darkenColumn();
    
    
    
    
    }
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    checkerFour();
    positionLeft();
    checkerFour();

    
  }
}
