package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RideRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<RideRouteResultV2> CREATOR = new Parcelable.Creator<RideRouteResultV2>() { // from class: com.amap.api.services.route.RideRouteResultV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResultV2[] newArray(int i) {
            return a(i);
        }

        private static RideRouteResultV2 a(Parcel parcel) {
            return new RideRouteResultV2(parcel);
        }

        private static RideRouteResultV2[] a(int i) {
            return new RideRouteResultV2[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<RidePath> f3747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RouteSearchV2.RideRouteQuery f3748b;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RidePath> getPaths() {
        return this.f3747a;
    }

    public void setPaths(List<RidePath> list) {
        this.f3747a = list;
    }

    public RouteSearchV2.RideRouteQuery getRideQuery() {
        return this.f3748b;
    }

    public void setRideQuery(RouteSearchV2.RideRouteQuery rideRouteQuery) {
        this.f3748b = rideRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f3747a);
        parcel.writeParcelable(this.f3748b, i);
    }

    public RideRouteResultV2(Parcel parcel) {
        super(parcel);
        this.f3747a = new ArrayList();
        this.f3747a = parcel.createTypedArrayList(RidePath.CREATOR);
        this.f3748b = (RouteSearchV2.RideRouteQuery) parcel.readParcelable(RouteSearch.RideRouteQuery.class.getClassLoader());
    }

    public RideRouteResultV2() {
        this.f3747a = new ArrayList();
    }
}
