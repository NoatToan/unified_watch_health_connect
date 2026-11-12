package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class SubPoiItem implements Parcelable {
    public static final Parcelable.Creator<SubPoiItem> CREATOR = new Parcelable.Creator<SubPoiItem>() { // from class: com.amap.api.services.poisearch.SubPoiItem.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SubPoiItem[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SubPoiItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static SubPoiItem a(Parcel parcel) {
            return new SubPoiItem(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3654c;
    private int d;
    private LatLonPoint e;
    private String f;
    private String g;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SubPoiItem(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f3652a = str;
        this.e = latLonPoint;
        this.f3653b = str2;
        this.f = str3;
    }

    public SubPoiItem(Parcel parcel) {
        this.f3652a = parcel.readString();
        this.f3653b = parcel.readString();
        this.f3654c = parcel.readString();
        this.d = parcel.readInt();
        this.e = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public String getPoiId() {
        return this.f3652a;
    }

    public void setPoiId(String str) {
        this.f3652a = str;
    }

    public String getTitle() {
        return this.f3653b;
    }

    public void setTitle(String str) {
        this.f3653b = str;
    }

    public String getSubName() {
        return this.f3654c;
    }

    public void setSubName(String str) {
        this.f3654c = str;
    }

    public int getDistance() {
        return this.d;
    }

    public void setDistance(int i) {
        this.d = i;
    }

    public LatLonPoint getLatLonPoint() {
        return this.e;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.e = latLonPoint;
    }

    public String getSnippet() {
        return this.f;
    }

    public void setSnippet(String str) {
        this.f = str;
    }

    public String getSubTypeDes() {
        return this.g;
    }

    public void setSubTypeDes(String str) {
        this.g = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3652a);
        parcel.writeString(this.f3653b);
        parcel.writeString(this.f3654c);
        parcel.writeInt(this.d);
        parcel.writeValue(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
