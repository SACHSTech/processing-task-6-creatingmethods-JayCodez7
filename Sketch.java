import processing.core.PApplet;
/**
 * Draws stickman and hearts
 * @author J. Lau
 */
public class Sketch extends PApplet {
	
  public void settings() {
    size(800, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    // color 
    stroke(238, 7, 5);
    rowOfMan(0);
    stroke(230, 137, 15);
    rowOfMan(50);
    stroke(222, 230, 9);
    rowOfMan(100);
    stroke(59, 160, 43);
    rowOfMan(150);
    stroke(0, 103, 171);
    rowOfMan(200);
    stroke(0, 19, 223);
    rowOfMan(250);
    stroke(137, 0, 224);
    rowOfMan(300);

  // hearts
  for (int y = 1; y < 7; y++) {
    int xBalance = (y % 2) * 50; // Calculate balance once per row
    for (int x = 50; x < 700; x += 100) {
        drawHeart(x + xBalance, y * 50);
    }
  }
}
  
  /**
   * Draws 15 stickmen in a row at the specified y-coordinate.
   * @param y y-coordinates of row
   * @author J. Lau
   */
  private void rowOfMan(int y) {
    for(int x = 0; x < 750; x += 50){
      drawMan(x, y);
    }
  }

  /**
   * Draws a stickman at specified coordinates.
   * @param x  x-coordinate for the stickman
   * @param y  y-coordinate for the stickman
   * @author J. Lau
   */

   private void drawMan(int x, int y) {
    int baseX = 50 + x;
    int baseY = y;

    fill(210, 255, 173); // set color for the man
    line(baseX, 40 + baseY, baseX, 55 + baseY); // body
    line(baseX, 55 + baseY, 60 + x, 65 + baseY); // right leg
    line(baseX, 55 + baseY, 40 + x, 65 + baseY); // left leg
    ellipse(baseX, 30 + baseY, 15, 15); // head
    line(baseX, 50 + baseY, 60 + x, 40 + baseY); // right arm
    line(baseX, 50 + baseY, 40 + x, 40 + baseY); // left arm
}

  /**
   * Draws a heart
   * @param x x-coordinates of where heart is drawn + 17
   * @param y y-coordinates of where heart is drawn + 10
   * @author J. Lau
   */
  private void drawHeart(int x, int y) {
    stroke(0); // outline
    fill(0); // set fill black
    triangle(17 + x, 10 + y, 25 + x, 20 + y, 33 + x, 10 + y);
    triangle(17 + x, 10 + y, 21 + x, 5 + y, 25 + x, 10 + y);
    triangle(25 + x, 10 + y, 29 + x, 5 + y, 33 + x, 10 + y);
  }
}