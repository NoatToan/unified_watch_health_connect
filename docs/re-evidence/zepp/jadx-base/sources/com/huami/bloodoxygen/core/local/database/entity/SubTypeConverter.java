package com.huami.bloodoxygen.core.local.database.entity;

import androidx.room.TypeConverter;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/SubTypeConverter;", "", "", "value", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "getSubTypeFromString", "subType", "getStringFromSubType", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class SubTypeConverter {

    @NotNull
    public static final SubTypeConverter INSTANCE = new SubTypeConverter();

    private SubTypeConverter() {
    }

    @JvmStatic
    @TypeConverter
    @NotNull
    public static final String getStringFromSubType(@NotNull BloodOxygen.SubType subType) {
        String string = subType.getString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        return string.toUpperCase();
    }

    @JvmStatic
    @TypeConverter
    @NotNull
    public static final BloodOxygen.SubType getSubTypeFromString(@NotNull String value) {
        return BloodOxygen.SubType.valueOf(value);
    }
}
