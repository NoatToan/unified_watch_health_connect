package com.huami.bigdata.statistics.calorie;

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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/huami/bigdata/statistics/calorie/CalorieStatistics;", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", "Lcom/huami/bigdata/statistics/calorie/CalorieDateData;", "", "component1", "component2", "component3", "totalValue", "avgValue", "totalSize", "copy", "", "toString", "hashCode", "", "other", "", "equals", LogUtil.I, "getTotalValue", "()I", "setTotalValue", "(I)V", "getAvgValue", "setAvgValue", "getTotalSize", "setTotalSize", "<init>", "(III)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CalorieStatistics extends AbstractStatistics<CalorieDateData> {

    @Action(type = ActionType.AVG)
    private int avgValue;

    @Action(type = ActionType.PLUS)
    private int totalSize;

    @Action(type = ActionType.PLUS)
    private int totalValue;

    public CalorieStatistics() {
        this(0, 0, 0, 7, null);
    }

    public /* synthetic */ CalorieStatistics(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public static /* synthetic */ CalorieStatistics copy$default(CalorieStatistics calorieStatistics, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = calorieStatistics.totalValue;
        }
        if ((i4 & 2) != 0) {
            i2 = calorieStatistics.avgValue;
        }
        if ((i4 & 4) != 0) {
            i3 = calorieStatistics.totalSize;
        }
        return calorieStatistics.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalValue() {
        return this.totalValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvgValue() {
        return this.avgValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalSize() {
        return this.totalSize;
    }

    @NotNull
    public final CalorieStatistics copy(int totalValue, int avgValue, int totalSize) {
        return new CalorieStatistics(totalValue, avgValue, totalSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalorieStatistics)) {
            return false;
        }
        CalorieStatistics calorieStatistics = (CalorieStatistics) other;
        return this.totalValue == calorieStatistics.totalValue && this.avgValue == calorieStatistics.avgValue && this.totalSize == calorieStatistics.totalSize;
    }

    public final int getAvgValue() {
        return this.avgValue;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public final int getTotalValue() {
        return this.totalValue;
    }

    public int hashCode() {
        return (((this.totalValue * 31) + this.avgValue) * 31) + this.totalSize;
    }

    public final void setAvgValue(int i) {
        this.avgValue = i;
    }

    public final void setTotalSize(int i) {
        this.totalSize = i;
    }

    public final void setTotalValue(int i) {
        this.totalValue = i;
    }

    @Override // com.huami.bigdata.statistics.core.entity.AbstractStatistics
    @NotNull
    public String toString() {
        return "CalorieStatistics(totalValue=" + this.totalValue + ", avgValue=" + this.avgValue + ", totalSize=" + this.totalSize + ")";
    }

    public CalorieStatistics(int i, int i2, int i3) {
        this.totalValue = i;
        this.avgValue = i2;
        this.totalSize = i3;
    }
}
