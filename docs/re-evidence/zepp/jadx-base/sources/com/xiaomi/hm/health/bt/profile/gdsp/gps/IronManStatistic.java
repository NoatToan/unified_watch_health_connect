package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/IronManStatistic;", "Ljava/io/Serializable;", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "swimTime", "cyclingTime", "runningTime", "switchTime1", "switchTime2", "copy", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getSwimTime", "()I", "b", "getCyclingTime", "c", "getRunningTime", GoogleApiAvailabilityLight.a, "getSwitchTime1", "e", "getSwitchTime2", "<init>", "(IIIII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IronManStatistic implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int swimTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int cyclingTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int runningTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int switchTime1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int switchTime2;

    public IronManStatistic(int i, int i2, int i3, int i4, int i5) {
        this.swimTime = i;
        this.cyclingTime = i2;
        this.runningTime = i3;
        this.switchTime1 = i4;
        this.switchTime2 = i5;
    }

    public static /* synthetic */ IronManStatistic copy$default(IronManStatistic ironManStatistic, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = ironManStatistic.swimTime;
        }
        if ((i6 & 2) != 0) {
            i2 = ironManStatistic.cyclingTime;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = ironManStatistic.runningTime;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = ironManStatistic.switchTime1;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = ironManStatistic.switchTime2;
        }
        return ironManStatistic.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSwimTime() {
        return this.swimTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCyclingTime() {
        return this.cyclingTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRunningTime() {
        return this.runningTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSwitchTime1() {
        return this.switchTime1;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSwitchTime2() {
        return this.switchTime2;
    }

    @NotNull
    public final IronManStatistic copy(int swimTime, int cyclingTime, int runningTime, int switchTime1, int switchTime2) {
        return new IronManStatistic(swimTime, cyclingTime, runningTime, switchTime1, switchTime2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IronManStatistic)) {
            return false;
        }
        IronManStatistic ironManStatistic = (IronManStatistic) other;
        return this.swimTime == ironManStatistic.swimTime && this.cyclingTime == ironManStatistic.cyclingTime && this.runningTime == ironManStatistic.runningTime && this.switchTime1 == ironManStatistic.switchTime1 && this.switchTime2 == ironManStatistic.switchTime2;
    }

    public final int getCyclingTime() {
        return this.cyclingTime;
    }

    public final int getRunningTime() {
        return this.runningTime;
    }

    public final int getSwimTime() {
        return this.swimTime;
    }

    public final int getSwitchTime1() {
        return this.switchTime1;
    }

    public final int getSwitchTime2() {
        return this.switchTime2;
    }

    public int hashCode() {
        return (((((((this.swimTime * 31) + this.cyclingTime) * 31) + this.runningTime) * 31) + this.switchTime1) * 31) + this.switchTime2;
    }

    @NotNull
    public String toString() {
        return "IronManStatistic(swimTime=" + this.swimTime + ", cyclingTime=" + this.cyclingTime + ", runningTime=" + this.runningTime + ", switchTime1=" + this.switchTime1 + ", switchTime2=" + this.switchTime2 + ')';
    }
}
