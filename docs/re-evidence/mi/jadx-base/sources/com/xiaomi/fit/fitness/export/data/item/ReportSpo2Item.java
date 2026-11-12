package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport_eco.SportConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006'"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/ReportSpo2Item;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "dateTime", "", "time", "tzIn15Min", "", "spo2", "<init>", "(JJII)V", "getDateTime", "()J", "setDateTime", "(J)V", "getTime", "setTime", "getTzIn15Min", "()I", "setTzIn15Min", "(I)V", "getSpo2", "getTimestamp", "setTimestamp", "", SportConstants.KEY_TIMESTAMP, "toSpo2Item", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportSpo2Item extends DailyRecordItem {

    @SerializedName("date_time")
    private long dateTime;

    @SerializedName("spo2")
    private final int spo2;

    @SerializedName("time")
    private long time;

    @SerializedName("timezone")
    private int tzIn15Min;

    public /* synthetic */ ReportSpo2Item(long j, long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i3 & 4) != 0 ? 0 : i, i2);
    }

    public static /* synthetic */ ReportSpo2Item copy$default(ReportSpo2Item reportSpo2Item, long j, long j2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = reportSpo2Item.dateTime;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            j2 = reportSpo2Item.time;
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            i = reportSpo2Item.tzIn15Min;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = reportSpo2Item.spo2;
        }
        return reportSpo2Item.copy(j3, j4, i4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDateTime() {
        return this.dateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSpo2() {
        return this.spo2;
    }

    @NotNull
    public final ReportSpo2Item copy(long dateTime, long time, int tzIn15Min, int spo2) {
        return new ReportSpo2Item(dateTime, time, tzIn15Min, spo2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportSpo2Item)) {
            return false;
        }
        ReportSpo2Item reportSpo2Item = (ReportSpo2Item) other;
        return this.dateTime == reportSpo2Item.dateTime && this.time == reportSpo2Item.time && this.tzIn15Min == reportSpo2Item.tzIn15Min && this.spo2 == reportSpo2Item.spo2;
    }

    public final long getDateTime() {
        return this.dateTime;
    }

    public final int getSpo2() {
        return this.spo2;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.dateTime;
    }

    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.dateTime) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.tzIn15Min)) * 31) + Integer.hashCode(this.spo2);
    }

    public final void setDateTime(long j) {
        this.dateTime = j;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long timeStamp) {
        this.dateTime = timeStamp;
    }

    public final void setTzIn15Min(int i) {
        this.tzIn15Min = i;
    }

    @NotNull
    public final Spo2Item toSpo2Item() {
        int i = this.tzIn15Min * 900;
        Integer zoneOffsetInSec = getZoneOffsetInSec();
        return new Spo2Item(this.time + ((long) (i - (zoneOffsetInSec != null ? zoneOffsetInSec.intValue() : 0))), this.spo2);
    }

    @NotNull
    public String toString() {
        return "ReportSpo2Item(dateTime=" + this.dateTime + ", time=" + this.time + ", tzIn15Min=" + this.tzIn15Min + ", spo2=" + this.spo2 + ")";
    }

    public ReportSpo2Item(long j, long j2, int i, int i2) {
        super(null);
        this.dateTime = j;
        this.time = j2;
        this.tzIn15Min = i;
        this.spo2 = i2;
    }
}
