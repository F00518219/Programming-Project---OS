import java.lang.String;
import java.util.Random;
public class Main
{
public static void main( String[] args ) {
Random r = new Random();
System.out.println("Version 1");
System.out.println();

Process.pcb1(10);

for (int i = 1; i < 10; i++) {
Process.create1((r.nextInt(i)));
}

Process.printProcess1();
long s1 = System.nanoTime();
Process.destroy1(0);

long end1 = System.nanoTime();
long dif1 = end1 - s1;
Process.printProcess1();

System.out.println();
System.out.println("Version 2");
System.out.println();
Process.pcb2(10); 

for (int i = 1; i < 10; i++) {
Process.create2(r.nextInt(i));
}

Process.printProcess2();
long s2 = System.nanoTime();

Process.destroy2(0);

long end2 = System.nanoTime();
long dif2 = end2 - s2;

Process.printProcess2();

System.out.println("Version 1 destroy time: " + ((double) dif1/1000000) + " milliseconds");
System.out.println("Version 2 destroy time: " + ((double) dif2/1000000) + " milliseconds");
}
}

