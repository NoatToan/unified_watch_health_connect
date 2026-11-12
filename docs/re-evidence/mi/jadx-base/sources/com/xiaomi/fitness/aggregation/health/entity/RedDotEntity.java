package com.xiaomi.fitness.aggregation.health.entity;

import androidx.room.Entity;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.RedDotItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"dataType", "timeInZero"}, tableName = "red_dot")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/entity/RedDotEntity;", "Lcom/xiaomi/fitness/aggregation/health/entity/CloudEntity;", "sid", "", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "updateTime", "", "timeInZero", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JJ)V", "getSid", "()Ljava/lang/String;", "getDataType", "()Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getUpdateTime", "()J", "getTimeInZero", "toRedDotItem", "Lcom/xiaomi/fit/fitness/export/data/item/RedDotItem;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RedDotEntity extends CloudEntity {

    @NotNull
    private final HomeDataType dataType;

    @NotNull
    private final String sid;
    private final long timeInZero;
    private final long updateTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedDotEntity(@NotNull String sid, @NotNull HomeDataType dataType, long j, long j2) {
        super(sid, dataType, j, j2, null);
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        this.sid = sid;
        this.dataType = dataType;
        this.updateTime = j;
        this.timeInZero = j2;
    }

    public static /* synthetic */ RedDotEntity copy$default(RedDotEntity redDotEntity, String str, HomeDataType homeDataType, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redDotEntity.sid;
        }
        if ((i & 2) != 0) {
            homeDataType = redDotEntity.dataType;
        }
        HomeDataType homeDataType2 = homeDataType;
        if ((i & 4) != 0) {
            j = redDotEntity.updateTime;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = redDotEntity.timeInZero;
        }
        return redDotEntity.copy(str, homeDataType2, j3, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HomeDataType getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimeInZero() {
        return this.timeInZero;
    }

    @NotNull
    public final RedDotEntity copy(@NotNull String sid, @NotNull HomeDataType dataType, long updateTime, long timeInZero) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return new RedDotEntity(sid, dataType, updateTime, timeInZero);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedDotEntity)) {
            return false;
        }
        RedDotEntity redDotEntity = (RedDotEntity) other;
        return Intrinsics.areEqual(this.sid, redDotEntity.sid) && this.dataType == redDotEntity.dataType && this.updateTime == redDotEntity.updateTime && this.timeInZero == redDotEntity.timeInZero;
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

    public int hashCode() {
        return (((((this.sid.hashCode() * 31) + this.dataType.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + Long.hashCode(this.timeInZero);
    }

    @NotNull
    public final RedDotItem toRedDotItem() {
        return new RedDotItem(getDataType(), FitnessDateUtils.changeToDestZeroTimeOneDay(getTimeInZero(), 0, FitnessDateUtils.getCurrentTZOffsetInSec()), getTimeInZero());
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CloudEntity
    @NotNull
    public String toString() {
        return "RedDotEntity(sid=" + this.sid + ", dataType=" + this.dataType + ", updateTime=" + this.updateTime + ", timeInZero=" + this.timeInZero + ")";
    }
}
