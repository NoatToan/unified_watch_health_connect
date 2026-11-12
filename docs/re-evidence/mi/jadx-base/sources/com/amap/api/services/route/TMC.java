package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TMC implements Parcelable {
    public static final Parcelable.Creator<TMC> CREATOR = new Parcelable.Creator<TMC>() { // from class: com.amap.api.services.route.TMC.1
        private static TMC a(Parcel parcel) {
            return new TMC(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TMC createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TMC[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6759b;
    private List<LatLonPoint> c;

    public TMC(Parcel parcel) {
        this.c = new ArrayList();
        this.f6758a = parcel.readInt();
        this.f6759b = parcel.readString();
        this.c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.f6758a;
    }

    public List<LatLonPoint> getPolyline() {
        return this.c;
    }

    public String getStatus() {
        return this.f6759b;
    }

    public void setDistance(int i) {
        this.f6758a = i;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.c = list;
    }

    public void setStatus(String str) {
        this.f6759b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6758a);
        parcel.writeString(this.f6759b);
        parcel.writeTypedList(this.c);
    }

    public TMC() {
        this.c = new ArrayList();
    }
}
