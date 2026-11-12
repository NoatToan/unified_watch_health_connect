package com.xiaomi.fitness.migration.exercise.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.OvulationTestRecord;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository;

/* JADX INFO: loaded from: classes9.dex */
public class IntensityDuration implements Parcelable {
    public static final Parcelable.Creator<IntensityDuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("low")
    private int f12417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(BloodPressurePreRepository.KEY_ITEM_MID)
    private int f12418b;

    @SerializedName(OvulationTestRecord.Result.HIGH)
    private int c;

    public class a implements Parcelable.Creator<IntensityDuration> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntensityDuration createFromParcel(Parcel parcel) {
            return new IntensityDuration(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntensityDuration[] newArray(int i) {
            return new IntensityDuration[i];
        }
    }

    public IntensityDuration() {
    }

    public int a() {
        return this.c;
    }

    public int c() {
        return this.f12418b;
    }

    public void d(int i) {
        this.c = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(int i) {
        this.f12417a = i;
    }

    public void f(int i) {
        this.f12418b = i;
    }

    public String toString() {
        return "low:" + this.f12417a + ";mid:" + this.f12418b + ";high:" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12417a);
        parcel.writeInt(this.f12418b);
        parcel.writeInt(this.c);
    }

    public IntensityDuration(Parcel parcel) {
        this.f12417a = parcel.readInt();
        this.f12418b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
