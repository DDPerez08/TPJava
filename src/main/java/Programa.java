public class Programa {

    public static void main(String[] args) {
        user oUser = new user();

        try
        {
          oUser.insertarUser(1,"pepe","123456",1);
        }catch (Exception e)
        {
            System.out.println( e.getMessage() );
        }

    }
}
