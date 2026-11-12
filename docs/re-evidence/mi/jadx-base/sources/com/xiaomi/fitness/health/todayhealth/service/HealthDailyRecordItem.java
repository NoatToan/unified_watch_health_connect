package com.xiaomi.fitness.health.todayhealth.service;

import com.xiaomi.fit.fitness.export.data.ITimeData;
import com.xiaomi.fit.fitness.export.data.item.IPointTimeData;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/service/HealthDailyRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/ITimeData;", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", "Ljava/io/Serializable;", "<init>", "()V", "dbKey", "", "getDbKey", "()Ljava/lang/String;", "setDbKey", "(Ljava/lang/String;)V", "dbTime", "", "getDbTime", "()Ljava/lang/Long;", "setDbTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "sid", "getSid", "setSid", "zoneOffsetInSec", "", "getZoneOffsetInSec", "()Ljava/lang/Integer;", "setZoneOffsetInSec", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "clearDataNotSaveToDb", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HealthDailyRecordItem implements ITimeData, IPointTimeData, Serializable {

    @Nullable
    private String dbKey;

    @Nullable
    private Long dbTime;

    @Nullable
    private String sid;

    @Nullable
    private transient Integer zoneOffsetInSec;

    private HealthDailyRecordItem() {
    }

    public /* synthetic */ HealthDailyRecordItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void clearDataNotSaveToDb() {
        this.dbKey = null;
        this.dbTime = null;
        this.sid = null;
    }

    @Nullable
    public final String getDbKey() {
        return this.dbKey;
    }

    @Nullable
    public final Long getDbTime() {
        return this.dbTime;
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.IPointTimeData
    @NotNull
    public Number getPrimaryValue() {
        return IPointTimeData.DefaultImpls.getPrimaryValue(this);
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.IPointTimeData
    @NotNull
    public Number getSecondaryValue() {
        return IPointTimeData.DefaultImpls.getSecondaryValue(this);
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final Integer getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    public final void setDbKey(@Nullable String str) {
        this.dbKey = str;
    }

    public final void setDbTime(@Nullable Long l) {
        this.dbTime = l;
    }

    public final void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setZoneOffsetInSec(@Nullable Integer num) {
        this.zoneOffsetInSec = num;
    }
}
