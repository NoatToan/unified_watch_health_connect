package com.xiaomi.fitness.health.todayhealth.model;

import com.xiaomi.fit.fitness.export.data.item.HrMeasureSource;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.todayhealth.utils.HeartReportUtils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 52\u00020\u0001:\u00015B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\"\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0018\u00010\"H\u0086@¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u0007J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010,\u001a\u00020\u0007HÆ\u0003JF\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0007HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/HeartHealthValueItem;", "Lcom/xiaomi/fit/fitness/export/data/ITimeData;", "time", "", "sid", "", "avgHr", "", "statue", "measureSource", "<init>", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "getTime", "()J", "setTime", "(J)V", "getSid", "()Ljava/lang/String;", "getAvgHr", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatue", "getMeasureSource", "()I", "dbTime", "getDbTime", "()Ljava/lang/Long;", "setDbTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTimestamp", "setTimestamp", "", "getPpgRecordData", "", "", "Lcom/xiaomi/fitness/health/todayhealth/model/HrDataItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHeartStatusString", "heartRateStatus", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/xiaomi/fitness/health/todayhealth/model/HeartHealthValueItem;", "equals", "", "other", "", "hashCode", "toString", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HeartHealthValueItem implements com.xiaomi.fit.fitness.export.data.ITimeData {

    @NotNull
    public static final String HR_INFO = "hr";

    @NotNull
    public static final String PPG_INFO = "ppg";

    @Nullable
    private final Integer avgHr;

    @Nullable
    private Long dbTime;
    private final int measureSource;

    @Nullable
    private final String sid;

    @Nullable
    private final Integer statue;
    private long time;

    public HeartHealthValueItem(long j, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @HrMeasureSource int i) {
        this.time = j;
        this.sid = str;
        this.avgHr = num;
        this.statue = num2;
        this.measureSource = i;
    }

    public static /* synthetic */ HeartHealthValueItem copy$default(HeartHealthValueItem heartHealthValueItem, long j, String str, Integer num, Integer num2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = heartHealthValueItem.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = heartHealthValueItem.sid;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            num = heartHealthValueItem.avgHr;
        }
        Integer num3 = num;
        if ((i2 & 8) != 0) {
            num2 = heartHealthValueItem.statue;
        }
        Integer num4 = num2;
        if ((i2 & 16) != 0) {
            i = heartHealthValueItem.measureSource;
        }
        return heartHealthValueItem.copy(j2, str2, num3, num4, i);
    }

    public static /* synthetic */ String getHeartStatusString$default(HeartHealthValueItem heartHealthValueItem, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            Integer num = heartHealthValueItem.statue;
            i = num != null ? num.intValue() : 0;
        }
        return heartHealthValueItem.getHeartStatusString(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStatue() {
        return this.statue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMeasureSource() {
        return this.measureSource;
    }

    @NotNull
    public final HeartHealthValueItem copy(long time, @Nullable String sid, @Nullable Integer avgHr, @Nullable Integer statue, @HrMeasureSource int measureSource) {
        return new HeartHealthValueItem(time, sid, avgHr, statue, measureSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartHealthValueItem)) {
            return false;
        }
        HeartHealthValueItem heartHealthValueItem = (HeartHealthValueItem) other;
        return this.time == heartHealthValueItem.time && Intrinsics.areEqual(this.sid, heartHealthValueItem.sid) && Intrinsics.areEqual(this.avgHr, heartHealthValueItem.avgHr) && Intrinsics.areEqual(this.statue, heartHealthValueItem.statue) && this.measureSource == heartHealthValueItem.measureSource;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Long getDbTime() {
        return this.dbTime;
    }

    @NotNull
    public final String getHeartStatusString(int heartRateStatus) {
        return HeartReportUtils.INSTANCE.getHeartRateStatusString(heartRateStatus);
    }

    public final int getMeasureSource() {
        return this.measureSource;
    }

    @Nullable
    public final Object getPpgRecordData(@NotNull Continuation<? super Map<String, ? extends List<HrDataItem>>> continuation) {
        String str = this.sid;
        if (str != null && this.dbTime != null) {
            return null;
        }
        Logger.i("HeartHealthValueItem info is null sid " + str + " db Time " + this.dbTime, new Object[0]);
        return null;
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final Integer getStatue() {
        return this.statue;
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
        String str = this.sid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.avgHr;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.statue;
        return ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.measureSource);
    }

    public final void setDbTime(@Nullable Long l) {
        this.dbTime = l;
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
        return "HeartHealthValueItem(time=" + this.time + ", sid=" + this.sid + ", avgHr=" + this.avgHr + ", statue=" + this.statue + ", measureSource=" + this.measureSource + ")";
    }
}
