import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135,206,235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
		
    
    //Ground
    fill(0,244,0);
   ellipse(width/2,height/40*32,width/40*55,height/40*28);

    //Building
    fill(255,255,0);
    rect(width/40*5,height/40*15,width/40*30,height/40*15); 

    //flag pole
    fill(128,128,128);
    rect(width/40*20,height/40*5,width/width*5,height/40* 10);  
    
    //flag
    fill(244,0,0);
    triangle(201,51,200,95,130,80);

    //door
    fill(165,42,42);
    rect(175,230,32,67);

    fill(	255, 165, 0);
    ellipse(20, 20, 75, 75);

    //Windows
    fill(255,255,255);
    rect(90,200,40,40);
    rect(250,200,40,40);

  }
  
  // define other methods down here.
}