package com.huami.watch.transdata.transport;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class ResultData {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public ResultData(HashMap map, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        parser(map, str);
    }

    public String getDataType() {
        return this.a;
    }

    public String getPkgName() {
        return this.b;
    }

    public String getResultInfo() {
        return this.c;
    }

    public String getSessionId() {
        return this.d;
    }

    public String getSubAction() {
        return this.e;
    }

    public void parser(HashMap map, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.optString("dataType");
            this.e = jSONObject.optString("subAction");
            this.c = jSONObject.optJSONObject("result").toString();
            this.b = DataTransHelper.translationPackage(this.a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (map != null) {
            this.d = (String) map.get("sessionId");
        }
    }
}
