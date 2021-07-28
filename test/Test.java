
public class Test {
    public class Country {

    private String name;
    private CapitalCity city;
    public Country() {
    }
    
    public Country(String name, String city) {
        this.name = name;
        this.city = new CapitalCity(city);
    }
    public String getCapitalCity(){
        return city.cityName;
    }
    private class CapitalCity {

        private String cityName;

        public CapitalCity() {
        }

        public CapitalCity(String name) {
            cityName = name;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

}
