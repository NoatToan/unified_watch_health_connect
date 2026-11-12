package com.xiaomi.fit.fitness.export.data.aggregation;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010&\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020\u001eH&J\b\u0010(\u001a\u00020\u0015H\u0016R\u0018\u0010\u0005\u001a\u00020\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000f¨\u0006)"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/ISummary;", "Ljava/io/Serializable;", "<init>", "()V", "time", "", "getTime", "()J", "setTime", "(J)V", "timeInZero", "getTimeInZero", "()Ljava/lang/Long;", "setTimeInZero", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "updateTime", "getUpdateTime", "setUpdateTime", "tag", "", "getTag$annotations", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "hasNewAbnormalRecord", "", "getHasNewAbnormalRecord", "()Z", "setHasNewAbnormalRecord", "(Z)V", "latestAbnormalRecordTime", "getLatestAbnormalRecordTime", "setLatestAbnormalRecordTime", "getTimeStamp", "isEmpty", "simpleInfo", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DailyBasicReport implements ISummary, Serializable {
    private transient boolean hasNewAbnormalRecord;

    @Nullable
    private transient Long latestAbnormalRecordTime;

    @Nullable
    private Long timeInZero;

    @Nullable
    private Long updateTime;

    public static /* synthetic */ void getTag$annotations() {
    }

    public final boolean getHasNewAbnormalRecord() {
        return this.hasNewAbnormalRecord;
    }

    @Nullable
    public final Long getLatestAbnormalRecordTime() {
        return this.latestAbnormalRecordTime;
    }

    @Nullable
    public abstract String getSid();

    @NotNull
    public abstract String getTag();

    public abstract long getTime();

    @Nullable
    public final Long getTimeInZero() {
        return this.timeInZero;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.ISummary
    public long getTimeStamp() {
        return getTime();
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public abstract boolean isEmpty();

    public final void setHasNewAbnormalRecord(boolean z) {
        this.hasNewAbnormalRecord = z;
    }

    public final void setLatestAbnormalRecordTime(@Nullable Long l) {
        this.latestAbnormalRecordTime = l;
    }

    public abstract void setSid(@Nullable String str);

    public abstract void setTime(long j);

    public final void setTimeInZero(@Nullable Long l) {
        this.timeInZero = l;
    }

    public final void setUpdateTime(@Nullable Long l) {
        this.updateTime = l;
    }

    @NotNull
    public String simpleInfo() {
        return toString();
    }
}
