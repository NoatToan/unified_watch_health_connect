package com.huami.watch.companion.ble.lostwarning;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.huami.watch.companion.ble.utils.GetString;
import com.huami.watch.util.Log;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
abstract class LostWarningGattClient {
    private static final boolean e = true;
    public static final String f = "LWGattClient";
    private BluetoothManager a;
    private Context b;
    private BluetoothGatt c;
    private BluetoothGattCallback d;

    public static final class CharacteristicsInfo {
        public UUID characteristicsUUID;
        public UUID serviceUUID;

        public CharacteristicsInfo(UUID uuid, UUID uuid2) {
            this.serviceUUID = uuid;
            this.characteristicsUUID = uuid2;
        }
    }

    public final class a extends BluetoothGattCallback {
        private a() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            LostWarningGattClient.this.b(bluetoothGatt, bluetoothGattCharacteristic);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LostWarningGattClient.this.c(bluetoothGatt, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LostWarningGattClient.this.d(bluetoothGatt, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Log.d(LostWarningGattClient.f, "GattClient onConnectionStateChange device:" + bluetoothGatt.getDevice(), new Object[0]);
            Log.d(LostWarningGattClient.f, "continue.. status:" + i + " newState:" + GetString.BtProfileState(i2), new Object[0]);
            LostWarningGattClient.this.e(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (LostWarningGattClient.this.l(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                LostWarningGattClient.this.g(bluetoothGatt, bluetoothGattDescriptor, i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            LostWarningGattClient.this.i(bluetoothGatt, i);
        }
    }

    public LostWarningGattClient(Context context, BluetoothManager bluetoothManager) {
        bluetoothManager.getAdapter();
        this.b = context;
    }

    public static void j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(UUID uuid) {
        return uuid.equals(LostWarningConstant.SERVICE) || uuid.equals(LostWarningConstant.SOURCE);
    }

    public abstract void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic);

    public abstract void c(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    public abstract void d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    public abstract void e(BluetoothGatt bluetoothGatt, int i, int i2);

    public void f(BluetoothDevice bluetoothDevice) {
        if (this.d == null) {
            this.d = new a();
        }
        this.c = bluetoothDevice.connectGatt(this.b, false, this.d);
    }

    public abstract void g(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i);

    public void h() {
        if (this.d != null) {
            this.d = null;
        }
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.disconnect();
                this.c.close();
            } catch (Exception unused) {
            }
            this.c = null;
        }
    }

    public abstract void i(BluetoothGatt bluetoothGatt, int i);

    public BluetoothGatt k() {
        return this.c;
    }

    public boolean m(UUID uuid, UUID uuid2) {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null) {
            return false;
        }
        BluetoothGattService service = bluetoothGatt.getService(uuid);
        if (service == null) {
            Log.d(f, "  error: can not find service.", new Object[0]);
            return false;
        }
        Log.d(f, "  find service.", new Object[0]);
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        if (characteristic == null) {
            Log.d(f, "    error: cant find source characteristic", new Object[0]);
            return false;
        }
        boolean characteristic2 = this.c.readCharacteristic(characteristic);
        Log.d(f, "    read characteristic " + characteristic2, new Object[0]);
        return characteristic2;
    }

    public boolean n(byte[] bArr) {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        BluetoothGattDescriptor descriptor;
        Log.d(f, "requestPerform", new Object[0]);
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || (service = bluetoothGatt.getService(LostWarningConstant.SERVICE)) == null || (characteristic = service.getCharacteristic(LostWarningConstant.SOURCE)) == null || (descriptor = characteristic.getDescriptor(LostWarningConstant.CHAC_CONFIG)) == null) {
            return false;
        }
        descriptor.setValue(bArr);
        return this.c.writeDescriptor(descriptor);
    }

    public boolean o(UUID uuid, UUID uuid2, boolean z, boolean z2) {
        byte[] bArr;
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null) {
            return false;
        }
        BluetoothGattService service = bluetoothGatt.getService(uuid);
        if (service == null) {
            Log.d(f, "  error: can not find service.", new Object[0]);
            return false;
        }
        Log.d(f, "  find service.", new Object[0]);
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        if (characteristic == null) {
            Log.d(f, "    error: cant find data source characteristic", new Object[0]);
            return false;
        }
        Log.d(f, "    find data source chara ", new Object[0]);
        if (!this.c.setCharacteristicNotification(characteristic, z2)) {
            Log.d(f, "    error: setCharacteristicNotification " + z2 + " failure.", new Object[0]);
            return false;
        }
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(LostWarningConstant.CHAC_CONFIG);
        if (descriptor == null) {
            Log.d(f, "      error: cant find data source desc :: ", new Object[0]);
            return false;
        }
        Log.d(f, "      find data source desc :: ", new Object[0]);
        if (z2) {
            bArr = z ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        } else {
            bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
        }
        descriptor.setValue(bArr);
        boolean zWriteDescriptor = this.c.writeDescriptor(descriptor);
        if (!zWriteDescriptor && z2) {
            this.c.setCharacteristicNotification(characteristic, false);
        }
        return zWriteDescriptor;
    }
}
