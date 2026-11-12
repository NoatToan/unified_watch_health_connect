package com.xiaomi.smarthome.localcontrol.common.manager;

import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.miot.centralclientsdk.CentralClient;
import com.xiaomi.miot.centralclientsdk.a;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.localcontrol.ILCCallback;
import com.xiaomi.smarthome.localcontrol.common.CentralMqttManager;
import com.xiaomi.smarthome.localcontrol.common.DataModel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LocalDeviceBlockManager {
    private static final String TAG = "Central-DevM";
    private static final int TIME_GET_LIST_MIN_INTERVAL = 30000;
    private ILCCallback mDeviceListCallback;
    private long TIME_START_GETDEVICE = 0;
    private long mLastDeviceListTime = 0;
    private Set<String> mLocalControlDevices = new CopyOnWriteArraySet();

    public void getControlDeviceList(boolean z, final boolean z2) {
        LogType logType = LogType.LOCAL_CONTROL;
        MiJiaLog.writeLogOnAll(logType, TAG, "get device ");
        if (!CentralMqttManager.getInstance().isCentralConnected()) {
            MiJiaLog.writeLogOnAll(logType, TAG, "disconnect ");
            return;
        }
        if (!z && CentralMqttManager.getInstance().getOutNetAailabled() && System.currentTimeMillis() - this.mLastDeviceListTime <= 30000) {
            MiJiaLog.writeLogOnAll(logType, TAG, "dev last req < 30s ");
            return;
        }
        this.TIME_START_GETDEVICE = System.currentTimeMillis();
        try {
            a.a(DataModel.TOPIC_GET_DEVICELIST, "{}", new CentralClient.b() { // from class: com.xiaomi.smarthome.localcontrol.common.manager.LocalDeviceBlockManager.1
                public void onReply(String str, Object obj) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalDeviceBlockManager.TAG, "onReply: " + str + "   " + obj);
                    LocalDeviceBlockManager.this.parseLocalDeviceList(str, z2);
                }
            }, null, 5000);
        } catch (Exception e) {
            e.printStackTrace();
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "device exc");
        }
    }

    public Set<String> getLocalControlDevices() {
        return this.mLocalControlDevices;
    }

    public void getOutNetState(final boolean z) throws Exception {
        a.a(DataModel.TOPIC_GET_NETWORK_STATUS, "{}", new CentralClient.b() { // from class: com.xiaomi.smarthome.localcontrol.common.manager.LocalDeviceBlockManager.2
            public void onReply(String str, Object obj) {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalDeviceBlockManager.TAG, "out onReply: " + str + "   " + obj);
                try {
                    LocalDeviceBlockManager.this.parseNetStatus(new JSONObject(str), z);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, null, 5000);
    }

    public boolean isDeviceCanUseLocalControl(String str) {
        return this.mLocalControlDevices.contains(str);
    }

    public synchronized void parseLocalDeviceList(String str, boolean z) {
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.mLastDeviceListTime = jCurrentTimeMillis;
                long j = this.TIME_START_GETDEVICE;
                if (j > 0) {
                    long j2 = jCurrentTimeMillis - j;
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "GATEWAY_OUTPUT:time = " + j2);
                    this.TIME_START_GETDEVICE = 0L;
                }
                this.mLocalControlDevices.clear();
                JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("devList");
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                int i = 0;
                while (itKeys.hasNext()) {
                    i++;
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject2 != null) {
                        boolean zOptBoolean = jSONObjectOptJSONObject2.optBoolean("specV2Access");
                        boolean zOptBoolean2 = jSONObjectOptJSONObject2.optBoolean("online");
                        if (zOptBoolean && zOptBoolean2) {
                            stringBuffer.append(next + ",");
                            this.mLocalControlDevices.add(next);
                        }
                    }
                }
                if (this.mLocalControlDevices.size() > 0) {
                    if (this.mDeviceListCallback != null) {
                        this.mDeviceListCallback.onSuccess(new JSONObject().put("type", "did").put("value", stringBuffer.toString()).toString());
                    }
                    getOutNetState(z);
                }
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "GATEWAY_OUTPUT: allDevices count= " + i + "  && can be controled count = " + this.mLocalControlDevices.size() + "  && control dids = " + stringBuffer.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void parseNetStatus(JSONObject jSONObject, boolean z) {
        if (jSONObject == null || !jSONObject.has("online")) {
            return;
        }
        boolean zOptBoolean = jSONObject.optBoolean("online", true);
        CentralMqttManager.getInstance().setOutNetAailabled(zOptBoolean);
        try {
            if (this.mDeviceListCallback != null) {
                this.mDeviceListCallback.onSuccess(new JSONObject().put("type", OneTrack.Param.NET).put("value", zOptBoolean).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!zOptBoolean || z) {
            Intent intent = new Intent("com.xiaomi.smarthome.localcontrol");
            intent.putExtra("isNetChanged", z);
            intent.putExtra("online", zOptBoolean);
            CentralMqttManager.getInstance().getContext().sendBroadcast(intent);
        }
    }

    public void setIDeviceCallback(ILCCallback iLCCallback) {
        this.mDeviceListCallback = iLCCallback;
        try {
            if (this.mLocalControlDevices.size() <= 0 || iLCCallback == null) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (String str : this.mLocalControlDevices) {
                if (!TextUtils.isEmpty(str)) {
                    stringBuffer.append(str + ",");
                }
            }
            iLCCallback.onSuccess(new JSONObject().put("type", "did").put("value", stringBuffer.toString()).toString());
            iLCCallback.onSuccess(new JSONObject().put("type", OneTrack.Param.NET).put("value", CentralMqttManager.getInstance().getOutNetAailabled()).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void subDevListChange() {
        try {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "sub devicelist");
            a.c(DataModel.TOPIC_BROADCAST_DEVICELIST, new CentralClient.a() { // from class: com.xiaomi.smarthome.localcontrol.common.manager.LocalDeviceBlockManager.3
                public void onBroadcast(String str, String str2, Object obj) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalDeviceBlockManager.TAG, "onBroadcast: " + str + "   " + str2 + "  " + obj);
                    if (TextUtils.equals(str, DataModel.TOPIC_BROADCAST_DEVICELIST)) {
                        LocalDeviceBlockManager.this.getControlDeviceList(true, false);
                    }
                }
            }, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void subNetworkStatus() {
        try {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "sub net work");
            a.c(DataModel.TOPIC_BROADCAST_NETWORK_STATUS, new CentralClient.a() { // from class: com.xiaomi.smarthome.localcontrol.common.manager.LocalDeviceBlockManager.4
                public void onBroadcast(String str, String str2, Object obj) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalDeviceBlockManager.TAG, "onBroadcast: " + str + "   " + str2 + "  " + obj);
                    if (TextUtils.equals(str, DataModel.TOPIC_BROADCAST_NETWORK_STATUS)) {
                        LocalDeviceBlockManager.this.getControlDeviceList(true, true);
                    }
                }
            }, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
