import java.text.Annotation;

public class App {
    private static final Object Cliente = null;

    public static void main(String[] args) {
        ClienteReflection produto = new ClienteReflection();
        Annotation[] annotations = (Annotation[]) Cliente.getClass().getAnnotations();
        for (Annotation anotacao : annotations) {
            System.out.println(anotacao);
        }
    }
}