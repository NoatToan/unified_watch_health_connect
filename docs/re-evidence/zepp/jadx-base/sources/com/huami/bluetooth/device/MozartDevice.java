package com.huami.bluetooth.device;

import com.huami.bluetooth.device.function.IGdsp;
import com.huami.bluetooth.device.function.log.SwitchRoleCallback;
import com.huami.bluetooth.device.function.sensor.SensorSyncEnable;
import com.huami.bluetooth.device.function.upgrade.FirmwareUpgrade;
import com.huami.bluetooth.profile.data.SyncDataCallback;
import com.huami.bluetooth.profile.ecf.data.AppState;
import com.huami.bluetooth.profile.ecf.data.Equalizer;
import com.huami.bluetooth.profile.gdsp.HearingHealthDayData;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0011H&J0\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H&J\b\u0010\u0019\u001a\u00020\u000fH&J$\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\fH&J\b\u0010\u001f\u001a\u00020\bH&J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H&J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H&J\u0012\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020\bH&J\u001e\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0)H&J\b\u0010,\u001a\u00020\u000fH&J\b\u0010-\u001a\u00020\bH&¨\u0006."}, d2 = {"Lcom/huami/bluetooth/device/MozartDevice;", "Lcom/huami/bluetooth/device/HeadsetDevice;", "Lcom/huami/bluetooth/device/function/sensor/SensorSyncEnable;", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgrade;", "Lcom/huami/bluetooth/device/RealtimeHeartRateDevice;", "Lcom/huami/bluetooth/device/function/IGdsp;", "Lcom/huami/bluetooth/profile/ecf/data/AppState;", "state", "", "syncAppState", "isUpgrading", Configs.Params.RESET, "Lcom/huami/bluetooth/profile/data/SyncDataCallback;", "", "callback", "", "getStatisticInfo", "Lcom/huami/bluetooth/device/function/log/SwitchRoleCallback;", "doSwitchRole", "isOutputSingleFile", "Ljava/io/File;", "file", "anotherFile", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "syncHeadsetLog", "terminateHeadsetLog", "Ljava/util/Calendar;", "calendar", "", "Lcom/huami/bluetooth/profile/gdsp/HearingHealthDayData;", "getHeadsetHealthInfo", "isOtaEnable", "Lcom/huami/bluetooth/device/OtaUpgradeState;", "callBack", "registerOtaStateCallback", "unRegisterOtaStateCallback", "force", "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "getEqualizer", "", "lockTime", "Lkotlin/Function0;", "runnable", "lockGpsSync", "unLockGpsSync", "isLockGpsSync", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface MozartDevice extends HeadsetDevice, SensorSyncEnable, FirmwareUpgrade, RealtimeHeartRateDevice, IGdsp {
    void doSwitchRole(@NotNull SwitchRoleCallback callback);

    @Nullable
    Equalizer getEqualizer(boolean force);

    void getHeadsetHealthInfo(@NotNull Calendar calendar, @NotNull SyncDataCallback<? super List<HearingHealthDayData>> callback);

    void getStatisticInfo(@NotNull SyncDataCallback<Object> callback);

    boolean isLockGpsSync();

    boolean isOtaEnable();

    boolean isUpgrading();

    void lockGpsSync(long lockTime, @NotNull Function0<Unit> runnable);

    void registerOtaStateCallback(@NotNull OtaUpgradeState callBack);

    boolean reset();

    boolean syncAppState(@NotNull AppState state);

    void syncHeadsetLog(boolean isOutputSingleFile, @NotNull File file, @Nullable File anotherFile, @NotNull IHMDataCallback<File> callback);

    void terminateHeadsetLog();

    void unLockGpsSync();

    void unRegisterOtaStateCallback(@NotNull OtaUpgradeState callBack);
}
