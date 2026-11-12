package com.huami.bluetooth.profile.channel.module.settings;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.bluetooth.profile.ecf.EcfCommand;
import com.huami.bluetooth.profile.ecf.EcfController;
import com.huami.bluetooth.profile.ecf.EcfState;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.NowTimeConfig;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMDisconnectRemindConfig;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMSilentConfig;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.base.BaseResourceInfo;
import com.xiaomi.hm.health.bt.profile.base.ExternalResourceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericCommand;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import com.xiaomi.hm.health.bt.profile.sport.SportRemindConfig;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes6.dex */
public class EcfImpl implements SettingsApi {
    public static final int SWIM_RESULT_FAILED = -1;
    private static final String b = "EcfImpl";
    private static final int c = 0;
    private static final int d = 1;
    private static final byte e = 0;
    private static final byte f = 1;
    private EcfCmdProvider a;

    public EcfImpl(EcfCmdProvider ecfCmdProvider) {
        this.a = ecfCmdProvider;
    }

    private BaseResourceInfo a() {
        byte b2;
        int i = 0;
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{35});
        if (hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 35)) {
            byte[] data = hMNotifyResponseSendECFCommand.getData();
            Debug.fi(b, "base resource data:" + GattUtils.bytesToHexString(data));
            if (data != null && data.length >= 2) {
                int i2 = data[0] & 255;
                int i3 = data[1] & 255;
                if ((i3 & 1) == 1) {
                    i = ((data[5] & 255) << 24) | (data[2] & 255) | ((data[3] & 255) << 8) | ((data[4] & 255) << 16);
                    b2 = data[6];
                } else {
                    b2 = 0;
                }
                return new BaseResourceInfo(i2, i3, i, b2);
            }
        }
        return null;
    }

    private ExternalResourceInfo b() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{65});
        if (hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 65)) {
            try {
                byte[] data = hMNotifyResponseSendECFCommand.getData();
                Debug.fi(b, "external resource data:" + GattUtils.bytesToHexString(data));
                int length = data.length - 1;
                byte[] bArr = new byte[length];
                System.arraycopy(data, 0, bArr, 0, length);
                String[] strArrSplit = new String(bArr).split(",");
                int i = -1;
                int i2 = (strArrSplit.length <= 0 || TextUtils.isEmpty(strArrSplit[0])) ? -1 : Integer.parseInt(strArrSplit[0]);
                if (strArrSplit.length > 1 && !TextUtils.isEmpty(strArrSplit[1])) {
                    i = Integer.parseInt(strArrSplit[1]);
                }
                return new ExternalResourceInfo(i2, i);
            } catch (Exception e2) {
                Debug.fi(b, "external resource error:" + e2.getMessage());
            }
        }
        return null;
    }

    private HMOtherVersion c() {
        int i;
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{12});
        HMOtherVersion hMOtherVersion = null;
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 12)) {
            Debug.fi(b, "getOtherVersion failed!!!");
            return null;
        }
        byte[] data = hMNotifyResponseSendECFCommand.getData();
        Debug.fi(b, "getOtherVersion:" + GattUtils.bytesToHexString(data));
        if (data != null && data.length >= 1) {
            hMOtherVersion = new HMOtherVersion();
            byte b2 = data[0];
            if ((b2 & 1) == 1) {
                i = 2;
                hMOtherVersion.setResourceVersion(data[1] & 255);
            } else {
                i = 1;
            }
            if (((b2 >> 1) & 1) == 1) {
                int i2 = i + 1;
                int i3 = data[i] & 255;
                int i4 = data.length > i2 ? data[i2] & 255 : -1;
                hMOtherVersion.setFontVersion(i3);
                hMOtherVersion.setFontFlag(i4);
            }
        }
        return hMOtherVersion;
    }

    private HMOtherVersion d() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{17});
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 17)) {
            Debug.fi(b, "getResInfo failed!!!");
        } else {
            byte[] data = hMNotifyResponseSendECFCommand.getData();
            Debug.fi(b, "getResInfo:" + GattUtils.bytesToHexString(data));
            if (data == null || data.length < 1) {
                return null;
            }
            try {
                return e(data);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private HMOtherVersion e(byte[] reversion) {
        int i;
        int i2;
        int i3;
        HMOtherVersion hMOtherVersion = new HMOtherVersion();
        int i4 = reversion[0] & 255;
        hMOtherVersion.setVersion(i4);
        byte b2 = reversion[1];
        int i5 = reversion[2] & 255;
        Debug.fi(b, "parseResInfo language: " + i5);
        hMOtherVersion.setLanguage(new HMLanguage(i5));
        if ((b2 & 1) == 1) {
            hMOtherVersion.setResourceFlag((reversion[3] & 255) | ((reversion[4] & 255) << 8) | ((reversion[5] & 255) << 16) | ((reversion[6] & 255) << 24));
            hMOtherVersion.setResourceVersion(reversion[7] & 255);
            i = 8;
        } else {
            i = 3;
        }
        if (((b2 >> 1) & 1) == 1) {
            int i6 = i + 1;
            int i7 = i6 + 1;
            int i8 = (reversion[i] & 255) | ((reversion[i6] & 255) << 8);
            int i9 = i7 + 1;
            int i10 = i8 | ((reversion[i7] & 255) << 16);
            int i11 = i9 + 1;
            int i12 = i10 | ((reversion[i9] & 255) << 24);
            hMOtherVersion.setFontFlag(i12);
            if (i4 == 1) {
                if ((i12 & 1) != 0) {
                    i3 = i11 + 1;
                    hMOtherVersion.setFontVersion(reversion[i11] & 255);
                } else {
                    i3 = i11;
                }
                if ((2 & i12) != 0) {
                    i = i3 + 1;
                    hMOtherVersion.setFontVersion(reversion[i3] & 255);
                } else {
                    i = i3;
                }
            } else if (i4 >= 2) {
                i = i11 + 1;
                hMOtherVersion.setFontVersion(reversion[i11] & 255);
            } else {
                i = i11;
            }
        }
        if (((b2 >> 2) & 1) == 1 && (i2 = i + 1) <= reversion.length) {
            hMOtherVersion.setEmojiVersion(reversion[i]);
            i = i2;
        }
        if (((b2 >> 3) & 1) == 1 && i + 4 <= reversion.length) {
            int i13 = i + 1;
            int i14 = i13 + 1;
            hMOtherVersion.setFwFlag(((reversion[i14 + 1] & 255) << 24) | ((reversion[i13] & 255) << 8) | (reversion[i] & 255) | ((reversion[i14] & 255) << 16));
        }
        Debug.i(b, "getResInfo:" + hMOtherVersion);
        return hMOtherVersion;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean disableHid(boolean disable) {
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableAtrialAlertSleepNotDisturb(boolean enable) {
        Debug.fi(b, "非HuamiOS版本不支持enableAtrialAlertSleepNotDisturb");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableAtrialFib(boolean enable) {
        Debug.fi(b, "ECF版本的AtrialFib开关设置在ECFController中，代码不好迁过来，故出此下策。");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableHrBroadcast(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 31, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableHrSleep(boolean enable) {
        Debug.fi(b, "ECF版本的HrSleep开关设置在ECFController中，代码不好迁过来，故出此下策。");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableOsa(boolean enable) {
        Debug.fi(b, "ECF版本的OSA开关设置在ECFController中，代码不好迁过来，故出此下策。");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enablePressure(boolean enable) {
        Debug.fi(b, "ECF版本的Pressure开关设置在ECFController中，代码不好迁过来，故出此下策。");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enablePressureAlert(boolean enable) {
        Debug.fi(b, "非HuamiOS版本不支持enablePressureAlert");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableSportHeartRate(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, HMDisplaySetting.TYPE_HAWK_SWK, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean enableSwimLog(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 42, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getAtrialAlertSleepNotDisturbEnable() {
        Debug.fi(b, "非HuamiOS版本不支持getAtrialAlertSleepNotDisturbEnable");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getAtrialFibEnable() {
        Debug.fi(b, "非huamiOS版本的getAtrialFibEnable开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getAutoOtaAtNightSwitch() {
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public HMOtherVersion getDeviceInfoSync(@NotNull HMDeviceSource source) {
        HMOtherVersion hMOtherVersionC = c();
        if (hMOtherVersionC == null) {
            hMOtherVersionC = d();
        }
        if (HMDeviceFeature.hasFeatureBaseResource(source) && hMOtherVersionC != null) {
            hMOtherVersionC.setBaseResourceInfo(a());
            hMOtherVersionC.setExternalResourceInfo(b());
        }
        return hMOtherVersionC;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Integer getHeartRateInterval() {
        Debug.fi(b, "非huamiOS版本的getHeartRateInterval开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public HidStatus getHidStatus() {
        Debug.fi(b, "非HuamiOS版本不支持getHidStatus");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public HMHrReminder getHighHrReminder() {
        Debug.fi(b, "非HuamiOS版本不支持getHighHrReminder");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getHrSleepEnable() {
        Debug.fi(b, "非huamiOS版本的getHrSleepEnable开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public Boolean getLockStatus() {
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public HMHrReminder getLowHrReminder() {
        Debug.fi(b, "非HuamiOS版本不支持getLowHrReminder");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Integer getLowSpo2Alert() {
        Debug.fi(b, "非HuamiOS版本不支持getLowSpo2Alert");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getOffWristLockState() {
        HMNotifyResponse offWristLockState;
        EcfController ecfController = this.a.getEcfController();
        if (ecfController == null || (offWristLockState = ecfController.getOffWristLockState()) == null) {
            throw new IllegalStateException();
        }
        if (offWristLockState.getCode() == EcfState.UNKNOW_COMMAND.getValue()) {
            return null;
        }
        byte[] data = offWristLockState.getData();
        if (offWristLockState.getCode() == EcfState.SUCCESS.getValue() && data != null) {
            if (data.length == 1 && (data[0] == 1 || data[0] == 0)) {
                return Boolean.valueOf(data[0] == 1);
            }
        }
        throw new IllegalStateException();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getOsaEnable() {
        Debug.fi(b, "非huamiOS版本的getOsaEnable开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getPressureAlertEnable() {
        Debug.fi(b, "非HuamiOS版本不支持getPressureAlertEnable");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getPressureEnable() {
        Debug.fi(b, "非huamiOS版本的getPressureEnable开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getSleepingBloodPressureMonitor() {
        Debug.fi(b, "非HuamiOS版本不支持getSleepingBloodPressureMonitor");
        return Boolean.FALSE;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getSmartSpo2() {
        Debug.fi(b, "非HuamiOS版本不支持getSmartSpo2");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean getSportHeartRate() {
        Debug.fi(b, "非huamiOS版本的getSportHeartRate开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @org.jetbrains.annotations.Nullable
    public StandAlertConfig getStandAlertConfig() {
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public int getSwimLogSwitch() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{36});
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 36) || (data = hMNotifyResponseSendECFCommand.getData()) == null || data.length == 0) {
            return -1;
        }
        return data[0] & 255;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public HMTarget getTargets() {
        HMGenericResponse hMGenericResponseSendGenericCommand = this.a.sendGenericCommand(new HMGenericCommand(19));
        if (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess()) {
            return null;
        }
        return HMTarget.fromByteArray(hMGenericResponseSendGenericCommand.commandResponseData());
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean isContactShow(@NotNull HMAlertMode mode) {
        Debug.fi(b, "非HuamiOS版本不支持isContactShow");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean isHidConnect() {
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    @Nullable
    public Boolean isHidDisable() {
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setActivityMode(int mode) {
        Debug.fi(b, "非HuamiOS版本不支持setActivityMode");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setActivityTarget(boolean remind, long activity) {
        Debug.fi(b, "非HuamiOS版本不支持setActivityMode");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setAlldayHeartRate(boolean enable, int interval) {
        Debug.fi(b, "非huamiOS版本的setAlldayHeartRate开关设置在ECFController或HRS中，代码不好迁过来，故出此下策。");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public void setAutoOtaAtNightSwitch(boolean open) {
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setCalorieTarget(boolean remind, long calorie) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(58);
            byteArrayOutputStream.write(GattUtils.numberToBytes(2L, 4));
            byteArrayOutputStream.write(remind ? 1 : 0);
            byteArrayOutputStream.write(GattUtils.numberToBytes(calorie, 4));
        } catch (Exception e2) {
            Debug.fi(b, "setCalorieTarget e: " + e2);
        }
        Debug.fi(b, "setCalorieTarget cmd: " + GattUtils.bytesToHexString(byteArrayOutputStream.toByteArray()));
        boolean zPatchWriteEcf = this.a.patchWriteEcf(byteArrayOutputStream.toByteArray(), 2);
        Debug.fi(b, "setCalorieTarget, ret: " + zPatchWriteEcf);
        return zPatchWriteEcf;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setConnectedAdvSwitch(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 1, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setDateDisplayStyle(@Nullable String format) {
        if (TextUtils.isEmpty(format)) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(30);
        byteArrayOutputStream.write(0);
        try {
            Objects.requireNonNull(format);
            byteArrayOutputStream.write(format.getBytes());
        } catch (Exception e2) {
            Debug.fi(b, "ByteArrayOutputStream write exception:" + e2.getMessage());
        }
        byteArrayOutputStream.write(0);
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(byteArrayOutputStream.toByteArray(), 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setDisconnectRemind(@Nullable HMDisconnectRemindConfig config) {
        HMNotifyResponse hMNotifyResponseSendECFCommand;
        return (config == null || (hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 12, 0, config.isEnable(), config.getStartHour(), config.getStartMinute(), config.getStopHour(), config.getStopMinute()}, 3)) == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 6)) ? false : true;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setDistanceTarget(boolean remind, long distance) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(58);
            byteArrayOutputStream.write(GattUtils.numberToBytes(4L, 4));
            byteArrayOutputStream.write(remind ? 1 : 0);
            byteArrayOutputStream.write(GattUtils.numberToBytes(distance, 4));
        } catch (Exception e2) {
            Debug.fi(b, "setDistanceTarget e: " + e2);
        }
        Debug.fi(b, "setDistanceTarget cmd: " + GattUtils.bytesToHexString(byteArrayOutputStream.toByteArray()));
        boolean zPatchWriteEcf = this.a.patchWriteEcf(byteArrayOutputStream.toByteArray(), 2);
        Debug.fi(b, "setDistanceTarget, ret: " + zPatchWriteEcf);
        return zPatchWriteEcf;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setHeartRateZoneSync(byte type, @NotNull byte[] percents, @NotNull byte[] zones, byte restHR) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(17);
        byteBufferAllocate.put(new byte[]{-2, a.m, 0}).put(type).put(percents).put(zones).put(restHR);
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(byteBufferAllocate.array(), 3);
        boolean z = hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2);
        Debug.fi(b, "Set HeartRate Zone, Type: " + ((int) type) + ", Percent: " + Arrays.toString(percents) + ", Zone: " + Arrays.toString(zones) + ", RestHR: " + ((int) restHR) + ", Success: " + z);
        return z;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setHidConnect(boolean connect) {
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setHidStatus(@NotNull HidStatus hidStatus) {
        return this.a.sendECFCommand(new EcfCommand.SyncHidStatus(), hidStatus.getBytes());
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setHighHrReminder(@NotNull HMHrReminder hMHrReminder) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 26, 0, hMHrReminder.isEnable() ? (byte) 1 : (byte) 0, (byte) hMHrReminder.getHr()}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setHourlyAnnounceSwitch(@NotNull NowTimeConfig nowTimeConfig) {
        Boolean nowTimeConfig2;
        EcfController ecfController = this.a.getEcfController();
        if (ecfController == null || (nowTimeConfig2 = ecfController.setNowTimeConfig(nowTimeConfig)) == null) {
            return false;
        }
        return nowTimeConfig2.booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setLowHrReminder(@NotNull HMHrReminder hrReminder) {
        Debug.fi(b, "非HuamiOS版本不支持setLowHrReminder");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setLowSpo2Alert(int value) {
        Debug.fi(b, "非HuamiOS版本不支持setLowSpo2Alert");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setMileageUnit(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 3, 0, !z ? 1 : 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setMultiLinkSwitch(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 15, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setNightMode(@NonNull HMAutoBacklightInfo info) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(info.getMode() == 1 ? new byte[]{26, (byte) info.getMode(), (byte) info.getStartHour(), (byte) info.getStartMinute(), (byte) info.getStopHour(), (byte) info.getStopMinute()} : new byte[]{26, (byte) info.getMode()});
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 26);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setOtherCalendar(byte calendar) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 40, 0, calendar}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setRestrictedBindingSwitch(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 32, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setSilent(@Nullable HMSilentConfig config) {
        byte[] bArr;
        if (config == null) {
            return false;
        }
        Debug.i(b, "setSilent:" + config);
        int i = config.isEnableWristLift() ? 0 : 128;
        if (config.isEnable()) {
            bArr = config.isSmart() ? new byte[]{9, (byte) (i | 3)} : new byte[]{9, (byte) (i | 1), config.getStartHour(), config.getStartMinute(), config.getStopHour(), config.getStopMinute()};
        } else {
            bArr = new byte[]{9, (byte) (i | 2)};
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(bArr);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 9);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setSleepTarget(boolean remind, long sleep) {
        Debug.fi(b, "非ZeppOS版本不支持setSleepTarget");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setSleepingBloodPressureMonitor(boolean enable) {
        Debug.fi(b, "非HuamiOS版本不支持setSleepingBloodPressureMonitor");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setSmartSpo2(boolean enable) {
        Debug.fi(b, "非HuamiOS版本不支持setSmartSpo2");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setSportRemindConfig(@Nullable SportRemindConfig config) {
        if (config == null) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(39);
        byteArrayOutputStream.write(0);
        byte[] bytes = config.getBytes();
        if (bytes != null && bytes.length > 0) {
            byteArrayOutputStream.write(bytes, 0, bytes.length);
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(byteArrayOutputStream.toByteArray(), 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setStandAlertConfig(@NotNull StandAlertConfig config) {
        return this.a.sendECFCommand(EcfCommand.StandAlert.INSTANCE, config.getBytes());
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setStandTarget(boolean remind, long stand) {
        Debug.fi(b, "非HuamiOS版本不支持setActivityMode");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setStepTarget(boolean remind, long step, @Nullable Integer settingsVersion) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(58);
            byteArrayOutputStream.write(GattUtils.numberToBytes(1L, 4));
            byteArrayOutputStream.write(remind ? 1 : 0);
            byteArrayOutputStream.write(GattUtils.numberToBytes(step, 4));
        } catch (Exception e2) {
            Debug.fi(b, "setStepGoal e: " + e2);
        }
        Debug.fi(b, "setStepGoal cmd: " + GattUtils.bytesToHexString(byteArrayOutputStream.toByteArray()));
        boolean zPatchWriteEcf = this.a.patchWriteEcf(byteArrayOutputStream.toByteArray(), 2);
        Debug.fi(b, "setStepTarget, ret: " + zPatchWriteEcf);
        return zPatchWriteEcf;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setTargets(@NotNull HMTarget target, @Nullable Integer settingsVersion) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(58);
            int i = 1;
            byte b2 = (target.getStepRemind() == null || target.getStepTarget() == null) ? (byte) 0 : (byte) 1;
            if (target.getCalorieRemind() != null && target.getCalorieTarget() != null) {
                b2 = (byte) (b2 | 2);
            }
            if (target.getDistanceRemind() != null && target.getDistanceTarget() != null) {
                b2 = (byte) (b2 | 4);
            }
            byteArrayOutputStream.write(GattUtils.numberToBytes(b2, 4));
            if (target.getStepRemind() != null && target.getStepTarget() != null) {
                byteArrayOutputStream.write(target.getStepRemind().booleanValue() ? 1 : 0);
                byteArrayOutputStream.write(GattUtils.numberToBytes(target.getStepTarget().longValue(), 4));
            }
            if (target.getCalorieRemind() != null && target.getCalorieTarget() != null) {
                byteArrayOutputStream.write(target.getCalorieRemind().booleanValue() ? 1 : 0);
                byteArrayOutputStream.write(GattUtils.numberToBytes(target.getCalorieTarget().longValue(), 4));
            }
            if (target.getDistanceRemind() != null && target.getDistanceTarget() != null) {
                if (!target.getDistanceRemind().booleanValue()) {
                    i = 0;
                }
                byteArrayOutputStream.write(i);
                byteArrayOutputStream.write(GattUtils.numberToBytes(target.getDistanceTarget().longValue(), 4));
            }
        } catch (Exception e2) {
            Debug.fi(b, "setTargets e: " + e2);
        }
        Debug.fi(b, "setTargets cmd: " + GattUtils.bytesToHexString(byteArrayOutputStream.toByteArray()));
        boolean zPatchWriteEcf = this.a.patchWriteEcf(byteArrayOutputStream.toByteArray(), 2);
        Debug.fi(b, "setTargets, ret: " + zPatchWriteEcf);
        return zPatchWriteEcf;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setTimeFormat(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 2, 0, !z ? 1 : 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setWeeklyStartTime(byte dayOfWeek) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 41, 0, dayOfWeek}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean setWeightTarget(boolean remind, long weight) {
        Debug.fi(b, "非ZeppOS版本不支持setWeightTarget");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean showContactSync(@NotNull HMAlertMode hMAlertMode, boolean z) {
        byte[] bArr = new byte[5];
        bArr[0] = 6;
        bArr[1] = 16;
        bArr[2] = 0;
        if (hMAlertMode == HMAlertMode.ALERT_INCALL) {
            bArr[3] = 0;
        } else if (hMAlertMode == HMAlertMode.ALERT_SMS) {
            bArr[3] = 1;
        }
        bArr[4] = z ? (byte) 1 : (byte) 0;
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(bArr, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsApi
    public boolean stopDevice() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.a.sendECFCommand(new byte[]{6, 27, 0, 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }
}
