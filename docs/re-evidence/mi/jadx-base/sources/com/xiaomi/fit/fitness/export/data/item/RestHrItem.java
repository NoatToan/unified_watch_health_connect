package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/RestHrItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", "time", "", "restHr", "", "<init>", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getRestHr", "()I", "getPrimaryValue", "()Ljava/lang/Integer;", "getTimestamp", "setTimestamp", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RestHrItem extends DailyRecordItem implements IPointTimeData {

    @SerializedName("bpm")
    private final int restHr;

    @SerializedName("date_time")
    private long time;

    public RestHrItem(long j, int i) {
        super(null);
        this.time = j;
        this.restHr = i;
    }

    public static /* synthetic */ RestHrItem copy$default(RestHrItem restHrItem, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = restHrItem.time;
        }
        if ((i2 & 2) != 0) {
            i = restHrItem.restHr;
        }
        return restHrItem.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRestHr() {
        return this.restHr;
    }

    @NotNull
    public final RestHrItem copy(long time, int restHr) {
        return new RestHrItem(time, restHr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestHrItem)) {
            return false;
        }
        RestHrItem restHrItem = (RestHrItem) other;
        return this.time == restHrItem.time && this.restHr == restHrItem.restHr;
    }

    public final int getRestHr() {
        return this.restHr;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.restHr);
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
        return "RestHrItem(time=" + this.time + ", restHr=" + this.restHr + ")";
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem, com.xiaomi.fit.fitness.export.data.item.IPointTimeData
    @NotNull
    public Integer getPrimaryValue() {
        return Integer.valueOf(this.restHr);
    }
}
