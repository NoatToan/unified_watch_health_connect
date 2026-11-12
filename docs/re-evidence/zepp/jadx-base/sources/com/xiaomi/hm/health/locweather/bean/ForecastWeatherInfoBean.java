package com.xiaomi.hm.health.locweather.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ForecastWeatherInfoBean {

    @SerializedName("pubTime")
    public String a;

    @SerializedName("status")
    public int b = -1;

    @SerializedName("weather")
    public Weather c;

    @SerializedName("temperature")
    public Temperature d;

    @SerializedName("sunRiseSet")
    public SunriseSunset e;

    public static class Change {

        @SerializedName("from")
        public String a;

        @SerializedName("to")
        public String b;

        public String getFrom() {
            return this.a;
        }

        public String getTo() {
            return this.b;
        }

        public void setFrom(String str) {
            this.a = str;
        }

        public void setTo(String str) {
            this.b = str;
        }
    }

    public static class SunriseSunset {

        @SerializedName("status")
        public int a = -1;

        @SerializedName("value")
        public List<Change> b;

        public int getStatus() {
            return this.a;
        }

        public List<Change> getValue() {
            return this.b;
        }

        public void setStatus(int i) {
            this.a = i;
        }

        public void setValue(List<Change> list) {
            this.b = list;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            List<Change> list = this.b;
            if (list != null && list.size() > 0) {
                for (Change change : this.b) {
                    sb.append("sunrise:");
                    sb.append(change.a);
                    sb.append(" sunset:");
                    sb.append(change.b);
                    sb.append("\n");
                }
            }
            return "SunriseSunset[[[\nstatus:" + this.a + "\n" + sb.toString() + "]]]";
        }
    }

    public static class Temperature {

        @SerializedName("status")
        public int a = -1;

        @SerializedName("unit")
        public String b;

        @SerializedName("value")
        public List<Change> c;

        public int getStatus() {
            return this.a;
        }

        public String getUnit() {
            return this.b;
        }

        public List<Change> getValue() {
            return this.c;
        }

        public void setStatus(int i) {
            this.a = i;
        }

        public void setUnit(String str) {
            this.b = str;
        }

        public void setValue(List<Change> list) {
            this.c = list;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            List<Change> list = this.c;
            if (list != null && list.size() > 0) {
                for (Change change : this.c) {
                    sb.append("from:" + change.a + " to:" + change.b + "\n");
                }
            }
            return "Temperature[[[\nstatus:" + this.a + "\nunit:" + this.b + "\n" + sb.toString() + "]]]";
        }
    }

    public static class Weather {

        @SerializedName("status")
        public int a = -1;

        @SerializedName("value")
        public List<Change> b;

        public int getStatus() {
            return this.a;
        }

        public List<Change> getValue() {
            return this.b;
        }

        public void setStatus(int i) {
            this.a = i;
        }

        public void setValue(List<Change> list) {
            this.b = list;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            List<Change> list = this.b;
            if (list != null && list.size() > 0) {
                for (Change change : this.b) {
                    sb.append("from:" + change.a + " to:" + change.b + "\n");
                }
            }
            return "Weather[[[\nstatus:" + this.a + "\n" + sb.toString() + "]]]";
        }
    }

    public String getPubTime() {
        return this.a;
    }

    public int getStatus() {
        return this.b;
    }

    public SunriseSunset getSunriseSunset() {
        return this.e;
    }

    public Temperature getTemperature() {
        return this.d;
    }

    public Weather getWeather() {
        return this.c;
    }

    public void setPubTime(String str) {
        this.a = str;
    }

    public void setStatus(int i) {
        this.b = i;
    }

    public void setSunriseSunset(SunriseSunset sunriseSunset) {
        this.e = sunriseSunset;
    }

    public void setTemperature(Temperature temperature) {
        this.d = temperature;
    }

    public void setWeather(Weather weather) {
        this.c = weather;
    }

    public String toString() {
        return "ForecastWeatherInfoBean{\npubTime:" + this.a + "\nstatus:" + this.b + "\nweather:" + this.c + "\ntemperature:" + this.d + "\n}";
    }
}
