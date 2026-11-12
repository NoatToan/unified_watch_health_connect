package com.huawei.hms.support.api.entity.safetydetect;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class UrlCheckResponse {
    private List<UrlCheckThreat> urlCheckThreats;

    public List<UrlCheckThreat> getUrlCheckResponse() {
        return this.urlCheckThreats;
    }

    public UrlCheckResponse(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.urlCheckThreats = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONObject("rtdResults").getJSONArray("threatType");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.urlCheckThreats.add(new UrlCheckThreat(jSONArray.getInt(i)));
        }
    }
}
