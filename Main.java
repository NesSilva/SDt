public class Main {
    public static void main(String[] args) {
        int lider = args.length > 0 && args[0].equals("lider") ? 1 : 0;

        Elemento elemento = new Elemento(lider);
        elemento.setLider(lider);
    }
}
