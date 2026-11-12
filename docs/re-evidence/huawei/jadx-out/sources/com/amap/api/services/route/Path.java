package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Path implements Parcelable {
    public static final Parcelable.Creator<Path> CREATOR = new Parcelable.Creator<Path>() { // from class: com.amap.api.services.route.Path.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Path[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Path createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static Path a(Parcel parcel) {
            return new Path(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LatLonPoint> f3736c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f3736c;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f3736c = list;
    }

    public float getDistance() {
        return this.f3734a;
    }

    public void setDistance(float f) {
        this.f3734a = f;
    }

    public long getDuration() {
        return this.f3735b;
    }

    public void setDuration(long j) {
        this.f3735b = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f3734a);
        parcel.writeLong(this.f3735b);
        parcel.writeTypedList(this.f3736c);
    }

    public Path(Parcel parcel) {
        this.f3736c = new ArrayList();
        this.f3734a = parcel.readFloat();
        this.f3735b = parcel.readLong();
        this.f3736c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    public Path() {
        this.f3736c = new ArrayList();
    }
}
