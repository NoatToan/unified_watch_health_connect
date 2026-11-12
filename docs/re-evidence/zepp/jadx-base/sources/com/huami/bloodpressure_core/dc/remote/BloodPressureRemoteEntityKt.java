package com.huami.bloodpressure_core.dc.remote;

import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteEntity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "toDbVo", "bloodpressure-core_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureRemoteEntityKt {
    @Nullable
    public static final BloodPressureDbVo toDbVo(@NotNull BloodPressureRemoteEntity bloodPressureRemoteEntity) {
        String str;
        String str2;
        String rawValue = bloodPressureRemoteEntity.getRawValue();
        List listSplit$default = rawValue == null ? null : StringsKt__StringsKt.split$default((CharSequence) rawValue, new String[]{","}, false, 0, 6, (Object) null);
        Integer intOrNull = (listSplit$default == null || (str = (String) CollectionsKt.first(listSplit$default)) == null) ? null : l.toIntOrNull(str);
        Integer intOrNull2 = (listSplit$default == null || (str2 = (String) CollectionsKt.last(listSplit$default)) == null) ? null : l.toIntOrNull(str2);
        if (intOrNull == null || intOrNull2 == null) {
            return null;
        }
        return new BloodPressureDbVo(bloodPressureRemoteEntity.getTimestamp(), intOrNull.intValue(), intOrNull2.intValue(), null, null, bloodPressureRemoteEntity.getUserId(), bloodPressureRemoteEntity.getEventType(), bloodPressureRemoteEntity.getSubType(), true, TimeFormatEx.INSTANCE.formatTimeYMD(bloodPressureRemoteEntity.getTimestamp()), 2, null, null, 6168, null);
    }
}
