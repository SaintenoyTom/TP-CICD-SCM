package cicd.learn.tp1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        if (args.length > 0) {
            System.out.println("CI/CD rocks! " + args[0]);
        } else {
            System.out.println("CI/CD rocks!");
        }
    }
}
