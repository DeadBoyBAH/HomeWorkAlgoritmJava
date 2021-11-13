import java.util.ArrayList;

public class Node {
    private Long value; // ключ узла
    private ArrayList<Character> letters = new ArrayList<>();
    private Node leftChild; // Левый узел потомок
    private Node rightChild; // Правый узел потомок

    public void printNode() { // Вывод значения узла в консоль
        System.out.println(" Выбранный узел имеет значение: " + value + " с символами: " + letters);
    }

    public Long getValue() {
        return this.value;
    }

    public void setValue(final Long value) {
        this.value = value;
    }

    public ArrayList<Character> getLetters() {
        return this.letters;
    }

    public void setLetters(final ArrayList<Character> letters) {
        this.letters = letters;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(final Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(final Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value + "-" + letters +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
