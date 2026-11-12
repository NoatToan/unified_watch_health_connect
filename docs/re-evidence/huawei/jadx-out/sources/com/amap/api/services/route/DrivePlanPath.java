package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DrivePlanPath implements Parcelable {
    public static final Parcelable.Creator<DrivePlanPath> CREATOR = new Parcelable.Creator<DrivePlanPath>() { // from class: com.amap.api.services.route.DrivePlanPath.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DrivePlanPath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrivePlanPath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static DrivePlanPath a(Parcel parcel) {
            return new DrivePlanPath(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f3707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<DrivePlanStep> f3709c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDistance() {
        return this.f3707a;
    }

    public void setDistance(float f) {
        this.f3707a = f;
    }

    public float getTrafficLights() {
        return this.f3708b;
    }

    public void setTrafficLights(int i) {
        this.f3708b = i;
    }

    public List<DrivePlanStep> getSteps() {
        return this.f3709c;
    }

    public void setSteps(List<DrivePlanStep> list) {
        this.f3709c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f3707a);
        parcel.writeInt(this.f3708b);
        parcel.writeTypedList(this.f3709c);
    }

    public DrivePlanPath(Parcel parcel) {
        this.f3709c = new ArrayList();
        this.f3707a = parcel.readFloat();
        this.f3708b = parcel.readInt();
        this.f3709c = parcel.createTypedArrayList(DrivePlanStep.CREATOR);
    }

    public DrivePlanPath() {
        this.f3709c = new ArrayList();
    }
}
