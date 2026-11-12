package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DriveRoutePlanResult extends RoutePlanResult implements Parcelable {
    public static final Parcelable.Creator<DriveRoutePlanResult> CREATOR = new Parcelable.Creator<DriveRoutePlanResult>() { // from class: com.amap.api.services.route.DriveRoutePlanResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRoutePlanResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRoutePlanResult[] newArray(int i) {
            return a(i);
        }

        private static DriveRoutePlanResult a(Parcel parcel) {
            return new DriveRoutePlanResult(parcel);
        }

        private static DriveRoutePlanResult[] a(int i) {
            return new DriveRoutePlanResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<DrivePlanPath> f3713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<TimeInfo> f3714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearch.DrivePlanQuery f3715c;

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DrivePlanPath> getPaths() {
        return this.f3713a;
    }

    public void setPaths(List<DrivePlanPath> list) {
        this.f3713a = list;
    }

    public List<TimeInfo> getTimeInfos() {
        return this.f3714b;
    }

    public void setTimeInfos(List<TimeInfo> list) {
        this.f3714b = list;
    }

    public void setDrivePlanQuery(RouteSearch.DrivePlanQuery drivePlanQuery) {
        this.f3715c = drivePlanQuery;
        RouteSearch.FromAndTo fromAndTo = drivePlanQuery.getFromAndTo();
        if (fromAndTo != null) {
            setStartPos(fromAndTo.getFrom());
            setTargetPos(fromAndTo.getTo());
        }
    }

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f3713a);
        parcel.writeTypedList(this.f3714b);
        parcel.writeParcelable(this.f3715c, i);
    }

    public DriveRoutePlanResult(Parcel parcel) {
        super(parcel);
        this.f3713a = new ArrayList();
        this.f3714b = new ArrayList();
        this.f3713a = parcel.createTypedArrayList(DrivePlanPath.CREATOR);
        this.f3714b = parcel.createTypedArrayList(TimeInfo.CREATOR);
        this.f3715c = (RouteSearch.DrivePlanQuery) parcel.readParcelable(RouteSearch.DrivePlanQuery.class.getClassLoader());
    }

    public DriveRoutePlanResult() {
        this.f3713a = new ArrayList();
        this.f3714b = new ArrayList();
    }
}
