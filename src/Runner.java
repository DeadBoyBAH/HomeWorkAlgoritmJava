import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("Text.txt");
        List<String> lines = Files.readAllLines(file);
        StringBuilder text = new StringBuilder();
        for (String line : lines) {
            text.append(line);
        }

        Map<String, Long> charCount = text.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Tree tree = new Tree();
        charCount.forEach((k, v) -> {
            System.out.println(k + "-" + v);
            tree.insertNode(v, k.charAt(0));
        });

        // отображение дерева:
        tree.printTree();
        System.out.println(tree.getRootNode());

        tree.deleteNode(2L);
        tree.printTree();
        System.out.println(tree.getRootNode());
    }
}
