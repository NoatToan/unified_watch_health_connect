package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class LatLonSharePoint extends LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonSharePoint> CREATOR = new Parcelable.Creator<LatLonSharePoint>() { // from class: com.amap.api.services.core.LatLonSharePoint.1
        private static LatLonSharePoint a(Parcel parcel) {
            return new LatLonSharePoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonSharePoint createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonSharePoint[] newArray(int i) {
            return a(i);
        }

        private static LatLonSharePoint[] a(int i) {
            return new LatLonSharePoint[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6535a;

    public LatLonSharePoint(double d, double d2, String str) {
        super(d, d2);
        this.f6535a = str;
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        LatLonSharePoint latLonSharePoint = (LatLonSharePoint) obj;
        String str = this.f6535a;
        if (str == null) {
            if (latLonSharePoint.f6535a != null) {
                return false;
            }
        } else if (!str.equals(latLonSharePoint.f6535a)) {
            return false;
        }
        return true;
    }

    public String getSharePointName() {
        return this.f6535a;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f6535a;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public void setSharePointName(String str) {
        this.f6535a = str;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public String toString() {
        return super.toString() + "," + this.f6535a;
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f6535a);
    }

    public LatLonSharePoint(Parcel parcel) {
        super(parcel);
        this.f6535a = parcel.readString();
    }
}
