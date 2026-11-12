package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonPoint> CREATOR = new Parcelable.Creator<LatLonPoint>() { // from class: com.amap.api.services.core.LatLonPoint.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonPoint createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonPoint[] newArray(int i) {
            return a(i);
        }

        private static LatLonPoint a(Parcel parcel) {
            return new LatLonPoint(parcel);
        }

        private static LatLonPoint[] a(int i) {
            return new LatLonPoint[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f3538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f3539b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint(double d, double d2) {
        this.f3538a = d;
        this.f3539b = d2;
    }

    public double getLongitude() {
        return this.f3539b;
    }

    public void setLongitude(double d) {
        this.f3539b = d;
    }

    public double getLatitude() {
        return this.f3538a;
    }

    public void setLatitude(double d) {
        this.f3538a = d;
    }

    public LatLonPoint copy() {
        return new LatLonPoint(this.f3538a, this.f3539b);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f3538a);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f3539b);
        return ((i + 31) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LatLonPoint latLonPoint = (LatLonPoint) obj;
        return Double.doubleToLongBits(this.f3538a) == Double.doubleToLongBits(latLonPoint.f3538a) && Double.doubleToLongBits(this.f3539b) == Double.doubleToLongBits(latLonPoint.f3539b);
    }

    public String toString() {
        return this.f3538a + "," + this.f3539b;
    }

    protected LatLonPoint(Parcel parcel) {
        this.f3538a = parcel.readDouble();
        this.f3539b = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f3538a);
        parcel.writeDouble(this.f3539b);
    }
}
