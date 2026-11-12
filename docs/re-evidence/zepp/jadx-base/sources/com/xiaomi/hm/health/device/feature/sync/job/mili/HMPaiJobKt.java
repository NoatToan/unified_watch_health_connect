package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.pai.dc.PaiWebConst;
import com.huami.pai.ext.PaiTimeExKt;
import com.huami.pai.vo.PAIDataVo;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.databases.model.Device;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0005"}, d2 = {"Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMPaiData;", "", "Lcom/huami/pai/vo/PAIDataVo;", "toPAIDataVoList", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HMPaiJobKt {
    @Nullable
    public static final List<PAIDataVo> toPAIDataVoList(@NotNull ArrayList<HMPaiData> arrayList) {
        String string;
        DeviceManagerApi deviceManagerApi = ManagerFunctionsKt.getDeviceManagerApi();
        DeviceUtilsApi deviceUtilsApi = (DeviceUtilsApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), null, null);
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        HMDeviceType hMDeviceType = HMDeviceType.WATCH;
        if (hMDeviceSource == deviceManagerApi.getBoundDeviceSource(hMDeviceType)) {
            hMDeviceType = HMDeviceType.MILI;
        }
        HMDeviceSource boundDeviceSource = deviceManagerApi.getBoundDeviceSource(hMDeviceType);
        Device bindInfo = hMDeviceSource == boundDeviceSource ? null : deviceManagerApi.getBindInfo(boundDeviceSource.getType());
        ArrayList arrayList2 = new ArrayList();
        try {
            for (HMPaiData hMPaiData : arrayList) {
                float[] activityScores = hMPaiData.getActivityScores();
                int i = 0;
                String string2 = "[0,0,0,0,0,0,0]";
                if (activityScores == null || activityScores.length <= 0) {
                    string = "[0,0,0,0,0,0,0]";
                } else {
                    JSONArray jSONArray = new JSONArray();
                    int length = activityScores.length;
                    int i2 = 0;
                    while (i2 < length) {
                        float f = activityScores[i2];
                        i2++;
                        jSONArray.put(f);
                    }
                    string = jSONArray.toString();
                }
                float[] nextActivityScores = hMPaiData.getNextActivityScores();
                if (nextActivityScores != null && nextActivityScores.length > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    int length2 = nextActivityScores.length;
                    while (i < length2) {
                        float f2 = nextActivityScores[i];
                        i++;
                        jSONArray2.put(f2);
                    }
                    string2 = jSONArray2.toString();
                }
                String str = string2;
                String timeYMD$default = PaiTimeExKt.formatTimeYMD$default(deviceUtilsApi.getDateTimestamp(hMPaiData.getTime()), null, 2, null);
                float lowZonePai = hMPaiData.getLowZonePai();
                float mediumZonePai = hMPaiData.getMediumZonePai();
                float highZonePai = hMPaiData.getHighZonePai();
                int lowZoneMinutes = hMPaiData.getLowZoneMinutes();
                int mediumZoneMinutes = hMPaiData.getMediumZoneMinutes();
                int highZoneMinutes = hMPaiData.getHighZoneMinutes();
                float dailyPai = hMPaiData.getDailyPai();
                float totalPai = hMPaiData.getTotalPai();
                int age = hMPaiData.getAge();
                int gender = hMPaiData.getGender();
                int lowZoneLimit = hMPaiData.getLowZoneLimit();
                int mediumZoneLimit = hMPaiData.getMediumZoneLimit();
                int highZoneLimit = hMPaiData.getHighZoneLimit();
                int restHr = hMPaiData.getRestHr();
                int maxHr = hMPaiData.getMaxHr();
                long dateTimestamp = deviceUtilsApi.getDateTimestamp(hMPaiData.getTime());
                long time = hMPaiData.getTime();
                long timezone = hMPaiData.getTimezone();
                int index = hMPaiData.getIndex();
                int version = hMPaiData.getVersion();
                long jCurrentTimeMillis = System.currentTimeMillis();
                int value = HMDeviceSource.VDEVICE == boundDeviceSource ? -1 : boundDeviceSource.getValue();
                String sn = "";
                String device_id = bindInfo == null ? "" : bindInfo.getDevice_id();
                if (bindInfo != null) {
                    sn = bindInfo.getSn();
                }
                arrayList2.add(new PAIDataVo(timeYMD$default, string, str, lowZonePai, mediumZonePai, highZonePai, lowZoneMinutes, mediumZoneMinutes, highZoneMinutes, dailyPai, totalPai, age, gender, lowZoneLimit, mediumZoneLimit, highZoneLimit, restHr, maxHr, dateTimestamp, time, timezone, index, version, jCurrentTimeMillis, value, device_id, sn, HMLoginManager.getHuamiId(), PaiWebConst.Param.PAI_EVENT_TYPE, PaiWebConst.Param.PAI_EVENT_TYPE, false));
            }
        } catch (Exception unused) {
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
    }
}
