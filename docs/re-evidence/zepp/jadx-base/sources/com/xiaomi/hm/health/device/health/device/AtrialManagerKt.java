package com.xiaomi.hm.health.device.health.device;

import com.huami.device.feature.health.HealthDetect;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.util.NumUtil;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.medical.MedicalUtilKt;
import com.xiaomi.market.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\b\u0010\b\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "isSupportAtrialFib", "isShowAtrialFib", "", "version", "c", "b", "", Constants.JSON_FEATURE, "a", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class AtrialManagerKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_FALCON.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_KESTREL.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_DTH.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_VULTURE.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_VENICE.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final boolean a(int i) {
        return HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(i);
    }

    private static final boolean b() {
        DeviceInfo deviceInfo;
        String hardwareVersionStr;
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
        String str = null;
        if (device != null && (deviceInfo = device.getDeviceInfo()) != null && (hardwareVersionStr = deviceInfo.getHardwareVersionStr()) != null) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) m.replace$default(hardwareVersionStr, "V", "", false, 4, (Object) null), new String[]{"."}, false, 0, 6, (Object) null);
            if (listSplit$default.size() >= 3 && (NumUtil.toInt((String) listSplit$default.get(2)) >> 4) == 8) {
                str = hardwareVersionStr;
            }
        }
        return str != null;
    }

    private static final boolean c(String str) {
        return ProfileUtils.getVersionCodeFromVersionName(HMDeviceManager.getInstance().getBoundDeviceFirmwareVersion(HMDeviceType.MILI)) >= ProfileUtils.getVersionCodeFromVersionName(str);
    }

    public static final boolean isShowAtrialFib() {
        HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
        return isSupportAtrialFib(majorDeviceType) && (majorDeviceType == HMDeviceType.WATCH || HealthDetect.INSTANCE.getUserConfig().getAtrialFibEnable());
    }

    public static final boolean isSupportAtrialFib(@NotNull HMDeviceType hMDeviceType) {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(hMDeviceType);
        if (MedicalUtilKt.isMedicalCollectDevice(boundDeviceSource) || !ConfigHelperKt.hasFeature(Feature.SUPPORT_ATRIAL_FIB, boundDeviceSource)) {
            return false;
        }
        if (hMDeviceType == HMDeviceType.WATCH) {
            Device currentDevice = DeviceManager.getManager(DeviceXFunctionsKt.getContext()).getCurrentDevice();
            if (currentDevice == null) {
                return false;
            }
            return DeviceUtil.isSupportAtrialFibrillation(currentDevice);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[boundDeviceSource.ordinal()];
        if (i == 1) {
            return c("1.6.6.01");
        }
        if (i == 2) {
            return c("0.0.7.00");
        }
        if (i == 3) {
            return c("4.1.5.02");
        }
        if (i != 4) {
            if (i == 5) {
                return a(34);
            }
        } else if (!c("1.1.0.0") || !b()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean isSupportAtrialFib$default(HMDeviceType hMDeviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
        }
        return isSupportAtrialFib(hMDeviceType);
    }
}
