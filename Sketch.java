import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(900, 900);
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
    triangle(width/40*20,height/40*5,width/40*20,height/80*19,width/40*13,height/40*8);

    //door
    fill(165,42,42);
    rect(width/80*35,height/40*23,width/200*16,height/200*34);

    fill(	255, 165, 0);
    ellipse(width/40*2,height/40*2,width/80*15,height/80*15);

    //Windows
    fill(255,255,255);
    rect(width/40*9,height/40*20,width/40*4,height/40*4);
    rect(width/40*25,height/40*20,width/40*4,height/40*4);

  }
  
  // define other methods down here.
}