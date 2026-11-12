package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class LatLonSharePoint extends LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonSharePoint> CREATOR = new Parcelable.Creator<LatLonSharePoint>() { // from class: com.amap.api.services.core.LatLonSharePoint.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonSharePoint createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonSharePoint[] newArray(int i) {
            return a(i);
        }

        private static LatLonSharePoint a(Parcel parcel) {
            return new LatLonSharePoint(parcel);
        }

        private static LatLonSharePoint[] a(int i) {
            return new LatLonSharePoint[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3540a;

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonSharePoint(double d, double d2, String str) {
        super(d, d2);
        this.f3540a = str;
    }

    public String getSharePointName() {
        return this.f3540a;
    }

    public void setSharePointName(String str) {
        this.f3540a = str;
    }

    protected LatLonSharePoint(Parcel parcel) {
        super(parcel);
        this.f3540a = parcel.readString();
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f3540a);
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public int hashCode() {
        int iHashCode = super.hashCode();
        String str = this.f3540a;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
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
        String str = this.f3540a;
        if (str == null) {
            if (latLonSharePoint.f3540a != null) {
                return false;
            }
        } else if (!str.equals(latLonSharePoint.f3540a)) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public String toString() {
        return super.toString() + "," + this.f3540a;
    }
}
