package com.huami.watch.companion.cloud.bean;

/* JADX INFO: loaded from: classes16.dex */
public class CloudWeatherForecast {
    private Weather weather = new Weather();
    private Temperature temperature = new Temperature();
    private SunRiseSet sunRiseSet = new SunRiseSet();

    public static class FromTo {
        private String from;
        private String to;

        public String getFrom() {
            return this.from;
        }

        public String getTo() {
            return this.to;
        }

        public void setFrom(String str) {
            this.from = str;
        }

        public void setTo(String str) {
            this.to = str;
        }
    }

    public static class SunRiseSet {
        private FromTo[] value;

        public FromTo[] getValue() {
            return this.value;
        }

        public void setValue(FromTo[] fromToArr) {
            this.value = fromToArr;
        }
    }

    public static class Temperature {
        private int status;
        private String unit;
        private FromTo[] value;

        public int getStatus() {
            return this.status;
        }

        public String getUnit() {
            return this.unit;
        }

        public FromTo[] getValue() {
            return this.value;
        }

        public void setStatus(int i) {
            this.status = i;
        }

        public void setUnit(String str) {
            this.unit = str;
        }

        public void setValue(FromTo[] fromToArr) {
            this.value = fromToArr;
        }
    }

    public static class Weather {
        private int status;
        private FromTo[] value;

        public int getStatus() {
            return this.status;
        }

        public FromTo[] getValue() {
            return this.value;
        }

        public void setStatus(int i) {
            this.status = i;
        }

        public void setValue(FromTo[] fromToArr) {
            this.value = fromToArr;
        }
    }

    public SunRiseSet getSunRiseSet() {
        return this.sunRiseSet;
    }

    public Temperature getTemperature() {
        return this.temperature;
    }

    public Weather getWeather() {
        return this.weather;
    }

    public void setSunRiseSet(SunRiseSet sunRiseSet) {
        this.sunRiseSet = sunRiseSet;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
