package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class RailwayStationItem implements Parcelable {
    public static final Parcelable.Creator<RailwayStationItem> CREATOR = new Parcelable.Creator<RailwayStationItem>() { // from class: com.amap.api.services.route.RailwayStationItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RailwayStationItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RailwayStationItem[] newArray(int i) {
            return a(i);
        }

        private static RailwayStationItem a(Parcel parcel) {
            return new RailwayStationItem(parcel);
        }

        private static RailwayStationItem[] a(int i) {
            return new RailwayStationItem[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f3743c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private float h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RailwayStationItem() {
        this.f = false;
        this.g = false;
    }

    public String getID() {
        return this.f3741a;
    }

    public String getName() {
        return this.f3742b;
    }

    public LatLonPoint getLocation() {
        return this.f3743c;
    }

    public String getAdcode() {
        return this.d;
    }

    public String getTime() {
        return this.e;
    }

    public boolean isStart() {
        return this.f;
    }

    public boolean isEnd() {
        return this.g;
    }

    public float getWait() {
        return this.h;
    }

    public void setID(String str) {
        this.f3741a = str;
    }

    public void setName(String str) {
        this.f3742b = str;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.f3743c = latLonPoint;
    }

    public void setAdcode(String str) {
        this.d = str;
    }

    public void setTime(String str) {
        this.e = str;
    }

    public void setisStart(boolean z) {
        this.f = z;
    }

    public void setisEnd(boolean z) {
        this.g = z;
    }

    public void setWait(float f) {
        this.h = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3741a);
        parcel.writeString(this.f3742b);
        parcel.writeParcelable(this.f3743c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeBooleanArray(new boolean[]{this.f, this.g});
        parcel.writeFloat(this.h);
    }

    protected RailwayStationItem(Parcel parcel) {
        this.f = false;
        this.g = false;
        this.f3741a = parcel.readString();
        this.f3742b = parcel.readString();
        this.f3743c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readString();
        boolean[] zArr = new boolean[2];
        parcel.readBooleanArray(zArr);
        this.f = zArr[0];
        this.g = zArr[1];
        this.h = parcel.readFloat();
    }
}
