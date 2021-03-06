package Game.src;
public class Food {

private Snake snake = new Snake();
private Snake snake2 = new Snake();
private int foodX; // Stores X pos of our food
private int foodY; // Stores Y pos of our food
private int [][] foodPosition;
 

// Used to determine random position of food
private final int RANDOMPOSITION = 100;

public void createFood() {

    // Set our food's x & y position to a random position

    int location = (int) (Math.random() * RANDOMPOSITION);
    foodX = ((location * Board.getDotSize()));

    location = (int) (Math.random() * RANDOMPOSITION);
    foodY = ((location * Board.getDotSize()));

    if ((foodX == snake.getSnakeX(0)) && (foodY == snake.getSnakeY(0)) && (foodX == snake2.getSnakeX(0)) && (foodY == snake2.getSnakeY(0))) {
       	createFood();
    }
}

public void createManyFoods(int BOARDWIDTH, int BOARDHEIGHT) {
	foodPosition = new int [BOARDWIDTH][BOARDHEIGHT];
	
    for(int i = 0; i < BOARDWIDTH; i++) {
        for(int j = 0; j < BOARDWIDTH; j++) {
        	if((i + j)%2 == 0)
        		foodPosition[i][j] = 1;
        	else
        		foodPosition[i][j] = 0;

        }
    }
}

public int getFoodX() {

    return foodX;
}

public int getFoodY() {
    return foodY;
}

public int[][] getFoods() {

    return foodPosition;
}

}