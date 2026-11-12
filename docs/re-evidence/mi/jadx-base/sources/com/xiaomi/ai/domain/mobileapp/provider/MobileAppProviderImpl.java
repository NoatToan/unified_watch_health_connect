package com.xiaomi.ai.domain.mobileapp.provider;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MobileAppProviderImpl {
    private static final JSONObject CONTENT_JS;

    static {
        JSONObject jSONObject = new JSONObject();
        CONTENT_JS = jSONObject;
        try {
            jSONObject.put("to_speak", "");
            jSONObject.put("open_mic", false);
        } catch (JSONException unused) {
            throw new RuntimeException("MobileAppProviderImpl initEdgeBaseAndBlackResource failed");
        }
    }

    public boolean init() {
        return true;
    }

    public JSONObject provide() {
        return CONTENT_JS;
    }
}
