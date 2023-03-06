class Exemplo {

    // Soma entre nÃºmeros inteiros
    int somar (int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int e;

        e = somar(a, b);
        
        System.out.println("A soma Ã©: " + e);
    }
}
