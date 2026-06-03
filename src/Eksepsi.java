public class Eksepsi {

    static void tampil(String s) throws Exception {
        System.out.println("Tampil");

        if (s.equals("amir")) {
            throw new MyException(s);
        }

        System.out.println("OK!");
    }

    public static void main(String[] args) {
        try {
            tampil("ali");
            tampil("amir");
        } catch (MyException ex) {
            System.out.println("Tangkap: " + ex);
        } catch (Exception e) {
            System.out.println("Error umum");
        }
    }
}