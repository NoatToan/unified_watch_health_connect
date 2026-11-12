package com.xiaomi.hm.health.bodyfat.slimming.repo;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.bodyfat.slimming.constants.LoseWeightPropertyKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "component4", "component5", "duration", LoseWeightPropertyKey.LOSE_WEIGHT, LoseWeightPropertyKey.EXERCISE_NAME, "type", LoseWeightPropertyKey.EXERCISE_MINUTES, "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getDuration", "()Ljava/lang/String;", "b", LogUtil.I, "getLoseWeight", "()I", "c", "getExerciseName", GoogleApiAvailabilityLight.a, "getType", "e", "getExerciseMinutes", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LoseWeightPlan implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoseWeightPlan> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String duration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int loseWeight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String exerciseName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int exerciseMinutes;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<LoseWeightPlan> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LoseWeightPlan createFromParcel(@NotNull Parcel parcel) {
            return new LoseWeightPlan(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LoseWeightPlan[] newArray(int i) {
            return new LoseWeightPlan[i];
        }
    }

    public LoseWeightPlan(@NotNull String str, int i, @NotNull String str2, int i2, int i3) {
        this.duration = str;
        this.loseWeight = i;
        this.exerciseName = str2;
        this.type = i2;
        this.exerciseMinutes = i3;
    }

    public static /* synthetic */ LoseWeightPlan copy$default(LoseWeightPlan loseWeightPlan, String str, int i, String str2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = loseWeightPlan.duration;
        }
        if ((i4 & 2) != 0) {
            i = loseWeightPlan.loseWeight;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            str2 = loseWeightPlan.exerciseName;
        }
        String str3 = str2;
        if ((i4 & 8) != 0) {
            i2 = loseWeightPlan.type;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = loseWeightPlan.exerciseMinutes;
        }
        return loseWeightPlan.copy(str, i5, str3, i6, i3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLoseWeight() {
        return this.loseWeight;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getExerciseMinutes() {
        return this.exerciseMinutes;
    }

    @NotNull
    public final LoseWeightPlan copy(@NotNull String duration, int loseWeight, @NotNull String exerciseName, int type, int exerciseMinutes) {
        return new LoseWeightPlan(duration, loseWeight, exerciseName, type, exerciseMinutes);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoseWeightPlan)) {
            return false;
        }
        LoseWeightPlan loseWeightPlan = (LoseWeightPlan) other;
        return Intrinsics.areEqual(this.duration, loseWeightPlan.duration) && this.loseWeight == loseWeightPlan.loseWeight && Intrinsics.areEqual(this.exerciseName, loseWeightPlan.exerciseName) && this.type == loseWeightPlan.type && this.exerciseMinutes == loseWeightPlan.exerciseMinutes;
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    public final int getExerciseMinutes() {
        return this.exerciseMinutes;
    }

    @NotNull
    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final int getLoseWeight() {
        return this.loseWeight;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.duration.hashCode() * 31) + this.loseWeight) * 31) + this.exerciseName.hashCode()) * 31) + this.type) * 31) + this.exerciseMinutes;
    }

    @NotNull
    public String toString() {
        return "LoseWeightPlan(duration=" + this.duration + ", loseWeight=" + this.loseWeight + ", exerciseName=" + this.exerciseName + ", type=" + this.type + ", exerciseMinutes=" + this.exerciseMinutes + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.duration);
        parcel.writeInt(this.loseWeight);
        parcel.writeString(this.exerciseName);
        parcel.writeInt(this.type);
        parcel.writeInt(this.exerciseMinutes);
    }
}
