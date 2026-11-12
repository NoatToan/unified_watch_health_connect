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
        private static RouteBusLineItem a(Parcel parcel) {
            return new RouteBusLineItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteBusLineItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RouteBusLineItem[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BusStationItem f6701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BusStationItem f6702b;
    private List<LatLonPoint> c;
    private int d;
    private List<BusStationItem> e;
    private float f;

    public RouteBusLineItem(Parcel parcel) {
        super(parcel);
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.f6701a = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.f6702b = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.createTypedArrayList(BusStationItem.CREATOR);
        this.f = parcel.readFloat();
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public int describeContents() {
        return 0;
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
        BusStationItem busStationItem = this.f6702b;
        if (busStationItem == null) {
            if (routeBusLineItem.f6702b != null) {
                return false;
            }
        } else if (!busStationItem.equals(routeBusLineItem.f6702b)) {
            return false;
        }
        BusStationItem busStationItem2 = this.f6701a;
        if (busStationItem2 == null) {
            if (routeBusLineItem.f6701a != null) {
                return false;
            }
        } else if (!busStationItem2.equals(routeBusLineItem.f6701a)) {
            return false;
        }
        return true;
    }

    public BusStationItem getArrivalBusStation() {
        return this.f6702b;
    }

    public BusStationItem getDepartureBusStation() {
        return this.f6701a;
    }

    public float getDuration() {
        return this.f;
    }

    public int getPassStationNum() {
        return this.d;
    }

    public List<BusStationItem> getPassStations() {
        return this.e;
    }

    public List<LatLonPoint> getPolyline() {
        return this.c;
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        BusStationItem busStationItem = this.f6702b;
        int iHashCode2 = (iHashCode + (busStationItem == null ? 0 : busStationItem.hashCode())) * 31;
        BusStationItem busStationItem2 = this.f6701a;
        return iHashCode2 + (busStationItem2 != null ? busStationItem2.hashCode() : 0);
    }

    public void setArrivalBusStation(BusStationItem busStationItem) {
        this.f6702b = busStationItem;
    }

    public void setDepartureBusStation(BusStationItem busStationItem) {
        this.f6701a = busStationItem;
    }

    public void setDuration(float f) {
        this.f = f;
    }

    public void setPassStationNum(int i) {
        this.d = i;
    }

    public void setPassStations(List<BusStationItem> list) {
        this.e = list;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.c = list;
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f6701a, i);
        parcel.writeParcelable(this.f6702b, i);
        parcel.writeTypedList(this.c);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.e);
        parcel.writeFloat(this.f);
    }

    public RouteBusLineItem() {
        this.c = new ArrayList();
        this.e = new ArrayList();
    }
}
