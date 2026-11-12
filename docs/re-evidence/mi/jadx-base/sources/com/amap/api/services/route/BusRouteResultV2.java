package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BusRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<BusRouteResultV2> CREATOR = new Parcelable.Creator<BusRouteResultV2>() { // from class: com.amap.api.services.route.BusRouteResultV2.1
        private static BusRouteResultV2 a(Parcel parcel) {
            return new BusRouteResultV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusRouteResultV2[] newArray(int i) {
            return a(i);
        }

        private static BusRouteResultV2[] a(int i) {
            return new BusRouteResultV2[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<BusPathV2> f6641b;
    private RouteSearchV2.BusRouteQuery c;
    private float d;

    public BusRouteResultV2(Parcel parcel) {
        super(parcel);
        this.f6641b = new ArrayList();
        this.f6640a = parcel.readFloat();
        this.f6641b = parcel.createTypedArrayList(BusPathV2.CREATOR);
        this.c = (RouteSearchV2.BusRouteQuery) parcel.readParcelable(RouteSearchV2.BusRouteQuery.class.getClassLoader());
        this.d = parcel.readFloat();
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearchV2.BusRouteQuery getBusQuery() {
        return this.c;
    }

    public float getDistance() {
        return this.d;
    }

    public List<BusPathV2> getPaths() {
        return this.f6641b;
    }

    public float getTaxiCost() {
        return this.f6640a;
    }

    public void setBusQuery(RouteSearchV2.BusRouteQuery busRouteQuery) {
        this.c = busRouteQuery;
    }

    public void setDistance(float f) {
        this.d = f;
    }

    public void setPaths(List<BusPathV2> list) {
        this.f6641b = list;
    }

    public void setTaxiCost(float f) {
        this.f6640a = f;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f6640a);
        parcel.writeTypedList(this.f6641b);
        parcel.writeParcelable(this.c, i);
        parcel.writeFloat(this.d);
    }

    public BusRouteResultV2() {
        this.f6641b = new ArrayList();
    }
}
