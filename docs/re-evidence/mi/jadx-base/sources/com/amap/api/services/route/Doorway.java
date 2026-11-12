package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class Doorway implements Parcelable {
    public static final Parcelable.Creator<Doorway> CREATOR = new Parcelable.Creator<Doorway>() { // from class: com.amap.api.services.route.Doorway.1
        private static Doorway a(Parcel parcel) {
            return new Doorway(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Doorway createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Doorway[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f6661b;

    public Doorway(Parcel parcel) {
        this.f6660a = parcel.readString();
        this.f6661b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getLatLonPoint() {
        return this.f6661b;
    }

    public String getName() {
        return this.f6660a;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f6661b = latLonPoint;
    }

    public void setName(String str) {
        this.f6660a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6660a);
        parcel.writeParcelable(this.f6661b, i);
    }

    public Doorway() {
    }
}
