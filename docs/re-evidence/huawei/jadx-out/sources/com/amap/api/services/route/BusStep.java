package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BusStep implements Parcelable {
    public static final Parcelable.Creator<BusStep> CREATOR = new Parcelable.Creator<BusStep>() { // from class: com.amap.api.services.route.BusStep.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusStep[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusStep createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static BusStep a(Parcel parcel) {
            return new BusStep(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RouteBusWalkItem f3676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<RouteBusLineItem> f3677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Doorway f3678c;
    private Doorway d;
    private RouteRailwayItem e;
    private TaxiItem f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteBusWalkItem getWalk() {
        return this.f3676a;
    }

    public void setWalk(RouteBusWalkItem routeBusWalkItem) {
        this.f3676a = routeBusWalkItem;
    }

    @Deprecated
    public RouteBusLineItem getBusLine() {
        List<RouteBusLineItem> list = this.f3677b;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.f3677b.get(0);
    }

    public List<RouteBusLineItem> getBusLines() {
        return this.f3677b;
    }

    @Deprecated
    public void setBusLine(RouteBusLineItem routeBusLineItem) {
        List<RouteBusLineItem> list = this.f3677b;
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            this.f3677b.add(routeBusLineItem);
        }
        this.f3677b.set(0, routeBusLineItem);
    }

    public void setBusLines(List<RouteBusLineItem> list) {
        this.f3677b = list;
    }

    public Doorway getEntrance() {
        return this.f3678c;
    }

    public void setEntrance(Doorway doorway) {
        this.f3678c = doorway;
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

    public TaxiItem getTaxi() {
        return this.f;
    }

    public void setTaxi(TaxiItem taxiItem) {
        this.f = taxiItem;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3676a, i);
        parcel.writeTypedList(this.f3677b);
        parcel.writeParcelable(this.f3678c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }

    public BusStep(Parcel parcel) {
        this.f3677b = new ArrayList();
        this.f3676a = (RouteBusWalkItem) parcel.readParcelable(RouteBusWalkItem.class.getClassLoader());
        this.f3677b = parcel.createTypedArrayList(RouteBusLineItem.CREATOR);
        this.f3678c = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.d = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.e = (RouteRailwayItem) parcel.readParcelable(RouteRailwayItem.class.getClassLoader());
        this.f = (TaxiItem) parcel.readParcelable(TaxiItem.class.getClassLoader());
    }

    public BusStep() {
        this.f3677b = new ArrayList();
    }
}
