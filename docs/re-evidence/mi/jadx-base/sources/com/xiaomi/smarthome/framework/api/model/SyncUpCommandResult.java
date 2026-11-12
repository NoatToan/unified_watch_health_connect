package com.xiaomi.smarthome.framework.api.model;

import com.mibi.sdk.component.Constants;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SyncUpCommandResult {
    public int errorCode;
    public int id;
    public HashMap<String, Object> init;
    public long lastModified;

    public static SyncUpCommandResult parseFromJson(JSONObject jSONObject) {
        SyncUpCommandResult syncUpCommandResult = new SyncUpCommandResult();
        syncUpCommandResult.id = jSONObject.optInt("id");
        syncUpCommandResult.errorCode = jSONObject.optInt(Constants.KEY_PAY_RESULT_RET);
        return syncUpCommandResult;
    }

    public boolean isExecuteSuccess() {
        return this.errorCode == 1;
    }
}
