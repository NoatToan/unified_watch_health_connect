package com.huami.mifit.sportlib.model;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class GPSPoint implements Serializable, Comparable<GPSPoint>, Parcelable {
    public static final Parcelable.Creator<GPSPoint> CREATOR = new a();
    public static final int STATE_MARKED_ACTIVE = 1;
    public static final int STATE_MARKED_AS_AUTO_PAUSED = -3;
    public static final int STATE_MARKED_AS_LOST = -4;
    public static final int STATE_MARKED_INACTIVE = 2;
    public static final int STATE_MARKED_INACTIVE_AUTO_PAUSED = 3;
    public static final int STATE_MARKED_START_LOST = 4;
    public static final int STATE_UNMARKED = 0;
    private static final long serialVersionUID = 1;
    private double a;
    private long b;
    private int c;
    private float d;
    private int e;
    private float f;
    private float g;
    private int h;
    private int i;
    public double mLatitude;
    public double mLongitude;

    public class a implements Parcelable.Creator<GPSPoint> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GPSPoint createFromParcel(Parcel parcel) {
            return new GPSPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GPSPoint[] newArray(int i) {
            return new GPSPoint[i];
        }
    }

    public GPSPoint() {
        this.a = 0.0d;
        this.b = 0L;
        this.c = 0;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0;
        this.i = 12;
    }

    private void a(Location location) {
        this.mLatitude = location.getLatitude();
        this.mLongitude = location.getLongitude();
        this.a = location.getAltitude();
        this.g = location.getAccuracy();
        this.f = location.getBearing();
        this.b = System.currentTimeMillis() / 1000;
        this.d = location.getSpeed();
    }

    public static Location createLocation(GPSPoint gPSPoint) {
        Location location = new Location("gps");
        location.setAltitude(gPSPoint.a);
        location.setLatitude(gPSPoint.mLatitude);
        location.setLongitude(gPSPoint.mLongitude);
        return location;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float distance(GPSPoint gPSPoint) {
        float[] fArr = new float[1];
        Location.distanceBetween(this.mLatitude, this.mLongitude, gPSPoint.mLatitude, gPSPoint.mLongitude, fArr);
        return fArr[0];
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof GPSPoint) && ((GPSPoint) obj).b == this.b;
    }

    public int getAttr() {
        return this.h;
    }

    public int getIndex() {
        return this.c;
    }

    public int getProviderType() {
        return this.e;
    }

    public float getSpeed() {
        return this.d;
    }

    public long getTime() {
        return this.b;
    }

    public int getVersion() {
        return this.i;
    }

    public boolean isActive() {
        return this.h == 1;
    }

    public boolean isMaskPoint() {
        return this.mLatitude > 180.0d || this.mLongitude > 180.0d;
    }

    public boolean isPause() {
        int i = this.h;
        return i == 2 || i == 3;
    }

    public void setAttr(int i) {
        this.h = i;
    }

    public void setIndex(int i) {
        this.c = i;
    }

    public void setProviderType(int i) {
        this.e = i;
    }

    public void setSpeed(float f) {
        this.d = f;
    }

    public void setTime(long j) {
        this.b = j;
    }

    public void setVersion(int i) {
        this.i = i;
    }

    public String toString() {
        return "GPSPoint [mAltitude=" + this.a + ", mLatitude=" + this.mLatitude + ", mLongitude=" + this.mLongitude + ", mTime=" + this.b + ", mSpeed=" + this.d + ", mProviderType=" + this.e + ", mBearing=" + this.f + ", mAccuracy=" + this.g + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
        parcel.writeDouble(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public GPSPoint m3384clone() {
        GPSPoint gPSPoint = new GPSPoint();
        gPSPoint.a = this.a;
        gPSPoint.mLatitude = this.mLatitude;
        gPSPoint.mLongitude = this.mLongitude;
        gPSPoint.b = this.b;
        gPSPoint.c = this.c;
        gPSPoint.g = this.g;
        gPSPoint.h = this.h;
        gPSPoint.d = this.d;
        gPSPoint.e = this.e;
        gPSPoint.f = this.f;
        return gPSPoint;
    }

    @Override // java.lang.Comparable
    public int compareTo(GPSPoint gPSPoint) {
        if (this.c > gPSPoint.getIndex()) {
            return 1;
        }
        return this.c < gPSPoint.getIndex() ? -1 : 0;
    }

    public GPSPoint(double d, double d2) {
        this.a = 0.0d;
        this.b = 0L;
        this.c = 0;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0;
        this.i = 12;
        this.mLatitude = d;
        this.mLongitude = d2;
    }

    public GPSPoint(double d, double d2, double d3) {
        this.a = 0.0d;
        this.b = 0L;
        this.c = 0;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0;
        this.i = 12;
        this.mLatitude = d;
        this.mLongitude = d2;
        this.a = d3;
    }

    public GPSPoint(long j, double d, double d2, double d3, float f) {
        this.a = 0.0d;
        this.b = 0L;
        this.c = 0;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0;
        this.i = 12;
        this.mLatitude = d;
        this.mLongitude = d2;
        this.a = d3;
        this.g = f;
        this.b = j / 1000;
    }

    public GPSPoint(Location location) {
        this.a = 0.0d;
        this.b = 0L;
        this.c = 0;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0;
        this.i = 12;
        a(location);
    }

    public GPSPoint(Parcel parcel) {
        this.a = 0.0d;
        this.b = 0L;
        this.c = 0;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0;
        this.i = 12;
        this.mLatitude = parcel.readDouble();
        this.mLongitude = parcel.readDouble();
        this.a = parcel.readDouble();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readFloat();
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
    }
}
