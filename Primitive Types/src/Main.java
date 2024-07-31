//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte type_byte = 120;  // From -128 to 127 (8bits)
        short type_short = 32000; //  From -32768 to 32767 (16 bits)
        int type_int = 10; // From -2147483648 to 2147483647 (32 bits)
        long type_long = -1000; // From -9223372036854770000 to 9223372036854770000 (64 bits)
        float type_float = 10.40f; // From -1.4024E-37 to 340282347E+38 (32 bits)
        double type_double = 15; // From -4.94E-307 to 1.79769313486231570E+308 (64 bits)
        char type_char = 'a'; // From 0 to 65535 (16 bits)
        boolean type_boolean = false; // true or false

        System.out.println(type_byte);
        System.out.println(type_short);
        System.out.println(type_int);
        System.out.println(type_long);
        System.out.println(type_float);
        System.out.println(type_double);
        System.out.println(type_char);
        System.out.print(type_boolean);

    }
}