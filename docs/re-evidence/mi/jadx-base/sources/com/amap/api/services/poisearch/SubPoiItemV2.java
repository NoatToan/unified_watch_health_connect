package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class SubPoiItemV2 implements Parcelable {
    public static final Parcelable.Creator<SubPoiItemV2> CREATOR = new Parcelable.Creator<SubPoiItemV2>() { // from class: com.amap.api.services.poisearch.SubPoiItemV2.1
        private static SubPoiItemV2 a(Parcel parcel) {
            return new SubPoiItemV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SubPoiItemV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SubPoiItemV2[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6629b;
    private LatLonPoint c;
    private String d;
    private String e;
    private String f;

    public SubPoiItemV2(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f6628a = str;
        this.c = latLonPoint;
        this.f6629b = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getLatLonPoint() {
        return this.c;
    }

    public String getPoiId() {
        return this.f6628a;
    }

    public String getSnippet() {
        return this.d;
    }

    public String getSubTypeDes() {
        return this.e;
    }

    public String getTitle() {
        return this.f6629b;
    }

    public String getTypeCode() {
        return this.f;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setPoiId(String str) {
        this.f6628a = str;
    }

    public void setSnippet(String str) {
        this.d = str;
    }

    public void setSubTypeDes(String str) {
        this.e = str;
    }

    public void setTitle(String str) {
        this.f6629b = str;
    }

    public void setTypeCode(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6628a);
        parcel.writeString(this.f6629b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public SubPoiItemV2(Parcel parcel) {
        this.f6628a = parcel.readString();
        this.f6629b = parcel.readString();
        this.c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
}
