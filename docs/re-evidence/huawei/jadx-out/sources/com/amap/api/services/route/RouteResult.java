package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class RouteResult implements Parcelable {
    public static final Parcelable.Creator<RouteResult> CREATOR = new Parcelable.Creator<RouteResult>() { // from class: com.amap.api.services.route.RouteResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteResult[] newArray(int i) {
            return a(i);
        }

        private static RouteResult a(Parcel parcel) {
            return new RouteResult(parcel);
        }

        private static RouteResult[] a(int i) {
            return new RouteResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLonPoint f3762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f3763b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getStartPos() {
        return this.f3762a;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f3762a = latLonPoint;
    }

    public LatLonPoint getTargetPos() {
        return this.f3763b;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.f3763b = latLonPoint;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3762a, i);
        parcel.writeParcelable(this.f3763b, i);
    }

    public RouteResult(Parcel parcel) {
        this.f3762a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f3763b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    public RouteResult() {
    }
}
