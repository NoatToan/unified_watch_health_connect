package ohos.ace.plugin.bluetoothplugin;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes46.dex */
public class BluetoothGattClient {
    private static final String LOG_TAG = "BluetoothGattClient";
    private static final int OH_BT_STATUS_FAIL = 1;
    private static final int OH_BT_STATUS_SUCCESS = 0;
    private static final int VERSION_TIRAMISU = 33;
    private static final int WRITE_SUCCESS = 0;
    private int appId_;
    private BluetoothGatt bluetoothGatt_ = null;
    private BluetoothGattCallback gattCallback_ = new BluetoothGattCallback() { // from class: ohos.ace.plugin.bluetoothplugin.BluetoothGattClient.1
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            Log.i(BluetoothGattClient.LOG_TAG, "onConnectionStateChange status is " + i + ", newState is " + i2);
            if (i != 0 && bluetoothGatt != null) {
                bluetoothGatt.close();
            }
            Intent intent = new Intent("nativeGattClientSetServices");
            intent.putExtra("appId", BluetoothGattClient.this.appId_);
            intent.putExtra("status", i);
            intent.putExtra("newState", i2);
            BluetoothPlugin.sendBleBroadcast(intent);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            Log.i(BluetoothGattClient.LOG_TAG, "onServicesDiscovered enter.");
            Intent intent = new Intent("onServicesDiscovered");
            intent.putExtra("appId", BluetoothGattClient.this.appId_);
            if (i == 0) {
                for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
                    intent.putExtra("serviceJSONString", BluetoothHelper.convertGattServiceToJSONString(bluetoothGattService));
                    HashMap map = new HashMap();
                    bluetoothGattService.getUuid().toString();
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                        arrayList.add(BluetoothHelper.convertCharacteristicToJSONString(bluetoothGattCharacteristic));
                        intent.putStringArrayListExtra("characterStrings", arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
                        while (it.hasNext()) {
                            arrayList2.add(BluetoothHelper.convertDescriptorToJSONString(it.next()));
                        }
                        map.put(bluetoothGattCharacteristic.getUuid().toString(), arrayList2.toArray(new String[0]));
                        intent.putExtra("clientCharacteristicMap", map);
                    }
                    BluetoothPlugin.sendBleBroadcast(intent);
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            Intent intent = new Intent("nativeOnCharacteristicRead");
            intent.putExtra("appId", BluetoothGattClient.this.appId_);
            String strConvertCharacteristicToJSONString = BluetoothHelper.convertCharacteristicToJSONString(bluetoothGattCharacteristic);
            if (i == 0) {
                intent.putExtra("status", 0);
            } else {
                intent.putExtra("status", 1);
            }
            intent.putExtra("result", strConvertCharacteristicToJSONString);
            BluetoothPlugin.sendBleBroadcast(intent);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            Intent intent = new Intent("nativeOnCharacteristicWrite");
            intent.putExtra("appId", BluetoothGattClient.this.appId_);
            String strConvertCharacteristicToJSONString = BluetoothHelper.convertCharacteristicToJSONString(bluetoothGattCharacteristic);
            if (i == 0) {
                intent.putExtra("status", 0);
            } else {
                intent.putExtra("status", 1);
            }
            intent.putExtra("result", strConvertCharacteristicToJSONString);
            BluetoothPlugin.sendBleBroadcast(intent);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            Intent intent = new Intent("nativeOnCharacteristicChanged");
            intent.putExtra("appId", BluetoothGattClient.this.appId_);
            intent.putExtra("result", BluetoothHelper.convertCharacteristicToJSONString(bluetoothGattCharacteristic));
            BluetoothPlugin.sendBleBroadcast(intent);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
            Log.i(BluetoothGattClient.LOG_TAG, "onDescriptorRead enter.");
            Intent intent = new Intent("nativeOnDescriptorRead");
            intent.putExtra("appId", BluetoothGattClient.this.appId_);
            String strConvertDescriptorToJSONString = BluetoothHelper.convertDescriptorToJSONString(bluetoothGattDescriptor);
            if (i == 0) {
                intent.putExtra("status", 0);
            } else {
                intent.putExtra("status", 1);
            }
            intent.putExtra("result", strConvertDescriptorToJSONString);
            BluetoothPlugin.sendBleBroadcast(intent);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            Log.i(BluetoothGattClient.LOG_TAG, "onDescriptorWrite enter.");
            Intent intent = new Intent("nativeOnDescriptorWrite");
            intent.putExtra("appId", BluetoothGattClient.this.appId_);
            String strConvertDescriptorToJSONString = BluetoothHelper.convertDescriptorToJSONString(bluetoothGattDescriptor);
            if (i == 0) {
                intent.putExtra("status", 0);
            } else {
                intent.putExtra("status", 1);
            }
            intent.putExtra("result", strConvertDescriptorToJSONString);
            BluetoothPlugin.sendBleBroadcast(intent);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onMtuChanged(bluetoothGatt, i, i2);
            Intent intent = new Intent("nativeOnMtuChanged");
            intent.putExtra("appId", BluetoothGattClient.this.appId_);
            if (i2 == 0) {
                Log.i(BluetoothGattClient.LOG_TAG, "MTU updated to: " + i);
                intent.putExtra("mtu", i);
                intent.putExtra("status", 0);
            } else {
                Log.e(BluetoothGattClient.LOG_TAG, "MTU update failed: " + i);
                intent.putExtra("mtu", i);
                intent.putExtra("status", 1);
            }
            BluetoothPlugin.sendBleBroadcast(intent);
        }
    };

    public BluetoothGattClient(int i) {
        this.appId_ = 0;
        this.appId_ = i;
    }

    public int connect(Context context, BluetoothDevice bluetoothDevice) {
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        if (context == null) {
            Log.e(LOG_TAG, "connect failed, context is null");
            return id;
        }
        if (bluetoothDevice == null) {
            Log.e(LOG_TAG, "connect failed, device is null");
            return id;
        }
        try {
            BluetoothGatt bluetoothGattConnectGatt = bluetoothDevice.connectGatt(context, false, this.gattCallback_, 2);
            this.bluetoothGatt_ = bluetoothGattConnectGatt;
            if (bluetoothGattConnectGatt == null) {
                Log.e(LOG_TAG, "connect failed, bluetoothGatt is null");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
            return BluetoothErrorCode.BT_NO_ERROR.getId();
        } catch (IllegalArgumentException e) {
            Log.e(LOG_TAG, "connectGatt failed, error is " + e);
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
    }

    public int discoverServices() {
        BluetoothGatt bluetoothGatt = this.bluetoothGatt_;
        if (bluetoothGatt != null) {
            if (bluetoothGatt.discoverServices()) {
                return BluetoothErrorCode.BT_NO_ERROR.getId();
            }
            Log.e(LOG_TAG, "native discoverServices result is false");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        Log.e(LOG_TAG, "discoverServices failed, bluetoothGatt is null");
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
    }

    public int disconnect() {
        BluetoothGatt bluetoothGatt = this.bluetoothGatt_;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
            return BluetoothErrorCode.BT_NO_ERROR.getId();
        }
        Log.e(LOG_TAG, "disconnect failed, bluetoothGatt is null");
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
    }

    public int close() {
        BluetoothGatt bluetoothGatt = this.bluetoothGatt_;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
            Log.e(LOG_TAG, "close " + BluetoothErrorCode.BT_NO_ERROR.getId());
            return BluetoothErrorCode.BT_NO_ERROR.getId();
        }
        Log.e(LOG_TAG, "close failed, bluetoothGatt is null");
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
    }

    public int requestExchangeMtu(int i) {
        BluetoothGatt bluetoothGatt = this.bluetoothGatt_;
        if (bluetoothGatt == null) {
            Log.e(LOG_TAG, "requestExchangeMtu failed, bluetoothGatt_ is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (bluetoothGatt.requestMtu(i)) {
            return BluetoothErrorCode.BT_NO_ERROR.getId();
        }
        Log.e(LOG_TAG, "native requestMtu failed.");
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
    }

    private BluetoothGattCharacteristic getCharacterForServices(String str, String str2) {
        try {
            if (str == null || str2 == null) {
                Log.e(LOG_TAG, "getCharacterForServices failed, sUuidString or cUuidString is null.");
                return null;
            }
            BluetoothGattService service = this.bluetoothGatt_.getService(UUID.fromString(str));
            if (service == null) {
                Log.e(LOG_TAG, "getCharacterForServices failed, the service is null.");
                return null;
            }
            return service.getCharacteristic(UUID.fromString(str2));
        } catch (IllegalArgumentException e) {
            Log.e(LOG_TAG, "UUID fromString failed for getCharacterForServices, error is " + e);
            return null;
        }
    }

    public int readCharacter(String str, String str2) {
        BluetoothGattCharacteristic characterForServices = getCharacterForServices(str, str2);
        if (characterForServices == null) {
            Log.e(LOG_TAG, "readCharacter failed, characteristic is null.");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!this.bluetoothGatt_.readCharacteristic(characterForServices)) {
            Log.e(LOG_TAG, "native readCharacteristic failed.");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        return BluetoothErrorCode.BT_NO_ERROR.getId();
    }

    public int requestNotification(String str, String str2, boolean z) {
        if (this.bluetoothGatt_ == null) {
            Log.e(LOG_TAG, "requestNotification failed, bluetoothGatt_ is null.");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothGattCharacteristic characterForServices = getCharacterForServices(str, str2);
        if (characterForServices == null) {
            Log.e(LOG_TAG, "requestNotification failed, characteristic is null.");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (this.bluetoothGatt_.setCharacteristicNotification(characterForServices, z)) {
            return BluetoothErrorCode.BT_NO_ERROR.getId();
        }
        Log.e(LOG_TAG, "native setCharacteristicNotification failed.");
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
    }

    public int writeCharacter(String str, String str2, byte[] bArr, int i) {
        BluetoothGattCharacteristic characterForServices = getCharacterForServices(str, str2);
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        if (characterForServices == null) {
            return id;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (((Integer) BluetoothGatt.class.getMethod("writeCharacteristic", BluetoothGattCharacteristic.class, byte[].class, Integer.TYPE).invoke(this.bluetoothGatt_, characterForServices, bArr, Integer.valueOf(i))).intValue() == 0) {
                    return BluetoothErrorCode.BT_NO_ERROR.getId();
                }
                Log.e(LOG_TAG, "native writeCharacter failed.");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            } catch (IllegalAccessException unused) {
                Log.e(LOG_TAG, "writeCharacter failed, IllegalAccessException.");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            } catch (NoSuchMethodException unused2) {
                Log.e(LOG_TAG, "writeCharacter failed, NoSuchMethodException.");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            } catch (InvocationTargetException unused3) {
                Log.e(LOG_TAG, "writeCharacter failed, InvocationTargetException.");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
        }
        characterForServices.setValue(bArr);
        characterForServices.setWriteType(i);
        if (this.bluetoothGatt_.writeCharacteristic(characterForServices)) {
            return BluetoothErrorCode.BT_NO_ERROR.getId();
        }
        Log.e(LOG_TAG, "native readCharacteristic failed.");
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
    }

    public int readDescriptor(String str, String str2, String str3) {
        BluetoothGattDescriptor descriptorForServices = getDescriptorForServices(str, str2, str3);
        if (descriptorForServices == null) {
            Log.e(LOG_TAG, "readDescriptor failed, descriptor is null.");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!this.bluetoothGatt_.readDescriptor(descriptorForServices)) {
            Log.e(LOG_TAG, "native readDescriptor failed.");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        return BluetoothErrorCode.BT_NO_ERROR.getId();
    }

    private BluetoothGattDescriptor getDescriptorForServices(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            Log.e(LOG_TAG, "getDescriptorForServices failed, sUuidString or cUuidString or dUuidString is null.");
            return null;
        }
        try {
            BluetoothGattService service = this.bluetoothGatt_.getService(UUID.fromString(str));
            if (service == null) {
                Log.e(LOG_TAG, "getDescriptorForServices failed, the service is null.");
                return null;
            }
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(str2));
            if (characteristic == null) {
                Log.e(LOG_TAG, "getDescriptorForServices failed, the characteristic is null.");
                return null;
            }
            return characteristic.getDescriptor(UUID.fromString(str3));
        } catch (IllegalArgumentException e) {
            Log.e(LOG_TAG, "UUID fromString failed for getDescriptorForServices, error is " + e);
            return null;
        }
    }

    public int writeDescriptor(String str, String str2, String str3, byte[] bArr) {
        BluetoothGattDescriptor descriptorForServices = getDescriptorForServices(str, str2, str3);
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        if (descriptorForServices == null) {
            return id;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (((Integer) BluetoothGatt.class.getMethod("writeDescriptor", BluetoothGattDescriptor.class, byte[].class).invoke(this.bluetoothGatt_, descriptorForServices, bArr)).intValue() == 0) {
                    return BluetoothErrorCode.BT_NO_ERROR.getId();
                }
                Log.e(LOG_TAG, "native writeDescriptor failed.");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            } catch (IllegalAccessException unused) {
                Log.e(LOG_TAG, "writeDescriptor failed, IllegalAccessException.");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            } catch (NoSuchMethodException unused2) {
                Log.e(LOG_TAG, "writeDescriptor failed, NoSuchMethodException.");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            } catch (InvocationTargetException unused3) {
                Log.e(LOG_TAG, "writeDescriptor failed, InvocationTargetException.");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
        }
        descriptorForServices.setValue(bArr);
        if (this.bluetoothGatt_.writeDescriptor(descriptorForServices)) {
            return BluetoothErrorCode.BT_NO_ERROR.getId();
        }
        Log.e(LOG_TAG, "native writeDescriptor failed.");
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
    }
}
