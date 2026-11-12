package com.xiaomi.hm.health.bt.profile.earbud;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.GeneralDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.bt.profile.dfu.HmVoiceType;
import com.xiaomi.hm.health.bt.profile.earbud.model.CurrentMusicState;
import com.xiaomi.hm.health.bt.profile.earbud.model.EarbudRebootInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicControlCmd;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicPlayInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.RestModeInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.TomatoModeInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericCommand;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericProfile;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class EarbudProfile extends BaseProfile implements IEarbudProfile {
    private static final byte A0 = 14;
    private static final byte B0 = -16;
    private static final byte C0 = -15;
    private static final byte D0 = 32;
    private static final byte E0 = 16;
    private static final byte F0 = 17;
    private static final byte G0 = -14;
    private static final byte H0 = -13;
    private static final byte I0 = 7;
    private static final byte J0 = -12;
    private static final byte K0 = 18;
    private static final byte L0 = -11;
    private static final byte M0 = 15;
    private static final byte N0 = 17;
    private static final byte O0 = 19;
    private static final byte P0 = 18;
    private static final byte Q0 = 16;
    private static final byte R0 = 1;
    private static final byte S0 = 19;
    private static final short T0 = 11;
    private static final byte U0 = 20;
    private static final byte Y = 6;
    private static final byte Z = 2;
    private static final byte m0 = 50;
    private static final byte n0 = 49;
    private static final byte o0 = 43;
    private static final byte p0 = 44;
    private static final byte q0 = 46;
    private static final byte r0 = 47;
    private static final byte s0 = 19;
    private static final byte t0 = 48;
    private static final byte u0 = -2;
    private static final byte v0 = 4;
    private static final short w0 = 54;
    private static final short x0 = 55;
    private static final short y0 = 56;
    private static final byte z0 = 15;
    private BluetoothGattCharacteristic W;
    private byte[] X;

    public EarbudProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback callback) {
        super(context, device, callback);
        this.W = null;
        this.X = null;
    }

    private boolean q0(HMNotifyResponse response, byte cmd) {
        return response != null && response.getCmd() == cmd && response.getCode() == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(byte[] bArr) {
        this.X = bArr;
        watingNotify(this.W);
    }

    private HMNotifyResponse s0(byte[] cmd) {
        return sendEcfCommand(cmd, 1);
    }

    private synchronized HMNotifyResponse t0(byte[] cmd, int cmdLen, int timeout) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.W;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        if (!registerNotification(bluetoothGattCharacteristic, new IGattCallback.INotifyCallback() { // from class: kf1
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.r0(bArr);
            }
        })) {
            return null;
        }
        this.X = null;
        if (!write(this.W, cmd)) {
            return null;
        }
        if (this.X == null) {
            waiting(this.W, timeout);
        }
        unregisterNotification(this.W);
        return HMNotifyResponse.parse(this.X, cmdLen);
    }

    public boolean deleteMusic(int musicId) {
        byte[] bArr = new byte[5];
        bArr[0] = 47;
        System.arraycopy(GattUtils.intToBytes(musicId), 0, bArr, 1, 4);
        HMNotifyResponse hMNotifyResponseS0 = s0(bArr);
        return hMNotifyResponseS0 != null && hMNotifyResponseS0.isSuccess((byte) 47);
    }

    public ArrayList<AlarmClockExt> getAlarms() {
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(new HMGenericCommand(1));
        if (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess()) {
            return null;
        }
        return AlarmClockExt.fromBytes(hMGenericResponseSendGenericCommand.commandResponseData());
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    public BatteryInfo getBatteryInfo() {
        Debug.trace();
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.m_CharBattery;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        return parseBatteryInfo(read(bluetoothGattCharacteristic));
    }

    public CurrentMusicState getCurrentMusicState(@NonNull HmVoiceType voiceType) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, 1, -15, voiceType.getType()}, 3);
        if (q0(hMNotifyResponseSendEcfCommand, (byte) 48)) {
            return CurrentMusicState.INSTANCE.from(hMNotifyResponseSendEcfCommand.getData());
        }
        return null;
    }

    public byte[] getDeviceClickSetting() {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{-2, 32, 1}, 3);
        if (hMNotifyResponseSendEcfCommand == null || !hMNotifyResponseSendEcfCommand.isSuccess((byte) -2) || hMNotifyResponseSendEcfCommand.getData() == null || hMNotifyResponseSendEcfCommand.getData().length != 4) {
            return null;
        }
        return hMNotifyResponseSendEcfCommand.getData();
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public DeviceInfo getDeviceInfo() {
        GeneralDeviceInfo generalDeviceInfo = getGeneralDeviceInfo();
        if (generalDeviceInfo == null) {
            return null;
        }
        HMDeviceSource hMDeviceSource = HMDeviceSource.EARBUD_CHOPIN;
        PnP pnP = generalDeviceInfo.pnp;
        if (hMDeviceSource == HMDeviceSource.fromPnP(pnP.productId, pnP.productVersion)) {
            Feature feature = new Feature();
            feature.add(0, 8);
            generalDeviceInfo.setDeviceFeature(feature);
        }
        return new DeviceInfo(generalDeviceInfo);
    }

    public EarbudRebootInfo getDeviceRebootTimes() {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{4, 18}, 2);
        if (q0(hMNotifyResponseSendEcfCommand, (byte) 4) && hMNotifyResponseSendEcfCommand.getData() != null && hMNotifyResponseSendEcfCommand.getData().length == 12) {
            return EarbudRebootInfo.INSTANCE.from(hMNotifyResponseSendEcfCommand.getData());
        }
        return null;
    }

    public int getDeviceRssi() {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{4, 15}, 2);
        if (hMNotifyResponseSendEcfCommand == null || !hMNotifyResponseSendEcfCommand.isSuccess((byte) 4) || hMNotifyResponseSendEcfCommand.getData() == null) {
            return 0;
        }
        Debug.fi(ConstantKt.KEY_RSSI, GattUtils.bytesToHexString(hMNotifyResponseSendEcfCommand.getData()) + "--rssi:" + ((int) hMNotifyResponseSendEcfCommand.getData()[0]));
        return hMNotifyResponseSendEcfCommand.getData()[0];
    }

    public String getDisconnectReason() {
        HMNotifyResponse hMNotifyResponseS0 = s0(new byte[]{4, 16});
        if (hMNotifyResponseS0 == null || !hMNotifyResponseS0.isSuccess((byte) 4) || hMNotifyResponseS0.getData() == null) {
            return null;
        }
        return GattUtils.bytesToHexString(hMNotifyResponseS0.getData());
    }

    public int getEarbudRssi() {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{4, 17}, 2);
        if (hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.getCode() == 14) {
            Debug.fi(BaseProfile.TAG, "left and right disconnect");
            return 0;
        }
        if (hMNotifyResponseSendEcfCommand == null || !hMNotifyResponseSendEcfCommand.isSuccess((byte) 4) || hMNotifyResponseSendEcfCommand.getData() == null) {
            return 0;
        }
        Debug.fi(ConstantKt.KEY_RSSI, GattUtils.bytesToHexString(hMNotifyResponseSendEcfCommand.getData()) + "--rssi:" + ((int) hMNotifyResponseSendEcfCommand.getData()[0]));
        return hMNotifyResponseSendEcfCommand.getData()[0];
    }

    public Integer getEarbudsLeftSize() {
        HMNotifyResponse hMNotifyResponseS0 = s0(new byte[]{44, isEarbudsConnect() ? (byte) 1 : (byte) 0});
        if (q0(hMNotifyResponseS0, (byte) 44) && hMNotifyResponseS0.getData() != null && hMNotifyResponseS0.getData().length == 4) {
            return Integer.valueOf(GattUtils.bytesToInt(hMNotifyResponseS0.getData(), 0, 2) + GattUtils.bytesToInt(hMNotifyResponseS0.getData(), 2, 2));
        }
        return null;
    }

    public boolean getIsNoPhoneMode() {
        HMNotifyResponse hMNotifyResponseS0 = s0(new byte[]{50});
        return hMNotifyResponseS0 != null && hMNotifyResponseS0.isSuccess((byte) 50) && hMNotifyResponseS0.getData() != null && hMNotifyResponseS0.getData().length == 1 && hMNotifyResponseS0.getData()[0] == 1;
    }

    public boolean getIsSleepNotDisturb() {
        HMNotifyResponse hMNotifyResponseS0 = s0(new byte[]{49});
        return q0(hMNotifyResponseS0, (byte) 49) && hMNotifyResponseS0.getData() != null && hMNotifyResponseS0.getData().length == 1 && (hMNotifyResponseS0.getData()[0] & 255) == 1;
    }

    @Nullable
    public List<MusicInfo> getMusicList(@NonNull HmVoiceType voiceType) {
        HMGenericCommand hMGenericCommand = new HMGenericCommand(13);
        hMGenericCommand.setCommandExtend(new byte[]{voiceType.getType()});
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(hMGenericCommand);
        if (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess()) {
            return null;
        }
        return MusicInfo.INSTANCE.parseMusic(hMGenericResponseSendGenericCommand.commandResponseData());
    }

    @Nullable
    public MusicPlayInfo getMusicPlayInf() {
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(new HMGenericCommand(21));
        if (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess()) {
            return null;
        }
        return MusicPlayInfo.INSTANCE.from(hMGenericResponseSendGenericCommand.commandResponseData());
    }

    public int getMusicPlayTime() {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, 1, -12}, 3);
        if (q0(hMNotifyResponseSendEcfCommand, (byte) 48) && hMNotifyResponseSendEcfCommand.getData() != null && hMNotifyResponseSendEcfCommand.getData().length == 1) {
            return hMNotifyResponseSendEcfCommand.getData()[0] & 255;
        }
        return 0;
    }

    public RestModeInfo getRestInfo() {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, 1, -14}, 3);
        if (q0(hMNotifyResponseSendEcfCommand, (byte) 48)) {
            return RestModeInfo.INSTANCE.from(hMNotifyResponseSendEcfCommand.getData());
        }
        return null;
    }

    public boolean getSmartPlay() {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, 1, L0}, 3);
        return q0(hMNotifyResponseSendEcfCommand, (byte) 48) && hMNotifyResponseSendEcfCommand.getData() != null && hMNotifyResponseSendEcfCommand.getData().length == 1 && (hMNotifyResponseSendEcfCommand.getData()[0] & 255) == 1;
    }

    public TomatoModeInfo getTomatoInfo() {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, 1, -13}, 3);
        if (q0(hMNotifyResponseSendEcfCommand, (byte) 48)) {
            return TomatoModeInfo.INSTANCE.from(hMNotifyResponseSendEcfCommand.getData());
        }
        return null;
    }

    public short getVolume() {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, 1, -16}, 3);
        if (q0(hMNotifyResponseSendEcfCommand, (byte) 48) && hMNotifyResponseSendEcfCommand.getData() != null && hMNotifyResponseSendEcfCommand.getData().length == 1) {
            return (short) (hMNotifyResponseSendEcfCommand.getData()[0] & 255);
        }
        return (short) 0;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean initCharacteristics() {
        super.initCharacteristics();
        UUID uuid = IBaseProfile.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(BaseProfile.TAG, uuid + " is null!");
            return false;
        }
        UUID uuid2 = IEarbudProfile.UUID_CHARACTERISTIC_BATTERY;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.m_CharBattery = characteristic;
        if (characteristic == null) {
            Debug.fi(BaseProfile.TAG, uuid2 + " is null!");
            return false;
        }
        UUID uuid3 = IEarbudProfile.UUID_CHARACTERISTIC_CONTROL_POINT;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(uuid3);
        this.W = characteristic2;
        if (characteristic2 != null) {
            return true;
        }
        Debug.fi(BaseProfile.TAG, uuid3 + " is null!");
        return false;
    }

    public boolean isEarbudsConnect() {
        HMNotifyResponse hMNotifyResponseS0 = s0(new byte[]{43});
        return hMNotifyResponseS0 != null && hMNotifyResponseS0.isSuccess((byte) 43);
    }

    public boolean leftLinkToRight() {
        Debug.fi(BaseProfile.TAG, "earbud link left to right");
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{6, 54, 0, 1}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 6);
    }

    public boolean musicControl(MusicControlCmd musicControlCmd, boolean z) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, z ? (byte) 1 : (byte) 0, musicControlCmd.getCmd()}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 48);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public BatteryInfo parseBatteryInfo(byte[] value) {
        Debug.i(BaseProfile.TAG, "parseBatteryInfo:" + GattUtils.bytesToHexString(value));
        return BatteryInfo.parseBatteryInfo(value);
    }

    public boolean reset() {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{6, 11, 0, 1}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 6);
    }

    public boolean selfTest() {
        HMNotifyResponse hMNotifyResponseS0 = s0(new byte[]{4, 1});
        return hMNotifyResponseS0 != null && hMNotifyResponseS0.isSuccess((byte) 4);
    }

    public HMNotifyResponse sendEcfCommand(byte[] cmd, int cmdLen) {
        return t0(cmd, cmdLen, 5000);
    }

    public synchronized HMGenericResponse sendGenericCommand(HMGenericCommand command) {
        return HMGenericProfile.write(this, this.W, command);
    }

    public boolean setAlarm(AlarmClockExt alarmClock) {
        byte[] bytes = alarmClock.getBytes();
        byte[] bArr = {2, bytes[0], bytes[1], bytes[2], bytes[3]};
        Debug.fi(BaseProfile.TAG, "cmd:" + GattUtils.bytesToHexString(bArr));
        HMNotifyResponse hMNotifyResponseS0 = s0(bArr);
        return hMNotifyResponseS0 != null && hMNotifyResponseS0.isSuccess((byte) 2);
    }

    public boolean setDeviceClickSetting(byte[] settings) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand;
        return settings != null && settings.length == 4 && (hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{-2, 32, 0, settings[0], settings[1], settings[2], settings[3]}, 3)) != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) -2);
    }

    public boolean setIsNoPhoneMode(boolean z) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{6, 55, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 6);
    }

    public boolean setIsSleepNotDisturb(boolean z) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{6, 56, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 6);
    }

    public boolean setMusicPlayTime(int i, boolean z) {
        byte[] bArr = {48, z ? (byte) 1 : (byte) 0, 7, 0, 0};
        System.arraycopy(GattUtils.shortToBytes((short) i), 0, bArr, 3, 2);
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(bArr, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 48);
    }

    public boolean setRestMode(int i, int i2, boolean z) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, z ? (byte) 1 : (byte) 0, 16, (byte) i, (byte) i2}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 48);
    }

    public boolean setSmartPlay(boolean z, boolean z2) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, z2 ? (byte) 1 : (byte) 0, 18, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 48);
    }

    public boolean setTestSleep(boolean z) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{4, 19, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 4);
    }

    public boolean setTomatoMode(int i, int i2, int i3, boolean z) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, z ? (byte) 1 : (byte) 0, 17, (byte) i, (byte) i2, (byte) i3}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 48);
    }

    public boolean setVolume(short s, boolean z) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, z ? (byte) 1 : (byte) 0, 14, (byte) s}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 48);
    }

    public boolean switchMusic(HmVoiceType hmVoiceType, int i, boolean z) {
        byte[] bArr = {48, z ? (byte) 1 : (byte) 0, 15, 0, 0, 0, 0, hmVoiceType.getPlayType()};
        System.arraycopy(GattUtils.intToBytes(i), 0, bArr, 3, 4);
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(bArr, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 48);
    }

    public boolean deleteMusic(int i, boolean z) {
        byte[] bArr = {48, z ? (byte) 1 : (byte) 0, 19, 0, 0, 0, 0};
        System.arraycopy(GattUtils.intToBytes(i), 0, bArr, 3, 4);
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(bArr, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 48);
    }

    public boolean reset(boolean z) {
        HMNotifyResponse hMNotifyResponseSendEcfCommand = sendEcfCommand(new byte[]{48, z ? (byte) 1 : (byte) 0, 20}, 3);
        return hMNotifyResponseSendEcfCommand != null && hMNotifyResponseSendEcfCommand.isSuccess((byte) 48);
    }
}
