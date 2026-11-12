package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a6t {
    public static final int NOTIFY_TIMEOUT = 15000;
    public static final int PAIR_TIMEOUT = 30000;
    public static final String TAG = "HMBaseProfile";
    private jet mGattPeripheral;
    public static final UUID UUID_SERVICE_MILI_SERVICE = tet.F("FEE0");
    public static final UUID UUID_SERVICE_WEIXIN_SERVICE = tet.F("FEE7");
    public static final UUID UUID_SERVICE_MILI_SECONDARY_SERVICE = tet.F("FEE1");

    public a6t(jet jetVar) {
        this.mGattPeripheral = jetVar;
    }

    public abstract boolean deInit();

    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(2, secretKeySpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            t5t.m(TAG, "decrypted value:" + tet.x(bArrDoFinal));
            return bArrDoFinal;
        } catch (Exception e) {
            t5t.m(TAG, "Exception:" + e.getMessage());
            return null;
        }
    }

    public void disconnect() {
        jet jetVar = this.mGattPeripheral;
        if (jetVar != null) {
            jetVar.j0();
        }
    }

    public void enableRefreshGatt(boolean z) {
        jet jetVar = this.mGattPeripheral;
        if (jetVar != null) {
            jetVar.N(z);
        }
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            t5t.m(TAG, "chip value:" + tet.x(bArrDoFinal));
            return bArrDoFinal;
        } catch (Exception e) {
            t5t.m(TAG, "Exception:" + e.getMessage());
            return null;
        }
    }

    public BluetoothDevice getDevice() {
        jet jetVar = this.mGattPeripheral;
        if (jetVar == null) {
            return null;
        }
        return jetVar.m0();
    }

    public yet getLEParams() {
        jet jetVar = this.mGattPeripheral;
        if (jetVar != null) {
            return jetVar.x0();
        }
        return null;
    }

    public sft getMtu() {
        jet jetVar = this.mGattPeripheral;
        return jetVar != null ? jetVar.y0() : sft.a();
    }

    public jet getPeripheral() {
        return this.mGattPeripheral;
    }

    public final BluetoothGattService getService(UUID uuid) {
        jet jetVar = this.mGattPeripheral;
        if (jetVar == null) {
            return null;
        }
        return jetVar.p(uuid);
    }

    public final boolean hasNotification(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        jet jetVar = this.mGattPeripheral;
        return jetVar != null && jetVar.D(bluetoothGattCharacteristic);
    }

    public abstract boolean init();

    public boolean isSupportPatchWrite() {
        jet jetVar = this.mGattPeripheral;
        return jetVar != null && jetVar.C0();
    }

    public byte[] md5(String str) {
        try {
            return MessageDigest.getInstance(Coder.KEY_MD5).digest(str.getBytes(Charset.defaultCharset()));
        } catch (Exception e) {
            t5t.m(TAG, "Exception:" + e.getMessage());
            return null;
        }
    }

    public boolean patchWrite(byte[] bArr, int i) {
        jet jetVar = this.mGattPeripheral;
        return jetVar != null && jetVar.O0(bArr, i);
    }

    public final byte[] read(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        jet jetVar = this.mGattPeripheral;
        if (jetVar == null) {
            return null;
        }
        return jetVar.S0(bluetoothGattCharacteristic);
    }

    public final boolean registerNotification(BluetoothGattCharacteristic bluetoothGattCharacteristic, zh.b bVar) {
        jet jetVar = this.mGattPeripheral;
        return jetVar != null && jetVar.E(bluetoothGattCharacteristic, bVar);
    }

    public final boolean sendCommandWithNoResponse(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        jet jetVar = this.mGattPeripheral;
        return jetVar != null && jetVar.N0(bluetoothGattCharacteristic, bArr);
    }

    public final qe sendCommandWithResponse(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        jet jetVar = this.mGattPeripheral;
        if (jetVar != null) {
            return jetVar.P0(bluetoothGattCharacteristic, bArr);
        }
        return null;
    }

    public boolean setLEParams(int i, int i2, int i3, int i4) {
        jet jetVar = this.mGattPeripheral;
        return jetVar != null && jetVar.K0(i, i2, i3, i4, 0);
    }

    public boolean setLep(int i, int i2, int i3, int i4, int i5) {
        jet jetVar = this.mGattPeripheral;
        return jetVar != null && jetVar.M0(i, i2, i3, i4, i5);
    }

    public boolean sync() {
        jet jetVar = this.mGattPeripheral;
        return jetVar != null && jetVar.E0();
    }

    public final boolean unregisterNotification(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        try {
            jet jetVar = this.mGattPeripheral;
            return jetVar != null && jetVar.a0(bluetoothGattCharacteristic);
        } catch (Exception e) {
            t5t.d(TAG, "Unregister notification exception:" + e.toString());
            return false;
        }
    }

    public final void waiting(Object obj, int i) {
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            try {
                obj.wait(i);
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

    public final boolean write(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        jet jetVar = this.mGattPeripheral;
        return jetVar != null && jetVar.R0(bluetoothGattCharacteristic, bArr);
    }

    public final byte[] read(BluetoothGattDescriptor bluetoothGattDescriptor) {
        jet jetVar = this.mGattPeripheral;
        if (jetVar == null) {
            return null;
        }
        return jetVar.Q0(bluetoothGattDescriptor);
    }

    public final qe sendCommandWithResponse(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        jet jetVar = this.mGattPeripheral;
        if (jetVar != null) {
            return jetVar.F0(bluetoothGattCharacteristic, bArr, i);
        }
        return null;
    }
}
