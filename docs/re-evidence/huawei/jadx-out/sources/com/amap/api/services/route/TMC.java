package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TMC implements Parcelable {
    public static final Parcelable.Creator<TMC> CREATOR = new Parcelable.Creator<TMC>() { // from class: com.amap.api.services.route.TMC.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TMC[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TMC createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static TMC a(Parcel parcel) {
            return new TMC(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LatLonPoint> f3828c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.f3826a;
    }

    public String getStatus() {
        return this.f3827b;
    }

    public void setDistance(int i) {
        this.f3826a = i;
    }

    public void setStatus(String str) {
        this.f3827b = str;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f3828c;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f3828c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3826a);
        parcel.writeString(this.f3827b);
        parcel.writeTypedList(this.f3828c);
    }

    public TMC(Parcel parcel) {
        this.f3828c = new ArrayList();
        this.f3826a = parcel.readInt();
        this.f3827b = parcel.readString();
        this.f3828c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    public TMC() {
        this.f3828c = new ArrayList();
    }
}
