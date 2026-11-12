package com.xiaomi.smarthome.localcontrol.common;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.miot.centralclientsdk.a;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.localcontrol.ILCCallback;
import com.xiaomi.smarthome.localcontrol.common.manager.LocalDeviceBlockManager;
import com.xiaomi.smarthome.localcontrol.common.manager.LocalGetPropBlockManager;
import com.xiaomi.smarthome.localcontrol.common.manager.LocalRpcBlockManager;
import com.xiaomi.smarthome.localcontrol.common.manager.LocalSceneBlockManager;
import com.xiaomi.smarthome.localcontrol.common.util.NetUtil;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CentralMqttManager {
    public static final String DEVICE_TYPE_PHONE = "app";
    public static final String DEVICE_TYPE_SPEAKER = "speaker";
    private static final String KEY_COMMON_RESPONSE_DESTROY = "destory";
    public static final String OUTPUTTAG = "GATEWAY_OUTPUT:";
    public static final int RPC_SOURCE_PROCESS_MAIN = 1;
    public static final int RPC_SOURCE_PROCESS_PLUGIN = 3;
    public static final int RPC_SOURCE_PROCESS_WIDGET = 2;
    private static final String TAG = "Central-M";
    private static volatile CentralMqttManager sInstance;
    private ILCCallback mCommonCallback;
    private Context mContext;
    private LocalDeviceBlockManager mDeviceBlockManager;
    private LocalGetPropBlockManager mGetPropBlockManager;
    private String mHomeId;
    private LocalRpcBlockManager mRpcBlockManager;
    private LocalSceneBlockManager mSceneBlockManager;
    private IStatReport mStatReport;
    private String mUid;
    private boolean isConnected = false;
    private volatile boolean isInited = false;
    private boolean hasDestoryed = false;
    private String mDeviceType = "app";
    private boolean isCheckControledCondition = true;
    private boolean mOutNetAvailabled = true;
    private AtomicInteger mSessionId = new AtomicInteger(0);
    private long TIME_INIT_START = 0;
    private long TIME_CERT_START = 0;

    private CentralMqttManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRequest(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("doRequest: ");
        sb.append(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", str));
        SmartHomeRc4Api.getInstance().sendRequest(new NetRequest.Builder().method("POST").path("/v2/home/get_device_cert").addQueries(arrayList).build(), new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.localcontrol.common.CentralMqttManager.3
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                String str2;
                LogType logType = LogType.LOCAL_CONTROL;
                if (("onFailure  " + netError) != null) {
                    str2 = netError.getCode() + "  " + netError.getDetail() + "  " + netError.getmExtraMsg();
                } else {
                    str2 = "";
                }
                MiJiaLog.writeLogOnAll(logType, CentralMqttManager.TAG, str2);
                CentralMqttManager.this.destroy(false);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                LogType logType = LogType.LOCAL_CONTROL;
                MiJiaLog.writeLogOnAll(logType, CentralMqttManager.TAG, "success");
                if (netResult != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(netResult.mResponse);
                        MiJiaLog.writeLogOnAll(logType, CentralMqttManager.TAG, "doRequest reponse :" + jSONObject.toString());
                        int iOptInt = jSONObject.optInt("code");
                        String string = jSONObject.optJSONObject("result").toString();
                        if (iOptInt != 0 || TextUtils.isEmpty(string)) {
                            return;
                        }
                        if (CentralMqttManager.this.TIME_CERT_START > 0) {
                            long jCurrentTimeMillis = System.currentTimeMillis() - CentralMqttManager.this.TIME_CERT_START;
                            if (jCurrentTimeMillis > 0) {
                                MiJiaLog.writeLogOnAll(logType, CentralMqttManager.TAG, "GATEWAY_OUTPUT:request time = " + jCurrentTimeMillis);
                            }
                        }
                        a.d(string);
                    } catch (Exception e) {
                        e.printStackTrace();
                        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, CentralMqttManager.TAG, "error:" + e);
                    }
                }
            }
        });
    }

    private LocalDeviceBlockManager getDeviceBlockManager() {
        if (this.mDeviceBlockManager == null) {
            this.mDeviceBlockManager = new LocalDeviceBlockManager();
        }
        return this.mDeviceBlockManager;
    }

    public static CentralMqttManager getInstance() {
        if (sInstance == null) {
            synchronized (CentralMqttManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new CentralMqttManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private LocalGetPropBlockManager getPropBlockManager() {
        if (this.mGetPropBlockManager == null) {
            this.mGetPropBlockManager = new LocalGetPropBlockManager();
        }
        return this.mGetPropBlockManager;
    }

    private LocalRpcBlockManager getRpcBlockManager() {
        if (this.mRpcBlockManager == null) {
            this.mRpcBlockManager = new LocalRpcBlockManager();
        }
        return this.mRpcBlockManager;
    }

    private LocalSceneBlockManager getSceneBlockManager() {
        if (this.mSceneBlockManager == null) {
            this.mSceneBlockManager = new LocalSceneBlockManager();
        }
        return this.mSceneBlockManager;
    }

    private void initBlockManager() {
        this.mDeviceBlockManager = new LocalDeviceBlockManager();
        this.mSceneBlockManager = new LocalSceneBlockManager();
        this.mRpcBlockManager = new LocalRpcBlockManager();
        this.mSceneBlockManager = new LocalSceneBlockManager();
    }

    private void initOthers(ILCCallback iLCCallback) {
        initBlockManager();
        if (iLCCallback != null) {
            try {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "init other: reponse");
                iLCCallback.onSuccess("");
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private void notifyRemoteFailed(ILCCallback iLCCallback, String str) {
        if (iLCCallback != null) {
            try {
                iLCCallback.onFailure(-10002, str);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConnectSuccess() {
        LogType logType = LogType.LOCAL_CONTROL;
        MiJiaLog.writeLogOnAll(logType, TAG, "connected " + System.currentTimeMillis());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.TIME_INIT_START;
        if (j > 0) {
            MiJiaLog.writeLogOnAll(logType, TAG, "GATEWAY_OUTPUT:init -- connect time = " + (jCurrentTimeMillis - j));
            this.TIME_INIT_START = 0L;
        }
        LocalDeviceBlockManager localDeviceBlockManager = this.mDeviceBlockManager;
        if (localDeviceBlockManager != null) {
            localDeviceBlockManager.getControlDeviceList(true, false);
            this.mDeviceBlockManager.subDevListChange();
            this.mDeviceBlockManager.subNetworkStatus();
        }
        LocalSceneBlockManager localSceneBlockManager = this.mSceneBlockManager;
        if (localSceneBlockManager != null) {
            localSceneBlockManager.getLocalActionGroupList();
            this.mSceneBlockManager.subsceneAdd();
            this.mSceneBlockManager.subsceneDel();
        }
    }

    public void changeHome(String str) {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "changeHome:" + this.isConnected);
        this.mHomeId = str;
        a.b(str);
    }

    public void checkRefreshDevicesList() {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "devicelist: con = " + this.isConnected);
        excuteGetDeviceList();
    }

    public void controlDevice(JSONObject jSONObject, int i, String str, ILCCallback iLCCallback, int i2) {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "controlDevice: " + i2 + " " + str + " " + i + " " + this.isConnected);
        if (isCentralConnected()) {
            getRpcBlockManager().controlDevice(jSONObject, i, str, iLCCallback, i2);
        } else {
            notifyRemoteFailed(iLCCallback, "central not connected");
        }
    }

    public void destroy(boolean z) {
        ILCCallback iLCCallback;
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "destroy: " + z);
        this.isConnected = false;
        this.isInited = false;
        this.mDeviceBlockManager = null;
        this.mSceneBlockManager = null;
        this.mRpcBlockManager = null;
        this.mGetPropBlockManager = null;
        this.mSessionId.set(0);
        if (!z && (iLCCallback = this.mCommonCallback) != null) {
            try {
                iLCCallback.onSuccess(KEY_COMMON_RESPONSE_DESTROY);
                this.mCommonCallback = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.hasDestoryed) {
            return;
        }
        this.hasDestoryed = true;
        ThreadPoolManager.executeTask(new Runnable() { // from class: com.xiaomi.smarthome.localcontrol.common.CentralMqttManager.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.f();
                } catch (Exception e2) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, CentralMqttManager.TAG, "destroy:ex: " + e2);
                }
            }
        });
    }

    public void excuteGetDeviceList() {
        if (isCentralConnected()) {
            LocalDeviceBlockManager localDeviceBlockManager = this.mDeviceBlockManager;
            if (localDeviceBlockManager != null) {
                localDeviceBlockManager.getControlDeviceList(false, false);
            }
            LocalSceneBlockManager localSceneBlockManager = this.mSceneBlockManager;
            if (localSceneBlockManager != null) {
                localSceneBlockManager.getLocalActionGroupList();
            }
        }
    }

    public void excuteLocalAutomAction(String str, ILCCallback iLCCallback) {
        getSceneBlockManager().excuteLocalAutomAction(str, iLCCallback);
    }

    public boolean getCheckControledCondition() {
        return this.isCheckControledCondition;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void getDeviceProperty(String str, int i, int i2, ILCCallback iLCCallback) {
        getPropBlockManager().getDeviceProperty(str, i, i2, iLCCallback);
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public Set<String> getLocalControlDevices() {
        LocalDeviceBlockManager localDeviceBlockManager = this.mDeviceBlockManager;
        if (localDeviceBlockManager != null) {
            return localDeviceBlockManager.getLocalControlDevices();
        }
        return null;
    }

    public boolean getOutNetAailabled() {
        return this.mOutNetAvailabled;
    }

    public IStatReport getStatReport() {
        return this.mStatReport;
    }

    public synchronized void initClient(Context context, String str, String str2, ILCCallback iLCCallback) {
        this.mContext = context;
        this.mUid = str;
        this.mHomeId = str2;
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "init: homeId = " + str2);
        if (this.isInited) {
            if (iLCCallback != null) {
                try {
                    iLCCallback.onSuccess("");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            return;
        }
        this.isInited = true;
        this.TIME_INIT_START = System.currentTimeMillis();
        this.hasDestoryed = false;
        initOthers(iLCCallback);
        start();
    }

    public boolean isAcitonLocalControled(String str) {
        LocalSceneBlockManager localSceneBlockManager;
        if (isCentralConnected() && (localSceneBlockManager = this.mSceneBlockManager) != null) {
            return localSceneBlockManager.isAcitonLocalControled(str);
        }
        return false;
    }

    public boolean isCentralConnected() {
        return this.isConnected;
    }

    public synchronized boolean isCentralInited() {
        return this.isInited;
    }

    public boolean isDeviceCanUseLocalControl(String str) {
        if (!isCentralConnected()) {
            return false;
        }
        if (!this.isCheckControledCondition) {
            return true;
        }
        LocalDeviceBlockManager localDeviceBlockManager = this.mDeviceBlockManager;
        if (localDeviceBlockManager == null) {
            return false;
        }
        return localDeviceBlockManager.isDeviceCanUseLocalControl(str);
    }

    public boolean isDeviceInControlList(String str) {
        LocalDeviceBlockManager localDeviceBlockManager;
        if (isCentralConnected() && (localDeviceBlockManager = this.mDeviceBlockManager) != null) {
            return localDeviceBlockManager.isDeviceCanUseLocalControl(str);
        }
        return false;
    }

    public boolean isNeedRenderDeviceInfo() {
        return !getOutNetAailabled() && NetUtil.isWifiConnected(this.mContext) && isCentralConnected();
    }

    public void setCheckControledCondition(boolean z) {
        this.isCheckControledCondition = z;
    }

    public void setCommonCallback(ILCCallback iLCCallback) {
        this.mCommonCallback = iLCCallback;
    }

    public void setDeviceType(String str) {
        this.mDeviceType = str;
    }

    public void setIDeviceCallback(ILCCallback iLCCallback) {
        LocalDeviceBlockManager localDeviceBlockManager = this.mDeviceBlockManager;
        if (localDeviceBlockManager != null) {
            localDeviceBlockManager.setIDeviceCallback(iLCCallback);
        }
    }

    public void setISceneCallback(ILCCallback iLCCallback) {
        LocalSceneBlockManager localSceneBlockManager = this.mSceneBlockManager;
        if (localSceneBlockManager != null) {
            localSceneBlockManager.setISceneCallback(iLCCallback);
        }
    }

    public void setOutNetAailabled(boolean z) {
        this.mOutNetAvailabled = z;
    }

    public void setStatReport(IStatReport iStatReport) {
        this.mStatReport = iStatReport;
    }

    public void start() {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, StatConstants.PARAM_START);
        try {
            Context context = this.mContext;
            a.e(context, this.mUid, this.mHomeId, context.getFilesDir().getAbsolutePath(), new a.b() { // from class: com.xiaomi.smarthome.localcontrol.common.CentralMqttManager.1
                public void onCentralConnected(String str) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, CentralMqttManager.TAG, "onCentralConnected");
                    CentralMqttManager.this.isConnected = true;
                    CentralMqttManager.this.hasDestoryed = false;
                    CentralMqttManager.this.onConnectSuccess();
                }

                public void onCentralDisconnected() {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, CentralMqttManager.TAG, "onCentralDisconnected");
                    CentralMqttManager.this.isConnected = false;
                    CentralMqttManager.this.TIME_INIT_START = 0L;
                }

                public void onCertificateRequest(String str) {
                    LogType logType = LogType.LOCAL_CONTROL;
                    MiJiaLog.writeLogOnAll(logType, CentralMqttManager.TAG, "onCertificateRequest");
                    CentralMqttManager.this.TIME_CERT_START = System.currentTimeMillis();
                    if (CentralMqttManager.this.TIME_INIT_START > 0) {
                        long j = CentralMqttManager.this.TIME_CERT_START - CentralMqttManager.this.TIME_INIT_START;
                        if (j > 0) {
                            MiJiaLog.writeLogOnAll(logType, CentralMqttManager.TAG, "GATEWAY_OUTPUT:init - cert = " + j);
                        }
                    }
                    CentralMqttManager.this.doRequest(str);
                }

                public void onSDKLog(int i, String str) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, "Central-Native", str);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
