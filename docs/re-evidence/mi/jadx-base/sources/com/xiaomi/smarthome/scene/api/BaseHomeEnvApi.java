package com.xiaomi.smarthome.scene.api;

import android.text.TextUtils;
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
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class BaseHomeEnvApi {
    public static AsyncHandle getTopWidgetEnvInfo(String str, long j, final AsyncCallback<JSONObject, Error> asyncCallback) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("home_id", Long.parseLong(str));
            jSONObject.put("owner_id", j);
        } catch (JSONException unused) {
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/smh/get_home_env_data").addQueries(arrayList).build();
        final JsonParser<JSONObject> jsonParser = new JsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.scene.api.BaseHomeEnvApi.1
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public JSONObject parse(JSONObject jSONObject2) throws JSONException {
                return jSONObject2;
            }
        };
        return new AsyncHandle(SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.scene.api.BaseHomeEnvApi.2
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
                SmartHomeApiParser.getInstance().parse(netResult, jsonParser, asyncCallback);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                AsyncCallback asyncCallback2 = asyncCallback;
                if (asyncCallback2 != null) {
                    asyncCallback2.sendFailureMessage(netError == null ? new Error(-1, "getTopWidgetEnvInfo error") : new Error(netError.getCode(), netError.getDetail(), netError.getmExtraMsg()));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                SmartHomeApiParser.getInstance().parse(netResult, jsonParser, asyncCallback);
            }
        }));
    }
}
