package com.xiaomi.hm.health.bt.profile.worldclock;

import androidx.annotation.NonNull;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes18.dex */
public class WorldTime implements Serializable {
    private static final int j = 48;
    private static final int k = 1;
    private static final int l = 4;
    private static final int m = 3;
    private static final long serialVersionUID = 1;
    private int a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private long g;
    private int h;
    private boolean i;

    public WorldTime(int timeZone, String country, String city, int daylightState, int daylightDuration, long offsetTransitionDateTime, int index) {
        this.i = true;
        this.a = timeZone;
        this.b = country;
        this.c = city;
        this.e = daylightState;
        this.f = daylightDuration;
        this.g = offsetTransitionDateTime;
        this.h = index;
    }

    public byte[] getByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(GattUtils.numberToBytes(this.h, 1));
            String strCutString = ProfileUtils.cutString(this.d, 3);
            if (strCutString != null) {
                byteArrayOutputStream.write(strCutString.getBytes(Charset.forName("UTF-8")));
            }
            byteArrayOutputStream.write(0);
            String strCutString2 = ProfileUtils.cutString(this.b, 48);
            if (strCutString2 != null) {
                byteArrayOutputStream.write(strCutString2.getBytes(Charset.forName("UTF-8")));
            }
            byteArrayOutputStream.write(0);
            String strCutString3 = ProfileUtils.cutString(this.c, 48);
            if (strCutString3 != null) {
                byteArrayOutputStream.write(strCutString3.getBytes(Charset.forName("UTF-8")));
            }
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(GattUtils.numberToBytes(ProfileUtils.getTimezoneKey(this.a), 1));
            byteArrayOutputStream.write(GattUtils.numberToBytes(this.e, 1));
            byteArrayOutputStream.write(GattUtils.numberToBytes(this.f, 1));
            byteArrayOutputStream.write(GattUtils.numberToBytes(this.g, 4));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String getCity() {
        return this.c;
    }

    public String getCityCode() {
        return this.d;
    }

    public String getCountry() {
        return this.b;
    }

    public int getDaylightDuration() {
        return this.f;
    }

    public int getDaylightState() {
        return this.e;
    }

    public int getIndex() {
        return this.h;
    }

    public long getOffsetTransitionDateTime() {
        return this.g;
    }

    public int getTimeZone() {
        return this.a;
    }

    public boolean isDisplay() {
        return this.i;
    }

    public void setCity(String city) {
        this.c = city;
    }

    public void setCityCode(String cityCode) {
        this.d = cityCode;
    }

    public void setCountry(String country) {
        this.b = country;
    }

    public void setDaylightDuration(int daylightDuration) {
        this.f = daylightDuration;
    }

    public void setDaylightState(int daylightState) {
        this.e = daylightState;
    }

    public void setDisplay(boolean display) {
        this.i = display;
    }

    public void setIndex(int index) {
        this.h = index;
    }

    public void setOffsetTransitionDateTime(long offsetTransitionDateTime) {
        this.g = offsetTransitionDateTime;
    }

    public void setTimeZone(int timeZone) {
        this.a = timeZone;
    }

    @NonNull
    public String toString() {
        return "timeZone:" + this.a + ",country:" + this.b + ",city:" + this.c + ",cityCode:" + this.d + ",daylightState:" + this.e + ",daylightDuration:" + this.f + ",offsetTransitionDateTime:" + this.g + ",index:" + this.h + ",display:" + this.i;
    }

    public WorldTime(int timeZone, String country, String city, String cityCode, int daylightState, int daylightDuration, long offsetTransitionDateTime, int index) {
        this.i = true;
        this.a = timeZone;
        this.b = country;
        this.c = city;
        this.d = cityCode;
        this.e = daylightState;
        this.f = daylightDuration;
        this.g = offsetTransitionDateTime;
        this.h = index;
    }

    public byte[] getByteArray(boolean z) {
        byte[] byteArray = getByteArray();
        if (!z || byteArray.length <= 0) {
            return byteArray;
        }
        byte[] bArr = new byte[byteArray.length + 1];
        System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
        bArr[byteArray.length] = this.i ? (byte) 1 : (byte) 0;
        return bArr;
    }

    public WorldTime(int timeZone, String country, String city, String cityCode, int daylightState, int daylightDuration, long offsetTransitionDateTime, int index, boolean display) {
        this.i = true;
        this.a = timeZone;
        this.b = country;
        this.c = city;
        this.d = cityCode;
        this.e = daylightState;
        this.f = daylightDuration;
        this.g = offsetTransitionDateTime;
        this.h = index;
        this.i = display;
    }

    public WorldTime() {
        this.i = true;
    }
}
