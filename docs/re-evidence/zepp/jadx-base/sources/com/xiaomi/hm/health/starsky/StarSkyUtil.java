package com.xiaomi.hm.health.starsky;

import com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApiImpl;
import com.huami.bluetooth.profile.channel.module.starsky.StarSkyModule;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.starsky.api.StarSkyApi;
import com.xiaomi.hm.health.starsky.api.channel.ChannelStarSkyApiImpl;
import com.xiaomi.hm.health.starsky.api.gdsp.GdspStarSkyApiImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0013\u0010\u000b\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/starsky/StarSkyUtil;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "isDeviceSupportStarSkyFeature", "deviceType", "isSupportDeviceStatusInSky", "Lcom/xiaomi/hm/health/starsky/api/StarSkyApi;", "getStarSkyApi", "()Lcom/xiaomi/hm/health/starsky/api/StarSkyApi;", "starSkyApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class StarSkyUtil {

    @NotNull
    public static final StarSkyUtil INSTANCE = new StarSkyUtil();

    private StarSkyUtil() {
    }

    @NotNull
    public final StarSkyApi getStarSkyApi() {
        StarSkyModule starSkyModule;
        Feature deviceFeature;
        HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
        ChannelStarSkyApiImpl channelStarSkyApiImpl = null;
        if (miliDevice != null) {
            boolean z = true;
            if (!ConfigHelperKt.hasFeature(com.xiaomi.hm.health.device.deviceconfig.Feature.GT3_SOURCE, miliDevice.getMDeviceSource())) {
                DeviceInfo deviceInfo = miliDevice.getDeviceInfo();
                if (!((deviceInfo == null || (deviceFeature = deviceInfo.getDeviceFeature()) == null || !deviceFeature.hasSw(51)) ? false : true)) {
                    z = false;
                }
            }
            if (!z) {
                miliDevice = null;
            }
            if (miliDevice != null && (starSkyModule = (StarSkyModule) miliDevice.getChannelModule(StarSkyModule.class)) != null) {
                channelStarSkyApiImpl = new ChannelStarSkyApiImpl(new StarSkyChannelApiImpl(starSkyModule));
            }
        }
        return channelStarSkyApiImpl == null ? GdspStarSkyApiImpl.INSTANCE.getInstance() : channelStarSkyApiImpl;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    public final boolean isDeviceSupportStarSkyFeature(@NotNull HMDeviceType type) {
        boolean z;
        DeviceInfo deviceInfo;
        Feature deviceFeature;
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(type);
        if (device != null) {
            if (ConfigHelperKt.hasFeature(com.xiaomi.hm.health.device.deviceconfig.Feature.GT3_SOURCE, device.getMDeviceSource()) && device.supportModule(54)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return device != null && (deviceInfo = device.getDeviceInfo()) != null && (deviceFeature = deviceInfo.getDeviceFeature()) != null && deviceFeature.hasSw(51);
    }

    public final boolean isSupportDeviceStatusInSky(@NotNull HMDeviceType deviceType) {
        return deviceType == HMDeviceType.MILI && (isDeviceSupportStarSkyFeature(deviceType) || ConfigHelperKt.hasFeature(HMDeviceManager.getInstance().getBoundDeviceSource(deviceType), com.xiaomi.hm.health.device.deviceconfig.Feature.HR_REALTIME_SOURCE_S));
    }
}
