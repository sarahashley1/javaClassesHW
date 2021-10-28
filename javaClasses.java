// Create a Pet Class with the following instance variables:
//
//name (PRIVATE)
//age (PRIVATE)
//location (PRIVATE)
//type (PRIVATE)
//two constructors(empty, all attributes)
//Code to be able to access the following (Get Methods):
//name, age, type
//Code to be able to change (Set Methods):
//name, age, location
//2. Create a Custom Class (anything you want - car, phone, holiday, etc.).
// Requirements:
//Minimum 3 private instance variables
//An empty constructor
//A constructor that uses only 2 of your 3 variables
//A constructor that uses all 3 of your instance variables
//Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables
//A method that returns a Boolean
//A method that returns a String


//class Pet {
    //private String name;
    //private int age;
    //private String location;
    //private String type;

    //public Pet() {
        //name = "";
        //age = 0;
        //location = "";
        //type = "";
    //}

    //public Pet(String name, int age, String location, String type) {
        //this.name = name;
        //this.age = age;
        //this.location = location;
        //this.type = type;
    //}

    //public String getName() {
        //return name;
    //}

    //public int getAge() {
        //return age;
    //}

    //public String getType() {
        //return type;
    //}

    //public void setName(String name) {
        //this.name = name;
    //}

    //public void setAge(int age) {
        //this.age = age;
    //}

    //public void setLocation(String location) {
        //this.location = location;
    //}
//}

//part 2
class Car {
    private String make, model;
    private int manufacturingYear;

    public Car() {
        make = "";
        model = "";
        manufacturingYear = 2021;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        manufacturingYear = 2021;
    }

    public Car(String make, String model, int manufacturingYear) {
        this.make = make;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }

    public boolean isNewCar() {
        return manufacturingYear >= 2020;
    }
}



