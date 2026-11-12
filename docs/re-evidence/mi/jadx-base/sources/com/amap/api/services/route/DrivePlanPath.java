package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DrivePlanPath implements Parcelable {
    public static final Parcelable.Creator<DrivePlanPath> CREATOR = new Parcelable.Creator<DrivePlanPath>() { // from class: com.amap.api.services.route.DrivePlanPath.1
        private static DrivePlanPath a(Parcel parcel) {
            return new DrivePlanPath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrivePlanPath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DrivePlanPath[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f6666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6667b;
    private List<DrivePlanStep> c;

    public DrivePlanPath(Parcel parcel) {
        this.c = new ArrayList();
        this.f6666a = parcel.readFloat();
        this.f6667b = parcel.readInt();
        this.c = parcel.createTypedArrayList(DrivePlanStep.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDistance() {
        return this.f6666a;
    }

    public List<DrivePlanStep> getSteps() {
        return this.c;
    }

    public float getTrafficLights() {
        return this.f6667b;
    }

    public void setDistance(float f) {
        this.f6666a = f;
    }

    public void setSteps(List<DrivePlanStep> list) {
        this.c = list;
    }

    public void setTrafficLights(int i) {
        this.f6667b = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f6666a);
        parcel.writeInt(this.f6667b);
        parcel.writeTypedList(this.c);
    }

    public DrivePlanPath() {
        this.c = new ArrayList();
    }
}
