package com.xiaomi.smarthome.scene.api;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.net.Crypto;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.frame.AsyncHandle;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.frame.JsonParser;
import com.xiaomi.smarthome.frame.SmartHomeApiParser;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.localcontrol.ILCCallback;
import com.xiaomi.smarthome.localcontrol.common.LocalControlCore;
import com.xiaomi.smarthome.network.SmartHomeRequestManager;
import com.xiaomi.smarthome.scene.api.BaseSceneApi;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class BaseSceneApi {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject lambda$runGeoFenceSpecScene$0(JSONObject jSONObject) throws JSONException {
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject lambda$runSpecSceneRemote$1(JSONObject jSONObject) throws JSONException {
        return jSONObject;
    }

    @Deprecated
    public static AsyncHandle miioSceneStart(Context context, String str, final AsyncCallback<Void, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("us_id", str);
            jSONObject.put("key", "");
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return new AsyncHandle(SmartHomeRc4Api.getInstance().sendRequest(new NetRequest.Builder().method("POST").path("/scene/start").addQueries(arrayList).build(), new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.scene.api.BaseSceneApi.3
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
                SmartHomeApiParser.getInstance().parse(netResult, null, asyncCallback);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                AsyncCallback asyncCallback2 = asyncCallback;
                if (asyncCallback2 != null) {
                    asyncCallback2.sendFailureMessage(netError == null ? new Error(-1, "miioSceneStart error") : new Error(netError.getCode(), netError.getDetail(), netError.getmExtraMsg()));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                SmartHomeApiParser.getInstance().parse(netResult, null, asyncCallback);
            }
        }));
    }

    @Deprecated
    public static AsyncHandle runGeoFenceSpecScene(Context context, String str, String str2, String str3, String str4, AsyncCallback<JSONObject, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene_id", str2);
            jSONObject.put("trigger_key", str);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("home_id", str3);
            }
            if (!TextUtils.isEmpty(str4) && !TextUtils.equals("0", str4)) {
                jSONObject.put("owner_id", str4);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/appgateway/miot/appsceneservice/AppSceneService/RunScene").addQueries(arrayList).build(), new JsonParser() { // from class: sb2
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public final Object parse(JSONObject jSONObject2) {
                return BaseSceneApi.lambda$runGeoFenceSpecScene$0(jSONObject2);
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle runSceneNew(final String str, final int i, final AsyncCallback<JSONObject, Error> asyncCallback) {
        LogType logType = LogType.LOCAL_CONTROL;
        MiJiaLog.writeLogOnAll(logType, "Central", "runSceneNew : sceneId = " + str);
        if (LocalControlCore.getInstance().isAcitonLocalControled(str)) {
            LocalControlCore.getInstance().excuteLocalAutomAction(str, new ILCCallback.Stub() { // from class: com.xiaomi.smarthome.scene.api.BaseSceneApi.1
                @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
                public void onFailure(int i2, String str2) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, "IDMClient", "场景本地控制失败，继续走云端");
                    BaseSceneApi.runSceneNewRemote(str, i, asyncCallback);
                }

                @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
                public void onSuccess(String str2) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, "IDMClient", "场景本地控制成功 : sceneId = " + str);
                }
            });
            return null;
        }
        MiJiaLog.writeLogOnAll(logType, "IDMClient", "场景直接走云端。sceneId = " + str);
        return runSceneNewRemote(str, i, asyncCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AsyncHandle runSceneNewRemote(String str, int i, final AsyncCallback<JSONObject, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene_id", str);
            jSONObject.put("scene_type", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return new AsyncHandle(SmartHomeRc4Api.getInstance().sendRequest(new NetRequest.Builder().method("POST").path("/appgateway/miot/appsceneservice/AppSceneService/NewRunScene").addQueries(arrayList).build(), new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.scene.api.BaseSceneApi.2
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
                SmartHomeApiParser.getInstance().parse(netResult, null, asyncCallback);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                AsyncCallback asyncCallback2 = asyncCallback;
                if (asyncCallback2 != null) {
                    asyncCallback2.sendFailureMessage(netError == null ? new Error(-1, "NewRunScene error") : new Error(netError.getCode(), netError.getDetail(), netError.getmExtraMsg()));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                SmartHomeApiParser.getInstance().parse(netResult, null, asyncCallback);
            }
        }));
    }

    @Deprecated
    public static AsyncHandle runSpecScene(final Context context, final String str, final AsyncCallback<JSONObject, Error> asyncCallback) {
        LogType logType = LogType.LOCAL_CONTROL;
        MiJiaLog.writeLogOnAll(logType, "IDMClient", "runSpecScene : sceneId = " + str);
        if (LocalControlCore.getInstance().isAcitonLocalControled(str)) {
            LocalControlCore.getInstance().excuteLocalAutomAction(str, new ILCCallback.Stub() { // from class: com.xiaomi.smarthome.scene.api.BaseSceneApi.5
                @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
                public void onFailure(int i, String str2) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, "IDMClient", "场景本地控制失败，继续走云端");
                    BaseSceneApi.runSpecSceneRemote(context, str, asyncCallback);
                }

                @Override // com.xiaomi.smarthome.localcontrol.ILCCallback
                public void onSuccess(String str2) {
                    MiJiaLog.writeLogOnAll(LogType.LOCAL_CONTROL, "IDMClient", "场景本地控制成功 : sceneId = " + str);
                }
            });
            return null;
        }
        MiJiaLog.writeLogOnAll(logType, "IDMClient", "场景直接走云端。sceneId = " + str);
        return runSpecSceneRemote(context, str, asyncCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public static AsyncHandle runSpecSceneRemote(Context context, String str, final AsyncCallback<JSONObject, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene_id", str);
            jSONObject.put("trigger_key", "user.click");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/appgateway/miot/appsceneservice/AppSceneService/RunScene").addQueries(arrayList).build();
        final JsonParser jsonParser = new JsonParser() { // from class: rb2
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public final Object parse(JSONObject jSONObject2) {
                return BaseSceneApi.lambda$runSpecSceneRemote$1(jSONObject2);
            }
        };
        return new AsyncHandle(SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.scene.api.BaseSceneApi.6
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
                SmartHomeApiParser.getInstance().parse(netResult, jsonParser, asyncCallback);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                AsyncCallback asyncCallback2 = asyncCallback;
                if (asyncCallback2 != null) {
                    asyncCallback2.sendFailureMessage(netError == null ? new Error(-1, "miioSceneStart error") : new Error(netError.getCode(), netError.getDetail(), netError.getmExtraMsg()));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                SmartHomeApiParser.getInstance().parse(netResult, jsonParser, asyncCallback);
            }
        }));
    }

    public static void runSceneNew(String str, int i) {
        runSceneNew(str, i, new AsyncCallback<JSONObject, Error>() { // from class: com.xiaomi.smarthome.scene.api.BaseSceneApi.4
            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onFailure(Error error) {
                MiJiaLog.writeLogOnAll(LogType.MIJIA_WIDGET, "tag", "miioSceneStart error:" + error);
            }

            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onSuccess(JSONObject jSONObject) {
                MiJiaLog.writeLogOnAll(LogType.MIJIA_WIDGET, "tag", "miioSceneStart success:");
            }
        });
    }
}
