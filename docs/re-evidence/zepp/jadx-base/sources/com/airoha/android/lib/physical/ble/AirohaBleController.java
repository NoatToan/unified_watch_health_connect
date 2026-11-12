package com.airoha.android.lib.physical.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.util.Log;
import com.airoha.android.lib.physical.IPhysical;
import com.airoha.android.lib.physical.PhysicalType;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.transport.ITransport;
import com.airoha.android.lib.util.Converter;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaBleController implements IPhysical {
    private static final String i = "AirohaBleController";
    private static final UUID j = UUID.fromString("5052494D-2DAB-0341-6972-6F6861424C45");
    private static final UUID k = UUID.fromString("43484152-2DAB-3141-6972-6F6861424C45");
    private static final UUID l = UUID.fromString("43484152-2DAB-3241-6972-6F6861424C45");
    private static final int m = 273;
    private BluetoothManager a;
    private BluetoothAdapter b;
    private final Context c;
    private ITransport d;
    private BluetoothGatt e;
    private BluetoothGattCharacteristic f;
    private BluetoothGattCharacteristic g;
    private final BluetoothGattCallback h = new a();

    public class a extends BluetoothGattCallback {
        public a() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            byte[] value = bluetoothGattCharacteristic.getValue();
            AirohaBleController.this.d.logToFile(AirohaBleController.i, "onCharacteristicChanged :  " + Converter.byte2HexStr(value));
            AirohaBleController.this.d.handlePhysicalPacket(value);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            AirohaBleController.this.d.logToFile(AirohaBleController.i, "onCharacteristicWrite, status: " + i + ", value: " + Converter.byte2HexStr(bluetoothGattCharacteristic.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            if (i2 == 2) {
                AirohaBleController.this.d.logToFile(AirohaBleController.i, "GATT Connected");
                AirohaBleController.this.e.requestMtu(273);
            }
            if (i2 == 0) {
                AirohaBleController.this.d.logToFile(AirohaBleController.i, "GATT Disconnected");
                if (AirohaBleController.this.e != null) {
                    synchronized (AirohaBleController.this.e) {
                        AirohaBleController.this.e.close();
                        AirohaBleController.this.e = null;
                    }
                }
                AirohaBleController.this.notifyDisconnected();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
            AirohaBleController.this.d.logToFile(AirohaBleController.i, "onDescriptorRead :  " + Converter.byte2HexStr(bluetoothGattDescriptor.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onMtuChanged(bluetoothGatt, i, i2);
            AirohaBleController.this.d.logToFile(AirohaBleController.i, "onMtuChanged, mtu: " + i + ", status: " + i2);
            AirohaBleController.this.e.discoverServices();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onReadRemoteRssi(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            super.onReliableWriteCompleted(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            if (i != 0) {
                AirohaBleController.this.d.logToFile(AirohaBleController.i, "onServicesDiscovered received: " + i);
                return;
            }
            BluetoothGattService service = AirohaBleController.this.e.getService(AirohaBleController.j);
            if (service == null) {
                AirohaBleController.this.d.logToFile(AirohaBleController.i, "Can't find Airoha MMI Service");
                return;
            }
            AirohaBleController.this.f = service.getCharacteristic(AirohaBleController.k);
            AirohaBleController.this.g = service.getCharacteristic(AirohaBleController.l);
            if (AirohaBleController.this.f == null || AirohaBleController.this.g == null) {
                AirohaBleController.this.d.logToFile(AirohaBleController.i, "Can't find Airoha MMI Charcs");
                return;
            }
            AirohaBleController.this.d.logToFile(AirohaBleController.i, "Found Airoha MMI Charcs");
            AirohaBleController.this.d.logToFile(AirohaBleController.i, "read charc. property: " + AirohaBleController.this.f.getProperties());
            AirohaBleController.this.d.logToFile(AirohaBleController.i, "write charc. property: " + AirohaBleController.this.g.getProperties());
            AirohaBleController.this.e.setCharacteristicNotification(AirohaBleController.this.f, true);
            BluetoothGattDescriptor bluetoothGattDescriptor = AirohaBleController.this.f.getDescriptors().get(0);
            bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            AirohaBleController.this.e.writeDescriptor(bluetoothGattDescriptor);
            AirohaBleController.this.notifyConnected();
        }
    }

    public AirohaBleController(AirohaLink airohaLink) {
        this.b = null;
        this.d = airohaLink;
        Context context = airohaLink.getContext();
        this.c = context;
        if (this.a == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH);
            this.a = bluetoothManager;
            if (bluetoothManager == null) {
                Log.e(i, "Unable to initialize BluetoothManager.");
            }
        }
        BluetoothAdapter adapter = this.a.getAdapter();
        this.b = adapter;
        if (adapter == null) {
            Log.e(i, "Unable to obtain a BluetoothAdapter.");
        }
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public boolean connect(String str) {
        BluetoothAdapter bluetoothAdapter = this.b;
        if (bluetoothAdapter == null || str == null) {
            Log.w(i, "BluetoothAdapter not initialized or unspecified address.");
            return false;
        }
        BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
        if (remoteDevice == null) {
            Log.w(i, "Device not found.  Unable to connectSpp.");
            return false;
        }
        if (this.e != null) {
            return false;
        }
        this.e = remoteDevice.connectGatt(this.c, false, this.h);
        this.d.logToFile(i, "Trying to create a new connection.");
        return true;
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public void disconnect() {
        BluetoothGatt bluetoothGatt = this.e;
        if (bluetoothGatt != null) {
            synchronized (bluetoothGatt) {
                this.d.logToFile(i, "active disconnect LE");
                this.e.disconnect();
            }
        }
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public void notifyConnected() {
        this.d.OnPhysicalConnected(typeName());
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public void notifyConnectionError(String str) {
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public void notifyDisconnected() {
        this.d.OnPhysicalDisconnected(typeName());
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public String typeName() {
        return PhysicalType.BLE.toString();
    }

    @Override // com.airoha.android.lib.physical.IPhysical
    public boolean write(byte[] bArr) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.g;
        if (bluetoothGattCharacteristic != null) {
            bluetoothGattCharacteristic.setValue(bArr);
            BluetoothGatt bluetoothGatt = this.e;
            if (bluetoothGatt != null) {
                return bluetoothGatt.writeCharacteristic(this.g);
            }
        }
        return false;
    }
}
