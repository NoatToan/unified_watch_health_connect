package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DriveRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<DriveRouteResultV2> CREATOR = new Parcelable.Creator<DriveRouteResultV2>() { // from class: com.amap.api.services.route.DriveRouteResultV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResultV2[] newArray(int i) {
            return a(i);
        }

        private static DriveRouteResultV2 a(Parcel parcel) {
            return new DriveRouteResultV2(parcel);
        }

        private static DriveRouteResultV2[] a(int i) {
            return new DriveRouteResultV2[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DrivePathV2> f3720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearchV2.DriveRouteQuery f3721c;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getTaxiCost() {
        return this.f3719a;
    }

    public void setTaxiCost(float f) {
        this.f3719a = f;
    }

    public List<DrivePathV2> getPaths() {
        return this.f3720b;
    }

    public void setPaths(List<DrivePathV2> list) {
        this.f3720b = list;
    }

    public RouteSearchV2.DriveRouteQuery getDriveQuery() {
        return this.f3721c;
    }

    public void setDriveQuery(RouteSearchV2.DriveRouteQuery driveRouteQuery) {
        this.f3721c = driveRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f3719a);
        parcel.writeTypedList(this.f3720b);
        parcel.writeParcelable(this.f3721c, i);
    }

    public DriveRouteResultV2(Parcel parcel) {
        super(parcel);
        this.f3720b = new ArrayList();
        this.f3719a = parcel.readFloat();
        this.f3720b = parcel.createTypedArrayList(DrivePathV2.CREATOR);
        this.f3721c = (RouteSearchV2.DriveRouteQuery) parcel.readParcelable(RouteSearchV2.DriveRouteQuery.class.getClassLoader());
    }

    public DriveRouteResultV2() {
        this.f3720b = new ArrayList();
    }
}
