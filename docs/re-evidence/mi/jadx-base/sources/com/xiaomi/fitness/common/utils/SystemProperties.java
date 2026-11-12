package com.xiaomi.fitness.common.utils;

import android.graphics.Point;
import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import miuix.animation.FolmeEase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010 \u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0011\u0010!\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0013\u0010%\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0011\u0010)\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0011\u00100\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u00102\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0018¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/common/utils/SystemProperties;", "", "<init>", "()V", "TAG", "", "REGION_CN", "KEY_MIUI_REGION", "KEY_ROM_REGION", "KEY_MIUI_VERSION_NAME", "KEY_LINEAR_MOTOR_VIBRATE", "KEY_FP_FOD_LOCATION", "KEY_FP_HEART_RATE_ENABLE", "sClazz", "Ljava/lang/Class;", "sMethodGet", "Ljava/lang/reflect/Method;", "sMethodGetInt", "sIsMiui11", "", "Ljava/lang/Boolean;", "sIsInternational", "sFpHeartRateEnable", "isChina", "()Z", "getString", "key", "defValue", "getInt", "", "getMiuiRegion", "def", "isMiui11", "miuiRomVersion", "getMiuiRomVersion", "()I", "isHyperOs", "systemRomVersion", "getSystemRomVersion", "()Ljava/lang/String;", "isGlobalMiuiRom", "isSupportLinearMotorVibrate", "fpFodLocation", "Landroid/graphics/Point;", "getFpFodLocation", "()Landroid/graphics/Point;", "fpHeartRateEnable", "getFpHeartRateEnable", "multiDisplayType", "getMultiDisplayType", "isFoldDisplay", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSystemProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemProperties.kt\ncom/xiaomi/fitness/common/utils/SystemProperties\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,162:1\n37#2:163\n36#2,3:164\n*S KotlinDebug\n*F\n+ 1 SystemProperties.kt\ncom/xiaomi/fitness/common/utils/SystemProperties\n*L\n139#1:163\n139#1:164,3\n*E\n"})
public final class SystemProperties {

    @NotNull
    public static final SystemProperties INSTANCE = new SystemProperties();

    @NotNull
    private static final String KEY_FP_FOD_LOCATION = "persist.vendor.sys.fp.fod.location.X_Y";

    @NotNull
    private static final String KEY_FP_HEART_RATE_ENABLE = "persist.vendor.sys.fp.heartbeat";

    @NotNull
    private static final String KEY_LINEAR_MOTOR_VIBRATE = "sys.haptic.motor";

    @NotNull
    private static final String KEY_MIUI_REGION = "ro.miui.region";

    @NotNull
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";

    @NotNull
    private static final String KEY_ROM_REGION = "ro.product.mod_device";

    @NotNull
    private static final String REGION_CN = "CN";

    @NotNull
    private static final String TAG = "SystemProperties";
    private static final boolean isFoldDisplay;
    private static final int multiDisplayType;

    @Nullable
    private static Class<?> sClazz;

    @Nullable
    private static Boolean sFpHeartRateEnable;

    @Nullable
    private static Boolean sIsInternational;

    @Nullable
    private static Boolean sIsMiui11;

    @Nullable
    private static Method sMethodGet;

    @Nullable
    private static Method sMethodGetInt;

    static {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            sClazz = cls;
            sMethodGet = cls.getDeclaredMethod("get", String.class, String.class);
            Class<?> cls2 = sClazz;
            sMethodGetInt = cls2 != null ? cls2.getMethod("getInt", String.class, Integer.TYPE) : null;
        } catch (Exception e) {
            Logger.e(TAG, "has no android.os.SystemProperties", e);
        }
        int i = INSTANCE.getInt("persist.sys.muiltdisplay_type", 0);
        multiDisplayType = i;
        isFoldDisplay = i == 2;
    }

    private SystemProperties() {
    }

    @NotNull
    public final Point getFpFodLocation() {
        String string = getString(KEY_FP_FOD_LOCATION, "-1000,-1000");
        Intrinsics.checkNotNull(string);
        String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        return new Point(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]));
    }

    public final boolean getFpHeartRateEnable() {
        Boolean bool = sFpHeartRateEnable;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(Boolean.parseBoolean(getString(KEY_FP_HEART_RATE_ENABLE, "false")));
        sFpHeartRateEnable = boolValueOf;
        Intrinsics.checkNotNull(boolValueOf);
        return boolValueOf.booleanValue();
    }

    public final int getInt(@NotNull String key, int defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Method method = sMethodGetInt;
            if (method == null) {
                Logger.e(TAG, "SystemProperties can't access. @getInt");
                return defValue;
            }
            Intrinsics.checkNotNull(method);
            Integer num = (Integer) method.invoke(sClazz, key, Integer.valueOf(defValue));
            return num != null ? num.intValue() : defValue;
        } catch (Exception e) {
            Logger.e(TAG, e.getMessage(), e);
            return defValue;
        }
    }

    @Nullable
    public final String getMiuiRegion(@Nullable String def) {
        return getString(KEY_MIUI_REGION, def);
    }

    public final int getMiuiRomVersion() {
        String systemRomVersion = getSystemRomVersion();
        if (systemRomVersion == null) {
            systemRomVersion = "V10";
        }
        String str = systemRomVersion;
        Logger.i(TAG, "systemRomVersionStr: " + str);
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(str, "V", "", false, 4, (Object) null);
        try {
            return Integer.parseInt(strReplace$default);
        } catch (Exception e) {
            Logger.i(TAG, "miuiRomVersion " + strReplace$default + " format " + e);
            return 0;
        }
    }

    public final int getMultiDisplayType() {
        return multiDisplayType;
    }

    @Nullable
    public final String getString(@NotNull String key, @Nullable String defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Method method = sMethodGet;
            if (method == null) {
                Logger.e(TAG, "SystemProperties can't access. @getString");
                return defValue;
            }
            Intrinsics.checkNotNull(method);
            String str = (String) method.invoke(sClazz, key, defValue);
            return !TextUtils.isEmpty(str) ? str : defValue;
        } catch (Exception e) {
            Logger.e(TAG, e.getMessage(), e);
            return defValue;
        }
    }

    @Nullable
    public final String getSystemRomVersion() {
        return getString(KEY_MIUI_VERSION_NAME, "V10");
    }

    public final boolean isChina() {
        return StringsKt__StringsJVMKt.equals("CN", getMiuiRegion("CN"), true);
    }

    public final boolean isFoldDisplay() {
        return isFoldDisplay;
    }

    public final boolean isGlobalMiuiRom() {
        Boolean bool = sIsInternational;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            return bool.booleanValue();
        }
        String string = getString(KEY_ROM_REGION, "");
        Intrinsics.checkNotNull(string);
        Boolean boolValueOf = Boolean.valueOf(StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "_global", false, 2, (Object) null));
        sIsInternational = boolValueOf;
        Intrinsics.checkNotNull(boolValueOf);
        return boolValueOf.booleanValue();
    }

    public final boolean isHyperOs() {
        return getMiuiRomVersion() > 14;
    }

    public final boolean isMiui11() {
        Boolean bool = sIsMiui11;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(StringsKt__StringsJVMKt.equals(RomUtils.VERSION_MIUI_VALUE_11, getSystemRomVersion(), true));
        sIsMiui11 = boolValueOf;
        Intrinsics.checkNotNull(boolValueOf);
        return boolValueOf.booleanValue();
    }

    public final boolean isSupportLinearMotorVibrate() {
        return Intrinsics.areEqual(FolmeEase.LINEAR, getString(KEY_LINEAR_MOTOR_VIBRATE, null));
    }
}
