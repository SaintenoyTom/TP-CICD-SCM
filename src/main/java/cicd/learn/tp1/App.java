package cicd.learn.tp1;

/**
 * Hello world!
 * With a parameter !
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println( "CI/CD rocks!" );
        if (args.length > 0) {
            System.out.println("CI/CD rocks! " + args[0]);
        } else {
            System.out.println("CI/CD rocks!");
        }
    }
}
