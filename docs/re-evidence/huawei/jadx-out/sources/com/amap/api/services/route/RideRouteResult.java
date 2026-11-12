package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RideRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<RideRouteResult> CREATOR = new Parcelable.Creator<RideRouteResult>() { // from class: com.amap.api.services.route.RideRouteResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResult[] newArray(int i) {
            return a(i);
        }

        private static RideRouteResult a(Parcel parcel) {
            return new RideRouteResult(parcel);
        }

        private static RideRouteResult[] a(int i) {
            return new RideRouteResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<RidePath> f3745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RouteSearch.RideRouteQuery f3746b;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RidePath> getPaths() {
        return this.f3745a;
    }

    public void setPaths(List<RidePath> list) {
        this.f3745a = list;
    }

    public RouteSearch.RideRouteQuery getRideQuery() {
        return this.f3746b;
    }

    public void setRideQuery(RouteSearch.RideRouteQuery rideRouteQuery) {
        this.f3746b = rideRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f3745a);
        parcel.writeParcelable(this.f3746b, i);
    }

    public RideRouteResult(Parcel parcel) {
        super(parcel);
        this.f3745a = new ArrayList();
        this.f3745a = parcel.createTypedArrayList(RidePath.CREATOR);
        this.f3746b = (RouteSearch.RideRouteQuery) parcel.readParcelable(RouteSearch.RideRouteQuery.class.getClassLoader());
    }

    public RideRouteResult() {
        this.f3745a = new ArrayList();
    }
}
