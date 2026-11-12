package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class GeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<GeocodeAddress> CREATOR = new Parcelable.Creator<GeocodeAddress>() { // from class: com.amap.api.services.geocoder.GeocodeAddress.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GeocodeAddress[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GeocodeAddress createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static GeocodeAddress a(Parcel parcel) {
            return new GeocodeAddress(parcel, (byte) 0);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3571c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private LatLonPoint i;
    private String j;
    private String k;
    private String l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* synthetic */ GeocodeAddress(Parcel parcel, byte b2) {
        this(parcel);
    }

    public GeocodeAddress() {
    }

    public final String getFormatAddress() {
        return this.f3569a;
    }

    public final void setFormatAddress(String str) {
        this.f3569a = str;
    }

    public final String getProvince() {
        return this.f3570b;
    }

    public final void setProvince(String str) {
        this.f3570b = str;
    }

    public final String getCity() {
        return this.f3571c;
    }

    public final void setCity(String str) {
        this.f3571c = str;
    }

    public final String getDistrict() {
        return this.d;
    }

    public final void setDistrict(String str) {
        this.d = str;
    }

    public final String getTownship() {
        return this.e;
    }

    public final void setTownship(String str) {
        this.e = str;
    }

    public final String getNeighborhood() {
        return this.f;
    }

    public final void setNeighborhood(String str) {
        this.f = str;
    }

    public final String getBuilding() {
        return this.g;
    }

    public final void setBuilding(String str) {
        this.g = str;
    }

    public final String getAdcode() {
        return this.h;
    }

    public final void setAdcode(String str) {
        this.h = str;
    }

    public final LatLonPoint getLatLonPoint() {
        return this.i;
    }

    public final void setLatLonPoint(LatLonPoint latLonPoint) {
        this.i = latLonPoint;
    }

    public final String getLevel() {
        return this.j;
    }

    public final void setLevel(String str) {
        this.j = str;
    }

    public final String getCountry() {
        return this.k;
    }

    public final void setCountry(String str) {
        this.k = str;
    }

    public final String getPostcode() {
        return this.l;
    }

    public final void setPostcode(String str) {
        this.l = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3569a);
        parcel.writeString(this.f3570b);
        parcel.writeString(this.f3571c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeValue(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
    }

    private GeocodeAddress(Parcel parcel) {
        this.f3569a = parcel.readString();
        this.f3570b = parcel.readString();
        this.f3571c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
    }
}
