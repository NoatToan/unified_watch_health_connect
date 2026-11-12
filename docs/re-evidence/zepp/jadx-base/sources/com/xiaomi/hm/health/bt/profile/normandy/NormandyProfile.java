package com.xiaomi.hm.health.bt.profile.normandy;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.selftest.HMNormandyTestInfo;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.GaitInfo;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class NormandyProfile extends BaseProfile implements a {
    private static final String q0 = "NormandyProfile";
    private final byte W;
    private final byte X;
    private final byte Y;
    private final byte Z;
    private final short m0;
    private final short n0;
    private byte[] o0;
    private BluetoothGattCharacteristic p0;

    public NormandyProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback callback) {
        super(context, device, callback);
        this.W = (byte) 3;
        this.X = (byte) 4;
        this.Y = (byte) 6;
        this.Z = (byte) 8;
        this.m0 = (short) 11;
        this.n0 = (short) 1;
        this.o0 = null;
        this.p0 = null;
    }

    private int getBatteryLevel() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.m_CharBattery;
        if (bluetoothGattCharacteristic == null) {
            return -1;
        }
        byte[] bArr = read(bluetoothGattCharacteristic);
        Debug.i(q0, "battery level data:" + GattUtils.bytesToHexString(bArr));
        if (bArr == null || bArr.length != 1) {
            return -1;
        }
        Debug.fi(q0, "battery level:" + (bArr[0] & 255) + "%");
        return bArr[0] & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(byte[] bArr) {
        Debug.i(q0, "notify:" + GattUtils.bytesToHexString(bArr));
        this.o0 = bArr;
        watingNotify(this.p0);
    }

    private synchronized HMNotifyResponse sendECFCommand(byte[] cmd, int cmdLen) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.p0;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        if (!registerNotification(bluetoothGattCharacteristic, new IGattCallback.INotifyCallback() { // from class: pf5
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.q0(bArr);
            }
        })) {
            return null;
        }
        this.o0 = null;
        if (!write(this.p0, cmd)) {
            return null;
        }
        if (this.o0 == null) {
            waiting(this.p0, 5000);
        }
        unregisterNotification(this.p0);
        return HMNotifyResponse.parse(this.o0, cmdLen);
    }

    public HMCalibrateResult calibrate(HMCalibrateConfig config) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(config.getBytes());
        if (hMNotifyResponseSendECFCommand == null) {
            Debug.fi(q0, "calibrate no response!!!");
            return null;
        }
        byte[] originResponseData = hMNotifyResponseSendECFCommand.getOriginResponseData();
        Debug.fi(q0, "calibrate response data:" + GattUtils.bytesToHexString(originResponseData));
        if (originResponseData == null || originResponseData.length < 6) {
            return null;
        }
        return new HMCalibrateResult(originResponseData[0] & 255, originResponseData[2] & 255, originResponseData[1] & 255, (((originResponseData[3] & 255) | ((originResponseData[4] & 255) << 8)) << 16) >> 16, ((((originResponseData[6] & 255) << 8) | (originResponseData[5] & 255)) << 16) >> 16);
    }

    public boolean enableConnectedAdv(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 1, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean enableSixAxis(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{8, z ? (byte) 1 : (byte) 0});
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 8);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    public BatteryInfo getBatteryInfo() {
        return new BatteryInfo(getBatteryLevel());
    }

    public HMStatisticInfo getStatisticInfo() {
        HMStatisticInfo hMStatisticInfo = new HMStatisticInfo();
        if (this.p0 == null) {
            return hMStatisticInfo;
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{3, 6});
        if (hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 3)) {
            byte[] data = hMNotifyResponseSendECFCommand.getData();
            if (data == null || data.length < 9) {
                return hMStatisticInfo;
            }
            int i = (data[1] & 255) | ((data[2] & 255) << 8) | ((data[3] & 255) << 16) | ((data[4] & 255) << 24);
            int i2 = (data[5] & 255) | ((data[6] & 255) << 8) | ((data[7] & 255) << 16) | ((data[8] & 255) << 24);
            hMStatisticInfo.setRebootCount(i);
            hMStatisticInfo.setHardwareRebootCount(i2);
            if (data.length == 11) {
                hMStatisticInfo.setNoInterruptCount(((data[10] & 255) << 8) | (data[9] & 255));
            }
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand2 = sendECFCommand(new byte[]{3, 7});
        if (hMNotifyResponseSendECFCommand2 != null && hMNotifyResponseSendECFCommand2.isSuccess((byte) 3)) {
            byte[] data2 = hMNotifyResponseSendECFCommand2.getData();
            Debug.i(q0, "performance 7 data:" + GattUtils.bytesToHexString(data2));
            if (data2 != null && data2.length >= 9) {
                int i3 = ((data2[2] & 255) << 8) | (data2[1] & 255);
                int i4 = ((data2[4] & 255) << 8) | (data2[3] & 255);
                int i5 = ((data2[6] & 255) << 8) | (data2[5] & 255);
                int i6 = ((data2[8] & 255) << 8) | (data2[7] & 255);
                hMStatisticInfo.setUpTime(i4 * 60);
                hMStatisticInfo.setTotalRunTime(i3);
                hMStatisticInfo.setTotalSleepTime(i5);
                hMStatisticInfo.setSixAxisTime(i6);
                Debug.i(q0, "runTime:" + i3 + ",runTimeLastReboot" + i4 + ",sleepTime:" + i5 + ",sixAxisTime:" + i6);
            }
        }
        return hMStatisticInfo;
    }

    public HMStatisticInfo getStatisticInfoNew() {
        HMNotifyResponse hMNotifyResponseSendECFCommand;
        HMStatisticInfo hMStatisticInfo = new HMStatisticInfo();
        if (this.p0 == null || (hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{3, 10})) == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 3)) {
            return hMStatisticInfo;
        }
        byte[] data = hMNotifyResponseSendECFCommand.getData();
        if (data == null || data.length != 17) {
            return null;
        }
        int i = ((data[2] & 255) << 8) | (data[1] & 255) | ((data[3] & 255) << 16) | ((data[4] & 255) << 24);
        int i2 = (data[5] & 255) | ((data[6] & 255) << 8);
        int i3 = (data[7] & 255) | ((data[8] & 255) << 8);
        int i4 = (data[9] & 255) | ((data[10] & 255) << 8) | ((data[11] & 255) << 16) | ((data[12] & 255) << 24);
        int i5 = ((data[16] & 255) << 24) | ((data[14] & 255) << 8) | (data[13] & 255) | ((data[15] & 255) << 16);
        hMStatisticInfo.setUpTime(i);
        hMStatisticInfo.setRebootCount(i2);
        hMStatisticInfo.setHardwareRebootCount(i3);
        hMStatisticInfo.setResumeTime(i4);
        hMStatisticInfo.setSixAxisTime(i5);
        return hMStatisticInfo;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean initCharacteristics() {
        super.initCharacteristics();
        UUID uuid = IBaseProfile.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(q0, uuid + " is null!");
            return false;
        }
        UUID uuid2 = a.b0;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.m_CharBattery = characteristic;
        if (characteristic == null) {
            Debug.fi(q0, uuid2 + " is null!");
            return false;
        }
        UUID uuid3 = a.c0;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(uuid3);
        this.m_CharRealtimeSteps = characteristic2;
        if (characteristic2 == null) {
            Debug.fi(q0, uuid3 + " is null!!!");
            return false;
        }
        UUID uuid4 = a.d0;
        BluetoothGattCharacteristic characteristic3 = service.getCharacteristic(uuid4);
        this.p0 = characteristic3;
        if (characteristic3 != null) {
            return true;
        }
        Debug.debug(uuid4 + " is null!");
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public RealtimeStep parseRealtimeStep(byte[] value) {
        Debug.fi(q0, "realtime steps:" + GattUtils.bytesToHexString(value));
        RealtimeStep realtimeStep = new RealtimeStep();
        if (value == null) {
            Debug.fi(q0, "bytes of realtime step is null!!");
            return null;
        }
        if (value.length == 9) {
            if (value[0] == 1) {
                int i = (value[1] & 255) | ((value[2] & 255) << 8) | ((value[3] & 255) << 16) | ((value[4] & 255) << 24);
                int i2 = ((value[8] & 255) << 24) | (value[5] & 255) | ((value[6] & 255) << 8) | ((value[7] & 255) << 16);
                realtimeStep.setTotalStep(i * 2);
                realtimeStep.setFront(i2 * 2);
            } else {
                Debug.fi(q0, "wrong type current!!!");
            }
        } else if (value.length != 13) {
            Debug.fi(q0, "length of realtime step byte is wrong:" + value.length);
        } else if (value[0] == 1) {
            int i3 = (value[1] & 255) | ((value[2] & 255) << 8) | ((value[3] & 255) << 16) | ((value[4] & 255) << 24);
            int i4 = (value[5] & 255) | ((value[6] & 255) << 8) | ((value[7] & 255) << 16) | ((value[8] & 255) << 24);
            int i5 = (value[9] & 255) | ((value[10] & 255) << 8);
            int i6 = ((value[12] & 255) << 8) | (value[11] & 255);
            realtimeStep.setTotalStep(i3 * 2);
            realtimeStep.setFront(i4 * 2);
            realtimeStep.setGaitInfo(new GaitInfo(i5, i6));
        } else {
            Debug.fi(q0, "wrong type current!!!");
        }
        return realtimeStep;
    }

    public boolean reset() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 11, 0, 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public HMNormandyTestInfo selfTest() {
        byte[] originResponseData;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{4});
        if (hMNotifyResponseSendECFCommand == null || (originResponseData = hMNotifyResponseSendECFCommand.getOriginResponseData()) == null || originResponseData.length != 4 || originResponseData[0] != 16 || originResponseData[1] != 4 || originResponseData[2] != 4) {
            return null;
        }
        byte b = originResponseData[3];
        return new HMNormandyTestInfo((b & 1) == 0, ((b >> 1) & 1) == 0, ((b >> 2) & 1) == 0, ((b >> 3) & 1) == 0, ((b >> 5) & 1) == 0);
    }

    private HMNotifyResponse sendECFCommand(byte[] cmd) {
        return sendECFCommand(cmd, 1);
    }
}
