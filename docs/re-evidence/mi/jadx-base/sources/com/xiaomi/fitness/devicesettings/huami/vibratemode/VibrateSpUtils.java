package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.app.Application;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.hm.health.bt.sdk.data.VibrateType;
import defpackage.lhi;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateSpUtils;", "", "<init>", "()V", "getModeNameKey", "", "did", "index", "", "getModeIdKey", "setModeName", "", "nameKey", "name", "getModeName", "defaultName", "setModeId", "modeIdKey", "id", "getModeId", "IdKey", "defaultID", "index2Mode", "Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;", "getDefaultName", "initVibrateSettings", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVibrateSpUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateSpUtils.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateSpUtils\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,79:1\n346#2,8:80\n346#2,8:88\n13467#3,3:96\n*S KotlinDebug\n*F\n+ 1 VibrateSpUtils.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateSpUtils\n*L\n33#1:80,8\n43#1:88,8\n75#1:96,3\n*E\n"})
public final class VibrateSpUtils {

    @NotNull
    public static final VibrateSpUtils INSTANCE = new VibrateSpUtils();

    private VibrateSpUtils() {
    }

    @JvmStatic
    @NotNull
    public static final String getModeId(@NotNull String IdKey, @NotNull String defaultID) {
        Intrinsics.checkNotNullParameter(IdKey, "IdKey");
        Intrinsics.checkNotNullParameter(defaultID, "defaultID");
        String str = (String) DeviceSettingsPreference.INSTANCE.getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), IdKey, defaultID, "device_settings", "app_pref", null);
        return str == null ? "" : str;
    }

    @JvmStatic
    @NotNull
    public static final String getModeIdKey(@NotNull String did, int index) {
        Intrinsics.checkNotNullParameter(did, "did");
        return "key_vibrate_mode_select_id_" + did + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + index;
    }

    @JvmStatic
    @NotNull
    public static final String getModeName(@NotNull String nameKey, @NotNull String defaultName) {
        Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        Intrinsics.checkNotNullParameter(defaultName, "defaultName");
        String str = (String) DeviceSettingsPreference.INSTANCE.getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), nameKey, defaultName, "device_settings", "app_pref", null);
        return str == null ? "" : str;
    }

    @JvmStatic
    @NotNull
    public static final String getModeNameKey(@NotNull String did, int index) {
        Intrinsics.checkNotNullParameter(did, "did");
        return "key_vibrate_mode_select_name_" + did + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + index;
    }

    @JvmStatic
    public static final void setModeId(@NotNull String modeIdKey, @NotNull String id) {
        Intrinsics.checkNotNullParameter(modeIdKey, "modeIdKey");
        Intrinsics.checkNotNullParameter(id, "id");
        DeviceSettingsPreference.INSTANCE.putValue(modeIdKey, id);
    }

    @JvmStatic
    public static final void setModeName(@NotNull String nameKey, @NotNull String name) {
        Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        Intrinsics.checkNotNullParameter(name, "name");
        DeviceSettingsPreference.INSTANCE.putValue(nameKey, name);
    }

    @NotNull
    public final String getDefaultName(int id) {
        int i;
        Application application = ApplicationExtKt.getApplication();
        switch (id) {
            case 250:
                i = wzi.a9;
                break;
            case VibrateModeSetViewModel.DEFAULT_BBJI /* 251 */:
                i = wzi.Y8;
                break;
            case 252:
                i = wzi.c9;
                break;
            case 253:
                i = wzi.Z8;
                break;
            case 254:
                i = wzi.d9;
                break;
            case 255:
                i = wzi.b9;
                break;
            default:
                i = wzi.X8;
                break;
        }
        String string = application.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final VibrateType index2Mode(int index) {
        switch (index) {
            case 0:
                return VibrateType.INCOMING_CALL;
            case 1:
                return VibrateType.EVENT_REMIND;
            case 2:
                return VibrateType.ALARM;
            case 3:
                return VibrateType.APP_NOTIFY;
            case 4:
                return VibrateType.LONG_SIT;
            case 5:
                return VibrateType.SMS;
            case 6:
                return VibrateType.SPORT_REACH_GOAL;
            case 7:
                return VibrateType.SCHEDULE;
            default:
                return VibrateType.INCOMING_CALL;
        }
    }

    public final void initVibrateSettings(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        DeviceSettingsPreference.INSTANCE.setVIBRATE_LIST("");
        String[] stringArray = ResourceExtKt.getStringArray(ApplicationExtKt.getApplication(), lhi.p);
        int length = stringArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = stringArray[i];
            int i3 = i2 + 1;
            setModeId(getModeIdKey(did, i2), "");
            String modeNameKey = getModeNameKey(did, i2);
            String string = ApplicationExtKt.getApplication().getString(wzi.X8);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            setModeName(modeNameKey, string);
            i++;
            i2 = i3;
        }
    }
}
