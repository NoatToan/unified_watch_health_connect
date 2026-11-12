package com.xiaomi.eco.api;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.electronic.scale.export.sp.ElectronicScalePreference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0011H\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/eco/api/EcoScalePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "SCALE_INIT_STATUS_KEY", "", "getSCALE_INIT_STATUS_KEY", "()Ljava/lang/String;", "spName", "getSpName", "putString", "", "key", "value", "getString", "default", "putBoolean", "", "getBoolean", "eco-device_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoScalePreference extends PreferenceSupport {

    @NotNull
    public static final EcoScalePreference INSTANCE = new EcoScalePreference();

    @NotNull
    private static final String SCALE_INIT_STATUS_KEY = ElectronicScalePreference.SCALE_INIT_STATUS_KEY;

    private EcoScalePreference() {
    }

    @JvmStatic
    public static final boolean getBoolean(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return INSTANCE.getPreferences().getBoolean(key, z);
    }

    @JvmStatic
    @Nullable
    public static final String getString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return INSTANCE.getPreferences().getString(key, "");
    }

    @JvmStatic
    public static final void putBoolean(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        INSTANCE.getPreferences().edit().putBoolean(key, value).apply();
    }

    @JvmStatic
    public static final void putString(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        INSTANCE.getPreferences().edit().putString(key, value).apply();
    }

    @NotNull
    public final String getSCALE_INIT_STATUS_KEY() {
        return SCALE_INIT_STATUS_KEY;
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "ScalePreference";
    }

    @JvmStatic
    @Nullable
    public static final String getString(@NotNull String key, @NotNull String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        return INSTANCE.getPreferences().getString(key, str);
    }
}
