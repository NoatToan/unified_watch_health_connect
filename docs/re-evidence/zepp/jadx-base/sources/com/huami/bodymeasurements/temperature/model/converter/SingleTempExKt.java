package com.huami.bodymeasurements.temperature.model.converter;

import com.huami.bodymeasurements.temperature.model.device.dto.SingleTemperatureDo;
import com.huami.bodymeasurements.temperature.model.local.entity.SingleTempEntity;
import com.huami.bodymeasurements.temperature.model.remote.bean.SingleTempBean;
import com.huami.bodymeasurements.temperature.view.TemperatureTypeConstants;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001aJ\u0010\u000e\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0000\u001a\n\u0010\u000e\u001a\u00020\u0000*\u00020\u000f¨\u0006\u0011"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/entity/SingleTempEntity;", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "toTemperatureVo", "Lcom/huami/bodymeasurements/temperature/model/device/dto/SingleTemperatureDo;", "", "userId", "", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "appName", "firmVersion", "toSingleTempEntity", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/SingleTempBean;", "toSingleTempBean", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class SingleTempExKt {
    @NotNull
    public static final SingleTempBean toSingleTempBean(@NotNull SingleTempEntity singleTempEntity) {
        long timestamp = singleTempEntity.getTimestamp();
        String strValueOf = String.valueOf(singleTempEntity.getTemp());
        String strValueOf2 = String.valueOf(singleTempEntity.getEnvTemp());
        String userId = singleTempEntity.getUserId();
        int deviceType = singleTempEntity.getDeviceType();
        int deviceSource = singleTempEntity.getDeviceSource();
        return new SingleTempBean(timestamp, strValueOf, strValueOf2, userId, Integer.valueOf(deviceSource), singleTempEntity.getDeviceId(), singleTempEntity.getDeviceMac(), singleTempEntity.getDeviceSn(), Integer.valueOf(deviceType), null, null, singleTempEntity.getAppName(), singleTempEntity.getFirmVersion(), singleTempEntity.getPhoneSource(), null, 17920, null);
    }

    @NotNull
    public static final SingleTempEntity toSingleTempEntity(@NotNull SingleTemperatureDo singleTemperatureDo, @NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        return new SingleTempEntity(singleTemperatureDo.getTimestamp(), singleTemperatureDo.getTemp(), singleTemperatureDo.getEnvTempFloat(), str, i2, str2, str3, str4, i, str5, str6, "Android");
    }

    @NotNull
    public static final TemperatureVo toTemperatureVo(@NotNull SingleTempEntity singleTempEntity) {
        return new TemperatureVo(singleTempEntity.getTimestamp(), singleTempEntity.getTemp(), TemperatureTypeConstants.SINGLE_TEMP);
    }

    @NotNull
    public static final SingleTempEntity toSingleTempEntity(@NotNull SingleTempBean singleTempBean) {
        Float floatOrNull;
        long timestamp = singleTempBean.getTimestamp();
        Float floatOrNull2 = k.toFloatOrNull(singleTempBean.getTemp());
        float fFloatValue = floatOrNull2 == null ? 0.0f : floatOrNull2.floatValue();
        String envTemp = singleTempBean.getEnvTemp();
        float fFloatValue2 = (envTemp == null || (floatOrNull = k.toFloatOrNull(envTemp)) == null) ? 0.0f : floatOrNull.floatValue();
        String userId = singleTempBean.getUserId();
        Integer deviceSource = singleTempBean.getDeviceSource();
        int iIntValue = deviceSource == null ? -1 : deviceSource.intValue();
        String deviceId = singleTempBean.getDeviceId();
        String str = deviceId == null ? "" : deviceId;
        String deviceMac = singleTempBean.getDeviceMac();
        String str2 = deviceMac == null ? "" : deviceMac;
        String deviceSn = singleTempBean.getDeviceSn();
        String str3 = deviceSn == null ? "" : deviceSn;
        Integer deviceType = singleTempBean.getDeviceType();
        int iIntValue2 = deviceType == null ? -1 : deviceType.intValue();
        String appName = singleTempBean.getAppName();
        String firmVersion = singleTempBean.getFirmVersion();
        String str4 = firmVersion == null ? "" : firmVersion;
        String phoneSource = singleTempBean.getPhoneSource();
        return new SingleTempEntity(timestamp, fFloatValue, fFloatValue2, userId, iIntValue, str, str2, str3, iIntValue2, appName, str4, phoneSource == null ? "" : phoneSource);
    }
}
