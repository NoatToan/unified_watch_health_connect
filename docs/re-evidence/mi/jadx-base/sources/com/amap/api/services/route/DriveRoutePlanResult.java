package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DriveRoutePlanResult extends RoutePlanResult implements Parcelable {
    public static final Parcelable.Creator<DriveRoutePlanResult> CREATOR = new Parcelable.Creator<DriveRoutePlanResult>() { // from class: com.amap.api.services.route.DriveRoutePlanResult.1
        private static DriveRoutePlanResult a(Parcel parcel) {
            return new DriveRoutePlanResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRoutePlanResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRoutePlanResult[] newArray(int i) {
            return a(i);
        }

        private static DriveRoutePlanResult[] a(int i) {
            return new DriveRoutePlanResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<DrivePlanPath> f6670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<TimeInfo> f6671b;
    private RouteSearch.DrivePlanQuery c;

    public DriveRoutePlanResult(Parcel parcel) {
        super(parcel);
        this.f6670a = new ArrayList();
        this.f6671b = new ArrayList();
        this.f6670a = parcel.createTypedArrayList(DrivePlanPath.CREATOR);
        this.f6671b = parcel.createTypedArrayList(TimeInfo.CREATOR);
        this.c = (RouteSearch.DrivePlanQuery) parcel.readParcelable(RouteSearch.DrivePlanQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DrivePlanPath> getPaths() {
        return this.f6670a;
    }

    public List<TimeInfo> getTimeInfos() {
        return this.f6671b;
    }

    public void setDrivePlanQuery(RouteSearch.DrivePlanQuery drivePlanQuery) {
        this.c = drivePlanQuery;
        RouteSearch.FromAndTo fromAndTo = drivePlanQuery.getFromAndTo();
        if (fromAndTo != null) {
            setStartPos(fromAndTo.getFrom());
            setTargetPos(fromAndTo.getTo());
        }
    }

    public void setPaths(List<DrivePlanPath> list) {
        this.f6670a = list;
    }

    public void setTimeInfos(List<TimeInfo> list) {
        this.f6671b = list;
    }

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f6670a);
        parcel.writeTypedList(this.f6671b);
        parcel.writeParcelable(this.c, i);
    }

    public DriveRoutePlanResult() {
        this.f6670a = new ArrayList();
        this.f6671b = new ArrayList();
    }
}
