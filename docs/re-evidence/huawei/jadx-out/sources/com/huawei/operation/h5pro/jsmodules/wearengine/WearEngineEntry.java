package com.huawei.operation.h5pro.jsmodules.wearengine;

import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.wearengine.auth.AuthCallback;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.client.ServiceConnectionListener;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorData;
import com.huawei.wearengine.monitor.MonitorItem;
import com.huawei.wearengine.monitor.MonitorListener;
import com.huawei.wearengine.p2p.PingCallback;
import com.huawei.wearengine.p2p.Receiver;
import com.huawei.wearengine.p2p.SendCallback;
import defpackage.yhw;
import defpackage.yim;
import defpackage.yjj;
import defpackage.ykb;
import defpackage.ykf;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class WearEngineEntry extends JsBaseModule {
    private static final String ERR_MSG_NO_CONNECTED = "no device is connected";
    private static final String PARAMS_KEY_PEER_FINGER_PRINT = "peerFingerPrint";
    private static final String PARAMS_KEY_PEER_PKG_NAME = "peerPkgName";
    private static final String PARAMS_KEY_UDID = "udid";
    private List<Device> mDeviceList = new ArrayList();
    private final SparseArray<Receiver> mReceiverMap = new SparseArray<>();
    private yjj mMonitorClient = null;
    private MonitorListener mMonitorListener = null;
    private yim mWearEngineClient = null;

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        if (this.mReceiverMap.size() == 0) {
            return;
        }
        for (int i = 0; i < this.mReceiverMap.size(); i++) {
            yhw.d(this.mContext).d(this.mReceiverMap.valueAt(i)).addOnSuccessListener(new OnSuccessListenerImpl()).addOnFailureListener(new OnFailureListenerImpl());
        }
        this.mReceiverMap.clear();
        super.onDestroy();
    }

    @JavascriptInterface
    public void requestPermission(long j) {
        LogUtil.i(this.TAG, "requestPermission enter");
        yhw.b(this.mContext).d(new AuthCallback() { // from class: com.huawei.operation.h5pro.jsmodules.wearengine.WearEngineEntry.1
            @Override // com.huawei.wearengine.auth.AuthCallback
            public void onOk(Permission[] permissionArr) {
                LogUtil.d(WearEngineEntry.this.TAG, "requestPermission -> " + Arrays.toString(permissionArr));
            }

            @Override // com.huawei.wearengine.auth.AuthCallback
            public void onCancel() {
                LogUtil.i(WearEngineEntry.this.TAG, "requestPermission onCancel");
            }
        }, Permission.DEVICE_MANAGER).addOnSuccessListener(new OnSuccessListenerImpl(this.mH5ProInstance, j)).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j));
    }

    @JavascriptInterface
    public void getBondedDevices(final long j) {
        LogUtil.i(this.TAG, "getBondedDevices enter");
        yhw.c(this.mContext).c().addOnSuccessListener(new OnSuccessListener<List<Device>>() { // from class: com.huawei.operation.h5pro.jsmodules.wearengine.WearEngineEntry.2
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public void onSuccess(List<Device> list) {
                WearEngineEntry.this.mDeviceList = list;
                LogUtil.d(WearEngineEntry.this.TAG, "getBondedDevices: onSuccess" + String.valueOf(WearEngineEntry.this.mDeviceList));
                try {
                    WearEngineEntry wearEngineEntry = WearEngineEntry.this;
                    wearEngineEntry.onSuccessCallback(j, WearEngineUtils.devicesToJsonArray(wearEngineEntry.mDeviceList));
                } catch (JSONException unused) {
                    WearEngineEntry wearEngineEntry2 = WearEngineEntry.this;
                    wearEngineEntry2.onSuccessCallback(j, String.valueOf(wearEngineEntry2.mDeviceList));
                }
            }
        }).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j));
    }

    @JavascriptInterface
    public void getP2pClient(long j, String str) {
        String strOptString;
        LogUtil.i(this.TAG, "getP2pClient enter");
        String strOptString2 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString(PARAMS_KEY_PEER_PKG_NAME);
            try {
                if (jSONObject.has("udid")) {
                    strOptString2 = jSONObject.optString("udid");
                }
            } catch (JSONException unused) {
                LogUtil.e(this.TAG, "getP2pClient: JSONException");
            }
        } catch (JSONException unused2) {
            strOptString = "";
        }
        if (TextUtils.isEmpty(strOptString)) {
            onFailureCallback(j, "getP2pClient: Invalid parameter");
            return;
        }
        Device targetConnDevice = WearEngineUtils.getTargetConnDevice(this.mDeviceList, strOptString2);
        if (targetConnDevice == null || !targetConnDevice.isConnected()) {
            onFailureCallback(j, ERR_MSG_NO_CONNECTED);
            return;
        }
        ykb ykbVarD = yhw.d(this.mContext);
        ykbVarD.c(strOptString);
        ykbVarD.d(targetConnDevice, new PingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.wearengine.WearEngineEntry.3
            @Override // com.huawei.wearengine.p2p.PingCallback
            public void onPingResult(int i) {
                LogUtil.d(WearEngineEntry.this.TAG, "getP2pClient: onPingResult -> " + i);
            }
        }).addOnSuccessListener(new OnSuccessListenerImpl(this.mH5ProInstance, j)).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j));
    }

    @JavascriptInterface
    public void sendMessage(long j, String str) {
        String strOptString;
        String strOptString2;
        LogUtil.i(this.TAG, "sendMessage enter");
        String strOptString3 = "";
        byte[] bArrHexString2Bytes = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString(PARAMS_KEY_PEER_PKG_NAME);
            try {
                strOptString2 = jSONObject.optString(PARAMS_KEY_PEER_FINGER_PRINT);
                try {
                    bArrHexString2Bytes = WearEngineUtils.hexString2Bytes(jSONObject.optString("messageStr"));
                    if (jSONObject.has("udid")) {
                        strOptString3 = jSONObject.optString("udid");
                    }
                } catch (JSONException unused) {
                    LogUtil.e(this.TAG, "sendMessage: JSONException");
                }
            } catch (JSONException unused2) {
                strOptString2 = "";
            }
        } catch (JSONException unused3) {
            strOptString = "";
            strOptString2 = strOptString;
        }
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || bArrHexString2Bytes == null) {
            onFailureCallback(j, "sendMessage: Invalid parameter");
            return;
        }
        Device targetConnDevice = WearEngineUtils.getTargetConnDevice(this.mDeviceList, strOptString3);
        if (targetConnDevice == null || !targetConnDevice.isConnected()) {
            onFailureCallback(j, ERR_MSG_NO_CONNECTED);
            return;
        }
        ykf.d dVar = new ykf.d();
        dVar.d(bArrHexString2Bytes);
        ykf ykfVarB = dVar.b();
        ykb ykbVarD = yhw.d(this.mContext);
        ykbVarD.c(strOptString);
        ykbVarD.d(strOptString2);
        ykbVarD.a(targetConnDevice, ykfVarB, new SendCallback() { // from class: com.huawei.operation.h5pro.jsmodules.wearengine.WearEngineEntry.4
            @Override // com.huawei.wearengine.p2p.SendCallback
            public void onSendProgress(long j2) {
            }

            @Override // com.huawei.wearengine.p2p.SendCallback
            public void onSendResult(int i) {
                LogUtil.d(WearEngineEntry.this.TAG, "sendMessage: onSendResult ->" + i);
            }
        }).addOnSuccessListener(new OnSuccessListenerImpl(this.mH5ProInstance, j)).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j));
    }

    @JavascriptInterface
    public void sendFile(long j, String str) {
        String strOptString;
        String strOptString2;
        String strOptString3;
        LogUtil.i(this.TAG, "sendFile enter");
        String strOptString4 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString(PARAMS_KEY_PEER_PKG_NAME);
            try {
                strOptString2 = jSONObject.optString(PARAMS_KEY_PEER_FINGER_PRINT);
                try {
                    strOptString3 = jSONObject.optString("filePath");
                    try {
                        if (jSONObject.has("udid")) {
                            strOptString4 = jSONObject.optString("udid");
                        }
                    } catch (JSONException unused) {
                        LogUtil.e(this.TAG, "sendFile: JSONException");
                    }
                } catch (JSONException unused2) {
                    strOptString3 = "";
                }
            } catch (JSONException unused3) {
                strOptString2 = "";
                strOptString3 = strOptString2;
                LogUtil.e(this.TAG, "sendFile: JSONException");
                if (!TextUtils.isEmpty(strOptString)) {
                }
                onFailureCallback(j, "sendFile: Invalid parameter");
                return;
            }
        } catch (JSONException unused4) {
            strOptString = "";
        }
        if (!TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            onFailureCallback(j, "sendFile: Invalid parameter");
            return;
        }
        Device targetConnDevice = WearEngineUtils.getTargetConnDevice(this.mDeviceList, strOptString4);
        if (targetConnDevice == null || !targetConnDevice.isConnected()) {
            onFailureCallback(j, ERR_MSG_NO_CONNECTED);
            return;
        }
        if (!GeneralUtil.isSafePath(strOptString3)) {
            LogUtil.w(this.TAG, "sendFile: untrusted -> " + strOptString3);
            onFailureCallback(j, "untrusted filePath");
            return;
        }
        File file = new File(strOptString3);
        ykf.d dVar = new ykf.d();
        dVar.d(file);
        ykf ykfVarB = dVar.b();
        ykb ykbVarD = yhw.d(this.mContext);
        ykbVarD.c(strOptString);
        ykbVarD.d(strOptString2);
        ykbVarD.a(targetConnDevice, ykfVarB, new SendCallback() { // from class: com.huawei.operation.h5pro.jsmodules.wearengine.WearEngineEntry.5
            @Override // com.huawei.wearengine.p2p.SendCallback
            public void onSendProgress(long j2) {
            }

            @Override // com.huawei.wearengine.p2p.SendCallback
            public void onSendResult(int i) {
                LogUtil.d(WearEngineEntry.this.TAG, "sendFile: onSendResult ->" + i);
            }
        }).addOnSuccessListener(new OnSuccessListenerImpl(this.mH5ProInstance, j)).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j));
    }

    @JavascriptInterface
    public void monitorDeviceClient(long j, String str) {
        String strOptString;
        LogUtil.i(this.TAG, "monitorDeviceClient enter");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("udid")) {
                strOptString = jSONObject.optString("udid");
            } else {
                strOptString = "";
            }
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "monitorDeviceClient param parse error");
        }
        Device targetConnDevice = WearEngineUtils.getTargetConnDevice(this.mDeviceList, strOptString);
        if (targetConnDevice == null || !targetConnDevice.isConnected()) {
            onFailureCallback(j, ERR_MSG_NO_CONNECTED);
            return;
        }
        this.mMonitorClient = yhw.e(this.mContext);
        this.mMonitorListener = new MonitorListener() { // from class: com.huawei.operation.h5pro.jsmodules.wearengine.WearEngineEntry.6
            @Override // com.huawei.wearengine.monitor.MonitorListener
            public void onChanged(int i, MonitorItem monitorItem, MonitorData monitorData) {
                LogUtil.d(WearEngineEntry.this.TAG, "monitorDeviceClient: errorCode -> " + i, "monitorItem -> " + monitorItem, "monitorData -> " + monitorData);
            }
        };
        this.mMonitorClient.c(targetConnDevice, MonitorItem.MONITOR_ITEM_CONNECTION, this.mMonitorListener).addOnSuccessListener(new OnSuccessListenerImpl(this.mH5ProInstance, j)).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j));
    }

    @JavascriptInterface
    public void unregisterDeviceMonitor(long j) {
        MonitorListener monitorListener;
        LogUtil.i(this.TAG, "unregisterDeviceMonitor enter");
        yjj yjjVar = this.mMonitorClient;
        if (yjjVar == null || (monitorListener = this.mMonitorListener) == null) {
            onFailureCallback(j, "no monitor device");
        } else {
            yjjVar.d(monitorListener);
            onSuccessCallback(j);
        }
    }

    @JavascriptInterface
    public void monitorWearEngineClient(long j) {
        LogUtil.i(this.TAG, "monitorWearEngineClient enter");
        yim yimVarC = yhw.c(this.mContext, new ServiceConnectionListener() { // from class: com.huawei.operation.h5pro.jsmodules.wearengine.WearEngineEntry.7
            @Override // com.huawei.wearengine.client.ServiceConnectionListener
            public void onServiceConnect() {
                LogUtil.i(WearEngineEntry.this.TAG, "monitorWearEngineClient: connect");
            }

            @Override // com.huawei.wearengine.client.ServiceConnectionListener
            public void onServiceDisconnect() {
                LogUtil.i(WearEngineEntry.this.TAG, "monitorWearEngineClient: disconnect");
            }
        });
        this.mWearEngineClient = yimVarC;
        yimVarC.e().addOnSuccessListener(new OnSuccessListenerImpl(this.mH5ProInstance, j)).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j));
    }

    @JavascriptInterface
    public void unregisterServiceConnectionListener(long j) {
        LogUtil.i(this.TAG, "unregisterServiceConnectionListener enter");
        yim yimVar = this.mWearEngineClient;
        if (yimVar == null) {
            LogUtil.w(this.TAG, "mWearEngineClient is null");
        } else {
            yimVar.a().addOnSuccessListener(new OnSuccessListenerImpl(this.mH5ProInstance, j)).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j));
        }
    }

    @JavascriptInterface
    public void releaseWearEngineConnection(long j) {
        LogUtil.i(this.TAG, "releaseWearEngineConnection enter");
        yim yimVar = this.mWearEngineClient;
        if (yimVar == null) {
            LogUtil.w(this.TAG, "mWearEngineClient is null");
        } else {
            yimVar.b().addOnSuccessListener(new OnSuccessListenerImpl(this.mH5ProInstance, j)).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j));
        }
    }

    @JavascriptInterface
    public void registerMsgReceiver(final long j, String str) {
        String strOptString;
        String strOptString2;
        LogUtil.i(this.TAG, "registerMsgReceiver enter");
        String strOptString3 = "";
        boolean z = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString(PARAMS_KEY_PEER_PKG_NAME);
            try {
                strOptString2 = jSONObject.optString(PARAMS_KEY_PEER_FINGER_PRINT);
                try {
                    if (jSONObject.has("oneTime") && jSONObject.optBoolean("oneTime")) {
                        z = true;
                    }
                    if (jSONObject.has("udid")) {
                        strOptString3 = jSONObject.optString("udid");
                    }
                } catch (JSONException unused) {
                    LogUtil.e(this.TAG, "registerMsgReceiver: JSONException");
                }
            } catch (JSONException unused2) {
                strOptString2 = "";
            }
        } catch (JSONException unused3) {
            strOptString = "";
            strOptString2 = strOptString;
        }
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            onFailureCallback(j, "registerMsgReceiver: Invalid parameter");
            return;
        }
        Device targetConnDevice = WearEngineUtils.getTargetConnDevice(this.mDeviceList, strOptString3);
        if (targetConnDevice == null || !targetConnDevice.isConnected()) {
            onFailureCallback(j, ERR_MSG_NO_CONNECTED);
            return;
        }
        ykb ykbVarD = yhw.d(this.mContext);
        ykbVarD.c(strOptString);
        ykbVarD.d(strOptString2);
        final P2pMessageReceiver p2pMessageReceiver = new P2pMessageReceiver(this.mH5ProInstance, j, z);
        yhw.d(this.mContext).c(targetConnDevice, p2pMessageReceiver).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j)).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.huawei.operation.h5pro.jsmodules.wearengine.WearEngineEntry.8
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public void onSuccess(Void r4) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("data", p2pMessageReceiver.hashCode());
                } catch (JSONException unused4) {
                    LogUtil.e(WearEngineEntry.this.TAG, "registerMsgReceiver_HiWear: JSONException");
                }
                WearEngineEntry.this.mReceiverMap.put(p2pMessageReceiver.hashCode(), p2pMessageReceiver);
                WearEngineEntry.this.onSuccessCallback(j, jSONObject2.toString());
            }
        });
    }

    @JavascriptInterface
    public void unregisterMsgReceiver(final long j, String str) {
        LogUtil.i(this.TAG, "unregisterMsgReceiver enter");
        try {
            final int iOptInt = new JSONObject(str).optInt("receiverId");
            Receiver receiver = this.mReceiverMap.get(iOptInt);
            if (receiver == null) {
                onFailureCallback(j, "no receiver matched");
            } else {
                yhw.d(this.mContext).d(receiver).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.huawei.operation.h5pro.jsmodules.wearengine.WearEngineEntry.9
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    public void onSuccess(Void r3) {
                        WearEngineEntry.this.mReceiverMap.remove(iOptInt);
                        WearEngineEntry.this.onSuccessCallback(j);
                    }
                }).addOnFailureListener(new OnFailureListenerImpl(this.mH5ProInstance, j));
            }
        } catch (JSONException e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    static class P2pMessageReceiver implements Receiver {
        private static final String TAG = "H5PRO_WearEngineEntry_Receiver";
        private final boolean isOneTime;
        private final long mCallbackId;
        private final WeakReference<H5ProJsCbkInvoker<Object>> mWrH5ProJsCbkInvoker;

        P2pMessageReceiver(H5ProInstance h5ProInstance, long j, boolean z) {
            this.mWrH5ProJsCbkInvoker = h5ProInstance == null ? null : new WeakReference<>(h5ProInstance.getJsCbkInvoker());
            this.mCallbackId = j;
            this.isOneTime = z;
        }

        @Override // com.huawei.wearengine.p2p.Receiver
        public void onReceiveMessage(ykf ykfVar) {
            if (ykfVar == null) {
                LogUtil.w(TAG, "onReceiveMessage: message is null");
                return;
            }
            H5ProJsCbkInvoker h5ProJsCbkInvoker = (H5ProJsCbkInvoker) GeneralUtil.getReferent(this.mWrH5ProJsCbkInvoker);
            if (h5ProJsCbkInvoker == null) {
                LogUtil.w(TAG, "onReceiveMessage: h5ProJsCbkInvoker is null");
                return;
            }
            if (ykfVar.c() == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("data", WearEngineUtils.bytes2HexString(ykfVar.a()));
                } catch (JSONException unused) {
                    LogUtil.e(TAG, "onReceiveMessage:JSONException");
                }
                h5ProJsCbkInvoker.onSuccess(jSONObject, this.mCallbackId);
                if (this.isOneTime) {
                    h5ProJsCbkInvoker.onComplete(0, "message complete!", this.mCallbackId);
                    return;
                }
                return;
            }
            if (ykfVar.c() == 2) {
                h5ProJsCbkInvoker.onSuccess(ykfVar, this.mCallbackId);
                return;
            }
            LogUtil.w(TAG, "Unknown type: " + ykfVar.c());
        }
    }

    static class OnSuccessListenerImpl implements OnSuccessListener<Void> {
        private static final String TAG = "H5PRO_WearEngineEntry_onSuccess";
        private long mCallbackId;
        private WeakReference<H5ProJsCbkInvoker<Object>> mWrH5ProJsCbkInvoker;

        OnSuccessListenerImpl(H5ProInstance h5ProInstance, long j) {
            this.mWrH5ProJsCbkInvoker = h5ProInstance == null ? null : new WeakReference<>(h5ProInstance.getJsCbkInvoker());
            this.mCallbackId = j;
        }

        OnSuccessListenerImpl() {
            this.mWrH5ProJsCbkInvoker = null;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        public void onSuccess(Void r4) {
            H5ProJsCbkInvoker h5ProJsCbkInvoker = (H5ProJsCbkInvoker) GeneralUtil.getReferent(this.mWrH5ProJsCbkInvoker);
            if (h5ProJsCbkInvoker == null) {
                LogUtil.w(TAG, "onSuccess: h5ProJsCbkInvoker is null");
            } else {
                h5ProJsCbkInvoker.onSuccess(0, this.mCallbackId);
            }
        }
    }

    static class OnFailureListenerImpl implements OnFailureListener {
        private static final String TAG = "H5PRO_WearEngineEntry_onFailure";
        private long mCallbackId;
        private WeakReference<H5ProJsCbkInvoker<Object>> mWrH5ProJsCbkInvoker;

        OnFailureListenerImpl(H5ProInstance h5ProInstance, long j) {
            this.mWrH5ProJsCbkInvoker = h5ProInstance == null ? null : new WeakReference<>(h5ProInstance.getJsCbkInvoker());
            this.mCallbackId = j;
        }

        OnFailureListenerImpl() {
            this.mWrH5ProJsCbkInvoker = null;
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            H5ProJsCbkInvoker h5ProJsCbkInvoker = (H5ProJsCbkInvoker) GeneralUtil.getReferent(this.mWrH5ProJsCbkInvoker);
            if (h5ProJsCbkInvoker == null) {
                LogUtil.w(TAG, "onFailure: h5ProJsCbkInvoker is null");
            } else {
                h5ProJsCbkInvoker.onFailure(-1, exc.getMessage(), this.mCallbackId);
            }
        }
    }
}
