package com.xiaomi.fitness.aggregation.health.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"dataType", "sid", "timeInZero", CloudContract.COL_VIEW_TAG}, tableName = "daily_report")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/entity/FitnessDailyReportEntity;", "Lcom/xiaomi/fitness/aggregation/health/entity/CloudEntity;", "sid", "", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "updateTime", "", "timeInZero", CloudContract.COL_VIEW_TAG, "value", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JJLjava/lang/String;Ljava/lang/String;)V", "getSid", "()Ljava/lang/String;", "getDataType", "()Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getUpdateTime", "()J", "getTimeInZero", "getViewTag", "getValue", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessDailyReportEntity extends CloudEntity {

    @NotNull
    private final HomeDataType dataType;

    @NotNull
    private final String sid;
    private final long timeInZero;
    private final long updateTime;

    @ColumnInfo(name = "value")
    @NotNull
    private final String value;

    @ColumnInfo(name = CloudContract.COL_VIEW_TAG)
    @NotNull
    private final String viewTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitnessDailyReportEntity(@NotNull String sid, @NotNull HomeDataType dataType, long j, long j2, @NotNull String viewTag, @NotNull String value) {
        super(sid, dataType, j, j2, null);
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(value, "value");
        this.sid = sid;
        this.dataType = dataType;
        this.updateTime = j;
        this.timeInZero = j2;
        this.viewTag = viewTag;
        this.value = value;
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CloudEntity
    @NotNull
    public HomeDataType getDataType() {
        return this.dataType;
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CloudEntity
    @NotNull
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CloudEntity
    public long getTimeInZero() {
        return this.timeInZero;
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CloudEntity
    public long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final String getViewTag() {
        return this.viewTag;
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CloudEntity
    @NotNull
    public String toString() {
        return "FitnessDailyReportEntity(sid=" + getSid() + ", viewTag='" + this.viewTag + "', value='" + this.value + "')" + super.toString();
    }
}
