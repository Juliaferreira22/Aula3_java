class multiplos_metodos {
    // Soma entre nÃºmeros inteiros
    static int somar (int a, int b) {
        int c = a + b;
        return c;
    }

    // Soma entre nÃºmeros de ponto-flutuante
    static float somar (float a, float b) {
        float c;
        c = a + b;
        return c;
    }


    public static void main(String[] args) {
        // Soma entre inteiros
        int a = 3;
        int b = 5;
        int e;

        e = somar(a, b);
        
        System.out.println("A soma dos inteiros Ã©: " + e);

        // Soma entre ponto-flutuantes
        float c = 5.3f;
        float d = 9.1f;
        float f;

        f = somar(c, d);

        System.out.println("A soma dos ponto-flutuantes Ã©: " + f);
    }
}
