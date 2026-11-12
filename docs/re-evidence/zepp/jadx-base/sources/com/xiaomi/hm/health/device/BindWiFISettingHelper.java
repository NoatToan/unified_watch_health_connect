package com.xiaomi.hm.health.device;

import com.huami.bluetooth.profile.channel.module.WiFiControllerModule;
import com.huami.core.device.wifi_settings.service.IWiFiControllerProxy;
import com.huami.core.device.wifi_settings.service.WiFiSettingInit;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/device/BindWiFISettingHelper;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindWiFISettingHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "BindWiFISettingHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/BindWiFISettingHelper$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "bleDevice", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy;", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "isDeviceNeedSettingWiFi", "initIWiFiController", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final IWiFiControllerProxy a(HMBaseDevice bleDevice) {
            return new BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1(bleDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WiFiControllerModule b(HMBaseDevice hMBaseDevice) {
            WiFiControllerModule wiFiControllerModule = (WiFiControllerModule) hMBaseDevice.getChannelModule(WiFiControllerModule.class);
            if (wiFiControllerModule == null) {
                return null;
            }
            return wiFiControllerModule;
        }

        @Nullable
        public final IWiFiControllerProxy initIWiFiController(@NotNull HMBaseDevice bleDevice) {
            IWiFiControllerProxy iWiFiControllerProxyA;
            try {
                HMDeviceSource deviceSource = bleDevice.getMDeviceSource();
                if (deviceSource == HMDeviceSource.VDEVICE || (iWiFiControllerProxyA = a(bleDevice)) == null) {
                    return null;
                }
                WiFiSettingInit.INSTANCE.registerControllerProxy(deviceSource.getValue(), iWiFiControllerProxyA);
                return iWiFiControllerProxyA;
            } catch (Throwable th) {
                HMLog.e(BindWiFISettingHelper.TAG, "初始化 wifiSetting 失败", th);
                return null;
            }
        }

        public final boolean isDeviceNeedSettingWiFi(@NotNull HMDeviceSource deviceSource) {
            return deviceSource == HMDeviceSource.WEIGHT_AMAZFIT_SCALE;
        }
    }
}
