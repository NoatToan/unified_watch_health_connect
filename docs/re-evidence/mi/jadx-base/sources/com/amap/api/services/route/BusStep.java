package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BusStep implements Parcelable {
    public static final Parcelable.Creator<BusStep> CREATOR = new Parcelable.Creator<BusStep>() { // from class: com.amap.api.services.route.BusStep.1
        private static BusStep a(Parcel parcel) {
            return new BusStep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusStep createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusStep[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RouteBusWalkItem f6642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<RouteBusLineItem> f6643b;
    private Doorway c;
    private Doorway d;
    private RouteRailwayItem e;
    private TaxiItem f;

    public BusStep(Parcel parcel) {
        this.f6643b = new ArrayList();
        this.f6642a = (RouteBusWalkItem) parcel.readParcelable(RouteBusWalkItem.class.getClassLoader());
        this.f6643b = parcel.createTypedArrayList(RouteBusLineItem.CREATOR);
        this.c = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.d = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.e = (RouteRailwayItem) parcel.readParcelable(RouteRailwayItem.class.getClassLoader());
        this.f = (TaxiItem) parcel.readParcelable(TaxiItem.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public RouteBusLineItem getBusLine() {
        List<RouteBusLineItem> list = this.f6643b;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.f6643b.get(0);
    }

    public List<RouteBusLineItem> getBusLines() {
        return this.f6643b;
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

    public TaxiItem getTaxi() {
        return this.f;
    }

    public RouteBusWalkItem getWalk() {
        return this.f6642a;
    }

    @Deprecated
    public void setBusLine(RouteBusLineItem routeBusLineItem) {
        List<RouteBusLineItem> list = this.f6643b;
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            this.f6643b.add(routeBusLineItem);
        }
        this.f6643b.set(0, routeBusLineItem);
    }

    public void setBusLines(List<RouteBusLineItem> list) {
        this.f6643b = list;
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

    public void setTaxi(TaxiItem taxiItem) {
        this.f = taxiItem;
    }

    public void setWalk(RouteBusWalkItem routeBusWalkItem) {
        this.f6642a = routeBusWalkItem;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6642a, i);
        parcel.writeTypedList(this.f6643b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }

    public BusStep() {
        this.f6643b = new ArrayList();
    }
}
