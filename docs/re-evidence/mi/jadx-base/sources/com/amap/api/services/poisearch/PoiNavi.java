package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class PoiNavi implements Parcelable {
    public static final Parcelable.Creator<PoiNavi> CREATOR = new Parcelable.Creator<PoiNavi>() { // from class: com.amap.api.services.poisearch.PoiNavi.1
        private static PoiNavi a(Parcel parcel) {
            return new PoiNavi(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiNavi createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PoiNavi[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f6607b;
    private LatLonPoint c;
    private String d;

    public PoiNavi() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getEnter() {
        return this.f6607b;
    }

    public LatLonPoint getExit() {
        return this.c;
    }

    public String getGridCode() {
        return this.d;
    }

    public String getNaviPoiID() {
        return this.f6606a;
    }

    public void setEnter(LatLonPoint latLonPoint) {
        this.f6607b = latLonPoint;
    }

    public void setExit(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setGridCode(String str) {
        this.d = str;
    }

    public void setNaviPoiID(String str) {
        this.f6606a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6606a);
        parcel.writeValue(this.f6607b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
    }

    public PoiNavi(String str, LatLonPoint latLonPoint, LatLonPoint latLonPoint2, String str2) {
        this.f6606a = str;
        this.f6607b = latLonPoint;
        this.c = latLonPoint2;
        this.d = str2;
    }

    public PoiNavi(Parcel parcel) {
        this.f6606a = parcel.readString();
        this.f6607b = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
    }
}
