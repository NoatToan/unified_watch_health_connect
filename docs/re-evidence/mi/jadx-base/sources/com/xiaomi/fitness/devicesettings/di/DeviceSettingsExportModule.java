package com.xiaomi.fitness.devicesettings.di;

import com.mi.fitness.capability.export.model.CapabilityModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.devicesettings.DeviceSettingHelperImpl;
import com.xiaomi.fitness.devicesettings.SettingsPageUtilImpl;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.WearModeHelperImpl;
import com.xiaomi.fitness.devicesettings.common.phonemute.PhoneMuteHelperImpl;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingHelper;
import com.xiaomi.fitness.devicesettings.export.HealthMonitorManager;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.phonemute.PhoneMuteHelper;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelper;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH'¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsExportModule;", "", "<init>", "()V", "bindPageUtil", "Lcom/xiaomi/fitness/devicesettings/export/SettingsPageUtil;", "util", "Lcom/xiaomi/fitness/devicesettings/SettingsPageUtilImpl;", "bindSyncHelper", "Lcom/xiaomi/fitness/devicesettings/export/sync/DeviceSettingsSyncHelper;", "helperImpl", "Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsSyncHelperImpl;", "bindPhoneMuteHelper", "Lcom/xiaomi/fitness/devicesettings/export/phonemute/PhoneMuteHelper;", "Lcom/xiaomi/fitness/devicesettings/common/phonemute/PhoneMuteHelperImpl;", "bindHrSettingHelper", "Lcom/xiaomi/fitness/devicesettings/export/HealthMonitorManager;", "Lcom/xiaomi/fitness/devicesettings/di/HealthMonitorManagerImpl;", "bindWearModeHelper", "Lcom/xiaomi/fitness/devicesettings/export/wearmode/WearModeHelper;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/WearModeHelperImpl;", "bindDeviceSettingsXms", "Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsXms;", "deviceSettingsXmsImpl", "Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsXmsImpl;", "bindDeviceSettingHelper", "Lcom/xiaomi/fitness/devicesettings/export/DeviceSettingHelper;", "deviceSettingHelperImpl", "Lcom/xiaomi/fitness/devicesettings/DeviceSettingHelperImpl;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeviceSettingsExportModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsExportModule$Companion;", "", "<init>", "()V", "provideSupportSyncCapture", "Lcom/mi/fitness/capability/export/model/CapabilityModel;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CapabilityModel provideSupportSyncCapture() {
            if (RomUtils.INSTANCE.isAtLeastHyperOS2(ApplicationExtKt.getApplication())) {
                Logger.i("DeviceSettingsExportModule", "is hyperos 2.0");
                return new CapabilityModel(131072);
            }
            Logger.i("DeviceSettingsExportModule", "provideIsHyperOS2:" + RomUtils.isXiaomi() + "-" + RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)));
            return new CapabilityModel(0);
        }
    }

    @NotNull
    public abstract DeviceSettingHelper bindDeviceSettingHelper(@NotNull DeviceSettingHelperImpl deviceSettingHelperImpl);

    @NotNull
    public abstract DeviceSettingsXms bindDeviceSettingsXms(@NotNull DeviceSettingsXmsImpl deviceSettingsXmsImpl);

    @NotNull
    public abstract HealthMonitorManager bindHrSettingHelper(@NotNull HealthMonitorManagerImpl helperImpl);

    @NotNull
    public abstract SettingsPageUtil bindPageUtil(@NotNull SettingsPageUtilImpl util2);

    @NotNull
    public abstract PhoneMuteHelper bindPhoneMuteHelper(@NotNull PhoneMuteHelperImpl helperImpl);

    @NotNull
    public abstract DeviceSettingsSyncHelper bindSyncHelper(@NotNull DeviceSettingsSyncHelperImpl helperImpl);

    @NotNull
    public abstract WearModeHelper bindWearModeHelper(@NotNull WearModeHelperImpl helperImpl);
}
