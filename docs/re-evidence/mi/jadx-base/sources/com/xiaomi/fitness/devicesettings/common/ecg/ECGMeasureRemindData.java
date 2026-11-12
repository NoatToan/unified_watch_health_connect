package com.xiaomi.fitness.devicesettings.common.ecg;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J7\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindData;", "", "isEnable", "", "repeat", "", "dayRemindCount", "remindTimes", "", "<init>", "(ZIILjava/util/List;)V", "()Z", "setEnable", "(Z)V", "getRepeat", "()I", "setRepeat", "(I)V", "getDayRemindCount", "setDayRemindCount", "getRemindTimes", "()Ljava/util/List;", "setRemindTimes", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ECGMeasureRemindData {
    private int dayRemindCount;
    private boolean isEnable;

    @NotNull
    private List<Integer> remindTimes;
    private int repeat;

    public ECGMeasureRemindData(boolean z, int i, int i2, @NotNull List<Integer> remindTimes) {
        Intrinsics.checkNotNullParameter(remindTimes, "remindTimes");
        this.isEnable = z;
        this.repeat = i;
        this.dayRemindCount = i2;
        this.remindTimes = remindTimes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ECGMeasureRemindData copy$default(ECGMeasureRemindData eCGMeasureRemindData, boolean z, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = eCGMeasureRemindData.isEnable;
        }
        if ((i3 & 2) != 0) {
            i = eCGMeasureRemindData.repeat;
        }
        if ((i3 & 4) != 0) {
            i2 = eCGMeasureRemindData.dayRemindCount;
        }
        if ((i3 & 8) != 0) {
            list = eCGMeasureRemindData.remindTimes;
        }
        return eCGMeasureRemindData.copy(z, i, i2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRepeat() {
        return this.repeat;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDayRemindCount() {
        return this.dayRemindCount;
    }

    @NotNull
    public final List<Integer> component4() {
        return this.remindTimes;
    }

    @NotNull
    public final ECGMeasureRemindData copy(boolean isEnable, int repeat, int dayRemindCount, @NotNull List<Integer> remindTimes) {
        Intrinsics.checkNotNullParameter(remindTimes, "remindTimes");
        return new ECGMeasureRemindData(isEnable, repeat, dayRemindCount, remindTimes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ECGMeasureRemindData)) {
            return false;
        }
        ECGMeasureRemindData eCGMeasureRemindData = (ECGMeasureRemindData) other;
        return this.isEnable == eCGMeasureRemindData.isEnable && this.repeat == eCGMeasureRemindData.repeat && this.dayRemindCount == eCGMeasureRemindData.dayRemindCount && Intrinsics.areEqual(this.remindTimes, eCGMeasureRemindData.remindTimes);
    }

    public final int getDayRemindCount() {
        return this.dayRemindCount;
    }

    @NotNull
    public final List<Integer> getRemindTimes() {
        return this.remindTimes;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isEnable) * 31) + Integer.hashCode(this.repeat)) * 31) + Integer.hashCode(this.dayRemindCount)) * 31) + this.remindTimes.hashCode();
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final void setDayRemindCount(int i) {
        this.dayRemindCount = i;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
    }

    public final void setRemindTimes(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.remindTimes = list;
    }

    public final void setRepeat(int i) {
        this.repeat = i;
    }

    @NotNull
    public String toString() {
        return "ECGMeasureRemindData(isEnable=" + this.isEnable + ", repeat=" + this.repeat + ", dayRemindCount=" + this.dayRemindCount + ", remindTimes=" + this.remindTimes + ")";
    }
}
