package com.xiaomi.smarthome.localcontrol.common.manager;

import android.os.RemoteException;
import com.xiaomi.miot.centralclientsdk.CentralClient;
import com.xiaomi.miot.centralclientsdk.a;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.localcontrol.ILCCallback;
import com.xiaomi.smarthome.localcontrol.common.CentralMqttManager;
import com.xiaomi.smarthome.localcontrol.common.DataModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LocalGetPropBlockManager {
    private static final String TAG = "Central-get";

    public void getDeviceProperty(String str, int i, int i2, final ILCCallback iLCCallback) {
        if (!CentralMqttManager.getInstance().isCentralConnected()) {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "disconnect ");
            if (iLCCallback != null) {
                try {
                    iLCCallback.onFailure(-1, "");
                    return;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return;
                }
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iot");
            final JSONObject jSONObjectPut = new JSONObject().put("did", str).put("siid", i).put("piid", i2);
            jSONObject.put("params", jSONObjectPut);
            a.a(DataModel.TOPIC_GET_PROPERTY, jSONObject.toString(), new CentralClient.b() { // from class: com.xiaomi.smarthome.localcontrol.common.manager.LocalGetPropBlockManager.1
                public void onReply(String str2, Object obj) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalGetPropBlockManager.TAG, "prop get: " + jSONObjectPut + "   res = " + str2);
                    LocalGetPropBlockManager.this.parseGetPropResponse(str2, iLCCallback);
                }
            }, null, 5000);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void parseGetPropResponse(String str, ILCCallback iLCCallback) {
        if (iLCCallback != null) {
            try {
                iLCCallback.onSuccess(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
