package com.xiaomi.fitness.detail.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\bE\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010I\u001a\u00020\bHÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010R\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\t\u0010U\u001a\u00020\u0015HÆ\u0003JÄ\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u0010WJ\u0006\u0010X\u001a\u00020\u0003J\u0013\u0010Y\u001a\u00020\u00152\b\u0010Z\u001a\u0004\u0018\u00010[HÖ\u0003J\t\u0010\\\u001a\u00020\u0003HÖ\u0001J\t\u0010]\u001a\u00020^HÖ\u0001J\u0016\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b:\u0010(\"\u0004\b;\u0010*R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b>\u0010(\"\u0004\b?\u0010*R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b@\u0010(\"\u0004\bA\u0010*R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006d"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportCourseInfoModel;", "Landroid/os/Parcelable;", "index", "", "sportState", "distance", "", "duration", "", "count", "calories", "avgHr", "maxHr", FitnessReportKey.maxPace, "totalUpHeight", "totalSteps", FitnessReportKey.avgPace, "avgSpeed", "swolf", "actionCount", "bestInfoModel", "", "<init>", "(IILjava/lang/Float;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;FLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getIndex", "()I", "setIndex", "(I)V", "getSportState", "setSportState", "getDistance", "()Ljava/lang/Float;", "setDistance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getDuration", "()J", "setDuration", "(J)V", "getCount", "()Ljava/lang/Integer;", FitnessReportKey.setCount, "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCalories", "setCalories", "getAvgHr", "setAvgHr", "getMaxHr", "setMaxHr", "getMaxPace", "setMaxPace", "getTotalUpHeight", "()F", "setTotalUpHeight", "(F)V", "getTotalSteps", "setTotalSteps", "getAvgPace", "setAvgPace", "getAvgSpeed", "setAvgSpeed", "getSwolf", "setSwolf", "getActionCount", "setActionCount", "getBestInfoModel", "()Z", "setBestInfoModel", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(IILjava/lang/Float;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;FLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/xiaomi/fitness/detail/model/SportCourseInfoModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportCourseInfoModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SportCourseInfoModel> CREATOR = new Creator();

    @Nullable
    private Integer actionCount;

    @Nullable
    private Integer avgHr;

    @Nullable
    private Integer avgPace;

    @Nullable
    private Float avgSpeed;
    private boolean bestInfoModel;

    @Nullable
    private Integer calories;

    @Nullable
    private Integer count;

    @Nullable
    private Float distance;
    private long duration;
    private int index;

    @Nullable
    private Integer maxHr;

    @Nullable
    private Integer maxPace;
    private int sportState;

    @Nullable
    private Integer swolf;

    @Nullable
    private Integer totalSteps;
    private float totalUpHeight;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SportCourseInfoModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SportCourseInfoModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SportCourseInfoModel(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SportCourseInfoModel[] newArray(int i) {
            return new SportCourseInfoModel[i];
        }
    }

    public SportCourseInfoModel(int i, int i2, @Nullable Float f, long j, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, float f2, @Nullable Integer num6, @Nullable Integer num7, @Nullable Float f3, @Nullable Integer num8, @Nullable Integer num9, boolean z) {
        this.index = i;
        this.sportState = i2;
        this.distance = f;
        this.duration = j;
        this.count = num;
        this.calories = num2;
        this.avgHr = num3;
        this.maxHr = num4;
        this.maxPace = num5;
        this.totalUpHeight = f2;
        this.totalSteps = num6;
        this.avgPace = num7;
        this.avgSpeed = f3;
        this.swolf = num8;
        this.actionCount = num9;
        this.bestInfoModel = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getTotalUpHeight() {
        return this.totalUpHeight;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getTotalSteps() {
        return this.totalSteps;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getAvgPace() {
        return this.avgPace;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Float getAvgSpeed() {
        return this.avgSpeed;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getSwolf() {
        return this.swolf;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getActionCount() {
        return this.actionCount;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getBestInfoModel() {
        return this.bestInfoModel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSportState() {
        return this.sportState;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCalories() {
        return this.calories;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getMaxPace() {
        return this.maxPace;
    }

    @NotNull
    public final SportCourseInfoModel copy(int index, int sportState, @Nullable Float distance, long duration, @Nullable Integer count, @Nullable Integer calories, @Nullable Integer avgHr, @Nullable Integer maxHr, @Nullable Integer maxPace, float totalUpHeight, @Nullable Integer totalSteps, @Nullable Integer avgPace, @Nullable Float avgSpeed, @Nullable Integer swolf, @Nullable Integer actionCount, boolean bestInfoModel) {
        return new SportCourseInfoModel(index, sportState, distance, duration, count, calories, avgHr, maxHr, maxPace, totalUpHeight, totalSteps, avgPace, avgSpeed, swolf, actionCount, bestInfoModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportCourseInfoModel)) {
            return false;
        }
        SportCourseInfoModel sportCourseInfoModel = (SportCourseInfoModel) other;
        return this.index == sportCourseInfoModel.index && this.sportState == sportCourseInfoModel.sportState && Intrinsics.areEqual((Object) this.distance, (Object) sportCourseInfoModel.distance) && this.duration == sportCourseInfoModel.duration && Intrinsics.areEqual(this.count, sportCourseInfoModel.count) && Intrinsics.areEqual(this.calories, sportCourseInfoModel.calories) && Intrinsics.areEqual(this.avgHr, sportCourseInfoModel.avgHr) && Intrinsics.areEqual(this.maxHr, sportCourseInfoModel.maxHr) && Intrinsics.areEqual(this.maxPace, sportCourseInfoModel.maxPace) && Float.compare(this.totalUpHeight, sportCourseInfoModel.totalUpHeight) == 0 && Intrinsics.areEqual(this.totalSteps, sportCourseInfoModel.totalSteps) && Intrinsics.areEqual(this.avgPace, sportCourseInfoModel.avgPace) && Intrinsics.areEqual((Object) this.avgSpeed, (Object) sportCourseInfoModel.avgSpeed) && Intrinsics.areEqual(this.swolf, sportCourseInfoModel.swolf) && Intrinsics.areEqual(this.actionCount, sportCourseInfoModel.actionCount) && this.bestInfoModel == sportCourseInfoModel.bestInfoModel;
    }

    @Nullable
    public final Integer getActionCount() {
        return this.actionCount;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Integer getAvgPace() {
        return this.avgPace;
    }

    @Nullable
    public final Float getAvgSpeed() {
        return this.avgSpeed;
    }

    public final boolean getBestInfoModel() {
        return this.bestInfoModel;
    }

    @Nullable
    public final Integer getCalories() {
        return this.calories;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final Float getDistance() {
        return this.distance;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    public final Integer getMaxPace() {
        return this.maxPace;
    }

    public final int getSportState() {
        return this.sportState;
    }

    @Nullable
    public final Integer getSwolf() {
        return this.swolf;
    }

    @Nullable
    public final Integer getTotalSteps() {
        return this.totalSteps;
    }

    public final float getTotalUpHeight() {
        return this.totalUpHeight;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.index) * 31) + Integer.hashCode(this.sportState)) * 31;
        Float f = this.distance;
        int iHashCode2 = (((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + Long.hashCode(this.duration)) * 31;
        Integer num = this.count;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.calories;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.avgHr;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxHr;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.maxPace;
        int iHashCode7 = (((iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31) + Float.hashCode(this.totalUpHeight)) * 31;
        Integer num6 = this.totalSteps;
        int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.avgPace;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Float f2 = this.avgSpeed;
        int iHashCode10 = (iHashCode9 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num8 = this.swolf;
        int iHashCode11 = (iHashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.actionCount;
        return ((iHashCode11 + (num9 != null ? num9.hashCode() : 0)) * 31) + Boolean.hashCode(this.bestInfoModel);
    }

    public final void setActionCount(@Nullable Integer num) {
        this.actionCount = num;
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setAvgPace(@Nullable Integer num) {
        this.avgPace = num;
    }

    public final void setAvgSpeed(@Nullable Float f) {
        this.avgSpeed = f;
    }

    public final void setBestInfoModel(boolean z) {
        this.bestInfoModel = z;
    }

    public final void setCalories(@Nullable Integer num) {
        this.calories = num;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    public final void setDistance(@Nullable Float f) {
        this.distance = f;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setMaxHr(@Nullable Integer num) {
        this.maxHr = num;
    }

    public final void setMaxPace(@Nullable Integer num) {
        this.maxPace = num;
    }

    public final void setSportState(int i) {
        this.sportState = i;
    }

    public final void setSwolf(@Nullable Integer num) {
        this.swolf = num;
    }

    public final void setTotalSteps(@Nullable Integer num) {
        this.totalSteps = num;
    }

    public final void setTotalUpHeight(float f) {
        this.totalUpHeight = f;
    }

    @NotNull
    public String toString() {
        return "SportCourseInfoModel(index=" + this.index + ", sportState=" + this.sportState + ", distance=" + this.distance + ", duration=" + this.duration + ", count=" + this.count + ", calories=" + this.calories + ", avgHr=" + this.avgHr + ", maxHr=" + this.maxHr + ", maxPace=" + this.maxPace + ", totalUpHeight=" + this.totalUpHeight + ", totalSteps=" + this.totalSteps + ", avgPace=" + this.avgPace + ", avgSpeed=" + this.avgSpeed + ", swolf=" + this.swolf + ", actionCount=" + this.actionCount + ", bestInfoModel=" + this.bestInfoModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.index);
        dest.writeInt(this.sportState);
        Float f = this.distance;
        if (f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f.floatValue());
        }
        dest.writeLong(this.duration);
        Integer num = this.count;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.calories;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.avgHr;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.maxHr;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.maxPace;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        dest.writeFloat(this.totalUpHeight);
        Integer num6 = this.totalSteps;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num6.intValue());
        }
        Integer num7 = this.avgPace;
        if (num7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num7.intValue());
        }
        Float f2 = this.avgSpeed;
        if (f2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f2.floatValue());
        }
        Integer num8 = this.swolf;
        if (num8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num8.intValue());
        }
        Integer num9 = this.actionCount;
        if (num9 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num9.intValue());
        }
        dest.writeInt(this.bestInfoModel ? 1 : 0);
    }

    public /* synthetic */ SportCourseInfoModel(int i, int i2, Float f, long j, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, float f2, Integer num6, Integer num7, Float f3, Integer num8, Integer num9, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : f, j, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : num3, (i3 & 128) != 0 ? null : num4, (i3 & 256) != 0 ? null : num5, (i3 & 512) != 0 ? 0.0f : f2, (i3 & 1024) != 0 ? null : num6, (i3 & 2048) != 0 ? null : num7, (i3 & 4096) != 0 ? null : f3, (i3 & 8192) != 0 ? null : num8, (i3 & 16384) != 0 ? null : num9, (i3 & 32768) != 0 ? false : z);
    }
}
