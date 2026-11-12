package com.amap.api.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class DPoint implements Parcelable {
    public static final Parcelable.Creator<DPoint> CREATOR = new Parcelable.Creator<DPoint>() { // from class: com.amap.api.location.DPoint.1
        private static DPoint a(Parcel parcel) {
            return new DPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DPoint createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DPoint[] newArray(int i) {
            return a(i);
        }

        private static DPoint[] a(int i) {
            return new DPoint[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f6393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f6394b;

    public DPoint() {
        this.f6393a = 0.0d;
        this.f6394b = 0.0d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DPoint)) {
            return false;
        }
        DPoint dPoint = (DPoint) obj;
        return this.f6394b == dPoint.f6394b && this.f6393a == dPoint.f6393a;
    }

    public double getLatitude() {
        return this.f6394b;
    }

    public double getLongitude() {
        return this.f6393a;
    }

    public int hashCode() {
        return Double.valueOf((this.f6394b + this.f6393a) * 1000000.0d).intValue();
    }

    public void setLatitude(double d) {
        if (d > 90.0d) {
            d = 90.0d;
        }
        if (d < -90.0d) {
            d = -90.0d;
        }
        this.f6394b = d;
    }

    public void setLongitude(double d) {
        if (d > 180.0d) {
            d = 180.0d;
        }
        if (d < -180.0d) {
            d = -180.0d;
        }
        this.f6393a = d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f6393a);
        parcel.writeDouble(this.f6394b);
    }

    public DPoint(double d, double d2) {
        this.f6393a = 0.0d;
        this.f6394b = 0.0d;
        d2 = d2 > 180.0d ? 180.0d : d2;
        d2 = d2 < -180.0d ? -180.0d : d2;
        d = d > 90.0d ? 90.0d : d;
        d = d < -90.0d ? -90.0d : d;
        this.f6393a = d2;
        this.f6394b = d;
    }

    public DPoint(Parcel parcel) {
        this.f6393a = 0.0d;
        this.f6394b = 0.0d;
        this.f6393a = parcel.readDouble();
        this.f6394b = parcel.readDouble();
    }
}
