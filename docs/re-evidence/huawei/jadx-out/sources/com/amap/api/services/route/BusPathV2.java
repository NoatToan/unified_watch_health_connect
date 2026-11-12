package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BusPathV2 extends Path implements Parcelable {
    public static final Parcelable.Creator<BusPathV2> CREATOR = new Parcelable.Creator<BusPathV2>() { // from class: com.amap.api.services.route.BusPathV2.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusPathV2[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusPathV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static BusPathV2 a(Parcel parcel) {
            return new BusPathV2(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3669c;
    private float d;
    private List<BusStepV2> e;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getCost() {
        return this.f3667a;
    }

    public void setCost(float f) {
        this.f3667a = f;
    }

    public boolean isNightBus() {
        return this.f3668b;
    }

    public void setNightBus(boolean z) {
        this.f3668b = z;
    }

    public float getWalkDistance() {
        return this.f3669c;
    }

    public void setWalkDistance(float f) {
        this.f3669c = f;
    }

    public float getBusDistance() {
        return this.d;
    }

    public void setBusDistance(float f) {
        this.d = f;
    }

    public List<BusStepV2> getSteps() {
        return this.e;
    }

    public void setSteps(List<BusStepV2> list) {
        this.e = list;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f3667a);
        parcel.writeBooleanArray(new boolean[]{this.f3668b});
        parcel.writeFloat(this.f3669c);
        parcel.writeFloat(this.d);
        parcel.writeTypedList(this.e);
    }

    public BusPathV2(Parcel parcel) {
        super(parcel);
        this.e = new ArrayList();
        this.f3667a = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f3668b = zArr[0];
        this.f3669c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.createTypedArrayList(BusStepV2.CREATOR);
    }

    public BusPathV2() {
        this.e = new ArrayList();
    }
}
