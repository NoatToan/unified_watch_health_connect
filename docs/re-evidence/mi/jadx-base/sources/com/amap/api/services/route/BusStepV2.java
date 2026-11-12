package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BusStepV2 implements Parcelable {
    public static final Parcelable.Creator<BusStepV2> CREATOR = new Parcelable.Creator<BusStepV2>() { // from class: com.amap.api.services.route.BusStepV2.1
        private static BusStepV2 a(Parcel parcel) {
            return new BusStepV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusStepV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusStepV2[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RouteBusWalkItem f6644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<RouteBusLineItem> f6645b;
    private Doorway c;
    private Doorway d;
    private RouteRailwayItem e;
    private TaxiItemV2 f;

    public BusStepV2(Parcel parcel) {
        this.f6645b = new ArrayList();
        this.f6644a = (RouteBusWalkItem) parcel.readParcelable(RouteBusWalkItem.class.getClassLoader());
        this.f6645b = parcel.createTypedArrayList(RouteBusLineItem.CREATOR);
        this.c = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.d = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.e = (RouteRailwayItem) parcel.readParcelable(RouteRailwayItem.class.getClassLoader());
        this.f = (TaxiItemV2) parcel.readParcelable(TaxiItem.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public RouteBusLineItem getBusLine() {
        List<RouteBusLineItem> list = this.f6645b;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.f6645b.get(0);
    }

    public List<RouteBusLineItem> getBusLines() {
        return this.f6645b;
    }

    public Doorway getEntrance() {
        return this.c;
    }

    public Doorway getExit() {
        return this.d;
    }

    public RouteRailwayItem getRailway() {
        return this.e;
    }

    public TaxiItemV2 getTaxi() {
        return this.f;
    }

    public RouteBusWalkItem getWalk() {
        return this.f6644a;
    }

    @Deprecated
    public void setBusLine(RouteBusLineItem routeBusLineItem) {
        List<RouteBusLineItem> list = this.f6645b;
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            this.f6645b.add(routeBusLineItem);
        }
        this.f6645b.set(0, routeBusLineItem);
    }

    public void setBusLines(List<RouteBusLineItem> list) {
        this.f6645b = list;
    }

    public void setEntrance(Doorway doorway) {
        this.c = doorway;
    }

    public void setExit(Doorway doorway) {
        this.d = doorway;
    }

    public void setRailway(RouteRailwayItem routeRailwayItem) {
        this.e = routeRailwayItem;
    }

    public void setTaxi(TaxiItemV2 taxiItemV2) {
        this.f = taxiItemV2;
    }

    public void setWalk(RouteBusWalkItem routeBusWalkItem) {
        this.f6644a = routeBusWalkItem;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6644a, i);
        parcel.writeTypedList(this.f6645b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }

    public BusStepV2() {
        this.f6645b = new ArrayList();
    }
}
