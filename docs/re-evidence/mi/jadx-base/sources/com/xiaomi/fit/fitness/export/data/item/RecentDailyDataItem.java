package com.xiaomi.fit.fitness.export.data.item;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010\"\u001a\u00020\u0003H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003JO\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001d¨\u00064"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/RecentDailyDataItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "lastHrItem", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "lasSpo2Item", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "abnormalLowHrItem", "Lcom/xiaomi/fit/fitness/export/data/item/RecentAbnormalDataItem;", "abnormalHighHrItem", "abnormalSpo2Item", "<init>", "(JLcom/xiaomi/fit/fitness/export/data/item/HrItem;Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;Lcom/xiaomi/fit/fitness/export/data/item/RecentAbnormalDataItem;Lcom/xiaomi/fit/fitness/export/data/item/RecentAbnormalDataItem;Lcom/xiaomi/fit/fitness/export/data/item/RecentAbnormalDataItem;)V", "getTime", "()J", "setTime", "(J)V", "getLastHrItem", "()Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "setLastHrItem", "(Lcom/xiaomi/fit/fitness/export/data/item/HrItem;)V", "getLasSpo2Item", "()Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "setLasSpo2Item", "(Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;)V", "getAbnormalLowHrItem", "()Lcom/xiaomi/fit/fitness/export/data/item/RecentAbnormalDataItem;", "setAbnormalLowHrItem", "(Lcom/xiaomi/fit/fitness/export/data/item/RecentAbnormalDataItem;)V", "getAbnormalHighHrItem", "setAbnormalHighHrItem", "getAbnormalSpo2Item", "setAbnormalSpo2Item", "getTimestamp", "setTimestamp", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentDailyDataItem extends DailyRecordItem {

    @Nullable
    private RecentAbnormalDataItem abnormalHighHrItem;

    @Nullable
    private RecentAbnormalDataItem abnormalLowHrItem;

    @Nullable
    private RecentAbnormalDataItem abnormalSpo2Item;

    @Nullable
    private Spo2Item lasSpo2Item;

    @Nullable
    private HrItem lastHrItem;
    private long time;

    public /* synthetic */ RecentDailyDataItem(long j, HrItem hrItem, Spo2Item spo2Item, RecentAbnormalDataItem recentAbnormalDataItem, RecentAbnormalDataItem recentAbnormalDataItem2, RecentAbnormalDataItem recentAbnormalDataItem3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : hrItem, (i & 4) != 0 ? null : spo2Item, (i & 8) != 0 ? null : recentAbnormalDataItem, (i & 16) != 0 ? null : recentAbnormalDataItem2, (i & 32) != 0 ? null : recentAbnormalDataItem3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HrItem getLastHrItem() {
        return this.lastHrItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Spo2Item getLasSpo2Item() {
        return this.lasSpo2Item;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RecentAbnormalDataItem getAbnormalLowHrItem() {
        return this.abnormalLowHrItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RecentAbnormalDataItem getAbnormalHighHrItem() {
        return this.abnormalHighHrItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RecentAbnormalDataItem getAbnormalSpo2Item() {
        return this.abnormalSpo2Item;
    }

    @NotNull
    public final RecentDailyDataItem copy(long time, @Nullable HrItem lastHrItem, @Nullable Spo2Item lasSpo2Item, @Nullable RecentAbnormalDataItem abnormalLowHrItem, @Nullable RecentAbnormalDataItem abnormalHighHrItem, @Nullable RecentAbnormalDataItem abnormalSpo2Item) {
        return new RecentDailyDataItem(time, lastHrItem, lasSpo2Item, abnormalLowHrItem, abnormalHighHrItem, abnormalSpo2Item);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentDailyDataItem)) {
            return false;
        }
        RecentDailyDataItem recentDailyDataItem = (RecentDailyDataItem) other;
        return this.time == recentDailyDataItem.time && Intrinsics.areEqual(this.lastHrItem, recentDailyDataItem.lastHrItem) && Intrinsics.areEqual(this.lasSpo2Item, recentDailyDataItem.lasSpo2Item) && Intrinsics.areEqual(this.abnormalLowHrItem, recentDailyDataItem.abnormalLowHrItem) && Intrinsics.areEqual(this.abnormalHighHrItem, recentDailyDataItem.abnormalHighHrItem) && Intrinsics.areEqual(this.abnormalSpo2Item, recentDailyDataItem.abnormalSpo2Item);
    }

    @Nullable
    public final RecentAbnormalDataItem getAbnormalHighHrItem() {
        return this.abnormalHighHrItem;
    }

    @Nullable
    public final RecentAbnormalDataItem getAbnormalLowHrItem() {
        return this.abnormalLowHrItem;
    }

    @Nullable
    public final RecentAbnormalDataItem getAbnormalSpo2Item() {
        return this.abnormalSpo2Item;
    }

    @Nullable
    public final Spo2Item getLasSpo2Item() {
        return this.lasSpo2Item;
    }

    @Nullable
    public final HrItem getLastHrItem() {
        return this.lastHrItem;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        HrItem hrItem = this.lastHrItem;
        int iHashCode2 = (iHashCode + (hrItem == null ? 0 : hrItem.hashCode())) * 31;
        Spo2Item spo2Item = this.lasSpo2Item;
        int iHashCode3 = (iHashCode2 + (spo2Item == null ? 0 : spo2Item.hashCode())) * 31;
        RecentAbnormalDataItem recentAbnormalDataItem = this.abnormalLowHrItem;
        int iHashCode4 = (iHashCode3 + (recentAbnormalDataItem == null ? 0 : recentAbnormalDataItem.hashCode())) * 31;
        RecentAbnormalDataItem recentAbnormalDataItem2 = this.abnormalHighHrItem;
        int iHashCode5 = (iHashCode4 + (recentAbnormalDataItem2 == null ? 0 : recentAbnormalDataItem2.hashCode())) * 31;
        RecentAbnormalDataItem recentAbnormalDataItem3 = this.abnormalSpo2Item;
        return iHashCode5 + (recentAbnormalDataItem3 != null ? recentAbnormalDataItem3.hashCode() : 0);
    }

    public final void setAbnormalHighHrItem(@Nullable RecentAbnormalDataItem recentAbnormalDataItem) {
        this.abnormalHighHrItem = recentAbnormalDataItem;
    }

    public final void setAbnormalLowHrItem(@Nullable RecentAbnormalDataItem recentAbnormalDataItem) {
        this.abnormalLowHrItem = recentAbnormalDataItem;
    }

    public final void setAbnormalSpo2Item(@Nullable RecentAbnormalDataItem recentAbnormalDataItem) {
        this.abnormalSpo2Item = recentAbnormalDataItem;
    }

    public final void setLasSpo2Item(@Nullable Spo2Item spo2Item) {
        this.lasSpo2Item = spo2Item;
    }

    public final void setLastHrItem(@Nullable HrItem hrItem) {
        this.lastHrItem = hrItem;
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
        return "time " + this.time + ", lastHrItem " + this.lastHrItem + ", lasSpo2Item " + this.lasSpo2Item + ", abnormalLowHrItem " + this.abnormalLowHrItem + ", abnormalHighHrItem " + this.abnormalHighHrItem + ", abnormalSpo2Item " + this.abnormalSpo2Item;
    }

    public RecentDailyDataItem(long j, @Nullable HrItem hrItem, @Nullable Spo2Item spo2Item, @Nullable RecentAbnormalDataItem recentAbnormalDataItem, @Nullable RecentAbnormalDataItem recentAbnormalDataItem2, @Nullable RecentAbnormalDataItem recentAbnormalDataItem3) {
        super(null);
        this.time = j;
        this.lastHrItem = hrItem;
        this.lasSpo2Item = spo2Item;
        this.abnormalLowHrItem = recentAbnormalDataItem;
        this.abnormalHighHrItem = recentAbnormalDataItem2;
        this.abnormalSpo2Item = recentAbnormalDataItem3;
    }
}
