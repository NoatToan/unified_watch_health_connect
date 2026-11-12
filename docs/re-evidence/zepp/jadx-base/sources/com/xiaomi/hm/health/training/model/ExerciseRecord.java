package com.xiaomi.hm.health.training.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class ExerciseRecord implements Parcelable {
    public static final Parcelable.Creator<ExerciseRecord> CREATOR = new a();
    public int avgHr;
    public String bulkHr;
    public String bulkPause;
    public int consumption;
    public long duration;
    public int sportType;
    public long startTime;

    public class a implements Parcelable.Creator<ExerciseRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ExerciseRecord createFromParcel(Parcel parcel) {
            return new ExerciseRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExerciseRecord[] newArray(int i) {
            return new ExerciseRecord[i];
        }
    }

    public ExerciseRecord() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.consumption);
        parcel.writeInt(this.avgHr);
        parcel.writeString(this.bulkHr);
        parcel.writeString(this.bulkPause);
        parcel.writeInt(this.sportType);
    }

    public ExerciseRecord(Parcel parcel) {
        this.startTime = parcel.readLong();
        this.duration = parcel.readLong();
        this.consumption = parcel.readInt();
        this.avgHr = parcel.readInt();
        this.bulkHr = parcel.readString();
        this.bulkPause = parcel.readString();
        this.sportType = parcel.readInt();
    }
}
