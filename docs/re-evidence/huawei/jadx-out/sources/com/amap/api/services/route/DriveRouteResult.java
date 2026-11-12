package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DriveRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<DriveRouteResult> CREATOR = new Parcelable.Creator<DriveRouteResult>() { // from class: com.amap.api.services.route.DriveRouteResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResult[] newArray(int i) {
            return a(i);
        }

        private static DriveRouteResult a(Parcel parcel) {
            return new DriveRouteResult(parcel);
        }

        private static DriveRouteResult[] a(int i) {
            return new DriveRouteResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DrivePath> f3717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearch.DriveRouteQuery f3718c;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getTaxiCost() {
        return this.f3716a;
    }

    public void setTaxiCost(float f) {
        this.f3716a = f;
    }

    public List<DrivePath> getPaths() {
        return this.f3717b;
    }

    public void setPaths(List<DrivePath> list) {
        this.f3717b = list;
    }

    public RouteSearch.DriveRouteQuery getDriveQuery() {
        return this.f3718c;
    }

    public void setDriveQuery(RouteSearch.DriveRouteQuery driveRouteQuery) {
        this.f3718c = driveRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f3716a);
        parcel.writeTypedList(this.f3717b);
        parcel.writeParcelable(this.f3718c, i);
    }

    public DriveRouteResult(Parcel parcel) {
        super(parcel);
        this.f3717b = new ArrayList();
        this.f3716a = parcel.readFloat();
        this.f3717b = parcel.createTypedArrayList(DrivePath.CREATOR);
        this.f3718c = (RouteSearch.DriveRouteQuery) parcel.readParcelable(RouteSearch.DriveRouteQuery.class.getClassLoader());
    }

    public DriveRouteResult() {
        this.f3717b = new ArrayList();
    }
}
