package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class PoiNavi implements Parcelable {
    public static final Parcelable.Creator<PoiNavi> CREATOR = new Parcelable.Creator<PoiNavi>() { // from class: com.amap.api.services.poisearch.PoiNavi.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PoiNavi[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiNavi createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static PoiNavi a(Parcel parcel) {
            return new PoiNavi(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f3628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f3629c;
    private String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PoiNavi() {
    }

    public PoiNavi(String str, LatLonPoint latLonPoint, LatLonPoint latLonPoint2, String str2) {
        this.f3627a = str;
        this.f3628b = latLonPoint;
        this.f3629c = latLonPoint2;
        this.d = str2;
    }

    public String getNaviPoiID() {
        return this.f3627a;
    }

    public void setNaviPoiID(String str) {
        this.f3627a = str;
    }

    public LatLonPoint getEnter() {
        return this.f3628b;
    }

    public void setEnter(LatLonPoint latLonPoint) {
        this.f3628b = latLonPoint;
    }

    public LatLonPoint getExit() {
        return this.f3629c;
    }

    public void setExit(LatLonPoint latLonPoint) {
        this.f3629c = latLonPoint;
    }

    public String getGridCode() {
        return this.d;
    }

    public void setGridCode(String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3627a);
        parcel.writeValue(this.f3628b);
        parcel.writeValue(this.f3629c);
        parcel.writeString(this.d);
    }

    public PoiNavi(Parcel parcel) {
        this.f3627a = parcel.readString();
        this.f3628b = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f3629c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
    }
}
