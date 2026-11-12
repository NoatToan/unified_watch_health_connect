package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DrivePlanStep implements Parcelable {
    public static final Parcelable.Creator<DrivePlanStep> CREATOR = new Parcelable.Creator<DrivePlanStep>() { // from class: com.amap.api.services.route.DrivePlanStep.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DrivePlanStep[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrivePlanStep createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static DrivePlanStep a(Parcel parcel) {
            return new DrivePlanStep(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3712c;
    private boolean d;
    private List<LatLonPoint> e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getRoad() {
        return this.f3710a;
    }

    public void setAdCode(String str) {
        this.f3711b = str;
    }

    public String getAdCode() {
        return this.f3711b;
    }

    public void setRoad(String str) {
        this.f3710a = str;
    }

    public float getDistance() {
        return this.f3712c;
    }

    public void setDistance(float f) {
        this.f3712c = f;
    }

    public boolean getToll() {
        return this.d;
    }

    public void setToll(boolean z) {
        this.d = z;
    }

    public List<LatLonPoint> getPolyline() {
        return this.e;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.e = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3710a);
        parcel.writeString(this.f3711b);
        parcel.writeFloat(this.f3712c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeFloat(this.f3712c);
        parcel.writeTypedList(this.e);
    }

    public DrivePlanStep(Parcel parcel) {
        this.e = new ArrayList();
        this.f3710a = parcel.readString();
        this.f3711b = parcel.readString();
        this.f3712c = parcel.readFloat();
        this.d = parcel.readInt() == 1;
        this.f3712c = parcel.readFloat();
        this.e = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    public DrivePlanStep() {
        this.e = new ArrayList();
    }
}
