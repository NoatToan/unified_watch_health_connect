package com.xiaomi.hm.health.bt.profile.bolt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.bolt.BoltProfile;
import java.io.ByteArrayOutputStream;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class BoltProfile extends BaseProfile {
    private final byte W;
    private final byte X;
    private final short Y;
    private final short Z;
    private final short m0;
    private final byte n0;
    private UUID o0;
    private BluetoothGattCharacteristic p0;

    public BoltProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback callback) {
        super(context, device, callback);
        this.W = (byte) 6;
        this.X = (byte) 19;
        this.Y = (short) 11;
        this.Z = (short) 45;
        this.m0 = (short) 46;
        this.n0 = (byte) 47;
        this.o0 = GattUtils.uuid128(3);
        this.p0 = null;
    }

    private int q0() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{19});
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 19) || (data = hMNotifyResponseSendECFCommand.getData()) == null || data.length != 2) {
            return -1;
        }
        return ((data[1] & 255) << 8) | (data[0] & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r0(AtomicReference atomicReference, int i, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(BaseProfile.TAG, "notify:" + GattUtils.bytesToHexString(bArr));
        atomicReference.getAndSet(HMNotifyResponse.parse(bArr, i));
        countDownLatch.countDown();
    }

    private synchronized HMNotifyResponse s0(byte[] cmd, final int cmdLen, int timeout) {
        Debug.fi(BaseProfile.TAG, "sendECFCommand:" + GattUtils.bytesToHexString(cmd) + ",cmdLen:" + cmdLen + ",timeout:" + timeout);
        if (this.p0 == null) {
            Debug.fi(BaseProfile.TAG, "m_CharControlPoint is null!!!");
            return null;
        }
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!registerNotification(this.p0, new IGattCallback.INotifyCallback() { // from class: r40
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                BoltProfile.r0(atomicReference, cmdLen, countDownLatch, bArr);
            }
        })) {
            Debug.fi(BaseProfile.TAG, "registerNotification m_CharControlPoint failed!!!");
        }
        if (!write(this.p0, cmd)) {
            unregisterNotification(this.p0);
            Debug.fi(BaseProfile.TAG, "write m_CharControlPoint failed!!!");
            return null;
        }
        try {
            countDownLatch.await(timeout, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            Debug.fi(BaseProfile.TAG, "await exception:" + e.getMessage());
        }
        unregisterNotification(this.p0);
        return (HMNotifyResponse) atomicReference.get();
    }

    private HMNotifyResponse sendECFCommand(byte[] cmd) {
        return sendECFCommand(cmd, 1);
    }

    public boolean disableNotify() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(47);
        byteArrayOutputStream.write(0);
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(byteArrayOutputStream.toByteArray());
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public DeviceInfo getDeviceInfo() {
        if (Build.VERSION.SDK_INT >= 24 && HMBleConfig.SUPPORT_UPDATE_MTU) {
            int iQ0 = q0();
            Debug.fi(BaseProfile.TAG, "ATT MTU size:" + iQ0);
            getMtu().setAttMtuSize(iQ0);
        }
        return super.getDeviceInfo();
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
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.o0);
        this.p0 = characteristic;
        if (characteristic != null) {
            return true;
        }
        Debug.fi(BaseProfile.TAG, this.o0 + " is null!");
        return false;
    }

    public boolean reset() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 11, 0, 1}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean syncHr(int hr) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 45, 0, (byte) hr}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean syncMacAddress(String mac) {
        byte[] bArrBytesOfBluetoothAddress = ProfileUtils.bytesOfBluetoothAddress(mac);
        if (bArrBytesOfBluetoothAddress == null || bArrBytesOfBluetoothAddress.length == 0) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(46);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(bArrBytesOfBluetoothAddress, 0, bArrBytesOfBluetoothAddress.length);
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(byteArrayOutputStream.toByteArray(), 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    private HMNotifyResponse sendECFCommand(byte[] cmd, int cmdLen) {
        return s0(cmd, cmdLen, 5000);
    }
}
