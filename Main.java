class Main {

    public static void main(String[] args) {
        Wykaz studenci = new Wykaz();
        studenci.wstawStudenta(266527,"Agnieszka");
        studenci.wstawStudenta(266520,"Tomasz");
        studenci.wstawStudenta(266521,"Natalia");

        studenci.wstawOcene(266527,5);
        studenci.wstawOcene(266527,3);
        studenci.wstawOcene(266520,2);

        studenci.wypisz(266527);
        System.out.println("--------");
        studenci.wypisz();
        studenci.sortujA();
    }
}