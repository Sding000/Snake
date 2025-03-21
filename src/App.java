import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
    int boardWidth = 600;
    int boardHeight = boardWidth;
    
    //Window 
    JFrame frame = new JFrame("Snake");
    frame.setVisible(true);
    frame.setSize(boardWidth, boardHeight);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Snakeg snakeg = new Snakeg(boardWidth, boardHeight);
    frame.add(snakeg);
    frame.pack();
    snakeg.requestFocus();
    }
}
