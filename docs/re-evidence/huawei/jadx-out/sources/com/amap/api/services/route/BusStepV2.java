package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BusStepV2 implements Parcelable {
    public static final Parcelable.Creator<BusStepV2> CREATOR = new Parcelable.Creator<BusStepV2>() { // from class: com.amap.api.services.route.BusStepV2.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusStepV2[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusStepV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static BusStepV2 a(Parcel parcel) {
            return new BusStepV2(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RouteBusWalkItem f3679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<RouteBusLineItem> f3680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Doorway f3681c;
    private Doorway d;
    private RouteRailwayItem e;
    private TaxiItemV2 f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteBusWalkItem getWalk() {
        return this.f3679a;
    }

    public void setWalk(RouteBusWalkItem routeBusWalkItem) {
        this.f3679a = routeBusWalkItem;
    }

    @Deprecated
    public RouteBusLineItem getBusLine() {
        List<RouteBusLineItem> list = this.f3680b;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.f3680b.get(0);
    }

    public List<RouteBusLineItem> getBusLines() {
        return this.f3680b;
    }

    @Deprecated
    public void setBusLine(RouteBusLineItem routeBusLineItem) {
        List<RouteBusLineItem> list = this.f3680b;
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            this.f3680b.add(routeBusLineItem);
        }
        this.f3680b.set(0, routeBusLineItem);
    }

    public void setBusLines(List<RouteBusLineItem> list) {
        this.f3680b = list;
    }

    public Doorway getEntrance() {
        return this.f3681c;
    }

    public void setEntrance(Doorway doorway) {
        this.f3681c = doorway;
    }

    public Doorway getExit() {
        return this.d;
    }

    public void setExit(Doorway doorway) {
        this.d = doorway;
    }

    public RouteRailwayItem getRailway() {
        return this.e;
    }

    public void setRailway(RouteRailwayItem routeRailwayItem) {
        this.e = routeRailwayItem;
    }

    public TaxiItemV2 getTaxi() {
        return this.f;
    }

    public void setTaxi(TaxiItemV2 taxiItemV2) {
        this.f = taxiItemV2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3679a, i);
        parcel.writeTypedList(this.f3680b);
        parcel.writeParcelable(this.f3681c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }

    public BusStepV2(Parcel parcel) {
        this.f3680b = new ArrayList();
        this.f3679a = (RouteBusWalkItem) parcel.readParcelable(RouteBusWalkItem.class.getClassLoader());
        this.f3680b = parcel.createTypedArrayList(RouteBusLineItem.CREATOR);
        this.f3681c = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.d = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.e = (RouteRailwayItem) parcel.readParcelable(RouteRailwayItem.class.getClassLoader());
        this.f = (TaxiItemV2) parcel.readParcelable(TaxiItem.class.getClassLoader());
    }

    public BusStepV2() {
        this.f3680b = new ArrayList();
    }
}
