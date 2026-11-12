package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BusRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<BusRouteResult> CREATOR = new Parcelable.Creator<BusRouteResult>() { // from class: com.amap.api.services.route.BusRouteResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusRouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusRouteResult[] newArray(int i) {
            return a(i);
        }

        private static BusRouteResult a(Parcel parcel) {
            return new BusRouteResult(parcel);
        }

        private static BusRouteResult[] a(int i) {
            return new BusRouteResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<BusPath> f3671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearch.BusRouteQuery f3672c;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getTaxiCost() {
        return this.f3670a;
    }

    public void setTaxiCost(float f) {
        this.f3670a = f;
    }

    public List<BusPath> getPaths() {
        return this.f3671b;
    }

    public void setPaths(List<BusPath> list) {
        this.f3671b = list;
    }

    public RouteSearch.BusRouteQuery getBusQuery() {
        return this.f3672c;
    }

    public void setBusQuery(RouteSearch.BusRouteQuery busRouteQuery) {
        this.f3672c = busRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f3670a);
        parcel.writeTypedList(this.f3671b);
        parcel.writeParcelable(this.f3672c, i);
    }

    public BusRouteResult(Parcel parcel) {
        super(parcel);
        this.f3671b = new ArrayList();
        this.f3670a = parcel.readFloat();
        this.f3671b = parcel.createTypedArrayList(BusPath.CREATOR);
        this.f3672c = (RouteSearch.BusRouteQuery) parcel.readParcelable(RouteSearch.BusRouteQuery.class.getClassLoader());
    }

    public BusRouteResult() {
        this.f3671b = new ArrayList();
    }
}
