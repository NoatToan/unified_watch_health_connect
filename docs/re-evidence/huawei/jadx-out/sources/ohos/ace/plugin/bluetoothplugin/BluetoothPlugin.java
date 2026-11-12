package ohos.ace.plugin.bluetoothplugin;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/* JADX INFO: loaded from: classes46.dex */
public class BluetoothPlugin {
    private static final int API_31 = 31;
    private static final int API_33 = 33;
    protected static final String BLE_ADVERTISER_RESULT = "nativeOnStartAdvertisingResult";
    protected static final String BLE_CLIENT_CHARACTERISTIC_CHANGED = "nativeOnCharacteristicChanged";
    protected static final String BLE_CLIENT_CONNECTION_STATE_CHANGE = "nativeGattClientSetServices";
    protected static final String BLE_CLIENT_READ_CHARACTERISTIC = "nativeOnCharacteristicRead";
    protected static final String BLE_CLIENT_READ_DESCRIPTOR = "nativeOnDescriptorRead";
    protected static final String BLE_CLIENT_SERVICES_DISCOVERED = "onServicesDiscovered";
    protected static final String BLE_CLIENT_SET_MTU = "nativeOnMtuChanged";
    protected static final String BLE_CLIENT_WRITE_CHARACTERISTIC = "nativeOnCharacteristicWrite";
    protected static final String BLE_CLIENT_WRITE_DESCRIPTOR = "nativeOnDescriptorWrite";
    protected static final String BLE_SERVER_CONNECTION_STATE_CHANGE = "connectionStateChange";
    protected static final String BLE_SERVER_MTU_CHANGE = "onMtuChanged";
    protected static final String BLE_SERVER_NOTIFICATION_SENT = "notificationSent";
    protected static final String BLE_SERVER_READ_CHARACTERISTIC = "characteristicRead";
    protected static final String BLE_SERVER_READ_DESCRIPTOR = "descriptorRead";
    protected static final String BLE_SERVER_WRITE_CHARACTERISTIC = "characteristicWrite";
    protected static final String BLE_SERVER_WRITE_DESCRIPTOR = "descriptorWrite";
    private static final int BT_STATUS_SUCCESS = 0;
    private static final int DEFAULT_OFFSET = 0;
    private static final String LOG_TAG = "BluetoothPlugin";
    private static final String PERMISSION_ACCESS_COARSE_LOCATION = "android.permission.ACCESS_COARSE_LOCATION";
    private static final String PERMISSION_ACCESS_FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION";
    private static final String PERMISSION_BLUETOOTH = "android.permission.BLUETOOTH";
    private static final String PERMISSION_BLUETOOTH_ADMIN = "android.permission.BLUETOOTH_ADMIN";
    private static final String PERMISSION_BLUETOOTH_ADVERTISE = "android.permission.BLUETOOTH_ADVERTISE";
    private static final String PERMISSION_BLUETOOTH_CONNECT = "android.permission.BLUETOOTH_CONNECT";
    private static final String PERMISSION_BLUETOOTH_SCAN = "android.permission.BLUETOOTH_SCAN";
    private static final Object Profile_Lock = new Object();
    private static final int RECEIVER_EXPORTED = 2;
    private static BluetoothA2dp bluetoothA2dp_;
    private static CustomBluetoothManager btManager_;
    private BluetoothBroadcastReceive btBroadcastReceive_;
    private BluetoothProfile.ServiceListener btServiceListener_ = null;
    private Context mContext_;

    public enum AdvOptCode {
        ADV_DEFAULT_CODE,
        ADV_STOP_COMPLETE_CODE,
        ADV_FAILED_CODE
    }

    public enum AdvertisingStatus {
        ADVERTISING_STATUS_NOT_START,
        ADVERTISING_STATUS_STOP,
        ADVERTISING_STATUS_START,
        ADVERTISING_STATUS_ALREADY_START,
        ADVERTISING_STATUS_INTERNAL
    }

    protected static native void nativeGattClientSetServices(int i, String str, String[] strArr, HashMap<String, String[]> map);

    protected static native void nativeOnCharacteristicChanged(int i, String str);

    protected static native void nativeOnCharacteristicRead(int i, String str, int i2);

    protected static native void nativeOnCharacteristicWrite(int i, String str, int i2);

    protected static native void nativeOnConnectionStateChanged(int i, int i2, int i3);

    protected static native void nativeOnDescriptorRead(int i, String str, int i2);

    protected static native void nativeOnDescriptorWrite(int i, String str, int i2);

    protected static native void nativeOnMtuChanged(int i, int i2, int i3);

    protected static native void nativeOnScanResult(String str, int i);

    protected static native void nativeOnStartAdvertisingResult(int i, int i2, int i3);

    protected static native void nativeServerOnCharacteristicReadRequestCallback(String str, String str2, int i);

    protected static native void nativeServerOnCharacteristicWriteRequestCallback(String str, String str2, boolean z, int i);

    protected static native void nativeServerOnConnectionStateChangeCallback(String str, int i, int i2);

    protected static native void nativeServerOnDescriptorReadRequestCallback(String str, String str2, int i);

    protected static native void nativeServerOnDescriptorWriteRequestCallback(String str, String str2, int i);

    protected static native void nativeServerOnMtuChangedCallback(String str, int i, int i2);

    protected static native void nativeServerOnNotificationSentCallback(String str, int i, int i2);

    protected native void OnConnectionStateChanged(String str, int i, int i2);

    public native void nativeInit();

    protected native void onChangeStateCallBack(int i);

    protected native void onDiscoveryResultCallBack(String str, int i, String str2, int i2);

    protected native void onPairStatusChangedCallBack(int i, String str, int i2, int i3);

    public BluetoothPlugin(Context context) {
        this.mContext_ = context;
        btManager_ = CustomBluetoothManager.getInstance(context);
        nativeInit();
        registerBluetoothReceiver(this.mContext_);
        registerBluetoothServiceListener(this.mContext_);
    }

    private boolean checkPermissions(String... strArr) {
        if (this.mContext_ == null) {
            Log.e(LOG_TAG, "checkPermissions mContext_ is null.");
            return false;
        }
        for (String str : strArr) {
            if (this.mContext_.checkCallingOrSelfPermission(str) != 0) {
                Log.e(LOG_TAG, "Permission check failed, The permissions is " + str);
                return false;
            }
        }
        return true;
    }

    public boolean checkGattServerPermission() {
        if (Build.VERSION.SDK_INT >= 31) {
            return checkPermissions(PERMISSION_BLUETOOTH, PERMISSION_BLUETOOTH_CONNECT);
        }
        return checkPermissions(PERMISSION_BLUETOOTH, PERMISSION_BLUETOOTH_ADMIN);
    }

    public boolean checkGattClientPermission() {
        if (Build.VERSION.SDK_INT >= 31) {
            return checkPermissions(PERMISSION_BLUETOOTH_CONNECT);
        }
        return checkPermissions(PERMISSION_BLUETOOTH, PERMISSION_BLUETOOTH_ADMIN);
    }

    public int startScan(String str, String[] strArr, int i) {
        boolean zCheckPermissions;
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        if (Build.VERSION.SDK_INT >= 31) {
            zCheckPermissions = checkPermissions(PERMISSION_BLUETOOTH, PERMISSION_BLUETOOTH_SCAN);
        } else {
            zCheckPermissions = (checkPermissions(PERMISSION_ACCESS_COARSE_LOCATION) || checkPermissions(PERMISSION_ACCESS_FINE_LOCATION)) && checkPermissions(PERMISSION_BLUETOOTH, PERMISSION_BLUETOOTH_ADMIN);
        }
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            Log.e(LOG_TAG, "CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        try {
            if (!zCheckPermissions) {
                Log.e(LOG_TAG, "Permission check failed");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
            try {
                BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
                BluetoothLeScanner bluetoothLeScanner = btManager_.getBluetoothLeScanner();
                if (bluetoothAdapter == null) {
                    Log.e(LOG_TAG, "startScan failed, The device does not support Bluetooth");
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                } else if (!bluetoothAdapter.isEnabled()) {
                    Log.e(LOG_TAG, "startScan failed, User not enabled Bluetooth switch");
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
                } else if (bluetoothLeScanner == null) {
                    Log.e(LOG_TAG, "startScan failed, BluetoothLeScanner is null");
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                } else {
                    List<ScanFilter> bluetoothScanFilters = BluetoothHelper.getBluetoothScanFilters(strArr);
                    ScanSettings bluetoothLeScanSettings = BluetoothHelper.getBluetoothLeScanSettings(str);
                    if (bluetoothScanFilters == null || bluetoothLeScanSettings == null) {
                        Log.e(LOG_TAG, "startScan failed, Invalid Param");
                        bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_PARAM;
                    } else {
                        if (bluetoothScanFilters.isEmpty()) {
                            bluetoothScanFilters = null;
                        }
                        btManager_.deleteBluetoothDevice();
                        bluetoothLeScanner.startScan(bluetoothScanFilters, bluetoothLeScanSettings, btManager_.getScanCallback(i));
                    }
                }
                return bluetoothErrorCode.getId();
            } catch (IllegalArgumentException | IllegalStateException e) {
                Log.e(LOG_TAG, "startScan failed, try-catch err is " + e);
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
        } catch (Throwable unused) {
            return bluetoothErrorCode.getId();
        }
    }

    public int stopScan(int i) {
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        try {
            boolean zCheckPermissions = false;
            if (Build.VERSION.SDK_INT >= 31) {
                zCheckPermissions = checkPermissions(PERMISSION_BLUETOOTH, PERMISSION_BLUETOOTH_SCAN);
            } else if ((checkPermissions(PERMISSION_ACCESS_COARSE_LOCATION) || checkPermissions(PERMISSION_ACCESS_FINE_LOCATION)) && checkPermissions(PERMISSION_BLUETOOTH, PERMISSION_BLUETOOTH_ADMIN)) {
                zCheckPermissions = true;
            }
            CustomBluetoothManager customBluetoothManager = btManager_;
            if (customBluetoothManager == null) {
                Log.e(LOG_TAG, "stopBLEScan failed, CustomBluetoothManager is null");
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else if (!zCheckPermissions) {
                Log.e(LOG_TAG, "Permission check failed");
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_PERMISSION_FAILED;
            } else {
                BluetoothLeScanner bluetoothLeScanner = customBluetoothManager.getBluetoothLeScanner();
                if (bluetoothLeScanner == null) {
                    Log.e(LOG_TAG, "stopBLEScan failed, BluetoothLeScanner is null");
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                } else {
                    bluetoothLeScanner.stopScan(btManager_.getScanCallback(i));
                }
            }
            return bluetoothErrorCode.getId();
        } catch (IllegalStateException e) {
            Log.e(LOG_TAG, "startScan failed, try-catch err is " + e);
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
    }

    public AdvertiseCallback createAdvertisingCallback(final int i) {
        return new AdvertiseCallback() { // from class: ohos.ace.plugin.bluetoothplugin.BluetoothPlugin.1
            @Override // android.bluetooth.le.AdvertiseCallback
            public void onStartSuccess(AdvertiseSettings advertiseSettings) {
                super.onStartSuccess(advertiseSettings);
                Intent intent = new Intent(BluetoothPlugin.BLE_ADVERTISER_RESULT);
                intent.putExtra("result", BluetoothErrorCode.BT_NO_ERROR.getId());
                intent.putExtra("advHandle", i);
                intent.putExtra("opCode", AdvOptCode.ADV_DEFAULT_CODE.ordinal());
                BluetoothPlugin.sendBleBroadcast(intent);
            }

            @Override // android.bluetooth.le.AdvertiseCallback
            public void onStartFailure(int i2) {
                super.onStartFailure(i2);
                if (BluetoothPlugin.btManager_ != null) {
                    BluetoothPlugin.btManager_.removeAdvertisingStatus(i);
                    BluetoothPlugin.btManager_.removeAdvertiseCallback(i);
                }
                Intent intent = new Intent(BluetoothPlugin.BLE_ADVERTISER_RESULT);
                intent.putExtra("result", AdvertisingStatus.ADVERTISING_STATUS_INTERNAL.ordinal());
                intent.putExtra("advHandle", i);
                intent.putExtra("opCode", AdvOptCode.ADV_FAILED_CODE.ordinal());
                BluetoothPlugin.sendBleBroadcast(intent);
            }
        };
    }

    public void sendAdvertisingBroadcast(int i) {
        Intent intent = new Intent(BLE_ADVERTISER_RESULT);
        intent.putExtra("result", AdvertisingStatus.ADVERTISING_STATUS_ALREADY_START.ordinal());
        intent.putExtra("advHandle", i);
        intent.putExtra("opCode", AdvOptCode.ADV_DEFAULT_CODE.ordinal());
        sendBleBroadcast(intent);
    }

    public boolean checkAdvertisingPermission() {
        if (Build.VERSION.SDK_INT >= 31) {
            return checkPermissions(PERMISSION_BLUETOOTH, PERMISSION_BLUETOOTH_ADVERTISE);
        }
        return checkPermissions(PERMISSION_BLUETOOTH, PERMISSION_BLUETOOTH_ADMIN);
    }

    public int startAdvertising(String str, String str2, String str3, int i, boolean z) {
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        CustomBluetoothManager customBluetoothManager = btManager_;
        try {
            if (customBluetoothManager == null) {
                Log.e(LOG_TAG, "startAdvertising failed, CustomBluetoothManager is null");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
            try {
                BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
                if (bluetoothAdapter == null) {
                    Log.e(LOG_TAG, "startAdvertising failed, The device does not support Bluetooth");
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                } else if (!bluetoothAdapter.isEnabled()) {
                    Log.e(LOG_TAG, "startAdvertising failed, User not enabled Bluetooth switch");
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
                } else if (btManager_.getAdvertisingStatus(i) != AdvertisingStatus.ADVERTISING_STATUS_NOT_START.ordinal()) {
                    sendAdvertisingBroadcast(i);
                } else {
                    BluetoothLeAdvertiser bluetoothLeAdvertiser = bluetoothAdapter.getBluetoothLeAdvertiser();
                    AdvertiseSettings bluetoothAdvertiseSettings = BluetoothHelper.getBluetoothAdvertiseSettings(str);
                    AdvertiseData bluetoothAdvertiseData = BluetoothHelper.getBluetoothAdvertiseData(str2);
                    AdvertiseData bluetoothAdvertiseData2 = BluetoothHelper.getBluetoothAdvertiseData(str3);
                    AdvertiseCallback advertiseCallbackCreateAdvertisingCallback = createAdvertisingCallback(i);
                    if (bluetoothLeAdvertiser == null || bluetoothAdvertiseSettings == null || bluetoothAdvertiseData == null || bluetoothAdvertiseData2 == null || advertiseCallbackCreateAdvertisingCallback == null) {
                        Log.e(LOG_TAG, "startAdvertising failed, Params is null");
                        bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                    } else {
                        btManager_.setAdvertisingStatus(i, AdvertisingStatus.ADVERTISING_STATUS_START.ordinal());
                        btManager_.addAdvertiseCallback(i, advertiseCallbackCreateAdvertisingCallback);
                        if (BluetoothHelper.hasScanResponseData(str3)) {
                            bluetoothLeAdvertiser.startAdvertising(bluetoothAdvertiseSettings, bluetoothAdvertiseData, bluetoothAdvertiseData2, advertiseCallbackCreateAdvertisingCallback);
                        } else {
                            bluetoothLeAdvertiser.startAdvertising(bluetoothAdvertiseSettings, bluetoothAdvertiseData, advertiseCallbackCreateAdvertisingCallback);
                        }
                    }
                }
                return bluetoothErrorCode.getId();
            } catch (IllegalArgumentException | IllegalStateException e) {
                Log.e(LOG_TAG, "startAdvertising failed, try-catch err is " + e);
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
        } catch (Throwable unused) {
            return bluetoothErrorCode.getId();
        }
    }

    public int stopAdvertising(int i) {
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "stopAdvertising failed, CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        try {
            if (!checkAdvertisingPermission()) {
                Log.e(LOG_TAG, "stopAdvertising failed, Permission check failed");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
            try {
                BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
                if (bluetoothAdapter == null) {
                    Log.e(LOG_TAG, "stopAdvertising failed, The device does not support Bluetooth");
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                } else if (!bluetoothAdapter.isEnabled()) {
                    Log.e(LOG_TAG, "startAdvertising failed, User not enabled Bluetooth switch");
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
                } else {
                    BluetoothLeAdvertiser bluetoothLeAdvertiser = bluetoothAdapter.getBluetoothLeAdvertiser();
                    AdvertiseCallback advertiseCallback = btManager_.getAdvertiseCallback(i);
                    if (bluetoothLeAdvertiser == null || advertiseCallback == null) {
                        Log.e(LOG_TAG, "startAdvertising failed, BluetoothLeAdvertiser or AdvertiseCallback is null");
                        bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                    } else {
                        bluetoothLeAdvertiser.stopAdvertising(advertiseCallback);
                        btManager_.removeAdvertiseCallback(i);
                        btManager_.removeAdvertisingStatus(i);
                    }
                }
                return bluetoothErrorCode.getId();
            } catch (IllegalArgumentException e) {
                Log.e(LOG_TAG, "stopAdvertising failed, try-catch err is " + e);
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
        } catch (Throwable unused) {
            return bluetoothErrorCode.getId();
        }
    }

    public int startPair(String str) {
        BluetoothErrorCode bluetoothErrorCode;
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH_ADMIN)) {
                Log.e(LOG_TAG, "startPair permission failedandroid.permission.BLUETOOTH_ADMIN");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "startPair permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "startPair failed, btManager_ is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode2 = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "startPair failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "startPair failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (remoteDevice == null) {
                Log.e(LOG_TAG, "startPair failed, BluetoothDevice is null");
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else {
                bluetoothErrorCode = remoteDevice.createBond() ? BluetoothErrorCode.BT_NO_ERROR : BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int getBtProfileConnState(int i, int[] iArr) {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH)) {
                Log.e(LOG_TAG, "getBtProfileConnState permission failedandroid.permission.BLUETOOTH");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "getBtProfileConnState permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getBtProfileConnState failed, btManager_ is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getBtProfileConnState failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getBtProfileConnState failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            iArr[0] = bluetoothAdapter.getProfileConnectionState(i);
        }
        return bluetoothErrorCode.getId();
    }

    public int getBtProfilesConnState(int[] iArr, int[] iArr2) {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH)) {
                Log.e(LOG_TAG, "getBtProfilesConnState permission failedandroid.permission.BLUETOOTH");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "getBtProfilesConnState permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getBtProfilesConnState failed, btManager_ is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getBtProfileConnState failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getBtProfileConnState failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            for (int i : iArr) {
                int profileConnectionState = bluetoothAdapter.getProfileConnectionState(i);
                iArr2[0] = profileConnectionState;
                if (2 == profileConnectionState) {
                    break;
                }
                iArr2[0] = 0;
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int getDeviceName(String str, String[] strArr) {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH)) {
                Log.e(LOG_TAG, "getDeviceName permission failedandroid.permission.BLUETOOTH");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "getDeviceName permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getBtProfilesConnState failed, btManager_ is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getDeviceName failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getDeviceName failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            try {
                BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
                if (remoteDevice == null) {
                    Log.e(LOG_TAG, "getDeviceName failed, BluetoothDevice is null");
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                } else {
                    String name = remoteDevice.getName();
                    strArr[0] = name;
                    if (name == null) {
                        bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                    }
                }
            } catch (IllegalArgumentException e) {
                Log.e(LOG_TAG, "getDeviceName failed, IllegalArgumentException is " + e);
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int getLocalName(String[] strArr) {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH)) {
                Log.e(LOG_TAG, "getLocalName permission failedandroid.permission.BLUETOOTH");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "getLocalName permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getLocalName failed, btManager_ is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getLocalName failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getLocalName failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            String name = bluetoothAdapter.getName();
            strArr[0] = name;
            if (name == null) {
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int getPairedDevices(String[] strArr) {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH)) {
                Log.e(LOG_TAG, "getPairedDevices permission failedandroid.permission.BLUETOOTH");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "getPairedDevices permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getPairedDevices failed, btManager_ is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getPairedDevices failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getPairedDevices failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
            if (bondedDevices == null) {
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else {
                Vector vector = new Vector();
                Iterator<BluetoothDevice> it = bondedDevices.iterator();
                while (it.hasNext()) {
                    vector.add(it.next().getAddress());
                }
                strArr[0] = BluetoothHelper.convertVectorToJString(vector);
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int getPairState(String str, int[] iArr) {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH)) {
                Log.e(LOG_TAG, "getPairState permission failedandroid.permission.BLUETOOTH");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "getPairState permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getPairState failed, btManager_ is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getPairState failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getPairState failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (remoteDevice == null) {
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else {
                iArr[0] = remoteDevice.getBondState();
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int getDeviceClass(String str, int[] iArr) {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH)) {
                Log.e(LOG_TAG, "getDeviceClass permission failedandroid.permission.BLUETOOTH");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "getDeviceClass permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getDeviceClass failed, btManager_ is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getDeviceClass failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getDeviceClass failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (remoteDevice == null) {
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else {
                BluetoothClass bluetoothClass = remoteDevice.getBluetoothClass();
                if (bluetoothClass == null) {
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                    Log.e(LOG_TAG, "BluetoothPlugin JAVA getDeviceClass is null");
                } else {
                    iArr[0] = bluetoothClass.getDeviceClass();
                }
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int getDeviceUuids(String str, String[] strArr) {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH)) {
                Log.e(LOG_TAG, "getDeviceUuids permission failedandroid.permission.BLUETOOTH");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "getDeviceUuids permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getDeviceUuids failed, btManager_ is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getDeviceUuids failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getDeviceUuids failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (remoteDevice == null) {
                Log.e(LOG_TAG, "getDeviceUuids failed, device is null");
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else {
                ParcelUuid[] uuids = remoteDevice.getUuids();
                if (uuids == null) {
                    Log.e(LOG_TAG, "getDeviceUuids failed, return uuidsArray is null");
                    bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                } else {
                    Vector vector = new Vector();
                    for (ParcelUuid parcelUuid : uuids) {
                        vector.add(parcelUuid.toString().toUpperCase());
                    }
                    strArr[0] = BluetoothHelper.convertVectorToJString(vector);
                }
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int enableBt() {
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            Log.e(LOG_TAG, "enableBt btManager_ is null!");
            return bluetoothErrorCode.getId();
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "enableBt bluetoothAdapter is null!");
            return bluetoothErrorCode.getId();
        }
        if (bluetoothAdapter.isEnabled()) {
            return BluetoothErrorCode.BT_NO_ERROR.getId();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Log.w(LOG_TAG, "enableBt on API 33+ is asynchronous, requires user confirmation.");
            return requestEnableBluetooth() ? BluetoothErrorCode.BT_NO_ERROR.getId() : bluetoothErrorCode.getId();
        }
        if (checkPermissions(PERMISSION_BLUETOOTH_ADMIN)) {
            if (Build.VERSION.SDK_INT >= 31 && !checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
                Log.e(LOG_TAG, " enableBt permission failed");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
            if (bluetoothAdapter.enable()) {
                return BluetoothErrorCode.BT_NO_ERROR.getId();
            }
            Log.e(LOG_TAG, "enableBt return false!");
            return bluetoothErrorCode.getId();
        }
        Log.e(LOG_TAG, "enableBt permission failed");
        return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
    }

    public int disableBt() {
        if (btManager_ == null) {
            Log.e(LOG_TAG, "disableBt btManager_ is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "disableBt bluetoothAdapter is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!bluetoothAdapter.isEnabled()) {
            return bluetoothErrorCode.getId();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Log.w(LOG_TAG, "disableBt on API 33+ only opens settings, state change is not guaranteed.");
            return requestDisableBluetooth() ? bluetoothErrorCode.getId() : BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (checkPermissions(PERMISSION_BLUETOOTH_ADMIN)) {
            if (Build.VERSION.SDK_INT >= 31 && !checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
                Log.e(LOG_TAG, " disableBt permission failed");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
            bluetoothAdapter.disable();
            return bluetoothErrorCode.getId();
        }
        Log.e(LOG_TAG, "disableBt permission failed");
        return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
    }

    public int getBtState(int[] iArr) {
        if (Build.VERSION.SDK_INT < 31 && !checkPermissions(PERMISSION_BLUETOOTH)) {
            Log.e(LOG_TAG, " getBtState permission failed");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getBtState btManager_ is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getBtState bluetoothAdapter is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        iArr[0] = bluetoothAdapter.getState();
        Log.i(LOG_TAG, "getBtState state: " + Integer.toString(iArr[0]));
        return bluetoothErrorCode.getId();
    }

    public boolean isBtEnable() {
        if (Build.VERSION.SDK_INT < 31 && !checkPermissions(PERMISSION_BLUETOOTH)) {
            Log.e(LOG_TAG, " isBtEnable permission failed");
            return false;
        }
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            Log.e(LOG_TAG, "isBtEnable btManager_ is null!");
            return false;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "isBtEnable bluetoothAdapter is null!");
            return false;
        }
        return bluetoothAdapter.isEnabled();
    }

    public int setLocalName(String str) {
        if (btManager_ == null) {
            Log.e(LOG_TAG, "setLocalName btManager_ is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "setLocalName bluetoothAdapter is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "setLocalName failed, User not enabled Bluetooth switch");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        if (bluetoothAdapter.setName(str)) {
            Log.i(LOG_TAG, "setLocalName setName success. name: " + str);
            return bluetoothErrorCode.getId();
        }
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
    }

    public int getBtScanMode(int[] iArr) {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH)) {
                Log.e(LOG_TAG, "getBtScanMode permission failedandroid.permission.BLUETOOTH");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_SCAN)) {
            Log.e(LOG_TAG, "getBtScanMode permission failedandroid.permission.BLUETOOTH_SCAN");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getBtScanMode btManager_ is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getBtScanMode bluetoothAdapter is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getBtScanMode getBtScanMode failed, User not enabled Bluetooth switch");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        iArr[0] = bluetoothAdapter.getScanMode();
        Log.i(LOG_TAG, "getBtScanMode scanmode: " + Integer.toString(iArr[0]));
        return bluetoothErrorCode.getId();
    }

    public int startBtDiscovery() {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH_ADMIN, PERMISSION_ACCESS_FINE_LOCATION)) {
                Log.e(LOG_TAG, "startBtDiscovery permission failedandroid.permission.BLUETOOTH_ADMIN");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_SCAN, PERMISSION_ACCESS_FINE_LOCATION)) {
            Log.e(LOG_TAG, "startBtDiscovery permission failedandroid.permission.BLUETOOTH_SCAN");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "startBtDiscovery btManager_ is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "startBtDiscovery bluetoothAdapter is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "startBtDiscovery failed, User not enabled Bluetooth switch");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        bluetoothAdapter.cancelDiscovery();
        if (bluetoothAdapter.startDiscovery()) {
            return bluetoothErrorCode.getId();
        }
        Log.e(LOG_TAG, "startBtDiscovery faild");
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
    }

    public int cancelBtDiscovery() {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH_ADMIN)) {
                Log.e(LOG_TAG, "cancelBtDiscovery permission failedandroid.permission.BLUETOOTH_ADMIN");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_SCAN)) {
            Log.e(LOG_TAG, "cancelBtDiscovery permission failedandroid.permission.BLUETOOTH_SCAN");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "cancelBtDiscovery btManager_ is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "cancelBtDiscovery bluetoothAdapter is null!");
            return bluetoothErrorCode.getId();
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "cancelBtDiscovery cancelBtDiscovery failed, User not enabled Bluetooth switch");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        if (bluetoothAdapter.cancelDiscovery()) {
            return BluetoothErrorCode.BT_NO_ERROR.getId();
        }
        Log.e(LOG_TAG, "cancelBtDiscovery faild");
        return bluetoothErrorCode.getId();
    }

    public int isBtDiscovering(boolean[] zArr) {
        if (Build.VERSION.SDK_INT < 31) {
            if (!checkPermissions(PERMISSION_BLUETOOTH_ADMIN)) {
                Log.e(LOG_TAG, "isBtDiscovering permission failedandroid.permission.BLUETOOTH_ADMIN");
                return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
            }
        } else if (!checkPermissions(PERMISSION_BLUETOOTH_SCAN)) {
            Log.e(LOG_TAG, "isBtDiscovering permission failedandroid.permission.BLUETOOTH_SCAN");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        if (btManager_ == null) {
            Log.e(LOG_TAG, "isBtDiscovering btManager_ is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "isBtDiscovering bluetoothAdapter is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "isBtDiscovering failed, User not enabled Bluetooth switch");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        zArr[0] = bluetoothAdapter.isDiscovering();
        return bluetoothErrorCode.getId();
    }

    public void registerBluetoothReceiver(Context context) {
        if (this.btBroadcastReceive_ == null) {
            this.btBroadcastReceive_ = new BluetoothBroadcastReceive();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_OFF");
        intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_ON");
        intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_TURNING_OFF");
        intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_TURNING_ON");
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction(BLE_CLIENT_SERVICES_DISCOVERED);
        intentFilter.addAction(BLE_CLIENT_CONNECTION_STATE_CHANGE);
        intentFilter.addAction(BLE_CLIENT_READ_CHARACTERISTIC);
        intentFilter.addAction(BLE_CLIENT_WRITE_CHARACTERISTIC);
        intentFilter.addAction(BLE_CLIENT_CHARACTERISTIC_CHANGED);
        intentFilter.addAction(BLE_CLIENT_READ_DESCRIPTOR);
        intentFilter.addAction(BLE_CLIENT_WRITE_DESCRIPTOR);
        intentFilter.addAction(BLE_CLIENT_SET_MTU);
        intentFilter.addAction(BLE_SERVER_MTU_CHANGE);
        intentFilter.addAction(BLE_SERVER_CONNECTION_STATE_CHANGE);
        intentFilter.addAction(BLE_SERVER_READ_CHARACTERISTIC);
        intentFilter.addAction(BLE_SERVER_WRITE_CHARACTERISTIC);
        intentFilter.addAction(BLE_SERVER_READ_DESCRIPTOR);
        intentFilter.addAction(BLE_SERVER_WRITE_DESCRIPTOR);
        intentFilter.addAction(BLE_SERVER_NOTIFICATION_SENT);
        intentFilter.addAction(BLE_ADVERTISER_RESULT);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this.btBroadcastReceive_, intentFilter, 2);
        } else {
            context.registerReceiver(this.btBroadcastReceive_, intentFilter);
        }
    }

    public void unregisterBluetoothReceiver(Context context) {
        BluetoothBroadcastReceive bluetoothBroadcastReceive = this.btBroadcastReceive_;
        if (bluetoothBroadcastReceive != null) {
            context.unregisterReceiver(bluetoothBroadcastReceive);
            this.btBroadcastReceive_ = null;
        }
    }

    public static void sendBleBroadcast(Intent intent) {
        Log.i(LOG_TAG, "sendBleBroadcast enter.");
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            Log.e(LOG_TAG, "sendBleBroadcast btManager_ is null!");
            return;
        }
        Context context = customBluetoothManager.getContext();
        if (context != null) {
            context.sendBroadcast(intent);
        } else {
            Log.e(LOG_TAG, "sendBleBroadcast failed. context is null");
        }
    }

    public void registerBluetoothServiceListener(Context context) {
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            Log.e(LOG_TAG, "registerBluetoothServiceListener btManager_ is null!");
            return;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "registerBluetoothServiceListener bluetoothAdapter is null!");
            return;
        }
        this.btServiceListener_ = new BluetoothProfile.ServiceListener() { // from class: ohos.ace.plugin.bluetoothplugin.BluetoothPlugin.2
            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                if (i == 2) {
                    synchronized (BluetoothPlugin.Profile_Lock) {
                        BluetoothA2dp unused = BluetoothPlugin.bluetoothA2dp_ = (BluetoothA2dp) bluetoothProfile;
                    }
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceDisconnected(int i) {
                if (i == 2) {
                    synchronized (BluetoothPlugin.Profile_Lock) {
                        BluetoothA2dp unused = BluetoothPlugin.bluetoothA2dp_ = null;
                    }
                }
            }
        };
        if (!checkPermissions(PERMISSION_BLUETOOTH)) {
            this.btServiceListener_ = null;
            Log.e(LOG_TAG, "registerBluetoothServiceListener Permission check failed");
        } else {
            if (bluetoothAdapter.getProfileProxy(context, this.btServiceListener_, 2)) {
                return;
            }
            Log.e(LOG_TAG, "registerBluetoothServiceListener getProfileProxy error!");
            this.btServiceListener_ = null;
        }
    }

    public void unregisterBluetoothServiceListener(Context context) {
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            Log.e(LOG_TAG, "unregisterBluetoothServiceListener btManager_ is null!");
            return;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "unregisterBluetoothServiceListener bluetoothAdapter is null!");
            return;
        }
        synchronized (Profile_Lock) {
            BluetoothA2dp bluetoothA2dp = bluetoothA2dp_;
            if (bluetoothA2dp != null) {
                bluetoothAdapter.closeProfileProxy(2, bluetoothA2dp);
            }
            bluetoothA2dp_ = null;
        }
    }

    private BluetoothErrorCode getA2dpConnectionState(BluetoothDevice bluetoothDevice, int[] iArr) {
        if (Build.VERSION.SDK_INT >= 31 && !checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "getA2dpConnectionState permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED;
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        synchronized (Profile_Lock) {
            BluetoothA2dp bluetoothA2dp = bluetoothA2dp_;
            if (bluetoothA2dp != null) {
                iArr[0] = bluetoothA2dp.getConnectionState(bluetoothDevice);
            } else {
                Log.e(LOG_TAG, "getA2dpConnectionState bluetoothA2dp_ is null!");
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            }
        }
        return bluetoothErrorCode;
    }

    private BluetoothErrorCode getA2dpConnectedDevices(BluetoothAdapter bluetoothAdapter, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 31 && !checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "getA2dpConnectedDevices permission failedandroid.permission.BLUETOOTH_CONNECT");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED;
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        Vector vector = new Vector();
        synchronized (Profile_Lock) {
            BluetoothA2dp bluetoothA2dp = bluetoothA2dp_;
            if (bluetoothA2dp != null) {
                Iterator<BluetoothDevice> it = bluetoothA2dp.getConnectedDevices().iterator();
                while (it.hasNext()) {
                    vector.add(it.next().getAddress());
                }
                strArr[0] = BluetoothHelper.convertVectorToJString(vector);
            } else {
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            }
        }
        return bluetoothErrorCode;
    }

    public int getConnectionState(String str, int[] iArr) {
        BluetoothErrorCode a2dpConnectionState;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getConnectionState btManager_ is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "getConnectionState failed, The device does not support Bluetooth");
            a2dpConnectionState = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getConnectionState failed, User not enabled Bluetooth switch");
            a2dpConnectionState = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (remoteDevice == null) {
                Log.e(LOG_TAG, "getConnectionState failed, device is null");
                a2dpConnectionState = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else {
                a2dpConnectionState = getA2dpConnectionState(remoteDevice, iArr);
            }
        }
        return a2dpConnectionState.getId();
    }

    public int getDevicesByStates(String[] strArr) {
        BluetoothErrorCode a2dpConnectedDevices;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "getDevicesByStates btManager_ is null!");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null || this.btServiceListener_ == null) {
            Log.e(LOG_TAG, "getDevicesByStates failed, The device does not support Bluetooth");
            a2dpConnectedDevices = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "getDevicesByStates failed, User not enabled Bluetooth switch");
            a2dpConnectedDevices = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            a2dpConnectedDevices = getA2dpConnectedDevices(bluetoothAdapter, strArr);
        }
        return a2dpConnectedDevices.getId();
    }

    public int registerApplicationGattServer(int i) {
        BluetoothErrorCode.BT_NO_ERROR.getId();
        if (btManager_ == null) {
            Log.e(LOG_TAG, "CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!checkGattServerPermission()) {
            Log.e(LOG_TAG, "Permission check failed");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "registerApplicationGattServer failed, The device does not support Bluetooth");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "registerApplicationGattServer failed, User not enabled Bluetooth switch");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        return btManager_.registerBluetoothGattServer(i, this.mContext_);
    }

    public int addService(int i, int i2, String str) {
        BluetoothErrorCode bluetoothErrorCode;
        BluetoothErrorCode bluetoothErrorCode2 = BluetoothErrorCode.BT_NO_ERROR;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "addService failed, CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!checkGattServerPermission()) {
            Log.e(LOG_TAG, "Permission check failed");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "addService failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "addService failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            CustomGattServer customGattServer = btManager_.getCustomGattServer(i);
            if (customGattServer == null || BluetoothHelper.addServiceToCustomGattServer(str, customGattServer) != BluetoothErrorCode.BT_NO_ERROR.getId()) {
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
            BluetoothGattServer bluetoothGattServer = customGattServer.getBluetoothGattServer();
            BluetoothGattService bluetoothGattService = customGattServer.getBluetoothGattService(i2);
            if (bluetoothGattService == null || bluetoothGattServer == null) {
                Log.e(LOG_TAG, "addService failed, BluetoothGattServer or BluetoothGattService is null");
                customGattServer.removeBluetoothGattService(i2);
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else {
                boolean zAddService = bluetoothGattServer.addService(bluetoothGattService);
                if (!zAddService) {
                    customGattServer.removeBluetoothGattService(i2);
                }
                bluetoothErrorCode = zAddService ? BluetoothErrorCode.BT_NO_ERROR : BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int removeService(int i, int i2) {
        BluetoothErrorCode bluetoothErrorCode;
        BluetoothErrorCode bluetoothErrorCode2 = BluetoothErrorCode.BT_NO_ERROR;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!checkGattServerPermission()) {
            Log.e(LOG_TAG, "Permission check failed");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "removeService failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "removeService failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            BluetoothGattService bluetoothGattService = btManager_.getBluetoothGattService(i, i2);
            BluetoothGattServer gattServer = btManager_.getGattServer(i);
            if (bluetoothGattService == null || gattServer == null) {
                Log.e(LOG_TAG, "removeService failed, BluetoothGattServer or BluetoothGattService is null");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
            boolean zRemoveService = gattServer.removeService(bluetoothGattService);
            if (zRemoveService) {
                btManager_.removeBluetoothGattService(i, i2);
            }
            bluetoothErrorCode = zRemoveService ? BluetoothErrorCode.BT_NO_ERROR : BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        }
        return bluetoothErrorCode.getId();
    }

    public int gattServerClose(int i) {
        BluetoothErrorCode bluetoothErrorCode;
        BluetoothErrorCode bluetoothErrorCode2 = BluetoothErrorCode.BT_NO_ERROR;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "gattServerClose failed, CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!checkGattServerPermission()) {
            Log.e(LOG_TAG, "Permission check failed");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "gattServerClose failed, The device does not support Bluetooth");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "gattServerClose failed, User not enabled Bluetooth switch");
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            BluetoothGattServer gattServer = btManager_.getGattServer(i);
            if (gattServer == null) {
                Log.e(LOG_TAG, "gattServerClose failed, BluetoothGattServer is null");
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else {
                gattServer.close();
                btManager_.gattServerClose(i);
                bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int respondCharacteristicRead(String str, String str2, int i, int i2, int i3) {
        BluetoothErrorCode bluetoothErrorCode;
        Log.i(LOG_TAG, "AppId is " + i);
        BluetoothErrorCode bluetoothErrorCode2 = BluetoothErrorCode.BT_NO_ERROR;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!checkGattServerPermission()) {
            Log.e(LOG_TAG, "Permission check failed");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            CustomGattServer customGattServer = btManager_.getCustomGattServer(i);
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (customGattServer != null && remoteDevice != null) {
                BluetoothGattServer bluetoothGattServer = customGattServer.getBluetoothGattServer();
                if (bluetoothGattServer != null) {
                    bluetoothGattServer.sendResponse(remoteDevice, customGattServer.getRequestId(), i2, 0, str2.getBytes());
                } else {
                    bluetoothErrorCode2 = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                }
                bluetoothErrorCode = bluetoothErrorCode2;
            } else {
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int respondCharacteristicWrite(String str, int i, int i2, int i3) {
        BluetoothErrorCode bluetoothErrorCode;
        Log.i(LOG_TAG, "AppId is " + i);
        BluetoothErrorCode bluetoothErrorCode2 = BluetoothErrorCode.BT_NO_ERROR;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!checkGattServerPermission()) {
            Log.e(LOG_TAG, "Permission check failed");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            CustomGattServer customGattServer = btManager_.getCustomGattServer(i);
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (customGattServer != null && remoteDevice != null) {
                BluetoothGattServer bluetoothGattServer = customGattServer.getBluetoothGattServer();
                BluetoothGattCharacteristic bluetoothGattCharacter = customGattServer.getBluetoothGattCharacter(i3);
                if (bluetoothGattServer != null && bluetoothGattCharacter != null) {
                    bluetoothGattServer.sendResponse(remoteDevice, customGattServer.getRequestId(), i2, 0, bluetoothGattCharacter.getValue());
                } else {
                    bluetoothErrorCode2 = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                }
                bluetoothErrorCode = bluetoothErrorCode2;
            } else {
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int respondDescriptorRead(String str, String str2, int i, int i2, int i3) {
        BluetoothErrorCode bluetoothErrorCode;
        Log.i(LOG_TAG, "AppId is " + i);
        BluetoothErrorCode bluetoothErrorCode2 = BluetoothErrorCode.BT_NO_ERROR;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!checkGattServerPermission()) {
            Log.e(LOG_TAG, "Permission check failed");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            CustomGattServer customGattServer = btManager_.getCustomGattServer(i);
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (customGattServer != null && remoteDevice != null) {
                BluetoothGattServer bluetoothGattServer = customGattServer.getBluetoothGattServer();
                if (bluetoothGattServer != null) {
                    bluetoothGattServer.sendResponse(remoteDevice, customGattServer.getRequestId(), i2, 0, str2.getBytes());
                } else {
                    bluetoothErrorCode2 = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                }
                bluetoothErrorCode = bluetoothErrorCode2;
            } else {
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int respondDescriptorWrite(String str, int i, int i2, int i3) {
        BluetoothErrorCode bluetoothErrorCode;
        Log.i(LOG_TAG, "AppId is " + i);
        BluetoothErrorCode bluetoothErrorCode2 = BluetoothErrorCode.BT_NO_ERROR;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!checkGattServerPermission()) {
            Log.e(LOG_TAG, "Permission check failed");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } else if (!bluetoothAdapter.isEnabled()) {
            bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INVALID_STATE;
        } else {
            CustomGattServer customGattServer = btManager_.getCustomGattServer(i);
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (customGattServer != null && remoteDevice != null) {
                BluetoothGattServer bluetoothGattServer = customGattServer.getBluetoothGattServer();
                BluetoothGattDescriptor bluetoothGattDescriptor = customGattServer.getBluetoothGattDescriptor(i3);
                if (bluetoothGattServer != null && bluetoothGattDescriptor != null) {
                    bluetoothGattServer.sendResponse(remoteDevice, customGattServer.getRequestId(), i2, 0, bluetoothGattDescriptor.getValue());
                } else {
                    bluetoothErrorCode2 = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                }
                bluetoothErrorCode = bluetoothErrorCode2;
            } else {
                bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            }
        }
        return bluetoothErrorCode.getId();
    }

    public int notifyCharacteristicChanged(int i, int i2, String str, String str2, boolean z) {
        BluetoothErrorCode bluetoothErrorCodeNotifyCharacteristicChangedBeforeApi33;
        Log.i(LOG_TAG, "AppId is " + i);
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_NO_ERROR;
        if (btManager_ == null) {
            Log.e(LOG_TAG, "notifyCharacteristicChanged failed, CustomBluetoothManager is null");
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        if (!checkGattServerPermission()) {
            Log.e(LOG_TAG, "Permission check failed");
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        try {
            BluetoothAdapter bluetoothAdapter = btManager_.getBluetoothAdapter();
            if (bluetoothAdapter == null) {
                Log.e(LOG_TAG, "notifyCharacteristicChanged failed, The device does not support Bluetooth");
                bluetoothErrorCodeNotifyCharacteristicChangedBeforeApi33 = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
            } else if (!bluetoothAdapter.isEnabled()) {
                Log.e(LOG_TAG, "notifyCharacteristicChanged failed, User not enabled Bluetooth switch");
                bluetoothErrorCodeNotifyCharacteristicChangedBeforeApi33 = BluetoothErrorCode.BT_ERR_INVALID_STATE;
            } else {
                BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
                BluetoothGattServer gattServer = btManager_.getGattServer(i);
                BluetoothGattCharacteristic bluetoothGattCharacteristic = btManager_.getBluetoothGattCharacteristic(i, i2);
                byte[] characteristicValue = BluetoothHelper.getCharacteristicValue(str2);
                if (remoteDevice == null || gattServer == null) {
                    bluetoothErrorCodeNotifyCharacteristicChangedBeforeApi33 = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
                } else if (bluetoothGattCharacteristic == null || characteristicValue == null) {
                    bluetoothErrorCodeNotifyCharacteristicChangedBeforeApi33 = BluetoothErrorCode.BT_ERR_INVALID_PARAM;
                } else if (Build.VERSION.SDK_INT >= 33) {
                    bluetoothErrorCodeNotifyCharacteristicChangedBeforeApi33 = notifyCharacteristicChangedByApi33(gattServer, remoteDevice, bluetoothGattCharacteristic, z, characteristicValue);
                } else {
                    bluetoothErrorCodeNotifyCharacteristicChangedBeforeApi33 = notifyCharacteristicChangedBeforeApi33(gattServer, remoteDevice, bluetoothGattCharacteristic, z, characteristicValue);
                }
            }
        } catch (IllegalArgumentException e) {
            Log.e(LOG_TAG, "respondDescriptorWrite failed, try-catch err is " + e);
            bluetoothErrorCodeNotifyCharacteristicChangedBeforeApi33 = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        }
        return bluetoothErrorCodeNotifyCharacteristicChangedBeforeApi33.getId();
    }

    private BluetoothErrorCode notifyCharacteristicChangedByApi33(BluetoothGattServer bluetoothGattServer, BluetoothDevice bluetoothDevice, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, byte[] bArr) {
        try {
            int iIntValue = ((Integer) BluetoothGattServer.class.getMethod("notifyCharacteristicChanged", BluetoothDevice.class, BluetoothGattCharacteristic.class, Boolean.TYPE, byte[].class).invoke(bluetoothGattServer, bluetoothDevice, bluetoothGattCharacteristic, Boolean.valueOf(z), bArr)).intValue();
            if (iIntValue == 0) {
                return BluetoothErrorCode.BT_NO_ERROR;
            }
            Log.e(LOG_TAG, "notifyCharacteristicChanged failed, status: " + iIntValue);
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        } catch (IllegalAccessException unused) {
            Log.e(LOG_TAG, "notifyCharacteristicChanged failed, IllegalAccessException.");
        } catch (NoSuchMethodException unused2) {
            Log.e(LOG_TAG, "notifyCharacteristicChanged failed, NoSuchMethodException.");
        } catch (InvocationTargetException unused3) {
            Log.e(LOG_TAG, "notifyCharacteristicChanged failed, InvocationTargetException.");
        }
    }

    private BluetoothErrorCode notifyCharacteristicChangedBeforeApi33(BluetoothGattServer bluetoothGattServer, BluetoothDevice bluetoothDevice, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, byte[] bArr) {
        if (bluetoothGattCharacteristic.setValue(bArr)) {
            return bluetoothGattServer.notifyCharacteristicChanged(bluetoothDevice, bluetoothGattCharacteristic, z) ? BluetoothErrorCode.BT_NO_ERROR : BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        }
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
    }

    public int gattClientConnect(int i, String str, boolean z) {
        if (!checkGattClientPermission()) {
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            return id;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "gattClientConnect failed, The device does not support Bluetooth");
            return id;
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "gattClientConnect failed, User not enabled Bluetooth switch");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        BluetoothDevice bluetoothDeviceFindBluetoothDevice = btManager_.findBluetoothDevice(str);
        if (bluetoothDeviceFindBluetoothDevice == null) {
            Log.d(LOG_TAG, "It simply creates a BluetoothDevice object based on the MAC address");
            bluetoothDeviceFindBluetoothDevice = bluetoothAdapter.getRemoteDevice(str);
            if (bluetoothDeviceFindBluetoothDevice == null) {
                Log.e(LOG_TAG, "gattClientConnect failed, Device not found");
                return id;
            }
        }
        BluetoothGattClient bluetoothGattClientFindBluetoothGattClient = btManager_.findBluetoothGattClient(i);
        if (bluetoothGattClientFindBluetoothGattClient == null) {
            BluetoothGattClient bluetoothGattClient = new BluetoothGattClient(i);
            if (btManager_.addBluetoothGattClient(i, bluetoothGattClient)) {
                return bluetoothGattClient.connect(this.mContext_, bluetoothDeviceFindBluetoothDevice);
            }
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        return bluetoothGattClientFindBluetoothGattClient.connect(this.mContext_, bluetoothDeviceFindBluetoothDevice);
    }

    public int gattClientDisconnect(int i) {
        if (!checkGattClientPermission()) {
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            return id;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "gattClientDisconnect failed, The device does not support Bluetooth");
            return id;
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "gattClientDisconnect failed, User not enabled Bluetooth switch");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        BluetoothGattClient bluetoothGattClientFindBluetoothGattClient = btManager_.findBluetoothGattClient(i);
        if (bluetoothGattClientFindBluetoothGattClient == null) {
            Log.e(LOG_TAG, "gattClientDisconnect failed, BluetoothGattClient not found");
            return id;
        }
        return bluetoothGattClientFindBluetoothGattClient.disconnect();
    }

    public int gattClientRequestExchangeMtu(int i, int i2) {
        Log.i(LOG_TAG, "gattClientRequestExchangeMtu enter, mtu: " + String.valueOf(i2));
        if (!checkGattClientPermission()) {
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            return id;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "gattClientRequestExchangeMtu failed, The device does not support Bluetooth.");
            return id;
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "gattClientRequestExchangeMtu failed, User not enabled Bluetooth switch.");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        BluetoothGattClient bluetoothGattClientFindBluetoothGattClient = btManager_.findBluetoothGattClient(i);
        if (bluetoothGattClientFindBluetoothGattClient != null) {
            return bluetoothGattClientFindBluetoothGattClient.requestExchangeMtu(i2);
        }
        Log.e(LOG_TAG, "gattClientRequestExchangeMtu failed, BluetoothGattClient not found.");
        return id;
    }

    public int gattClientClose(int i) {
        if (!checkGattClientPermission()) {
            return BluetoothErrorCode.BT_ERR_PERMISSION_FAILED.getId();
        }
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            return id;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "gattClientClose failed, The device does not support Bluetooth");
            return id;
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "gattClientClose failed, User not enabled Bluetooth switch");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        BluetoothGattClient bluetoothGattClientFindBluetoothGattClient = btManager_.findBluetoothGattClient(i);
        if (bluetoothGattClientFindBluetoothGattClient == null) {
            Log.e(LOG_TAG, "gattClientClose failed, BluetoothGattClient not found");
            return id;
        }
        int iClose = bluetoothGattClientFindBluetoothGattClient.close();
        if (iClose == BluetoothErrorCode.BT_NO_ERROR.getId()) {
            btManager_.deleteBluetoothGattClient(i);
        }
        return iClose;
    }

    public int clientDiscoverServices(int i) {
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
        BluetoothGattClient bluetoothGattClientFindBluetoothGattClient = customBluetoothManager.findBluetoothGattClient(i);
        if (bluetoothGattClientFindBluetoothGattClient != null) {
            return bluetoothGattClientFindBluetoothGattClient.discoverServices();
        }
        Log.e(LOG_TAG, "clientDiscoverServices failed, BluetoothGattClient not found.");
        return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
    }

    public int clientReadCharacter(int i, String str, String str2) {
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            return id;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "clientReadDescriptor failed, The device does not support Bluetooth.");
            return id;
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "clientReadDescriptor failed, User not enabled Bluetooth switch.");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        BluetoothGattClient bluetoothGattClientFindBluetoothGattClient = btManager_.findBluetoothGattClient(i);
        if (bluetoothGattClientFindBluetoothGattClient == null) {
            Log.e(LOG_TAG, "clientReadCharacter failed, BluetoothGattClient not found.");
            return id;
        }
        return bluetoothGattClientFindBluetoothGattClient.readCharacter(str, str2);
    }

    public int clientRequestNotification(int i, String str, String str2, boolean z) {
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            return id;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "clientRequestNotification failed, The device does not support Bluetooth.");
            return id;
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "clientRequestNotification failed, User not enabled Bluetooth switch.");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        BluetoothGattClient bluetoothGattClientFindBluetoothGattClient = btManager_.findBluetoothGattClient(i);
        if (bluetoothGattClientFindBluetoothGattClient == null) {
            Log.e(LOG_TAG, "clientRequestNotification failed, BluetoothGattClient not found.");
            return id;
        }
        return bluetoothGattClientFindBluetoothGattClient.requestNotification(str, str2, z);
    }

    public int clientWriteCharacter(int i, String str, String str2, byte[] bArr, int i2) {
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            return id;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "clientReadDescriptor failed, The device does not support Bluetooth.");
            return id;
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "clientReadDescriptor failed, User not enabled Bluetooth switch.");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        BluetoothGattClient bluetoothGattClientFindBluetoothGattClient = btManager_.findBluetoothGattClient(i);
        if (bluetoothGattClientFindBluetoothGattClient == null) {
            Log.e(LOG_TAG, "clientWriteCharacter failed, BluetoothGattClient not found.");
            return id;
        }
        return bluetoothGattClientFindBluetoothGattClient.writeCharacter(str, str2, bArr, i2);
    }

    public int clientReadDescriptor(int i, String str, String str2, String str3) {
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            return id;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "clientReadDescriptor failed, The device does not support Bluetooth.");
            return id;
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "clientReadDescriptor failed, User not enabled Bluetooth switch.");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        BluetoothGattClient bluetoothGattClientFindBluetoothGattClient = btManager_.findBluetoothGattClient(i);
        if (bluetoothGattClientFindBluetoothGattClient == null) {
            Log.e(LOG_TAG, "clientReadDescriptor failed, BluetoothGattClient not found.");
            return id;
        }
        return bluetoothGattClientFindBluetoothGattClient.readDescriptor(str, str2, str3);
    }

    public int clientWriteDescriptor(int i, String str, String str2, String str3, byte[] bArr) {
        int id = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        CustomBluetoothManager customBluetoothManager = btManager_;
        if (customBluetoothManager == null) {
            return id;
        }
        BluetoothAdapter bluetoothAdapter = customBluetoothManager.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            Log.e(LOG_TAG, "clientReadDescriptor failed, The device does not support Bluetooth.");
            return id;
        }
        if (!bluetoothAdapter.isEnabled()) {
            Log.e(LOG_TAG, "clientReadDescriptor failed, User not enabled Bluetooth switch.");
            return BluetoothErrorCode.BT_ERR_INVALID_STATE.getId();
        }
        BluetoothGattClient bluetoothGattClientFindBluetoothGattClient = btManager_.findBluetoothGattClient(i);
        if (bluetoothGattClientFindBluetoothGattClient == null) {
            Log.e(LOG_TAG, "clientReadDescriptor failed, BluetoothGattClient not found.");
            return id;
        }
        return bluetoothGattClientFindBluetoothGattClient.writeDescriptor(str, str2, str3, bArr);
    }

    public void serverMtuChanged(Intent intent) {
        if (intent == null) {
            Log.e(LOG_TAG, "Intent is null");
        } else {
            nativeServerOnMtuChangedCallback(intent.getStringExtra("device"), intent.getIntExtra("mtu", 0), intent.getIntExtra("applicationId", 0));
        }
    }

    public void serverConnectionStateChange(Intent intent) {
        if (intent == null) {
            Log.e(LOG_TAG, "Intent is null");
        } else {
            nativeServerOnConnectionStateChangeCallback(intent.getStringExtra("device"), intent.getIntExtra("state", 0), intent.getIntExtra("applicationId", 0));
        }
    }

    public void serverCharacteristicRead(Intent intent) {
        if (intent == null) {
            Log.e(LOG_TAG, "Intent is null");
        } else {
            nativeServerOnCharacteristicReadRequestCallback(intent.getStringExtra("device"), intent.getStringExtra("characteristic"), intent.getIntExtra("applicationId", 0));
        }
    }

    public void serverCharacteristicWrite(Intent intent) {
        if (intent == null) {
            Log.e(LOG_TAG, "Intent is null");
        } else {
            nativeServerOnCharacteristicWriteRequestCallback(intent.getStringExtra("device"), intent.getStringExtra("characteristic"), intent.getIntExtra("responseNeeded", 0) == 1, intent.getIntExtra("applicationId", 0));
        }
    }

    public void serverDescriptorRead(Intent intent) {
        if (intent == null) {
            Log.e(LOG_TAG, "Intent is null");
        } else {
            nativeServerOnDescriptorReadRequestCallback(intent.getStringExtra("device"), intent.getStringExtra("descriptor"), intent.getIntExtra("applicationId", 0));
        }
    }

    public void serverDescriptorWrite(Intent intent) {
        if (intent == null) {
            Log.e(LOG_TAG, "Intent is null");
        } else {
            nativeServerOnDescriptorWriteRequestCallback(intent.getStringExtra("device"), intent.getStringExtra("descriptor"), intent.getIntExtra("applicationId", 0));
        }
    }

    public void serverNotificationSent(Intent intent) {
        if (intent == null) {
            Log.e(LOG_TAG, "argument is null");
        } else {
            nativeServerOnNotificationSentCallback(intent.getStringExtra("device"), intent.getIntExtra("status", 0), intent.getIntExtra("applicationId", 0));
        }
    }

    public void actionBluetoothStateChange(Intent intent) {
        onChangeStateCallBack(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0));
    }

    public void actionBondStateChange(Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        String address = bluetoothDevice.getAddress();
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.TRANSPORT", 0);
        int bondState = bluetoothDevice.getBondState();
        BluetoothErrorCode bluetoothErrorCode = BluetoothErrorCode.BT_ERR_INTERNAL_ERROR;
        onPairStatusChangedCallBack(intExtra, address, bondState, 0);
    }

    public void actionFondChange(Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        onDiscoveryResultCallBack(bluetoothDevice.getAddress(), intent.getIntExtra("android.bluetooth.device.extra.RSSI", 0), bluetoothDevice.getName(), bluetoothDevice.getBluetoothClass().getDeviceClass());
    }

    public void actionConnectionStateChange(Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        OnConnectionStateChanged(bluetoothDevice.getAddress(), intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0), 0);
    }

    public void actionBleClientServiceDiscovered(Intent intent) {
        int intExtra = intent.getIntExtra("appId", 0);
        String stringExtra = intent.getStringExtra("serviceJSONString");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("characterStrings");
        nativeGattClientSetServices(intExtra, stringExtra, (String[]) stringArrayListExtra.toArray(new String[0]), (HashMap) intent.getSerializableExtra("clientCharacteristicMap"));
    }

    public void actionBleClientConnectionStateChange(Intent intent) {
        nativeOnConnectionStateChanged(intent.getIntExtra("appId", 0), intent.getIntExtra("status", 0), intent.getIntExtra("newState", 0));
    }

    public void actionBleClientReadCharacteristic(Intent intent) {
        nativeOnCharacteristicRead(intent.getIntExtra("appId", 0), intent.getStringExtra("result"), intent.getIntExtra("status", 0));
    }

    public void actionBleClientWriteCharacteristic(Intent intent) {
        nativeOnCharacteristicWrite(intent.getIntExtra("appId", 0), intent.getStringExtra("result"), intent.getIntExtra("status", 0));
    }

    public void actionBleClientCharacteristicChanged(Intent intent) {
        nativeOnCharacteristicChanged(intent.getIntExtra("appId", 0), intent.getStringExtra("result"));
    }

    public void actionBleClientReadDescriptor(Intent intent) {
        nativeOnDescriptorRead(intent.getIntExtra("appId", 0), intent.getStringExtra("result"), intent.getIntExtra("status", 0));
    }

    public void actionBleClientWriteDescriptor(Intent intent) {
        nativeOnDescriptorWrite(intent.getIntExtra("appId", 0), intent.getStringExtra("result"), intent.getIntExtra("status", 0));
    }

    public void actionBleClientSetMtu(Intent intent) {
        nativeOnMtuChanged(intent.getIntExtra("appId", 0), intent.getIntExtra("mtu", 23), intent.getIntExtra("appId", 0));
    }

    public void actionBleAdvertiserResult(Intent intent) {
        nativeOnStartAdvertisingResult(intent.getIntExtra("result", 0), intent.getIntExtra("advHandle", 0), intent.getIntExtra("opCode", 0));
    }

    class BluetoothBroadcastReceive extends BroadcastReceiver {
        BluetoothBroadcastReceive() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                BluetoothPlugin.this.actionBluetoothStateChange(intent);
                return;
            }
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
                BluetoothPlugin.this.actionBondStateChange(intent);
                return;
            }
            if ("android.bluetooth.device.action.FOUND".equals(action)) {
                BluetoothPlugin.this.actionFondChange(intent);
                return;
            }
            if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                BluetoothPlugin.this.actionConnectionStateChange(intent);
                return;
            }
            if (BluetoothPlugin.BLE_CLIENT_SERVICES_DISCOVERED.equals(action)) {
                BluetoothPlugin.this.actionBleClientServiceDiscovered(intent);
                return;
            }
            if (BluetoothPlugin.BLE_CLIENT_CONNECTION_STATE_CHANGE.equals(action)) {
                BluetoothPlugin.this.actionBleClientConnectionStateChange(intent);
                return;
            }
            if (BluetoothPlugin.BLE_CLIENT_READ_CHARACTERISTIC.equals(action)) {
                BluetoothPlugin.this.actionBleClientReadCharacteristic(intent);
                return;
            }
            if (BluetoothPlugin.BLE_CLIENT_WRITE_CHARACTERISTIC.equals(action)) {
                BluetoothPlugin.this.actionBleClientWriteCharacteristic(intent);
                return;
            }
            if (BluetoothPlugin.BLE_CLIENT_CHARACTERISTIC_CHANGED.equals(action)) {
                BluetoothPlugin.this.actionBleClientCharacteristicChanged(intent);
                return;
            }
            if (BluetoothPlugin.BLE_CLIENT_READ_DESCRIPTOR.equals(action)) {
                BluetoothPlugin.this.actionBleClientReadDescriptor(intent);
                return;
            }
            if (BluetoothPlugin.BLE_CLIENT_WRITE_DESCRIPTOR.equals(action)) {
                BluetoothPlugin.this.actionBleClientWriteDescriptor(intent);
                return;
            }
            if (BluetoothPlugin.BLE_CLIENT_SET_MTU.equals(action)) {
                BluetoothPlugin.this.actionBleClientSetMtu(intent);
                return;
            }
            if (BluetoothPlugin.BLE_SERVER_MTU_CHANGE.equals(action)) {
                BluetoothPlugin.this.serverMtuChanged(intent);
                return;
            }
            if (BluetoothPlugin.BLE_SERVER_CONNECTION_STATE_CHANGE.equals(action)) {
                BluetoothPlugin.this.serverConnectionStateChange(intent);
                return;
            }
            if (BluetoothPlugin.BLE_SERVER_READ_CHARACTERISTIC.equals(action)) {
                BluetoothPlugin.this.serverCharacteristicRead(intent);
                return;
            }
            if (BluetoothPlugin.BLE_SERVER_WRITE_CHARACTERISTIC.equals(action)) {
                BluetoothPlugin.this.serverCharacteristicWrite(intent);
                return;
            }
            if (BluetoothPlugin.BLE_SERVER_READ_DESCRIPTOR.equals(action)) {
                BluetoothPlugin.this.serverDescriptorRead(intent);
                return;
            }
            if (BluetoothPlugin.BLE_SERVER_WRITE_DESCRIPTOR.equals(action)) {
                BluetoothPlugin.this.serverDescriptorWrite(intent);
            } else if (BluetoothPlugin.BLE_SERVER_NOTIFICATION_SENT.equals(action)) {
                BluetoothPlugin.this.serverNotificationSent(intent);
            } else if (BluetoothPlugin.BLE_ADVERTISER_RESULT.equals(action)) {
                BluetoothPlugin.this.actionBleAdvertiserResult(intent);
            }
        }
    }

    private boolean requestEnableBluetooth() {
        if (this.mContext_ == null) {
            Log.e(LOG_TAG, "context is null");
            return false;
        }
        if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "Permission check failed for BLUETOOTH_CONNECT");
            return false;
        }
        Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
        try {
            intent.addFlags(268435456);
            this.mContext_.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e(LOG_TAG, "Requesting to enable Bluetooth failed: Activity not found", e);
            return false;
        } catch (SecurityException e2) {
            Log.e(LOG_TAG, "Requesting to enable Bluetooth failed: SecurityException", e2);
            return false;
        }
    }

    private boolean requestDisableBluetooth() {
        if (this.mContext_ == null) {
            Log.e(LOG_TAG, "context is null");
            return false;
        }
        if (!checkPermissions(PERMISSION_BLUETOOTH_CONNECT)) {
            Log.e(LOG_TAG, "Permission check failed for BLUETOOTH_CONNECT");
            return false;
        }
        Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
        try {
            intent.addFlags(268435456);
            this.mContext_.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e(LOG_TAG, "Opening Bluetooth settings failed: Activity not found", e);
            return false;
        } catch (SecurityException e2) {
            Log.e(LOG_TAG, "Opening Bluetooth settings failed: SecurityException", e2);
            return false;
        }
    }
}
