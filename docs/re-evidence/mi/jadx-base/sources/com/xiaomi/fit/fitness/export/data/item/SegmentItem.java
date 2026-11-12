package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\u0006\u0010\u001c\u001a\u00020\tJ\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "startTime", "", "endTime", "items", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalItem;", "abnormalSetValue", "", "<init>", "(JJLjava/util/List;I)V", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "getItems", "()Ljava/util/List;", "getAbnormalSetValue", "()I", "setAbnormalSetValue", "(I)V", "getTimestamp", "setTimestamp", "", "time", "getDuration", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDailyDataItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyDataItem.kt\ncom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1081:1\n1863#2,2:1082\n*S KotlinDebug\n*F\n+ 1 DailyDataItem.kt\ncom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem\n*L\n97#1:1082,2\n*E\n"})
public final class SegmentItem extends DailyRecordItem {

    @SerializedName(TSMAuthContants.PARAM_THRESHOLD)
    private int abnormalSetValue;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    private long endTime;

    @SerializedName("items")
    @Nullable
    private final List<AbnormalItem> items;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    private long startTime;

    public /* synthetic */ SegmentItem(long j, long j2, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? 0 : i);
    }

    public final int getAbnormalSetValue() {
        return this.abnormalSetValue;
    }

    public final int getDuration() {
        long j = 60;
        return (int) ((this.endTime / j) - (this.startTime / j));
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final List<AbnormalItem> getItems() {
        return this.items;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        if (getDbTime() != null) {
            Long dbTime = getDbTime();
            long j = this.startTime;
            if (dbTime != null && dbTime.longValue() == j) {
                return this.startTime;
            }
        }
        return this.endTime;
    }

    public final void setAbnormalSetValue(int i) {
        this.abnormalSetValue = i;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        long j;
        if (getDbTime() != null) {
            Long dbTime = getDbTime();
            long j2 = this.startTime;
            if (dbTime != null && dbTime.longValue() == j2) {
                j = time - this.startTime;
                this.startTime = time;
                this.endTime += j;
            } else {
                j = time - this.endTime;
                this.endTime = time;
                this.startTime += j;
            }
        } else {
            j = time - this.endTime;
            this.endTime = time;
            this.startTime += j;
        }
        List<AbnormalItem> list = this.items;
        if (list != null) {
            for (AbnormalItem abnormalItem : list) {
                abnormalItem.setTime(abnormalItem.getTime() + j);
            }
        }
    }

    @NotNull
    public String toString() {
        return "SegmentItem(sid=" + getSid() + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", abnormalSetValue=" + this.abnormalSetValue + ", items=" + this.items + ")";
    }

    public SegmentItem(long j, long j2, @Nullable List<AbnormalItem> list, int i) {
        super(null);
        this.startTime = j;
        this.endTime = j2;
        this.items = list;
        this.abnormalSetValue = i;
    }
}
