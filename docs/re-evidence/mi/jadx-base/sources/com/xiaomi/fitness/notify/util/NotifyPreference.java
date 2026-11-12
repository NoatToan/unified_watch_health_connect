package com.xiaomi.fitness.notify.util;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005J\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0005J\u0016\u0010#\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\"J\u0006\u0010%\u001a\u00020\"J\u0016\u0010&\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\"J\u0006\u0010(\u001a\u00020\"J\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\"J\u0006\u0010*\u001a\u00020\"J\u0016\u0010+\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\"J\u0006\u0010,\u001a\u00020\"J\u0016\u0010-\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\"J\u0016\u0010.\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\"J\u000e\u0010/\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0005J\u0016\u00100\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u00101\u001a\u00020\"J\u000e\u00102\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u00103\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u00104\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0005J\u0018\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u000208J\u0006\u0010;\u001a\u000208J\u000e\u0010<\u001a\u00020\u001a2\u0006\u0010:\u001a\u000208J\u000e\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u000208J\u000e\u0010?\u001a\u00020\u001a2\u0006\u0010>\u001a\u000208J\u0006\u0010@\u001a\u000208J\u0006\u0010A\u001a\u000208R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/notify/util/NotifyPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "KEY_IN_CALL_NOTIFY_CONFIG", "", "KEY_NOTIFICATION_ENABLE_LIST", "KEY_NEED_SYNC_NOTIFICATION", "KEY_NEED_SYNC_ALL_NOTIFICATION", "KEY_NEED_SYNC_NOTIFICATION_ONLY_SCREEN_LOCK", "KEY_NOTIFICATION_ICON_PACKAGE_LIST", "KEY_SHOW_NOTIFICATION_TIP", "KEY_SHOW_NOTIFICATION_ITEM_OPEN_ALERT", "KEY_SHOW_NOTIFICATION_REMIND_BANNER", "KEY_SHOW_IN_CALL_REMIND_BANNER", "KEY_NEED_SHOW_REMIND_BANNER", "KEY_IN_CALL_OPTIMIZATION", "KEY_NOTIFICATION_DELAY_TIME", "KEY_NOTIFICATION_DELAY_CLOSE_TIME", "KEY_REMIND_UN_LIMIT_CLOSE_TIME", "KEY_REMIND_IGNORE_POWER_LIMIT_TIME", "SP_NAME_BLE", "SP_NAME_HUAMI", "getInCallNotifyConfig", "did", "setInCallNotifyConfig", "", "configJson", "getNotifyListString", "setNotifyListString", "notifySettings", "getNotifyIconPackageListString", "setNotifyIconListString", "isNeedSyncNotification", "", "setNeedSyncNotification", "isNeedSync", "isNeedShowRemind", "setNeedShowRemind", "needShow", "isInCallOptimizationOpen", "isOpen", "isNeedShowNotificationRemind", "setNeedShowNotificationRemind", "isNeedShowInCallRemind", "setNeedShowInCallRemind", "setNeedSyncAllNotification", "isNeedSyncAllNotification", "setSyncNotificationOnlyScreenLock", "only", "isSyncNotificationOnlyScreenLock", "isShowNotificationItemOpenAlert", "hideNotificationItemOpenAlert", "getNotifyKey", "key", "getNotificationDelayTime", "", "setNotificationDelayTime", "delayTime", "getNotificationDelayCloseTime", "setNotificationDelayCloseTime", "setRemindUnLimitCloseTime", "closeTime", "setRemindPowerIgnoreTime", "getRemindPowerIgnoreTime", "getRemindUnLimitCloseTime", "spName", "getSpName", "()Ljava/lang/String;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotifyPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotifyPreference.kt\ncom/xiaomi/fitness/notify/util/NotifyPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,242:1\n346#2,8:243\n346#2,8:251\n346#2,8:259\n346#2,8:267\n346#2,8:275\n346#2,8:283\n346#2,8:291\n346#2,8:299\n346#2,8:307\n346#2,8:315\n346#2,8:323\n346#2,8:331\n346#2,8:339\n346#2,8:347\n346#2,8:355\n*S KotlinDebug\n*F\n+ 1 NotifyPreference.kt\ncom/xiaomi/fitness/notify/util/NotifyPreference\n*L\n38#1:243,8\n54#1:251,8\n70#1:259,8\n89#1:267,8\n101#1:275,8\n116#1:283,8\n129#1:291,8\n141#1:299,8\n159#1:307,8\n171#1:315,8\n177#1:323,8\n192#1:331,8\n205#1:339,8\n228#1:347,8\n234#1:355,8\n*E\n"})
public final class NotifyPreference extends PreferenceSupport {

    @NotNull
    public static final NotifyPreference INSTANCE = new NotifyPreference();

    @NotNull
    private static final String KEY_IN_CALL_NOTIFY_CONFIG = "key_in_call_notify_config";

    @NotNull
    private static final String KEY_IN_CALL_OPTIMIZATION = "key_in_call_optimization";

    @NotNull
    private static final String KEY_NEED_SHOW_REMIND_BANNER = "key_show_remind_banner";

    @NotNull
    private static final String KEY_NEED_SYNC_ALL_NOTIFICATION = "key_sync_all_notification";

    @NotNull
    private static final String KEY_NEED_SYNC_NOTIFICATION = "key_sync_notification";

    @NotNull
    private static final String KEY_NEED_SYNC_NOTIFICATION_ONLY_SCREEN_LOCK = "key_sync_notification_only_screen_lock";

    @NotNull
    private static final String KEY_NOTIFICATION_DELAY_CLOSE_TIME = "key_notification_delay_close_time";

    @NotNull
    private static final String KEY_NOTIFICATION_DELAY_TIME = "key_notification_delay_time";

    @NotNull
    private static final String KEY_NOTIFICATION_ENABLE_LIST = "key_notification_enable_list";

    @NotNull
    private static final String KEY_NOTIFICATION_ICON_PACKAGE_LIST = "key_notification_icon_package_list";

    @NotNull
    private static final String KEY_REMIND_IGNORE_POWER_LIMIT_TIME = "key_remind_ignore_power_limit_time";

    @NotNull
    private static final String KEY_REMIND_UN_LIMIT_CLOSE_TIME = "key_remind_un_limit_time";

    @NotNull
    private static final String KEY_SHOW_IN_CALL_REMIND_BANNER = "key_show_in_call_remind_banner";

    @NotNull
    private static final String KEY_SHOW_NOTIFICATION_ITEM_OPEN_ALERT = "key_show_notification_item_open_alert";

    @NotNull
    private static final String KEY_SHOW_NOTIFICATION_REMIND_BANNER = "key_show_notification_remind_banner";

    @NotNull
    private static final String KEY_SHOW_NOTIFICATION_TIP = "key_show_notification_tip";

    @NotNull
    public static final String SP_NAME_BLE = "app_pref_ble";

    @NotNull
    public static final String SP_NAME_HUAMI = "app_pref_huami";

    private NotifyPreference() {
    }

    private final String getNotifyKey(String key, String did) {
        return key + NotifyUtil.INSTANCE.getSuffixTag(did);
    }

    @Nullable
    public final String getInCallNotifyConfig(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return "";
        }
        String str = (String) getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), getNotifyKey(KEY_IN_CALL_NOTIFY_CONFIG, did), "", getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null);
        return str == null ? "" : str;
    }

    public final long getNotificationDelayCloseTime() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return 0L;
        }
        return ((Number) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Long.class), getNotifyKey(KEY_NOTIFICATION_DELAY_CLOSE_TIME, wearableDeviceModel.getDid()), 0L, getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null)).longValue();
    }

    public final long getNotificationDelayTime() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return 0L;
        }
        return ((Number) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Long.class), getNotifyKey(KEY_NOTIFICATION_DELAY_TIME, wearableDeviceModel.getDid()), 0L, getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null)).longValue();
    }

    @Nullable
    public final String getNotifyIconPackageListString(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return "";
        }
        String str = (String) getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), getNotifyKey(KEY_NOTIFICATION_ICON_PACKAGE_LIST, did), "", getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null);
        return str == null ? "" : str;
    }

    @Nullable
    public final String getNotifyListString(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return "";
        }
        String str = (String) getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), getNotifyKey(KEY_NOTIFICATION_ENABLE_LIST, did), "", getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null);
        return str == null ? "" : str;
    }

    public final long getRemindPowerIgnoreTime() {
        return ((Number) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Long.class), KEY_REMIND_IGNORE_POWER_LIMIT_TIME, 0L, getSpName(), null, null)).longValue();
    }

    public final long getRemindUnLimitCloseTime() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return 0L;
        }
        return ((Number) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Long.class), getNotifyKey(KEY_REMIND_UN_LIMIT_CLOSE_TIME, wearableDeviceModel.getDid()), 0L, getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null)).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "notify_preference";
    }

    public final void hideNotificationItemOpenAlert(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(getNotifyKey(KEY_SHOW_NOTIFICATION_ITEM_OPEN_ALERT, did), Boolean.FALSE);
    }

    public final boolean isInCallOptimizationOpen() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        String str = DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble";
        return ((Boolean) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Boolean.class), getNotifyKey(KEY_IN_CALL_OPTIMIZATION, wearableDeviceModel.getDid()), Boolean.TRUE, getSpName(), str, null)).booleanValue();
    }

    public final boolean isNeedShowInCallRemind() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        String str = DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble";
        return ((Boolean) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Boolean.class), getNotifyKey(KEY_SHOW_IN_CALL_REMIND_BANNER, wearableDeviceModel.getDid()), Boolean.TRUE, getSpName(), str, null)).booleanValue();
    }

    public final boolean isNeedShowNotificationRemind() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        String str = DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble";
        return ((Boolean) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Boolean.class), getNotifyKey(KEY_SHOW_NOTIFICATION_REMIND_BANNER, wearableDeviceModel.getDid()), Boolean.TRUE, getSpName(), str, null)).booleanValue();
    }

    public final boolean isNeedShowRemind() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        String str = DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble";
        return ((Boolean) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Boolean.class), getNotifyKey(KEY_NEED_SHOW_REMIND_BANNER, wearableDeviceModel.getDid()), Boolean.TRUE, getSpName(), str, null)).booleanValue();
    }

    public final boolean isNeedSyncAllNotification(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        String str = DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble";
        return ((Boolean) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Boolean.class), getNotifyKey(KEY_NEED_SYNC_ALL_NOTIFICATION, did), Boolean.FALSE, getSpName(), str, null)).booleanValue();
    }

    public final boolean isNeedSyncNotification(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        String str = DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble";
        return ((Boolean) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Boolean.class), getNotifyKey(KEY_NEED_SYNC_NOTIFICATION, did), Boolean.TRUE, getSpName(), str, null)).booleanValue();
    }

    public final boolean isShowNotificationItemOpenAlert(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return true;
        }
        String str = DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble";
        return ((Boolean) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Boolean.class), getNotifyKey(KEY_SHOW_NOTIFICATION_ITEM_OPEN_ALERT, did), Boolean.TRUE, getSpName(), str, null)).booleanValue();
    }

    public final boolean isSyncNotificationOnlyScreenLock(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        String str = DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble";
        return ((Boolean) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Boolean.class), getNotifyKey(KEY_NEED_SYNC_NOTIFICATION_ONLY_SCREEN_LOCK, did), Boolean.FALSE, getSpName(), str, null)).booleanValue();
    }

    public final void setInCallNotifyConfig(@NotNull String did, @Nullable String configJson) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (configJson == null) {
            getPreferences().edit().remove(getNotifyKey(KEY_IN_CALL_NOTIFY_CONFIG, did)).apply();
        } else {
            putValue(getNotifyKey(KEY_IN_CALL_NOTIFY_CONFIG, did), configJson);
        }
    }

    public final void setNeedShowInCallRemind(@NotNull String did, boolean needShow) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(getNotifyKey(KEY_SHOW_IN_CALL_REMIND_BANNER, did), Boolean.valueOf(needShow));
    }

    public final void setNeedShowNotificationRemind(@NotNull String did, boolean needShow) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(getNotifyKey(KEY_SHOW_NOTIFICATION_REMIND_BANNER, did), Boolean.valueOf(needShow));
    }

    public final void setNeedShowRemind(@NotNull String did, boolean needShow) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(getNotifyKey(KEY_NEED_SHOW_REMIND_BANNER, did), Boolean.valueOf(needShow));
    }

    public final void setNeedSyncAllNotification(@NotNull String did, boolean isNeedSync) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(getNotifyKey(KEY_NEED_SYNC_ALL_NOTIFICATION, did), Boolean.valueOf(isNeedSync));
    }

    public final void setNeedSyncNotification(@NotNull String did, boolean isNeedSync) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(getNotifyKey(KEY_NEED_SYNC_NOTIFICATION, did), Boolean.valueOf(isNeedSync));
    }

    public final void setNotificationDelayCloseTime(long delayTime) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        Intrinsics.checkNotNull(did);
        putValue(getNotifyKey(KEY_NOTIFICATION_DELAY_CLOSE_TIME, did), Long.valueOf(delayTime));
    }

    public final void setNotificationDelayTime(long delayTime) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        Intrinsics.checkNotNull(did);
        putValue(getNotifyKey(KEY_NOTIFICATION_DELAY_TIME, did), Long.valueOf(delayTime));
    }

    public final void setNotifyIconListString(@NotNull String did, @Nullable String notifySettings) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (notifySettings == null) {
            getPreferences().edit().remove(getNotifyKey(KEY_NOTIFICATION_ICON_PACKAGE_LIST, did)).apply();
        } else {
            putValue(getNotifyKey(KEY_NOTIFICATION_ICON_PACKAGE_LIST, did), notifySettings);
        }
    }

    public final void setNotifyListString(@NotNull String did, @Nullable String notifySettings) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (notifySettings == null) {
            getPreferences().edit().remove(getNotifyKey(KEY_NOTIFICATION_ENABLE_LIST, did)).apply();
        } else {
            putValue(getNotifyKey(KEY_NOTIFICATION_ENABLE_LIST, did), notifySettings);
        }
    }

    public final void setRemindPowerIgnoreTime(long closeTime) {
        putValue(KEY_REMIND_IGNORE_POWER_LIMIT_TIME, Long.valueOf(closeTime));
    }

    public final void setRemindUnLimitCloseTime(long closeTime) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        putValue(getNotifyKey(KEY_REMIND_UN_LIMIT_CLOSE_TIME, wearableDeviceModel.getDid()), Long.valueOf(closeTime));
    }

    public final void setSyncNotificationOnlyScreenLock(@NotNull String did, boolean only) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(getNotifyKey(KEY_NEED_SYNC_NOTIFICATION_ONLY_SCREEN_LOCK, did), Boolean.valueOf(only));
    }

    public final void isInCallOptimizationOpen(boolean isOpen) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        putValue(getNotifyKey(KEY_IN_CALL_OPTIMIZATION, wearableDeviceModel.getDid()), Boolean.valueOf(isOpen));
    }
}
