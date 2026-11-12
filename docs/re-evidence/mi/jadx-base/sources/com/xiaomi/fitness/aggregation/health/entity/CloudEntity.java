package com.xiaomi.fitness.aggregation.health.entity;

import androidx.room.ColumnInfo;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.common.utils.TimeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00138\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00138\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016\u0082\u0001\u0003\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/entity/CloudEntity;", "", "sid", "", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "updateTime", "", "timeInZero", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JJ)V", "getSid", "()Ljava/lang/String;", "getDataType", "()Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getUpdateTime", "()J", "getTimeInZero", "isUpload", "", "()Z", "setUpload", "(Z)V", "isDeleted", "setDeleted", "toString", "Lcom/xiaomi/fitness/aggregation/health/entity/FitnessDailyReportEntity;", "Lcom/xiaomi/fitness/aggregation/health/entity/FitnessDeviceItemEntity;", "Lcom/xiaomi/fitness/aggregation/health/entity/RedDotEntity;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CloudEntity {

    @ColumnInfo(name = "dataType")
    @NotNull
    private final HomeDataType dataType;

    @ColumnInfo(name = "isDeleted")
    private boolean isDeleted;

    @ColumnInfo(name = "isUpload")
    private boolean isUpload;

    @ColumnInfo(name = "sid")
    @NotNull
    private final String sid;

    @ColumnInfo(name = "timeInZero")
    private final long timeInZero;

    @ColumnInfo(name = "updateTime")
    private final long updateTime;

    public /* synthetic */ CloudEntity(String str, HomeDataType homeDataType, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, homeDataType, j, j2);
    }

    @NotNull
    public HomeDataType getDataType() {
        return this.dataType;
    }

    @NotNull
    public String getSid() {
        return this.sid;
    }

    public long getTimeInZero() {
        return this.timeInZero;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: isDeleted, reason: from getter */
    public boolean getIsDeleted() {
        return this.isDeleted;
    }

    /* JADX INFO: renamed from: isUpload, reason: from getter */
    public boolean getIsUpload() {
        return this.isUpload;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setUpload(boolean z) {
        this.isUpload = z;
    }

    @NotNull
    public String toString() {
        return "CloudEntity(dataType=" + getDataType() + ", timeInZero=" + getTimeInZero() + ", timeInZero=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTimeInZero() * ((long) 1000))) + ", sid=" + getSid() + ", isUpload=" + getIsUpload() + ", isDeleted=" + getIsDeleted() + ", updateTime=" + getUpdateTime();
    }

    private CloudEntity(String str, HomeDataType homeDataType, long j, long j2) {
        this.sid = str;
        this.dataType = homeDataType;
        this.updateTime = j;
        this.timeInZero = j2;
    }
}
