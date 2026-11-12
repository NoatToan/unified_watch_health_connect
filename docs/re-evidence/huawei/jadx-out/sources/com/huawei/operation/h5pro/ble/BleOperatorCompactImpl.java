package com.huawei.operation.h5pro.ble;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.api.DeviceManagerApi;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.R;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.beans.BleDeviceBean;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.ble.BleJsDataApi;
import com.huawei.operation.ble.BleOperator;
import com.huawei.operation.h5pro.dataproceessor.HealthDataProcessor;
import com.huawei.operation.h5pro.jsmodules.healthengine.service.HealthEngineService;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.share.ResultCallback;
import com.huawei.operation.utils.BleJsBiOperate;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.UriConstants;
import com.huawei.operation.utils.Utils;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.up.utils.Constants;
import defpackage.gsm;
import defpackage.krn;
import defpackage.lcn;
import defpackage.njy;
import defpackage.qqs;
import health.compact.a.GRSManager;
import health.compact.a.HEXUtils;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class BleOperatorCompactImpl implements BleOperator {
    private static final int BINARY_COMPLEMENT = 255;
    private static final int DATA_BYTE_LENGTH = 2;
    private static final int DEFAULT_VALUE_BLUETOOTH = 0;
    private static final String RELEASE_TAG = "R_PluginOperation_BleOperatorCompactImpl";
    private static final int SN_CODE_LENGTH = 11;
    private static final int SYNC_ERROR_TYPE = -1;
    private static final String TAG = "PluginOperation_BleOperatorCompactImpl";
    private PluginOperationAdapter mAdapter;
    private String mAttachSn;
    private ArrayList<BleDeviceBean> mBleDeviceBeans;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothGatt mBluetoothGatt;
    private BluetoothGattCallback mBluetoothGattCallback;
    private BroadcastReceiver mBroadcastReceiver;
    private HashMap<String, String> mCallbackMap;
    private Context mContext;
    private long mCurrentTimeMillis;
    private HealthDataProcessor mDataProcessor;
    private BluetoothDevice mDevice;
    private ContentValues mDeviceInfo;
    private BluetoothGattDescriptor mGattDescriptor;
    private BluetoothGattService mGattService;
    private H5ProInstance mH5proInstance;
    private int mInterval;
    private boolean mIsAllowDuplicatesKey;
    private boolean mIsScanning;
    private H5ProJsCbkInvoker<Object> mJsInvoker;
    private BluetoothGattCharacteristic mNotifyCharacteristic;
    private String mProductId;
    private BluetoothGattCharacteristic mReadCharacteristic;
    private CustomTextAlertDialog mUnbindDialog;
    private String mUniqueId;
    private BluetoothGattCharacteristic mWriteCharacteristic;
    private boolean mIsConnected = false;
    private boolean mIsDiscoveredSrv = false;
    private PermissionsResultAction mQrCodeAction = null;
    private BluetoothAdapter.LeScanCallback mLeScanCallback = new BluetoothAdapter.LeScanCallback() { // from class: com.huawei.operation.h5pro.ble.BleOperatorCompactImpl.1
        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            if (bluetoothDevice == null || BleOperatorCompactImpl.this.mBleDeviceBeans == null) {
                LogUtil.j(BleOperatorCompactImpl.TAG, "mLeScanCallback device or mBleDeviceBeans is null");
                return;
            }
            BleDeviceBean bleDeviceBean = new BleDeviceBean();
            try {
                bleDeviceBean.setDeviceId(bluetoothDevice.getAddress());
                bleDeviceBean.setRssi(i);
                bleDeviceBean.setAdvertisData(BleOperatorCompactImpl.bytesToHexString(bArr).toUpperCase(Locale.ROOT));
                bleDeviceBean.setLocalName(bluetoothDevice.getName());
                if (bluetoothDevice.getUuids() != null) {
                    bleDeviceBean.setAdvertisServiceUUIDs(Arrays.asList(bluetoothDevice.getUuids()));
                }
                if (!BleOperatorCompactImpl.this.mIsAllowDuplicatesKey || !BleOperatorCompactImpl.this.hasServiceUuid(bluetoothDevice)) {
                    BleOperatorCompactImpl.this.mBleDeviceBeans.add(bleDeviceBean);
                    if (System.currentTimeMillis() - BleOperatorCompactImpl.this.mCurrentTimeMillis >= BleOperatorCompactImpl.this.mInterval) {
                        BleOperatorCompactImpl.this.mCurrentTimeMillis = System.currentTimeMillis();
                        BleOperatorCompactImpl bleOperatorCompactImpl = BleOperatorCompactImpl.this;
                        bleOperatorCompactImpl.foundBluetoothDevicesHandleTask(bleOperatorCompactImpl.mBleDeviceBeans);
                        return;
                    }
                    return;
                }
                LogUtil.a(BleOperatorCompactImpl.TAG, "mBleDeviceBeans has this device");
            } catch (SecurityException e) {
                LogUtil.e(BleOperatorCompactImpl.TAG, "onLeScan SecurityException:", ExceptionUtils.c(e));
            }
        }
    };

    public BleOperatorCompactImpl(Context context, H5ProInstance h5ProInstance, ContentValues contentValues, String str) {
        this.mCallbackMap = null;
        LogUtil.a(TAG, "startBleState");
        this.mContext = context;
        this.mH5proInstance = h5ProInstance;
        this.mJsInvoker = h5ProInstance.getJsCbkInvoker();
        this.mDeviceInfo = contentValues;
        this.mProductId = str;
        if (contentValues != null) {
            this.mUniqueId = contentValues.getAsString("uniqueId");
            this.mAttachSn = contentValues.getAsString(BleConstants.ATTACH_SN);
        }
        this.mCallbackMap = new HashMap<>(16);
        this.mBleDeviceBeans = new ArrayList<>();
        this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        PluginBaseAdapter adapter = PluginOperation.getInstance(context).getAdapter();
        if (adapter instanceof PluginOperationAdapter) {
            this.mAdapter = (PluginOperationAdapter) adapter;
        }
        if (this.mAdapter == null) {
            this.mAdapter = Utils.initPluginOperationAdapter();
        }
        this.mDataProcessor = new HealthDataProcessor(this.mContext, h5ProInstance, this.mDeviceInfo, this.mProductId, this.mUniqueId);
        initQrCodeAction();
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String getDeviceId() {
        LogUtil.a(TAG, "getDeviceId：", this.mProductId);
        return this.mProductId;
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void setCallBackName(String str, String str2, String str3) {
        LogUtil.a(TAG, "setCallBackName, function = ", str2);
        if (this.mCallbackMap == null) {
            this.mCallbackMap = new HashMap<>(16);
        }
        if (str != null && str.equals(this.mProductId)) {
            this.mCallbackMap.put(str3, str2);
        } else {
            LogUtil.j(TAG, "setCallBackName deviceId is null or deviceId is not equals mDeviceId");
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String startBluetoothDevicesDiscovery(UUID[] uuidArr, boolean z, int i) {
        LogUtil.a(TAG, "startBluetoothDevicesDiscovery");
        if (this.mBluetoothAdapter == null) {
            return BleConstants.ERRCODE_COMMON_ERR;
        }
        if (!BleConstants.haveScanPermission()) {
            ReleaseLogUtil.a(RELEASE_TAG, "startBluetoothDevicesDiscovery need permission!");
            return BleConstants.ERRCODE_COMMON_ERR;
        }
        this.mInterval = i;
        this.mIsAllowDuplicatesKey = z;
        LogUtil.a(TAG, "startBluetoothDevicesDiscovery mIsScanning is ", Boolean.valueOf(this.mIsScanning));
        try {
            if (!this.mIsScanning) {
                this.mIsScanning = true;
                if (!this.mBluetoothAdapter.startLeScan(uuidArr, this.mLeScanCallback)) {
                    return BleConstants.ERRCODE_COMMON_ERR;
                }
            }
            return "0";
        } catch (SecurityException e) {
            LogUtil.e(TAG, "startBluetoothDevicesDiscovery SecurityException:", ExceptionUtils.c(e));
            return BleConstants.ERRCODE_COMMON_ERR;
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String stopBluetoothDevicesDiscovery() {
        LogUtil.a(TAG, "stopBluetoothDevicesDiscovery");
        if (this.mBluetoothAdapter == null) {
            return BleConstants.ERRCODE_COMMON_ERR;
        }
        if (!BleConstants.haveScanPermission()) {
            ReleaseLogUtil.a(RELEASE_TAG, "stopBluetoothDevicesDiscovery need permission!");
            return BleConstants.ERRCODE_COMMON_ERR;
        }
        LogUtil.a(TAG, "stopBluetoothDevicesDiscovery mIsScanning is ", Boolean.valueOf(this.mIsScanning));
        if (this.mIsScanning) {
            this.mIsScanning = false;
            this.mBluetoothAdapter.stopLeScan(this.mLeScanCallback);
            return "0";
        }
        return "0";
    }

    @Override // com.huawei.operation.ble.BleOperator
    public boolean notifyBleCharacteristicValueChange(String str, String str2, String str3, boolean z) {
        LogUtil.a(TAG, "notifyBleCharacteristicValueChange");
        if (this.mProductId.equals(str)) {
            if (this.mIsConnected && this.mIsDiscoveredSrv) {
                return setClientCharacteristicConfigDescriptor(str2, str3, z);
            }
            LogUtil.e(TAG, "notifyBleCharacteristicValueChange BleState is not correct");
            return false;
        }
        LogUtil.e(TAG, "notifyBleCharacteristicValueChange deviceId is not correct");
        return false;
    }

    @Override // com.huawei.operation.ble.BleOperator
    public boolean indicationBleCharacteristicValueChange(String str, String str2, String str3, boolean z) {
        LogUtil.a(TAG, "indicationBleCharacteristicValueChange");
        if (this.mProductId.equals(str)) {
            if (this.mIsConnected && this.mIsDiscoveredSrv) {
                return setClientCharacteristicConfigDescriptorIndication(str2, str3, z);
            }
            LogUtil.e(TAG, "indicationBleCharacteristicValueChange BleState is not correct");
            return false;
        }
        LogUtil.e(TAG, "indicationBleCharacteristicValueChange deviceId is not correct");
        return false;
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String requestConnectionPriority(int i) {
        LogUtil.a(TAG, "requestConnectionPriority:", Integer.valueOf(i));
        try {
            if (i < 0 || i > 2) {
                LogUtil.a(TAG, "requestConnectionPriority fail:", Integer.valueOf(i));
                return BleConstants.ERRCODE_COMMON_ERR;
            }
            if (this.mBluetoothAdapter != null && this.mBluetoothGatt != null) {
                if (!BleConstants.haveScanPermission()) {
                    ReleaseLogUtil.e(RELEASE_TAG, "requestConnectionPriority need permission!");
                    return BleConstants.ERRCODE_COMMON_ERR;
                }
                if (!this.mBluetoothGatt.requestConnectionPriority(i)) {
                    return BleConstants.ERRCODE_COMMON_ERR;
                }
                return "0";
            }
            LogUtil.j(TAG, "mBluetoothAdapter or mBluetoothGatt is null");
            return BleConstants.ERRCODE_COMMON_ERR;
        } catch (SecurityException e) {
            LogUtil.e(TAG, "requestConnectionPriority SecurityException:", ExceptionUtils.c(e));
            return BleConstants.ERRCODE_COMMON_ERR;
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String requestMtu(int i) {
        LogUtil.a(TAG, "requestMtu:", Integer.valueOf(i));
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            LogUtil.j(TAG, "mBluetoothGatt is null");
            return BleConstants.ERRCODE_COMMON_ERR;
        }
        try {
            return bluetoothGatt.requestMtu(i) ? "0" : BleConstants.ERRCODE_COMMON_ERR;
        } catch (SecurityException e) {
            LogUtil.e(TAG, "requestMtu SecurityException:", ExceptionUtils.c(e));
            return BleConstants.ERRCODE_COMMON_ERR;
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void readBleCharacteristicValue(String str, String str2) {
        LogUtil.a(TAG, "readBleCharacteristicValue");
        if (this.mIsDiscoveredSrv) {
            initService(str);
            readCharacteristic(str2);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String writeBleCharacteristicValue(String str, String str2, String str3, String str4) {
        LogUtil.a(TAG, "writeBleCharacteristicValue");
        if (!this.mProductId.equals(str)) {
            return BleConstants.ERRCODE_PRD_NOT_FOUND;
        }
        if (!this.mIsDiscoveredSrv) {
            return BleConstants.ERRCODE_COMMON_ERR;
        }
        initService(str2);
        writeCharacteristic(str3, str4);
        return "0";
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String createBleConnection(String str) {
        LogUtil.a(TAG, "createBleConnection");
        return connect(str);
    }

    private String connect(String str) {
        String bondedDeviceAddress;
        LogUtil.a(TAG, "connect");
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            return connectByMacAddress(str);
        }
        if (this.mAdapter == null) {
            bondedDeviceAddress = null;
        } else if (TextUtils.isEmpty(this.mUniqueId)) {
            bondedDeviceAddress = this.mAdapter.getBondedDeviceAddress(str);
        } else {
            bondedDeviceAddress = this.mUniqueId;
        }
        if (bondedDeviceAddress == null) {
            return BleConstants.ERRCODE_PRD_NOT_FOUND;
        }
        return connectByMacAddress(bondedDeviceAddress);
    }

    private String connectByMacAddress(String str) {
        try {
            if (this.mBluetoothAdapter != null) {
                if (!BleConstants.haveScanPermission()) {
                    ReleaseLogUtil.a(RELEASE_TAG, "connectByMacAddress need permission!");
                    return BleConstants.ERRCODE_COMMON_ERR;
                }
                this.mDevice = this.mBluetoothAdapter.getRemoteDevice(str);
                if (this.mBluetoothGattCallback == null) {
                    this.mBluetoothGattCallback = new BleGattCallback();
                }
                BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
                if (bluetoothGatt != null) {
                    bluetoothGatt.close();
                }
                this.mBluetoothGatt = this.mDevice.connectGatt(this.mContext, false, this.mBluetoothGattCallback);
                return "0";
            }
            return "0";
        } catch (IllegalArgumentException | SecurityException e) {
            LogUtil.e(TAG, "connectByMacAddress exception:", ExceptionUtils.c(e));
            return BleConstants.ERRCODE_BLE_CONNECT_ERROR;
        }
    }

    private boolean initService(String str) {
        LogUtil.a(TAG, "initService");
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt != null) {
            BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(str));
            this.mGattService = service;
            if (service != null) {
                return true;
            }
            LogUtil.e(TAG, "getService fail");
            return false;
        }
        LogUtil.e(TAG, "BluetoothGatt is null");
        return false;
    }

    private void writeCharacteristic(String str, String str2) {
        LogUtil.a(TAG, "writeCharacteristic");
        try {
            BluetoothGattService bluetoothGattService = this.mGattService;
            if (bluetoothGattService != null) {
                this.mWriteCharacteristic = bluetoothGattService.getCharacteristic(UUID.fromString(str));
            }
            if (this.mWriteCharacteristic != null) {
                byte[] bArrA = HEXUtils.a(str2);
                if (bArrA != null) {
                    this.mWriteCharacteristic.setValue(bArrA);
                }
                this.mBluetoothGatt.writeCharacteristic(this.mWriteCharacteristic);
            }
        } catch (SecurityException e) {
            LogUtil.e(TAG, "writeCharacteristic SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void readCharacteristic(String str) {
        LogUtil.a(TAG, "readCharacteristic");
        try {
            BluetoothGattService bluetoothGattService = this.mGattService;
            if (bluetoothGattService != null) {
                this.mReadCharacteristic = bluetoothGattService.getCharacteristic(UUID.fromString(str));
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.mReadCharacteristic;
            if (bluetoothGattCharacteristic != null) {
                this.mBluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
            }
        } catch (SecurityException e) {
            LogUtil.e(TAG, "readCharacteristic SecurityException:", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String closeBleConnection(String str) {
        LogUtil.a(TAG, "closeBleConnection");
        disconnect(str);
        return "0";
    }

    private void disconnect(String str) {
        LogUtil.a(TAG, AwarenessRequest.MessageType.DISCONNECT);
        if (this.mProductId.equals(str)) {
            try {
                BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
                if (bluetoothGatt != null) {
                    bluetoothGatt.disconnect();
                    this.mBluetoothGatt.close();
                }
                HashMap<String, String> map = this.mCallbackMap;
                if (map != null) {
                    map.clear();
                }
                this.mIsScanning = false;
                ArrayList<BleDeviceBean> arrayList = this.mBleDeviceBeans;
                if (arrayList != null) {
                    arrayList.clear();
                }
            } catch (SecurityException e) {
                LogUtil.e(TAG, "disconnect SecurityException:", ExceptionUtils.c(e));
            }
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a(TAG, "onActivityResult  requestCode = ", Integer.valueOf(i), "resultCode = ", Integer.valueOf(i));
        handleOpenBluetoothAdapter(i, i2);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String openBluetoothAdapter() {
        LogUtil.a(TAG, BleConstants.ON_OPEN_BLE_ADAPTER);
        return openBlu();
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void openBluetoothAdapterWithCallBack() {
        HashMap<String, String> map;
        if (this.mJsInvoker == null || (map = this.mCallbackMap) == null) {
            LogUtil.j(TAG, "openBluetoothAdapter mJsInvoker or mCallbackMap is null");
            return;
        }
        String str = map.get(BleConstants.ON_OPEN_BLE_ADAPTER);
        if (!BleConstants.haveScanPermission()) {
            ReleaseLogUtil.a(RELEASE_TAG, "openBluetoothAdapter need permission!");
            this.mJsInvoker.invokeJsFunc(str, BleConstants.ERRCODE_COMMON_ERR);
        }
        try {
            BaseApplication.getActivity().startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 4);
        } catch (ActivityNotFoundException unused) {
            LogUtil.a(TAG, "openBluetoothAdapter ActivityNotFoundException");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.mJsInvoker.invokeJsFunc(str, BleConstants.ERRCODE_COMMON_ERR);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String closeBluetoothAdapter() {
        LogUtil.a(TAG, "closeBluetoothAdapter");
        return closeBlu();
    }

    private String openBlu() {
        String str;
        LogUtil.a(TAG, "openBlu");
        try {
            BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
            if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
                str = "0";
            } else {
                str = BleConstants.ERRCODE_COMMON_ERR;
            }
        } catch (SecurityException e) {
            LogUtil.e(TAG, "openBlu SecurityException:", ExceptionUtils.c(e));
        }
        LogUtil.a(TAG, "openBlu result:", str);
        return str;
    }

    private String closeBlu() {
        String str;
        LogUtil.a(TAG, "closeBlu");
        try {
            BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
            if (bluetoothAdapter != null && !bluetoothAdapter.isEnabled()) {
                str = "0";
            } else {
                str = BleConstants.ERRCODE_COMMON_ERR;
            }
        } catch (SecurityException e) {
            LogUtil.e(TAG, "closeBlu SecurityException:", ExceptionUtils.c(e));
        }
        LogUtil.a(TAG, "closeBlu result:", str);
        return str;
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void getBluetoothAdapterState() {
        LogUtil.a(TAG, BleConstants.GET_BLUETOOTH_ADAPTIVE_STATE_CALLBACK_NAME);
        getBluState();
    }

    private void getBluState() {
        HashMap<String, String> map;
        LogUtil.a(TAG, "getBluState");
        if (this.mJsInvoker == null || (map = this.mCallbackMap) == null) {
            LogUtil.j(TAG, "getBluState mJsInvoker or mCallbackMap is null");
            return;
        }
        String str = map.get(BleConstants.GET_BLUETOOTH_ADAPTIVE_STATE_CALLBACK_NAME);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "getBluState callbackFunc is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!BleConstants.haveScanPermission()) {
                ReleaseLogUtil.a(RELEASE_TAG, "getBluState need permission!");
                jSONObject.put("errCode", BleConstants.ERRCODE_COMMON_ERR);
                this.mJsInvoker.invokeJsFunc(str, jSONObject.toString());
                return;
            }
            BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
            if (bluetoothAdapter != null) {
                boolean z = bluetoothAdapter.getState() == 12;
                jSONObject.put(BleConstants.KEY_DISCOVERING, this.mBluetoothAdapter.isDiscovering());
                jSONObject.put(BleConstants.KEY_AVAILABLE, z);
                jSONObject.put("errCode", "0");
                String string = jSONObject.toString();
                LogUtil.a(TAG, "getBluState jsonResult: ", string);
                this.mJsInvoker.invokeJsFunc(str, string);
            }
        } catch (SecurityException | JSONException e) {
            LogUtil.e(TAG, "getBluState Exception:", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void onBluetoothAdapterStateChange() {
        LogUtil.a(TAG, BleConstants.ON_BLUETOOTH_ADAPTER_STATE_CHANGE_CALLBACK_NAME);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        if (this.mBroadcastReceiver == null) {
            this.mBroadcastReceiver = new BluetoothStateChangeBroadcastReceiver();
        }
        Context context = this.mContext;
        if (context != null) {
            context.registerReceiver(this.mBroadcastReceiver, intentFilter);
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    class BluetoothStateChangeBroadcastReceiver extends BroadcastReceiver {
        private BluetoothStateChangeBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a(BleOperatorCompactImpl.TAG, "onReceive: " + intent.getAction());
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0)) {
                    case 10:
                        LogUtil.a(BleOperatorCompactImpl.TAG, "STATE_OFF");
                        BleOperatorCompactImpl.this.handleBluetoothAdapterStateChange(false);
                        break;
                    case 11:
                        LogUtil.a(BleOperatorCompactImpl.TAG, "STATE_TURNING_ON");
                        BleOperatorCompactImpl.this.handleBluetoothAdapterStateChange(false);
                        break;
                    case 12:
                        LogUtil.a(BleOperatorCompactImpl.TAG, "STATE_ON");
                        BleOperatorCompactImpl.this.handleBluetoothAdapterStateChange(true);
                        break;
                    case 13:
                        LogUtil.a(BleOperatorCompactImpl.TAG, "STATE_TURNING_OFF");
                        BleOperatorCompactImpl.this.handleBluetoothAdapterStateChange(false);
                        break;
                }
            }
        }
    }

    private void handleOpenBluetoothAdapter(int i, int i2) {
        String str;
        LogUtil.a(TAG, "handleOpenBluetoothAdapter enter");
        if (this.mJsInvoker == null || this.mCallbackMap == null) {
            LogUtil.j(TAG, "handleBluetoothAdapterStateChange mJsInvoker or mCallbackMap is null");
            return;
        }
        LogUtil.a(TAG, "requestCode = ", Integer.valueOf(i), "resultCode = ", Integer.valueOf(i));
        String str2 = this.mCallbackMap.get(BleConstants.ON_OPEN_BLE_ADAPTER);
        if (i == 4) {
            if (i2 != -1) {
                str = BleConstants.ERRCODE_COMMON_ERR;
            } else {
                str = "0";
            }
            this.mJsInvoker.invokeJsFunc(str2, str);
            LogUtil.a(TAG, "handleOpenBluetoothAdapter end result = ", str, "function = ", str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBluetoothAdapterStateChange(boolean z) {
        HashMap<String, String> map;
        LogUtil.a(TAG, "handleBluetoothAdapterStateChange");
        if (this.mJsInvoker == null || (map = this.mCallbackMap) == null) {
            LogUtil.j(TAG, "handleBluetoothAdapterStateChange mJsInvoker or mCallbackMap is null");
            return;
        }
        String str = map.get(BleConstants.ON_BLUETOOTH_ADAPTER_STATE_CHANGE_CALLBACK_NAME);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "handleBluetoothAdapterStateChange callbackFunc is null");
            return;
        }
        if (!BleConstants.haveScanPermission()) {
            ReleaseLogUtil.e(RELEASE_TAG, "handleBluetoothAdapterStateChange need permission!");
            return;
        }
        try {
            BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
            if (bluetoothAdapter != null) {
                boolean zIsDiscovering = bluetoothAdapter.isDiscovering();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(BleConstants.KEY_DISCOVERING, zIsDiscovering);
                    jSONObject.put(BleConstants.KEY_AVAILABLE, z);
                } catch (JSONException unused) {
                    LogUtil.e(TAG, "handleBluetoothAdapterStateChange fail JSONException");
                }
                String string = jSONObject.toString();
                LogUtil.a(TAG, "handleBluetoothAdapterStateChange ", string);
                this.mJsInvoker.invokeJsFunc(str, string);
            }
        } catch (SecurityException e) {
            LogUtil.e(TAG, "handleBluetoothAdapterStateChange SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasServiceUuid(BluetoothDevice bluetoothDevice) {
        Iterator<BleDeviceBean> it = this.mBleDeviceBeans.iterator();
        while (it.hasNext()) {
            if (it.next().getDeviceId().equals(bluetoothDevice.getAddress())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: loaded from: classes41.dex */
    class BleGattCallback extends BluetoothGattCallback {
        private BleGattCallback() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            LogUtil.a(BleOperatorCompactImpl.TAG, "onConnectionStateChange, status:", Integer.valueOf(i2));
            if (bluetoothGatt != null) {
                if (i2 == 2) {
                    try {
                        bluetoothGatt.discoverServices();
                        BleOperatorCompactImpl.this.mIsConnected = true;
                    } catch (SecurityException e) {
                        LogUtil.e(BleOperatorCompactImpl.TAG, "onConnectionStateChange SecurityException:", ExceptionUtils.c(e));
                        return;
                    }
                }
                if (i2 == 0) {
                    LogUtil.j(BleOperatorCompactImpl.TAG, "BleOperatorImpl it's disconnected");
                    BleOperatorCompactImpl.this.mIsDiscoveredSrv = false;
                    BleOperatorCompactImpl.this.mIsConnected = false;
                }
                BleOperatorCompactImpl.this.connectionStateHandleTask();
                new BleJsBiOperate().tickBiBleConnect(BleOperatorCompactImpl.this.mDeviceInfo, i2, BleOperatorCompactImpl.this.mProductId);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            LogUtil.a(BleOperatorCompactImpl.TAG, "onServicesDiscovered, status = ", Integer.valueOf(i));
            if (bluetoothGatt == null || i != 0) {
                return;
            }
            BleOperatorCompactImpl.this.mIsDiscoveredSrv = true;
            BleOperatorCompactImpl.this.servicesDiscoveredTask();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            LogUtil.a(BleOperatorCompactImpl.TAG, "onCharacteristicChanged");
            BleOperatorCompactImpl.this.characteristicHandleTask(10004, bluetoothGattCharacteristic, 0);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LogUtil.a(BleOperatorCompactImpl.TAG, "onCharacteristicWrite, status = ", Integer.valueOf(i));
            BleOperatorCompactImpl.this.characteristicHandleTask(10005, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LogUtil.a(BleOperatorCompactImpl.TAG, "onCharacteristicRead, status = ", Integer.valueOf(i));
            BleOperatorCompactImpl.this.characteristicHandleTask(10006, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onMtuChanged(bluetoothGatt, i, i2);
            LogUtil.a(BleOperatorCompactImpl.TAG, "onMtuChanged, mtu = ", Integer.valueOf(i), ", status = ", Integer.valueOf(i2));
            BleOperatorCompactImpl.this.mtuChangedHandleTask(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionStateHandleTask() {
        HashMap<String, String> map;
        LogUtil.a(TAG, "connectionStateHandleTask");
        if (this.mJsInvoker == null || (map = this.mCallbackMap) == null) {
            LogUtil.j(TAG, "connectionStateHandleTask mJsInvoker or mCallbackMap is null");
            return;
        }
        String str = map.get(BleConstants.ON_BLE_CONNECTION_STATE_CHANGE_CALLBACK_NAME);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "connectionStateHandleTask callbackFunc is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceId", this.mProductId);
            jSONObject.put("connected", this.mIsConnected);
            jSONObject.put(BleConstants.KEY_CONNECTSTATE, this.mIsConnected);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "connectionStateHandleTask fail JSONException");
        }
        String string = jSONObject.toString();
        LogUtil.a(TAG, "connectionStateHandleTask jsonResult: ", string);
        this.mJsInvoker.invokeJsFunc(str, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void servicesDiscoveredTask() {
        HashMap<String, String> map;
        LogUtil.a(TAG, "servicesDiscoveredTask");
        if (this.mJsInvoker == null || (map = this.mCallbackMap) == null) {
            LogUtil.j(TAG, "servicesDiscoveredTask mJsInvoker or mCallbackMap is null");
            return;
        }
        String str = map.get(BleConstants.ON_BLE_SERVICES_DISCOVERED_CALLBACK_NAME);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "servicesDiscoveredTask callbackFunc is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", "0");
        } catch (JSONException unused) {
            LogUtil.e(TAG, "servicesDiscoveredTask fail JSONException");
        }
        String string = jSONObject.toString();
        LogUtil.a(TAG, "servicesDiscoveredTask jsonResult: ", string);
        this.mJsInvoker.invokeJsFunc(str, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void characteristicHandleTask(int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        LogUtil.a(TAG, "characteristicHandleTask");
        if (this.mJsInvoker == null || this.mCallbackMap == null) {
            LogUtil.j(TAG, "characteristicHandleTask mJsInvoker or mCallbackMap is null");
            return;
        }
        try {
            execCharacteristicHandleTask(i, bluetoothGattCharacteristic, i2);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "characteristicHandleTask fail JSONException");
        }
    }

    private void execCharacteristicHandleTask(int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) throws JSONException {
        String str;
        String str2;
        LogUtil.a(TAG, "execCharacteristicHandleTask");
        JSONObject jSONObject = new JSONObject();
        if (i == 10004) {
            str = this.mCallbackMap.get(BleConstants.ON_BLE_CHARACTERISTIC_VALUE_CHANGE_CALLBACK_NAME);
            String string = bluetoothGattCharacteristic.getUuid().toString();
            if (TextUtils.isEmpty(str) || (str2 = this.mProductId) == null || string == null) {
                LogUtil.j(TAG, "execCharacteristicHandleTask * is null");
                return;
            }
            jSONObject.put("deviceId", str2);
            jSONObject.put("serviceId", "");
            jSONObject.put(BleConstants.KEY_CHARACTERISTICID, string);
            jSONObject.put("data", bytesToHexString(bluetoothGattCharacteristic.getValue()));
        } else {
            String str3 = BleConstants.ERRCODE_COMMON_ERR;
            if (i == 10005) {
                if (i2 == 0) {
                    str3 = "0";
                }
                str = this.mCallbackMap.get(BleConstants.ON_BLE_CHARACTERISTIC_WRITE_CALLBACK_NAME);
                if (TextUtils.isEmpty(str)) {
                    LogUtil.j(TAG, "execCharacteristicHandleTask callbackFunc is null");
                    return;
                }
                jSONObject.put("errCode", str3);
            } else if (i == 10006) {
                if (i2 == 0) {
                    str3 = "0";
                }
                String strBytesToHexString = bytesToHexString(bluetoothGattCharacteristic.getValue());
                String str4 = this.mCallbackMap.get(BleConstants.ON_BLE_CHARACTERISTIC_READ_CALLBACK_NAME);
                if (TextUtils.isEmpty(str4)) {
                    LogUtil.j(TAG, "execCharacteristicHandleTask callbackFunc or data is null");
                    return;
                } else {
                    jSONObject.put("data", strBytesToHexString);
                    jSONObject.put("errCode", str3);
                    str = str4;
                }
            } else {
                LogUtil.a(TAG, "execCharacteristicHandleTask not VALUE_CHANGE READ WRITE");
                return;
            }
        }
        String string2 = jSONObject.toString();
        LogUtil.d(TAG, "execCharacteristicHandleTask jsonResult: ", string2);
        this.mJsInvoker.invokeJsFunc(str, string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String bytesToHexString(byte[] bArr) {
        LogUtil.a(TAG, "bytesToHexString");
        StringBuilder sb = new StringBuilder(16);
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void foundBluetoothDevicesHandleTask(ArrayList<BleDeviceBean> arrayList) {
        HashMap<String, String> map;
        LogUtil.a(TAG, "foundBluetoothDevicesHandleTask");
        if (this.mJsInvoker == null || (map = this.mCallbackMap) == null) {
            LogUtil.j(TAG, "foundBluetoothDevicesHandleTask mJsInvoker or mCallbackMap is null");
            return;
        }
        String str = map.get(BleConstants.ON_BLE_DEVICE_FOUND);
        if (TextUtils.isEmpty(str) || njy.e(arrayList)) {
            LogUtil.j(TAG, "foundBluetoothDevicesHandleTask callbackFunc or bleDeviceBeans is null");
            return;
        }
        String json = new Gson().toJson(arrayList);
        LogUtil.d(TAG, "foundBluetoothDevicesHandleTask jsonResult: ", json);
        this.mJsInvoker.invokeJsFunc(str, json);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mtuChangedHandleTask(int i, int i2) {
        HashMap<String, String> map;
        String str;
        LogUtil.a(TAG, "mtuChangedHandleTask");
        if (this.mJsInvoker == null || (map = this.mCallbackMap) == null) {
            LogUtil.j(TAG, "mtuChangedHandleTask mJsInvoker or mCallbackMap is null");
            return;
        }
        String str2 = map.get(BleConstants.REGISTER_REQUEST_MTU_CALLBACK_NAME);
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j(TAG, "mtuChangedHandleTask callbackFunc is null");
            return;
        }
        if (i2 == 0) {
            str = "0";
        } else {
            str = BleConstants.ERRCODE_COMMON_ERR;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", str);
            jSONObject.put("data", i);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "mtuChangedHandleTask fail JsonException");
        }
        String string = jSONObject.toString();
        LogUtil.a(TAG, "mtuChangedHandleTask jsonResult: ", string);
        this.mJsInvoker.invokeJsFunc(str2, string);
    }

    private boolean setClientCharacteristicConfigDescriptor(String str, String str2, boolean z) {
        LogUtil.a(TAG, "setClientCharacteristicConfigDescriptor");
        if (initService(str) && initCharacteristic(str2) && initDescriptor(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID) && setCharNotification(z)) {
            return true;
        }
        LogUtil.e(TAG, "setClientCharacteristicConfigDescriptor fail");
        return false;
    }

    private boolean setClientCharacteristicConfigDescriptorIndication(String str, String str2, boolean z) {
        LogUtil.a(TAG, "setClientCharacteristicConfigDescriptorIndication");
        if (initService(str) && initCharacteristic(str2) && initDescriptor(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID) && setCharIndication(z)) {
            return true;
        }
        LogUtil.e(TAG, "setClientCharacteristicConfigDescriptorIndication fail");
        return false;
    }

    private boolean initCharacteristic(String str) {
        LogUtil.a(TAG, "initCharacteristic");
        if (this.mGattService != null) {
            LogUtil.a(TAG, "initCharacteristic getCharacteristic");
            BluetoothGattCharacteristic characteristic = this.mGattService.getCharacteristic(UUID.fromString(str));
            this.mNotifyCharacteristic = characteristic;
            if (characteristic != null) {
                return true;
            }
            LogUtil.e(TAG, "getCharacteristic fail");
            return false;
        }
        LogUtil.e(TAG, "GattService is null");
        return false;
    }

    private boolean initDescriptor(String str) {
        LogUtil.a(TAG, "initDescriptor");
        if (this.mNotifyCharacteristic != null) {
            LogUtil.a(TAG, "initDescriptor getDescriptor");
            BluetoothGattDescriptor descriptor = this.mNotifyCharacteristic.getDescriptor(UUID.fromString(str));
            this.mGattDescriptor = descriptor;
            if (descriptor != null) {
                return true;
            }
            LogUtil.e(TAG, "getDescriptor fail");
            return false;
        }
        LogUtil.e(TAG, "GattCharacteristic is null");
        return false;
    }

    private boolean setCharNotification(boolean z) {
        LogUtil.a(TAG, "setCharNotification");
        try {
            byte[] bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            if (z) {
                LogUtil.a(TAG, "setCharNotification flag is enable");
                bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            }
            if (this.mGattDescriptor != null) {
                if (this.mBluetoothGatt.setCharacteristicNotification(this.mNotifyCharacteristic, z) && this.mGattDescriptor.setValue(bArr) && this.mBluetoothGatt.writeDescriptor(this.mGattDescriptor)) {
                    return true;
                }
                LogUtil.j(TAG, "setCharNotification fail");
                return false;
            }
            LogUtil.j(TAG, "GattDescriptor is null");
            return false;
        } catch (SecurityException e) {
            LogUtil.e(TAG, "setCharNotification SecurityException:", ExceptionUtils.c(e));
            return false;
        }
    }

    private boolean setCharIndication(boolean z) {
        LogUtil.a(TAG, "setCharIndication");
        try {
            byte[] bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
            if (z) {
                LogUtil.a(TAG, "setCharIndication flag is enable");
                bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
            }
            if (this.mGattDescriptor != null) {
                if (this.mBluetoothGatt.setCharacteristicNotification(this.mNotifyCharacteristic, z) && this.mGattDescriptor.setValue(bArr) && this.mBluetoothGatt.writeDescriptor(this.mGattDescriptor)) {
                    return true;
                }
                LogUtil.j(TAG, "setCharIndication fail");
                return false;
            }
            LogUtil.j(TAG, "GattDescriptor is null");
            return false;
        } catch (SecurityException e) {
            LogUtil.e(TAG, "setCharIndication SecurityException:", ExceptionUtils.c(e));
            return false;
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void execQuery(String str, String str2) {
        LogUtil.a(TAG, "execQuery");
        HealthDataProcessor healthDataProcessor = this.mDataProcessor;
        if (healthDataProcessor == null) {
            LogUtil.a(TAG, "execQuery mDataProcessor is null");
        } else {
            healthDataProcessor.execQuery(str, str2);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void hasHealthDataQuery(String str, String str2) {
        LogUtil.a(TAG, "hasHealthDataQuery");
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void save(String str) {
        LogUtil.a(TAG, "save");
        if (this.mDataProcessor == null) {
            LogUtil.a(TAG, "save mDataProcessor is null");
            return;
        }
        HashMap<String, String> map = this.mCallbackMap;
        if (map == null) {
            LogUtil.a(TAG, "save mCallbackMap is null");
            return;
        }
        String str2 = map.get(BleConstants.ON_SAVE_MEASURE_RESULT_NAME);
        this.mDataProcessor.setIsRetryFailed(false);
        this.mDataProcessor.saveData(str, str2);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void saveMultipleData(String str, String str2) {
        LogUtil.a(TAG, "saveMultipleData");
        HealthDataProcessor healthDataProcessor = this.mDataProcessor;
        if (healthDataProcessor == null) {
            LogUtil.a(TAG, "saveMultipleData mDataProcessor is null");
        } else {
            healthDataProcessor.setIsRetryFailed(false);
            this.mDataProcessor.saveMultipleData(str, str2);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void deleteMultipleHealthData(String str, String str2) {
        LogUtil.a(TAG, BleConstants.ON_DELETE_MEASURE_RESULT_NAME);
        HealthDataProcessor healthDataProcessor = this.mDataProcessor;
        if (healthDataProcessor == null) {
            LogUtil.a(TAG, "deleteMultipleHealthData mDataProcessor is null");
        } else {
            healthDataProcessor.deleteMultipleHealthData(str, str2);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void getUserInfo(String str) {
        LogUtil.a(TAG, Constants.METHOD_GET_USER_INFO);
        getUserInfoData(str);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void startScanCode(String str) {
        LogUtil.a(TAG, "startScanCode function = ", str);
        if (this.mQrCodeAction == null) {
            return;
        }
        PermissionUtil.d(this.mContext, PermissionUtil.PermissionType.CAMERA, this.mQrCodeAction);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void bindDevice(String str) {
        LogUtil.a(TAG, "bindDevice");
        HashMap<String, String> map = this.mCallbackMap;
        if (map == null || this.mAdapter == null) {
            LogUtil.j(TAG, "bindDevice mCallbackMap or mAdapter is null");
            return;
        }
        String str2 = map.get(BleConstants.ON_BIND_DEVICE_RESULT_NAME);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("uuid");
            String string2 = jSONObject.getString(BleConstants.MEASUREKIT_ID);
            String string3 = jSONObject.getString("sn");
            if (TextUtils.isEmpty(string)) {
                LogUtil.j(TAG, "bindDevice productId is empty");
                callBackJsResult(this.mJsInvoker, String.valueOf(2), str2, null);
                return;
            }
            String string4 = jSONObject.getString("deviceName");
            String string5 = jSONObject.getString("uniqueId");
            if (TextUtils.isEmpty(string5) && TextUtils.isEmpty(string3)) {
                LogUtil.j(TAG, "bindDevice uniqueId & serialNumber is empty");
                callBackJsResult(this.mJsInvoker, String.valueOf(2), str2, null);
            } else {
                int iBindDevice = this.mAdapter.bindDevice(string, string2, string3, string4, string5);
                LogUtil.a(TAG, "bindDevice resultCode: ", Integer.valueOf(iBindDevice));
                callBackJsResult(this.mJsInvoker, String.valueOf(iBindDevice), str2, null);
                uploadDataToHota(string5, string3, string);
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "bindDevice parseData fail JSONException");
            callBackJsResult(this.mJsInvoker, String.valueOf(2), str2, null);
        }
    }

    private void uploadDataToHota(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) || BluetoothAdapter.checkBluetoothAddress(str)) {
            str = str2;
        } else {
            LogUtil.j(TAG, "uploadDataToHota uniqueId = sn");
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "uploadDataToHota sn is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sn", str);
            ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).uploadDataToHota(str3, jSONObject.toString());
        } catch (JSONException unused) {
            LogUtil.e(TAG, "uploadDataToHota JSONException");
        }
    }

    public void unbindDevice(final String str) {
        if (this.mContext == null || this.mAdapter == null) {
            LogUtil.j(TAG, "mContext or mAdapter is null!");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.operation.h5pro.ble.BleOperatorCompactImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1545xb44210b6(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$unbindDevice$2$com-huawei-operation-h5pro-ble-BleOperatorCompactImpl, reason: not valid java name */
    /* synthetic */ void m1545xb44210b6(final String str) {
        int i = R.string.IDS_hw_health_wear_connect_device_unpair_button;
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.mContext).a(R.string.IDS_hw_health_wear_connect_device_unpair_button).b(R.string.IDS_unbind_device_wear_home).a(i, new View.OnClickListener() { // from class: com.huawei.operation.h5pro.ble.BleOperatorCompactImpl$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1543x61996634(str, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.operation.h5pro.ble.BleOperatorCompactImpl$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1544x8aedbb75(view);
            }
        }).b();
        this.mUnbindDialog = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.mUnbindDialog.show();
    }

    /* JADX INFO: renamed from: lambda$unbindDevice$0$com-huawei-operation-h5pro-ble-BleOperatorCompactImpl, reason: not valid java name */
    /* synthetic */ void m1543x61996634(String str, View view) {
        CustomTextAlertDialog customTextAlertDialog = this.mUnbindDialog;
        if (customTextAlertDialog == null) {
            LogUtil.a(TAG, "unbindDevice setPositiveButton mUnbindDialog = null");
            return;
        }
        customTextAlertDialog.dismiss();
        this.mUnbindDialog = null;
        CompactAdapterResponseCallback compactAdapterResponseCallback = new CompactAdapterResponseCallback(this.mH5proInstance, str);
        if (this.mAdapter.unbindDevice(this.mContext, this.mProductId, this.mUniqueId)) {
            compactAdapterResponseCallback.a(0, null);
            jumpMainActivityOrFinish();
        } else {
            compactAdapterResponseCallback.a(-1, null);
        }
    }

    /* JADX INFO: renamed from: lambda$unbindDevice$1$com-huawei-operation-h5pro-ble-BleOperatorCompactImpl, reason: not valid java name */
    /* synthetic */ void m1544x8aedbb75(View view) {
        CustomTextAlertDialog customTextAlertDialog = this.mUnbindDialog;
        if (customTextAlertDialog == null) {
            LogUtil.a(TAG, "unbindDevice setNegativeButton mUnbindDialog = null");
        } else {
            customTextAlertDialog.dismiss();
            this.mUnbindDialog = null;
        }
    }

    private void jumpMainActivityOrFinish() {
        if (HealthDevice.HealthDeviceKind.HDK_FITTINGS.name().equals(this.mDeviceInfo.getAsString("deviceType"))) {
            ObserverManagerUtil.e("H5_UNBIND_DEVICE", 2);
        } else {
            Intent launchIntentForPackage = this.mContext.getPackageManager().getLaunchIntentForPackage(this.mContext.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(67108864);
                this.mContext.startActivity(launchIntentForPackage);
            }
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        } else {
            LogUtil.a(TAG, " unBind finish context is not Activity ");
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void syncCloud(String str, String str2) {
        int syncType;
        LogUtil.a(TAG, "syncCloud");
        if (TextUtils.isEmpty(str) || "undefined".equals(str)) {
            LogUtil.a(TAG, "params is empty!");
            callBackJsResult(this.mJsInvoker, String.valueOf(2), str2, null);
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str);
                syncType = jSONObject.has("dataType") ? switchDataType(Integer.parseInt(jSONObject.getString("dataType"))) : -1;
                if (syncType == -1) {
                    try {
                        if (jSONObject.has("uniqueId")) {
                            syncType = getSyncType(jSONObject.getString("uniqueId"));
                        }
                    } catch (NumberFormatException e) {
                        e = e;
                        LogUtil.e(TAG, e.getMessage());
                    }
                }
            } catch (NumberFormatException e2) {
                e = e2;
                syncType = -1;
            }
        } catch (JSONException unused) {
            LogUtil.a(TAG, "Use params as uniqueId.");
            syncType = getSyncType(str);
        }
        if (syncType == -1) {
            LogUtil.j(TAG, "syncCloud params is invalid");
            callBackJsResult(this.mJsInvoker, String.valueOf(2), str2, null);
        } else {
            ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).syncCloud(syncType, new CompactAdapterResponseCallback(this.mH5proInstance, str2));
        }
    }

    private int getSyncType(String str) {
        MeasurableDevice bondedDeviceByUniqueId = ((DeviceManagerApi) Services.b("PluginDevice", DeviceManagerApi.class)).getBondedDeviceByUniqueId(str);
        if (bondedDeviceByUniqueId == null) {
            LogUtil.j(TAG, "deviceInfo is null!");
            return -1;
        }
        return switchDataType(bondedDeviceByUniqueId.getKind());
    }

    /* JADX INFO: renamed from: com.huawei.operation.h5pro.ble.BleOperatorCompactImpl$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind;

        static {
            int[] iArr = new int[HealthDevice.HealthDeviceKind.values().length];
            $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind = iArr;
            try {
                iArr[HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind[HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind[HealthDevice.HealthDeviceKind.HDK_BODY_TEMPERATURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind[HealthDevice.HealthDeviceKind.HDK_WEIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private int switchDataType(HealthDevice.HealthDeviceKind healthDeviceKind) {
        int i = AnonymousClass3.$SwitchMap$com$huawei$health$device$model$HealthDevice$HealthDeviceKind[healthDeviceKind.ordinal()];
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 18;
        }
        if (i != 4) {
            return 20000;
        }
        return HiSyncType.HiSyncDataType.f12263a;
    }

    private int switchDataType(int i) {
        if (i == 10001) {
            return 4;
        }
        if (i == 10002) {
            return 5;
        }
        if (i != 10006) {
            return i != 400011975 ? -1 : 18;
        }
        return HiSyncType.HiSyncDataType.f12263a;
    }

    public void getBannerInfo(String str, String str2) {
        callBackJsResult(this.mJsInvoker, String.valueOf(0), str2, str);
    }

    public void requestHeartRateInterval(String str, String str2, String str3) {
        callBackJsResult(this.mJsInvoker, str2, str3, str);
    }

    public void downloadFile(String str, String str2, String str3) {
        callBackJsResult(this.mJsInvoker, str2, str3, str);
    }

    public void getStorageSync(String str, int i, String str2) {
        callBackJsResult(this.mJsInvoker, String.valueOf(i), str2, str);
    }

    public void readFileSync(String str, String str2, String str3) {
        callBackJsResult(this.mJsInvoker, str2, str3, str);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String getLocale() {
        LogUtil.a(TAG, "getLocale");
        return "";
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void closeWeb() {
        LogUtil.a(TAG, "closeWeb");
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void setTitle(String str) {
        LogUtil.a(TAG, "setTitle");
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class CompactAdapterResponseCallback implements IBaseResponseCallback {
        private String mFunction;
        private WeakReference<H5ProInstance> mInstance;

        CompactAdapterResponseCallback(H5ProInstance h5ProInstance, String str) {
            this.mInstance = new WeakReference<>(h5ProInstance);
            this.mFunction = str;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            H5ProInstance h5ProInstance = this.mInstance.get();
            if (h5ProInstance == null) {
                LogUtil.j(BleOperatorCompactImpl.TAG, "mInstance is null");
                return;
            }
            H5ProJsCbkInvoker<Object> jsCbkInvoker = h5ProInstance.getJsCbkInvoker();
            if (i == 0) {
                LogUtil.a(BleOperatorCompactImpl.TAG, "onResponse success");
                BleOperatorCompactImpl.callBackJsResult(jsCbkInvoker, String.valueOf(0), this.mFunction, null);
            } else {
                LogUtil.a(BleOperatorCompactImpl.TAG, "onResponse fail");
                BleOperatorCompactImpl.callBackJsResult(jsCbkInvoker, String.valueOf(1), this.mFunction, null);
            }
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void getSn(String str) {
        String strE;
        String str2;
        LogUtil.a(TAG, BleConstants.GET_SN);
        String url = GRSManager.c(this.mContext).getUrl("domainWwwHuawei");
        if (TextUtils.isEmpty(url)) {
            LogUtil.j(TAG, "JsInteraction mHuaweiHost is empty");
            url = "https:/";
        }
        boolean zDoAccessTokenCheck = OperationUtils.getInstance().doAccessTokenCheck(this.mContext, str, url + UriConstants.BOTH_BLOOD_GLUCOSE);
        LogUtil.a(TAG, "getSn isLegal = ", Boolean.valueOf(zDoAccessTokenCheck));
        if (zDoAccessTokenCheck) {
            strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "key_sn_sino_blood_sugar");
            str2 = "0";
        } else {
            LogUtil.a(TAG, "doAccessTokenCheck is not legal");
            strE = "";
            str2 = BleConstants.CODE_AUTHORIZED_FAIL;
        }
        HashMap<String, String> map = this.mCallbackMap;
        if (map == null) {
            LogUtil.j(TAG, "getSn mCallbackMap is null");
        } else {
            callBackJsResult(this.mJsInvoker, str2, map.get(BleConstants.GET_SN), strE);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void getAppVersion() {
        PackageInfo packageInfo;
        String str = "";
        try {
            PackageManager packageManager = this.mContext.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.huawei.health", 0)) != null) {
                str = packageInfo.versionCode + "";
            }
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e(TAG, "getAppVersionName() Exception: ", "PackageManager.NameNotFoundException");
        }
        LogUtil.a(TAG, "getAppVersion version = ", str);
        if (this.mCallbackMap == null) {
            LogUtil.j(TAG, "getAppVersion mCallbackMap is null");
        } else if (!TextUtils.isEmpty(str)) {
            callBackJsResultNoErrCode(this.mCallbackMap.get(BleConstants.GET_APP_VERSION), str);
        } else {
            callBackJsResult(this.mJsInvoker, "11", this.mCallbackMap.get(BleConstants.GET_APP_VERSION), null);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void getDeviceInfo(String str) {
        LogUtil.a(TAG, "getDeviceInfo function = ", str);
        if (this.mJsInvoker == null) {
            LogUtil.j(TAG, "getDeviceInfo mJsInvoker is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j(TAG, "getDeviceInfo function null");
                jSONObject.put("errCode", 7);
                jSONObject.put(BleConstants.DEV_INFO, "");
                this.mJsInvoker.invokeJsFunc(str, jSONObject.toString());
                return;
            }
            int authPermission = getAuthPermission(101201);
            LogUtil.a(TAG, "getDeviceInfo  getAuthPermission errorCode = ", Integer.valueOf(authPermission));
            if (authPermission != 0) {
                jSONObject.put("errCode", authPermission);
                jSONObject.put(BleConstants.DEV_INFO, "");
                this.mJsInvoker.invokeJsFunc(str, jSONObject.toString());
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (BluetoothAdapter.checkBluetoothAddress(this.mUniqueId)) {
                jSONObject2.put("mac", this.mUniqueId);
            } else {
                jSONObject2.put("sn", this.mUniqueId);
            }
            jSONObject2.put("devType", "");
            String productInfo = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProductInfo(this.mProductId);
            if (!TextUtils.isEmpty(productInfo)) {
                jSONObject2.put("deviceName", new JSONObject(productInfo).getString("deviceName"));
            }
            String prodId = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProdId(this.mProductId);
            if (!TextUtils.isEmpty(prodId)) {
                jSONObject2.put("prodId", prodId);
            }
            jSONObject2.put(BleConstants.KEY_BR_MAC, this.mDeviceInfo.getAsString(BleConstants.KEY_BR_MAC));
            if (!TextUtils.isEmpty(this.mAttachSn)) {
                jSONObject2.put(BleConstants.ATTACH_SN, this.mAttachSn);
            }
            jSONObject.put("errCode", String.valueOf(0));
            jSONObject.put(BleConstants.DEV_INFO, jSONObject2);
            this.mJsInvoker.invokeJsFunc(str, jSONObject.toString());
        } catch (RemoteException | JSONException unused) {
            LogUtil.j(TAG, "getDeviceInfo fail jsonException or RemoteException");
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public boolean isDarkMode() {
        return qqs.e(this.mContext);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void toast(String str) {
        Toast.makeText(this.mContext, str, 0).show();
    }

    private void initQrCodeAction() {
        LogUtil.a(TAG, "initQrCodeAction");
        this.mQrCodeAction = new CustomPermissionAction(this.mContext) { // from class: com.huawei.operation.h5pro.ble.BleOperatorCompactImpl.2
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a(BleOperatorCompactImpl.TAG, "mQrCodeAction onGranted");
                BleOperatorCompactImpl.this.startScan();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a(BleOperatorCompactImpl.TAG, "mQrCodeAction onDenied");
                super.onDenied(str);
                BleOperatorCompactImpl.this.startScan();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a(BleOperatorCompactImpl.TAG, "mQrCodeAction onForeverDenied");
                BleOperatorCompactImpl.this.startScan();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startScan() {
        Context context = this.mContext;
        if (context instanceof Activity) {
            gsm.a((Activity) context, 20002);
        } else {
            LogUtil.a(TAG, "mContext is not Activity");
        }
    }

    public void handleScanCodeResult(int i, Intent intent) {
        int i2;
        String strB;
        LogUtil.a(TAG, "handleScanCodeResult resultCode: ", Integer.valueOf(i));
        if (i != -1) {
            i2 = 1;
            strB = "";
        } else {
            strB = gsm.b(intent);
            if (checkSnCode(strB)) {
                LogUtil.a(TAG, "handleScanCodeResult SnCode is match");
                i2 = 0;
            } else {
                i2 = 3;
            }
        }
        HashMap<String, String> map = this.mCallbackMap;
        if (map == null) {
            LogUtil.j(TAG, "handleScanCodeResult mCallbackMap is null");
        } else {
            callBackJsResult(this.mJsInvoker, String.valueOf(i2), map.get(BleConstants.ON_SCAN_CODE_RESULT_NAME), strB);
        }
    }

    private boolean checkSnCode(String str) {
        LogUtil.a(TAG, "checkSnCode");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "content is empty");
            return false;
        }
        if (str.length() == 11) {
            return true;
        }
        LogUtil.j(TAG, "sn code does not match the length");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void callBackJsResult(H5ProJsCbkInvoker<Object> h5ProJsCbkInvoker, String str, String str2, String str3) {
        LogUtil.a(TAG, "callBackJsResult callbackFunc ", str2);
        if (TextUtils.isEmpty(str2) || h5ProJsCbkInvoker == null) {
            LogUtil.j(TAG, "callbackFunc or mJsInvoker is null");
            return;
        }
        LogUtil.a(TAG, "callBackJsResult errCode: ", str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", str);
            if (str3 != null) {
                jSONObject.put("data", str3);
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "callBackJsResult fail JSONException");
        }
        String string = jSONObject.toString();
        LogUtil.d(TAG, "callBackJsResult jsonResult: ", string);
        h5ProJsCbkInvoker.invokeJsFunc(str2, string);
    }

    public void callBackJsResult(String str, String str2, String str3) {
        callBackJsResult(this.mJsInvoker, str, str2, str3);
    }

    private void callBackJsResultNoErrCode(String str, String str2) {
        LogUtil.a(TAG, "callBackJsResultNoErrCode");
        if (TextUtils.isEmpty(str) || this.mJsInvoker == null) {
            LogUtil.j(TAG, "callbackFunc or mJsInvoker is null");
        } else {
            LogUtil.d(TAG, "callBackJsResultNoErrCode data: ", str2);
            this.mJsInvoker.invokeJsFunc(str, str2);
        }
    }

    private void getUserInfoData(String str) {
        LogUtil.a(TAG, "getUserInfoData function = ", str);
        BleJsDataApi.getInstance().getUserInfoImpl(new GetUserInfoCallback(this.mH5proInstance, str));
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class GetUserInfoCallback implements ResultCallback {
        private String mFunction;
        private WeakReference<H5ProInstance> mH5ProInstance;

        GetUserInfoCallback(H5ProInstance h5ProInstance, String str) {
            this.mH5ProInstance = new WeakReference<>(h5ProInstance);
            this.mFunction = str;
        }

        @Override // com.huawei.operation.share.ResultCallback
        public void onResult(int i, Object obj) {
            LogUtil.a(BleOperatorCompactImpl.TAG, "getUserInfoData resultCode: ", Integer.valueOf(i));
            H5ProInstance h5ProInstance = this.mH5ProInstance.get();
            if (h5ProInstance == null) {
                LogUtil.j(BleOperatorCompactImpl.TAG, "getUserInfoData instance is null");
                return;
            }
            H5ProJsCbkInvoker<Object> jsCbkInvoker = h5ProInstance.getJsCbkInvoker();
            if (TextUtils.isEmpty(this.mFunction) || jsCbkInvoker == null) {
                LogUtil.j(BleOperatorCompactImpl.TAG, "getUserInfoData function or mJsInvoker is null");
                return;
            }
            if (obj instanceof String) {
                jsCbkInvoker.invokeJsFunc(this.mFunction, obj);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("resultCode", String.valueOf(i));
                jSONObject.put("data", "");
            } catch (JSONException unused) {
                LogUtil.e(BleOperatorCompactImpl.TAG, "getUserInfoData fail JSONException");
            }
            jsCbkInvoker.invokeJsFunc(this.mFunction, jSONObject.toString());
        }
    }

    public void getBoundDeviceInfo(String str, String str2) {
        if (this.mJsInvoker == null || this.mAdapter == null) {
            LogUtil.j(TAG, "getBoundDeviceInfo mJsInvoker is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                int authPermission = getAuthPermission(101201);
                if (authPermission != 0) {
                    LogUtil.a(TAG, "no permission to getBoundDeviceInfo");
                    jSONObject.put("resultCode", authPermission);
                    jSONObject.put("data", "");
                    this.mJsInvoker.invokeJsFunc(str2, jSONObject.toString());
                    return;
                }
                ArrayList<ContentValues> bondedDeviceByProductId = this.mAdapter.getBondedDeviceByProductId(str);
                JSONArray jSONArray = new JSONArray();
                for (ContentValues contentValues : bondedDeviceByProductId) {
                    JSONObject jSONObject2 = new JSONObject();
                    String asString = contentValues.getAsString("uniqueId");
                    String asString2 = contentValues.getAsString("name");
                    if (BluetoothAdapter.checkBluetoothAddress(asString)) {
                        jSONObject2.put("mac", asString);
                    } else {
                        jSONObject2.put("sn", asString);
                    }
                    jSONObject2.put(BleConstants.BLUETOOTH_NAME, asString2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("resultCode", String.valueOf(0));
                jSONObject.put("data", jSONArray);
                LogUtil.a(TAG, "getBoundDeviceInfo mac list size = ", Integer.valueOf(jSONArray.length()));
                this.mJsInvoker.invokeJsFunc(str2, jSONObject.toString());
                return;
            }
            LogUtil.j(TAG, "getBoundDeviceInfo productId or function is null");
            jSONObject.put("resultCode", 7);
            jSONObject.put("data", "");
            this.mJsInvoker.invokeJsFunc(str2, jSONObject.toString());
        } catch (RemoteException | JSONException unused) {
            LogUtil.j(TAG, "getBoundDeviceInfo fail JSONException or RemoteException");
        }
    }

    private int getAuthPermission(int i) throws RemoteException {
        krn h5AppContext = HealthEngineService.INSTANCE.getH5AppContext(this.mContext, this.mH5proInstance);
        if (h5AppContext == null) {
            LogUtil.a(TAG, "mAppContext is null");
            return 2;
        }
        return lcn.e(this.mContext, h5AppContext.getOutOfBandData(), new AppStatusHelper(this.mContext), i, 1);
    }

    public void stopBleState() {
        BroadcastReceiver broadcastReceiver;
        LogUtil.a(TAG, "onStop");
        HealthDataProcessor healthDataProcessor = this.mDataProcessor;
        if (healthDataProcessor != null) {
            healthDataProcessor.stopProcessor();
            this.mDataProcessor = null;
        }
        Context context = this.mContext;
        if (context != null && (broadcastReceiver = this.mBroadcastReceiver) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.mBroadcastReceiver = null;
        }
        this.mJsInvoker = null;
        this.mProductId = null;
        this.mUniqueId = null;
        this.mAdapter = null;
        ContentValues contentValues = this.mDeviceInfo;
        if (contentValues != null) {
            contentValues.clear();
            this.mDeviceInfo = null;
        }
        ArrayList<BleDeviceBean> arrayList = this.mBleDeviceBeans;
        if (arrayList != null) {
            arrayList.clear();
            this.mBleDeviceBeans = null;
        }
        this.mIsConnected = false;
        this.mIsDiscoveredSrv = false;
        if (this.mIsScanning) {
            stopBluetoothDevicesDiscovery();
            this.mIsScanning = false;
        }
        this.mCallbackMap = null;
        this.mDevice = null;
        try {
            if (this.mBluetoothGatt != null && BleConstants.haveScanPermission(this.mContext)) {
                this.mBluetoothGatt.close();
            }
            this.mBluetoothGatt = null;
            this.mBluetoothGattCallback = null;
            this.mGattService = null;
            this.mNotifyCharacteristic = null;
            this.mWriteCharacteristic = null;
            this.mReadCharacteristic = null;
            this.mGattDescriptor = null;
            this.mBluetoothAdapter = null;
            this.mQrCodeAction = null;
            this.mLeScanCallback = null;
            this.mH5proInstance = null;
        } catch (SecurityException e) {
            LogUtil.e(TAG, "stopBleState SecurityException:", ExceptionUtils.c(e));
        }
    }
}
