package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DrivePathV2 extends Path implements Parcelable {
    public static final Parcelable.Creator<DrivePathV2> CREATOR = new Parcelable.Creator<DrivePathV2>() { // from class: com.amap.api.services.route.DrivePathV2.1
        private static DrivePathV2 a(Parcel parcel) {
            return new DrivePathV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrivePathV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DrivePathV2[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DriveStepV2> f6665b;
    private int c;
    private Cost d;
    private ElecConsumeInfo e;
    private List<ChargeStationInfo> f;

    public DrivePathV2(Parcel parcel) {
        super(parcel);
        this.f6665b = new ArrayList();
        this.f = new ArrayList();
        this.f6664a = parcel.readString();
        this.f6665b = parcel.createTypedArrayList(DriveStepV2.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<ChargeStationInfo> getChargeStationInfo() {
        return this.f;
    }

    public Cost getCost() {
        return this.d;
    }

    public ElecConsumeInfo getElecConsumeInfo() {
        return this.e;
    }

    public int getRestriction() {
        return this.c;
    }

    public List<DriveStepV2> getSteps() {
        return this.f6665b;
    }

    public String getStrategy() {
        return this.f6664a;
    }

    public void setChargeStationInfo(List<ChargeStationInfo> list) {
        this.f = list;
    }

    public void setCost(Cost cost) {
        this.d = cost;
    }

    public void setElecConsumeInfo(ElecConsumeInfo elecConsumeInfo) {
        this.e = elecConsumeInfo;
    }

    public void setRestriction(int i) {
        this.c = i;
    }

    public void setSteps(List<DriveStepV2> list) {
        this.f6665b = list;
    }

    public void setStrategy(String str) {
        this.f6664a = str;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f6665b);
    }

    public DrivePathV2() {
        this.f6665b = new ArrayList();
        this.f = new ArrayList();
    }
}
