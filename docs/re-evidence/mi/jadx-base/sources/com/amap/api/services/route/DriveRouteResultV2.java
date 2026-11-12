package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DriveRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<DriveRouteResultV2> CREATOR = new Parcelable.Creator<DriveRouteResultV2>() { // from class: com.amap.api.services.route.DriveRouteResultV2.1
        private static DriveRouteResultV2 a(Parcel parcel) {
            return new DriveRouteResultV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResultV2[] newArray(int i) {
            return a(i);
        }

        private static DriveRouteResultV2[] a(int i) {
            return new DriveRouteResultV2[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DrivePathV2> f6675b;
    private RouteSearchV2.DriveRouteQuery c;

    public DriveRouteResultV2(Parcel parcel) {
        super(parcel);
        this.f6675b = new ArrayList();
        this.f6674a = parcel.readFloat();
        this.f6675b = parcel.createTypedArrayList(DrivePathV2.CREATOR);
        this.c = (RouteSearchV2.DriveRouteQuery) parcel.readParcelable(RouteSearchV2.DriveRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearchV2.DriveRouteQuery getDriveQuery() {
        return this.c;
    }

    public List<DrivePathV2> getPaths() {
        return this.f6675b;
    }

    public float getTaxiCost() {
        return this.f6674a;
    }

    public void setDriveQuery(RouteSearchV2.DriveRouteQuery driveRouteQuery) {
        this.c = driveRouteQuery;
    }

    public void setPaths(List<DrivePathV2> list) {
        this.f6675b = list;
    }

    public void setTaxiCost(float f) {
        this.f6674a = f;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f6674a);
        parcel.writeTypedList(this.f6675b);
        parcel.writeParcelable(this.c, i);
    }

    public DriveRouteResultV2() {
        this.f6675b = new ArrayList();
    }
}
