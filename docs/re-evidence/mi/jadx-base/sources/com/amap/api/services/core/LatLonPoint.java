package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonPoint> CREATOR = new Parcelable.Creator<LatLonPoint>() { // from class: com.amap.api.services.core.LatLonPoint.1
        private static LatLonPoint a(Parcel parcel) {
            return new LatLonPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonPoint createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonPoint[] newArray(int i) {
            return a(i);
        }

        private static LatLonPoint[] a(int i) {
            return new LatLonPoint[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f6533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f6534b;

    public LatLonPoint(double d, double d2) {
        this.f6533a = d;
        this.f6534b = d2;
    }

    public LatLonPoint copy() {
        return new LatLonPoint(this.f6533a, this.f6534b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LatLonPoint latLonPoint = (LatLonPoint) obj;
        return Double.doubleToLongBits(this.f6533a) == Double.doubleToLongBits(latLonPoint.f6533a) && Double.doubleToLongBits(this.f6534b) == Double.doubleToLongBits(latLonPoint.f6534b);
    }

    public double getLatitude() {
        return this.f6533a;
    }

    public double getLongitude() {
        return this.f6534b;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f6533a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f6534b);
        return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public void setLatitude(double d) {
        this.f6533a = d;
    }

    public void setLongitude(double d) {
        this.f6534b = d;
    }

    public String toString() {
        return this.f6533a + "," + this.f6534b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f6533a);
        parcel.writeDouble(this.f6534b);
    }

    public LatLonPoint(Parcel parcel) {
        this.f6533a = parcel.readDouble();
        this.f6534b = parcel.readDouble();
    }
}
