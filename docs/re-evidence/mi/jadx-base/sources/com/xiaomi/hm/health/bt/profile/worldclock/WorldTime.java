package com.xiaomi.hm.health.bt.profile.worldclock;

import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes11.dex */
public class WorldTime implements Serializable {
    private static final int MAX_VALUE_LENGHT_1 = 1;
    private static final int MAX_VALUE_LENGHT_3 = 3;
    private static final int MAX_VALUE_LENGHT_4 = 4;
    private static final int MAX_VALUE_LENGHT_48 = 48;
    private static final long serialVersionUID = 1;
    private String city;
    private String cityCode;
    private String country;
    private int daylightDuration;
    private int daylightState;
    private boolean display;
    private int index;
    private long offsetTransitionDateTime;
    private int timeZone;

    public WorldTime(int i, String str, String str2, int i2, int i3, long j, int i4) {
        this.display = true;
        this.timeZone = i;
        this.country = str;
        this.city = str2;
        this.daylightState = i2;
        this.daylightDuration = i3;
        this.offsetTransitionDateTime = j;
        this.index = i4;
    }

    public byte[] getByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(tet.r(this.index, 1));
            String strCutString = ProfileUtils.cutString(this.cityCode, 3);
            if (strCutString != null) {
                byteArrayOutputStream.write(strCutString.getBytes(Charset.forName("UTF-8")));
            }
            byteArrayOutputStream.write(0);
            String strCutString2 = ProfileUtils.cutString(this.country, 48);
            if (strCutString2 != null) {
                byteArrayOutputStream.write(strCutString2.getBytes(Charset.forName("UTF-8")));
            }
            byteArrayOutputStream.write(0);
            String strCutString3 = ProfileUtils.cutString(this.city, 48);
            if (strCutString3 != null) {
                byteArrayOutputStream.write(strCutString3.getBytes(Charset.forName("UTF-8")));
            }
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(tet.r(ProfileUtils.getTimezoneKey(this.timeZone), 1));
            byteArrayOutputStream.write(tet.r(this.daylightState, 1));
            byteArrayOutputStream.write(tet.r(this.daylightDuration, 1));
            byteArrayOutputStream.write(tet.r(this.offsetTransitionDateTime, 4));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String getCity() {
        return this.city;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getCountry() {
        return this.country;
    }

    public int getDaylightDuration() {
        return this.daylightDuration;
    }

    public int getDaylightState() {
        return this.daylightState;
    }

    public int getIndex() {
        return this.index;
    }

    public long getOffsetTransitionDateTime() {
        return this.offsetTransitionDateTime;
    }

    public int getTimeZone() {
        return this.timeZone;
    }

    public boolean isDisplay() {
        return this.display;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setDaylightDuration(int i) {
        this.daylightDuration = i;
    }

    public void setDaylightState(int i) {
        this.daylightState = i;
    }

    public void setDisplay(boolean z) {
        this.display = z;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setOffsetTransitionDateTime(long j) {
        this.offsetTransitionDateTime = j;
    }

    public void setTimeZone(int i) {
        this.timeZone = i;
    }

    public String toString() {
        return "timeZone:" + this.timeZone + ",country:" + this.country + ",city:" + this.city + ",cityCode:" + this.cityCode + ",daylightState:" + this.daylightState + ",daylightDuration:" + this.daylightDuration + ",offsetTransitionDateTime:" + this.offsetTransitionDateTime + ",index:" + this.index + ",display:" + this.display;
    }

    public WorldTime(int i, String str, String str2, String str3, int i2, int i3, long j, int i4) {
        this.display = true;
        this.timeZone = i;
        this.country = str;
        this.city = str2;
        this.cityCode = str3;
        this.daylightState = i2;
        this.daylightDuration = i3;
        this.offsetTransitionDateTime = j;
        this.index = i4;
    }

    public byte[] getByteArray(boolean z) {
        byte[] byteArray = getByteArray();
        if (!z || byteArray.length <= 0) {
            return byteArray;
        }
        byte[] bArr = new byte[byteArray.length + 1];
        System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
        bArr[byteArray.length] = this.display ? (byte) 1 : (byte) 0;
        return bArr;
    }

    public WorldTime(int i, String str, String str2, String str3, int i2, int i3, long j, int i4, boolean z) {
        this.timeZone = i;
        this.country = str;
        this.city = str2;
        this.cityCode = str3;
        this.daylightState = i2;
        this.daylightDuration = i3;
        this.offsetTransitionDateTime = j;
        this.index = i4;
        this.display = z;
    }

    public WorldTime() {
        this.display = true;
    }
}
