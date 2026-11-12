package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes21.dex */
public final class StreetNumber implements Parcelable {
    public static final Parcelable.Creator<StreetNumber> CREATOR = new Parcelable.Creator<StreetNumber>() { // from class: com.amap.api.services.geocoder.StreetNumber.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StreetNumber[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StreetNumber createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static StreetNumber a(Parcel parcel) {
            return new StreetNumber(parcel, (byte) 0);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f3591c;
    private String d;
    private float e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* synthetic */ StreetNumber(Parcel parcel, byte b2) {
        this(parcel);
    }

    public StreetNumber() {
    }

    public final String getStreet() {
        return this.f3589a;
    }

    public final void setStreet(String str) {
        this.f3589a = str;
    }

    public final String getNumber() {
        return this.f3590b;
    }

    public final void setNumber(String str) {
        this.f3590b = str;
    }

    public final LatLonPoint getLatLonPoint() {
        return this.f3591c;
    }

    public final void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f3591c = latLonPoint;
    }

    public final String getDirection() {
        return this.d;
    }

    public final void setDirection(String str) {
        this.d = str;
    }

    public final float getDistance() {
        return this.e;
    }

    public final void setDistance(float f) {
        this.e = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3589a);
        parcel.writeString(this.f3590b);
        parcel.writeValue(this.f3591c);
        parcel.writeString(this.d);
        parcel.writeFloat(this.e);
    }

    private StreetNumber(Parcel parcel) {
        this.f3589a = parcel.readString();
        this.f3590b = parcel.readString();
        this.f3591c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readFloat();
    }
}
