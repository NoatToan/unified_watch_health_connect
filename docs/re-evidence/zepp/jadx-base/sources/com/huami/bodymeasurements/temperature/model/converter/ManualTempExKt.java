package com.huami.bodymeasurements.temperature.model.converter;

import com.huami.bodymeasurements.temperature.model.local.entity.ManualTempEntity;
import com.huami.bodymeasurements.temperature.model.remote.bean.ManualTempBean;
import com.huami.bodymeasurements.temperature.view.TemperatureTypeConstants;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import kotlin.Metadata;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0006"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/entity/ManualTempEntity;", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "toTemperatureVo", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/ManualTempBean;", "toManualTempEntity", "toManualTempBean", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class ManualTempExKt {
    @NotNull
    public static final ManualTempBean toManualTempBean(@NotNull ManualTempEntity manualTempEntity) {
        return new ManualTempBean(manualTempEntity.getTimestamp(), String.valueOf(manualTempEntity.getTemp()), manualTempEntity.getUserId(), null, null, manualTempEntity.getAppName(), null, 88, null);
    }

    @NotNull
    public static final ManualTempEntity toManualTempEntity(@NotNull ManualTempBean manualTempBean) {
        long timestamp = manualTempBean.getTimestamp();
        Float floatOrNull = k.toFloatOrNull(manualTempBean.getTemp());
        float fFloatValue = floatOrNull == null ? 0.0f : floatOrNull.floatValue();
        String userId = manualTempBean.getUserId();
        String appName = manualTempBean.getAppName();
        if (appName == null) {
            appName = "";
        }
        return new ManualTempEntity(timestamp, fFloatValue, userId, appName);
    }

    @NotNull
    public static final TemperatureVo toTemperatureVo(@NotNull ManualTempEntity manualTempEntity) {
        return new TemperatureVo(manualTempEntity.getTimestamp(), manualTempEntity.getTemp(), TemperatureTypeConstants.MANUAL_TEMP);
    }
}
