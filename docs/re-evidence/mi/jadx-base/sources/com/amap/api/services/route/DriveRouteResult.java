package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DriveRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<DriveRouteResult> CREATOR = new Parcelable.Creator<DriveRouteResult>() { // from class: com.amap.api.services.route.DriveRouteResult.1
        private static DriveRouteResult a(Parcel parcel) {
            return new DriveRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResult[] newArray(int i) {
            return a(i);
        }

        private static DriveRouteResult[] a(int i) {
            return new DriveRouteResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DrivePath> f6673b;
    private RouteSearch.DriveRouteQuery c;

    public DriveRouteResult(Parcel parcel) {
        super(parcel);
        this.f6673b = new ArrayList();
        this.f6672a = parcel.readFloat();
        this.f6673b = parcel.createTypedArrayList(DrivePath.CREATOR);
        this.c = (RouteSearch.DriveRouteQuery) parcel.readParcelable(RouteSearch.DriveRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearch.DriveRouteQuery getDriveQuery() {
        return this.c;
    }

    public List<DrivePath> getPaths() {
        return this.f6673b;
    }

    public float getTaxiCost() {
        return this.f6672a;
    }

    public void setDriveQuery(RouteSearch.DriveRouteQuery driveRouteQuery) {
        this.c = driveRouteQuery;
    }

    public void setPaths(List<DrivePath> list) {
        this.f6673b = list;
    }

    public void setTaxiCost(float f) {
        this.f6672a = f;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f6672a);
        parcel.writeTypedList(this.f6673b);
        parcel.writeParcelable(this.c, i);
    }

    public DriveRouteResult() {
        this.f6673b = new ArrayList();
    }
}
