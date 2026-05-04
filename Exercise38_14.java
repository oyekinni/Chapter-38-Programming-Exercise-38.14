```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise38_14 extends Application {

    private int order = 0;

    @Override
    public void start(Stage primaryStage) {

        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Button btIncrease = new Button("Increase Order");
        Button btDecrease = new Button("Decrease Order");

        // Action for increasing the order
        btIncrease.setOnAction(e -> {
            order++;
            draw(gc);
        });

        // Action for decreasing the order
        btDecrease.setOnAction(e -> {
            if (order > 0) {
                order--;
            }
            draw(gc);
        });

        HBox controls = new HBox(10, btIncrease, btDecrease);

        BorderPane pane = new BorderPane();
        pane.setCenter(canvas);
        pane.setBottom(controls);

        draw(gc); // Initial drawing of the carpet

        Scene scene = new Scene(pane, 600, 650);
        primaryStage.setTitle("Exercise 38.14 — Sierpiński Carpet");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to draw the carpet
    private void draw(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 600, 600);

        gc.setFill(Color.BLACK);
        drawCarpet(gc, 0, 0, 600, order);
    }

    // Recursive method to draw the Sierpiński carpet
    private void drawCarpet(GraphicsContext gc, double x, double y, double size, int order) {
        if (order == 0) {
            gc.fillRect(x, y, size, size);
        } else {
            double newSize = size / 3;

            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (row == 1 && col == 1) {
                        // Center square remains white
                        gc.clearRect(x + col * newSize, y + row * newSize, newSize, newSize);
                    } else {
                        drawCarpet(gc, x + col * newSize, y + row * newSize, newSize, order - 1);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

This version clarifies the code by improving comments and formatting while ensuring correct spelling, grammar, and punctuation.```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise38_14 extends Application {

    private int order = 0;

    @Override
    public void start(Stage primaryStage) {

        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Button btIncrease = new Button("Increase Order");
        Button btDecrease = new Button("Decrease Order");

        // Action for increasing the order
        btIncrease.setOnAction(e -> {
            order++;
            draw(gc);
        });

        // Action for decreasing the order
        btDecrease.setOnAction(e -> {
            if (order > 0) {
                order--;
            }
            draw(gc);
        });

        HBox controls = new HBox(10, btIncrease, btDecrease);

        BorderPane pane = new BorderPane();
        pane.setCenter(canvas);
        pane.setBottom(controls);

        draw(gc); // Initial drawing of the carpet

        Scene scene = new Scene(pane, 600, 650);
        primaryStage.setTitle("Exercise 38.14 — Sierpiński Carpet");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to draw the carpet
    private void draw(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 600, 600);

        gc.setFill(Color.BLACK);
        drawCarpet(gc, 0, 0, 600, order);
    }

    // Recursive method to draw the Sierpiński carpet
    private void drawCarpet(GraphicsContext gc, double x, double y, double size, int order) {
        if (order == 0) {
            gc.fillRect(x, y, size, size);
        } else {
            double newSize = size / 3;

            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (row == 1 && col == 1) {
                        // Center square remains white
                        gc.clearRect(x + col * newSize, y + row * newSize, newSize, newSize);
                    } else {
                        drawCarpet(gc, x + col * newSize, y + row * newSize, newSize, order - 1);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

This version clarifies the code by improving comments and formatting while ensuring correct spelling, grammar, and punctuation.import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise38_14 extends Application {

    private int order = 0;

    @Override
    public void start(Stage primaryStage) {

        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Button btIncrease = new Button("Increase Order");
        Button btDecrease = new Button("Decrease Order");

        btIncrease.setOnAction(e -> {
            order++;
            draw(gc);
        });

        btDecrease.setOnAction(e -> {
            if (order > 0) order--;
            draw(gc);
        });

        HBox controls = new HBox(10, btIncrease, btDecrease);

        BorderPane pane = new BorderPane();
        pane.setCenter(canvas);
        pane.setBottom(controls);

        draw(gc);

        Scene scene = new Scene(pane, 600, 650);
        primaryStage.setTitle("Exercise 38.14 — Sierpiński Carpet");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void draw(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 600, 600);

        gc.setFill(Color.BLACK);
        drawCarpet(gc, 0, 0, 600, order);
    }

    private void drawCarpet(GraphicsContext gc, double x, double y, double size, int order) {
        if (order == 0) {
            gc.fillRect(x, y, size, size);
        } else {
            double newSize = size / 3;

            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {

                    if (row == 1 && col == 1) {
                        // center square stays white
                        gc.clearRect(x + col * newSize, y + row * newSize, newSize, newSize);
                    } else {
                        drawCarpet(gc, x + col * newSize, y + row * newSize, newSize, order - 1);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
