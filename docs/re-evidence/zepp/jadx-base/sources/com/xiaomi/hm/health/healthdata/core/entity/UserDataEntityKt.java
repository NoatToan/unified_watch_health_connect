package com.xiaomi.hm.health.healthdata.core.entity;

import kotlin.Metadata;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "", "toIntValue", "(Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;)Ljava/lang/Integer;", "", "toFloatValue", "(Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;)Ljava/lang/Float;", "", "toDoubleValue", "(Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;)Ljava/lang/Double;", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class UserDataEntityKt {
    @Nullable
    public static final Double toDoubleValue(@NotNull UserDataEntity userDataEntity) {
        String eventValue = userDataEntity.getEventValue();
        if (eventValue == null) {
            return null;
        }
        return k.toDoubleOrNull(eventValue);
    }

    @Nullable
    public static final Float toFloatValue(@NotNull UserDataEntity userDataEntity) {
        String eventValue = userDataEntity.getEventValue();
        if (eventValue == null) {
            return null;
        }
        return k.toFloatOrNull(eventValue);
    }

    @Nullable
    public static final Integer toIntValue(@NotNull UserDataEntity userDataEntity) {
        Float floatValue = toFloatValue(userDataEntity);
        if (floatValue == null) {
            return null;
        }
        return Integer.valueOf((int) floatValue.floatValue());
    }
}
