package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class RouteBusWalkItem extends WalkPath implements Parcelable {
    public static final Parcelable.Creator<RouteBusWalkItem> CREATOR = new Parcelable.Creator<RouteBusWalkItem>() { // from class: com.amap.api.services.route.RouteBusWalkItem.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RouteBusWalkItem[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteBusWalkItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static RouteBusWalkItem a(Parcel parcel) {
            return new RouteBusWalkItem(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLonPoint f3755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f3756b;

    @Override // com.amap.api.services.route.WalkPath, com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getOrigin() {
        return this.f3755a;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.f3755a = latLonPoint;
    }

    public LatLonPoint getDestination() {
        return this.f3756b;
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.f3756b = latLonPoint;
    }

    @Override // com.amap.api.services.route.WalkPath, com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f3755a, i);
        parcel.writeParcelable(this.f3756b, i);
    }

    public RouteBusWalkItem(Parcel parcel) {
        super(parcel);
        this.f3755a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f3756b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    public RouteBusWalkItem() {
    }
}
