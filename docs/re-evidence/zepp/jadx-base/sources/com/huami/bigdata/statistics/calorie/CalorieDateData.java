package com.huami.bigdata.statistics.calorie;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bigdata.statistics.core.annotation.Action;
import com.huami.bigdata.statistics.core.annotation.ActionType;
import com.huami.bigdata.statistics.core.entity.AbstractDateData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/huami/bigdata/statistics/calorie/CalorieDateData;", "Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "", "component1", "totalValue", "copy", "", "toString", "hashCode", "", "other", "", "equals", LogUtil.I, "getTotalValue", "()I", "setTotalValue", "(I)V", "<init>", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CalorieDateData extends AbstractDateData {

    @Action(type = ActionType.PLUS)
    private int totalValue;

    public CalorieDateData(int i) {
        super(null, 1, null);
        this.totalValue = i;
    }

    public static /* synthetic */ CalorieDateData copy$default(CalorieDateData calorieDateData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = calorieDateData.totalValue;
        }
        return calorieDateData.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalValue() {
        return this.totalValue;
    }

    @NotNull
    public final CalorieDateData copy(int totalValue) {
        return new CalorieDateData(totalValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CalorieDateData) && this.totalValue == ((CalorieDateData) other).totalValue;
    }

    public final int getTotalValue() {
        return this.totalValue;
    }

    public int hashCode() {
        return this.totalValue;
    }

    public final void setTotalValue(int i) {
        this.totalValue = i;
    }

    @Override // com.huami.bigdata.statistics.core.entity.AbstractDateData
    @NotNull
    public String toString() {
        return "CalorieDateData(totalValue=" + this.totalValue + ")";
    }
}
