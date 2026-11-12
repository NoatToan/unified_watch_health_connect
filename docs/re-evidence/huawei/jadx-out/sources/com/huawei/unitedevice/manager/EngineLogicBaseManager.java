package com.huawei.unitedevice.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.p2p.IdentityInfo;
import com.huawei.unitedevice.p2p.P2pReceiver;
import defpackage.clx;
import defpackage.cox;
import defpackage.cpc;
import defpackage.lng;
import defpackage.xgt;
import defpackage.xgz;
import defpackage.xhr;
import defpackage.xil;
import defpackage.xit;
import defpackage.xiu;
import defpackage.xiz;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public abstract class EngineLogicBaseManager {
    private static final String DEVICE_PULL = ".device_pull";
    private static final String UNITE_DEVICE_FINGER_PRINT = "UniteDeviceManagement";
    private static final String UNITE_DEVICE_PACKAGE = "hw.unitedevice.";
    private static final Set<String> whiteWearPkgNameSet;
    private xil engineLogicFileManager;
    private Context mContext;
    private Handler mCpHandler;
    private HandlerThread mDbHandlerThread;
    private final Object LOCK = new Object();
    private String mTag = "EngineLogicBaseManager";
    private UniteDevice mUniteDevice = null;
    private boolean isRegisterReceiverConnectChange = false;
    private P2pReceiver receiver = new P2pReceiver() { // from class: com.huawei.unitedevice.manager.EngineLogicBaseManager.5
        @Override // com.huawei.unitedevice.p2p.P2pReceiver
        public void onReceiveMessage(DeviceInfo deviceInfo, xiu xiuVar) {
            EngineLogicBaseManager.this.onReceiveDeviceCommand(cox.c(deviceInfo), 530003, xiuVar);
        }
    };
    private final BroadcastReceiver mDeviceStatusReceiver = new BroadcastReceiver() { // from class: com.huawei.unitedevice.manager.EngineLogicBaseManager.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            ConnectState connectState;
            if (intent == null) {
                LogUtil.e(EngineLogicBaseManager.this.mTag, "mDeviceStatusReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                LogUtil.e(EngineLogicBaseManager.this.mTag, "mDeviceStatusReceiver onReceive action is null");
                return;
            }
            LogUtil.b(EngineLogicBaseManager.this.mTag, "mDeviceStatusReceiver onReceive action: ", action);
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                try {
                    parcelableExtra = intent.getParcelableExtra("deviceinfo");
                } catch (BadParcelableException unused) {
                    LogUtil.d(EngineLogicBaseManager.this.mTag, "fuzzy test exception, no care this.");
                    parcelableExtra = null;
                }
                com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo = parcelableExtra instanceof com.huawei.health.devicemgr.business.entity.DeviceInfo ? (com.huawei.health.devicemgr.business.entity.DeviceInfo) parcelableExtra : null;
                if (deviceInfo != null) {
                    int deviceConnectState = deviceInfo.getDeviceConnectState();
                    if (deviceConnectState == 1) {
                        connectState = ConnectState.CONNECTING;
                    } else if (deviceConnectState == 2) {
                        xgt.b().a(EngineLogicBaseManager.this.mContext);
                        EngineLogicBaseManager.this.registerReceiverToEngine();
                        connectState = ConnectState.CONNECTED;
                    } else {
                        connectState = (deviceConnectState == 3 || deviceConnectState == 4) ? ConnectState.DISCONNECTED : null;
                    }
                    if (connectState != null) {
                        EngineLogicBaseManager.this.onDeviceConnectionChange(connectState, deviceInfo);
                    }
                }
                EngineLogicBaseManager.this.mUniteDevice = null;
            }
        }
    };

    public abstract WearEngineModule getManagerModule();

    public abstract String getWearFingerprint();

    public abstract String getWearPkgName();

    protected abstract void onDeviceConnectionChange(ConnectState connectState, com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo);

    protected abstract void onReceiveDeviceCommand(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo, int i, xiu xiuVar);

    static {
        HashSet hashSet = new HashSet();
        whiteWearPkgNameSet = hashSet;
        hashSet.add("com.huawei.hmsapp.appgallery");
        hashSet.add("com.huawei.appmarket.wear");
    }

    public EngineLogicBaseManager(Context context) {
        this.mDbHandlerThread = null;
        this.mContext = context;
        xgt.b().a(this.mContext);
        registerReceiverToEngine();
        xgt.b().d(getManagerModule(), this);
        registerBroadcastReceiver();
        HandlerThread handlerThread = new HandlerThread(this.mTag);
        this.mDbHandlerThread = handlerThread;
        handlerThread.start();
        this.mCpHandler = new Handler(this.mDbHandlerThread.getLooper());
    }

    protected void sendCommand(UniteDevice uniteDevice, xgz xgzVar, SendCallback sendCallback) {
        xgt.b().p2pSendForWearEngine(this.mContext, uniteDevice, xgzVar, sendCallback);
    }

    protected void sendCommand(xiu xiuVar, SendCallback sendCallback, com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        xgz xgzVar = new xgz();
        xgzVar.a(getManagerModule());
        xgzVar.i(getWearPkgName());
        xgzVar.h(getWearFingerprint());
        xgzVar.b(xiuVar);
        sendCommand(xit.e(deviceInfo), xgzVar, sendCallback);
    }

    public void sendComand(xiu xiuVar, SendCallback sendCallback) {
        xgz xgzVar = new xgz();
        WearEngineModule managerModule = getManagerModule();
        xgzVar.a(managerModule);
        xgzVar.i(getWearPkgName());
        xgzVar.h(getWearFingerprint());
        xgzVar.b(xiuVar);
        UniteDevice uniteDeviceE = this.mUniteDevice;
        if (uniteDeviceE == null) {
            uniteDeviceE = xit.e(managerModule != null ? managerModule.getValue() : null);
            this.mUniteDevice = uniteDeviceE;
        }
        sendCommand(uniteDeviceE, xgzVar, sendCallback);
    }

    protected void sendComand(xiu xiuVar, SendCallback sendCallback, String str, int i) {
        if (xiuVar == null) {
            LogUtil.e(this.mTag, "sendComand message is null");
            if (sendCallback != null) {
                sendCallback.onSendResult(5);
                return;
            }
            return;
        }
        if (i == 2 && !whiteWearPkgNameSet.contains(str)) {
            LogUtil.e(this.mTag, "sendComand packageName is not in the whitelist or is not urgent message");
            if (sendCallback != null) {
                sendCallback.onSendResult(5);
            }
            throw new IllegalStateException("send urgent message(prior =2), packageName must be added to the whiteWearPkgNameSet");
        }
        if (i == 2) {
            ReleaseLogUtil.d(this.mTag, "sendComand packageName is ", str, ", prior is ", Integer.valueOf(i));
            lng.c("P2PMessage", "P2PMessage sendCommand urgent message, packageName is " + str);
        }
        sendComand(convertP2pMessage(xiuVar, i), sendCallback);
    }

    private xiu convertP2pMessage(xiu xiuVar, int i) {
        xiu.c cVar = new xiu.c();
        if (xiuVar.c() == 1) {
            cVar.a(xiuVar.b());
        } else if (xiuVar.c() == 2) {
            cVar.a(xiuVar.e());
        } else {
            LogUtil.b(this.mTag, "convertP2pMessage message type is other ");
        }
        cVar.e(xiuVar.a());
        cVar.c(xiuVar.h());
        cVar.b(i);
        return cVar.c();
    }

    protected void cancelCommand(UniteDevice uniteDevice, xgz xgzVar, final SendCallback sendCallback) {
        xhr xhrVar = new xhr();
        xhrVar.c(xgzVar.b());
        xhrVar.g(7);
        xhrVar.d(xgzVar.d());
        xhrVar.g(xgzVar.g());
        xhrVar.e(xgzVar.f());
        xhrVar.j(xgzVar.o());
        xhrVar.a(xgzVar.i());
        xhrVar.i(xgzVar.h());
        xhrVar.b(xgzVar.a());
        xhrVar.e(xgzVar.c());
        xhrVar.b(true);
        if (uniteDevice == null) {
            WearEngineModule managerModule = getManagerModule();
            uniteDevice = xit.e(managerModule != null ? managerModule.getValue() : null);
        }
        xhrVar.c(uniteDevice);
        xgt.b().stopTransferFileToWear(xhrVar, new ITransferFileCallback.Stub() { // from class: com.huawei.unitedevice.manager.EngineLogicBaseManager.2
            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str) throws RemoteException {
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                sendCallback.onSendProgress(i);
                LogUtil.b(EngineLogicBaseManager.this.mTag, "cancelCommand onSendProgress: ", Integer.valueOf(i));
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str) throws RemoteException {
                sendCallback.onSendResult(i);
                LogUtil.b(EngineLogicBaseManager.this.mTag, "cancelCommand onSendResult: ", Integer.valueOf(i));
            }
        });
    }

    public void pingComand(PingCallback pingCallback, String str) {
        pingCommand(xit.e(str), pingCallback, str);
    }

    protected void pingCommand(UniteDevice uniteDevice, PingCallback pingCallback, String str) {
        xgt.b().pingSendForWearEngine(this.mContext, uniteDevice, str, pingCallback, 1);
    }

    protected void pingComand(PingCallback pingCallback, String str, int i) {
        if (i == 2 && !whiteWearPkgNameSet.contains(str)) {
            LogUtil.e(this.mTag, "pingComand packageName is not in the whitelist or is not urgent message");
            if (pingCallback != null) {
                pingCallback.onPingResult(5);
            }
            throw new IllegalStateException("send urgent message(prior =2), packageName must be added to the whiteWearPkgNameSet");
        }
        if (i == 2) {
            ReleaseLogUtil.d(this.mTag, "pingComand packageName is ", str, ", prior is ", Integer.valueOf(i));
            lng.c("P2PMessage", "P2PMessage PingCommand urgent message, packageName is " + str);
        }
        xgt.b().pingSendForWearEngine(this.mContext, xit.e(str), str, pingCallback, i);
    }

    public void onConnectionChange(ConnectState connectState, com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        LogUtil.b(this.mTag, "onConnectionChange :", connectState);
    }

    protected void registerNotificationAction() {
        Handler handler = this.mCpHandler;
        if (handler == null) {
            LogUtil.e(this.mTag, "registerNotificationAction handler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.unitedevice.manager.EngineLogicBaseManager.3
                @Override // java.lang.Runnable
                public void run() {
                    xiz.d(EngineLogicBaseManager.this.getWearPkgName(), EngineLogicBaseManager.this.getAction());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAction() {
        return getWearPkgName() + DEVICE_PULL;
    }

    protected void unregisterNotificationAction() {
        Handler handler = this.mCpHandler;
        if (handler == null) {
            LogUtil.d(this.mTag, "handler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.unitedevice.manager.EngineLogicBaseManager.1
                @Override // java.lang.Runnable
                public void run() {
                    xiz.b(EngineLogicBaseManager.this.getWearPkgName());
                }
            });
        }
    }

    public void onDestroy() {
        if (this.mContext != null && this.receiver != null) {
            xgz xgzVar = new xgz();
            xgzVar.a(getManagerModule());
            xgzVar.i(getWearPkgName());
            xgt.b().unregisterReceiver(this.mContext, this.receiver, xgzVar);
        }
        xgt.b().d(getManagerModule());
        if (this.mCpHandler != null) {
            this.mCpHandler = null;
        }
        this.mDbHandlerThread.quit();
        xil xilVar = this.engineLogicFileManager;
        if (xilVar != null) {
            xilVar.d();
        }
        synchronized (this.LOCK) {
            try {
                if (this.isRegisterReceiverConnectChange) {
                    BaseApplication.b().unregisterReceiver(this.mDeviceStatusReceiver);
                }
                this.isRegisterReceiverConnectChange = false;
            } catch (IllegalArgumentException e) {
                LogUtil.d(this.mTag, "onDestroy: ", cpc.c(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerReceiverToEngine() {
        xgz xgzVar = new xgz();
        xgzVar.a(getManagerModule());
        xgzVar.i(getWearPkgName());
        xgzVar.h(getWearFingerprint());
        xgt.b().registerReceiver(this.mContext, xgzVar, this.receiver, new SendCallback() { // from class: com.huawei.unitedevice.manager.EngineLogicBaseManager.9
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.b(EngineLogicBaseManager.this.mTag, "registerReceiverToEngine errCode: ", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.b(EngineLogicBaseManager.this.mTag, "registerReceiverToEngine onFileTransferReport transferWay: ", str);
            }
        });
        IdentityInfo identityInfo = new IdentityInfo(UNITE_DEVICE_PACKAGE + getManagerModule().getValue(), UNITE_DEVICE_FINGER_PRINT);
        if (this.engineLogicFileManager == null) {
            this.engineLogicFileManager = new xil(identityInfo, this.receiver);
        }
    }

    private void registerBroadcastReceiver() {
        LogUtil.b(this.mTag, "enter registerBroadcastReceiver");
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            BroadcastManagerUtil.c(BaseApplication.b(), this.mDeviceStatusReceiver, intentFilter, clx.e, null);
            this.isRegisterReceiverConnectChange = true;
        } catch (IllegalStateException e) {
            LogUtil.d(this.mTag, "registerBroadcastReceiver: ", cpc.c(e));
        }
    }
}
