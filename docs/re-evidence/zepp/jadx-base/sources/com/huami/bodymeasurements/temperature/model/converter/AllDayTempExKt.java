package com.huami.bodymeasurements.temperature.model.converter;

import com.huami.bodymeasurements.temperature.model.device.dto.TemperatureDataDo;
import com.huami.bodymeasurements.temperature.model.local.entity.AllDayTempEntity;
import com.huami.bodymeasurements.temperature.model.remote.bean.AllDayTempBean;
import com.huami.bodymeasurements.temperature.view.TemperatureTypeConstants;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0000*\u00020\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/entity/AllDayTempEntity;", "", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "toTempList", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/AllDayTempBean;", "toAllDayTempBean", "toAllDayTempEntity", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class AllDayTempExKt {
    @NotNull
    public static final AllDayTempBean toAllDayTempBean(@NotNull AllDayTempEntity allDayTempEntity) {
        return new AllDayTempBean(allDayTempEntity.getTimestamp(), String.valueOf(allDayTempEntity.getMaxTemp()), String.valueOf(allDayTempEntity.getMinTemp()), String.valueOf(allDayTempEntity.getAvgTemp()), allDayTempEntity.getData(), allDayTempEntity.getOriginalRawData(), allDayTempEntity.getUserId(), Integer.valueOf(allDayTempEntity.getDeviceSource()), allDayTempEntity.getDeviceId(), allDayTempEntity.getDeviceMac(), allDayTempEntity.getDeviceSn(), Integer.valueOf(allDayTempEntity.getDeviceType()), null, null, allDayTempEntity.getAppName(), allDayTempEntity.getFirmVersion(), allDayTempEntity.getPhoneSource(), null, 143360, null);
    }

    @NotNull
    public static final AllDayTempEntity toAllDayTempEntity(@NotNull AllDayTempBean allDayTempBean) {
        long timestamp = allDayTempBean.getTimestamp();
        Float floatOrNull = k.toFloatOrNull(allDayTempBean.getMaxTemp());
        float fFloatValue = floatOrNull == null ? 0.0f : floatOrNull.floatValue();
        Float floatOrNull2 = k.toFloatOrNull(allDayTempBean.getMinTemp());
        float fFloatValue2 = floatOrNull2 == null ? 0.0f : floatOrNull2.floatValue();
        Float floatOrNull3 = k.toFloatOrNull(allDayTempBean.getAvgTemp());
        float fFloatValue3 = floatOrNull3 == null ? 0.0f : floatOrNull3.floatValue();
        String rawData = allDayTempBean.getRawData();
        String originalRawData = allDayTempBean.getOriginalRawData();
        String str = originalRawData == null ? "" : originalRawData;
        String userId = allDayTempBean.getUserId();
        Integer deviceSource = allDayTempBean.getDeviceSource();
        int iIntValue = deviceSource == null ? -1 : deviceSource.intValue();
        String deviceId = allDayTempBean.getDeviceId();
        String str2 = deviceId == null ? "" : deviceId;
        String deviceMac = allDayTempBean.getDeviceMac();
        String str3 = deviceMac == null ? "" : deviceMac;
        String sn = allDayTempBean.getSn();
        String str4 = sn == null ? "" : sn;
        Integer deviceType = allDayTempBean.getDeviceType();
        int iIntValue2 = deviceType == null ? -1 : deviceType.intValue();
        String appName = allDayTempBean.getAppName();
        String firmVersion = allDayTempBean.getFirmVersion();
        String str5 = firmVersion == null ? "" : firmVersion;
        String phoneSource = allDayTempBean.getPhoneSource();
        return new AllDayTempEntity(timestamp, fFloatValue, fFloatValue2, fFloatValue3, rawData, str, userId, iIntValue, str2, str3, str4, iIntValue2, appName, str5, phoneSource == null ? "" : phoneSource);
    }

    @NotNull
    public static final List<TemperatureVo> toTempList(@NotNull AllDayTempEntity allDayTempEntity) {
        List<TemperatureDataDo> listDecodeAllDayTempData = AllDayTempDataService.INSTANCE.decodeAllDayTempData(allDayTempEntity.getTimestamp(), Base64Utils.INSTANCE.decode(allDayTempEntity.getData()));
        ArrayList<TemperatureDataDo> arrayList = new ArrayList();
        for (Object obj : listDecodeAllDayTempData) {
            TemperatureDataDo temperatureDataDo = (TemperatureDataDo) obj;
            if (temperatureDataDo.isValid() && temperatureDataDo.isValidRange()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (TemperatureDataDo temperatureDataDo2 : arrayList) {
            arrayList2.add(new TemperatureVo(temperatureDataDo2.getTimestamp(), temperatureDataDo2.getTemp(), TemperatureTypeConstants.ALL_DAY_TEMP));
        }
        return arrayList2;
    }
}
