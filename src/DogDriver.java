public class DogDriver
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Nutmeg", 12, "Australian Sheepdog", 45);
        Dog dog3 = new Dog("Link", 3, "Corhuahua", 8);

        System.out.println(dog1.getBreed());
        System.out.println(dog1.getAge());
        System.out.println(dog2.getWeight());
        System.out.println(dog3);
        System.out.println("Amount of dogs: "+Dog.getDogCount());
    }//end main method
}//end driver class
