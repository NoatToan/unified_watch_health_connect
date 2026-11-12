package com.xiaomi.smarthome.core.server.internal.account;

import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.frame.JsonParser;
import com.xiaomi.smarthome.frame.SmartHomeApiParser;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class UserDegreeCheckManager {
    private static volatile UserDegreeCheckManager sInstance;
    private final AtomicBoolean mSyncOngoing = new AtomicBoolean(false);

    private UserDegreeCheckManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void generateUserDegreeValue(JSONObject jSONObject) {
        AccountDepApi.getInstance().setUserDegree(jSONObject);
    }

    public static UserDegreeCheckManager getInstance() {
        if (sInstance == null) {
            synchronized (UserDegreeCheckManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new UserDegreeCheckManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void checkAndSyncUserDegree() {
        if (AccountDepApi.getInstance().isDirty()) {
            MiJiaLog.onlyLogcat("UserDegree", "dirty true");
            if (this.mSyncOngoing.getAndSet(true)) {
                return;
            }
            MiJiaLog.onlyLogcat("UserDegree", "mSyncOngoing set true, start req");
            new ArrayList().add(new KeyValuePair("data", new JSONObject().toString()));
            NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/user/degree").build();
            final JsonParser<JSONObject> jsonParser = new JsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.core.server.internal.account.UserDegreeCheckManager.1
                @Override // com.xiaomi.smarthome.frame.JsonParser
                public JSONObject parse(JSONObject jSONObject) throws JSONException {
                    return jSONObject;
                }
            };
            final AsyncCallback<JSONObject, Error> asyncCallback = new AsyncCallback<JSONObject, Error>() { // from class: com.xiaomi.smarthome.core.server.internal.account.UserDegreeCheckManager.2
                @Override // com.xiaomi.smarthome.frame.AsyncCallback
                public void onFailure(Error error) {
                    MiJiaLog.onlyLogcat("UserDegree", "onFailure");
                    AccountDepApi.getInstance().cleanDirty();
                    UserDegreeCheckManager.this.mSyncOngoing.set(false);
                }

                @Override // com.xiaomi.smarthome.frame.AsyncCallback
                public void onSuccess(JSONObject jSONObject) {
                    MiJiaLog.onlyLogcat("UserDegree", "degree:" + jSONObject.toString());
                    try {
                        UserDegreeCheckManager.this.generateUserDegreeValue(jSONObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    AccountDepApi.getInstance().cleanDirty();
                    UserDegreeCheckManager.this.mSyncOngoing.set(false);
                }
            };
            SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.core.server.internal.account.UserDegreeCheckManager.3
                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onCache(NetResult netResult) {
                    SmartHomeApiParser.getInstance().parse(netResult, jsonParser, asyncCallback);
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onFailure(NetError netError) {
                    asyncCallback.onFailure(new Error(netError.getCode(), netError.getDetail()));
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onSuccess(NetResult netResult) {
                    SmartHomeApiParser.getInstance().parse(netResult, jsonParser, asyncCallback);
                }
            });
        }
    }
}
