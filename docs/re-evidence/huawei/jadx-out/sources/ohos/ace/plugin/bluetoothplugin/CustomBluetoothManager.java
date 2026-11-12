package ohos.ace.plugin.bluetoothplugin;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.huawei.operation.utils.Constants;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes46.dex */
public class CustomBluetoothManager {
    private static volatile CustomBluetoothManager INSTANCE = null;
    private static final Object INSTANCE_LOCK = new Object();
    private static final String LOG_TAG = "CustomBluetoothManager";
    private static final int NOT_FIND = 0;
    private BluetoothManager bluetoothManager_;
    private Context context_;
    private BluetoothAdapter bluetoothAdapter_ = null;
    private BluetoothLeScanner bluetoothLeScanner_ = null;
    private CustomBluetoothScanCallback bluetoothScanCallback_ = new CustomBluetoothScanCallback();
    private HashMap<Integer, Integer> bluetoothAdvertisingStatusMap_ = new HashMap<>();
    private HashMap<Integer, AdvertiseCallback> bluetoothAdvertiseCallbackMap_ = new HashMap<>();
    private HashMap<Integer, CustomGattServer> bluetoothGattServerMap_ = new HashMap<>();
    private HashMap<Integer, BluetoothGattClient> bluetoothGattClientMap_ = new HashMap<>();
    private HashMap<String, BluetoothDevice> bluetoothDeviceMap_ = new HashMap<>();
    private Lock bluetoothAdvertiserMapLock_ = new ReentrantLock();
    private Lock bluetoothDeviceMapLock_ = new ReentrantLock();
    private Lock bluetoothGattClientMapLock_ = new ReentrantLock();
    private Lock bluetoothGattServerMapLock_ = new ReentrantLock();

    private CustomBluetoothManager(Context context) {
        this.context_ = null;
        this.bluetoothManager_ = null;
        if (context == null) {
            Log.e(LOG_TAG, "Constructor failure, context is null");
            return;
        }
        try {
            this.context_ = context;
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
            this.bluetoothManager_ = bluetoothManager;
            if (bluetoothManager == null) {
                Log.e(LOG_TAG, "Constructor failure, bluetoothManager_ is null");
            }
        } catch (IllegalStateException e) {
            Log.e(LOG_TAG, "Constructor failure, IllegalStateException err is " + e);
        }
    }

    public static CustomBluetoothManager getInstance(Context context) {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (INSTANCE_LOCK) {
            if (INSTANCE != null) {
                return INSTANCE;
            }
            INSTANCE = new CustomBluetoothManager(context);
            return INSTANCE;
        }
    }

    public Context getContext() {
        return this.context_;
    }

    public BluetoothAdapter getBluetoothAdapter() {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter_;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter;
        }
        BluetoothManager bluetoothManager = this.bluetoothManager_;
        if (bluetoothManager != null) {
            BluetoothAdapter adapter = bluetoothManager.getAdapter();
            this.bluetoothAdapter_ = adapter;
            return adapter;
        }
        Log.e(LOG_TAG, "getBluetoothAdapter failed, bluetoothManager is null");
        return null;
    }

    public BluetoothLeScanner getBluetoothLeScanner() {
        BluetoothLeScanner bluetoothLeScanner = this.bluetoothLeScanner_;
        if (bluetoothLeScanner != null) {
            return bluetoothLeScanner;
        }
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter_;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            BluetoothLeScanner bluetoothLeScanner2 = this.bluetoothAdapter_.getBluetoothLeScanner();
            this.bluetoothLeScanner_ = bluetoothLeScanner2;
            return bluetoothLeScanner2;
        }
        Log.e(LOG_TAG, "getBluetoothLeScanner failed, bluetoothAdapter is error");
        return null;
    }

    public boolean bluetoothAdapterIsEnabled() {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter_;
        if (bluetoothAdapter == null) {
            return false;
        }
        return bluetoothAdapter.isEnabled();
    }

    public void addAdvertiseCallback(int i, AdvertiseCallback advertiseCallback) {
        this.bluetoothAdvertiserMapLock_.lock();
        HashMap<Integer, AdvertiseCallback> map = this.bluetoothAdvertiseCallbackMap_;
        if (map != null) {
            map.put(Integer.valueOf(i), advertiseCallback);
        }
        this.bluetoothAdvertiserMapLock_.unlock();
    }

    public AdvertiseCallback getAdvertiseCallback(int i) {
        HashMap<Integer, AdvertiseCallback> map = this.bluetoothAdvertiseCallbackMap_;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public void removeAdvertiseCallback(int i) {
        this.bluetoothAdvertiserMapLock_.lock();
        HashMap<Integer, AdvertiseCallback> map = this.bluetoothAdvertiseCallbackMap_;
        if (map != null) {
            map.remove(Integer.valueOf(i));
        }
        this.bluetoothAdvertiserMapLock_.unlock();
    }

    public void setAdvertisingStatus(int i, int i2) {
        this.bluetoothAdvertiserMapLock_.lock();
        HashMap<Integer, Integer> map = this.bluetoothAdvertisingStatusMap_;
        if (map != null) {
            map.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.bluetoothAdvertiserMapLock_.unlock();
    }

    public int getAdvertisingStatus(int i) {
        HashMap<Integer, Integer> map = this.bluetoothAdvertisingStatusMap_;
        if (map == null || !map.containsKey(Integer.valueOf(i))) {
            return 0;
        }
        return this.bluetoothAdvertisingStatusMap_.get(Integer.valueOf(i)).intValue();
    }

    public void removeAdvertisingStatus(int i) {
        this.bluetoothAdvertiserMapLock_.lock();
        HashMap<Integer, Integer> map = this.bluetoothAdvertisingStatusMap_;
        if (map != null) {
            map.remove(Integer.valueOf(i));
        }
        this.bluetoothAdvertiserMapLock_.unlock();
    }

    public int registerBluetoothGattServer(int i, Context context) {
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        if (this.bluetoothManager_ == null) {
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        this.bluetoothGattServerMapLock_.lock();
        try {
            CustomGattServerCallback customGattServerCallback = new CustomGattServerCallback();
            customGattServerCallback.setApplicationId(i);
            BluetoothGattServer bluetoothGattServerOpenGattServer = this.bluetoothManager_.openGattServer(context, customGattServerCallback);
            if (bluetoothGattServerOpenGattServer == null || this.bluetoothGattServerMap_ == null) {
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else {
                this.bluetoothGattServerMap_.put(Integer.valueOf(i), new CustomGattServer(bluetoothGattServerOpenGattServer));
            }
            return bluetoothErrorCode.getId();
        } catch (IllegalArgumentException e) {
            Log.e(LOG_TAG, "registerBluetoothGattServer failure, IllegalArgumentException err is " + e);
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        } finally {
            this.bluetoothGattServerMapLock_.unlock();
        }
    }

    public BluetoothGattServer getGattServer(int i) {
        CustomGattServer customGattServer;
        HashMap<Integer, CustomGattServer> map = this.bluetoothGattServerMap_;
        if (map == null || (customGattServer = map.get(Integer.valueOf(i))) == null) {
            return null;
        }
        return customGattServer.getBluetoothGattServer();
    }

    public CustomGattServer getCustomGattServer(int i) {
        HashMap<Integer, CustomGattServer> map = this.bluetoothGattServerMap_;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public void removeBluetoothGattService(int i, int i2) {
        CustomGattServer customGattServer;
        this.bluetoothGattServerMapLock_.lock();
        HashMap<Integer, CustomGattServer> map = this.bluetoothGattServerMap_;
        if (map != null && (customGattServer = map.get(Integer.valueOf(i))) != null) {
            customGattServer.removeBluetoothGattService(i2);
        }
        this.bluetoothGattServerMapLock_.unlock();
    }

    public BluetoothGattService getBluetoothGattService(int i, int i2) {
        CustomGattServer customGattServer;
        HashMap<Integer, CustomGattServer> map = this.bluetoothGattServerMap_;
        if (map == null || (customGattServer = map.get(Integer.valueOf(i))) == null) {
            return null;
        }
        return customGattServer.getBluetoothGattService(i2);
    }

    public void gattServerClose(int i) {
        this.bluetoothGattServerMapLock_.lock();
        HashMap<Integer, CustomGattServer> map = this.bluetoothGattServerMap_;
        if (map != null) {
            map.remove(Integer.valueOf(i));
        }
        this.bluetoothGattServerMapLock_.unlock();
    }

    public BluetoothGattCharacteristic getBluetoothGattCharacteristic(int i, int i2) {
        CustomGattServer customGattServer;
        HashMap<Integer, CustomGattServer> map = this.bluetoothGattServerMap_;
        if (map == null || (customGattServer = map.get(Integer.valueOf(i))) == null) {
            return null;
        }
        return customGattServer.getBluetoothGattCharacter(i2);
    }

    public boolean addBluetoothGattClient(int i, BluetoothGattClient bluetoothGattClient) {
        Lock lock;
        this.bluetoothGattClientMapLock_.lock();
        try {
            HashMap<Integer, BluetoothGattClient> map = this.bluetoothGattClientMap_;
            if (map != null && map.containsKey(Integer.valueOf(i))) {
                Log.e(LOG_TAG, "The BluetoothGattClient Already exists, appId is " + String.valueOf(i));
                return false;
            }
            this.bluetoothGattClientMap_.put(Integer.valueOf(i), bluetoothGattClient);
            Log.i(LOG_TAG, "The BluetoothGattClient add successfully, appId is " + String.valueOf(i));
            return true;
        } finally {
            this.bluetoothGattClientMapLock_.unlock();
        }
    }

    public BluetoothGattClient findBluetoothGattClient(int i) {
        HashMap<Integer, BluetoothGattClient> map = this.bluetoothGattClientMap_;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public void deleteBluetoothGattClient(int i) {
        this.bluetoothGattClientMapLock_.lock();
        try {
            HashMap<Integer, BluetoothGattClient> map = this.bluetoothGattClientMap_;
            if (map != null && map.containsKey(Integer.valueOf(i))) {
                this.bluetoothGattClientMap_.remove(Integer.valueOf(i));
            } else {
                Log.e(LOG_TAG, "delete BluetoothGattClient failed, appId is " + String.valueOf(i));
            }
        } finally {
            this.bluetoothGattClientMapLock_.unlock();
        }
    }

    public BluetoothDevice findBluetoothDevice(String str) {
        this.bluetoothDeviceMapLock_.lock();
        try {
            if (this.bluetoothDeviceMap_.containsKey(str)) {
                return this.bluetoothDeviceMap_.get(str);
            }
            return null;
        } finally {
            this.bluetoothDeviceMapLock_.unlock();
        }
    }

    public void addBluetoothDevice(String str, BluetoothDevice bluetoothDevice) {
        this.bluetoothDeviceMapLock_.lock();
        try {
            HashMap<String, BluetoothDevice> map = this.bluetoothDeviceMap_;
            if (map != null) {
                map.put(str, bluetoothDevice);
            } else {
                Log.e(LOG_TAG, "add BluetoothDevice failed.");
            }
        } finally {
            this.bluetoothDeviceMapLock_.unlock();
        }
    }

    public void deleteBluetoothDevice() {
        this.bluetoothDeviceMapLock_.lock();
        try {
            HashMap<String, BluetoothDevice> map = this.bluetoothDeviceMap_;
            if (map != null && !map.isEmpty()) {
                this.bluetoothDeviceMap_.clear();
            } else {
                Log.e(LOG_TAG, "delete BluetoothDevice failed.");
            }
        } finally {
            this.bluetoothDeviceMapLock_.unlock();
        }
    }

    public ScanCallback getScanCallback(int i) {
        CustomBluetoothScanCallback customBluetoothScanCallback = this.bluetoothScanCallback_;
        if (customBluetoothScanCallback != null && customBluetoothScanCallback.checkScannerId(i)) {
            this.bluetoothScanCallback_.setScannerId(i);
        }
        return this.bluetoothScanCallback_;
    }

    public class CustomBluetoothScanCallback extends ScanCallback {
        private int scannerId_ = 0;

        public CustomBluetoothScanCallback() {
        }

        public void setScannerId(int i) {
            this.scannerId_ = i;
        }

        public boolean checkScannerId(int i) {
            return this.scannerId_ != i;
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            BluetoothDevice device = scanResult.getDevice();
            if (device.getName() != null && !device.getName().isEmpty() && !device.getName().equalsIgnoreCase(Constants.NULL)) {
                CustomBluetoothManager.this.addBluetoothDevice(device.getAddress(), device);
            }
            BluetoothPlugin.nativeOnScanResult(BluetoothHelper.encapsulationBluetoothLeScanResults(scanResult), this.scannerId_);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            super.onScanFailed(i);
            Log.e(CustomBluetoothManager.LOG_TAG, "StartScan callback onScanFailed; errorCode is " + i);
        }
    }

    public class CustomGattServerCallback extends BluetoothGattServerCallback {
        private int applicationId_ = 0;

        public CustomGattServerCallback() {
        }

        public void setApplicationId(int i) {
            this.applicationId_ = i;
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onMtuChanged(BluetoothDevice bluetoothDevice, int i) {
            super.onMtuChanged(bluetoothDevice, i);
            String strConvertBluetoothDeviceToJString = BluetoothHelper.convertBluetoothDeviceToJString(bluetoothDevice);
            Intent intent = new Intent("onMtuChanged");
            intent.putExtra("applicationId", this.applicationId_);
            intent.putExtra("device", strConvertBluetoothDeviceToJString);
            intent.putExtra("mtu", i);
            BluetoothPlugin.sendBleBroadcast(intent);
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
            super.onConnectionStateChange(bluetoothDevice, i, i2);
            String strConvertBluetoothDeviceToJString = BluetoothHelper.convertBluetoothDeviceToJString(bluetoothDevice);
            Intent intent = new Intent("connectionStateChange");
            intent.putExtra("applicationId", this.applicationId_);
            intent.putExtra("device", strConvertBluetoothDeviceToJString);
            intent.putExtra("state", i2);
            BluetoothPlugin.sendBleBroadcast(intent);
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicReadRequest(bluetoothDevice, i, i2, bluetoothGattCharacteristic);
            if (CustomBluetoothManager.this.bluetoothGattServerMap_ != null) {
                String strConvertBluetoothDeviceToJString = BluetoothHelper.convertBluetoothDeviceToJString(bluetoothDevice);
                String strConvertCharacteristicToJString = BluetoothHelper.convertCharacteristicToJString(bluetoothGattCharacteristic, ((CustomGattServer) CustomBluetoothManager.this.bluetoothGattServerMap_.get(Integer.valueOf(this.applicationId_))).getCharacteristicHandleByUuid(bluetoothGattCharacteristic.getService().getUuid().toString(), bluetoothGattCharacteristic.getUuid().toString()));
                ((CustomGattServer) CustomBluetoothManager.this.bluetoothGattServerMap_.get(Integer.valueOf(this.applicationId_))).setRequestId(i);
                Intent intent = new Intent("characteristicRead");
                intent.putExtra("applicationId", this.applicationId_);
                intent.putExtra("device", strConvertBluetoothDeviceToJString);
                intent.putExtra("characteristic", strConvertCharacteristicToJString);
                BluetoothPlugin.sendBleBroadcast(intent);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
            super.onCharacteristicWriteRequest(bluetoothDevice, i, bluetoothGattCharacteristic, z, z2, i2, bArr);
            if (CustomBluetoothManager.this.bluetoothGattServerMap_ != null) {
                ((CustomGattServer) CustomBluetoothManager.this.bluetoothGattServerMap_.get(Integer.valueOf(this.applicationId_))).setRequestId(i);
                String strConvertBluetoothDeviceToJString = BluetoothHelper.convertBluetoothDeviceToJString(bluetoothDevice);
                String strConvertCharacteristicToJString = BluetoothHelper.convertCharacteristicToJString(bluetoothGattCharacteristic, ((CustomGattServer) CustomBluetoothManager.this.bluetoothGattServerMap_.get(Integer.valueOf(this.applicationId_))).getCharacteristicHandleByUuid(bluetoothGattCharacteristic.getService().getUuid().toString(), bluetoothGattCharacteristic.getUuid().toString()));
                Intent intent = new Intent("characteristicWrite");
                intent.putExtra("applicationId", this.applicationId_);
                intent.putExtra("device", strConvertBluetoothDeviceToJString);
                intent.putExtra("responseNeeded", z2 ? 1 : 0);
                intent.putExtra("characteristic", strConvertCharacteristicToJString);
                BluetoothPlugin.sendBleBroadcast(intent);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
            super.onDescriptorReadRequest(bluetoothDevice, i, i2, bluetoothGattDescriptor);
            if (CustomBluetoothManager.this.bluetoothGattServerMap_ != null) {
                String strConvertBluetoothDeviceToJString = BluetoothHelper.convertBluetoothDeviceToJString(bluetoothDevice);
                String strConvertDescriptorToJSONString = BluetoothHelper.convertDescriptorToJSONString(bluetoothGattDescriptor, ((CustomGattServer) CustomBluetoothManager.this.bluetoothGattServerMap_.get(Integer.valueOf(this.applicationId_))).getDescriptorHandleByUuid(bluetoothGattDescriptor.getCharacteristic().getService().getUuid().toString(), bluetoothGattDescriptor.getUuid().toString()));
                ((CustomGattServer) CustomBluetoothManager.this.bluetoothGattServerMap_.get(Integer.valueOf(this.applicationId_))).setRequestId(i);
                Intent intent = new Intent("descriptorRead");
                intent.putExtra("applicationId", this.applicationId_);
                intent.putExtra("device", strConvertBluetoothDeviceToJString);
                intent.putExtra("descriptor", strConvertDescriptorToJSONString);
                BluetoothPlugin.sendBleBroadcast(intent);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
            super.onDescriptorWriteRequest(bluetoothDevice, i, bluetoothGattDescriptor, z, z2, i2, bArr);
            if (CustomBluetoothManager.this.bluetoothGattServerMap_ != null) {
                ((CustomGattServer) CustomBluetoothManager.this.bluetoothGattServerMap_.get(Integer.valueOf(this.applicationId_))).setRequestId(i);
                String strConvertBluetoothDeviceToJString = BluetoothHelper.convertBluetoothDeviceToJString(bluetoothDevice);
                int descriptorHandleByUuid = ((CustomGattServer) CustomBluetoothManager.this.bluetoothGattServerMap_.get(Integer.valueOf(this.applicationId_))).getDescriptorHandleByUuid(bluetoothGattDescriptor.getCharacteristic().getService().getUuid().toString(), bluetoothGattDescriptor.getUuid().toString());
                if (bArr != null) {
                    bluetoothGattDescriptor.setValue(bArr);
                }
                String strConvertDescriptorToJSONString = BluetoothHelper.convertDescriptorToJSONString(bluetoothGattDescriptor, descriptorHandleByUuid, bArr);
                Intent intent = new Intent("descriptorWrite");
                intent.putExtra("applicationId", this.applicationId_);
                intent.putExtra("device", strConvertBluetoothDeviceToJString);
                intent.putExtra("descriptor", strConvertDescriptorToJSONString);
                BluetoothPlugin.sendBleBroadcast(intent);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
            super.onNotificationSent(bluetoothDevice, i);
            if (CustomBluetoothManager.this.bluetoothGattServerMap_ != null) {
                String strConvertBluetoothDeviceToJString = BluetoothHelper.convertBluetoothDeviceToJString(bluetoothDevice);
                Intent intent = new Intent("notificationSent");
                intent.putExtra("applicationId", this.applicationId_);
                intent.putExtra("device", strConvertBluetoothDeviceToJString);
                intent.putExtra("status", i);
                BluetoothPlugin.sendBleBroadcast(intent);
            }
        }
    }
}
