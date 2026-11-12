package com.amap.api.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class DPoint implements Parcelable {
    public static final Parcelable.Creator<DPoint> CREATOR = new Parcelable.Creator<DPoint>() { // from class: com.amap.api.location.DPoint.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DPoint createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DPoint[] newArray(int i) {
            return a(i);
        }

        private static DPoint a(Parcel parcel) {
            return new DPoint(parcel);
        }

        private static DPoint[] a(int i) {
            return new DPoint[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f3361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f3362b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DPoint() {
        this.f3361a = 0.0d;
        this.f3362b = 0.0d;
    }

    public DPoint(double d, double d2) {
        this.f3361a = 0.0d;
        this.f3362b = 0.0d;
        d2 = d2 > 180.0d ? 180.0d : d2;
        d2 = d2 < -180.0d ? -180.0d : d2;
        d = d > 90.0d ? 90.0d : d;
        d = d < -90.0d ? -90.0d : d;
        this.f3361a = d2;
        this.f3362b = d;
    }

    public double getLongitude() {
        return this.f3361a;
    }

    public void setLongitude(double d) {
        if (d > 180.0d) {
            d = 180.0d;
        }
        if (d < -180.0d) {
            d = -180.0d;
        }
        this.f3361a = d;
    }

    public double getLatitude() {
        return this.f3362b;
    }

    public void setLatitude(double d) {
        if (d > 90.0d) {
            d = 90.0d;
        }
        if (d < -90.0d) {
            d = -90.0d;
        }
        this.f3362b = d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DPoint)) {
            return false;
        }
        DPoint dPoint = (DPoint) obj;
        return this.f3362b == dPoint.f3362b && this.f3361a == dPoint.f3361a;
    }

    public int hashCode() {
        return Double.valueOf((this.f3362b + this.f3361a) * 1000000.0d).intValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f3361a);
        parcel.writeDouble(this.f3362b);
    }

    protected DPoint(Parcel parcel) {
        this.f3361a = 0.0d;
        this.f3362b = 0.0d;
        this.f3361a = parcel.readDouble();
        this.f3362b = parcel.readDouble();
    }
}
