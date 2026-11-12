package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WalkRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<WalkRouteResult> CREATOR = new Parcelable.Creator<WalkRouteResult>() { // from class: com.amap.api.services.route.WalkRouteResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkRouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkRouteResult[] newArray(int i) {
            return a(i);
        }

        private static WalkRouteResult a(Parcel parcel) {
            return new WalkRouteResult(parcel);
        }

        private static WalkRouteResult[] a(int i) {
            return new WalkRouteResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<WalkPath> f3850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RouteSearch.WalkRouteQuery f3851b;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkPath> getPaths() {
        return this.f3850a;
    }

    public void setPaths(List<WalkPath> list) {
        this.f3850a = list;
    }

    public RouteSearch.WalkRouteQuery getWalkQuery() {
        return this.f3851b;
    }

    public void setWalkQuery(RouteSearch.WalkRouteQuery walkRouteQuery) {
        this.f3851b = walkRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f3850a);
        parcel.writeParcelable(this.f3851b, i);
    }

    public WalkRouteResult(Parcel parcel) {
        super(parcel);
        this.f3850a = new ArrayList();
        this.f3850a = parcel.createTypedArrayList(WalkPath.CREATOR);
        this.f3851b = (RouteSearch.WalkRouteQuery) parcel.readParcelable(RouteSearch.WalkRouteQuery.class.getClassLoader());
    }

    public WalkRouteResult() {
        this.f3850a = new ArrayList();
    }
}
