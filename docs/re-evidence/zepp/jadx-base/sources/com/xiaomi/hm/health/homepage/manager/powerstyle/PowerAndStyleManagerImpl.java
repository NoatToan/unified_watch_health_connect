package com.xiaomi.hm.health.homepage.manager.powerstyle;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.devicestylepower.DeviceStyle;
import com.huami.devicestylepower.IPowerAndStyleManager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/homepage/manager/powerstyle/PowerAndStyleManagerImpl;", "Lcom/huami/devicestylepower/IPowerAndStyleManager;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/huami/devicestylepower/DeviceStyle;", "c", "type", "b", "a", "", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "e", "type_value", "powerAndStyle", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PowerAndStyleManagerImpl implements IPowerAndStyleManager {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            iArr[HMDeviceType.MILI.ordinal()] = 1;
            iArr[HMDeviceType.WEIGHT.ordinal()] = 2;
            iArr[HMDeviceType.WATCH.ordinal()] = 3;
            iArr[HMDeviceType.TREADMILL.ordinal()] = 4;
            iArr[HMDeviceType.HEADSET.ordinal()] = 5;
            iArr[HMDeviceType.EARBUD.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ DeviceStyle a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeviceStyle deviceStyle) {
            super(0);
            this.a = deviceStyle;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "deviceStyle:" + this.a;
        }
    }

    private final DeviceStyle a(HMDeviceType type) {
        if (e(type) != HMDeviceSource.EARBUD_CHOPIN) {
            return new DeviceStyle.Chopin(-1, -1);
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(type);
        Pair pair = null;
        HmEarbudDevice hmEarbudDevice = device instanceof HmEarbudDevice ? (HmEarbudDevice) device : null;
        if (hmEarbudDevice != null) {
            BatteryInfo batteryInfo = hmEarbudDevice.getBatteryInfo();
            Integer numValueOf = Integer.valueOf(batteryInfo == null ? -1 : batteryInfo.getLevel());
            BatteryInfo batteryInfo2 = hmEarbudDevice.getRightDevice().getBatteryInfo();
            pair = TuplesKt.to(numValueOf, Integer.valueOf(batteryInfo2 != null ? batteryInfo2.getLevel() : -1));
        }
        if (pair == null) {
            pair = TuplesKt.to(-1, -1);
        }
        return new DeviceStyle.Chopin(((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue());
    }

    private final DeviceStyle b(HMDeviceType type) {
        HMDeviceSource hMDeviceSourceE = e(type);
        if (hMDeviceSourceE == HMDeviceSource.OTHER_MOZART || hMDeviceSourceE == HMDeviceSource.OTHER_HAYDN) {
            IHMAuthCallback device = HMDeviceManager.getInstance().getDevice(type);
            if (device instanceof HeadsetDevice) {
                HeadsetDevice headsetDevice = (HeadsetDevice) device;
                BatteryInfo batteryInfo = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Box.INSTANCE);
                int level = batteryInfo == null ? -1 : batteryInfo.getLevel();
                BatteryInfo batteryInfo2 = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Left.INSTANCE);
                int level2 = batteryInfo2 == null ? -1 : batteryInfo2.getLevel();
                BatteryInfo batteryInfo3 = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE);
                int level3 = batteryInfo3 != null ? batteryInfo3.getLevel() : -1;
                return hMDeviceSourceE == HMDeviceSource.OTHER_HAYDN ? new DeviceStyle.Haydn(level2, level3, level) : new DeviceStyle.Mozart(level2, level3, level);
            }
        }
        return new DeviceStyle.Mozart(-1, -1, -1);
    }

    private final DeviceStyle c(HMDeviceType deviceType) {
        HMDeviceSource hMDeviceSourceE = e(deviceType);
        if (hMDeviceSourceE == HMDeviceSource.MILI_VENICE || hMDeviceSourceE == HMDeviceSource.MILI_VENICE_W) {
            return new DeviceStyle.Venice(d(deviceType));
        }
        if (ConfigHelperKt.hasFeature(hMDeviceSourceE, Feature.SQUARE_WATCH_S)) {
            return new DeviceStyle.Square(d(deviceType));
        }
        return ConfigHelperKt.hasFeature(hMDeviceSourceE, Feature.ROUND_WATCH_S) ? new DeviceStyle.Circle(d(deviceType)) : new DeviceStyle.Bracelet(d(deviceType));
    }

    private final int d(HMDeviceType type) {
        BatteryInfo batteryInfo = HMDeviceManager.getInstance().getBatteryInfo(type);
        if (batteryInfo == null) {
            return -1;
        }
        return batteryInfo.getLevel();
    }

    private final HMDeviceSource e(HMDeviceType type) {
        return HMDeviceManager.getInstance().getBoundDeviceSource(type);
    }

    @Override // com.huami.devicestylepower.IPowerAndStyleManager
    @Nullable
    public DeviceStyle powerAndStyle(int type_value) {
        DeviceStyle deviceStyleC;
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(type_value);
        switch (hMDeviceTypeFromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceTypeFromValue.ordinal()]) {
            case 1:
                deviceStyleC = c(hMDeviceTypeFromValue);
                break;
            case 2:
                deviceStyleC = new DeviceStyle.Weight(d(hMDeviceTypeFromValue));
                break;
            case 3:
                deviceStyleC = new DeviceStyle.Circle(WatchPowerHelper.INSTANCE.getWatchPower());
                break;
            case 4:
                deviceStyleC = DeviceStyle.Treadmill.INSTANCE;
                break;
            case 5:
                deviceStyleC = b(hMDeviceTypeFromValue);
                break;
            case 6:
                deviceStyleC = a(hMDeviceTypeFromValue);
                break;
            default:
                deviceStyleC = null;
                break;
        }
        HMLog.info("HomePage", new a(deviceStyleC));
        return deviceStyleC;
    }
}
