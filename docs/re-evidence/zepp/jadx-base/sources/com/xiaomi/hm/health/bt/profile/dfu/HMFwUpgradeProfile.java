package com.xiaomi.hm.health.bt.profile.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
@SuppressLint({"NewApi"})
public class HMFwUpgradeProfile extends HMBaseProfile {
    private static final int o = 3;
    private static final int p = 30;
    private static final int q = 10000;
    private final UUID b;
    private final UUID c;
    private final UUID d;
    private final byte e;
    private final byte f;
    private final byte g;
    private final byte h;
    private final byte i;
    private final byte j;
    private BluetoothGattCharacteristic k;
    private BluetoothGattCharacteristic l;
    private byte[] m;
    private byte[] n;

    public HMFwUpgradeProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = GattUtils.uuid128(5424);
        this.c = GattUtils.uuid128(5425);
        this.d = GattUtils.uuid128(5426);
        this.e = (byte) 0;
        this.f = (byte) 1;
        this.g = (byte) 3;
        this.h = (byte) 4;
        this.i = (byte) 5;
        this.j = (byte) 6;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "cpt response: " + GattUtils.bytesToHexString(bArr));
        if (bArr != null && bArr.length == 6 && bArr[1] == 6) {
            this.n = bArr;
            watingNotify(this.l);
        } else {
            this.m = bArr;
            watingNotify(this.k);
        }
    }

    private HMNotifyResponse h(byte[] cmd) {
        return i(cmd, 15000);
    }

    private HMNotifyResponse i(byte[] cmd, int timeout) {
        Debug.i(HMBaseProfile.TAG, "sendCommand:" + GattUtils.bytesToHexString(cmd));
        this.m = null;
        if (write(this.k, cmd)) {
            if (this.m == null) {
                waiting(this.k, timeout);
            }
            HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.m);
            this.m = null;
            return hMNotifyResponse;
        }
        Debug.fi(HMBaseProfile.TAG, "Fail to sendCommand:" + GattUtils.bytesToHexString(cmd));
        return null;
    }

    public boolean c(int sum) {
        if (this.n == null) {
            waiting(this.l, 15000);
        }
        byte[] bArr = this.n;
        if (bArr == null) {
            return false;
        }
        int i = ((bArr[5] & 255) << 24) | (bArr[2] & 255) | ((bArr[3] & 255) << 8) | ((bArr[4] & 255) << 16);
        this.n = null;
        return sum == i;
    }

    public boolean d() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.k;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{0});
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.k;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        unregisterNotification(bluetoothGattCharacteristic);
        return false;
    }

    public boolean e() {
        if (this.m == null) {
            waiting(this.k, 15000);
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.m);
        return hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 3);
    }

    public boolean g() {
        HMNotifyResponse hMNotifyResponseH = h(new byte[]{5});
        return hMNotifyResponseH != null && hMNotifyResponseH.isSuccess((byte) 5);
    }

    public int getState() {
        HMNotifyResponse hMNotifyResponseH = h(new byte[]{1, 0, 0, 0, HMFirmwareType.FIRMWARE_QUERY.getValue()});
        if (hMNotifyResponseH == null) {
            return 0;
        }
        Debug.i(HMBaseProfile.TAG, "response:" + hMNotifyResponseH);
        return hMNotifyResponseH.getCode();
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        BluetoothGattService service = getService(this.b);
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, "service dfu is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.c);
        this.k = characteristic;
        if (characteristic == null) {
            Debug.fi(HMBaseProfile.TAG, "BluetoothGattCharacteristic cpt is null!!!");
            return false;
        }
        if (!registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: ew2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.f(bArr);
            }
        })) {
            Debug.fi(HMBaseProfile.TAG, "registerNotification for cpt failed!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(this.d);
        this.l = characteristic2;
        if (characteristic2 != null) {
            return true;
        }
        Debug.fi(HMBaseProfile.TAG, "BluetoothGattCharacteristic pkt is null!!!");
        return false;
    }

    public boolean j(int crc, int timeout) {
        byte[] bArr = {4, 0, 0};
        GattUtils.writeLE(bArr, 1, (short) (crc & 65535));
        HMNotifyResponse hMNotifyResponseI = i(bArr, timeout);
        return hMNotifyResponseI != null && hMNotifyResponseI.isSuccess((byte) 4);
    }

    public boolean sendData(byte[] data) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.l;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, data);
    }

    public boolean start(int size) {
        byte[] bArr = new byte[4];
        GattUtils.writeLE(bArr, 0, (size << 8) | 1);
        HMNotifyResponse hMNotifyResponseH = h(bArr);
        return hMNotifyResponseH != null && hMNotifyResponseH.isSuccess((byte) 1);
    }

    public boolean startTransfer() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.k;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{3});
    }

    public boolean stopTransfer(int crc) {
        byte[] bArr = {4, 0, 0};
        GattUtils.writeLE(bArr, 1, (short) (crc & 65535));
        return write(this.k, bArr);
    }

    public boolean start(int size, HMFirmwareType type, boolean isSupportSyncSize, int syncSize) {
        HMNotifyResponse hMNotifyResponseH;
        int i = (size << 8) | 1;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(GattUtils.intToBytes(i));
            if (type != HMFirmwareType.FIRMWARE) {
                byteArrayOutputStream.write(type.getValue());
            }
            if (isSupportSyncSize) {
                byteArrayOutputStream.write(GattUtils.shortToBytes((short) syncSize));
            }
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "Exception:" + e.getMessage());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        HMNotifyResponse hMNotifyResponseH2 = null;
        if (type != HMFirmwareType.FIRMWARE_GPS_CEP && type != HMFirmwareType.FIRMWARE_GPS) {
            hMNotifyResponseH = h(byteArray);
        } else {
            int i2 = type == HMFirmwareType.FIRMWARE_GPS ? 30 : 3;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= i2 || (hMNotifyResponseH2 = h(byteArray)) == null || hMNotifyResponseH2.getCode() != 9) {
                    break;
                }
                try {
                    Thread.sleep(10000L);
                } catch (Exception e2) {
                    Debug.fi(HMBaseProfile.TAG, "sleep exception:" + e2.getMessage());
                }
                i3 = i4;
            }
            hMNotifyResponseH = hMNotifyResponseH2;
        }
        Debug.fi(HMBaseProfile.TAG, "type:" + type + ",response:" + hMNotifyResponseH);
        return hMNotifyResponseH != null && hMNotifyResponseH.isSuccess((byte) 1);
    }
}
