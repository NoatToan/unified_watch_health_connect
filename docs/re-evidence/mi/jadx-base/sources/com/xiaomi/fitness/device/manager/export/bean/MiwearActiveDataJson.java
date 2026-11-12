package com.xiaomi.fitness.device.manager.export.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/MiwearActiveDataJson;", "", "activeReasonId", "", "durationSec", "<init>", "(II)V", "getActiveReasonId", "()I", "setActiveReasonId", "(I)V", "getDurationSec", "setDurationSec", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MiwearActiveDataJson {

    @SerializedName("active_reason_id")
    private int activeReasonId;

    @SerializedName("duration_sec")
    private int durationSec;

    public MiwearActiveDataJson(int i, int i2) {
        this.activeReasonId = i;
        this.durationSec = i2;
    }

    public static /* synthetic */ MiwearActiveDataJson copy$default(MiwearActiveDataJson miwearActiveDataJson, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = miwearActiveDataJson.activeReasonId;
        }
        if ((i3 & 2) != 0) {
            i2 = miwearActiveDataJson.durationSec;
        }
        return miwearActiveDataJson.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getActiveReasonId() {
        return this.activeReasonId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDurationSec() {
        return this.durationSec;
    }

    @NotNull
    public final MiwearActiveDataJson copy(int activeReasonId, int durationSec) {
        return new MiwearActiveDataJson(activeReasonId, durationSec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiwearActiveDataJson)) {
            return false;
        }
        MiwearActiveDataJson miwearActiveDataJson = (MiwearActiveDataJson) other;
        return this.activeReasonId == miwearActiveDataJson.activeReasonId && this.durationSec == miwearActiveDataJson.durationSec;
    }

    public final int getActiveReasonId() {
        return this.activeReasonId;
    }

    public final int getDurationSec() {
        return this.durationSec;
    }

    public int hashCode() {
        return (Integer.hashCode(this.activeReasonId) * 31) + Integer.hashCode(this.durationSec);
    }

    public final void setActiveReasonId(int i) {
        this.activeReasonId = i;
    }

    public final void setDurationSec(int i) {
        this.durationSec = i;
    }

    @NotNull
    public String toString() {
        return "MiwearActiveDataJson(activeReasonId=" + this.activeReasonId + ", durationSec=" + this.durationSec + ")";
    }
}
