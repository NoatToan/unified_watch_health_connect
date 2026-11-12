package com.xiaomi.fitness.sync.export;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0017J\u000e\u00103\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0005J\u0016\u00104\u001a\u0002002\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0017J\u000e\u00105\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0005J\u0016\u00106\u001a\u0002002\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0017J\u000e\u00107\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0005J\u0016\u00108\u001a\u0002002\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0017J\u000e\u00109\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0005J\u0016\u0010:\u001a\u0002002\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0017J\u000e\u0010;\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0005J\u0016\u0010<\u001a\u0002002\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0017J\u000e\u0010=\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0005J\u000e\u0010>\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0005J\u0016\u0010?\u001a\u0002002\u0006\u00101\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u001fJ\u000e\u0010A\u001a\u0002002\u0006\u00102\u001a\u00020\u0005J\u0006\u0010B\u001a\u00020\u0005J\u000e\u0010C\u001a\u0002002\u0006\u00102\u001a\u00020\u0005J\b\u0010D\u001a\u0004\u0018\u00010\u0005J\u000e\u0010E\u001a\u0002002\u0006\u00102\u001a\u00020\u0005J\b\u0010F\u001a\u0004\u0018\u00010\u0005J\u000e\u0010G\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0005J\u0016\u0010H\u001a\u0002002\u0006\u00101\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u001fJ\u0010\u0010I\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010&\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010)R+\u0010+\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001e\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001c¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/sync/export/SyncPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "KEY_SYNC_WEATHER_LAST_TIME", "KEY_SYNC_WEATHER_LOCATION_LAST_TIME", "KEY_SYNC_CALENDAR_LAST_TIME", "KEY_SYNC_STOCK_LAST_TIME", "KEY_SYNC_PRESSURE_LAST_TIME", "KEY_SYNC_LANG_IN_FIRST_BIND", "KEY_SYNC_TIME_LAST_TIME", "KEY_NEED_SYNC_WEATHER", "KEY_SYNC_WEATHER_LOCATION_KEY", "KEY_SYNC_STOCK_HOST_KEY", "KEY_SYNC_STOCK_TOKEN_KEY", "KEY_SYNC_SCHEDULE", "SP_NAME_BLE", "SP_NAME_HUAMI", "<set-?>", "", "LAST_SYNC_CALENDAR_ID", "getLAST_SYNC_CALENDAR_ID", "()J", "setLAST_SYNC_CALENDAR_ID", "(J)V", "LAST_SYNC_CALENDAR_ID$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "KEY_SYNC_WIFI", "getKEY_SYNC_WIFI", "()Z", "setKEY_SYNC_WIFI", "(Z)V", "KEY_SYNC_WIFI$delegate", "CACHED_WIFI_INFO", "getCACHED_WIFI_INFO", "setCACHED_WIFI_INFO", "(Ljava/lang/String;)V", "CACHED_WIFI_INFO$delegate", "CACHED_WIFI_SAVE_TIME", "getCACHED_WIFI_SAVE_TIME", "setCACHED_WIFI_SAVE_TIME", "CACHED_WIFI_SAVE_TIME$delegate", "setSyncWeatherLastTime", "", "did", "value", "getSyncWeatherLastTime", "setSyncCalendarLastTime", "getSyncCalendarLastTime", "setSyncStockLastTime", "getSyncStockLastTime", "setSyncPressureLastTime", "getSyncPressureLastTime", "setSyncWeatherLocationLastTime", "getSyncWeatherLocationLastTime", "setSyncTimeLastTime", "getSyncTimeLastTime", "isNeedSyncWeather", "setNeedSyncWeather", "isNeedSync", "setWeatherLocation", "getWeatherLocation", "setLocalStockHost", "getLocalStockHost", "setLocalStockToken", "getLocalStockToken", "isNeedSyncSchedule", "setNeedSyncSchedule", "getSuffixTag", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSyncPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncPreference.kt\ncom/xiaomi/fitness/sync/export/SyncPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,145:1\n346#2,8:146\n346#2,8:154\n346#2,8:162\n346#2,8:170\n346#2,8:178\n346#2,8:186\n346#2,8:194\n346#2,8:202\n346#2,8:210\n346#2,8:218\n135#2,6:226\n135#2,6:232\n135#2,6:238\n135#2,6:244\n*S KotlinDebug\n*F\n+ 1 SyncPreference.kt\ncom/xiaomi/fitness/sync/export/SyncPreference\n*L\n40#1:146,8\n50#1:154,8\n60#1:162,8\n70#1:170,8\n80#1:178,8\n91#1:186,8\n97#1:194,8\n111#1:202,8\n121#1:210,8\n131#1:218,8\n28#1:226,6\n29#1:232,6\n30#1:238,6\n31#1:244,6\n*E\n"})
public final class SyncPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SyncPreference.class, "LAST_SYNC_CALENDAR_ID", "getLAST_SYNC_CALENDAR_ID()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SyncPreference.class, "KEY_SYNC_WIFI", "getKEY_SYNC_WIFI()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SyncPreference.class, "CACHED_WIFI_INFO", "getCACHED_WIFI_INFO()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SyncPreference.class, "CACHED_WIFI_SAVE_TIME", "getCACHED_WIFI_SAVE_TIME()J", 0))};

    /* JADX INFO: renamed from: CACHED_WIFI_INFO$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CACHED_WIFI_INFO;

    /* JADX INFO: renamed from: CACHED_WIFI_SAVE_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CACHED_WIFI_SAVE_TIME;

    @NotNull
    public static final SyncPreference INSTANCE;

    @NotNull
    private static final String KEY_NEED_SYNC_WEATHER = "key_sync_weather";

    @NotNull
    private static final String KEY_SYNC_CALENDAR_LAST_TIME = "key_sync_calendar_last_time";

    @NotNull
    private static final String KEY_SYNC_LANG_IN_FIRST_BIND = "key_huami_lang_bind_flag";

    @NotNull
    private static final String KEY_SYNC_PRESSURE_LAST_TIME = "key_sync_pressure_last_time";

    @NotNull
    private static final String KEY_SYNC_SCHEDULE = "should_sync_schedule";

    @NotNull
    private static final String KEY_SYNC_STOCK_HOST_KEY = "key_sync_stock_host_key";

    @NotNull
    private static final String KEY_SYNC_STOCK_LAST_TIME = "key_sync_stock_last_time";

    @NotNull
    private static final String KEY_SYNC_STOCK_TOKEN_KEY = "key_sync_stock_token_key";

    @NotNull
    private static final String KEY_SYNC_TIME_LAST_TIME = "key_sync_time_last_time";

    @NotNull
    private static final String KEY_SYNC_WEATHER_LAST_TIME = "key_sync_weather_last_time";

    @NotNull
    private static final String KEY_SYNC_WEATHER_LOCATION_KEY = "key_sync_weather_location_key";

    @NotNull
    private static final String KEY_SYNC_WEATHER_LOCATION_LAST_TIME = "key_sync_weather_location_last_time";

    /* JADX INFO: renamed from: KEY_SYNC_WIFI$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SYNC_WIFI;

    /* JADX INFO: renamed from: LAST_SYNC_CALENDAR_ID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_SYNC_CALENDAR_ID;

    @NotNull
    public static final String SP_NAME_BLE = "app_pref_ble";

    @NotNull
    public static final String SP_NAME_HUAMI = "app_pref_huami";

    static {
        SyncPreference syncPreference = new SyncPreference();
        INSTANCE = syncPreference;
        LAST_SYNC_CALENDAR_ID = syncPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.sync.export.SyncPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, false);
        KEY_SYNC_WIFI = syncPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sync.export.SyncPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Boolean.FALSE, null, false);
        CACHED_WIFI_INFO = syncPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sync.export.SyncPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), "", null, false);
        CACHED_WIFI_SAVE_TIME = syncPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.sync.export.SyncPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), 0L, null, false);
    }

    private SyncPreference() {
    }

    private final String getSuffixTag(String did) {
        return "-" + did;
    }

    @NotNull
    public final String getCACHED_WIFI_INFO() {
        return (String) CACHED_WIFI_INFO.getValue(this, $$delegatedProperties[2]);
    }

    public final long getCACHED_WIFI_SAVE_TIME() {
        return ((Number) CACHED_WIFI_SAVE_TIME.getValue(this, $$delegatedProperties[3])).longValue();
    }

    public final boolean getKEY_SYNC_WIFI() {
        return ((Boolean) KEY_SYNC_WIFI.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final long getLAST_SYNC_CALENDAR_ID() {
        return ((Number) LAST_SYNC_CALENDAR_ID.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @Nullable
    public final String getLocalStockHost() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return "";
        }
        String str = (String) getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), KEY_SYNC_STOCK_HOST_KEY, "", getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null);
        return str == null ? "" : str;
    }

    @Nullable
    public final String getLocalStockToken() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return "";
        }
        String str = (String) getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), KEY_SYNC_STOCK_TOKEN_KEY, "", getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null);
        return str == null ? "" : str;
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sync_preference";
    }

    public final long getSyncCalendarLastTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            return -1L;
        }
        return ((Number) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Long.class), KEY_SYNC_CALENDAR_LAST_TIME + getSuffixTag(did), -1L, getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null)).longValue();
    }

    public final long getSyncPressureLastTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            return -1L;
        }
        return ((Number) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Long.class), KEY_SYNC_PRESSURE_LAST_TIME + getSuffixTag(did), -1L, getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null)).longValue();
    }

    public final long getSyncStockLastTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            return -1L;
        }
        return ((Number) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Long.class), KEY_SYNC_STOCK_LAST_TIME + getSuffixTag(did), -1L, getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null)).longValue();
    }

    public final long getSyncTimeLastTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            return -1L;
        }
        return ((Number) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Long.class), KEY_SYNC_TIME_LAST_TIME + getSuffixTag(did), -1L, getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null)).longValue();
    }

    public final long getSyncWeatherLastTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            return -1L;
        }
        return ((Number) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Long.class), KEY_SYNC_WEATHER_LAST_TIME + getSuffixTag(did), -1L, getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null)).longValue();
    }

    public final long getSyncWeatherLocationLastTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            return -1L;
        }
        return ((Number) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Long.class), KEY_SYNC_WEATHER_LOCATION_KEY + getSuffixTag(did), -1L, getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null)).longValue();
    }

    @NotNull
    public final String getWeatherLocation() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return "";
        }
        String str = (String) getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), KEY_SYNC_WEATHER_LOCATION_KEY, "", getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null);
        return str == null ? "" : str;
    }

    public final boolean isNeedSyncSchedule(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) getValue("device_settings", KEY_SYNC_SCHEDULE, Boolean.FALSE)).booleanValue();
    }

    public final boolean isNeedSyncWeather(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            return false;
        }
        return ((Boolean) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Boolean.class), KEY_NEED_SYNC_WEATHER + getSuffixTag(did), Boolean.TRUE, getSpName(), DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? "app_pref_huami" : "app_pref_ble", null)).booleanValue();
    }

    public final void setCACHED_WIFI_INFO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CACHED_WIFI_INFO.setValue(this, $$delegatedProperties[2], str);
    }

    public final void setCACHED_WIFI_SAVE_TIME(long j) {
        CACHED_WIFI_SAVE_TIME.setValue(this, $$delegatedProperties[3], Long.valueOf(j));
    }

    public final void setKEY_SYNC_WIFI(boolean z) {
        KEY_SYNC_WIFI.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setLAST_SYNC_CALENDAR_ID(long j) {
        LAST_SYNC_CALENDAR_ID.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final void setLocalStockHost(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        putValue(KEY_SYNC_STOCK_HOST_KEY, value);
    }

    public final void setLocalStockToken(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        putValue(KEY_SYNC_STOCK_TOKEN_KEY, value);
    }

    public final void setNeedSyncSchedule(@NotNull String did, boolean isNeedSync) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue("device_settings", KEY_SYNC_SCHEDULE, Boolean.valueOf(isNeedSync));
    }

    public final void setNeedSyncWeather(@NotNull String did, boolean isNeedSync) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(KEY_NEED_SYNC_WEATHER + getSuffixTag(did), Boolean.valueOf(isNeedSync));
    }

    public final void setSyncCalendarLastTime(@NotNull String did, long value) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(KEY_SYNC_CALENDAR_LAST_TIME + getSuffixTag(did), Long.valueOf(value));
    }

    public final void setSyncPressureLastTime(@NotNull String did, long value) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(KEY_SYNC_PRESSURE_LAST_TIME + getSuffixTag(did), Long.valueOf(value));
    }

    public final void setSyncStockLastTime(@NotNull String did, long value) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(KEY_SYNC_STOCK_LAST_TIME + getSuffixTag(did), Long.valueOf(value));
    }

    public final void setSyncTimeLastTime(@NotNull String did, long value) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(KEY_SYNC_TIME_LAST_TIME + getSuffixTag(did), Long.valueOf(value));
    }

    public final void setSyncWeatherLastTime(@NotNull String did, long value) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(KEY_SYNC_WEATHER_LAST_TIME + getSuffixTag(did), Long.valueOf(value));
    }

    public final void setSyncWeatherLocationLastTime(@NotNull String did, long value) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(KEY_SYNC_WEATHER_LOCATION_KEY + getSuffixTag(did), Long.valueOf(value));
    }

    public final void setWeatherLocation(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        putValue(KEY_SYNC_WEATHER_LOCATION_KEY, value);
    }
}
