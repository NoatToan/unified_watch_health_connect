package com.huami.bigdata.statistics.bloodpressure;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bigdata.statistics.core.annotation.Action;
import com.huami.bigdata.statistics.core.annotation.ActionType;
import com.huami.bigdata.statistics.core.entity.AbstractDateData;
import defpackage.dz;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JO\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureDateData;", "Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "component7", "maxSbp", "minSbp", "avgSbp", "maxDbp", "minDbp", "avgDbp", "totalSize", "copy", "", "toString", "hashCode", "", "other", "", "equals", LogUtil.I, "getMaxSbp", "()I", "setMaxSbp", "(I)V", "getMinSbp", "setMinSbp", LogUtil.D, "getAvgSbp", "()D", "setAvgSbp", "(D)V", "getMaxDbp", "setMaxDbp", "getMinDbp", "setMinDbp", "getAvgDbp", "setAvgDbp", "getTotalSize", "setTotalSize", "<init>", "(IIDIIDI)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureDateData extends AbstractDateData {

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

    public /* synthetic */ BloodPressureDateData(int i, int i2, double d, int i3, int i4, double d2, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, d, i3, i4, d2, (i6 & 64) != 0 ? 0 : i5);
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
    public final double getAvgSbp() {
        return this.avgSbp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxDbp() {
        return this.maxDbp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMinDbp() {
        return this.minDbp;
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
    public final BloodPressureDateData copy(int maxSbp, int minSbp, double avgSbp, int maxDbp, int minDbp, double avgDbp, int totalSize) {
        return new BloodPressureDateData(maxSbp, minSbp, avgSbp, maxDbp, minDbp, avgDbp, totalSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureDateData)) {
            return false;
        }
        BloodPressureDateData bloodPressureDateData = (BloodPressureDateData) other;
        return this.maxSbp == bloodPressureDateData.maxSbp && this.minSbp == bloodPressureDateData.minSbp && Intrinsics.areEqual((Object) Double.valueOf(this.avgSbp), (Object) Double.valueOf(bloodPressureDateData.avgSbp)) && this.maxDbp == bloodPressureDateData.maxDbp && this.minDbp == bloodPressureDateData.minDbp && Intrinsics.areEqual((Object) Double.valueOf(this.avgDbp), (Object) Double.valueOf(bloodPressureDateData.avgDbp)) && this.totalSize == bloodPressureDateData.totalSize;
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
        return (((((((((((this.maxSbp * 31) + this.minSbp) * 31) + dz.a(this.avgSbp)) * 31) + this.maxDbp) * 31) + this.minDbp) * 31) + dz.a(this.avgDbp)) * 31) + this.totalSize;
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

    @Override // com.huami.bigdata.statistics.core.entity.AbstractDateData
    @NotNull
    public String toString() {
        return "BloodPressureDateData(maxSbp=" + this.maxSbp + ", minSbp=" + this.minSbp + ", avgSbp=" + this.avgSbp + ", maxDbp=" + this.maxDbp + ", minDbp=" + this.minDbp + ", avgDbp=" + this.avgDbp + ", totalSize=" + this.totalSize + ")";
    }

    public BloodPressureDateData(int i, int i2, double d, int i3, int i4, double d2, int i5) {
        super(null, 1, null);
        this.maxSbp = i;
        this.minSbp = i2;
        this.avgSbp = d;
        this.maxDbp = i3;
        this.minDbp = i4;
        this.avgDbp = d2;
        this.totalSize = i5;
    }
}
