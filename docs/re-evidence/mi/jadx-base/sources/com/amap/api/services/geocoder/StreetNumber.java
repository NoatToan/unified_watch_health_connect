package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class StreetNumber implements Parcelable {
    public static final Parcelable.Creator<StreetNumber> CREATOR = new Parcelable.Creator<StreetNumber>() { // from class: com.amap.api.services.geocoder.StreetNumber.1
        private static StreetNumber a(Parcel parcel) {
            return new StreetNumber(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StreetNumber createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StreetNumber[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6578b;
    private LatLonPoint c;
    private String d;
    private float e;

    public /* synthetic */ StreetNumber(Parcel parcel, byte b2) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getDirection() {
        return this.d;
    }

    public final float getDistance() {
        return this.e;
    }

    public final LatLonPoint getLatLonPoint() {
        return this.c;
    }

    public final String getNumber() {
        return this.f6578b;
    }

    public final String getStreet() {
        return this.f6577a;
    }

    public final void setDirection(String str) {
        this.d = str;
    }

    public final void setDistance(float f) {
        this.e = f;
    }

    public final void setLatLonPoint(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public final void setNumber(String str) {
        this.f6578b = str;
    }

    public final void setStreet(String str) {
        this.f6577a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6577a);
        parcel.writeString(this.f6578b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
        parcel.writeFloat(this.e);
    }

    public StreetNumber() {
    }

    private StreetNumber(Parcel parcel) {
        this.f6577a = parcel.readString();
        this.f6578b = parcel.readString();
        this.c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readFloat();
    }
}
