package com.huami.bigdata.statistics.common;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bigdata.statistics.core.annotation.Action;
import com.huami.bigdata.statistics.core.annotation.ActionType;
import com.huami.bigdata.statistics.core.entity.AbstractStatistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Lcom/huami/bigdata/statistics/common/CommonStatistics;", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", "Lcom/huami/bigdata/statistics/common/CommonDateData;", "", "component1", "component2", "component3", "component4", "maxValue", "minValue", "avgValue", "totalSize", "copy", "", "toString", "hashCode", "", "other", "", "equals", LogUtil.I, "getMaxValue", "()I", "setMaxValue", "(I)V", "getMinValue", "setMinValue", "getAvgValue", "setAvgValue", "getTotalSize", "setTotalSize", "<init>", "(IIII)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CommonStatistics extends AbstractStatistics<CommonDateData> {

    @Action(type = ActionType.AVG)
    private int avgValue;

    @Action(type = ActionType.MAX)
    private int maxValue;

    @Action(type = ActionType.MIN)
    private int minValue;

    @Action(type = ActionType.PLUS)
    private int totalSize;

    public CommonStatistics() {
        this(0, 0, 0, 0, 15, null);
    }

    public /* synthetic */ CommonStatistics(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? -1 : i, (i5 & 2) != 0 ? -1 : i2, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public static /* synthetic */ CommonStatistics copy$default(CommonStatistics commonStatistics, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = commonStatistics.maxValue;
        }
        if ((i5 & 2) != 0) {
            i2 = commonStatistics.minValue;
        }
        if ((i5 & 4) != 0) {
            i3 = commonStatistics.avgValue;
        }
        if ((i5 & 8) != 0) {
            i4 = commonStatistics.totalSize;
        }
        return commonStatistics.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAvgValue() {
        return this.avgValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalSize() {
        return this.totalSize;
    }

    @NotNull
    public final CommonStatistics copy(int maxValue, int minValue, int avgValue, int totalSize) {
        return new CommonStatistics(maxValue, minValue, avgValue, totalSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonStatistics)) {
            return false;
        }
        CommonStatistics commonStatistics = (CommonStatistics) other;
        return this.maxValue == commonStatistics.maxValue && this.minValue == commonStatistics.minValue && this.avgValue == commonStatistics.avgValue && this.totalSize == commonStatistics.totalSize;
    }

    public final int getAvgValue() {
        return this.avgValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        return (((((this.maxValue * 31) + this.minValue) * 31) + this.avgValue) * 31) + this.totalSize;
    }

    public final void setAvgValue(int i) {
        this.avgValue = i;
    }

    public final void setMaxValue(int i) {
        this.maxValue = i;
    }

    public final void setMinValue(int i) {
        this.minValue = i;
    }

    public final void setTotalSize(int i) {
        this.totalSize = i;
    }

    @Override // com.huami.bigdata.statistics.core.entity.AbstractStatistics
    @NotNull
    public String toString() {
        return "CommonStatistics(maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", avgValue=" + this.avgValue + ", totalSize=" + this.totalSize + ")";
    }

    public CommonStatistics(int i, int i2, int i3, int i4) {
        this.maxValue = i;
        this.minValue = i2;
        this.avgValue = i3;
        this.totalSize = i4;
    }
}
