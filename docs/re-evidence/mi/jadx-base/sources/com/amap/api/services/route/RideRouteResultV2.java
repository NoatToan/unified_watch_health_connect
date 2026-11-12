package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RideRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<RideRouteResultV2> CREATOR = new Parcelable.Creator<RideRouteResultV2>() { // from class: com.amap.api.services.route.RideRouteResultV2.1
        private static RideRouteResultV2 a(Parcel parcel) {
            return new RideRouteResultV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResultV2[] newArray(int i) {
            return a(i);
        }

        private static RideRouteResultV2[] a(int i) {
            return new RideRouteResultV2[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<RidePath> f6697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RouteSearchV2.RideRouteQuery f6698b;

    public RideRouteResultV2(Parcel parcel) {
        super(parcel);
        this.f6697a = new ArrayList();
        this.f6697a = parcel.createTypedArrayList(RidePath.CREATOR);
        this.f6698b = (RouteSearchV2.RideRouteQuery) parcel.readParcelable(RouteSearch.RideRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RidePath> getPaths() {
        return this.f6697a;
    }

    public RouteSearchV2.RideRouteQuery getRideQuery() {
        return this.f6698b;
    }

    public void setPaths(List<RidePath> list) {
        this.f6697a = list;
    }

    public void setRideQuery(RouteSearchV2.RideRouteQuery rideRouteQuery) {
        this.f6698b = rideRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f6697a);
        parcel.writeParcelable(this.f6698b, i);
    }

    public RideRouteResultV2() {
        this.f6697a = new ArrayList();
    }
}
