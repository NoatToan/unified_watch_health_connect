package com.huami.device.feature.health.device.blood_pressure;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectProgress;", "", "", "isCorrecting", "isSuccess", "isFail", "isCancel", "", "component1", "component2", "status", "progress", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getStatus", "()I", "b", "getProgress", "<init>", "(II)V", "Companion", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureCorrectProgress {
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int progress;

    public BloodPressureCorrectProgress(int i, int i2) {
        this.status = i;
        this.progress = i2;
    }

    public static /* synthetic */ BloodPressureCorrectProgress copy$default(BloodPressureCorrectProgress bloodPressureCorrectProgress, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bloodPressureCorrectProgress.status;
        }
        if ((i3 & 2) != 0) {
            i2 = bloodPressureCorrectProgress.progress;
        }
        return bloodPressureCorrectProgress.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final BloodPressureCorrectProgress copy(int status, int progress) {
        return new BloodPressureCorrectProgress(status, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureCorrectProgress)) {
            return false;
        }
        BloodPressureCorrectProgress bloodPressureCorrectProgress = (BloodPressureCorrectProgress) other;
        return this.status == bloodPressureCorrectProgress.status && this.progress == bloodPressureCorrectProgress.progress;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status * 31) + this.progress;
    }

    public final boolean isCancel() {
        return this.status == 4;
    }

    public final boolean isCorrecting() {
        return this.status == 1;
    }

    public final boolean isFail() {
        return this.status == 3;
    }

    public final boolean isSuccess() {
        return this.status == 2;
    }

    @NotNull
    public String toString() {
        return "BloodPressureCorrectProgress(status=" + this.status + ", progress=" + this.progress + ")";
    }
}
