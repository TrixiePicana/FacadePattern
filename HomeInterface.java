public class HomeInterface //Facade class
{
    private Light light;

    public HomeInterface(Light light)
    {
        this.light = light;
    }

    private TV tv;

    public HomeInterface(TV tv)
    {
        this.tv = tv;
    }

    private AirConditioning airConditioning;

    public HomeInterface (AirConditioning airConditioning)
    {
        this.airConditioning = airConditioning;
    }
    public void turnOnAll()
    {
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll()
    {
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }

}
