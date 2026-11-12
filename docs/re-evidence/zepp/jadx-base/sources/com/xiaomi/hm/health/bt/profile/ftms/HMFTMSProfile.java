package com.xiaomi.hm.health.bt.profile.ftms;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.ftms.HMFTMSProfile;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class HMFTMSProfile extends HMBaseProfile {
    private static final UUID f = GattUtils.uuid16("1826");
    private static final UUID g = GattUtils.uuid16("2ACD");
    private static final UUID h = GattUtils.uuid16("2AD9");
    private static final UUID i = GattUtils.uuid16("2ADA");
    private BluetoothGattCharacteristic b;
    private BluetoothGattCharacteristic c;
    private BluetoothGattCharacteristic d;
    private IFTMSListener e;

    public HMFTMSProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(byte[] bArr) {
        Debug.i(HMBaseProfile.TAG, "charTreadmill:" + GattUtils.bytesToHexString(bArr));
        TreadmillData treadmillDataI = i(bArr);
        Debug.i(HMBaseProfile.TAG, "TreadmillData:" + treadmillDataI);
        IFTMSListener iFTMSListener = this.e;
        if (iFTMSListener == null || treadmillDataI == null) {
            return;
        }
        iFTMSListener.onTreadmillData(treadmillDataI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(byte[] bArr) {
        Debug.i(HMBaseProfile.TAG, "charMachineStatus:" + GattUtils.bytesToHexString(bArr));
        MachineStatus machineStatusH = h(bArr);
        Debug.i(HMBaseProfile.TAG, "machineStatus:" + machineStatusH);
        IFTMSListener iFTMSListener = this.e;
        if (iFTMSListener == null || machineStatusH == null) {
            return;
        }
        iFTMSListener.onMachineStatus(machineStatusH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(HMNotifyResponse hMNotifyResponse, CountDownLatch countDownLatch, byte[] bArr) {
        hMNotifyResponse.from(bArr);
        countDownLatch.countDown();
    }

    private MachineStatus h(byte[] value) {
        byte[] bArr = null;
        if (value == null || value.length < 1) {
            return null;
        }
        int length = value.length;
        byte b = value[0];
        if (length > 1) {
            int i2 = length - 1;
            bArr = new byte[i2];
            System.arraycopy(value, 1, bArr, 0, i2);
        }
        return new MachineStatus(b, bArr);
    }

    private TreadmillData i(byte[] value) {
        if (value == null) {
            return null;
        }
        int i2 = 2;
        if (value.length < 2) {
            return null;
        }
        TreadmillData treadmillData = new TreadmillData();
        int i3 = (value[0] & 255) | ((value[1] & 255) << 8);
        if ((i3 & 1) != 0) {
            treadmillData.setInstantaneousSpeed((((value[2] & 255) | ((value[3] & 255) << 8)) * 10.0f) / 3600.0f);
            i2 = 4;
        }
        if ((i3 & 2) != 0) {
            int i4 = i2 + 1;
            treadmillData.setAverageSpeed((((value[i2] & 255) | ((value[i4] & 255) << 8)) * 10.0f) / 3600.0f);
            i2 = i4 + 1;
        }
        if ((i3 & 4) != 0) {
            int i5 = i2 + 1;
            int i6 = i5 + 1;
            treadmillData.setTotalDistance((value[i2] & 255) | ((value[i5] & 255) << 8) | ((value[i6] & 255) << 16));
            i2 = i6 + 1;
        }
        if ((i3 & 8) != 0) {
            int i7 = i2 + 1;
            int i8 = i7 + 1;
            treadmillData.setInclination((value[i2] & 255) | ((value[i7] & 255) << 8));
            int i9 = i8 + 1;
            treadmillData.setRampAngle(((value[i9] & 255) << 8) | (value[i8] & 255));
            i2 = i9 + 1;
        }
        if ((i3 & 16) != 0) {
            int i10 = i2 + 1;
            int i11 = i10 + 1;
            treadmillData.setPositiveElevationGain((value[i2] & 255) | ((value[i10] & 255) << 8));
            int i12 = i11 + 1;
            treadmillData.setNegativeElevationGain(((value[i12] & 255) << 8) | (value[i11] & 255));
            i2 = i12 + 1;
        }
        if ((i3 & 32) != 0) {
            treadmillData.setInstantaneousPace(((value[i2] & 255) * 1000.0f) / 60.0f);
            i2++;
        }
        if ((i3 & 64) != 0) {
            treadmillData.setAveragePace(((value[i2] & 255) * 1000.0f) / 60.0f);
            i2++;
        }
        if ((i3 & 128) != 0) {
            int i13 = i2 + 1;
            int i14 = i13 + 1;
            treadmillData.setExpendedEnergy((value[i2] & 255) | ((value[i13] & 255) << 8));
            int i15 = i14 + 1;
            int i16 = value[i14] & 255;
            int i17 = i15 + 1;
            treadmillData.setEnergyPerHour(((value[i15] & 255) << 8) | i16);
            i2 = i17 + 1;
            treadmillData.setEnergyPerMinute(value[i17] & 255);
        }
        if ((i3 & 256) != 0) {
            treadmillData.setHeartRate(value[i2] & 255);
            i2++;
        }
        if ((i3 & 512) != 0) {
            treadmillData.setMetabolicEquivalent(value[i2] & 255);
            i2++;
        }
        if ((i3 & 1024) != 0) {
            int i18 = i2 + 1;
            treadmillData.setElapsedTime((value[i2] & 255) | ((value[i18] & 255) << 8));
            i2 = i18 + 1;
        }
        if ((i3 & 2048) != 0) {
            int i19 = i2 + 1;
            treadmillData.setRemainingTime((value[i2] & 255) | ((value[i19] & 255) << 8));
            i2 = i19 + 1;
        }
        if ((i3 & 4096) != 0) {
            int i20 = i2 + 1;
            int i21 = i20 + 1;
            treadmillData.setForceOnBelt((value[i2] & 255) | ((value[i20] & 255) << 8));
            treadmillData.setPowerOutput(((value[i21 + 1] & 255) << 8) | (value[i21] & 255));
        }
        return treadmillData;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.b;
        if (bluetoothGattCharacteristic != null) {
            unregisterNotification(bluetoothGattCharacteristic);
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.c;
        if (bluetoothGattCharacteristic2 == null) {
            return false;
        }
        unregisterNotification(bluetoothGattCharacteristic2);
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        UUID uuid = f;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = g;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.b = characteristic;
        if (characteristic == null) {
            Debug.fi(HMBaseProfile.TAG, uuid2 + " is null!!!");
            return false;
        }
        if (!registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: su2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.e(bArr);
            }
        })) {
            Debug.fi(HMBaseProfile.TAG, "registerNotification " + uuid2 + " failed!!!");
            return false;
        }
        UUID uuid3 = h;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(uuid3);
        this.d = characteristic2;
        if (characteristic2 == null) {
            Debug.fi(HMBaseProfile.TAG, uuid3 + " is null!!!");
            return false;
        }
        UUID uuid4 = i;
        BluetoothGattCharacteristic characteristic3 = service.getCharacteristic(uuid4);
        this.c = characteristic3;
        if (characteristic3 == null) {
            Debug.fi(HMBaseProfile.TAG, uuid4 + " is null!!!");
            return false;
        }
        if (registerNotification(characteristic3, new IGattCallback.INotifyCallback() { // from class: ru2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.f(bArr);
            }
        })) {
            return true;
        }
        Debug.fi(HMBaseProfile.TAG, "registerNotification " + uuid4 + " failed!!!");
        return false;
    }

    public boolean sendFTMSCommand(FTMSCommand command) {
        byte[] bytes;
        if (command == null || (bytes = command.getBytes()) == null || bytes.length == 0) {
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        if (!registerNotification(this.d, new IGattCallback.INotifyCallback() { // from class: qu2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMFTMSProfile.g(hMNotifyResponse, countDownLatch, bArr);
            }
        }) || !write(this.d, bytes)) {
            return false;
        }
        try {
            countDownLatch.await(15000L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        return hMNotifyResponse.isSuccess((byte) command.getOp());
    }

    public void setListener(IFTMSListener listener) {
        this.e = listener;
    }
}
