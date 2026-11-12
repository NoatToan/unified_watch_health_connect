package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WalkRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<WalkRouteResultV2> CREATOR = new Parcelable.Creator<WalkRouteResultV2>() { // from class: com.amap.api.services.route.WalkRouteResultV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkRouteResultV2[] newArray(int i) {
            return a(i);
        }

        private static WalkRouteResultV2 a(Parcel parcel) {
            return new WalkRouteResultV2(parcel);
        }

        private static WalkRouteResultV2[] a(int i) {
            return new WalkRouteResultV2[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<WalkPath> f3852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RouteSearchV2.WalkRouteQuery f3853b;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkPath> getPaths() {
        return this.f3852a;
    }

    public void setPaths(List<WalkPath> list) {
        this.f3852a = list;
    }

    public RouteSearchV2.WalkRouteQuery getWalkQuery() {
        return this.f3853b;
    }

    public void setWalkQuery(RouteSearchV2.WalkRouteQuery walkRouteQuery) {
        this.f3853b = walkRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f3852a);
        parcel.writeParcelable(this.f3853b, i);
    }

    public WalkRouteResultV2(Parcel parcel) {
        super(parcel);
        this.f3852a = new ArrayList();
        this.f3852a = parcel.createTypedArrayList(WalkPath.CREATOR);
        this.f3853b = (RouteSearchV2.WalkRouteQuery) parcel.readParcelable(RouteSearchV2.WalkRouteQuery.class.getClassLoader());
    }

    public WalkRouteResultV2() {
        this.f3852a = new ArrayList();
    }
}
