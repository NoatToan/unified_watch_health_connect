package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class RoutePlanResult implements Parcelable {
    public static final Parcelable.Creator<RoutePlanResult> CREATOR = new Parcelable.Creator<RoutePlanResult>() { // from class: com.amap.api.services.route.RoutePlanResult.1
        private static RoutePlanResult a(Parcel parcel) {
            return new RoutePlanResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoutePlanResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoutePlanResult[] newArray(int i) {
            return a(i);
        }

        private static RoutePlanResult[] a(int i) {
            return new RoutePlanResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLonPoint f6705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f6706b;

    public RoutePlanResult(Parcel parcel) {
        this.f6705a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f6706b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getStartPos() {
        return this.f6705a;
    }

    public LatLonPoint getTargetPos() {
        return this.f6706b;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f6705a = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.f6706b = latLonPoint;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6705a, i);
        parcel.writeParcelable(this.f6706b, i);
    }

    public RoutePlanResult() {
    }
}
