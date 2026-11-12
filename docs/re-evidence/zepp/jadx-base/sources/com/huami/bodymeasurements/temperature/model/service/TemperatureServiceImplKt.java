package com.huami.bodymeasurements.temperature.model.service;

import com.huami.bodymeasurements.temperature.model.converter.TempUnitConverter;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.huami.health.bodymeasurements.p014temperatureservice.Temperature;
import com.huami.health.bodymeasurements.p014temperatureservice.TemperatureUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "", "unit", "Lcom/huami/health/bodymeasurements/temperatureservice/Temperature;", "toTemperature", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class TemperatureServiceImplKt {
    @NotNull
    public static final Temperature toTemperature(@NotNull TemperatureVo temperatureVo, int i) {
        long timestamp = temperatureVo.getTimestamp();
        String tempString = TempUnitConverter.INSTANCE.getTempString(temperatureVo.getTemp());
        return new Temperature(timestamp, tempString == null ? 0.0f : Float.parseFloat(tempString), i == 0 ? TemperatureUnit.CENTIGRADE : TemperatureUnit.FAHRENHEIT);
    }
}
