package com.huami.bodymeasurements.temperature.model.converter;

import com.huami.bodymeasurements.common.business.history.HistoryDataItem;
import com.huami.bodymeasurements.temperature.view.TemperatureTypeConstants;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "Lcom/huami/bodymeasurements/common/business/history/HistoryDataItem;", "toHistoryDataItem", "", "type", "", "a", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class HistoryDataConverterKt {
    private static final boolean a(String str) {
        return Intrinsics.areEqual(str, TemperatureTypeConstants.MANUAL_TEMP);
    }

    @NotNull
    public static final HistoryDataItem toHistoryDataItem(@NotNull TemperatureVo temperatureVo) {
        return new HistoryDataItem(TempUnitConverter.INSTANCE.getTempWithUnitString(temperatureVo.getTemp()), temperatureVo.getTimestamp(), a(temperatureVo.getType()));
    }
}
