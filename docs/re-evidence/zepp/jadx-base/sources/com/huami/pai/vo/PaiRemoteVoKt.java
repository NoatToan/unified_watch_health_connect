package com.huami.pai.vo;

import com.huami.pai.ext.PaiTimeExKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/pai/vo/PaiRemoteVo;", "", "defaultAge", "defaultGender", "defaultMaxHr", "Lcom/huami/pai/vo/PAIDataVo;", "toCharVo", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class PaiRemoteVoKt {
    @NotNull
    public static final PAIDataVo toCharVo(@NotNull PaiRemoteVo paiRemoteVo, int i, int i2, int i3) {
        String timeYMD$default = PaiTimeExKt.formatTimeYMD$default(paiRemoteVo.getTimestamp(), null, 2, null);
        String activityScores = paiRemoteVo.getActivityScores();
        String str = activityScores == null ? "[0,0,0,0,0,0,0]" : activityScores;
        String nextActivityScores = paiRemoteVo.getNextActivityScores();
        String str2 = nextActivityScores == null ? "[0,0,0,0,0,0,0]" : nextActivityScores;
        Float lowZonePai = paiRemoteVo.getLowZonePai();
        float fFloatValue = lowZonePai == null ? 0.0f : lowZonePai.floatValue();
        Float mediumZonePai = paiRemoteVo.getMediumZonePai();
        float fFloatValue2 = mediumZonePai == null ? 0.0f : mediumZonePai.floatValue();
        Float highZonePai = paiRemoteVo.getHighZonePai();
        float fFloatValue3 = highZonePai == null ? 0.0f : highZonePai.floatValue();
        Float lowZoneMinutes = paiRemoteVo.getLowZoneMinutes();
        int iFloatValue = lowZoneMinutes == null ? 0 : (int) lowZoneMinutes.floatValue();
        Float mediumZoneMinutes = paiRemoteVo.getMediumZoneMinutes();
        int iFloatValue2 = mediumZoneMinutes == null ? 0 : (int) mediumZoneMinutes.floatValue();
        Float highZoneMinutes = paiRemoteVo.getHighZoneMinutes();
        int iFloatValue3 = highZoneMinutes == null ? 0 : (int) highZoneMinutes.floatValue();
        Float dailyPai = paiRemoteVo.getDailyPai();
        float fFloatValue4 = dailyPai == null ? 0.0f : dailyPai.floatValue();
        Float totalPai = paiRemoteVo.getTotalPai();
        float fFloatValue5 = totalPai == null ? 0.0f : totalPai.floatValue();
        Integer age = paiRemoteVo.getAge();
        int iIntValue = age == null ? i : age.intValue();
        Integer gender = paiRemoteVo.getGender();
        int iIntValue2 = gender == null ? i2 : gender.intValue();
        Integer lowZoneLowerLimit = paiRemoteVo.getLowZoneLowerLimit();
        int iIntValue3 = lowZoneLowerLimit == null ? 0 : lowZoneLowerLimit.intValue();
        Integer mediumZoneLowerLimit = paiRemoteVo.getMediumZoneLowerLimit();
        int iIntValue4 = mediumZoneLowerLimit == null ? 0 : mediumZoneLowerLimit.intValue();
        Integer highZoneLowerLimit = paiRemoteVo.getHighZoneLowerLimit();
        int iIntValue5 = highZoneLowerLimit == null ? 0 : highZoneLowerLimit.intValue();
        Integer restHr = paiRemoteVo.getRestHr();
        int iIntValue6 = restHr == null ? 0 : restHr.intValue();
        Integer maxHr = paiRemoteVo.getMaxHr();
        int iIntValue7 = maxHr == null ? i3 : maxHr.intValue();
        long timestamp = paiRemoteVo.getTimestamp();
        Long time = paiRemoteVo.getTime();
        long timestamp2 = time == null ? paiRemoteVo.getTimestamp() : time.longValue();
        long timeZone = paiRemoteVo.getTimeZone();
        Integer index = paiRemoteVo.getIndex();
        int iIntValue8 = index == null ? 0 : index.intValue();
        Integer version = paiRemoteVo.getVersion();
        int iIntValue9 = version == null ? 0 : version.intValue();
        Long uploadTimestamp = paiRemoteVo.getUploadTimestamp();
        long timestamp3 = uploadTimestamp == null ? paiRemoteVo.getTimestamp() : uploadTimestamp.longValue();
        Integer deviceSource = paiRemoteVo.getDeviceSource();
        int iIntValue10 = deviceSource == null ? 0 : deviceSource.intValue();
        String deviceId = paiRemoteVo.getDeviceId();
        String str3 = deviceId == null ? "" : deviceId;
        String sn = paiRemoteVo.getSn();
        return new PAIDataVo(timeYMD$default, str, str2, fFloatValue, fFloatValue2, fFloatValue3, iFloatValue, iFloatValue2, iFloatValue3, fFloatValue4, fFloatValue5, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, timestamp, timestamp2, timeZone, iIntValue8, iIntValue9, timestamp3, iIntValue10, str3, sn == null ? "" : sn, paiRemoteVo.getUserId(), paiRemoteVo.getEventType(), paiRemoteVo.getSubType(), true);
    }

    public static /* synthetic */ PAIDataVo toCharVo$default(PaiRemoteVo paiRemoteVo, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 18;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        return toCharVo(paiRemoteVo, i, i2, i3);
    }
}
