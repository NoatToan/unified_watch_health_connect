package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import defpackage.h2d;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/common/utils/DeviceUtil;", "", "<init>", "()V", "TAG", "", "KEY_SETTINGS_ID", "PREF_NAME_GUID", "weakDeviceID", "mSP", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getMSP", "()Landroid/content/SharedPreferences;", "mSP$delegate", "Lkotlin/Lazy;", "language", "getLanguage", "()Ljava/lang/String;", "deviceModel", "getDeviceModel", "getVAID", "context", "Landroid/content/Context;", "getOAID", "getDeviceID", "checkSettingsId", "", "getOldHealthUniqueId", "checkLocalCache", "initAsNewDevice", "updateSettingsId", "id", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceUtil {

    @NotNull
    private static final String KEY_SETTINGS_ID = "mi_health_id";

    @NotNull
    private static final String PREF_NAME_GUID = ".guid";

    @NotNull
    private static final String TAG = "DeviceUtils";

    @Nullable
    private static String weakDeviceID;

    @NotNull
    public static final DeviceUtil INSTANCE = new DeviceUtil();

    /* JADX INFO: renamed from: mSP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mSP = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mu6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUtil.mSP_delegate$lambda$0();
        }
    });

    private DeviceUtil() {
    }

    private final void checkLocalCache(Context context) {
        try {
            initAsNewDevice(context);
        } catch (IOException e) {
            Logger.d(TAG, "get local cache failed, %s", e.getMessage(), new Object[0]);
            initAsNewDevice(context);
        } catch (InterruptedException e2) {
            Logger.d(TAG, "get local cache failed, %s", e2.getMessage(), new Object[0]);
            initAsNewDevice(context);
        }
    }

    private final void checkSettingsId(Context context) {
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        String string = settingsPropertiesUtil.getString(context, KEY_SETTINGS_ID, null);
        settingsPropertiesUtil.setString(context, KEY_SETTINGS_ID, null);
        if (TextUtils.isEmpty(string)) {
            checkLocalCache(context);
        } else {
            weakDeviceID = string;
        }
    }

    private final SharedPreferences getMSP() {
        return (SharedPreferences) mSP.getValue();
    }

    private final void initAsNewDevice(Context context) {
        String vaid = getVAID(context);
        if (!TextUtils.isEmpty(vaid)) {
            updateSettingsId(context, vaid);
            Logger.d(TAG, "init deviceId with vaid");
            return;
        }
        String oaid = getOAID(context);
        if (!TextUtils.isEmpty(oaid)) {
            updateSettingsId(context, oaid);
            Logger.d(TAG, "init deviceId with oaid");
            return;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        updateSettingsId(context, "guid-" + string);
        Logger.d(TAG, "init deviceId with guid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences mSP_delegate$lambda$0() {
        return ApplicationExtKt.getApplication().getSharedPreferences(PREF_NAME_GUID, 0);
    }

    private final void updateSettingsId(Context context, String id) {
        weakDeviceID = id;
    }

    @Nullable
    public final String getDeviceID(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = weakDeviceID;
        if (str == null || str.length() == 0) {
            synchronized (DeviceUtil.class) {
                try {
                    String str2 = weakDeviceID;
                    if (str2 == null || str2.length() == 0) {
                        INSTANCE.checkSettingsId(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return weakDeviceID;
    }

    @NotNull
    public final String getDeviceModel() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    @NotNull
    public final String getLanguage() {
        String string = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    public final String getOAID(@Nullable Context context) {
        try {
            return h2d.a(context);
        } catch (Exception unused) {
            Logger.e(TAG, "can't get oaid");
            return null;
        }
    }

    @Nullable
    public final String getOldHealthUniqueId() {
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        String string = settingsPropertiesUtil.getString(ApplicationExtKt.getApplication(), KEY_SETTINGS_ID, null);
        settingsPropertiesUtil.setString(ApplicationExtKt.getApplication(), KEY_SETTINGS_ID, null);
        return string;
    }

    @Nullable
    public final String getVAID(@Nullable Context context) {
        try {
            return h2d.b(context);
        } catch (Exception unused) {
            Logger.e(TAG, "can't get vaid");
            return null;
        }
    }
}
