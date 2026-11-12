package com.xiaomi.fitness.sport_eco.ftp;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ChartDataEntity;", "", "xAxis", "", "yAxis", "<init>", "(FF)V", "getXAxis", "()F", "getYAxis", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChartDataEntity {
    private final float xAxis;
    private final float yAxis;

    public ChartDataEntity(float f, float f2) {
        this.xAxis = f;
        this.yAxis = f2;
    }

    public static /* synthetic */ ChartDataEntity copy$default(ChartDataEntity chartDataEntity, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = chartDataEntity.xAxis;
        }
        if ((i & 2) != 0) {
            f2 = chartDataEntity.yAxis;
        }
        return chartDataEntity.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getXAxis() {
        return this.xAxis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getYAxis() {
        return this.yAxis;
    }

    @NotNull
    public final ChartDataEntity copy(float xAxis, float yAxis) {
        return new ChartDataEntity(xAxis, yAxis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDataEntity)) {
            return false;
        }
        ChartDataEntity chartDataEntity = (ChartDataEntity) other;
        return Float.compare(this.xAxis, chartDataEntity.xAxis) == 0 && Float.compare(this.yAxis, chartDataEntity.yAxis) == 0;
    }

    public final float getXAxis() {
        return this.xAxis;
    }

    public final float getYAxis() {
        return this.yAxis;
    }

    public int hashCode() {
        return (Float.hashCode(this.xAxis) * 31) + Float.hashCode(this.yAxis);
    }

    @NotNull
    public String toString() {
        return "ChartDataEntity(xAxis=" + this.xAxis + ", yAxis=" + this.yAxis + ")";
    }
}
