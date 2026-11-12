package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.DeductConstants;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/ForceStopCheckResult;", "Ljava/io/Serializable;", "stopped", "", "repeat", "planId", "", "<init>", "(ZZJ)V", "getStopped", "()Z", "getRepeat", "getPlanId", "()J", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ForceStopCheckResult implements Serializable {

    @SerializedName(DeductConstants.KEY_WX_PLAN_ID)
    private final long planId;

    @SerializedName("repeat")
    private final boolean repeat;

    @SerializedName("stopped")
    private final boolean stopped;

    public ForceStopCheckResult(boolean z, boolean z2, long j) {
        this.stopped = z;
        this.repeat = z2;
        this.planId = j;
    }

    public static /* synthetic */ ForceStopCheckResult copy$default(ForceStopCheckResult forceStopCheckResult, boolean z, boolean z2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = forceStopCheckResult.stopped;
        }
        if ((i & 2) != 0) {
            z2 = forceStopCheckResult.repeat;
        }
        if ((i & 4) != 0) {
            j = forceStopCheckResult.planId;
        }
        return forceStopCheckResult.copy(z, z2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getStopped() {
        return this.stopped;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRepeat() {
        return this.repeat;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    @NotNull
    public final ForceStopCheckResult copy(boolean stopped, boolean repeat, long planId) {
        return new ForceStopCheckResult(stopped, repeat, planId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForceStopCheckResult)) {
            return false;
        }
        ForceStopCheckResult forceStopCheckResult = (ForceStopCheckResult) other;
        return this.stopped == forceStopCheckResult.stopped && this.repeat == forceStopCheckResult.repeat && this.planId == forceStopCheckResult.planId;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final boolean getRepeat() {
        return this.repeat;
    }

    public final boolean getStopped() {
        return this.stopped;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.stopped) * 31) + Boolean.hashCode(this.repeat)) * 31) + Long.hashCode(this.planId);
    }

    @NotNull
    public String toString() {
        return "ForceStopCheckResult(stopped=" + this.stopped + ", repeat=" + this.repeat + ", planId=" + this.planId + ")";
    }
}
