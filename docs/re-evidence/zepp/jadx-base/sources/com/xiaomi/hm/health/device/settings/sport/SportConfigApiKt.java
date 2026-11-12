package com.xiaomi.hm.health.device.settings.sport;

import com.huami.arch.core.Fail;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.sport.SportItemDataConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\u0006\u0010\t\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "loadSportTypeFromDevice", "sportTypeConfig", "setSportTypeToDevice", "", "type", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "loadSportDataItemFromDevice", "sportItemDataConfig", "setSportDataConfigToDevice", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class SportConfigApiKt {
    @NotNull
    public static final State<SportItemDataConfig> loadSportDataItemFromDevice(int i) {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        if (!(device instanceof HMMiLiProDevice)) {
            return new Fail(new Exception("Device is not pro device"));
        }
        SportItemDataConfig sportItemDataConfig = ((HMMiLiProDevice) device).getSportItemDataConfig(i);
        return sportItemDataConfig != null ? new Success(sportItemDataConfig) : new Fail(new Exception("null from device"));
    }

    @NotNull
    public static final State<SportTypeConfig> loadSportTypeFromDevice() {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        if (!(device instanceof HMMiLiProDevice)) {
            return new Fail(new Exception("Device is not pro device"));
        }
        SportTypeConfig sportTypeConfig = ((HMMiLiProDevice) device).getSportTypeConfig();
        return sportTypeConfig != null ? new Success(sportTypeConfig) : new Fail(new Exception("null from device"));
    }

    @NotNull
    public static final State<SportItemDataConfig> setSportDataConfigToDevice(@NotNull SportItemDataConfig sportItemDataConfig) {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        if (device instanceof HMMiLiProDevice) {
            return ((HMMiLiProDevice) device).sendSportDataItem(sportItemDataConfig) ? new Success(sportItemDataConfig) : new Fail(new Exception("null from device"));
        }
        return new Fail(new Exception("Device is not pro device"));
    }

    @NotNull
    public static final State<SportTypeConfig> setSportTypeToDevice(@NotNull SportTypeConfig sportTypeConfig) {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        if (device instanceof HMMiLiProDevice) {
            return ((HMMiLiProDevice) device).sendSportTypeSort(sportTypeConfig) ? new Success(sportTypeConfig) : new Fail(new Exception("send sport type sort to device failed"));
        }
        return new Fail(new Exception("Device is not pro device"));
    }
}
