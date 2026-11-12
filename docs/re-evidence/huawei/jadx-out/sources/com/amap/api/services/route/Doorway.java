package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class Doorway implements Parcelable {
    public static final Parcelable.Creator<Doorway> CREATOR = new Parcelable.Creator<Doorway>() { // from class: com.amap.api.services.route.Doorway.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Doorway[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Doorway createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static Doorway a(Parcel parcel) {
            return new Doorway(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f3700b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.f3699a;
    }

    public void setName(String str) {
        this.f3699a = str;
    }

    public LatLonPoint getLatLonPoint() {
        return this.f3700b;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f3700b = latLonPoint;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3699a);
        parcel.writeParcelable(this.f3700b, i);
    }

    public Doorway(Parcel parcel) {
        this.f3699a = parcel.readString();
        this.f3700b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    public Doorway() {
    }
}
