package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class RouteBusWalkItem extends WalkPath implements Parcelable {
    public static final Parcelable.Creator<RouteBusWalkItem> CREATOR = new Parcelable.Creator<RouteBusWalkItem>() { // from class: com.amap.api.services.route.RouteBusWalkItem.1
        private static RouteBusWalkItem a(Parcel parcel) {
            return new RouteBusWalkItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteBusWalkItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RouteBusWalkItem[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLonPoint f6703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f6704b;

    public RouteBusWalkItem(Parcel parcel) {
        super(parcel);
        this.f6703a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f6704b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.WalkPath, com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getDestination() {
        return this.f6704b;
    }

    public LatLonPoint getOrigin() {
        return this.f6703a;
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.f6704b = latLonPoint;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.f6703a = latLonPoint;
    }

    @Override // com.amap.api.services.route.WalkPath, com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f6703a, i);
        parcel.writeParcelable(this.f6704b, i);
    }

    public RouteBusWalkItem() {
    }
}
