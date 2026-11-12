package com.xiaomi.fit.fitness.device.hm.data;

import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import com.xiaomi.onetrack.OneTrack;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/data/HMStageData;", "", "time", "", PaiData.LAST_SYNC_TIME, OneTrack.Param.TZ, "", "stages", "", "Lcom/xiaomi/fit/fitness/device/hm/data/HMStageItem;", "<init>", "(JJILjava/util/List;)V", "getTime", "()J", "getLastSyncTime", "getTz", "()I", "getStages", "()Ljava/util/List;", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HMStageData {
    private final long lastSyncTime;

    @Nullable
    private final List<HMStageItem> stages;
    private final long time;
    private final int tz;

    public HMStageData(long j, long j2, int i, @Nullable List<HMStageItem> list) {
        this.time = j;
        this.lastSyncTime = j2;
        this.tz = i;
        this.stages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMStageData copy$default(HMStageData hMStageData, long j, long j2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = hMStageData.time;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = hMStageData.lastSyncTime;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = hMStageData.tz;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = hMStageData.stages;
        }
        return hMStageData.copy(j3, j4, i3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTz() {
        return this.tz;
    }

    @Nullable
    public final List<HMStageItem> component4() {
        return this.stages;
    }

    @NotNull
    public final HMStageData copy(long time, long lastSyncTime, int tz, @Nullable List<HMStageItem> stages) {
        return new HMStageData(time, lastSyncTime, tz, stages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMStageData)) {
            return false;
        }
        HMStageData hMStageData = (HMStageData) other;
        return this.time == hMStageData.time && this.lastSyncTime == hMStageData.lastSyncTime && this.tz == hMStageData.tz && Intrinsics.areEqual(this.stages, hMStageData.stages);
    }

    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    @Nullable
    public final List<HMStageItem> getStages() {
        return this.stages;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTz() {
        return this.tz;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.time) * 31) + Long.hashCode(this.lastSyncTime)) * 31) + Integer.hashCode(this.tz)) * 31;
        List<HMStageItem> list = this.stages;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "time = " + this.time + ", lastSyncTime = " + this.lastSyncTime + ", tz = " + this.tz;
    }
}
