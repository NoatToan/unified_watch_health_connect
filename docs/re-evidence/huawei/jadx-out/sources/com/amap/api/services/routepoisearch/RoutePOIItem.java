package com.amap.api.services.routepoisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes21.dex */
public class RoutePOIItem implements Parcelable {
    public static final Parcelable.Creator<RoutePOIItem> CREATOR = new Parcelable.Creator<RoutePOIItem>() { // from class: com.amap.api.services.routepoisearch.RoutePOIItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoutePOIItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoutePOIItem[] newArray(int i) {
            return a(i);
        }

        private static RoutePOIItem a(Parcel parcel) {
            return new RoutePOIItem(parcel);
        }

        private static RoutePOIItem[] a(int i) {
            return new RoutePOIItem[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f3859c;
    private float d;
    private float e;
    private String f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RoutePOIItem() {
    }

    public String getID() {
        return this.f3857a;
    }

    public void setID(String str) {
        this.f3857a = str;
    }

    public String getTitle() {
        return this.f3858b;
    }

    public void setTitle(String str) {
        this.f3858b = str;
    }

    public LatLonPoint getPoint() {
        return this.f3859c;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f3859c = latLonPoint;
    }

    public float getDistance() {
        return this.d;
    }

    public void setDistance(float f) {
        this.d = f;
    }

    public float getDuration() {
        return this.e;
    }

    public void setDuration(float f) {
        this.e = f;
    }

    public String getCPID() {
        return this.f;
    }

    public void setCPID(String str) {
        this.f = str;
    }

    protected RoutePOIItem(Parcel parcel) {
        this.f3857a = parcel.readString();
        this.f3858b = parcel.readString();
        this.f3859c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3857a);
        parcel.writeString(this.f3858b);
        parcel.writeParcelable(this.f3859c, i);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeString(this.f);
    }
}
