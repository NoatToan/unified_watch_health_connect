package com.huami.bloodpressure_core.dc.remote.night;

import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_core.ext.TimeZoneEx;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureNightVo;", "toNightEntity", "toDbVo", "bloodpressure-core_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureNightVoKt {
    @NotNull
    public static final BloodPressureDbVo toDbVo(@NotNull BloodPressureNightVo bloodPressureNightVo) {
        return new BloodPressureDbVo(bloodPressureNightVo.getMeasureTime(), bloodPressureNightVo.getSbp(), bloodPressureNightVo.getDbp(), bloodPressureNightVo.getBpm(), Integer.valueOf(bloodPressureNightVo.getTimezone()), UserEx.getUserId(), "blood_pressure", BloodPressureConst.ParamValue.ALL_DAY, true, TimeFormatEx.INSTANCE.formatTimeYMD(bloodPressureNightVo.getMeasureTime()), 3, null, null, 6144, null);
    }

    @NotNull
    public static final BloodPressureNightVo toNightEntity(@NotNull BloodPressureDbVo bloodPressureDbVo) {
        long measureTime = bloodPressureDbVo.getMeasureTime();
        int sbp = bloodPressureDbVo.getSbp();
        int dbp = bloodPressureDbVo.getDbp();
        Integer bpm = bloodPressureDbVo.getBpm();
        Integer timeZone = bloodPressureDbVo.getTimeZone();
        return new BloodPressureNightVo(measureTime, sbp, dbp, bpm, timeZone == null ? TimeZoneEx.INSTANCE.getSecondsFromGMT() : timeZone.intValue(), 1);
    }
}
