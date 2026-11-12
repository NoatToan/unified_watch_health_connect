package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BusPath extends Path implements Parcelable {
    public static final Parcelable.Creator<BusPath> CREATOR = new Parcelable.Creator<BusPath>() { // from class: com.amap.api.services.route.BusPath.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusPath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusPath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static BusPath a(Parcel parcel) {
            return new BusPath(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3666c;
    private float d;
    private List<BusStep> e;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getCost() {
        return this.f3664a;
    }

    public void setCost(float f) {
        this.f3664a = f;
    }

    public boolean isNightBus() {
        return this.f3665b;
    }

    public void setNightBus(boolean z) {
        this.f3665b = z;
    }

    public float getWalkDistance() {
        return this.f3666c;
    }

    public void setWalkDistance(float f) {
        this.f3666c = f;
    }

    public float getBusDistance() {
        return this.d;
    }

    public void setBusDistance(float f) {
        this.d = f;
    }

    public List<BusStep> getSteps() {
        return this.e;
    }

    public void setSteps(List<BusStep> list) {
        this.e = list;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f3664a);
        parcel.writeBooleanArray(new boolean[]{this.f3665b});
        parcel.writeFloat(this.f3666c);
        parcel.writeFloat(this.d);
        parcel.writeTypedList(this.e);
    }

    public BusPath(Parcel parcel) {
        super(parcel);
        this.e = new ArrayList();
        this.f3664a = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f3665b = zArr[0];
        this.f3666c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.createTypedArrayList(BusStep.CREATOR);
    }

    public BusPath() {
        this.e = new ArrayList();
    }
}
