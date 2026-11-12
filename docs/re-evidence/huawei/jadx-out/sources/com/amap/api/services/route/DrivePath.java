package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DrivePath extends Path implements Parcelable {
    public static final Parcelable.Creator<DrivePath> CREATOR = new Parcelable.Creator<DrivePath>() { // from class: com.amap.api.services.route.DrivePath.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DrivePath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrivePath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static DrivePath a(Parcel parcel) {
            return new DrivePath(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f3702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3703c;
    private int d;
    private List<DriveStep> e;
    private int f;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getStrategy() {
        return this.f3701a;
    }

    public void setStrategy(String str) {
        this.f3701a = str;
    }

    public float getTolls() {
        return this.f3702b;
    }

    public void setTolls(float f) {
        this.f3702b = f;
    }

    public float getTollDistance() {
        return this.f3703c;
    }

    public void setTollDistance(float f) {
        this.f3703c = f;
    }

    public int getTotalTrafficlights() {
        return this.d;
    }

    public void setTotalTrafficlights(int i) {
        this.d = i;
    }

    public List<DriveStep> getSteps() {
        return this.e;
    }

    public void setSteps(List<DriveStep> list) {
        this.e = list;
    }

    public int getRestriction() {
        return this.f;
    }

    public void setRestriction(int i) {
        this.f = i;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f3701a);
        parcel.writeFloat(this.f3702b);
        parcel.writeFloat(this.f3703c);
        parcel.writeTypedList(this.e);
        parcel.writeInt(this.d);
    }

    public DrivePath(Parcel parcel) {
        super(parcel);
        this.e = new ArrayList();
        this.f3701a = parcel.readString();
        this.f3702b = parcel.readFloat();
        this.f3703c = parcel.readFloat();
        this.e = parcel.createTypedArrayList(DriveStep.CREATOR);
        this.d = parcel.readInt();
    }

    public DrivePath() {
        this.e = new ArrayList();
    }
}
