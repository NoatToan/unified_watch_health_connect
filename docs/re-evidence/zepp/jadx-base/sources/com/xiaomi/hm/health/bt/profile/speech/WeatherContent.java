package com.xiaomi.hm.health.bt.profile.speech;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes18.dex */
public class WeatherContent extends SpeechContent {
    public static final byte AQI_DETAIL = 3;
    public static final byte FORECAST = 2;
    public static final byte REALTIME = 1;
    public static final byte WEATHER_DETAIL = 4;
    private byte b;
    private Weather c;
    private ForecastWeather d;
    private String e;
    private String f;

    public static class ForecastWeather {
        private int a;
        private byte b;
        private byte c;
        private byte d;
        private byte e;
        private byte f;
        private short g;
        private String h;
        private String i;
        private String j;

        public String getAirDes() {
            return this.h;
        }

        public byte getAirFrom() {
            return this.c;
        }

        public byte getAirTo() {
            return this.d;
        }

        public short getAqi() {
            return this.g;
        }

        public String getAqiDes() {
            return this.i;
        }

        public byte[] getBytes() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArrIntToBytes = GattUtils.intToBytes(this.a);
            byteArrayOutputStream.write(bArrIntToBytes, 0, bArrIntToBytes.length);
            byteArrayOutputStream.write(this.b);
            byteArrayOutputStream.write(this.c);
            byteArrayOutputStream.write(this.d);
            byteArrayOutputStream.write(this.e);
            byteArrayOutputStream.write(this.f);
            byteArrayOutputStream.write(this.g);
            if (!TextUtils.isEmpty(this.h)) {
                byteArrayOutputStream.write(this.h.getBytes(Charset.defaultCharset()), 0, this.h.getBytes(Charset.defaultCharset()).length);
            }
            byteArrayOutputStream.write(0);
            if (!TextUtils.isEmpty(this.i)) {
                byteArrayOutputStream.write(this.i.getBytes(Charset.defaultCharset()), 0, this.i.getBytes(Charset.defaultCharset()).length);
            }
            byteArrayOutputStream.write(0);
            if (!TextUtils.isEmpty(this.j)) {
                byteArrayOutputStream.write(this.j.getBytes(Charset.defaultCharset()), 0, this.j.getBytes(Charset.defaultCharset()).length);
            }
            byteArrayOutputStream.write(0);
            return byteArrayOutputStream.toByteArray();
        }

        public String getLocation() {
            return this.j;
        }

        public byte getMaxTemp() {
            return this.e;
        }

        public byte getMinTemp() {
            return this.f;
        }

        public int getTimestamp() {
            return this.a;
        }

        public byte getTz() {
            return this.b;
        }

        public void setAirDes(String airDes) {
            this.h = airDes;
        }

        public void setAirFrom(byte airFrom) {
            this.c = airFrom;
        }

        public void setAirTo(byte airTo) {
            this.d = airTo;
        }

        public void setAqi(short aqi) {
            this.g = aqi;
        }

        public void setAqiDes(String aqiDes) {
            this.i = aqiDes;
        }

        public void setLocation(String location) {
            this.j = location;
        }

        public void setMaxTemp(byte maxTemp) {
            this.e = maxTemp;
        }

        public void setMinTemp(byte minTemp) {
            this.f = minTemp;
        }

        public void setTimestamp(int timestamp) {
            this.a = timestamp;
        }

        public void setTz(byte tz) {
            this.b = tz;
        }

        public String toString() {
            return "ForecastWeather{timestamp=" + this.a + ", tz=" + ((int) this.b) + ", airFrom=" + ((int) this.c) + ", airTo=" + ((int) this.d) + ", maxTemp=" + ((int) this.e) + ", minTemp=" + ((int) this.f) + ", aqi=" + ((int) this.g) + ", airDes='" + this.h + "', aqiDes='" + this.i + "', location='" + this.j + "'}";
        }
    }

    public static class Weather {
        private short a;
        private byte b;
        private byte c;
        private byte d;
        private short e = -1;
        private String f;
        private String g;
        private String h;

        public short getAir() {
            return this.a;
        }

        public String getAirDes() {
            return this.f;
        }

        public short getAqi() {
            return this.e;
        }

        public String getAqiDes() {
            return this.g;
        }

        public byte[] getBytes() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(this.a);
            byteArrayOutputStream.write(this.b);
            byteArrayOutputStream.write(this.c);
            byteArrayOutputStream.write(this.d);
            byteArrayOutputStream.write(this.e);
            if (!TextUtils.isEmpty(this.f)) {
                byteArrayOutputStream.write(this.f.getBytes(Charset.defaultCharset()), 0, this.f.getBytes(Charset.defaultCharset()).length);
            }
            byteArrayOutputStream.write(0);
            if (!TextUtils.isEmpty(this.g)) {
                byteArrayOutputStream.write(this.g.getBytes(Charset.defaultCharset()), 0, this.g.getBytes(Charset.defaultCharset()).length);
            }
            byteArrayOutputStream.write(0);
            if (!TextUtils.isEmpty(this.h)) {
                byteArrayOutputStream.write(this.h.getBytes(Charset.defaultCharset()), 0, this.h.getBytes(Charset.defaultCharset()).length);
            }
            byteArrayOutputStream.write(0);
            return byteArrayOutputStream.toByteArray();
        }

        public String getLocation() {
            return this.h;
        }

        public byte getMaxTemp() {
            return this.c;
        }

        public byte getMinTemp() {
            return this.d;
        }

        public byte getTemperature() {
            return this.b;
        }

        public void setAir(short air) {
            this.a = air;
        }

        public void setAirDes(String airDes) {
            this.f = airDes;
        }

        public void setAqi(short aqi) {
            this.e = aqi;
        }

        public void setAqiDes(String aqiDes) {
            this.g = aqiDes;
        }

        public void setLocation(String location) {
            this.h = location;
        }

        public void setMaxTemp(byte maxTemp) {
            this.c = maxTemp;
        }

        public void setMinTemp(byte minTemp) {
            this.d = minTemp;
        }

        public void setTemperature(byte temperature) {
            this.b = temperature;
        }

        public String toString() {
            return "Weather{air=" + ((int) this.a) + ", temperature=" + ((int) this.b) + ", maxTemp=" + ((int) this.c) + ", minTemp=" + ((int) this.d) + ", aqi=" + ((int) this.e) + ", airDes='" + this.f + "', aqiDes='" + this.g + "', location='" + this.h + "'}";
        }
    }

    public String getAqiDetail() {
        return this.e;
    }

    @Override // com.xiaomi.hm.health.bt.profile.speech.SpeechContent
    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.b);
        byte b = this.b;
        if (b == 1) {
            byteArrayOutputStream.write(this.c.getBytes(), 0, this.c.getBytes().length);
        } else if (b == 2) {
            byteArrayOutputStream.write(this.d.getBytes(), 0, this.d.getBytes().length);
        } else if (b == 3) {
            byteArrayOutputStream.write(this.e.getBytes(Charset.defaultCharset()), 0, this.e.getBytes(Charset.defaultCharset()).length);
            byteArrayOutputStream.write(0);
        } else if (b == 4) {
            byteArrayOutputStream.write(this.f.getBytes(Charset.defaultCharset()), 0, this.f.getBytes(Charset.defaultCharset()).length);
            byteArrayOutputStream.write(0);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public Weather getCurrentWeather() {
        return this.c;
    }

    public ForecastWeather getForecastWeather() {
        return this.d;
    }

    public byte getType() {
        return this.b;
    }

    public String getWeatherDetail() {
        return this.f;
    }

    public void setAqiDetail(String aqiDetail) {
        this.e = aqiDetail;
    }

    public void setCurrentWeather(Weather currentWeather) {
        this.c = currentWeather;
    }

    public void setForecastWeather(ForecastWeather forecastWeather) {
        this.d = forecastWeather;
    }

    public void setType(byte type) {
        this.b = type;
    }

    public void setWeatherDetail(String weatherDetail) {
        this.f = weatherDetail;
    }
}
