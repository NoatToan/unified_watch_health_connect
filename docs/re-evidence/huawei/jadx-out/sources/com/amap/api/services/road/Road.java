package com.amap.api.services.road;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes21.dex */
public class Road implements Parcelable {
    public static final Parcelable.Creator<Road> CREATOR = new Parcelable.Creator<Road>() { // from class: com.amap.api.services.road.Road.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Road[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Road createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static Road a(Parcel parcel) {
            return new Road(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3663c;
    private float d;
    private String e;
    private LatLonPoint f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Road() {
    }

    public Road(String str, String str2) {
        this.f3661a = str;
        this.f3662b = str2;
    }

    public void setId(String str) {
        this.f3661a = str;
    }

    public void setName(String str) {
        this.f3662b = str;
    }

    public String getCityCode() {
        return this.f3663c;
    }

    public void setCityCode(String str) {
        this.f3663c = str;
    }

    public float getRoadWidth() {
        return this.d;
    }

    public void setRoadWidth(float f) {
        this.d = f;
    }

    public String getType() {
        return this.e;
    }

    public void setType(String str) {
        this.e = str;
    }

    public LatLonPoint getCenterPoint() {
        return this.f;
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f = latLonPoint;
    }

    public String getId() {
        return this.f3661a;
    }

    public String getName() {
        return this.f3662b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3661a);
        parcel.writeString(this.f3662b);
        parcel.writeString(this.f3663c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.e);
        parcel.writeValue(this.f);
    }

    protected Road(Parcel parcel) {
        this.f3661a = parcel.readString();
        this.f3662b = parcel.readString();
        this.f3663c = parcel.readString();
        this.d = parcel.readFloat();
        this.e = parcel.readString();
        this.f = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }
}
