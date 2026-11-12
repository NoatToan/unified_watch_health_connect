package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class SubPoiItemV2 implements Parcelable {
    public static final Parcelable.Creator<SubPoiItemV2> CREATOR = new Parcelable.Creator<SubPoiItemV2>() { // from class: com.amap.api.services.poisearch.SubPoiItemV2.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SubPoiItemV2[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SubPoiItemV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static SubPoiItemV2 a(Parcel parcel) {
            return new SubPoiItemV2(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f3657c;
    private String d;
    private String e;
    private String f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SubPoiItemV2(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f3655a = str;
        this.f3657c = latLonPoint;
        this.f3656b = str2;
        this.d = str3;
    }

    public SubPoiItemV2(Parcel parcel) {
        this.f3655a = parcel.readString();
        this.f3656b = parcel.readString();
        this.f3657c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }

    public String getPoiId() {
        return this.f3655a;
    }

    public void setPoiId(String str) {
        this.f3655a = str;
    }

    public String getTitle() {
        return this.f3656b;
    }

    public void setTitle(String str) {
        this.f3656b = str;
    }

    public LatLonPoint getLatLonPoint() {
        return this.f3657c;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f3657c = latLonPoint;
    }

    public String getSnippet() {
        return this.d;
    }

    public void setSnippet(String str) {
        this.d = str;
    }

    public String getSubTypeDes() {
        return this.e;
    }

    public void setSubTypeDes(String str) {
        this.e = str;
    }

    public String getTypeCode() {
        return this.f;
    }

    public void setTypeCode(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3655a);
        parcel.writeString(this.f3656b);
        parcel.writeValue(this.f3657c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
