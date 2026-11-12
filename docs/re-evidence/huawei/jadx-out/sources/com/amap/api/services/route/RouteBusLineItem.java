package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.busline.BusLineItem;
import com.amap.api.services.busline.BusStationItem;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RouteBusLineItem extends BusLineItem implements Parcelable {
    public static final Parcelable.Creator<RouteBusLineItem> CREATOR = new Parcelable.Creator<RouteBusLineItem>() { // from class: com.amap.api.services.route.RouteBusLineItem.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RouteBusLineItem[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteBusLineItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static RouteBusLineItem a(Parcel parcel) {
            return new RouteBusLineItem(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BusStationItem f3752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BusStationItem f3753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LatLonPoint> f3754c;
    private int d;
    private List<BusStationItem> e;
    private float f;

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BusStationItem getDepartureBusStation() {
        return this.f3752a;
    }

    public void setDepartureBusStation(BusStationItem busStationItem) {
        this.f3752a = busStationItem;
    }

    public BusStationItem getArrivalBusStation() {
        return this.f3753b;
    }

    public void setArrivalBusStation(BusStationItem busStationItem) {
        this.f3753b = busStationItem;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f3754c;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f3754c = list;
    }

    public int getPassStationNum() {
        return this.d;
    }

    public void setPassStationNum(int i) {
        this.d = i;
    }

    public List<BusStationItem> getPassStations() {
        return this.e;
    }

    public void setPassStations(List<BusStationItem> list) {
        this.e = list;
    }

    public float getDuration() {
        return this.f;
    }

    public void setDuration(float f) {
        this.f = f;
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f3752a, i);
        parcel.writeParcelable(this.f3753b, i);
        parcel.writeTypedList(this.f3754c);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.e);
        parcel.writeFloat(this.f);
    }

    public RouteBusLineItem(Parcel parcel) {
        super(parcel);
        this.f3754c = new ArrayList();
        this.e = new ArrayList();
        this.f3752a = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.f3753b = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.f3754c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.createTypedArrayList(BusStationItem.CREATOR);
        this.f = parcel.readFloat();
    }

    public RouteBusLineItem() {
        this.f3754c = new ArrayList();
        this.e = new ArrayList();
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public int hashCode() {
        int iHashCode = super.hashCode();
        BusStationItem busStationItem = this.f3753b;
        int iHashCode2 = busStationItem == null ? 0 : busStationItem.hashCode();
        BusStationItem busStationItem2 = this.f3752a;
        return (((iHashCode * 31) + iHashCode2) * 31) + (busStationItem2 != null ? busStationItem2.hashCode() : 0);
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        RouteBusLineItem routeBusLineItem = (RouteBusLineItem) obj;
        BusStationItem busStationItem = this.f3753b;
        if (busStationItem == null) {
            if (routeBusLineItem.f3753b != null) {
                return false;
            }
        } else if (!busStationItem.equals(routeBusLineItem.f3753b)) {
            return false;
        }
        BusStationItem busStationItem2 = this.f3752a;
        if (busStationItem2 == null) {
            if (routeBusLineItem.f3752a != null) {
                return false;
            }
        } else if (!busStationItem2.equals(routeBusLineItem.f3752a)) {
            return false;
        }
        return true;
    }
}
