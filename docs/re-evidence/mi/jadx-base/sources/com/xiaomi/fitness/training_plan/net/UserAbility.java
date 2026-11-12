package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/UserAbility;", "", "runningFrequency", "", "perRunningDistance", "runningPace", "<init>", "(III)V", "getRunningFrequency", "()I", "getPerRunningDistance", "getRunningPace", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserAbility {

    @SerializedName("running_distance")
    private final int perRunningDistance;

    @SerializedName("running_frequency")
    private final int runningFrequency;

    @SerializedName("running_pace")
    private final int runningPace;

    public UserAbility(int i, int i2, int i3) {
        this.runningFrequency = i;
        this.perRunningDistance = i2;
        this.runningPace = i3;
    }

    public static /* synthetic */ UserAbility copy$default(UserAbility userAbility, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = userAbility.runningFrequency;
        }
        if ((i4 & 2) != 0) {
            i2 = userAbility.perRunningDistance;
        }
        if ((i4 & 4) != 0) {
            i3 = userAbility.runningPace;
        }
        return userAbility.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRunningFrequency() {
        return this.runningFrequency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPerRunningDistance() {
        return this.perRunningDistance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRunningPace() {
        return this.runningPace;
    }

    @NotNull
    public final UserAbility copy(int runningFrequency, int perRunningDistance, int runningPace) {
        return new UserAbility(runningFrequency, perRunningDistance, runningPace);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAbility)) {
            return false;
        }
        UserAbility userAbility = (UserAbility) other;
        return this.runningFrequency == userAbility.runningFrequency && this.perRunningDistance == userAbility.perRunningDistance && this.runningPace == userAbility.runningPace;
    }

    public final int getPerRunningDistance() {
        return this.perRunningDistance;
    }

    public final int getRunningFrequency() {
        return this.runningFrequency;
    }

    public final int getRunningPace() {
        return this.runningPace;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.runningFrequency) * 31) + Integer.hashCode(this.perRunningDistance)) * 31) + Integer.hashCode(this.runningPace);
    }

    @NotNull
    public String toString() {
        return "UserAbility(runningFrequency=" + this.runningFrequency + ", perRunningDistance=" + this.perRunningDistance + ", runningPace=" + this.runningPace + ")";
    }
}
