package com.xiaomi.hm.health.temperature;

import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.temperature.local.entity.AllDayTempEntity;
import com.xiaomi.hm.health.temperature.local.entity.ManualTempEntity;
import com.xiaomi.hm.health.temperature.local.entity.SingleTempEntity;
import com.xiaomi.hm.health.temperature.model.Temperature;
import com.xiaomi.hm.health.temperature.model.TemperaturePair;
import com.xiaomi.hm.health.temperature.remote.bean.AllDayTempBean;
import com.xiaomi.hm.health.temperature.remote.bean.ManualTempBean;
import com.xiaomi.hm.health.temperature.remote.bean.SingleTempBean;
import com.xiaomi.hm.health.temperature.service.TempDataService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0007\u001a\n\u0010\n\u001a\u00020\u0007*\u00020\b\u001a\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u0000\u001a\n\u0010\u000e\u001a\u00020\f*\u00020\u0005\u001a\n\u0010\u000e\u001a\u00020\f*\u00020\b\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\f\u001a\n\u0010\u0012\u001a\u00020\u000f*\u00020\u0011\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0011¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/temperature/local/entity/AllDayTempEntity;", "Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean;", "toAllDayTempBean", "toAllDayTempEntity", "Lcom/xiaomi/hm/health/temperature/remote/bean/SingleTempBean;", "Lcom/xiaomi/hm/health/temperature/local/entity/SingleTempEntity;", "toSingleTempEntity", "Lcom/xiaomi/hm/health/temperature/remote/bean/ManualTempBean;", "Lcom/xiaomi/hm/health/temperature/local/entity/ManualTempEntity;", "toManualTempEntity", "toManualTempBean", "", "Lcom/xiaomi/hm/health/temperature/model/Temperature;", "toTemperatureList", "toTemperature", "", "isValidRange", "Lcom/xiaomi/hm/health/temperature/model/TemperaturePair;", "isValidValue", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class TempExtKt {
    public static final boolean isValidRange(@NotNull Temperature temperature) {
        float temp = temperature.getTemp();
        return 35.0f <= temp && temp <= 42.0f;
    }

    public static final boolean isValidValue(@NotNull TemperaturePair temperaturePair) {
        return (temperaturePair.getEnvTempe() == 255 || temperaturePair.getBodyTempe() == 255) ? false : true;
    }

    @NotNull
    public static final AllDayTempBean toAllDayTempBean(@NotNull AllDayTempEntity allDayTempEntity) {
        return new AllDayTempBean(allDayTempEntity.getTimestamp(), String.valueOf(allDayTempEntity.getMaxTemp()), String.valueOf(allDayTempEntity.getMinTemp()), String.valueOf(allDayTempEntity.getAvgTemp()), allDayTempEntity.getData(), allDayTempEntity.getUserId(), allDayTempEntity.getDeviceSource(), allDayTempEntity.getDeviceId(), allDayTempEntity.getDeviceMac(), allDayTempEntity.getDeviceSn(), allDayTempEntity.getDeviceType(), (String) null, (String) null, (String) null, (String) null, 30720, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final AllDayTempEntity toAllDayTempEntity(@NotNull AllDayTempBean allDayTempBean) {
        Float floatOrNull;
        Float floatOrNull2;
        Float floatOrNull3;
        long timestamp = allDayTempBean.getTimestamp();
        String maxTemp = allDayTempBean.getMaxTemp();
        float fFloatValue = (maxTemp == null || (floatOrNull = k.toFloatOrNull(maxTemp)) == null) ? 0.0f : floatOrNull.floatValue();
        String minTemp = allDayTempBean.getMinTemp();
        float fFloatValue2 = (minTemp == null || (floatOrNull2 = k.toFloatOrNull(minTemp)) == null) ? 0.0f : floatOrNull2.floatValue();
        String avgTemp = allDayTempBean.getAvgTemp();
        return new AllDayTempEntity(timestamp, fFloatValue, fFloatValue2, (avgTemp == null || (floatOrNull3 = k.toFloatOrNull(avgTemp)) == null) ? 0.0f : floatOrNull3.floatValue(), allDayTempBean.getRawData(), allDayTempBean.getUserId(), allDayTempBean.getDeviceSource(), allDayTempBean.getDeviceId(), allDayTempBean.getDeviceMac(), allDayTempBean.getDeviceSn(), allDayTempBean.getDeviceType());
    }

    @NotNull
    public static final ManualTempBean toManualTempBean(@NotNull ManualTempEntity manualTempEntity) {
        return new ManualTempBean(manualTempEntity.getTimestamp(), String.valueOf(manualTempEntity.getTemp()), manualTempEntity.getUserId(), (String) null, (String) null, (String) null, (String) null, 120, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final ManualTempEntity toManualTempEntity(@NotNull ManualTempBean manualTempBean) {
        return new ManualTempEntity(manualTempBean.getTimestamp(), Float.parseFloat(manualTempBean.getTemp()), manualTempBean.getUserId());
    }

    @NotNull
    public static final SingleTempEntity toSingleTempEntity(@NotNull SingleTempBean singleTempBean) {
        return new SingleTempEntity(singleTempBean.getTimestamp(), Float.parseFloat(singleTempBean.getTemp()), singleTempBean.getUserId(), singleTempBean.getDeviceSource(), singleTempBean.getDeviceId(), singleTempBean.getDeviceMac(), singleTempBean.getDeviceSn(), singleTempBean.getDeviceType());
    }

    @NotNull
    public static final Temperature toTemperature(@NotNull SingleTempEntity singleTempEntity) {
        return new Temperature(singleTempEntity.getTimestamp(), singleTempEntity.getTemp(), TemperatureDataType.SINGLE);
    }

    @NotNull
    public static final List<Temperature> toTemperatureList(@NotNull AllDayTempEntity allDayTempEntity) {
        List<TemperaturePair> listDecodeAllDayTempData = TempDataService.INSTANCE.decodeAllDayTempData(allDayTempEntity.getTimestamp(), allDayTempEntity.getData());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDecodeAllDayTempData, 10));
        for (TemperaturePair temperaturePair : listDecodeAllDayTempData) {
            arrayList.add(new Temperature(temperaturePair.getTimestamp(), temperaturePair.getBodyTempe() / 100.0f, TemperatureDataType.ALL_DAY));
        }
        return arrayList;
    }

    public static final boolean isValidRange(@NotNull TemperaturePair temperaturePair) {
        float bodyTempe = temperaturePair.getBodyTempe() / 100.0f;
        return 35.0f <= bodyTempe && bodyTempe <= 42.0f;
    }

    @NotNull
    public static final Temperature toTemperature(@NotNull ManualTempEntity manualTempEntity) {
        return new Temperature(manualTempEntity.getTimestamp(), manualTempEntity.getTemp(), TemperatureDataType.MANUAL);
    }
}
