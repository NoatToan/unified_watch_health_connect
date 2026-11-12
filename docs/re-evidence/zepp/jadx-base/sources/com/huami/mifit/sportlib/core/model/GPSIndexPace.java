package com.huami.mifit.sportlib.core.model;

import com.facebook.appevents.UserDataStore;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class GPSIndexPace {
    private float a;
    private long b;
    private float c;
    private int d;
    private float e;
    private int f;
    private String g;
    private int h;
    private long i;

    public GPSIndexPace() {
        this.c = 0.0f;
        this.d = 0;
        this.e = 0.0f;
        this.f = -1;
        this.g = "";
        this.h = -1;
        this.i = 0L;
    }

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.c = (int) jSONObject.optDouble("dis", 0.0d);
            this.d = jSONObject.optInt(UserDataStore.CITY);
            this.e = (float) jSONObject.optDouble("pace", 0.0d);
            this.f = jSONObject.optInt("gpsIndex");
            this.g = jSONObject.optString("geoHash");
            this.h = jSONObject.getInt("aveHr");
            this.i = jSONObject.optLong("trackInterpolation");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getCt() {
        return this.d;
    }

    public float getDis() {
        return this.c;
    }

    public float getPace() {
        return this.e;
    }

    public long getTotalCost() {
        return this.b;
    }

    public float getTotalDis() {
        return this.a;
    }

    public void saveTotal(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public void setAveHr(int i) {
        this.h = i;
    }

    public void setGeoHash(String str) {
        this.g = str;
    }

    public void setGpsIndex(int i) {
        this.f = i;
    }

    public void setTrackInterpolation(long j) {
        this.i = j;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dis", this.c);
            jSONObject.put(UserDataStore.CITY, this.d);
            jSONObject.put("pace", this.e);
            jSONObject.put("gpsIndex", this.f);
            jSONObject.put("geoHash", this.g);
            jSONObject.put("aveHr", this.h);
            jSONObject.put("trackInterpolation", this.i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "GPSIndexPace{totalDis=" + this.a + ", totalCost=" + this.b + ", dis=" + this.c + ", ct=" + this.d + ", pace=" + this.e + ", gpsIndex=" + this.f + ", geoHash='" + this.g + "', aveHr=" + this.h + ", trackInterpolation=" + this.i + '}';
    }

    public GPSIndexPace(int i, int i2, float f) {
        this.c = 0.0f;
        this.d = 0;
        this.e = 0.0f;
        this.f = -1;
        this.g = "";
        this.h = -1;
        this.i = 0L;
        this.c = i;
        this.d = i2;
        this.e = f;
    }
}
