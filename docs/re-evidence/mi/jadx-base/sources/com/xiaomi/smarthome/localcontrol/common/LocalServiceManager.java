package com.xiaomi.smarthome.localcontrol.common;

import android.os.RemoteException;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.localcontrol.ILCCallback;
import com.xiaomi.smarthome.localcontrol.ILocalControl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LocalServiceManager extends ILocalControl.Stub {
    private static final String TAG = "Central-SM";

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void changeHome(String str) {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "changeHome:" + str);
        CentralMqttManager.getInstance().changeHome(str);
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void controlDevice(String str, int i, String str2, int i2, ILCCallback iLCCallback) throws RemoteException {
        try {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "controlDevice: " + System.currentTimeMillis());
            CentralMqttManager.getInstance().controlDevice(new JSONObject(str), i, str2, iLCCallback, i2);
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "controlDevice: " + e);
            if (iLCCallback != null) {
                iLCCallback.onFailure(OTAErrorCode.BLE_DISCONNECTED_STATUS, "data is error:" + e);
            }
        }
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void destroy() throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "destroy");
        CentralMqttManager.getInstance().destroy(true);
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void excuteLocalAutomAction(String str, ILCCallback iLCCallback) throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "scene exc: " + System.currentTimeMillis());
        CentralMqttManager.getInstance().excuteLocalAutomAction(str, iLCCallback);
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void getDeviceProperty(String str, int i, int i2, int i3, ILCCallback iLCCallback) throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "get prop");
        CentralMqttManager.getInstance().getDeviceProperty(str, i, i2, iLCCallback);
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void init(String str, String str2, ILCCallback iLCCallback) throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "init");
        CentralMqttManager.getInstance().initClient(MiJiaEnvironment.getAppContext(), str, str2, iLCCallback);
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public boolean isAcitonLocalControled(String str) throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "scene in");
        return CentralMqttManager.getInstance().isAcitonLocalControled(str);
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public boolean isDeviceInControlList(String str) throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "dev in");
        return CentralMqttManager.getInstance().isDeviceInControlList(str);
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void refreshDeviceList() throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "device");
        CentralMqttManager.getInstance().checkRefreshDevicesList();
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void refreshSceneList() throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "scene");
        CentralMqttManager.getInstance().checkRefreshDevicesList();
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void setCommonCallback(ILCCallback iLCCallback) throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "setCommonCallback");
        CentralMqttManager.getInstance().setCommonCallback(iLCCallback);
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void setIDeviceCallback(ILCCallback iLCCallback) throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "setIDeviceCallback");
        CentralMqttManager.getInstance().setIDeviceCallback(iLCCallback);
    }

    @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
    public void setISceneCallback(ILCCallback iLCCallback) throws RemoteException {
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "setISceneCallback");
        CentralMqttManager.getInstance().setISceneCallback(iLCCallback);
    }
}
