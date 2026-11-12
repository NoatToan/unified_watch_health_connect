package com.xiaomi.hm.health.device;

import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.HardwareInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.cincoentrance.CincoEntranceHelperKt;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.kongmingentrance.KongmingEntranceHelperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u0006\u0010\u0005\u001a\u00020\u0000\u001a\u0006\u0010\u0006\u001a\u00020\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a\u0006\u0010\t\u001a\u00020\u0000\u001a\n\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002\u001a\u0006\u0010\u000b\u001a\u00020\u0000\u001a\u0006\u0010\f\u001a\u00020\u0000\u001a\u0006\u0010\r\u001a\u00020\u0000\u001a\u0006\u0010\u000e\u001a\u00020\u0000\u001a\u0006\u0010\u000f\u001a\u00020\u0000\u001a\u0006\u0010\u0010\u001a\u00020\u0000\u001a\u0006\u0010\u0011\u001a\u00020\u0000¨\u0006\u0012"}, d2 = {"", "isNfcWatchDevice", "hasFeatureNfc", "isSupportNfcTag", "hasFeatureNfcBusDevice", "hasFeatureNfcBankDevice", "hasFeatureNfcDoorDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "hmDeviceSource", "hasFeatureXpCarDevice", "a", "hasDoorFeatureAndMainland", "hasFeatureNfcMasterDevice", "needJudgeWrist", "wristAndPinHasState", "hasFeatureNfcDoorAndBank", "hasFeatureNfcDoor", "hasFeatureNfcTag", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class NfcDeviceConfigKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.WATCH_AMAZFIT_XIHU_DISNEY.ordinal()] = 1;
            iArr[HMDeviceSource.WATCH_AMAZFIT_QOG.ordinal()] = 2;
            iArr[HMDeviceSource.WATCH_AMAZFIT_XIHU.ordinal()] = 3;
            iArr[HMDeviceSource.WATCH_AMAZFIT_XIHU_E.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_KONGMING.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_PANGU.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_L66_NFC.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_L66_NFC_I.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "hasFeatureXpCarDevice:" + this.a;
        }
    }

    private static final HMDeviceSource a() {
        Device bindInfo = ManagerFunctionsKt.getDeviceManagerApi().getBindInfo(ManagerFunctionsKt.getDeviceManagerApi().getMajorDeviceTypeNew());
        if (bindInfo == null) {
            return null;
        }
        return HMDeviceSource.fromValue(bindInfo.getDevice_source().intValue());
    }

    public static final boolean hasDoorFeatureAndMainland() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (HMDeviceSource.VDEVICE == boundDeviceSource) {
            return false;
        }
        return CincoEntranceHelperKt.isCincoMainland(boundDeviceSource) || KongmingEntranceHelperKt.isKongmingMainland(boundDeviceSource) || (HMDeviceConfig.hasBound(HMDeviceSource.MILI_CHONGQING) && hasFeatureNfcDoorDevice());
    }

    public static final boolean hasFeatureNfc() {
        HMDeviceSource hMDeviceSourceA;
        return !GlobalConfig.get().isBuildAmazfit() && (hMDeviceSourceA = a()) != null && ConfigHelperKt.hasFeature(hMDeviceSourceA, Feature.NFC_DOOR) && ConfigHelperKt.hasFeature(hMDeviceSourceA, Feature.NFC_BUS);
    }

    public static final boolean hasFeatureNfcBankDevice() {
        HMDeviceSource hMDeviceSourceA;
        if (GlobalConfig.get().isBuildAmazfit() || (hMDeviceSourceA = a()) == null) {
            return false;
        }
        if (hMDeviceSourceA == HMDeviceSource.MILI_PANGU) {
            return HardwareInfo.isMiliPanguMainLand(CincoEntranceHelperKt.getHardwareVersion());
        }
        if (hMDeviceSourceA == HMDeviceSource.MILI_L66_NFC || hMDeviceSourceA == HMDeviceSource.MILI_L66_NFC_I) {
            return false;
        }
        return ConfigHelperKt.hasFeature(hMDeviceSourceA, Feature.NFC_BUS);
    }

    public static final boolean hasFeatureNfcBusDevice() {
        HMDeviceSource hMDeviceSourceA;
        if (GlobalConfig.get().isBuildAmazfit() || (hMDeviceSourceA = a()) == null) {
            return false;
        }
        return hMDeviceSourceA == HMDeviceSource.MILI_PANGU ? HardwareInfo.isMiliPanguMainLand(CincoEntranceHelperKt.getHardwareVersion()) : ConfigHelperKt.hasFeature(hMDeviceSourceA, Feature.NFC_BUS);
    }

    public static final boolean hasFeatureNfcDoor() {
        HMDeviceSource hMDeviceSourceA = a();
        if (hMDeviceSourceA == null) {
            return false;
        }
        return ConfigHelperKt.hasFeature(hMDeviceSourceA, Feature.NFC_DOOR);
    }

    public static final boolean hasFeatureNfcDoorAndBank() {
        HMDeviceSource hMDeviceSourceA = a();
        return hMDeviceSourceA != null && ConfigHelperKt.hasFeature(hMDeviceSourceA, Feature.NFC_DOOR) && ConfigHelperKt.hasFeature(hMDeviceSourceA, Feature.NFC_MASTER);
    }

    public static final boolean hasFeatureNfcDoorDevice() {
        return hasFeatureNfcDoorDevice(a());
    }

    public static final boolean hasFeatureNfcMasterDevice() {
        HMDeviceSource hMDeviceSourceA;
        if (GlobalConfig.get().isBuildAmazfit() || (hMDeviceSourceA = a()) == null) {
            return false;
        }
        return hMDeviceSourceA == HMDeviceSource.MILI_PANGU ? !HardwareInfo.isMiliPanguMainLand(CincoEntranceHelperKt.getHardwareVersion()) : ConfigHelperKt.hasFeature(hMDeviceSourceA, Feature.NFC_MASTER);
    }

    public static final boolean hasFeatureNfcTag() {
        HMDeviceSource hMDeviceSourceA = a();
        if (hMDeviceSourceA == null) {
            return false;
        }
        return ConfigHelperKt.hasFeature(hMDeviceSourceA, Feature.NFC_TAG);
    }

    public static final boolean hasFeatureXpCarDevice() {
        boolean zHasSw = HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(24);
        HMLog.info$default(null, new a(zHasSw), 1, null);
        return zHasSw;
    }

    public static final boolean isNfcWatchDevice() {
        HMDeviceSource hMDeviceSourceA = a();
        if (hMDeviceSourceA == null) {
            return false;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[hMDeviceSourceA.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public static final boolean isSupportNfcTag() {
        return false;
    }

    public static final boolean needJudgeWrist() {
        HMDeviceSource hMDeviceSourceA = a();
        int i = hMDeviceSourceA == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceSourceA.ordinal()];
        return i == 5 || i == 6 || i == 7 || i == 8;
    }

    public static final boolean wristAndPinHasState() {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice();
        HMDeviceSource hMDeviceSourceA = a();
        if (hMDeviceSourceA != HMDeviceSource.MILI_L66_NFC && hMDeviceSourceA != HMDeviceSource.MILI_L66_NFC_I) {
            if (device instanceof HMMiLiProDevice) {
                return ((HMMiLiProDevice) device).readWristAndPinStateSync();
            }
            return false;
        }
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice == null) {
            return false;
        }
        return Intrinsics.areEqual(hMMiLiProDevice.getLockStatus(), Boolean.FALSE);
    }

    public static final boolean hasFeatureNfcDoorDevice(@Nullable HMDeviceSource hMDeviceSource) {
        if (GlobalConfig.get().isBuildAmazfit() || hMDeviceSource == null) {
            return false;
        }
        return hMDeviceSource == HMDeviceSource.MILI_PANGU ? HardwareInfo.isMiliPanguMainLand(CincoEntranceHelperKt.getHardwareVersion()) : ConfigHelperKt.hasFeature(hMDeviceSource, Feature.NFC_DOOR);
    }
}
