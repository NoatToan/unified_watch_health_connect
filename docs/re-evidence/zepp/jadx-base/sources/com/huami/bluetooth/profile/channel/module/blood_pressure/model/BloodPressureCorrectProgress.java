package com.huami.bluetooth.profile.channel.module.blood_pressure.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/blood_pressure/model/BloodPressureCorrectProgress;", "", "", "isCorrecting", "isSuccess", "isFail", "", "component1", "component2", "status", "progress", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getStatus", "()I", "b", "getProgress", "<init>", "(II)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureCorrectProgress {
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;

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
        return "BloodPressureCorrectProgress(status=" + this.status + ", progress=" + this.progress + ')';
    }
}
