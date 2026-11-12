package com.huami.heartrate.vo;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/heartrate/vo/BarChartVo;", "Lcom/huami/heartrate/vo/BarPeriodInfo;", "toBarPeriodInfo", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class BarPeriodInfoKt {
    @NotNull
    public static final BarPeriodInfo toBarPeriodInfo(@NotNull BarChartVo barChartVo) {
        int[] heartRateValue = barChartVo.getHeartRateValue();
        int iFirst = heartRateValue == null ? 0 : ArraysKt___ArraysKt.first(heartRateValue);
        int[] heartRateValue2 = barChartVo.getHeartRateValue();
        return new BarPeriodInfo(iFirst, heartRateValue2 == null ? 0 : ArraysKt___ArraysKt.last(heartRateValue2), barChartVo.getExtra(), null, 8, null);
    }
}
