package com.amap.api.services.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class Tip implements Parcelable {
    public static final Parcelable.Creator<Tip> CREATOR = new Parcelable.Creator<Tip>() { // from class: com.amap.api.services.help.Tip.1
        private static Tip a(Parcel parcel) {
            return new Tip(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Tip createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Tip[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f6583b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public /* synthetic */ Tip(Parcel parcel, byte b2) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.e;
    }

    public String getAddress() {
        return this.f;
    }

    public String getDistrict() {
        return this.d;
    }

    public String getName() {
        return this.c;
    }

    public String getPoiID() {
        return this.f6582a;
    }

    public LatLonPoint getPoint() {
        return this.f6583b;
    }

    public String getTypeCode() {
        return this.g;
    }

    public void setAdcode(String str) {
        this.e = str;
    }

    public void setAddress(String str) {
        this.f = str;
    }

    public void setDistrict(String str) {
        this.d = str;
    }

    public void setID(String str) {
        this.f6582a = str;
    }

    public void setName(String str) {
        this.c = str;
    }

    public void setPostion(LatLonPoint latLonPoint) {
        this.f6583b = latLonPoint;
    }

    public void setTypeCode(String str) {
        this.g = str;
    }

    public String toString() {
        return "name:" + this.c + " district:" + this.d + " adcode:" + this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.d);
        parcel.writeString(this.f6582a);
        parcel.writeValue(this.f6583b);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public Tip() {
        this.h = "";
    }

    private Tip(Parcel parcel) {
        this.h = "";
        this.c = parcel.readString();
        this.e = parcel.readString();
        this.d = parcel.readString();
        this.f6582a = parcel.readString();
        this.f6583b = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
    }
}
