package com.huami.bloodpressure_core.dc.remote;

import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.dc.local.BloodPressureVo;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_core.ext.TimeZoneEx;
import com.huami.bloodpressure_core.ext.UserEx;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteV2Entity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "", ParamKey.dataSource, "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "toDbVo", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", "toV2Entity", "bloodpressure-core_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureRemoteV2EntityKt {
    @Nullable
    public static final BloodPressureDbVo toDbVo(@NotNull BloodPressureRemoteV2Entity<BloodPressureVo> bloodPressureRemoteV2Entity, int i) {
        BloodPressureVo value = bloodPressureRemoteV2Entity.getValue();
        if (value == null) {
            return null;
        }
        return new BloodPressureDbVo(value.getMeasureTime(), value.getSbp(), value.getDbp(), value.getBpm(), Integer.valueOf(value.getTimezone()), bloodPressureRemoteV2Entity.getUserId(), bloodPressureRemoteV2Entity.getEventType(), bloodPressureRemoteV2Entity.getSubType(), true, TimeFormatEx.INSTANCE.formatTimeYMD(value.getMeasureTime()), i, null, null, 6144, null);
    }

    public static /* synthetic */ BloodPressureDbVo toDbVo$default(BloodPressureRemoteV2Entity bloodPressureRemoteV2Entity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return toDbVo(bloodPressureRemoteV2Entity, i);
    }

    @NotNull
    public static final BloodPressureRequestV2Entity toV2Entity(@NotNull BloodPressureDbVo bloodPressureDbVo) {
        long measureTime = bloodPressureDbVo.getMeasureTime();
        String userId = UserEx.getUserId();
        long measureTime2 = bloodPressureDbVo.getMeasureTime();
        int sbp = bloodPressureDbVo.getSbp();
        int dbp = bloodPressureDbVo.getDbp();
        Integer bpm = bloodPressureDbVo.getBpm();
        Integer timeZone = bloodPressureDbVo.getTimeZone();
        return new BloodPressureRequestV2Entity("blood_pressure", "real_data", measureTime, userId, new BloodPressureVo(measureTime2, sbp, dbp, bpm, timeZone == null ? TimeZoneEx.INSTANCE.getSecondsFromGMT() : timeZone.intValue()));
    }
}
