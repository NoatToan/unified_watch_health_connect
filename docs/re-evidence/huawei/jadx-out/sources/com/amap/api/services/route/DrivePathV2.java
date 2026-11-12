package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DrivePathV2 extends Path implements Parcelable {
    public static final Parcelable.Creator<DrivePathV2> CREATOR = new Parcelable.Creator<DrivePathV2>() { // from class: com.amap.api.services.route.DrivePathV2.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DrivePathV2[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrivePathV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static DrivePathV2 a(Parcel parcel) {
            return new DrivePathV2(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DriveStepV2> f3705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3706c;
    private Cost d;
    private ElecConsumeInfo e;
    private List<ChargeStationInfo> f;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ElecConsumeInfo getElecConsumeInfo() {
        return this.e;
    }

    public void setElecConsumeInfo(ElecConsumeInfo elecConsumeInfo) {
        this.e = elecConsumeInfo;
    }

    public List<ChargeStationInfo> getChargeStationInfo() {
        return this.f;
    }

    public void setChargeStationInfo(List<ChargeStationInfo> list) {
        this.f = list;
    }

    public Cost getCost() {
        return this.d;
    }

    public void setCost(Cost cost) {
        this.d = cost;
    }

    public String getStrategy() {
        return this.f3704a;
    }

    public void setStrategy(String str) {
        this.f3704a = str;
    }

    public List<DriveStepV2> getSteps() {
        return this.f3705b;
    }

    public void setSteps(List<DriveStepV2> list) {
        this.f3705b = list;
    }

    public int getRestriction() {
        return this.f3706c;
    }

    public void setRestriction(int i) {
        this.f3706c = i;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f3705b);
    }

    public DrivePathV2(Parcel parcel) {
        super(parcel);
        this.f3705b = new ArrayList();
        this.f = new ArrayList();
        this.f3704a = parcel.readString();
        this.f3705b = parcel.createTypedArrayList(DriveStepV2.CREATOR);
    }

    public DrivePathV2() {
        this.f3705b = new ArrayList();
        this.f = new ArrayList();
    }
}
