package com.huami.bodymeasurements.temperature.model.converter;

import com.huami.bodymeasurements.temperature.model.device.dto.EightySecondsTemperatureDo;
import com.huami.bodymeasurements.temperature.model.local.entity.EightySecondsTempEntity;
import com.huami.bodymeasurements.temperature.model.remote.bean.EightySecondsTempBean;
import com.huami.bodymeasurements.temperature.view.TemperatureTypeConstants;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0003\u001aJ\u0010\u0005\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007¨\u0006\u0011"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/entity/EightySecondsTempEntity;", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "toTemperatureVo", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/EightySecondsTempBean;", "toEightySecondsTempBean", "toEightySecondsTempEntity", "Lcom/huami/bodymeasurements/temperature/model/device/dto/EightySecondsTemperatureDo;", "", "userId", "", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "appName", "firmVersion", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class EightySecondsTempExKt {
    @NotNull
    public static final EightySecondsTempBean toEightySecondsTempBean(@NotNull EightySecondsTempEntity eightySecondsTempEntity) {
        return new EightySecondsTempBean(eightySecondsTempEntity.getTimestamp(), eightySecondsTempEntity.getFlag(), eightySecondsTempEntity.getWearDuration(), eightySecondsTempEntity.getTemp(), eightySecondsTempEntity.getRawData(), eightySecondsTempEntity.getUserId(), Integer.valueOf(eightySecondsTempEntity.getDeviceSource()), eightySecondsTempEntity.getDeviceId(), eightySecondsTempEntity.getDeviceMac(), eightySecondsTempEntity.getDeviceSn(), Integer.valueOf(eightySecondsTempEntity.getDeviceType()), null, null, eightySecondsTempEntity.getAppName(), eightySecondsTempEntity.getFirmVersion(), eightySecondsTempEntity.getPhoneSource(), null, 71680, null);
    }

    @NotNull
    public static final EightySecondsTempEntity toEightySecondsTempEntity(@NotNull EightySecondsTempBean eightySecondsTempBean) {
        long timestamp = eightySecondsTempBean.getTimestamp();
        int flag = eightySecondsTempBean.getFlag();
        int wearDuration = eightySecondsTempBean.getWearDuration();
        float temp = eightySecondsTempBean.getTemp();
        String rawData = eightySecondsTempBean.getRawData();
        String userId = eightySecondsTempBean.getUserId();
        Integer deviceSource = eightySecondsTempBean.getDeviceSource();
        int iIntValue = deviceSource == null ? -1 : deviceSource.intValue();
        String deviceId = eightySecondsTempBean.getDeviceId();
        String str = deviceId == null ? "" : deviceId;
        String deviceMac = eightySecondsTempBean.getDeviceMac();
        String str2 = deviceMac == null ? "" : deviceMac;
        String deviceSn = eightySecondsTempBean.getDeviceSn();
        String str3 = deviceSn == null ? "" : deviceSn;
        Integer deviceType = eightySecondsTempBean.getDeviceType();
        int iIntValue2 = deviceType == null ? -1 : deviceType.intValue();
        String appName = eightySecondsTempBean.getAppName();
        String firmVersion = eightySecondsTempBean.getFirmVersion();
        String str4 = firmVersion == null ? "" : firmVersion;
        String phoneSource = eightySecondsTempBean.getPhoneSource();
        return new EightySecondsTempEntity(timestamp, flag, wearDuration, temp, rawData, userId, iIntValue, str, str2, str3, iIntValue2, appName, str4, phoneSource == null ? "" : phoneSource);
    }

    @NotNull
    public static final TemperatureVo toTemperatureVo(@NotNull EightySecondsTempEntity eightySecondsTempEntity) {
        return new TemperatureVo(eightySecondsTempEntity.getTimestamp(), eightySecondsTempEntity.getTemp(), TemperatureTypeConstants.EIGHTY_SECONDS_TEMP);
    }

    @NotNull
    public static final EightySecondsTempEntity toEightySecondsTempEntity(@NotNull EightySecondsTemperatureDo eightySecondsTemperatureDo, @NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        return new EightySecondsTempEntity(eightySecondsTemperatureDo.getTimestamp(), eightySecondsTemperatureDo.getFlag(), eightySecondsTemperatureDo.getWearDuration(), eightySecondsTemperatureDo.getTemp(), eightySecondsTemperatureDo.getRawData(), str, i2, str2, str3, str4, i, str5, str6, "Android");
    }
}
