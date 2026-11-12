package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TruckRouteRestult implements Parcelable {
    public static final Parcelable.Creator<TruckRouteRestult> CREATOR = new Parcelable.Creator<TruckRouteRestult>() { // from class: com.amap.api.services.route.TruckRouteRestult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TruckRouteRestult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TruckRouteRestult[] newArray(int i) {
            return a(i);
        }

        private static TruckRouteRestult a(Parcel parcel) {
            return new TruckRouteRestult(parcel);
        }

        private static TruckRouteRestult[] a(int i) {
            return new TruckRouteRestult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RouteSearch.TruckRouteQuery f3843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<TruckPath> f3844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f3845c;
    private LatLonPoint d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TruckRouteRestult() {
    }

    protected TruckRouteRestult(Parcel parcel) {
        this.f3844b = parcel.createTypedArrayList(TruckPath.CREATOR);
        this.f3845c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    public void setTruckQuery(RouteSearch.TruckRouteQuery truckRouteQuery) {
        this.f3843a = truckRouteQuery;
    }

    public void setPaths(List<TruckPath> list) {
        this.f3844b = list;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f3845c = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.d = latLonPoint;
    }

    public RouteSearch.TruckRouteQuery getTruckQuery() {
        return this.f3843a;
    }

    public List<TruckPath> getPaths() {
        return this.f3844b;
    }

    public LatLonPoint getStartPos() {
        return this.f3845c;
    }

    public LatLonPoint getTargetPos() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3844b);
        parcel.writeParcelable(this.f3845c, i);
        parcel.writeParcelable(this.d, i);
    }
}
