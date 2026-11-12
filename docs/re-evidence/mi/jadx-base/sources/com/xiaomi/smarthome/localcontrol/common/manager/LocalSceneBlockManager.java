package com.xiaomi.smarthome.localcontrol.common.manager;

import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.miot.centralclientsdk.CentralClient;
import com.xiaomi.miot.centralclientsdk.a;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.localcontrol.ILCCallback;
import com.xiaomi.smarthome.localcontrol.common.CentralMqttManager;
import com.xiaomi.smarthome.localcontrol.common.DataModel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LocalSceneBlockManager {
    private static final String TAG = "Central-scene";
    private long TIME_START_EXCUTE_ACTION = 0;
    private long TIME_START_GETLOCALACTION = 0;
    private long mLastAutomListTime = 0;
    private Set<String> mLocalAutomActionList = Collections.synchronizedSet(new HashSet());
    private ILCCallback mSceneListCallback;

    public void excuteLocalAutomAction(String str, final ILCCallback iLCCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.mLocalAutomActionList.contains(str)) {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "not in list . id = " + str);
                if (iLCCallback != null) {
                    iLCCallback.onFailure(-1, "");
                    return;
                }
                return;
            }
            LogType logType = LogType.LOCAL_CONTROL;
            MiJiaLog.writeLogOnAll(logType, TAG, "exc id = " + str);
            if (!CentralMqttManager.getInstance().isCentralConnected()) {
                MiJiaLog.writeLogOnAll(logType, TAG, "disconnect ");
                if (iLCCallback != null) {
                    iLCCallback.onFailure(-1, "");
                    return;
                }
                return;
            }
            this.TIME_START_EXCUTE_ACTION = System.currentTimeMillis();
            jSONObject.put("operation", "user.click");
            jSONObject.put("id", str);
            try {
                a.a(DataModel.TOPIC_EXECT_MIJIA_AUTOM_ACTION, jSONObject.toString(), new CentralClient.b() { // from class: com.xiaomi.smarthome.localcontrol.common.manager.LocalSceneBlockManager.2
                    public void onReply(String str2, Object obj) {
                        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalSceneBlockManager.TAG, "本地场景执行成功: " + str2 + "   " + obj);
                        ILCCallback iLCCallback2 = iLCCallback;
                        if (iLCCallback2 != null) {
                            try {
                                iLCCallback2.onSuccess(str2);
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                        LocalSceneBlockManager.this.parseExcuteSceneResponse();
                    }
                }, null, 5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void getLocalActionGroupList() {
        if (!CentralMqttManager.getInstance().isCentralConnected()) {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "disconnect");
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "get list");
        this.TIME_START_GETLOCALACTION = System.currentTimeMillis();
        try {
            a.a(DataModel.TOPIC_GET_MIJIAACTIONGROUPLIST, "{}", new CentralClient.b() { // from class: com.xiaomi.smarthome.localcontrol.common.manager.LocalSceneBlockManager.1
                public void onReply(String str, Object obj) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalSceneBlockManager.TAG, "scene onReply: " + str + "   " + obj);
                    LocalSceneBlockManager.this.parseLocalAutomActionList(str);
                }
            }, null, 5000);
        } catch (Exception e) {
            e.printStackTrace();
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "exception");
        }
    }

    public boolean isAcitonLocalControled(String str) {
        return this.mLocalAutomActionList.contains(str);
    }

    public void notifyMain() throws Exception {
        ILCCallback iLCCallback;
        if (this.mLocalAutomActionList.size() <= 0 || (iLCCallback = this.mSceneListCallback) == null) {
            return;
        }
        iLCCallback.onSuccess(this.mLocalAutomActionList.toString());
    }

    public void parseExcuteSceneResponse() {
        if (this.TIME_START_EXCUTE_ACTION > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.TIME_START_GETLOCALACTION;
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "GATEWAY_OUTPUT:exc sce t = " + jCurrentTimeMillis);
            this.TIME_START_EXCUTE_ACTION = 0L;
        }
    }

    public void parseLocalAutomActionList(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.mLastAutomListTime = jCurrentTimeMillis;
            long j = this.TIME_START_GETLOCALACTION;
            if (j > 0) {
                MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "GATEWAY_OUTPUT:get list time = " + (jCurrentTimeMillis - j));
                this.TIME_START_GETLOCALACTION = 0L;
            }
            this.mLocalAutomActionList.clear();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("result");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String str2 = (String) jSONArrayOptJSONArray.get(i);
                    if (!TextUtils.isEmpty(str2)) {
                        this.mLocalAutomActionList.add(str2);
                    }
                }
                notifyMain();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setISceneCallback(ILCCallback iLCCallback) {
        this.mSceneListCallback = iLCCallback;
        try {
            notifyMain();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void subsceneAdd() {
        try {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "sub scene add");
            a.c(DataModel.TOPIC_BROADCAST_SCENE_ADD, new CentralClient.a() { // from class: com.xiaomi.smarthome.localcontrol.common.manager.LocalSceneBlockManager.3
                public void onBroadcast(String str, String str2, Object obj) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalSceneBlockManager.TAG, "onBroadcast: " + str + "   " + str2 + "  " + obj);
                    if (!TextUtils.equals(str, DataModel.TOPIC_BROADCAST_SCENE_ADD) || TextUtils.isEmpty(str2)) {
                        return;
                    }
                    try {
                        JSONArray jSONArrayOptJSONArray = new JSONObject(str2).optJSONArray("ids");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                String str3 = (String) jSONArrayOptJSONArray.get(i);
                                if (!TextUtils.isEmpty(str3)) {
                                    LocalSceneBlockManager.this.mLocalAutomActionList.add(str3);
                                }
                            }
                            LocalSceneBlockManager.this.notifyMain();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void subsceneDel() {
        try {
            MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, TAG, "sub scene del");
            a.c(DataModel.TOPIC_BROADCAST_SCENE_DEL, new CentralClient.a() { // from class: com.xiaomi.smarthome.localcontrol.common.manager.LocalSceneBlockManager.4
                public void onBroadcast(String str, String str2, Object obj) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, LocalSceneBlockManager.TAG, "onBroadcast: " + str + "   " + str2 + "  " + obj);
                    if (TextUtils.equals(str, DataModel.TOPIC_BROADCAST_SCENE_DEL)) {
                        try {
                            JSONArray jSONArrayOptJSONArray = new JSONObject(str2).optJSONArray("ids");
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                    String str3 = (String) jSONArrayOptJSONArray.get(i);
                                    if (!TextUtils.isEmpty(str3)) {
                                        LocalSceneBlockManager.this.mLocalAutomActionList.remove(str3);
                                    }
                                }
                                LocalSceneBlockManager.this.notifyMain();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
