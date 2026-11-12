package com.huami.bigdata.statistics.bloodpressure;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bigdata.statistics.core.annotation.Action;
import com.huami.bigdata.statistics.core.annotation.ActionType;
import com.huami.bigdata.statistics.core.entity.AbstractStatistics;
import defpackage.dz;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003JO\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010&\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\"\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001f¨\u00061"}, d2 = {"Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureStatistics;", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureDateData;", "", "component1", "component2", "component3", "component4", "", "component5", "component6", "component7", "maxSbp", "minSbp", "maxDbp", "minDbp", "avgSbp", "avgDbp", "totalSize", "copy", "", "toString", "hashCode", "", "other", "", "equals", LogUtil.I, "getMaxSbp", "()I", "setMaxSbp", "(I)V", "getMinSbp", "setMinSbp", "getMaxDbp", "setMaxDbp", "getMinDbp", "setMinDbp", LogUtil.D, "getAvgSbp", "()D", "setAvgSbp", "(D)V", "getAvgDbp", "setAvgDbp", "getTotalSize", "setTotalSize", "<init>", "(IIIIDDI)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureStatistics extends AbstractStatistics<BloodPressureDateData> {

    @Action(type = ActionType.AVG)
    private double avgDbp;

    @Action(type = ActionType.AVG)
    private double avgSbp;

    @Action(type = ActionType.MAX)
    private int maxDbp;

    @Action(type = ActionType.MAX)
    private int maxSbp;

    @Action(type = ActionType.MIN)
    private int minDbp;

    @Action(type = ActionType.MIN)
    private int minSbp;

    @Action(type = ActionType.PLUS)
    private int totalSize;

    public BloodPressureStatistics() {
        this(0, 0, 0, 0, 0.0d, 0.0d, 0, 127, null);
    }

    public /* synthetic */ BloodPressureStatistics(int i, int i2, int i3, int i4, double d, double d2, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? -1.0d : d, (i6 & 32) == 0 ? d2 : -1.0d, (i6 & 64) == 0 ? i5 : 0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxSbp() {
        return this.maxSbp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinSbp() {
        return this.minSbp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxDbp() {
        return this.maxDbp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMinDbp() {
        return this.minDbp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getAvgSbp() {
        return this.avgSbp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getAvgDbp() {
        return this.avgDbp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTotalSize() {
        return this.totalSize;
    }

    @NotNull
    public final BloodPressureStatistics copy(int maxSbp, int minSbp, int maxDbp, int minDbp, double avgSbp, double avgDbp, int totalSize) {
        return new BloodPressureStatistics(maxSbp, minSbp, maxDbp, minDbp, avgSbp, avgDbp, totalSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureStatistics)) {
            return false;
        }
        BloodPressureStatistics bloodPressureStatistics = (BloodPressureStatistics) other;
        return this.maxSbp == bloodPressureStatistics.maxSbp && this.minSbp == bloodPressureStatistics.minSbp && this.maxDbp == bloodPressureStatistics.maxDbp && this.minDbp == bloodPressureStatistics.minDbp && Intrinsics.areEqual((Object) Double.valueOf(this.avgSbp), (Object) Double.valueOf(bloodPressureStatistics.avgSbp)) && Intrinsics.areEqual((Object) Double.valueOf(this.avgDbp), (Object) Double.valueOf(bloodPressureStatistics.avgDbp)) && this.totalSize == bloodPressureStatistics.totalSize;
    }

    public final double getAvgDbp() {
        return this.avgDbp;
    }

    public final double getAvgSbp() {
        return this.avgSbp;
    }

    public final int getMaxDbp() {
        return this.maxDbp;
    }

    public final int getMaxSbp() {
        return this.maxSbp;
    }

    public final int getMinDbp() {
        return this.minDbp;
    }

    public final int getMinSbp() {
        return this.minSbp;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        return (((((((((((this.maxSbp * 31) + this.minSbp) * 31) + this.maxDbp) * 31) + this.minDbp) * 31) + dz.a(this.avgSbp)) * 31) + dz.a(this.avgDbp)) * 31) + this.totalSize;
    }

    public final void setAvgDbp(double d) {
        this.avgDbp = d;
    }

    public final void setAvgSbp(double d) {
        this.avgSbp = d;
    }

    public final void setMaxDbp(int i) {
        this.maxDbp = i;
    }

    public final void setMaxSbp(int i) {
        this.maxSbp = i;
    }

    public final void setMinDbp(int i) {
        this.minDbp = i;
    }

    public final void setMinSbp(int i) {
        this.minSbp = i;
    }

    public final void setTotalSize(int i) {
        this.totalSize = i;
    }

    @Override // com.huami.bigdata.statistics.core.entity.AbstractStatistics
    @NotNull
    public String toString() {
        return "BloodPressureStatistics(maxSbp=" + this.maxSbp + ", minSbp=" + this.minSbp + ", maxDbp=" + this.maxDbp + ", minDbp=" + this.minDbp + ", avgSbp=" + this.avgSbp + ", avgDbp=" + this.avgDbp + ", totalSize=" + this.totalSize + ")";
    }

    public BloodPressureStatistics(int i, int i2, int i3, int i4, double d, double d2, int i5) {
        this.maxSbp = i;
        this.minSbp = i2;
        this.maxDbp = i3;
        this.minDbp = i4;
        this.avgSbp = d;
        this.avgDbp = d2;
        this.totalSize = i5;
    }
}
