package com.xiaomi.hm.health.bt.profile.sport;

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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class HMSportProfile extends HMBaseProfile implements IGattCallback.INotifyCallback {
    public static final UUID UUID_CHARACTERISTIC_SPORT = GattUtils.uuid128(15);
    private static final byte f = 1;
    private static final byte g = 2;
    private BluetoothGattCharacteristic b;
    private byte[] c;
    private CountDownLatch d;
    private IHMSportListener e;

    public HMSportProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    private HMNotifyResponse b(BluetoothGattCharacteristic characteristic, byte[] cmd) {
        Debug.i(HMBaseProfile.TAG, "command:" + GattUtils.bytesToHexString(cmd));
        this.d = new CountDownLatch(1);
        if (!write(characteristic, cmd)) {
            return null;
        }
        try {
            this.d.await(5L, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.c);
        Debug.i(HMBaseProfile.TAG, "response:" + hMNotifyResponse);
        return hMNotifyResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.b;
        if (bluetoothGattCharacteristic == null) {
            return true;
        }
        unregisterNotification(bluetoothGattCharacteristic);
        return true;
    }

    public synchronized boolean doSportCommand(SportCommand command, SportInfo info) {
        boolean z = false;
        if (this.b == null) {
            Debug.i(HMBaseProfile.TAG, "mCharSport is null!!!");
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(command.getCommand());
            if (info == null || info.getBytes() == null || info.getBytes().length <= 0) {
                byteArrayOutputStream.write(SportInfo.nullValue());
            } else {
                byteArrayOutputStream.write(info.getBytes());
            }
            if (command != SportCommand.SHOW && command != SportCommand.NOTIFY && command != SportCommand.HEART) {
                HMNotifyResponse hMNotifyResponseB = b(this.b, byteArrayOutputStream.toByteArray());
                if (hMNotifyResponseB != null && hMNotifyResponseB.isSuccess()) {
                    z = true;
                }
                return z;
            }
            return sendCommandWithNoResponse(this.b, byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            Debug.i(HMBaseProfile.TAG, "doSportCommand exception:" + e.getMessage());
            return false;
        }
    }

    public synchronized boolean doSportCommandPiece(SportCommand command, SportInfo info) {
        if (this.b == null) {
            Debug.i(HMBaseProfile.TAG, "mCharSport is null!!!");
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(command.getCommand());
            if (info == null || info.getBytes() == null || info.getBytes().length <= 0) {
                byteArrayOutputStream.write(SportInfo.nullValue());
            } else {
                byteArrayOutputStream.write(info.getBytes());
            }
            return patchWrite(byteArrayOutputStream.toByteArray(), 6);
        } catch (Exception e) {
            Debug.i(HMBaseProfile.TAG, "doSportCommand exception:" + e.getMessage());
            return false;
        }
    }

    public synchronized boolean doSportConfig(SportConfig config) {
        if (this.b == null) {
            Debug.i(HMBaseProfile.TAG, "mCharSport is null!!!");
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(SportCommand.CONFIG.getCommand());
        byteArrayOutputStream.write(config.getVersion());
        byteArrayOutputStream.write(config.getSportKind().getKind());
        if (!config.isNeedDeviceClock()) {
            byteArrayOutputStream.write(1);
        }
        return b(this.b, byteArrayOutputStream.toByteArray()) != null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        UUID uuid = HMBaseProfile.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = UUID_CHARACTERISTIC_SPORT;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.b = characteristic;
        if (characteristic != null) {
            return registerNotification(characteristic, this);
        }
        Debug.fi(HMBaseProfile.TAG, uuid2 + " is null!!!");
        return false;
    }

    public boolean isSupportPiece() {
        GattPeripheral peripheral = getPeripheral();
        return peripheral != null && peripheral.getPieceProfileVersion() >= 11;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
    public void notify(byte[] value) {
        Debug.i(HMBaseProfile.TAG, "notify:" + GattUtils.bytesToHexString(value));
        if (value != null && value.length == 2 && value[0] == 17) {
            SportCommand sportCommandFromValue = SportCommand.fromValue(value[1]);
            IHMSportListener iHMSportListener = this.e;
            if (iHMSportListener != null) {
                iHMSportListener.onSportCommand(sportCommandFromValue);
                return;
            }
            return;
        }
        this.c = value;
        CountDownLatch countDownLatch = this.d;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void setListener(IHMSportListener listener) {
        this.e = listener;
    }
}
