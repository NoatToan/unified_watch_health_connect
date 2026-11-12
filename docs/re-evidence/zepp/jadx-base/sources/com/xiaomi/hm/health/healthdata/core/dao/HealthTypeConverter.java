package com.xiaomi.hm.health.healthdata.core.dao;

import androidx.room.TypeConverter;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dao/HealthTypeConverter;", "", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "type", "", "toString", "value", "toType", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthTypeConverter {
    @TypeConverter
    @NotNull
    public final String toString(@Nullable HealthDataType type) {
        String type2;
        return (type == null || (type2 = type.getType()) == null) ? "" : type2;
    }

    @TypeConverter
    @Nullable
    public final HealthDataType toType(@NotNull String value) {
        return HealthDataType.INSTANCE.find(value);
    }
}
