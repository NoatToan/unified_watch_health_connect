package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class GeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<GeocodeAddress> CREATOR = new Parcelable.Creator<GeocodeAddress>() { // from class: com.amap.api.services.geocoder.GeocodeAddress.1
        private static GeocodeAddress a(Parcel parcel) {
            return new GeocodeAddress(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GeocodeAddress createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GeocodeAddress[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6560b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private LatLonPoint i;
    private String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f6561k;
    private String l;

    public /* synthetic */ GeocodeAddress(Parcel parcel, byte b2) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAdcode() {
        return this.h;
    }

    public final String getBuilding() {
        return this.g;
    }

    public final String getCity() {
        return this.c;
    }

    public final String getCountry() {
        return this.f6561k;
    }

    public final String getDistrict() {
        return this.d;
    }

    public final String getFormatAddress() {
        return this.f6559a;
    }

    public final LatLonPoint getLatLonPoint() {
        return this.i;
    }

    public final String getLevel() {
        return this.j;
    }

    public final String getNeighborhood() {
        return this.f;
    }

    public final String getPostcode() {
        return this.l;
    }

    public final String getProvince() {
        return this.f6560b;
    }

    public final String getTownship() {
        return this.e;
    }

    public final void setAdcode(String str) {
        this.h = str;
    }

    public final void setBuilding(String str) {
        this.g = str;
    }

    public final void setCity(String str) {
        this.c = str;
    }

    public final void setCountry(String str) {
        this.f6561k = str;
    }

    public final void setDistrict(String str) {
        this.d = str;
    }

    public final void setFormatAddress(String str) {
        this.f6559a = str;
    }

    public final void setLatLonPoint(LatLonPoint latLonPoint) {
        this.i = latLonPoint;
    }

    public final void setLevel(String str) {
        this.j = str;
    }

    public final void setNeighborhood(String str) {
        this.f = str;
    }

    public final void setPostcode(String str) {
        this.l = str;
    }

    public final void setProvince(String str) {
        this.f6560b = str;
    }

    public final void setTownship(String str) {
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6559a);
        parcel.writeString(this.f6560b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeValue(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.f6561k);
        parcel.writeString(this.l);
    }

    public GeocodeAddress() {
    }

    private GeocodeAddress(Parcel parcel) {
        this.f6559a = parcel.readString();
        this.f6560b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.j = parcel.readString();
        this.f6561k = parcel.readString();
        this.l = parcel.readString();
    }
}
