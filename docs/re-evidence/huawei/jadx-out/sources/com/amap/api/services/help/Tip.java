package com.amap.api.services.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes21.dex */
public class Tip implements Parcelable {
    public static final Parcelable.Creator<Tip> CREATOR = new Parcelable.Creator<Tip>() { // from class: com.amap.api.services.help.Tip.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Tip[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Tip createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static Tip a(Parcel parcel) {
            return new Tip(parcel, (byte) 0);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f3597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3598c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ Tip(Parcel parcel, byte b2) {
        this(parcel);
    }

    public Tip() {
        this.h = "";
    }

    public String getPoiID() {
        return this.f3596a;
    }

    public void setID(String str) {
        this.f3596a = str;
    }

    public LatLonPoint getPoint() {
        return this.f3597b;
    }

    public void setPostion(LatLonPoint latLonPoint) {
        this.f3597b = latLonPoint;
    }

    public String getName() {
        return this.f3598c;
    }

    public void setName(String str) {
        this.f3598c = str;
    }

    public String getDistrict() {
        return this.d;
    }

    public void setDistrict(String str) {
        this.d = str;
    }

    public String getAdcode() {
        return this.e;
    }

    public void setAdcode(String str) {
        this.e = str;
    }

    public String getAddress() {
        return this.f;
    }

    public void setAddress(String str) {
        this.f = str;
    }

    public void setTypeCode(String str) {
        this.g = str;
    }

    public String getTypeCode() {
        return this.g;
    }

    public String toString() {
        return "name:" + this.f3598c + " district:" + this.d + " adcode:" + this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3598c);
        parcel.writeString(this.e);
        parcel.writeString(this.d);
        parcel.writeString(this.f3596a);
        parcel.writeValue(this.f3597b);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    private Tip(Parcel parcel) {
        this.h = "";
        this.f3598c = parcel.readString();
        this.e = parcel.readString();
        this.d = parcel.readString();
        this.f3596a = parcel.readString();
        this.f3597b = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
    }
}
