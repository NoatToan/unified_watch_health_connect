package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Path implements Parcelable {
    public static final Parcelable.Creator<Path> CREATOR = new Parcelable.Creator<Path>() { // from class: com.amap.api.services.route.Path.1
        private static Path a(Parcel parcel) {
            return new Path(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Path createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Path[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6687b;
    private List<LatLonPoint> c;

    public Path(Parcel parcel) {
        this.c = new ArrayList();
        this.f6686a = parcel.readFloat();
        this.f6687b = parcel.readLong();
        this.c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDistance() {
        return this.f6686a;
    }

    public long getDuration() {
        return this.f6687b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.c;
    }

    public void setDistance(float f) {
        this.f6686a = f;
    }

    public void setDuration(long j) {
        this.f6687b = j;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f6686a);
        parcel.writeLong(this.f6687b);
        parcel.writeTypedList(this.c);
    }

    public Path() {
        this.c = new ArrayList();
    }
}
