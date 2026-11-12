package com.huami.phn.core.device;

import com.huami.bluetooth.profile.channel.module.sport.PHNModule;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/phn/core/device/DeviceManager;", "", "", "Lcom/huami/phn/core/device/Device;", "getBindingDevice", "getActiveDevice", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getActiveBleDevice", "", "isActiveDeviceConnected", "isActiveDeviceSupportPhn", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceManager {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean isActiveDeviceConnected(@NotNull DeviceManager deviceManager) {
            HMBaseDevice activeBleDevice = deviceManager.getActiveBleDevice();
            if (activeBleDevice == null) {
                return false;
            }
            return activeBleDevice.isConnected();
        }

        public static boolean isActiveDeviceSupportPhn(@NotNull DeviceManager deviceManager) {
            HMBaseDevice activeBleDevice = deviceManager.getActiveBleDevice();
            if (activeBleDevice == null) {
                return false;
            }
            return activeBleDevice.supportModule(PHNModule.class);
        }
    }

    @Nullable
    HMBaseDevice getActiveBleDevice();

    @Nullable
    Device getActiveDevice();

    @NotNull
    List<Device> getBindingDevice();

    boolean isActiveDeviceConnected();

    boolean isActiveDeviceSupportPhn();
}
