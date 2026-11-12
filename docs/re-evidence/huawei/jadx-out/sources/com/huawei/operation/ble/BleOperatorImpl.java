package com.huawei.operation.ble;

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
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.beans.BleDeviceBean;
import com.huawei.operation.js.BleJsInteraction;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.share.ResultCallback;
import com.huawei.operation.utils.BleJsBiOperate;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.UriConstants;
import com.huawei.operation.utils.Utils;
import com.huawei.operation.utils.WebViewUtils;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.up.utils.Constants;
import defpackage.gsm;
import defpackage.njy;
import defpackage.qqs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HEXUtils;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class BleOperatorImpl implements BleOperator {
    private static final int BINARY_COMPLEMENT = 255;
    private static final String COMMON_DEVICE_INFO = "commonDeviceInfo";
    private static final int DATA_BYTE_LENGTH = 2;
    private static final int DEFAULT_VALUE_BLUETOOTH = 0;
    private static final String DEVICE_INFO_LIST = "DeviceInfoList";
    private static final String DEVICE_MAIN_ACTIVITY = "com.huawei.health.device.ui.DeviceMainActivity";
    private static final String IS_BIND_SUCCESS = "isBindSuccess";
    private static final String KEY_DEVICE_NAME = "name";
    private static final String KEY_PRODUCT_ID = "productId";
    private static final String KEY_UNIQUE_ID = "uniqueId";
    private static final String RELEASE_TAG = "R_BleOperatorImpl";
    private static final int SN_CODE_LENGTH = 11;
    private static final String SWITCH_PLUGIN_DEVICE = "SWITCH_PLUGINDEVICE";
    private static final String TAG = "BleOperatorImpl";
    private static final String THREE_PRODUCT_STRING = "arg1";
    private PluginOperationAdapter mAdapter;
    private ArrayList<BleDeviceBean> mBleDeviceBeans;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothGatt mBluetoothGatt;
    private BluetoothGattCallback mBluetoothGattCallback;
    private BroadcastReceiver mBroadcastReceiver;
    private BluetoothGattDescriptor mCccdDescriptor;
    private Context mContext;
    private long mCurrentTimeMillis;
    private DataProcessor mDataProcessor;
    private BluetoothDevice mDevice;
    private ContentValues mDeviceInfo;
    private BluetoothGattService mGattService;
    private Handler mHandler;
    private int mInterval;
    private boolean mIsAllowDuplicatesKey;
    private boolean mIsScanning;
    private BluetoothGattCharacteristic mNotifyCharacteristic;
    private String mProductId;
    private BluetoothGattCharacteristic mReadCharacteristic;
    private String mUniqueId;
    private WebView mWebView;
    private BluetoothGattCharacteristic mWriteCharacteristic;
    private PermissionsResultAction mQrCodeAction = null;
    private boolean mIsConnected = false;
    private boolean mIsDiscoveredSrv = false;
    private HashMap<String, String> mCallbackMap = null;
    private List<Runnable> mWebViewPostActions = new ArrayList(10);
    private BluetoothAdapter.LeScanCallback mLeScanCallback = new BluetoothAdapter.LeScanCallback() { // from class: com.huawei.operation.ble.BleOperatorImpl.1
        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            if (bluetoothDevice == null || BleOperatorImpl.this.mBleDeviceBeans == null) {
                LogUtil.a(BleOperatorImpl.TAG, "mLeScanCallback device or mBleDeviceBeans is null");
                return;
            }
            BleDeviceBean bleDeviceBean = new BleDeviceBean();
            try {
                bleDeviceBean.setDeviceId(bluetoothDevice.getAddress());
                bleDeviceBean.setRssi(i);
                bleDeviceBean.setAdvertisData(HEXUtils.a(bArr).toUpperCase(Locale.ROOT));
                bleDeviceBean.setLocalName(bluetoothDevice.getName());
                if (bluetoothDevice.getUuids() != null) {
                    bleDeviceBean.setAdvertisServiceUUIDs(Arrays.asList(bluetoothDevice.getUuids()));
                }
                if (!BleOperatorImpl.this.mIsAllowDuplicatesKey || !BleOperatorImpl.this.hasServiceUuid(bluetoothDevice)) {
                    BleOperatorImpl.this.mBleDeviceBeans.add(bleDeviceBean);
                    if (System.currentTimeMillis() - BleOperatorImpl.this.mCurrentTimeMillis >= BleOperatorImpl.this.mInterval) {
                        BleOperatorImpl.this.mCurrentTimeMillis = System.currentTimeMillis();
                        BleOperatorImpl bleOperatorImpl = BleOperatorImpl.this;
                        bleOperatorImpl.foundBluetoothDevicesHandleTask(bleOperatorImpl.mBleDeviceBeans);
                        return;
                    }
                    return;
                }
                LogUtil.a(BleOperatorImpl.TAG, "mBleDeviceBeans has this device");
            } catch (SecurityException e) {
                LogUtil.e(BleOperatorImpl.TAG, "onLeScan SecurityException:", ExceptionUtils.c(e));
            }
        }
    };

    public void startBleState(Context context, String str, WebView webView, Handler handler) {
        if (context == null || str == null || webView == null || handler == null) {
            LogUtil.e(TAG, "startBleState param is null!");
            return;
        }
        this.mContext = context;
        this.mProductId = str;
        this.mWebView = webView;
        this.mHandler = handler;
        this.mCallbackMap = new HashMap<>(16);
        this.mBleDeviceBeans = new ArrayList<>();
        PluginOperationAdapter pluginOperationAdapter = (PluginOperationAdapter) PluginOperation.getInstance(context).getAdapter();
        this.mAdapter = pluginOperationAdapter;
        if (pluginOperationAdapter == null) {
            this.mAdapter = Utils.initPluginOperationAdapter();
        }
        this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        initQrCodeAction();
        Context context2 = this.mContext;
        if ((context2 instanceof WebViewActivity) && isNeedAddBleJs(((WebViewActivity) context2).getUrl())) {
            BleJsInteraction bleJsInteraction = new BleJsInteraction();
            bleJsInteraction.setBleOperator(this);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface(bleJsInteraction, BleConstants.BLE_JSINTERACTION);
            BleJsInteraction bleJsInteraction2 = new BleJsInteraction();
            bleJsInteraction2.setBleOperator(this);
            webView.addJavascriptInterface(bleJsInteraction2, BleConstants.BLE_HI_LINK);
        }
    }

    private void initQrCodeAction() {
        this.mQrCodeAction = new CustomPermissionAction(this.mContext) { // from class: com.huawei.operation.ble.BleOperatorImpl.2
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a(BleOperatorImpl.TAG, "mQrCodeAction: onGranted");
                BleOperatorImpl.this.startScan();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a(BleOperatorImpl.TAG, "mQrCodeAction: onDenied");
                BleOperatorImpl.this.startScan();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a(BleOperatorImpl.TAG, "mQrCodeAction: onForeverDenied");
                BleOperatorImpl.this.startScan();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startScan() {
        Context context = this.mContext;
        if (context instanceof Activity) {
            gsm.a((Activity) context, 20002);
        } else {
            LogUtil.j(TAG, "startScanCode failed: mContext is null");
        }
    }

    private boolean isNeedAddBleJs(String str) {
        if (CommonUtil.cj()) {
            return true;
        }
        return Utils.isBleWhiteUrl(str);
    }

    public void setDeviceInfo(ContentValues contentValues) {
        LogUtil.a(TAG, "setDeviceInfo");
        this.mDeviceInfo = contentValues;
        if (!TextUtils.isEmpty(contentValues.getAsString("uniqueId"))) {
            this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
        }
        if (!TextUtils.isEmpty(this.mProductId) && !TextUtils.isEmpty(this.mUniqueId) && this.mCallbackMap != null) {
            LogUtil.a(TAG, "init mDataProcessor");
            this.mDataProcessor = new DataProcessor.Builder().setDeviceInfo(this.mDeviceInfo).setProductId(this.mProductId).setUniqueId(this.mUniqueId).setHandler(this.mHandler).setCallbackMap(this.mCallbackMap).build();
        } else {
            LogUtil.j(TAG, "init mDataProcessor failed");
        }
    }

    public void stopBleState() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.mContext;
        if (context != null && (broadcastReceiver = this.mBroadcastReceiver) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.mBroadcastReceiver = null;
        }
        this.mContext = null;
        this.mHandler = null;
        this.mProductId = null;
        this.mUniqueId = null;
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
            if (this.mBluetoothGatt != null && BleConstants.haveScanPermission()) {
                this.mBluetoothGatt.close();
            }
            this.mBluetoothGatt = null;
            this.mBluetoothGattCallback = null;
            this.mGattService = null;
            this.mNotifyCharacteristic = null;
            this.mWriteCharacteristic = null;
            this.mReadCharacteristic = null;
            this.mCccdDescriptor = null;
            this.mBluetoothAdapter = null;
            this.mQrCodeAction = null;
            this.mLeScanCallback = null;
            if (njy.b(this.mWebViewPostActions) && this.mWebView != null) {
                Iterator<Runnable> it = this.mWebViewPostActions.iterator();
                while (it.hasNext()) {
                    this.mWebView.removeCallbacks(it.next());
                }
            }
            this.mWebViewPostActions.clear();
            this.mWebView = null;
            this.mDataProcessor = null;
            this.mAdapter = null;
        } catch (SecurityException e) {
            LogUtil.e(TAG, "stopBleState SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionStateHandleTask() {
        String str = this.mCallbackMap.get(BleConstants.ON_BLE_CONNECTION_STATE_CHANGE_CALLBACK_NAME);
        Bundle bundle = new Bundle();
        bundle.putString("function", str);
        bundle.putString("deviceId", this.mProductId);
        bundle.putBoolean("connected", this.mIsConnected);
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = 10002;
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void servicesDiscoveredTask() {
        String str = this.mCallbackMap.get(BleConstants.ON_BLE_SERVICES_DISCOVERED_CALLBACK_NAME);
        Bundle bundle = new Bundle();
        bundle.putString("function", str);
        bundle.putString("deviceId", this.mProductId);
        bundle.putString("errCode", "0");
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = 10003;
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void characteristicHandleTask(int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        if (i == 10004) {
            Bundle bundle = new Bundle();
            bundle.putString("function", this.mCallbackMap.get(BleConstants.ON_BLE_CHARACTERISTIC_VALUE_CHANGE_CALLBACK_NAME));
            bundle.putString("deviceId", this.mProductId);
            bundle.putString(BleConstants.KEY_CHARACTERISTICID, bluetoothGattCharacteristic.getUuid().toString());
            bundle.putString("data", bytesToHexString(bluetoothGattCharacteristic.getValue()));
            Message messageObtainMessage = this.mHandler.obtainMessage();
            messageObtainMessage.what = i;
            messageObtainMessage.setData(bundle);
            this.mHandler.sendMessage(messageObtainMessage);
            return;
        }
        String str = BleConstants.ERRCODE_COMMON_ERR;
        if (i == 10005) {
            if (i2 == 0) {
                str = "0";
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("function", this.mCallbackMap.get(BleConstants.ON_BLE_CHARACTERISTIC_WRITE_CALLBACK_NAME));
            bundle2.putString("errCode", str);
            Message messageObtainMessage2 = this.mHandler.obtainMessage();
            messageObtainMessage2.what = i;
            messageObtainMessage2.setData(bundle2);
            this.mHandler.sendMessage(messageObtainMessage2);
            return;
        }
        if (i == 10006) {
            if (i2 == 0) {
                str = "0";
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("function", this.mCallbackMap.get(BleConstants.ON_BLE_CHARACTERISTIC_READ_CALLBACK_NAME));
            bundle3.putString("data", HEXUtils.a(bluetoothGattCharacteristic.getValue()));
            bundle3.putString("errCode", str);
            Message messageObtainMessage3 = this.mHandler.obtainMessage();
            messageObtainMessage3.what = i;
            messageObtainMessage3.setData(bundle3);
            this.mHandler.sendMessage(messageObtainMessage3);
            return;
        }
        LogUtil.a(TAG, "characteristicHandleTask not VALUE_CHANGE READ WRITE");
    }

    private String bytesToHexString(byte[] bArr) {
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

    private void openBluetoothResultHandleTask(int i, int i2) {
        String str;
        LogUtil.a(TAG, "requestCode = ", Integer.valueOf(i), "resultCode = ", Integer.valueOf(i));
        if (i == 4) {
            LogUtil.a(TAG, "openBluetoothResultHandleTask enter");
            if (i2 != -1) {
                str = BleConstants.ERRCODE_COMMON_ERR;
            } else {
                str = "0";
            }
            String str2 = this.mCallbackMap.get(BleConstants.ON_OPEN_BLE_ADAPTER);
            this.mWebView.loadUrl(WebViewUtils.getUrl(str2, str));
            LogUtil.a(TAG, "handleOpenBluetoothAdapter end result = ", str, "function = ", str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void foundBluetoothDevicesHandleTask(ArrayList<BleDeviceBean> arrayList) {
        String str = this.mCallbackMap.get(BleConstants.ON_BLE_DEVICE_FOUND);
        if (str == null || njy.e(arrayList)) {
            LogUtil.e(TAG, "foundBluetoothDevicesHandleTask function or bleDeviceBeans is null");
            return;
        }
        String json = new Gson().toJson(arrayList);
        this.mWebView.loadUrl(WebViewUtils.getUrl(str, json));
        LogUtil.d(TAG, "callJsOnBluetoothDeviceFound ", json);
        this.mBleDeviceBeans.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mtuChangedHandleTask(int i, int i2) {
        String str;
        if (i2 == 0) {
            str = "0";
        } else {
            str = BleConstants.ERRCODE_COMMON_ERR;
        }
        JSONObject jSONObject = new JSONObject();
        String str2 = this.mCallbackMap.get(BleConstants.REGISTER_REQUEST_MTU_CALLBACK_NAME);
        if (str2 == null) {
            LogUtil.e(TAG, "mtuChangedHandleTask function is null");
            return;
        }
        try {
            jSONObject.put("errCode", str);
            jSONObject.put("data", i);
            String string = jSONObject.toString();
            Runnable action = getAction(str2, string);
            this.mWebViewPostActions.add(action);
            this.mWebView.post(action);
            LogUtil.d(TAG, "callJsRequestMtu ", string);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "callJsRequestMtu fail JsonException");
        }
    }

    private Runnable getAction(final String str, final String str2) {
        return new Runnable() { // from class: com.huawei.operation.ble.BleOperatorImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1516lambda$getAction$0$comhuaweioperationbleBleOperatorImpl(str, str2);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$getAction$0$com-huawei-operation-ble-BleOperatorImpl, reason: not valid java name */
    /* synthetic */ void m1516lambda$getAction$0$comhuaweioperationbleBleOperatorImpl(String str, String str2) {
        this.mWebViewPostActions.remove(this);
        this.mWebView.loadUrl(WebViewUtils.getUrl(str, str2));
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void getSn(String str) {
        String strE;
        String str2;
        LogUtil.a(TAG, BleConstants.GET_SN);
        String url = GRSManager.c(this.mContext).getUrl("domainWwwHuawei");
        if (TextUtils.isEmpty(url)) {
            LogUtil.a(TAG, "JsInteraction huaweiHost is empty");
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
        callBackJsResult(str2, this.mCallbackMap.get(BleConstants.GET_SN), strE);
    }

    private void callBackJsResult(String str, String str2, String str3) {
        LogUtil.a(TAG, "callBackJsResult");
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j(TAG, "callBackJsResult is null");
            return;
        }
        LogUtil.a(TAG, "callBackJsResult errCode: ", str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", str);
            if (str3 != null) {
                jSONObject.put("data", str3);
            }
            Runnable action = getAction(str2, jSONObject.toString());
            this.mWebViewPostActions.add(action);
            this.mWebView.post(action);
        } catch (JSONException unused) {
            LogUtil.j(TAG, "callBackJsResult fail jsonException");
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
            callBackJsResult("11", this.mCallbackMap.get(BleConstants.GET_APP_VERSION), null);
        }
    }

    private void callBackJsResultNoErrCode(String str, String str2) {
        LogUtil.a(TAG, "callBackJsResultNoErrCode");
        if (TextUtils.isEmpty(str)) {
            LogUtil.e(TAG, "callbackFunc is null");
            return;
        }
        LogUtil.d(TAG, "callBackJsResultNoErrCode data: ", str2);
        Runnable action = getAction(str, str2);
        this.mWebViewPostActions.add(action);
        this.mWebView.post(action);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void getDeviceInfo(String str) {
        LogUtil.a(TAG, "getDeviceInfo function = ", str);
        try {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j(TAG, "getDeviceInfo function null");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (BluetoothAdapter.checkBluetoothAddress(this.mUniqueId)) {
                jSONObject.put("mac", this.mUniqueId);
            } else {
                jSONObject.put("sn", this.mUniqueId);
            }
            jSONObject.put("devType", "");
            String productInfo = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProductInfo(this.mProductId);
            if (!TextUtils.isEmpty(productInfo)) {
                jSONObject.put("deviceName", new JSONObject(productInfo).getString("deviceName"));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errCode", String.valueOf(0));
            jSONObject2.put(BleConstants.DEV_INFO, jSONObject);
            Runnable action = getAction(str, jSONObject2.toString());
            this.mWebViewPostActions.add(action);
            this.mWebView.post(action);
        } catch (JSONException unused) {
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
            LogUtil.a(BleOperatorImpl.TAG, "onConnectionStateChange, status:", Integer.valueOf(i2));
            if (bluetoothGatt != null) {
                if (i2 == 2) {
                    try {
                        bluetoothGatt.discoverServices();
                        BleOperatorImpl.this.mIsConnected = true;
                    } catch (SecurityException e) {
                        LogUtil.e(BleOperatorImpl.TAG, "onConnectionStateChange SecurityException:", ExceptionUtils.c(e));
                        return;
                    }
                }
                if (i2 == 0) {
                    LogUtil.j(BleOperatorImpl.TAG, "BleOperatorImpl it's disconnected");
                    BleOperatorImpl.this.mIsDiscoveredSrv = false;
                    BleOperatorImpl.this.mIsConnected = false;
                }
                BleOperatorImpl.this.connectionStateHandleTask();
                new BleJsBiOperate().tickBiBleConnect(BleOperatorImpl.this.mDeviceInfo, i2, BleOperatorImpl.this.mProductId);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            LogUtil.a(BleOperatorImpl.TAG, "onServicesDiscovered, status=" + i);
            if (bluetoothGatt == null || i != 0) {
                return;
            }
            BleOperatorImpl.this.mIsDiscoveredSrv = true;
            BleOperatorImpl.this.servicesDiscoveredTask();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            LogUtil.a(BleOperatorImpl.TAG, "onCharacteristicChanged");
            BleOperatorImpl.this.characteristicHandleTask(10004, bluetoothGattCharacteristic, 0);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LogUtil.a(BleOperatorImpl.TAG, "onCharacteristicWrite, status=" + i);
            BleOperatorImpl.this.characteristicHandleTask(10005, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LogUtil.a(BleOperatorImpl.TAG, "onCharacteristicRead, status=" + i);
            BleOperatorImpl.this.characteristicHandleTask(10006, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onMtuChanged(bluetoothGatt, i, i2);
            LogUtil.a(BleOperatorImpl.TAG, "onMtuChanged, status = ", Integer.valueOf(i2), " mtu = ", Integer.valueOf(i));
            BleOperatorImpl.this.mtuChangedHandleTask(i, i2);
        }
    }

    private String openBlu() {
        String str = BleConstants.ERRCODE_COMMON_ERR;
        LogUtil.a(TAG, "openBlu");
        try {
            BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
            if (bluetoothAdapter == null || bluetoothAdapter.isEnabled()) {
                str = "0";
            }
            LogUtil.a(TAG, "openBlu result:", str);
            return str;
        } catch (SecurityException e) {
            LogUtil.e(TAG, "openBlu SecurityException:", ExceptionUtils.c(e));
            return BleConstants.ERRCODE_COMMON_ERR;
        }
    }

    private String closeBlu() {
        String str = BleConstants.ERRCODE_COMMON_ERR;
        LogUtil.a(TAG, "closeBlu");
        try {
            BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
            if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
                str = "0";
            }
            LogUtil.a(TAG, "closeBlu result:", str);
            return str;
        } catch (SecurityException e) {
            LogUtil.e(TAG, "closeBlu SecurityException:", ExceptionUtils.c(e));
            return BleConstants.ERRCODE_COMMON_ERR;
        }
    }

    private void getBluState() {
        if (this.mBluetoothAdapter != null) {
            if (!BleConstants.haveScanPermission()) {
                ReleaseLogUtil.e(RELEASE_TAG, "getBluState need permission!");
                return;
            }
            try {
                boolean z = this.mBluetoothAdapter.getState() == 12;
                boolean zIsDiscovering = this.mBluetoothAdapter.isDiscovering();
                Bundle bundle = new Bundle();
                bundle.putBoolean(BleConstants.KEY_DISCOVERING, zIsDiscovering);
                bundle.putBoolean(BleConstants.KEY_AVAILABLE, z);
                bundle.putString("function", this.mCallbackMap.get(BleConstants.GET_BLUETOOTH_ADAPTIVE_STATE_CALLBACK_NAME));
                bundle.putString("errCode", "0");
                Message messageObtainMessage = this.mHandler.obtainMessage();
                messageObtainMessage.what = 10007;
                messageObtainMessage.setData(bundle);
                this.mHandler.sendMessage(messageObtainMessage);
            } catch (SecurityException e) {
                LogUtil.e(TAG, "getBluState SecurityException:", ExceptionUtils.c(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBluetoothAdapterStateChange(boolean z) {
        if (this.mBluetoothAdapter != null) {
            if (!BleConstants.haveScanPermission()) {
                ReleaseLogUtil.e(RELEASE_TAG, "handleBluetoothAdapterStateChange need permission!");
                return;
            }
            try {
                boolean zIsDiscovering = this.mBluetoothAdapter.isDiscovering();
                JSONObject jSONObject = new JSONObject();
                String str = this.mCallbackMap.get(BleConstants.ON_BLUETOOTH_ADAPTER_STATE_CHANGE_CALLBACK_NAME);
                if (str == null) {
                    LogUtil.j(TAG, "handleBluetoothAdapterStateChange function is null");
                    return;
                }
                jSONObject.put(BleConstants.KEY_DISCOVERING, zIsDiscovering);
                jSONObject.put(BleConstants.KEY_AVAILABLE, z);
                String string = jSONObject.toString();
                this.mWebView.loadUrl(WebViewUtils.getUrl(str, string));
                LogUtil.d(TAG, "callJsOnBleAdapterStateChange ", string);
            } catch (SecurityException | JSONException e) {
                LogUtil.e(TAG, "callJsOnBleAdapterStateChange Exception:", ExceptionUtils.c(e));
            }
        }
    }

    private void getUserInfoData(String str) {
        LogUtil.a(TAG, "getUserInfoData function = ", str);
        final JSONObject jSONObject = new JSONObject();
        BleJsDataApi.getInstance().getUserInfoImpl(new ResultCallback() { // from class: com.huawei.operation.ble.BleOperatorImpl$$ExternalSyntheticLambda1
            @Override // com.huawei.operation.share.ResultCallback
            public final void onResult(int i, Object obj) {
                this.f$0.m1517xb265b208(jSONObject, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getUserInfoData$1$com-huawei-operation-ble-BleOperatorImpl, reason: not valid java name */
    /* synthetic */ void m1517xb265b208(JSONObject jSONObject, int i, Object obj) {
        Bundle bundle = new Bundle();
        bundle.putString("function", this.mCallbackMap.get(BleConstants.ON_GET_USER_INFO_RESULT_NAME));
        bundle.putString("errCode", String.valueOf(i));
        if (obj instanceof String) {
            bundle.putString("data", (String) obj);
        } else {
            try {
                jSONObject.put("resultCode", String.valueOf(i));
                jSONObject.put("data", "");
            } catch (JSONException unused) {
                LogUtil.e(TAG, "getUserInfoData JSONException");
            }
            bundle.putString("data", jSONObject.toString());
        }
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = 10011;
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessage(messageObtainMessage);
    }

    private String connect(String str) {
        String bondedDeviceAddress;
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
        LogUtil.a(TAG, "connectByMacAddress");
        if (!BleConstants.haveScanPermission()) {
            ReleaseLogUtil.a(RELEASE_TAG, "connectByMacAddress need permission!");
            return BleConstants.ERRCODE_COMMON_ERR;
        }
        try {
            BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
            if (bluetoothAdapter != null) {
                this.mDevice = bluetoothAdapter.getRemoteDevice(str);
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
            LogUtil.e(TAG, "connectByMacAddress Exception:", ExceptionUtils.c(e));
            return BleConstants.ERRCODE_BLE_CONNECT_ERROR;
        }
    }

    private void disconnect(String str) {
        if (!BleConstants.haveScanPermission()) {
            ReleaseLogUtil.a(RELEASE_TAG, "disconnect need permission!");
            return;
        }
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
            this.mCccdDescriptor = descriptor;
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
            if (!BleConstants.haveScanPermission()) {
                ReleaseLogUtil.e(RELEASE_TAG, "setCharNotification need permission!");
                return false;
            }
            if (this.mCccdDescriptor != null) {
                if (this.mBluetoothGatt.setCharacteristicNotification(this.mNotifyCharacteristic, z) && this.mCccdDescriptor.setValue(bArr) && this.mBluetoothGatt.writeDescriptor(this.mCccdDescriptor)) {
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
            if (!BleConstants.haveScanPermission()) {
                ReleaseLogUtil.e(RELEASE_TAG, "setCharIndication need permission!");
                return false;
            }
            if (this.mCccdDescriptor != null) {
                if (this.mBluetoothGatt.setCharacteristicNotification(this.mNotifyCharacteristic, z) && this.mCccdDescriptor.setValue(bArr) && this.mBluetoothGatt.writeDescriptor(this.mCccdDescriptor)) {
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

    private void writeCharacteristic(String str, String str2) {
        try {
            BluetoothGattService bluetoothGattService = this.mGattService;
            if (bluetoothGattService != null) {
                this.mWriteCharacteristic = bluetoothGattService.getCharacteristic(UUID.fromString(str));
            }
            if (!BleConstants.haveScanPermission()) {
                ReleaseLogUtil.a(RELEASE_TAG, "writeCharacteristic need permission!");
            } else if (this.mWriteCharacteristic != null) {
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
        try {
            BluetoothGattService bluetoothGattService = this.mGattService;
            if (bluetoothGattService != null) {
                this.mReadCharacteristic = bluetoothGattService.getCharacteristic(UUID.fromString(str));
            }
            if (!BleConstants.haveScanPermission()) {
                ReleaseLogUtil.a(RELEASE_TAG, "readCharacteristic need permission!");
                return;
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
    public String openBluetoothAdapter() {
        LogUtil.a(TAG, BleConstants.ON_OPEN_BLE_ADAPTER);
        return openBlu();
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void openBluetoothAdapterWithCallBack() {
        LogUtil.a(TAG, "openBluetoothAdapterWithCallBack enter");
        if (!BleConstants.haveScanPermission()) {
            ReleaseLogUtil.a(RELEASE_TAG, "openBluetoothAdapter need permission!");
            this.mWebView.loadUrl(WebViewUtils.getUrl(this.mCallbackMap.get(BleConstants.ON_OPEN_BLE_ADAPTER), BleConstants.ERRCODE_COMMON_ERR));
        } else {
            try {
                BaseApplication.getActivity().startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 4);
            } catch (ActivityNotFoundException unused) {
                LogUtil.a(TAG, "openBluetoothAdapter ActivityNotFoundException");
                this.mWebView.loadUrl(WebViewUtils.getUrl(this.mCallbackMap.get(BleConstants.ON_OPEN_BLE_ADAPTER), BleConstants.ERRCODE_COMMON_ERR));
            }
            LogUtil.a(TAG, "openBluetoothAdapterWithCallBack end");
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a(TAG, "onActivityResult  requestCode = ", Integer.valueOf(i), "resultCode = ", Integer.valueOf(i));
        openBluetoothResultHandleTask(i, i2);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String closeBluetoothAdapter() {
        LogUtil.a(TAG, "closeBluetoothAdapter");
        return closeBlu();
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void getBluetoothAdapterState() {
        LogUtil.a(TAG, BleConstants.GET_BLUETOOTH_ADAPTIVE_STATE_CALLBACK_NAME);
        getBluState();
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void onBluetoothAdapterStateChange() {
        LogUtil.a(TAG, BleConstants.ON_BLUETOOTH_ADAPTER_STATE_CHANGE_CALLBACK_NAME);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        if (this.mBroadcastReceiver == null) {
            this.mBroadcastReceiver = getBroadcastReceiver();
        }
        Context context = this.mContext;
        if (context != null) {
            context.registerReceiver(this.mBroadcastReceiver, intentFilter);
        }
    }

    private BroadcastReceiver getBroadcastReceiver() {
        return new BroadcastReceiver() { // from class: com.huawei.operation.ble.BleOperatorImpl.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LogUtil.a(BleOperatorImpl.TAG, "onReceive: " + intent.getAction());
                if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                    switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0)) {
                        case 10:
                            LogUtil.a(BleOperatorImpl.TAG, "STATE_OFF");
                            BleOperatorImpl.this.handleBluetoothAdapterStateChange(false);
                            break;
                        case 11:
                            LogUtil.a(BleOperatorImpl.TAG, "STATE_TURNING_ON");
                            BleOperatorImpl.this.handleBluetoothAdapterStateChange(false);
                            break;
                        case 12:
                            LogUtil.a(BleOperatorImpl.TAG, "STATE_ON");
                            BleOperatorImpl.this.handleBluetoothAdapterStateChange(true);
                            break;
                        case 13:
                            LogUtil.a(BleOperatorImpl.TAG, "STATE_TURNING_OFF");
                            BleOperatorImpl.this.handleBluetoothAdapterStateChange(false);
                            break;
                    }
                }
            }
        };
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void getUserInfo(String str) {
        LogUtil.a(TAG, Constants.METHOD_GET_USER_INFO);
        getUserInfoData(str);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void startScanCode(String str) {
        LogUtil.a(TAG, "startScanCode");
        if (this.mQrCodeAction == null) {
            initQrCodeAction();
        }
        PermissionUtil.d(this.mContext, PermissionUtil.PermissionType.CAMERA, this.mQrCodeAction);
    }

    public void handleScanCodeResult(int i, Intent intent) {
        String strB;
        LogUtil.a(TAG, "handleScanCodeResult");
        String strValueOf = String.valueOf(1);
        if (i != -1) {
            strB = "";
        } else {
            strB = gsm.b(intent);
            if (checkSnCode(strB)) {
                LogUtil.a(TAG, "handleScanCodeResult SnCode is match");
                strValueOf = String.valueOf(0);
            } else {
                strValueOf = String.valueOf(3);
            }
        }
        LogUtil.a(TAG, "handleScanCodeResult resultCodeStr: ", strValueOf, "dataStr: ", CommonUtil.n(strB));
        handleJsCallbackResult(strB, strValueOf, BleConstants.ON_SCAN_CODE_RESULT_NAME);
    }

    private boolean checkSnCode(String str) {
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

    @Override // com.huawei.operation.ble.BleOperator
    public void syncCloud(String str, String str2) {
        LogUtil.a(TAG, "syncCloud");
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "uniqueId is empty!");
            handleJsCallbackResult(null, String.valueOf(2), BleConstants.ON_SYNC_CLOUD_RESULT_NAME);
        } else {
            ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).syncCloud(20000, new IBaseResponseCallback() { // from class: com.huawei.operation.ble.BleOperatorImpl$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f$0.m1518lambda$syncCloud$2$comhuaweioperationbleBleOperatorImpl(i, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$syncCloud$2$com-huawei-operation-ble-BleOperatorImpl, reason: not valid java name */
    /* synthetic */ void m1518lambda$syncCloud$2$comhuaweioperationbleBleOperatorImpl(int i, Object obj) {
        if (i == 0) {
            LogUtil.a(TAG, "syncCloud success");
            handleJsCallbackResult(null, String.valueOf(0), BleConstants.ON_SYNC_CLOUD_RESULT_NAME);
        } else {
            LogUtil.a(TAG, "syncCloud fail, errCode: ", Integer.valueOf(i));
            handleJsCallbackResult(null, String.valueOf(1), BleConstants.ON_SYNC_CLOUD_RESULT_NAME);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void bindDevice(String str) {
        LogUtil.a(TAG, "bindDevice");
        if (this.mAdapter == null) {
            LogUtil.j(TAG, "bindDevice mAdapter is null!");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("uuid");
            String string2 = jSONObject.getString(BleConstants.MEASUREKIT_ID);
            String string3 = jSONObject.getString("sn");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                String string4 = jSONObject.getString("deviceName");
                String string5 = jSONObject.getString("uniqueId");
                if (!TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string5)) {
                    int iBindDevice = this.mAdapter.bindDevice(string, string2, string3, string4, string5);
                    LogUtil.a(TAG, "bindDevice resultCode: ", Integer.valueOf(iBindDevice));
                    handleJsCallbackResult(null, String.valueOf(iBindDevice), BleConstants.ON_BIND_DEVICE_RESULT_NAME);
                    ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).uploadDataToHota(string, str);
                    if (iBindDevice == 0) {
                        startDeviceInfoActivity(string, string5, string4);
                        return;
                    }
                    return;
                }
                LogUtil.j(TAG, "bindDevice deviceName or uniqueId is empty");
                handleJsCallbackResult(null, String.valueOf(2), BleConstants.ON_BIND_DEVICE_RESULT_NAME);
                return;
            }
            LogUtil.j(TAG, "bindDevice productId or measureKitId or serialNumber is empty");
            handleJsCallbackResult(null, String.valueOf(2), BleConstants.ON_BIND_DEVICE_RESULT_NAME);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "bindDevice parseData fail JSONException");
            handleJsCallbackResult(null, String.valueOf(2), BleConstants.ON_BIND_DEVICE_RESULT_NAME);
        }
    }

    private void startDeviceInfoActivity(String str, String str2, String str3) {
        LogUtil.a(TAG, "startDeviceInfoActivity");
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setAction(SWITCH_PLUGIN_DEVICE);
        bundle.putString(THREE_PRODUCT_STRING, DEVICE_INFO_LIST);
        bundle.putString("productId", str);
        bundle.putString("uniqueId", str2);
        intent.setPackage(this.mContext.getPackageName());
        intent.setClassName(this.mContext.getPackageName(), DEVICE_MAIN_ACTIVITY);
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", str);
        contentValues.put("uniqueId", str2);
        contentValues.put("name", str3);
        bundle.putParcelable(COMMON_DEVICE_INFO, contentValues);
        intent.putExtras(bundle);
        intent.putExtra(IS_BIND_SUCCESS, true);
        Context context = this.mContext;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.startActivity(intent);
            activity.finish();
        }
    }

    private void handleJsCallbackResult(String str, String str2, String str3) {
        if (this.mCallbackMap == null) {
            LogUtil.j(TAG, "handleBindDeviceResult mCallbackMap is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("function", this.mCallbackMap.get(str3));
        bundle.putString("errCode", str2);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("data", str);
        }
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = 10009;
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String getDeviceId() {
        LogUtil.d(TAG, "getDeviceId：" + this.mProductId);
        return this.mProductId;
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String createBleConnection(String str) {
        LogUtil.a(TAG, "createBleConnection");
        return connect(str);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String closeBleConnection(String str) {
        LogUtil.a(TAG, "closeBleConnection");
        disconnect(str);
        return "0";
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void setCallBackName(String str, String str2, String str3) {
        LogUtil.a(TAG, "setCallBackName, function = ", str2);
        if (this.mProductId.equals(str)) {
            this.mCallbackMap.put(str3, str2);
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
        LogUtil.a(TAG, "startBluetoothDevicesDiscovery mIsScanning is " + this.mIsScanning);
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
        LogUtil.a(TAG, "stopBluetoothDevicesDiscovery mIsScanning is:", Boolean.valueOf(this.mIsScanning));
        try {
            if (this.mIsScanning) {
                this.mIsScanning = false;
                this.mBluetoothAdapter.stopLeScan(this.mLeScanCallback);
                return "0";
            }
            return "0";
        } catch (SecurityException e) {
            LogUtil.e(TAG, "stopBluetoothDevicesDiscovery SecurityException:", ExceptionUtils.c(e));
            return BleConstants.ERRCODE_COMMON_ERR;
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public boolean notifyBleCharacteristicValueChange(String str, String str2, String str3, boolean z) {
        LogUtil.a(TAG, "notifyBleCharacteristicValueChange");
        if (this.mProductId.equals(str)) {
            if (this.mIsConnected && this.mIsDiscoveredSrv) {
                return setClientCharacteristicConfigDescriptor(str2, str3, z);
            }
            LogUtil.e(TAG, "notifyBleCharacteristicValueChange BleState is not Correct");
            return false;
        }
        LogUtil.e(TAG, "notifyBleCharacteristicValueChange deviceId is not Correct");
        return false;
    }

    @Override // com.huawei.operation.ble.BleOperator
    public boolean indicationBleCharacteristicValueChange(String str, String str2, String str3, boolean z) {
        LogUtil.a(TAG, "indicationBleCharacteristicValueChange");
        if (this.mProductId.equals(str)) {
            if (this.mIsConnected && this.mIsDiscoveredSrv) {
                return setClientCharacteristicConfigDescriptorIndication(str2, str3, z);
            }
            LogUtil.e(TAG, "indicationBleCharacteristicValueChange BleState is not Correct");
            return false;
        }
        LogUtil.e(TAG, "indicationBleCharacteristicValueChange deviceId is not Correct");
        return false;
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
    public String requestConnectionPriority(int i) {
        LogUtil.a(TAG, "requestConnectionPriority :", Integer.valueOf(i));
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
            LogUtil.j(TAG, "mBluetoothGatt or mBluetoothAdapter is null");
            return BleConstants.ERRCODE_COMMON_ERR;
        } catch (SecurityException e) {
            LogUtil.e(TAG, "judgeBluetoothEnable SecurityException:", ExceptionUtils.c(e));
            return BleConstants.ERRCODE_COMMON_ERR;
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String requestMtu(int i) {
        LogUtil.a(TAG, "requestMtu:", Integer.valueOf(i));
        if (this.mBluetoothGatt == null) {
            LogUtil.j(TAG, "mBluetoothGatt is null");
            return BleConstants.ERRCODE_COMMON_ERR;
        }
        if (!BleConstants.haveScanPermission()) {
            ReleaseLogUtil.e(RELEASE_TAG, "requestMtu need permission!");
            return BleConstants.ERRCODE_COMMON_ERR;
        }
        try {
            return this.mBluetoothGatt.requestMtu(i) ? "0" : BleConstants.ERRCODE_COMMON_ERR;
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
    public void execQuery(String str, String str2) {
        LogUtil.a(TAG, "execQuery");
        DataProcessor dataProcessor = this.mDataProcessor;
        if (dataProcessor == null) {
            LogUtil.a(TAG, "execQuery mDataProcessor is null");
        } else {
            dataProcessor.execQuery(str);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void hasHealthDataQuery(String str, String str2) {
        LogUtil.a(TAG, "hasHealthDataQuery function = ", str2);
        DataProcessor dataProcessor = this.mDataProcessor;
        if (dataProcessor == null) {
            LogUtil.a(TAG, "hasHealthDataQuery mDataProcessor is null");
        } else {
            dataProcessor.hasHealthDataQuery(str);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void save(String str) {
        LogUtil.a(TAG, "save");
        DataProcessor dataProcessor = this.mDataProcessor;
        if (dataProcessor == null) {
            LogUtil.a(TAG, "save mDataProcessor is null");
            return;
        }
        dataProcessor.setIsRetryFailed(false);
        this.mDataProcessor.setUserUuid(this.mAdapter.getCurrentUserUuid());
        this.mDataProcessor.saveData(str);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void saveMultipleData(String str, String str2) {
        LogUtil.a(TAG, "saveMultipleData");
        DataProcessor dataProcessor = this.mDataProcessor;
        if (dataProcessor == null) {
            LogUtil.a(TAG, "saveMultipleData mDataProcessor is null");
            return;
        }
        dataProcessor.setIsRetryFailed(false);
        this.mDataProcessor.setUserUuid(this.mAdapter.getCurrentUserUuid());
        this.mDataProcessor.saveMultipleData(str);
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void deleteMultipleHealthData(String str, String str2) {
        LogUtil.a(TAG, BleConstants.ON_DELETE_MEASURE_RESULT_NAME);
        DataProcessor dataProcessor = this.mDataProcessor;
        if (dataProcessor == null) {
            LogUtil.a(TAG, "deleteMultipleHealthData mDataProcessor is null");
        } else {
            dataProcessor.deleteMultipleHealthData(str);
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public String getLocale() {
        if (this.mAdapter == null) {
            LogUtil.a(TAG, "getLocale mAdapter is null!");
            return "";
        }
        Context context = this.mContext;
        if (!(context instanceof WebViewActivity)) {
            return "";
        }
        if (!this.mAdapter.checkWhiteUrl(((WebViewActivity) context).getUrl())) {
            return "";
        }
        String locale = this.mAdapter.getLocale();
        LogUtil.a(TAG, "getLocale return:", locale);
        return locale;
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void closeWeb() {
        LogUtil.a(TAG, "closeWeb");
        Context context = this.mContext;
        if (context instanceof WebViewActivity) {
            ((WebViewActivity) context).finish();
        }
    }

    @Override // com.huawei.operation.ble.BleOperator
    public void setTitle(String str) {
        LogUtil.a(TAG, "setTitle title:", str);
        Context context = this.mContext;
        if (context instanceof WebViewActivity) {
            ((WebViewActivity) context).setTitle(str);
        }
    }
}
