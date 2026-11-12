package com.xiaomi.smarthome.localcontrol.common;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.frame.process.ProcessUtil;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.localcontrol.ILCCallback;
import com.xiaomi.smarthome.localcontrol.ILocalControl;
import defpackage.aje;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LocalControlCore {
    private static final String KEY_COMMON_RESPONSE_DESTROY = "destory";
    private static final String LOCAL_CONTROL_SERVICE = "com.xiaomi.smarthome.localcontrol.common.ILocalControlService";
    private static final String MIHOME_SERVICE_CONNECTED = "service_connected";
    private static final String TAG = "Central-Core";
    private static volatile LocalControlCore sInstance;
    private ILocalControl mLocalControlService;
    private OutInfoConvertCallback mOutInfoConvertCallback;
    private Set<String> mLocalControlDids = new HashSet();
    private List<String> mLocalControlSceneIds = new ArrayList();
    public boolean isOutNetEnabled = true;
    private boolean isCentralInited = false;
    private String mHomeId = "";
    private String mUid = "";
    private ILCCallback mDeviceListCallback = new ILCCallback.Stub() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.1
        @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
        public void onFailure(int i, String str) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
        public void onSuccess(String str) throws RemoteException {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "dev suc: " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("type");
                if (!TextUtils.equals(strOptString, "did")) {
                    if (TextUtils.equals(strOptString, OneTrack.Param.NET)) {
                        LocalControlCore.this.isOutNetEnabled = jSONObject.optBoolean("value");
                        return;
                    }
                    return;
                }
                String[] strArrSplit = jSONObject.optString("value").split(",");
                for (String str2 : strArrSplit) {
                    String strTrim = str2.trim();
                    if (!TextUtils.isEmpty(strTrim)) {
                        LocalControlCore.this.mLocalControlDids.add(strTrim);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    private ILCCallback mSceneListCallback = new ILCCallback.Stub() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.2
        @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
        public void onFailure(int i, String str) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
        public void onSuccess(String str) throws RemoteException {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "scene suc: " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            for (String str2 : str.replace("[", "").replace("]", "").split(",")) {
                String strTrim = str2.trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    LocalControlCore.this.mLocalControlSceneIds.add(strTrim);
                }
            }
        }
    };
    private ILCCallback mCommonCallback = new ILCCallback.Stub() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.3
        @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
        public void onFailure(int i, String str) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
        public void onSuccess(String str) throws RemoteException {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "common suc: " + str);
            if (TextUtils.equals(LocalControlCore.KEY_COMMON_RESPONSE_DESTROY, str)) {
                LocalControlCore.this.destroy(false);
            }
        }
    };
    private boolean mBound = false;
    private long BIND_START_TIME = 0;
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.12
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "service con:time=" + (System.currentTimeMillis() - LocalControlCore.this.BIND_START_TIME));
            LocalControlCore.this.mLocalControlService = ILocalControl.Stub.asInterface(iBinder);
            LocalControlCore.this.initCentral();
            aje.b(MiJiaEnvironment.getAppContext()).d(new Intent(LocalControlCore.MIHOME_SERVICE_CONNECTED));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "service discon: ");
            LocalControlCore.this.mLocalControlService = null;
            LocalControlCore.this.mBound = false;
            LocalControlCore.this.reset();
        }
    };

    public static class OutConvertInfo {
        private JSONObject conertParams;
        private boolean isConvertSuccuss = true;

        public JSONObject getConertParams() {
            return this.conertParams;
        }

        public boolean isConvertSuccuss() {
            return this.isConvertSuccuss;
        }

        public void setConertParams(JSONObject jSONObject) {
            this.conertParams = jSONObject;
        }

        public void setConvertSuccuss(boolean z) {
            this.isConvertSuccuss = z;
        }

        public String toString() {
            return "isConvertSuccuss = " + this.isConvertSuccuss + ", conertParams = " + this.conertParams;
        }
    }

    public interface OutInfoConvertCallback {
        public static final int TYPE_ACTION_IN = 1;
        public static final int TYPE_ACTION_OUT = 2;

        OutConvertInfo convertAction(JSONObject jSONObject, JSONObject jSONObject2, int i);
    }

    public abstract class RemoteTask {
        private RemoteTask() {
        }

        public abstract void onBindFailed();

        public abstract void run() throws Exception;

        public void start() {
            if (LocalControlCore.this.mLocalControlService != null) {
                synchronized (LocalControlCore.class) {
                    try {
                        run();
                    } catch (Exception e) {
                        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "remote ex: " + e.getMessage());
                    }
                }
                return;
            }
            if (!LocalControlCore.this.mBound) {
                LocalControlCore.this.bindService();
            }
            if (!LocalControlCore.this.mBound) {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "service not found???");
                onBindFailed();
            } else {
                aje.b(MiJiaEnvironment.getAppContext()).c(new BroadcastReceiver() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        aje.b(MiJiaEnvironment.getAppContext()).e(this);
                        synchronized (LocalControlCore.class) {
                            try {
                                RemoteTask.this.run();
                            } catch (Exception e2) {
                                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "remote ex: " + e2.getMessage());
                            }
                        }
                    }
                }, new IntentFilter(LocalControlCore.MIHOME_SERVICE_CONNECTED));
            }
        }
    }

    private LocalControlCore() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindService() {
        this.BIND_START_TIME = System.currentTimeMillis();
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "bind: " + this.BIND_START_TIME);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(MiJiaEnvironment.getAppContext().getPackageName(), LOCAL_CONTROL_SERVICE));
        this.mBound = MiJiaEnvironment.getAppContext().bindService(intent, this.mConnection, 1);
    }

    public static LocalControlCore getInstance() {
        if (sInstance == null) {
            synchronized (LocalControlCore.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LocalControlCore();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFailed(ILCCallback iLCCallback) {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "controlDeviceByLocal: notifyFailed");
        if (iLCCallback != null) {
            try {
                iLCCallback.onFailure(-10000, "failed");
            } catch (Exception e) {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "controlDeviceByLocal: ex " + e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reset() {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "reset");
        this.isCentralInited = false;
        this.isOutNetEnabled = true;
        this.mLocalControlDids.clear();
        this.mLocalControlSceneIds.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unbindService() {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "unbind: ");
        if (this.mBound) {
            MiJiaEnvironment.getAppContext().unbindService(this.mConnection);
            this.mLocalControlService = null;
            this.mBound = false;
        }
        reset();
    }

    public void changeHomeId(final String str) {
        this.mHomeId = str;
        new RemoteTask() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void onBindFailed() {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "changeHomeId onBindFailed");
            }

            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void run() throws Exception {
                if (LocalControlCore.this.mLocalControlService != null) {
                    LocalControlCore.this.mLocalControlService.changeHome(str);
                } else {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "changeHomeId service is null");
                }
            }
        }.start();
    }

    public void controlDevice(final String str, final int i, final String str2, final int i2, final ILCCallback iLCCallback) {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "controlDevice: " + str2 + "  source=" + i2);
        if (!ProcessUtil.isIsolateProcess(MiJiaEnvironment.getAppContext())) {
            new RemoteTask() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
                public void onBindFailed() {
                    LocalControlCore.this.notifyFailed(iLCCallback);
                }

                @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
                public void run() throws Exception {
                    if (LocalControlCore.this.mLocalControlService != null) {
                        LocalControlCore.this.mLocalControlService.controlDevice(str, i, str2, i2, iLCCallback);
                    } else {
                        LocalControlCore.this.notifyFailed(iLCCallback);
                    }
                }
            }.start();
            return;
        }
        try {
            CentralMqttManager.getInstance().controlDevice(new JSONObject(str), i, str2, iLCCallback, 2);
        } catch (JSONException e) {
            notifyFailed(iLCCallback);
            e.printStackTrace();
        }
    }

    public void destroy(boolean z) {
        if (this.mLocalControlService == null || !z) {
            unbindService();
        } else {
            new RemoteTask() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.11
                @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
                public void onBindFailed() {
                    LocalControlCore.this.unbindService();
                }

                @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
                public void run() throws Exception {
                    LocalControlCore.this.mLocalControlService.destroy();
                    LocalControlCore.this.unbindService();
                }
            }.start();
        }
    }

    public void excuteLocalAutomAction(final String str, final ILCCallback iLCCallback) {
        if (ProcessUtil.isIsolateProcess(MiJiaEnvironment.getAppContext())) {
            CentralMqttManager.getInstance().excuteLocalAutomAction(str, iLCCallback);
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "scene exc: " + str);
        new RemoteTask() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void onBindFailed() {
                LocalControlCore.this.notifyFailed(iLCCallback);
            }

            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void run() throws Exception {
                if (LocalControlCore.this.mLocalControlService != null) {
                    LocalControlCore.this.mLocalControlService.excuteLocalAutomAction(str, iLCCallback);
                } else {
                    LocalControlCore.this.notifyFailed(iLCCallback);
                }
            }
        }.start();
    }

    public void getDeviceProperty(final String str, final int i, final int i2, final int i3, final ILCCallback iLCCallback) {
        if (ProcessUtil.isIsolateProcess(MiJiaEnvironment.getAppContext())) {
            CentralMqttManager.getInstance().getDeviceProperty(str, i, i2, iLCCallback);
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "get prop: " + str + "  &&sid=" + i + "  &&pid=" + i2 + "  " + this.isOutNetEnabled + "  && " + this.isCentralInited);
        new RemoteTask() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void onBindFailed() {
                LocalControlCore.this.notifyFailed(iLCCallback);
            }

            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void run() throws Exception {
                if (LocalControlCore.this.mLocalControlService != null) {
                    LocalControlCore.this.mLocalControlService.getDeviceProperty(str, i, i2, i3, iLCCallback);
                } else {
                    LocalControlCore.this.notifyFailed(iLCCallback);
                }
            }
        }.start();
    }

    public Set<String> getLocalControlDevices() {
        return this.mLocalControlDids;
    }

    public OutInfoConvertCallback getOutFuncConvertCallback() {
        return this.mOutInfoConvertCallback;
    }

    public void init(String str, String str2, OutInfoConvertCallback outInfoConvertCallback) {
        this.isCentralInited = true;
        this.mUid = str;
        this.mHomeId = str2;
        this.mOutInfoConvertCallback = outInfoConvertCallback;
        bindService();
    }

    public void initCentral() {
        new RemoteTask() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.4
            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void onBindFailed() {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "init bind fail: ");
                LocalControlCore.this.destroy(false);
            }

            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void run() throws Exception {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "init ");
                if (LocalControlCore.this.mLocalControlService == null || TextUtils.isEmpty(LocalControlCore.this.mUid) || TextUtils.isEmpty(LocalControlCore.this.mHomeId)) {
                    return;
                }
                LocalControlCore.this.mLocalControlService.init(LocalControlCore.this.mUid, LocalControlCore.this.mHomeId, new ILCCallback.Stub() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.4.1
                    @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
                    public void onFailure(int i, String str) throws RemoteException {
                        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "init fail: ");
                    }

                    @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
                    public void onSuccess(String str) throws RemoteException {
                        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "init suc: ");
                        if (LocalControlCore.this.mLocalControlService != null) {
                            LocalControlCore.this.mLocalControlService.setIDeviceCallback(LocalControlCore.this.mDeviceListCallback);
                            LocalControlCore.this.mLocalControlService.setISceneCallback(LocalControlCore.this.mSceneListCallback);
                            LocalControlCore.this.mLocalControlService.setCommonCallback(LocalControlCore.this.mCommonCallback);
                        }
                    }
                });
            }
        }.start();
    }

    public boolean isAcitonLocalControled(String str) {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "scene: id = " + str + " & " + this.isOutNetEnabled + "  && " + this.isCentralInited);
        if (ProcessUtil.isIsolateProcess(MiJiaEnvironment.getAppContext())) {
            return CentralMqttManager.getInstance().isAcitonLocalControled(str);
        }
        if (isServiceConnected()) {
            return this.mLocalControlSceneIds.contains(str);
        }
        return false;
    }

    public boolean isCentralInited() {
        return this.isCentralInited;
    }

    public boolean isDeviceInControlList(String str) {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "dev: did= " + str + " & " + this.isOutNetEnabled + "  & " + this.isCentralInited);
        if (ProcessUtil.isIsolateProcess(MiJiaEnvironment.getAppContext())) {
            return CentralMqttManager.getInstance().isDeviceInControlList(str);
        }
        if (isServiceConnected()) {
            return this.mLocalControlDids.contains(str);
        }
        return false;
    }

    public boolean isGetPropFromLocal(String str) {
        if (ProcessUtil.isIsolateProcess(MiJiaEnvironment.getAppContext())) {
            return CentralMqttManager.getInstance().isNeedRenderDeviceInfo() && CentralMqttManager.getInstance().isDeviceCanUseLocalControl(str);
        }
        if (isServiceConnected()) {
            return !this.isOutNetEnabled && isDeviceInControlList(str);
        }
        return false;
    }

    public boolean isOutNetEnabled() {
        if (ProcessUtil.isIsolateProcess(MiJiaEnvironment.getAppContext()) || isServiceConnected()) {
            return this.isOutNetEnabled;
        }
        return true;
    }

    public boolean isServiceConnected() {
        return this.isCentralInited && this.mLocalControlService != null;
    }

    public void refreshDeviceList() {
        new RemoteTask() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.5
            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void onBindFailed() {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "dev bind fail");
                LocalControlCore.this.destroy(false);
            }

            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void run() throws Exception {
                LogType logType = LogType.LOCAL_CONTROL;
                MiJiaLog.writeLogOnAll(logType, LocalControlCore.TAG, "refresh dev");
                if (LocalControlCore.this.mLocalControlService != null) {
                    LocalControlCore.this.mLocalControlService.refreshDeviceList();
                } else {
                    MiJiaLog.writeLogOnAll(logType, LocalControlCore.TAG, "dev: service is null");
                }
            }
        }.start();
    }

    public void refreshSceneList() {
        new RemoteTask() { // from class: com.xiaomi.smarthome.localcontrol.common.LocalControlCore.6
            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void onBindFailed() {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "sce onBindFailed: ");
                LocalControlCore.this.destroy(false);
            }

            @Override // com.xiaomi.smarthome.localcontrol.common.LocalControlCore.RemoteTask
            public void run() throws Exception {
                if (LocalControlCore.this.mLocalControlService != null) {
                    LocalControlCore.this.mLocalControlService.refreshSceneList();
                } else {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalControlCore.TAG, "sce: service is null");
                }
            }
        }.start();
    }

    public void setHomeId(String str) {
        this.mHomeId = str;
    }
}
