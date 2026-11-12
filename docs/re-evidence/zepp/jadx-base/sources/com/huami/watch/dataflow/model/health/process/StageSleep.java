package com.huami.watch.dataflow.model.health.process;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class StageSleep implements Comparable<StageSleep>, Parcelable {
    public static final int BASE_INDEX = 1440;
    public static final Parcelable.Creator<StageSleep> CREATOR = new a();
    public int mode;
    public int start;
    public int stop;

    public class a implements Parcelable.Creator<StageSleep> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StageSleep createFromParcel(Parcel parcel) {
            return new StageSleep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StageSleep[] newArray(int i) {
            return new StageSleep[i];
        }
    }

    public StageSleep() {
    }

    private void a(Parcel parcel) {
        this.start = parcel.readInt();
        this.stop = parcel.readInt();
        this.mode = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NoProguard
    public void setInfos(int i, int i2, int i3) {
        this.start = i;
        this.stop = i2;
        this.mode = i3;
    }

    public String toString() {
        return "start:" + this.start + ",stop:" + this.stop + ",mode:" + this.mode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.stop);
        parcel.writeInt(this.mode);
    }

    public StageSleep(Parcel parcel) {
        a(parcel);
    }

    @Override // java.lang.Comparable
    public int compareTo(StageSleep stageSleep) {
        return this.start - stageSleep.start;
    }
}
