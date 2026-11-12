package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes21.dex */
public class AoiItem implements Parcelable {
    public static final Parcelable.Creator<AoiItem> CREATOR = new Parcelable.Creator<AoiItem>() { // from class: com.amap.api.services.geocoder.AoiItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AoiItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AoiItem[] newArray(int i) {
            return a(i);
        }

        private static AoiItem a(Parcel parcel) {
            return new AoiItem(parcel);
        }

        private static AoiItem[] a(int i) {
            return new AoiItem[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3566c;
    private LatLonPoint d;
    private Float e;
    private float f;
    private String g;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AoiItem() {
    }

    public String getAoiId() {
        return this.f3564a;
    }

    public String getAoiName() {
        return this.f3565b;
    }

    public String getAdCode() {
        return this.f3566c;
    }

    public LatLonPoint getAoiCenterPoint() {
        return this.d;
    }

    public Float getAoiArea() {
        return this.e;
    }

    public void setId(String str) {
        this.f3564a = str;
    }

    public void setName(String str) {
        this.f3565b = str;
    }

    public void setAdcode(String str) {
        this.f3566c = str;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.d = latLonPoint;
    }

    public void setArea(Float f) {
        this.e = f;
    }

    public float getDistance() {
        return this.f;
    }

    public void setDistance(float f) {
        this.f = f;
    }

    public String getType() {
        return this.g;
    }

    public void setType(String str) {
        this.g = str;
    }

    public AoiItem(Parcel parcel) {
        this.f3564a = parcel.readString();
        this.f3565b = parcel.readString();
        this.f3566c = parcel.readString();
        this.d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.e = Float.valueOf(parcel.readFloat());
        this.f = parcel.readFloat();
        this.g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3564a);
        parcel.writeString(this.f3565b);
        parcel.writeString(this.f3566c);
        parcel.writeParcelable(this.d, i);
        parcel.writeFloat(this.e.floatValue());
        parcel.writeFloat(this.f);
        parcel.writeString(this.g);
    }
}
