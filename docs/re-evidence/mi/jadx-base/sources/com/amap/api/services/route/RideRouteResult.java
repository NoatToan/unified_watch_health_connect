package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RideRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<RideRouteResult> CREATOR = new Parcelable.Creator<RideRouteResult>() { // from class: com.amap.api.services.route.RideRouteResult.1
        private static RideRouteResult a(Parcel parcel) {
            return new RideRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResult[] newArray(int i) {
            return a(i);
        }

        private static RideRouteResult[] a(int i) {
            return new RideRouteResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<RidePath> f6695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RouteSearch.RideRouteQuery f6696b;

    public RideRouteResult(Parcel parcel) {
        super(parcel);
        this.f6695a = new ArrayList();
        this.f6695a = parcel.createTypedArrayList(RidePath.CREATOR);
        this.f6696b = (RouteSearch.RideRouteQuery) parcel.readParcelable(RouteSearch.RideRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RidePath> getPaths() {
        return this.f6695a;
    }

    public RouteSearch.RideRouteQuery getRideQuery() {
        return this.f6696b;
    }

    public void setPaths(List<RidePath> list) {
        this.f6695a = list;
    }

    public void setRideQuery(RouteSearch.RideRouteQuery rideRouteQuery) {
        this.f6696b = rideRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f6695a);
        parcel.writeParcelable(this.f6696b, i);
    }

    public RideRouteResult() {
        this.f6695a = new ArrayList();
    }
}
