package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BusRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<BusRouteResultV2> CREATOR = new Parcelable.Creator<BusRouteResultV2>() { // from class: com.amap.api.services.route.BusRouteResultV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusRouteResultV2[] newArray(int i) {
            return a(i);
        }

        private static BusRouteResultV2 a(Parcel parcel) {
            return new BusRouteResultV2(parcel);
        }

        private static BusRouteResultV2[] a(int i) {
            return new BusRouteResultV2[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<BusPathV2> f3674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearchV2.BusRouteQuery f3675c;
    private float d;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getTaxiCost() {
        return this.f3673a;
    }

    public void setTaxiCost(float f) {
        this.f3673a = f;
    }

    public List<BusPathV2> getPaths() {
        return this.f3674b;
    }

    public void setPaths(List<BusPathV2> list) {
        this.f3674b = list;
    }

    public RouteSearchV2.BusRouteQuery getBusQuery() {
        return this.f3675c;
    }

    public void setBusQuery(RouteSearchV2.BusRouteQuery busRouteQuery) {
        this.f3675c = busRouteQuery;
    }

    public float getDistance() {
        return this.d;
    }

    public void setDistance(float f) {
        this.d = f;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f3673a);
        parcel.writeTypedList(this.f3674b);
        parcel.writeParcelable(this.f3675c, i);
        parcel.writeFloat(this.d);
    }

    public BusRouteResultV2(Parcel parcel) {
        super(parcel);
        this.f3674b = new ArrayList();
        this.f3673a = parcel.readFloat();
        this.f3674b = parcel.createTypedArrayList(BusPathV2.CREATOR);
        this.f3675c = (RouteSearchV2.BusRouteQuery) parcel.readParcelable(RouteSearchV2.BusRouteQuery.class.getClassLoader());
        this.d = parcel.readFloat();
    }

    public BusRouteResultV2() {
        this.f3674b = new ArrayList();
    }
}
