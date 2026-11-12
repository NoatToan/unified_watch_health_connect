package com.xiaomi.fitness.devicesettings.export;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/DeviceSettingsExportPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "KEY_IS_SYNC_SLEEP_MODEL", "getKEY_IS_SYNC_SLEEP_MODEL", "()Z", "setKEY_IS_SYNC_SLEEP_MODEL", "(Z)V", "KEY_IS_SYNC_SLEEP_MODEL$delegate", "Lkotlin/properties/ReadWriteProperty;", "isAppMusicSync2Device", "setAppMusicSync2Device", "isAppMusicSync2Device$delegate", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceSettingsExportPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSettingsExportPreference.kt\ncom/xiaomi/fitness/devicesettings/export/DeviceSettingsExportPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,12:1\n135#2,6:13\n135#2,6:19\n*S KotlinDebug\n*F\n+ 1 DeviceSettingsExportPreference.kt\ncom/xiaomi/fitness/devicesettings/export/DeviceSettingsExportPreference\n*L\n9#1:13,6\n11#1:19,6\n*E\n"})
public final class DeviceSettingsExportPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsExportPreference.class, "KEY_IS_SYNC_SLEEP_MODEL", "getKEY_IS_SYNC_SLEEP_MODEL()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsExportPreference.class, "isAppMusicSync2Device", "isAppMusicSync2Device()Z", 0))};

    @NotNull
    public static final DeviceSettingsExportPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_IS_SYNC_SLEEP_MODEL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_IS_SYNC_SLEEP_MODEL;

    /* JADX INFO: renamed from: isAppMusicSync2Device$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty isAppMusicSync2Device;

    static {
        DeviceSettingsExportPreference deviceSettingsExportPreference = new DeviceSettingsExportPreference();
        INSTANCE = deviceSettingsExportPreference;
        KEY_IS_SYNC_SLEEP_MODEL = deviceSettingsExportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, false);
        isAppMusicSync2Device = deviceSettingsExportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Boolean.TRUE, null, false);
    }

    private DeviceSettingsExportPreference() {
    }

    public final boolean getKEY_IS_SYNC_SLEEP_MODEL() {
        return ((Boolean) KEY_IS_SYNC_SLEEP_MODEL.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "device_settings_export_preference";
    }

    public final boolean isAppMusicSync2Device() {
        return ((Boolean) isAppMusicSync2Device.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final void setAppMusicSync2Device(boolean z) {
        isAppMusicSync2Device.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setKEY_IS_SYNC_SLEEP_MODEL(boolean z) {
        KEY_IS_SYNC_SLEEP_MODEL.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
