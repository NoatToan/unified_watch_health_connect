package com.huawei.networkclient;

import android.content.Context;
import com.huawei.hms.network.embedded.w9;
import defpackage.ofe;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes40.dex */
public class SseRequestFactory implements ParamsFactory {
    private Context d;

    public SseRequestFactory(Context context) {
        this.d = context;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        map.put("Accept", "*/*");
        map.put("Cache-Control", "no-cache");
        map.put("Connection", w9.j);
        return map;
    }

    public Map<String, String> a(JSONObject jSONObject) {
        Map<String, String> headers = getHeaders();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                headers.put(next, jSONObject.optString(next));
            }
        }
        return headers;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        return obj == null ? new HashMap() : ofe.a(obj);
    }

    public String c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }
}
