package com.huami.bloodpressure_ui.history;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001d¨\u0006$"}, d2 = {"Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryEntity;", "", "", "isManual", "", "component1", "", "component2", "component3", "component4", BloodPressureConst.ParamKey.MEASURETIME, "sbq", "dbq", ParamKey.dataSource, "copy", "", "toString", "hashCode", "other", "equals", "J", "getMeasureTime", "()J", "setMeasureTime", "(J)V", LogUtil.I, "getSbq", "()I", "setSbq", "(I)V", "getDbq", "setDbq", "getDataSource", "setDataSource", "<init>", "(JIII)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureHistoryEntity {
    private int dataSource;
    private int dbq;
    private long measureTime;
    private int sbq;

    public BloodPressureHistoryEntity(long j, int i, int i2, int i3) {
        this.measureTime = j;
        this.sbq = i;
        this.dbq = i2;
        this.dataSource = i3;
    }

    public static /* synthetic */ BloodPressureHistoryEntity copy$default(BloodPressureHistoryEntity bloodPressureHistoryEntity, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = bloodPressureHistoryEntity.measureTime;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = bloodPressureHistoryEntity.sbq;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = bloodPressureHistoryEntity.dbq;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = bloodPressureHistoryEntity.dataSource;
        }
        return bloodPressureHistoryEntity.copy(j2, i5, i6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMeasureTime() {
        return this.measureTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSbq() {
        return this.sbq;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDbq() {
        return this.dbq;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDataSource() {
        return this.dataSource;
    }

    @NotNull
    public final BloodPressureHistoryEntity copy(long measureTime, int sbq, int dbq, int dataSource) {
        return new BloodPressureHistoryEntity(measureTime, sbq, dbq, dataSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureHistoryEntity)) {
            return false;
        }
        BloodPressureHistoryEntity bloodPressureHistoryEntity = (BloodPressureHistoryEntity) other;
        return this.measureTime == bloodPressureHistoryEntity.measureTime && this.sbq == bloodPressureHistoryEntity.sbq && this.dbq == bloodPressureHistoryEntity.dbq && this.dataSource == bloodPressureHistoryEntity.dataSource;
    }

    public final int getDataSource() {
        return this.dataSource;
    }

    public final int getDbq() {
        return this.dbq;
    }

    public final long getMeasureTime() {
        return this.measureTime;
    }

    public final int getSbq() {
        return this.sbq;
    }

    public int hashCode() {
        return (((((b.a(this.measureTime) * 31) + this.sbq) * 31) + this.dbq) * 31) + this.dataSource;
    }

    public final boolean isManual() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 0}).contains(Integer.valueOf(this.dataSource));
    }

    public final void setDataSource(int i) {
        this.dataSource = i;
    }

    public final void setDbq(int i) {
        this.dbq = i;
    }

    public final void setMeasureTime(long j) {
        this.measureTime = j;
    }

    public final void setSbq(int i) {
        this.sbq = i;
    }

    @NotNull
    public String toString() {
        return "BloodPressureHistoryEntity(measureTime=" + this.measureTime + ", sbq=" + this.sbq + ", dbq=" + this.dbq + ", dataSource=" + this.dataSource + ")";
    }

    public /* synthetic */ BloodPressureHistoryEntity(long j, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, i, i2, i3);
    }
}
