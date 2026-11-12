package com.xiaomi.wearable.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.wearable.CoreExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0014J\u0018\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/wearable/utils/SharedPreferencesUtil;", "", "<init>", "()V", "getString", "", "key", "defaultValue", "setString", "", "value", "hasKey", "", "removeString", "getBoolean", "setBoolean", "getLong", "", "setLong", "getInt", "", "setInt", CervicalMucusRecord.Appearance.CLEAR, "context", "Landroid/content/Context;", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "Landroid/content/SharedPreferences;", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedPreferencesUtil {

    @NotNull
    public static final SharedPreferencesUtil INSTANCE = new SharedPreferencesUtil();

    private SharedPreferencesUtil() {
    }

    public final void clear(@Nullable Context context, @NotNull SharedPreferences p) {
        Intrinsics.checkNotNullParameter(p, "p");
        SharedPreferences.Editor editorEdit = p.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final boolean getBoolean(@NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return PreferenceManager.getDefaultSharedPreferences(CoreExtKt.getContext()).getBoolean(key, defaultValue);
    }

    public final int getInt(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return PreferenceManager.getDefaultSharedPreferences(CoreExtKt.getContext()).getInt(key, defaultValue);
    }

    public final long getLong(@NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return PreferenceManager.getDefaultSharedPreferences(CoreExtKt.getContext()).getLong(key, defaultValue);
    }

    @Nullable
    public final String getString(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return PreferenceManager.getDefaultSharedPreferences(CoreExtKt.getContext()).getString(key, defaultValue);
    }

    public final boolean hasKey(@Nullable String key) {
        return PreferenceManager.getDefaultSharedPreferences(CoreExtKt.getContext()).contains(key);
    }

    public final void removeString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(CoreExtKt.getContext()).edit();
        editorEdit.remove(key);
        editorEdit.apply();
    }

    public final void setBoolean(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        PreferenceManager.getDefaultSharedPreferences(CoreExtKt.getContext()).edit().putBoolean(key, value).apply();
    }

    public final void setInt(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        PreferenceManager.getDefaultSharedPreferences(CoreExtKt.getContext()).edit().putInt(key, value).apply();
    }

    public final void setLong(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        PreferenceManager.getDefaultSharedPreferences(CoreExtKt.getContext()).edit().putLong(key, value).apply();
    }

    public final void setString(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        PreferenceManager.getDefaultSharedPreferences(CoreExtKt.getContext()).edit().putString(key, value).apply();
    }
}
