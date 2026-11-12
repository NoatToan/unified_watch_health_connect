package com.xiaomi.fit.fitness.export.data.item;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J'\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItemModel;", "", "time", "", "zoneOffsetInSec", "", "item", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "<init>", "(JILcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "getTime", "()J", "setTime", "(J)V", "getZoneOffsetInSec", "()I", "setZoneOffsetInSec", "(I)V", "getItem", "()Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "zoneName", "", "getZoneName", "()Ljava/lang/String;", "setZoneName", "(Ljava/lang/String;)V", "isCompleteSleep", "", "()Ljava/lang/Boolean;", "setCompleteSleep", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyRecordItemModel {

    @Nullable
    private Boolean isCompleteSleep;

    @NotNull
    private final DailyRecordItem item;
    private long time;

    @Nullable
    private String zoneName;
    private int zoneOffsetInSec;

    public DailyRecordItemModel(long j, int i, @NotNull DailyRecordItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.time = j;
        this.zoneOffsetInSec = i;
        this.item = item;
        this.zoneName = getZoneName(i);
    }

    public static /* synthetic */ DailyRecordItemModel copy$default(DailyRecordItemModel dailyRecordItemModel, long j, int i, DailyRecordItem dailyRecordItem, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = dailyRecordItemModel.time;
        }
        if ((i2 & 2) != 0) {
            i = dailyRecordItemModel.zoneOffsetInSec;
        }
        if ((i2 & 4) != 0) {
            dailyRecordItem = dailyRecordItemModel.item;
        }
        return dailyRecordItemModel.copy(j, i, dailyRecordItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DailyRecordItem getItem() {
        return this.item;
    }

    @NotNull
    public final DailyRecordItemModel copy(long time, int zoneOffsetInSec, @NotNull DailyRecordItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new DailyRecordItemModel(time, zoneOffsetInSec, item);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyRecordItemModel)) {
            return false;
        }
        DailyRecordItemModel dailyRecordItemModel = (DailyRecordItemModel) other;
        return this.time == dailyRecordItemModel.time && this.zoneOffsetInSec == dailyRecordItemModel.zoneOffsetInSec && Intrinsics.areEqual(this.item, dailyRecordItemModel.item);
    }

    @NotNull
    public final DailyRecordItem getItem() {
        return this.item;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    public int hashCode() {
        return (((Long.hashCode(this.time) * 31) + Integer.hashCode(this.zoneOffsetInSec)) * 31) + this.item.hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: isCompleteSleep, reason: from getter */
    public final Boolean getIsCompleteSleep() {
        return this.isCompleteSleep;
    }

    public final void setCompleteSleep(@Nullable Boolean bool) {
        this.isCompleteSleep = bool;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setZoneName(@Nullable String str) {
        this.zoneName = str;
    }

    public final void setZoneOffsetInSec(int i) {
        this.zoneOffsetInSec = i;
    }

    @NotNull
    public String toString() {
        return "DailyRecordItemModel(time=" + this.time + ", zoneOffsetInSec=" + this.zoneOffsetInSec + ", item=" + this.item + ")";
    }

    @Nullable
    public final String getZoneName(int zoneOffsetInSec) {
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        String currentTimeZoneID = FitnessDateUtils.getCurrentTimeZoneID();
        if (currentTZOffsetInSec == zoneOffsetInSec) {
            return currentTimeZoneID;
        }
        return null;
    }
}
