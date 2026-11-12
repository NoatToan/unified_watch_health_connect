package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/HabitSuccessResult;", "Ljava/io/Serializable;", "success", "", "withReport", "<init>", "(ZZ)V", "getSuccess", "()Z", "getWithReport", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitSuccessResult implements Serializable {

    @SerializedName("success")
    private final boolean success;

    @SerializedName("with_report")
    private final boolean withReport;

    public HabitSuccessResult(boolean z, boolean z2) {
        this.success = z;
        this.withReport = z2;
    }

    public static /* synthetic */ HabitSuccessResult copy$default(HabitSuccessResult habitSuccessResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = habitSuccessResult.success;
        }
        if ((i & 2) != 0) {
            z2 = habitSuccessResult.withReport;
        }
        return habitSuccessResult.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getWithReport() {
        return this.withReport;
    }

    @NotNull
    public final HabitSuccessResult copy(boolean success, boolean withReport) {
        return new HabitSuccessResult(success, withReport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitSuccessResult)) {
            return false;
        }
        HabitSuccessResult habitSuccessResult = (HabitSuccessResult) other;
        return this.success == habitSuccessResult.success && this.withReport == habitSuccessResult.withReport;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean getWithReport() {
        return this.withReport;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.withReport);
    }

    @NotNull
    public String toString() {
        return "HabitSuccessResult(success=" + this.success + ", withReport=" + this.withReport + ")";
    }
}
