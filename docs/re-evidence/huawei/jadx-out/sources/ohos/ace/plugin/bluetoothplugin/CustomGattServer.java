package ohos.ace.plugin.bluetoothplugin;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes46.dex */
public class CustomGattServer {
    private static final String GATT_SERVICE_DIS = "180A";
    private static final String GATT_SERVICE_GAP = "1801";
    private static final String GATT_SERVICE_GATTS = "1800";
    private static final int INTEGER_SIZE = 2;
    private static final int INVALID_HANDLE = -1;
    private static final String LOG_TAG = "CustomGattServer";
    private static final int SUB_INDEX = 4;
    private static final int SUB_INDEX_END = 8;
    private BluetoothGattServer gattServer_;
    private int requestId_;
    private HashMap<Integer, Integer> handleInfoMap_ = new HashMap<>();
    private HashMap<Integer, BluetoothGattService> bluetoothGattServiceMap_ = new HashMap<>();
    private HashMap<Integer, BluetoothGattCharacteristic> BluetoothGattCharacteristicMap_ = new HashMap<>();
    private HashMap<Integer, BluetoothGattDescriptor> BluetoothGattDescriptorMap_ = new HashMap<>();
    private Lock bluetoothServerMapLock_ = new ReentrantLock();

    public CustomGattServer(BluetoothGattServer bluetoothGattServer) {
        this.gattServer_ = null;
        this.gattServer_ = bluetoothGattServer;
    }

    public BluetoothGattServer getBluetoothGattServer() {
        return this.gattServer_;
    }

    public void addBluetoothGattService(int i, BluetoothGattService bluetoothGattService) {
        this.bluetoothServerMapLock_.lock();
        HashMap<Integer, BluetoothGattService> map = this.bluetoothGattServiceMap_;
        if (map != null) {
            map.put(Integer.valueOf(i), bluetoothGattService);
        }
        this.bluetoothServerMapLock_.unlock();
    }

    public void removeBluetoothGattService(int i) {
        this.bluetoothServerMapLock_.lock();
        HashMap<Integer, BluetoothGattService> map = this.bluetoothGattServiceMap_;
        if (map != null && this.handleInfoMap_ != null && this.BluetoothGattCharacteristicMap_ != null && this.BluetoothGattDescriptorMap_ != null) {
            map.remove(Integer.valueOf(i));
            if (this.handleInfoMap_.containsKey(Integer.valueOf(i))) {
                for (int i2 = i; i2 <= this.handleInfoMap_.get(Integer.valueOf(i)).intValue(); i2++) {
                    this.BluetoothGattCharacteristicMap_.remove(Integer.valueOf(i2));
                    this.BluetoothGattDescriptorMap_.remove(Integer.valueOf(i2));
                }
                this.handleInfoMap_.remove(Integer.valueOf(i));
            }
        }
        this.bluetoothServerMapLock_.unlock();
    }

    public BluetoothGattService getBluetoothGattService(int i) {
        HashMap<Integer, BluetoothGattService> map = this.bluetoothGattServiceMap_;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public void addBluetoothGattCharacter(int i, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.bluetoothServerMapLock_.lock();
        HashMap<Integer, BluetoothGattCharacteristic> map = this.BluetoothGattCharacteristicMap_;
        if (map != null) {
            map.put(Integer.valueOf(i), bluetoothGattCharacteristic);
        }
        this.bluetoothServerMapLock_.unlock();
    }

    public BluetoothGattCharacteristic getBluetoothGattCharacter(int i) {
        HashMap<Integer, BluetoothGattCharacteristic> map = this.BluetoothGattCharacteristicMap_;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public void addBluetoothGattDescriptor(int i, BluetoothGattDescriptor bluetoothGattDescriptor) {
        this.bluetoothServerMapLock_.lock();
        HashMap<Integer, BluetoothGattDescriptor> map = this.BluetoothGattDescriptorMap_;
        if (map != null) {
            map.put(Integer.valueOf(i), bluetoothGattDescriptor);
        }
        this.bluetoothServerMapLock_.unlock();
    }

    public BluetoothGattDescriptor getBluetoothGattDescriptor(int i) {
        HashMap<Integer, BluetoothGattDescriptor> map = this.BluetoothGattDescriptorMap_;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public void addBluetoothHandleInfo(int i, int i2) {
        this.bluetoothServerMapLock_.lock();
        HashMap<Integer, Integer> map = this.handleInfoMap_;
        if (map != null) {
            map.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.bluetoothServerMapLock_.unlock();
    }

    public boolean serviceIsExist(String str) {
        HashMap<Integer, BluetoothGattService> map = this.bluetoothGattServiceMap_;
        if (map == null) {
            return false;
        }
        for (Map.Entry<Integer, BluetoothGattService> entry : map.entrySet()) {
            String strSubstring = str.substring(4, 8);
            String strSubstring2 = entry.getValue().getUuid().toString().substring(4, 8);
            if (strSubstring.equalsIgnoreCase(GATT_SERVICE_DIS) && strSubstring2.equalsIgnoreCase(GATT_SERVICE_DIS)) {
                return true;
            }
            if (strSubstring.equals(GATT_SERVICE_GATTS) && strSubstring2.equals(GATT_SERVICE_GATTS)) {
                return true;
            }
            if (strSubstring.equals(GATT_SERVICE_GAP) && strSubstring2.equals(GATT_SERVICE_GAP)) {
                return true;
            }
        }
        return false;
    }

    public Integer[] getServiceHandleScopeByUuid(String str) {
        Integer[] numArr = new Integer[2];
        HashMap<Integer, BluetoothGattService> map = this.bluetoothGattServiceMap_;
        if (map == null) {
            return null;
        }
        for (Map.Entry<Integer, BluetoothGattService> entry : map.entrySet()) {
            if (entry.getValue().getUuid().toString().equalsIgnoreCase(str)) {
                Integer key = entry.getKey();
                numArr[0] = key;
                numArr[1] = this.handleInfoMap_.get(key);
                Log.i(LOG_TAG, "HandleScope: " + numArr[0] + " -- " + numArr[1]);
                return numArr;
            }
        }
        return null;
    }

    public int getCharacteristicHandleByUuid(String str, String str2) {
        int iIntValue = getServiceHandleScopeByUuid(str)[1].intValue();
        if (this.BluetoothGattCharacteristicMap_ == null) {
            return -1;
        }
        for (int iIntValue2 = getServiceHandleScopeByUuid(str)[0].intValue(); iIntValue2 <= iIntValue; iIntValue2++) {
            if (this.BluetoothGattCharacteristicMap_.containsKey(Integer.valueOf(iIntValue2)) && this.BluetoothGattCharacteristicMap_.get(Integer.valueOf(iIntValue2)).getUuid().toString().equalsIgnoreCase(str2)) {
                Log.i(LOG_TAG, "Characteristic handle is " + iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    public int getDescriptorHandleByUuid(String str, String str2) {
        int iIntValue = getServiceHandleScopeByUuid(str)[1].intValue();
        if (this.BluetoothGattDescriptorMap_ == null) {
            return -1;
        }
        for (int iIntValue2 = getServiceHandleScopeByUuid(str)[0].intValue(); iIntValue2 <= iIntValue; iIntValue2++) {
            if (this.BluetoothGattDescriptorMap_.containsKey(Integer.valueOf(iIntValue2)) && this.BluetoothGattDescriptorMap_.get(Integer.valueOf(iIntValue2)).getUuid().toString().equalsIgnoreCase(str2)) {
                Log.i(LOG_TAG, "Descriptor handle is " + iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    public void setRequestId(int i) {
        this.requestId_ = i;
    }

    public int getRequestId() {
        return this.requestId_;
    }
}
