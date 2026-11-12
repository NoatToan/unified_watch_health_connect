package com.xiaomi.hm.health.device.cincoentrance;

import com.huami.account.HMLoginManager;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.CincoEntrance;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HardwareInfo;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0002\u001a\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\u0006\u0010\u0007\u001a\u00020\u0002\u001a\u0006\u0010\b\u001a\u00020\u0002\u001a\u0006\u0010\t\u001a\u00020\u0002\u001a\u0006\u0010\n\u001a\u00020\u0002\u001a\u0006\u0010\u000b\u001a\u00020\u0002\u001a\u0006\u0010\f\u001a\u00020\u0002\u001a\u0006\u0010\r\u001a\u00020\u0002\u001a\u0006\u0010\u000e\u001a\u00020\u0002\u001a\u0006\u0010\u000f\u001a\u00020\u0002\u001a\u0006\u0010\u0010\u001a\u00020\u0002\u001a\u0006\u0010\u0011\u001a\u00020\u0002\u001a\u0006\u0010\u0012\u001a\u00020\u0002\u001a\u0006\u0010\u0014\u001a\u00020\u0013¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isCincoMainland", "shouldShowCincoPlay", "", "getHardwareVersion", "shouldShowNfc", "shouldShowBusDoor", "shouldPanGuShowBusDoor", "busDoorAvailable", "shouldShowBankcard", "shouldPanGuShowBankcard", "isMainLandDevice", "isSupportMiUnionpay", "bankCardAvailable", "panGuBankCardAvailable", "shouldShowXiaoai", "xiaoAiAvailable", "Lcom/xiaomi/hm/health/bt/model/CincoEntrance;", "getCincoEntranceConfig", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class CincoEntranceHelperKt {
    public static final boolean bankCardAvailable() {
        if (!shouldShowBankcard()) {
            return false;
        }
        if (HMLoginManager.isUnknown()) {
            return Country.isRussia() || Country.isUkraine() || Country.isBelarus() || Country.isSingapore();
        }
        return HMLoginManager.isInRU() || HMLoginManager.isInUA() || HMLoginManager.isInBY() || HMLoginManager.isInSG();
    }

    public static final boolean busDoorAvailable() {
        if (shouldShowBusDoor()) {
            return HMLoginManager.isUnknown() ? Language.isSimplifiedChinese() : HMLoginManager.isInMainland();
        }
        return false;
    }

    @NotNull
    public static final CincoEntrance getCincoEntranceConfig() {
        return new CincoEntrance(shouldShowXiaoai(), xiaoAiAvailable(), shouldShowNfc(), shouldShowNfc(), shouldShowBankcard(), bankCardAvailable(), shouldShowBusDoor(), busDoorAvailable());
    }

    @Nullable
    public static final String getHardwareVersion() {
        DeviceInfo deviceInfo;
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceType);
        String hardwareVersionStr = null;
        if (device != null && (deviceInfo = device.getDeviceInfo()) != null) {
            hardwareVersionStr = deviceInfo.getHardwareVersionStr();
        }
        return hardwareVersionStr == null ? HMDeviceManager.getInstance().getHardwareVersion(hMDeviceType) : hardwareVersionStr;
    }

    public static final boolean isCincoMainland(@NotNull HMDeviceSource hMDeviceSource) {
        return hMDeviceSource == HMDeviceSource.MILI_CINCO && HardwareInfo.isMiliCincoMainLand(getHardwareVersion());
    }

    public static final boolean isMainLandDevice() {
        return HardwareInfo.isMiliCincoMainLand(getHardwareVersion());
    }

    public static final boolean isSupportMiUnionpay() {
        return HardwareInfo.isMiliCincoMainLand(getHardwareVersion());
    }

    public static final boolean panGuBankCardAvailable() {
        if (!shouldPanGuShowBankcard()) {
            return false;
        }
        if (HMLoginManager.isUnknown()) {
            return Country.isRussia() || Country.isUkraine() || Country.isBelarus() || Country.isSingapore();
        }
        return HMLoginManager.isInRU() || HMLoginManager.isInUA() || HMLoginManager.isInBY() || HMLoginManager.isInSG();
    }

    public static final boolean shouldPanGuShowBankcard() {
        return !HardwareInfo.isMiliPanguMainLand(getHardwareVersion());
    }

    public static final boolean shouldPanGuShowBusDoor() {
        return HardwareInfo.isMiliPanguMainLand(getHardwareVersion());
    }

    public static final boolean shouldShowBankcard() {
        return HardwareInfo.isMiliCincoRussia(getHardwareVersion());
    }

    public static final boolean shouldShowBusDoor() {
        return HardwareInfo.isMiliCincoMainLand(getHardwareVersion());
    }

    public static final boolean shouldShowCincoPlay() {
        if (isCincoMainland(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI))) {
            return Language.isSimplifiedChinese();
        }
        return true;
    }

    public static final boolean shouldShowNfc() {
        return shouldShowBusDoor() || shouldShowBankcard();
    }

    public static final boolean shouldShowXiaoai() {
        String hardwareVersion = getHardwareVersion();
        return HardwareInfo.isMiliCincoMainLand(hardwareVersion) || HardwareInfo.isMiliCincoHkTw(hardwareVersion);
    }

    public static final boolean xiaoAiAvailable() {
        if (!shouldShowXiaoai()) {
            return false;
        }
        if (HMLoginManager.isUnknown()) {
            return Country.isHK() || Country.isChina() || Country.isTW();
        }
        return HMLoginManager.isInHK() || HMLoginManager.isInMainland() || HMLoginManager.isInTW();
    }
}
