package com.huami.bloodpressure_ui.convert;

import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.dc.local.BloodPressureVo;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRequestV2Entity;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "toDataBaseVo", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class RemoteVoConverterKt {
    @Nullable
    public static final BloodPressureDbVo toDataBaseVo(@NotNull BloodPressureRequestV2Entity bloodPressureRequestV2Entity) {
        BloodPressureVo value = bloodPressureRequestV2Entity.getValue();
        if (value == null) {
            return null;
        }
        return new BloodPressureDbVo(bloodPressureRequestV2Entity.getTimestamp(), value.getSbp(), value.getDbp(), null, Integer.valueOf(value.getTimezone()), bloodPressureRequestV2Entity.getUserId(), bloodPressureRequestV2Entity.getEventType(), bloodPressureRequestV2Entity.getSubType(), true, TimeFormatEx.INSTANCE.formatTimeYMD(bloodPressureRequestV2Entity.getTimestamp()), 0, null, null, 6152, null);
    }
}
