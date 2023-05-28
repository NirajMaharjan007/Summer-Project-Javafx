package javafx.project.components;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class SwitchNode {
    private Pane root;
    private Button button;

    public SwitchNode(Pane root, Button button) {
        this.root = root;
        this.button = button;
    }

    public SwitchNode(Pane root) {
        this.root = root;
    }

    public void switchNode(Pane node) {
        this.button.setOnAction(event -> switchLayout(node));
    }

    private void switchLayout(Pane node) {
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    public void updateNode() {
        // this.root.getChildren().clear();
        // this.root.getChildren().add(node);
        if (!root.getChildren().isEmpty()) {
            root.getChildren().remove(0);
        }
    }

}
