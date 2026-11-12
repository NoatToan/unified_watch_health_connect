package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class HeatMapOptions implements Parcelable {
    public static final Parcelable.Creator<HeatMapOptions> CREATOR = new Parcelable.Creator<HeatMapOptions>() { // from class: com.huawei.hms.maps.model.HeatMapOptions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HeatMapOptions createFromParcel(Parcel parcel) {
            return new HeatMapOptions(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HeatMapOptions[] newArray(int i) {
            return new HeatMapOptions[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f14250c;
    private Map d;
    private Map e;
    private Map f;
    private int g;
    private int h;

    public enum RadiusUnit {
        PIXEL,
        METER
    }

    public HeatMapOptions() {
        this.f14249b = true;
        this.f14250c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = 1;
    }

    public void dataSet(int i) {
        this.h = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void intensity(float f) {
        this.e.clear();
        this.e.put(Float.valueOf(0.0f), Float.valueOf(f));
    }

    public void opacity(float f) {
        this.d.clear();
        this.d.put(Float.valueOf(-1.0f), Float.valueOf(f));
    }

    public void radius(float f) {
        this.f.clear();
        this.f.put(Float.valueOf(0.0f), Float.valueOf(f));
    }

    protected HeatMapOptions(Parcel parcel) {
        this.f14249b = true;
        this.f14250c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = 1;
        this.f14248a = parcel.readString();
        this.f14249b = parcel.readByte() != 0;
        HashMap map = new HashMap();
        this.f14250c = map;
        parcel.readMap(map, getClass().getClassLoader());
        HashMap map2 = new HashMap();
        this.d = map2;
        parcel.readMap(map2, getClass().getClassLoader());
        HashMap map3 = new HashMap();
        this.e = map3;
        parcel.readMap(map3, getClass().getClassLoader());
        HashMap map4 = new HashMap();
        this.f = map4;
        parcel.readMap(map4, getClass().getClassLoader());
        this.g = parcel.readInt();
        this.h = parcel.readInt();
    }

    public void dataSet(String str) {
        this.f14248a = str;
    }

    public void intensity(Map<Float, Float> map) {
        if (map == null) {
            return;
        }
        this.e.clear();
        this.e.putAll(map);
    }

    public void opacity(Map<Float, Float> map) {
        if (map == null) {
            return;
        }
        this.d.clear();
        this.d.putAll(map);
    }

    public void radius(Map<Float, Float> map) {
        if (map == null) {
            return;
        }
        this.f.clear();
        this.f.putAll(map);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14248a);
        parcel.writeByte(this.f14249b ? (byte) 1 : (byte) 0);
        parcel.writeMap(this.f14250c);
        parcel.writeMap(this.d);
        parcel.writeMap(this.e);
        parcel.writeMap(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }

    public void visible(boolean z) {
        this.f14249b = z;
    }

    public void setResourceId(int i) {
        this.h = i;
    }

    public void radiusUnit(RadiusUnit radiusUnit) {
        this.g = radiusUnit.equals(RadiusUnit.METER) ? 2 : 1;
    }

    public boolean getVisible() {
        return this.f14249b;
    }

    public int getResourceId() {
        return this.h;
    }

    public RadiusUnit getRadiusUnit() {
        return this.g == 2 ? RadiusUnit.METER : RadiusUnit.PIXEL;
    }

    public Map<Float, Float> getRadius() {
        return this.f;
    }

    public Map<Float, Float> getOpacity() {
        return this.d;
    }

    public Map<Float, Float> getIntensity() {
        return this.e;
    }

    public String getHeatMapData() {
        return this.f14248a;
    }

    public Map<Float, Integer> getColor() {
        return this.f14250c;
    }

    public void color(Map<Float, Integer> map) {
        if (map == null) {
            return;
        }
        this.f14250c.clear();
        this.f14250c.putAll(map);
    }
}
