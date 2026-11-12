package com.xiaomi.smarthome.localcontrol.common.manager;

import android.content.Intent;
import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.miot.centralclientsdk.CentralClient;
import com.xiaomi.miot.centralclientsdk.a;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.localcontrol.ILCCallback;
import com.xiaomi.smarthome.localcontrol.common.CentralMqttManager;
import com.xiaomi.smarthome.localcontrol.common.DataModel;
import com.xiaomi.smarthome.localcontrol.common.util.LocalControlConstant;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LocalRpcBlockManager {
    public static final int RPC_TYPE_ACTION = 2;
    public static final int RPC_TYPE_SET_PROP = 1;
    private static final String TAG = "Central-Rpc";

    private void reportExcute(String str, int i) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("did", str).put("time", System.currentTimeMillis()).put("source", i).put(DeviceContractKt.COLUMN_DEVICE_TYPE, CentralMqttManager.getInstance().getDeviceType());
            if (i != 2 || CentralMqttManager.getInstance().getStatReport() == null) {
                Intent intent = new Intent(LocalControlConstant.ACTION_LOCAL_CONTROL_RPC_RESULT);
                intent.putExtra("type", 1);
                intent.putExtra("value", jSONObjectPut.toString());
                CentralMqttManager.getInstance().getContext().sendBroadcast(intent);
            } else {
                CentralMqttManager.getInstance().getStatReport().reportStat(1, jSONObjectPut);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void reportLocalControlFailed(int i, String str, String str2) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("time", System.currentTimeMillis()).put("request", str).put(b.I, str2).put("source", i).put(DeviceContractKt.COLUMN_DEVICE_TYPE, CentralMqttManager.getInstance().getDeviceType());
            if (i != 2 || CentralMqttManager.getInstance().getStatReport() == null) {
                Intent intent = new Intent(LocalControlConstant.ACTION_LOCAL_CONTROL_RPC_RESULT);
                intent.putExtra("type", 2);
                intent.putExtra("value", jSONObjectPut.toString());
                CentralMqttManager.getInstance().getContext().sendBroadcast(intent);
            } else {
                CentralMqttManager.getInstance().getStatReport().reportStat(1, jSONObjectPut);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void rpcFailedResponse(int i, String str, String str2, boolean z) {
        CentralMqttManager.getInstance().excuteGetDeviceList();
        if (z) {
            reportLocalControlFailed(i, str, str2);
        }
    }

    private void rpcSuccessResponse(String str, int i, String str2, int i2, long j) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("did", str).put("cost_time", j).put("error_code", i2).put(DeviceContractKt.COLUMN_DEVICE_TYPE, CentralMqttManager.getInstance().getDeviceType()).put("source", i).put(b.I, str2);
            if (i != 2 || CentralMqttManager.getInstance().getStatReport() == null) {
                Intent intent = new Intent(LocalControlConstant.ACTION_LOCAL_CONTROL_RPC_RESULT);
                intent.putExtra("type", 3);
                intent.putExtra("value", jSONObjectPut.toString());
                CentralMqttManager.getInstance().getContext().sendBroadcast(intent);
            } else {
                CentralMqttManager.getInstance().getStatReport().reportStat(3, jSONObjectPut);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void controlDevice(JSONObject jSONObject, final int i, final String str, final ILCCallback iLCCallback, final int i2) {
        LogType logType = LogType.LOCAL_CONTROL;
        MiJiaLog.writeLogOnAll(logType, TAG, "controlDevice : type = " + i + "  did=" + str + "  source=" + i2 + "  params=" + jSONObject);
        if (CentralMqttManager.getInstance().getCheckControledCondition() && !CentralMqttManager.getInstance().isDeviceCanUseLocalControl(str)) {
            MiJiaLog.writeLogOnAll(logType, TAG, "not in list ");
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
        if (!CentralMqttManager.getInstance().isCentralConnected()) {
            MiJiaLog.writeLogOnAll(logType, TAG, "disconnect ");
            if (iLCCallback != null) {
                try {
                    iLCCallback.onFailure(-1, "");
                    return;
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            return;
        }
        try {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "iot");
            jSONObject.put("method", i == 1 ? "set_properties" : "action");
            jSONObject2.put("params", new JSONObject().put("did", str).put("RPC", jSONObject));
            try {
                reportExcute(str, i2);
                a.a(DataModel.TOPIC_SEND_RPC, jSONObject2.toString(), new CentralClient.b() { // from class: com.xiaomi.smarthome.localcontrol.common.manager.LocalRpcBlockManager.1
                    public void onReply(String str2, Object obj) {
                        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalRpcBlockManager.TAG, "rpc onReply: " + str2 + "   " + obj);
                        LocalRpcBlockManager.this.parseRpcResponse(str, jCurrentTimeMillis, i, i2, jSONObject2.toString(), str2, iLCCallback);
                    }
                }, null, 5000);
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public void parseRpcResponse(String str, long j, int i, int i2, String str2, String str3, ILCCallback iLCCallback) {
        if (iLCCallback == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            long jCurrentTimeMillis = 0;
            if (j > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - j;
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "GATEWAY_OUTPUT:time = " + jCurrentTimeMillis);
            }
            long j2 = jCurrentTimeMillis;
            if (i == 1) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("result");
                JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.get(0);
                int iOptInt = jSONObject2.optInt("code");
                if (iOptInt < 0) {
                    reportLocalControlFailed(i2, str2, str3);
                }
                if (jSONArrayOptJSONArray.length() > 0) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "GATEWAY_OUTPUT: 本地控制成功：" + str3);
                    iLCCallback.onSuccess(jSONObject2.toString());
                } else {
                    iLCCallback.onFailure(-3, "");
                    rpcFailedResponse(i2, str2, str3, iOptInt >= 0);
                }
                rpcSuccessResponse(str, i2, str3, iOptInt, j2);
                return;
            }
            if (i != 2) {
                iLCCallback.onFailure(-5, "");
                rpcFailedResponse(i2, str2, str3, true);
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
            int iOptInt2 = jSONObjectOptJSONObject.optInt("code");
            if (iOptInt2 < 0) {
                reportLocalControlFailed(i2, str2, str3);
            }
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "GATEWAY_OUTPUT:本地控制成功 action: " + str3);
            iLCCallback.onSuccess(jSONObjectOptJSONObject.toString());
            rpcSuccessResponse(str, i2, str3, iOptInt2, j2);
        } catch (Exception e) {
            try {
                iLCCallback.onFailure(-6, "");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            rpcFailedResponse(i2, str2, str3, true);
            e.printStackTrace();
        }
    }
}
