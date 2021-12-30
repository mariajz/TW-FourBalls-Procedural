import processing.core.PApplet;

public class FourBallsProcedural extends PApplet {
    public static final int X_DIM = 500;
    public static final int Y_DIM = 500;
    public static final int ball_radius = 12;
    public static final int ball_count = 4;
    public static final int divisions = ball_count+1;
    int X_POS[] = new int[divisions];

    public static void main(String[] args){
        PApplet.main("FourBallsProcedural",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(X_DIM,Y_DIM);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        for(int ball_number = 0; ball_number<ball_count;ball_number++){
            X_POS[ball_number] = drawBall(X_POS[ball_number],Y_DIM/divisions,ball_number+1,ball_radius );
        }
    }

    private int drawBall(int x_cord, int y_cord, int speed_factor, int radius) {
        ellipse( x_cord, y_cord*speed_factor, radius, radius );
        x_cord = x_cord + speed_factor;
        return x_cord;
    }

    private void paintWhite() {
        background(255);
    }

}
