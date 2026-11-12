package com.xiaomi.hm.health.bodyfat.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0001J \u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0001R\u001c\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/utils/BodyFatSp;", "", "", "key", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "remind", "", "setScaleTokenRemind", "getScaleTokenRemind", "", "time", "setScaleTokenRemindTime", "getScaleTokenRemindTime", "isSet", "setScaleWifi", "getScaleWifi", "value", "putValue", "defaultValue", "getValue", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "fileName", BodyFatSp.SCALE_TOKEN_REMIND, BodyFatSp.SCALE_WIFI_SET, BodyFatSp.SCALE_TOKEN_REMIND_TIME, "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyFatSp {

    @NotNull
    public static final String SCALE_TOKEN_REMIND = "SCALE_TOKEN_REMIND";

    @NotNull
    public static final String SCALE_TOKEN_REMIND_TIME = "SCALE_TOKEN_REMIND_TIME";

    @NotNull
    public static final String SCALE_WIFI_SET = "SCALE_WIFI_SET";

    @NotNull
    public static final BodyFatSp INSTANCE = new BodyFatSp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String fileName = "sp_bodyfat";

    private BodyFatSp() {
    }

    private final String a(String key) {
        String userid = BFCallback.getHMPersonInfo().getUserid();
        String boundDeviceAddress = BFCallback.getHMDeviceManager().getBoundDeviceAddress(HMDeviceType.WEIGHT);
        if (boundDeviceAddress == null) {
            return null;
        }
        return key + '_' + ((Object) userid) + '_' + boundDeviceAddress;
    }

    @NotNull
    public final String getFileName() {
        return fileName;
    }

    public final boolean getScaleTokenRemind(@NotNull Context context) {
        String strA = a(SCALE_TOKEN_REMIND);
        if (strA == null) {
            return true;
        }
        Object value = INSTANCE.getValue(context, strA, Boolean.TRUE);
        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) value).booleanValue();
    }

    public final long getScaleTokenRemindTime(@NotNull Context context) {
        String strA = a(SCALE_TOKEN_REMIND_TIME);
        if (strA == null) {
            return 0L;
        }
        Object value = INSTANCE.getValue(context, strA, 0L);
        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) value).longValue();
    }

    public final boolean getScaleWifi(@NotNull Context context) {
        String strA = a(SCALE_WIFI_SET);
        if (strA == null) {
            return false;
        }
        Object value = INSTANCE.getValue(context, strA, Boolean.FALSE);
        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) value).booleanValue();
    }

    @Nullable
    public final Object getValue(@NotNull Context context, @NotNull String key, @NotNull Object defaultValue) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        if (defaultValue instanceof String) {
            return sharedPreferences.getString(key, (String) defaultValue);
        }
        if (defaultValue instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(key, ((Number) defaultValue).longValue()));
        }
        if (defaultValue instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(key, ((Number) defaultValue).intValue()));
        }
        if (defaultValue instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(key, ((Boolean) defaultValue).booleanValue()));
        }
        return defaultValue instanceof Float ? Float.valueOf(sharedPreferences.getFloat(key, ((Number) defaultValue).floatValue())) : defaultValue;
    }

    public final void putValue(@NotNull Context context, @NotNull String key, @NotNull Object value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        if (value instanceof String) {
            sharedPreferences.edit().putString(key, (String) value).apply();
            return;
        }
        if (value instanceof Long) {
            sharedPreferences.edit().putLong(key, ((Number) value).longValue()).apply();
            return;
        }
        if (value instanceof Integer) {
            sharedPreferences.edit().putInt(key, ((Number) value).intValue()).apply();
        } else if (value instanceof Boolean) {
            sharedPreferences.edit().putBoolean(key, ((Boolean) value).booleanValue()).apply();
        } else if (value instanceof Float) {
            sharedPreferences.edit().putFloat(key, ((Number) value).floatValue()).apply();
        }
    }

    public final void setScaleTokenRemind(@NotNull Context context, boolean remind) {
        String strA = a(SCALE_TOKEN_REMIND);
        if (strA == null) {
            return;
        }
        INSTANCE.putValue(context, strA, Boolean.valueOf(remind));
    }

    public final void setScaleTokenRemindTime(@NotNull Context context, long time) {
        String strA = a(SCALE_TOKEN_REMIND_TIME);
        if (strA == null) {
            return;
        }
        INSTANCE.putValue(context, strA, Long.valueOf(time));
    }

    public final void setScaleWifi(@NotNull Context context, boolean isSet) {
        String strA = a(SCALE_WIFI_SET);
        if (strA == null) {
            return;
        }
        INSTANCE.putValue(context, strA, Boolean.valueOf(isSet));
    }
}
