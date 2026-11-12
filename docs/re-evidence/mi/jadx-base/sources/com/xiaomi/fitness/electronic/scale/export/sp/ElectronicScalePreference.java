package com.xiaomi.fitness.electronic.scale.export.sp;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0017H\u0007J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u001aH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/sp/ElectronicScalePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "SCALE_INIT_STATUS_KEY", "", "SCALE_RECORD_CLOSE_KEY", "SCALE_RECORD_BABY_GUIDE_KEY", "SCALE_UPDATE_INFO_KEY", "SCALE_VIRTUAL_USER_WEIGHT_KEY", "LAST_SEL_USER_KEY", "SCALE_VUSER_LIST_KEY", "SCALE_LAST_FIRMWARE_VERSION_KEY", "spName", "getSpName", "()Ljava/lang/String;", "putString", "", "key", "value", "getString", "default", "putBoolean", "", "getBoolean", "putInt", "", "getInt", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElectronicScalePreference extends PreferenceSupport {

    @NotNull
    public static final ElectronicScalePreference INSTANCE = new ElectronicScalePreference();

    @NotNull
    public static final String LAST_SEL_USER_KEY = "scale_ulast_key_";

    @NotNull
    public static final String SCALE_INIT_STATUS_KEY = "scale_init_key_";

    @NotNull
    public static final String SCALE_LAST_FIRMWARE_VERSION_KEY = "scale_last_fv_key_";

    @NotNull
    public static final String SCALE_RECORD_BABY_GUIDE_KEY = "scale_guide_key_";

    @NotNull
    public static final String SCALE_RECORD_CLOSE_KEY = "scale_close_key_";

    @NotNull
    public static final String SCALE_UPDATE_INFO_KEY = "scale_info_key_";

    @NotNull
    public static final String SCALE_VIRTUAL_USER_WEIGHT_KEY = "scale_vuser_key_";

    @NotNull
    public static final String SCALE_VUSER_LIST_KEY = "scale_vuser_list_key_";

    private ElectronicScalePreference() {
    }

    @JvmStatic
    public static final boolean getBoolean(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return INSTANCE.getPreferences().getBoolean(key, z);
    }

    @JvmStatic
    public static final int getInt(@NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        return INSTANCE.getPreferences().getInt(key, i);
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
    public static final void putInt(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        INSTANCE.getPreferences().edit().putInt(key, value).apply();
    }

    @JvmStatic
    public static final void putString(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        INSTANCE.getPreferences().edit().putString(key, value).apply();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "ElectronicScalePreference";
    }

    @JvmStatic
    @Nullable
    public static final String getString(@NotNull String key, @NotNull String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        return INSTANCE.getPreferences().getString(key, str);
    }
}
