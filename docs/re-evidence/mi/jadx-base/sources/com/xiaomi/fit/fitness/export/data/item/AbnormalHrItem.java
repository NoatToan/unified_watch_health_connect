package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\tJ\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "hr", "", "hrPreAbnormal", "<init>", "(JILjava/lang/Integer;)V", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getHr", "()I", "getHrPreAbnormal", "()Ljava/lang/Integer;", "setHrPreAbnormal", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTimestamp", "setTimestamp", "", "component1", "component2", "component3", "copy", "(JILjava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;", "equals", "", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbnormalHrItem extends DailyRecordItem {

    @SerializedName("bpm")
    private final int hr;

    @SerializedName("prev_bpm")
    @Nullable
    private Integer hrPreAbnormal;

    @SerializedName("time")
    private long time;

    public AbnormalHrItem(long j, int i, @Nullable Integer num) {
        super(null);
        this.time = j;
        this.hr = i;
        this.hrPreAbnormal = num;
    }

    public static /* synthetic */ AbnormalHrItem copy$default(AbnormalHrItem abnormalHrItem, long j, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = abnormalHrItem.time;
        }
        if ((i2 & 2) != 0) {
            i = abnormalHrItem.hr;
        }
        if ((i2 & 4) != 0) {
            num = abnormalHrItem.hrPreAbnormal;
        }
        return abnormalHrItem.copy(j, i, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHr() {
        return this.hr;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getHrPreAbnormal() {
        return this.hrPreAbnormal;
    }

    @NotNull
    public final AbnormalHrItem copy(long time, int hr, @Nullable Integer hrPreAbnormal) {
        return new AbnormalHrItem(time, hr, hrPreAbnormal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbnormalHrItem)) {
            return false;
        }
        AbnormalHrItem abnormalHrItem = (AbnormalHrItem) other;
        return this.time == abnormalHrItem.time && this.hr == abnormalHrItem.hr && Intrinsics.areEqual(this.hrPreAbnormal, abnormalHrItem.hrPreAbnormal);
    }

    public final int getHr() {
        return this.hr;
    }

    @Nullable
    public final Integer getHrPreAbnormal() {
        return this.hrPreAbnormal;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.time) * 31) + Integer.hashCode(this.hr)) * 31;
        Integer num = this.hrPreAbnormal;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setHrPreAbnormal(@Nullable Integer num) {
        this.hrPreAbnormal = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "AbnormalHrItem(time=" + this.time + ", hr=" + this.hr + ", hrPreAbnormal=" + this.hrPreAbnormal + ")";
    }

    public AbnormalHrItem(long j, int i) {
        this(j, i, null);
    }
}
