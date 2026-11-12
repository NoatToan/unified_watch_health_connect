package com.xiaomi.hm.health.bt.profile.base;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.huami.network.hmnetwork.utils.a;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public abstract class HMBaseProfile {
    public static final int NOTIFY_TIMEOUT = 15000;
    public static final int PAIR_TIMEOUT = 30000;
    public static final String TAG = "HMBaseProfile";
    private GattPeripheral a;
    public static final UUID UUID_SERVICE_MILI_SERVICE = GattUtils.uuid16("FEE0");
    public static final UUID UUID_SERVICE_WEIXIN_SERVICE = GattUtils.uuid16("FEE7");
    public static final UUID UUID_SERVICE_MILI_SECONDARY_SERVICE = GattUtils.uuid16("FEE1");

    public HMBaseProfile(GattPeripheral gattPeripheral) {
        this.a = null;
        this.a = gattPeripheral;
    }

    public byte[] a(byte[] key, byte[] encrypted) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, a.a);
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(2, secretKeySpec);
            byte[] bArrDoFinal = cipher.doFinal(encrypted);
            Debug.i(TAG, "decrypted value:" + GattUtils.bytesToHexString(bArrDoFinal));
            return bArrDoFinal;
        } catch (Exception e) {
            Debug.i(TAG, "Exception:" + e.getMessage());
            return null;
        }
    }

    public abstract boolean deInit();

    public void disconnect() {
        GattPeripheral gattPeripheral = this.a;
        if (gattPeripheral != null) {
            gattPeripheral.disconnect();
        }
    }

    public void enableRefreshGatt(boolean enable) {
        GattPeripheral gattPeripheral = this.a;
        if (gattPeripheral != null) {
            gattPeripheral.enableRefreshGatt(enable);
        }
    }

    public byte[] encrypt(byte[] src, byte[] key) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, a.a);
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrDoFinal = cipher.doFinal(src);
            Debug.i(TAG, "chip value:" + GattUtils.bytesToHexString(bArrDoFinal));
            return bArrDoFinal;
        } catch (Exception e) {
            Debug.i(TAG, "Exception:" + e.getMessage());
            return null;
        }
    }

    public BluetoothDevice getDevice() {
        GattPeripheral gattPeripheral = this.a;
        if (gattPeripheral == null) {
            return null;
        }
        return gattPeripheral.getDevice();
    }

    public LEParams getLEParams() {
        GattPeripheral gattPeripheral = this.a;
        if (gattPeripheral != null) {
            return gattPeripheral.getLEParams();
        }
        return null;
    }

    public Mtu getMtu() {
        GattPeripheral gattPeripheral = this.a;
        return gattPeripheral != null ? gattPeripheral.getMtu() : Mtu.createDefault();
    }

    public GattPeripheral getPeripheral() {
        return this.a;
    }

    public final BluetoothGattService getService(UUID uuid) {
        GattPeripheral gattPeripheral = this.a;
        if (gattPeripheral == null) {
            return null;
        }
        return gattPeripheral.getService(uuid);
    }

    public final boolean hasNotification(BluetoothGattCharacteristic characteristic) {
        GattPeripheral gattPeripheral = this.a;
        return gattPeripheral != null && gattPeripheral.hasNotification(characteristic);
    }

    public abstract boolean init();

    public boolean isSupportPatchWrite() {
        GattPeripheral gattPeripheral = this.a;
        return gattPeripheral != null && gattPeripheral.isSupportPatchWrite();
    }

    public byte[] md5(String key) {
        try {
            return MessageDigest.getInstance("MD5").digest(key.getBytes(Charset.defaultCharset()));
        } catch (Exception e) {
            Debug.i(TAG, "Exception:" + e.getMessage());
            return null;
        }
    }

    public boolean patchWrite(byte[] data, int profileType) {
        GattPeripheral gattPeripheral = this.a;
        return gattPeripheral != null && gattPeripheral.patchWrite(data, profileType);
    }

    public final byte[] read(BluetoothGattCharacteristic characteristic) {
        GattPeripheral gattPeripheral = this.a;
        if (gattPeripheral == null) {
            return null;
        }
        return gattPeripheral.read(characteristic);
    }

    public final boolean registerNotification(BluetoothGattCharacteristic characteristic, IGattCallback.INotifyCallback notifyCB) {
        GattPeripheral gattPeripheral = this.a;
        return gattPeripheral != null && gattPeripheral.registerNotification(characteristic, notifyCB);
    }

    public final boolean sendCommandWithNoResponse(BluetoothGattCharacteristic characteristic, byte[] cmd) {
        GattPeripheral gattPeripheral = this.a;
        return gattPeripheral != null && gattPeripheral.sendCommandWithNoResponse(characteristic, cmd);
    }

    public final HMNotifyResponse sendCommandWithResponse(BluetoothGattCharacteristic characteristic, byte[] cmd) {
        GattPeripheral gattPeripheral = this.a;
        if (gattPeripheral != null) {
            return gattPeripheral.sendCommandWithResponse(characteristic, cmd);
        }
        return null;
    }

    public boolean setLEParams(int connIntMin, int connIntMax, int latency, int timeout) {
        GattPeripheral gattPeripheral = this.a;
        return gattPeripheral != null && gattPeripheral.setLEParams(connIntMin, connIntMax, latency, timeout, 0);
    }

    public boolean setLep(int connIntMin, int connIntMax, int latency, int timeout, int advInt) {
        GattPeripheral gattPeripheral = this.a;
        return gattPeripheral != null && gattPeripheral.setLEParamsInternal(connIntMin, connIntMax, latency, timeout, advInt);
    }

    public boolean sync() {
        GattPeripheral gattPeripheral = this.a;
        return gattPeripheral != null && gattPeripheral.sync();
    }

    public final boolean unregisterNotification(BluetoothGattCharacteristic characteristic) {
        try {
            GattPeripheral gattPeripheral = this.a;
            return gattPeripheral != null && gattPeripheral.unregisterNotification(characteristic);
        } catch (Exception e) {
            Debug.fi(TAG, "Unregister notification exception:" + e.toString());
            return false;
        }
    }

    public final void waiting(Object obj, int timeout) {
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            try {
                obj.wait(timeout);
            } catch (Exception unused) {
            }
        }
    }

    public final void watingNotify(Object obj) {
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            obj.notify();
        }
    }

    public final boolean write(BluetoothGattCharacteristic characteristic, byte[] value) {
        GattPeripheral gattPeripheral = this.a;
        return gattPeripheral != null && gattPeripheral.write(characteristic, value);
    }

    public final byte[] read(BluetoothGattDescriptor descriptor) {
        GattPeripheral gattPeripheral = this.a;
        if (gattPeripheral == null) {
            return null;
        }
        return gattPeripheral.read(descriptor);
    }

    public final HMNotifyResponse sendCommandWithResponse(BluetoothGattCharacteristic characteristic, byte[] cmd, int timeout) {
        GattPeripheral gattPeripheral = this.a;
        if (gattPeripheral != null) {
            return gattPeripheral.sendCommandWithResponse(characteristic, cmd, timeout);
        }
        return null;
    }
}
