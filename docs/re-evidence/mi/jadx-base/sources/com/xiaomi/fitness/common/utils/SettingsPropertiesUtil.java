package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007J\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007J\u001e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0012J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\"\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/common/utils/SettingsPropertiesUtil;", "", "<init>", "()V", "TAG", "", "FALSE", "", "TRUE", "setInt", "", "context", "Landroid/content/Context;", "key", "value", "getInt", "deValue", "setBool", "", "getBool", "defValue", "setString", "getString", "getPosture", "isFolded", "isExpand", "isFoldDisplayAndFolded", "isFoldDisplayAndExpand", "isFoldDisplayAndNotFolded", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingsPropertiesUtil {
    private static final int FALSE = 0;

    @NotNull
    public static final SettingsPropertiesUtil INSTANCE = new SettingsPropertiesUtil();

    @NotNull
    private static final String TAG = "SettingsPropertiesUtil";
    private static final int TRUE = 1;

    private SettingsPropertiesUtil() {
    }

    public final boolean getBool(@NotNull Context context, @NotNull String key, boolean defValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return 1 == getInt(context, key, defValue ? 1 : 0);
    }

    public final int getInt(@NotNull Context context, @NotNull String key, int deValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return Settings.Global.getInt(context.getContentResolver(), key, deValue);
        } catch (Exception e) {
            Logger.e(TAG, "getInt, error:" + e.getMessage(), e);
            return deValue;
        }
    }

    public final int getPosture(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getInt(context, "device_posture", 0);
    }

    @Nullable
    public final String getString(@NotNull Context context, @NotNull String key, @Nullable String defValue) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            string = Settings.Global.getString(context.getContentResolver(), key);
        } catch (Exception e) {
            Logger.e(TAG, "getString error: " + e.getMessage(), e);
            string = null;
        }
        return TextUtils.isEmpty(string) ? defValue : string;
    }

    public final boolean isExpand(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getPosture(context) == 3;
    }

    public final boolean isFoldDisplayAndExpand() {
        return SystemProperties.INSTANCE.isFoldDisplay() && isExpand(ApplicationExtKt.getApplication());
    }

    public final boolean isFoldDisplayAndFolded() {
        return SystemProperties.INSTANCE.isFoldDisplay() && isFolded(ApplicationExtKt.getApplication());
    }

    public final boolean isFoldDisplayAndNotFolded() {
        return SystemProperties.INSTANCE.isFoldDisplay() && getPosture(ApplicationExtKt.getApplication()) != 1;
    }

    public final boolean isFolded(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !SystemProperties.INSTANCE.isFoldDisplay() || getPosture(context) == 1;
    }

    public final void setBool(@NotNull Context context, @NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        setInt(context, key, value ? 1 : 0);
    }

    public final void setInt(@NotNull Context context, @NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            boolean zPutInt = Settings.Global.putInt(context.getContentResolver(), key, value);
            StringBuilder sb = new StringBuilder();
            sb.append("setInt: success=");
            sb.append(zPutInt);
        } catch (Exception e) {
            Logger.e(TAG, "setInt, error:" + e.getMessage(), e);
        }
    }

    public final void setString(@NotNull Context context, @NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Settings.Global.putString(context.getContentResolver(), key, value);
        } catch (Exception e) {
            Logger.e(TAG, "setString, error " + e.getMessage(), e);
        }
    }
}
