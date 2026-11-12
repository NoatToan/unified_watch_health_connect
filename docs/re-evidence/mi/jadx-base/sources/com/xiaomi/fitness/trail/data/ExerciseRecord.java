package com.xiaomi.fitness.trail.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010(\u001a\u00020\bH\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020-H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001a\u0010\"\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\f¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ExerciseRecord;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", DailyRecordKey.sportType, "", "getSportType", "()I", "setSportType", "(I)V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "duration", "", "getDuration", "()D", "setDuration", "(D)V", "distance", "getDistance", "setDistance", "calories", "getCalories", "setCalories", "step", "getStep", "setStep", "intensity", "getIntensity", "setIntensity", FitnessReportKey.mainPosture, "getMainPosture", "setMainPosture", "describeContents", "writeToParcel", "", "flags", "toString", "", "CREATOR", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExerciseRecord implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private double calories;
    private int distance;
    private double duration;
    private int intensity;
    private int mainPosture;
    private int sportType;
    private long startTime;
    private int step;

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.data.ExerciseRecord$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/trail/data/ExerciseRecord$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/trail/data/ExerciseRecord;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/trail/data/ExerciseRecord;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<ExerciseRecord> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ExerciseRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExerciseRecord(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ExerciseRecord[] newArray(int size) {
            return new ExerciseRecord[size];
        }
    }

    public ExerciseRecord() {
        this.sportType = -1;
        this.startTime = -1L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final double getCalories() {
        return this.calories;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final int getIntensity() {
        return this.intensity;
    }

    public final int getMainPosture() {
        return this.mainPosture;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStep() {
        return this.step;
    }

    public final void setCalories(double d) {
        this.calories = d;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setDuration(double d) {
        this.duration = d;
    }

    public final void setIntensity(int i) {
        this.intensity = i;
    }

    public final void setMainPosture(int i) {
        this.mainPosture = i;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    @NotNull
    public String toString() {
        return "ExerciseRecord{sportType: " + this.sportType + " startTime: " + this.startTime + " duration: " + this.duration + "distance: " + this.distance + "calories: " + this.calories + "step: " + this.step + "mainPosture: " + this.mainPosture + "intensity: " + this.intensity + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.sportType);
        parcel.writeLong(this.startTime);
        parcel.writeDouble(this.duration);
        parcel.writeInt(this.distance);
        parcel.writeDouble(this.calories);
        parcel.writeInt(this.step);
        parcel.writeInt(this.intensity);
        parcel.writeInt(this.mainPosture);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExerciseRecord(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.sportType = parcel.readInt();
        this.startTime = parcel.readLong();
        this.duration = parcel.readDouble();
        this.distance = parcel.readInt();
        this.calories = parcel.readDouble();
        this.step = parcel.readInt();
        this.intensity = parcel.readInt();
        this.mainPosture = parcel.readInt();
    }
}
