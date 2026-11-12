package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qqt;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.IMethodResult;
import ohos.ace.adapter.capability.bridge.MethodData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class NativeInvokeArkuiBridge extends OHProBridgePlugin {
    private static final String R_TAG = "R_ArkUIX_NativeInvokeArkuiBridge";
    private static final String TAG = "ArkUIX_NativeInvokeArkuiBridge";
    private ArkuiProcessManager.InvokeArkuiBridgeCallback mInvokeArkuiBridgeCallback;

    public void onDestroy() {
    }

    public NativeInvokeArkuiBridge(Context context, String str, int i) {
        super(context, str, i);
        this.mInvokeArkuiBridgeCallback = new ArkuiProcessManager.InvokeArkuiBridgeCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeArkuiBridge.1
            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onStatusChanger(DeviceInfo deviceInfo, int i2) {
                NativeInvokeArkuiBridge.this.deviceStateChangeCb(deviceInfo.getDeviceName(), deviceInfo.getDeviceIdentify(), i2);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onDataReceived(DeviceInfo deviceInfo, int i2, int i3, byte[] bArr) {
                NativeInvokeArkuiBridge.this.tlvDataCb(deviceInfo, i2, i3, bArr);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onWspStatusChanger(ContentValues contentValues, int i2) {
                NativeInvokeArkuiBridge.this.deviceStateChangeCb(contentValues.getAsString("name"), contentValues.getAsString("uniqueId"), i2);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onWspDataReceived(String str2, String str3, String str4, byte[] bArr) {
                NativeInvokeArkuiBridge.this.wspDataCb(str2, str3, str4, bArr);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onDeviceDelete(String str2, String str3) {
                NativeInvokeArkuiBridge.this.deleteDevicesFromNative(str2, str3);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onConnectDevicesFromNative() {
                NativeInvokeArkuiBridge.this.connectDevicesFromNative();
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void scrollTo(int i2) {
                NativeInvokeArkuiBridge.this.showDevicePageFromNative(i2);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onDiscoverSuccess(String str2, int i2, String str3, int i3) {
                NativeInvokeArkuiBridge.this.onDiscoverSuccess(str2, i2, str3, i3);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onConnectDevice(String str2) {
                NativeInvokeArkuiBridge.this.connectDevice(str2);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void refreshDeviceSource() {
                NativeInvokeArkuiBridge.this.refreshDeviceSource();
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void deviceTabShow(boolean z) {
                NativeInvokeArkuiBridge.this.deviceTabShow(z);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void getShownCurDevice() {
                NativeInvokeArkuiBridge.this.getShownCurDevice();
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void refreshByAccountChange(int i2) {
                NativeInvokeArkuiBridge.this.refreshByAccountChange(i2);
            }
        };
        setCallMethodResultListener();
    }

    public NativeInvokeArkuiBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
        this.mInvokeArkuiBridgeCallback = new ArkuiProcessManager.InvokeArkuiBridgeCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeArkuiBridge.1
            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onStatusChanger(DeviceInfo deviceInfo, int i2) {
                NativeInvokeArkuiBridge.this.deviceStateChangeCb(deviceInfo.getDeviceName(), deviceInfo.getDeviceIdentify(), i2);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onDataReceived(DeviceInfo deviceInfo, int i2, int i3, byte[] bArr) {
                NativeInvokeArkuiBridge.this.tlvDataCb(deviceInfo, i2, i3, bArr);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onWspStatusChanger(ContentValues contentValues, int i2) {
                NativeInvokeArkuiBridge.this.deviceStateChangeCb(contentValues.getAsString("name"), contentValues.getAsString("uniqueId"), i2);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onWspDataReceived(String str2, String str3, String str4, byte[] bArr) {
                NativeInvokeArkuiBridge.this.wspDataCb(str2, str3, str4, bArr);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onDeviceDelete(String str2, String str3) {
                NativeInvokeArkuiBridge.this.deleteDevicesFromNative(str2, str3);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onConnectDevicesFromNative() {
                NativeInvokeArkuiBridge.this.connectDevicesFromNative();
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void scrollTo(int i2) {
                NativeInvokeArkuiBridge.this.showDevicePageFromNative(i2);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onDiscoverSuccess(String str2, int i2, String str3, int i3) {
                NativeInvokeArkuiBridge.this.onDiscoverSuccess(str2, i2, str3, i3);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void onConnectDevice(String str2) {
                NativeInvokeArkuiBridge.this.connectDevice(str2);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void refreshDeviceSource() {
                NativeInvokeArkuiBridge.this.refreshDeviceSource();
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void deviceTabShow(boolean z) {
                NativeInvokeArkuiBridge.this.deviceTabShow(z);
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void getShownCurDevice() {
                NativeInvokeArkuiBridge.this.getShownCurDevice();
            }

            @Override // com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.InvokeArkuiBridgeCallback
            public void refreshByAccountChange(int i2) {
                NativeInvokeArkuiBridge.this.refreshByAccountChange(i2);
            }
        };
        setCallMethodResultListener();
    }

    private void setCallMethodResultListener() {
        setMethodResultListener(new IMethodResult() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeArkuiBridge.2
            @Override // ohos.ace.adapter.capability.bridge.IMethodResult
            public void onSuccess(Object obj) {
                LogUtil.a(NativeInvokeArkuiBridge.TAG, "NativeInvokeArkuiBridge MethodResult onSuccess");
            }

            @Override // ohos.ace.adapter.capability.bridge.IMethodResult
            public void onError(String str, int i, String str2) {
                LogUtil.a(NativeInvokeArkuiBridge.TAG, "NativeInvokeArkuiBridge MethodResult onError: methodName:", str, "errorCode: ", Integer.valueOf(i), " errorMessage:", str2);
            }

            @Override // ohos.ace.adapter.capability.bridge.IMethodResult
            public void onMethodCancel(String str) {
                LogUtil.a(NativeInvokeArkuiBridge.TAG, "NativeInvokeArkuiBridge MethodResult onError: methodName:", str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deviceStateChangeCb(String str, String str2, int i) {
        ReleaseLogUtil.c(R_TAG, "deviceStateChangeCb deviceName:", str, " Identify:", CommonUtil.n(str2), " connectState:", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray(new Object[0]);
        ReleaseLogUtil.c(R_TAG, "deviceStateChangeCb,objects is", array);
        callMethod(new MethodData("deviceStateChangeCb", array));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tlvDataCb(DeviceInfo deviceInfo, int i, int i2, byte[] bArr) {
        ReleaseLogUtil.c(R_TAG, "tlvDataCb");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("commandId", i2);
            jSONObject.put("serviceId", i);
        } catch (JSONException unused) {
            LogUtil.j(TAG, "tlvDataCb JSONException");
        }
        Object[] objArr = {jSONObject, deviceInfo.getDeviceIdentify(), changerBytesJson(bArr)};
        ReleaseLogUtil.c(R_TAG, "tlvDataCb json is ", qqt.b(objArr));
        callMethod(new MethodData("tlvDataCb", objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wspDataCb(String str, String str2, String str3, byte[] bArr) {
        Object[] objArr = {str, str2, str3, changerBytesJson(bArr)};
        ReleaseLogUtil.c(R_TAG, "wspDataCb json is ", qqt.b(objArr));
        callMethod(new MethodData("dataReceivedWspCb", objArr));
    }

    private JSONArray changerBytesJson(byte[] bArr) {
        JSONArray jSONArray = new JSONArray();
        for (byte b2 : bArr) {
            jSONArray.put((int) b2);
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteDevicesFromNative(String str, String str2) {
        ReleaseLogUtil.c(R_TAG, "deleteDevicesFromNative mac: ", str, "  name:", str2);
        callMethod(new MethodData("deleteDevicesFromNative", new Object[]{str, str2}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectDevicesFromNative() {
        ReleaseLogUtil.c(R_TAG, "connectDevicesFromNative");
        callMethod(new MethodData("connectDevicesFromNative", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDiscoverSuccess(String str, int i, String str2, int i2) {
        ReleaseLogUtil.c(R_TAG, "onDiscoverSuccess name:", str, " deviceId:", str2, " btType:", Integer.valueOf(i));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceName", str);
            jSONObject.put("deviceId", str2);
            jSONObject.put("btType", i);
            callMethod(new MethodData("onDiscoverSuccess", new Object[]{jSONObject}));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectDevice(String str) {
        ReleaseLogUtil.c(R_TAG, "connectDevice mac:", str);
        callMethod(new MethodData("connectDevice", new Object[]{str}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDevicePageFromNative(int i) {
        ReleaseLogUtil.c(R_TAG, "showDevicePageFromNative:", Integer.valueOf(i));
        callMethod(new MethodData("showDevicePageFromNative", new Object[]{Integer.valueOf(i)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshDeviceSource() {
        ReleaseLogUtil.c(R_TAG, "refreshDeviceSource");
        callMethod(new MethodData("refreshDeviceSource", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deviceTabShow(boolean z) {
        ReleaseLogUtil.c(R_TAG, "deviceTabShow isShow:", Boolean.valueOf(z));
        if (z) {
            callMethod(new MethodData("deviceTabShow", new Object[]{Boolean.valueOf(z)}));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getShownCurDevice() {
        ReleaseLogUtil.c(R_TAG, "getShownCurDevice");
        callMethod(new MethodData("getShownCurDevice", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshByAccountChange(int i) {
        ReleaseLogUtil.c(R_TAG, "refreshByAccountChange state:", Integer.valueOf(i));
        callMethod(new MethodData("refreshByAccountChange", new Object[]{Integer.valueOf(i)}));
    }
}
