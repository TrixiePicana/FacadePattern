public class HomeApp //Client Class
{
    public static void main(String[] args)
    {
        Light light = new Light(); //Create Devices.
        HomeInterface home_appliance1 = new HomeInterface(light);

        TV television = new TV();
        HomeInterface home_appliance2 = new HomeInterface(television);

        AirConditioning aircon = new AirConditioning();
        HomeInterface home_appliance3 = new HomeInterface(aircon);

        home_appliance1.turnOnAll(); //Implement commands to ALL devices.
        home_appliance1.turnOffAll();

        home_appliance2.turnOnAll();
        home_appliance2.turnOffAll();

        home_appliance3.turnOnAll();
        home_appliance3.turnOffAll();

    }
}
