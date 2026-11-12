package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TaxiItemV2 implements Parcelable {
    public static final Parcelable.Creator<TaxiItemV2> CREATOR = new Parcelable.Creator<TaxiItemV2>() { // from class: com.amap.api.services.route.TaxiItemV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TaxiItemV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TaxiItemV2[] newArray(int i) {
            return a(i);
        }

        private static TaxiItemV2 a(Parcel parcel) {
            return new TaxiItemV2(parcel);
        }

        private static TaxiItemV2[] a(int i) {
            return new TaxiItemV2[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLonPoint f3832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f3833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3834c;
    private float d;
    private String e;
    private String f;
    private float g;
    private List<LatLonPoint> h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TaxiItemV2() {
        this.h = new ArrayList();
    }

    public LatLonPoint getOrigin() {
        return this.f3832a;
    }

    public LatLonPoint getDestination() {
        return this.f3833b;
    }

    public float getDistance() {
        return this.f3834c;
    }

    public float getDuration() {
        return this.d;
    }

    public String getmSname() {
        return this.e;
    }

    public String getmTname() {
        return this.f;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.f3832a = latLonPoint;
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.f3833b = latLonPoint;
    }

    public void setDistance(float f) {
        this.f3834c = f;
    }

    public void setDuration(float f) {
        this.d = f;
    }

    public void setSname(String str) {
        this.e = str;
    }

    public void setTname(String str) {
        this.f = str;
    }

    public float getPrice() {
        return this.g;
    }

    public void setPrice(float f) {
        this.g = f;
    }

    public List<LatLonPoint> getPolyline() {
        return this.h;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.h = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3832a, i);
        parcel.writeParcelable(this.f3833b, i);
        parcel.writeFloat(this.f3834c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeFloat(this.g);
        parcel.writeTypedList(this.h);
    }

    protected TaxiItemV2(Parcel parcel) {
        this.h = new ArrayList();
        this.f3832a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f3833b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f3834c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readFloat();
        this.h = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }
}
