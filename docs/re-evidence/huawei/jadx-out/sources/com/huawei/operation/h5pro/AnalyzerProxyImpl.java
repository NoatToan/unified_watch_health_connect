package com.huawei.operation.h5pro;

import android.content.Context;
import com.huawei.health.h5pro.dfx.bi.AnalyzerProxy;
import defpackage.lmf;
import defpackage.lmn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnalyzerProxyImpl implements AnalyzerProxy {
    private static final String BI_KEY_CONTENT_LOWER = "content";
    private static final String BI_KEY_CONTENT_UPPER = "CONTENT";
    private static final String BI_KEY_PAGE_PROPERTIES = "pageProperties";
    private static final String BI_KEY_SCENE = "scene";

    @Override // com.huawei.health.h5pro.dfx.bi.AnalyzerProxy
    public boolean putBiEvent(Context context, String str, LinkedHashMap<String, String> linkedHashMap, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        Map<String, Object> mapJsonObject2Map;
        if (!jSONObject.has(BI_KEY_PAGE_PROPERTIES) && !jSONObject.has("scene")) {
            return false;
        }
        lmn lmnVar = new lmn();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BI_KEY_PAGE_PROPERTIES);
        jSONObject.remove(BI_KEY_PAGE_PROPERTIES);
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jsonObject2Map(jSONArrayOptJSONArray.optJSONObject(i), true));
            }
            lmnVar.d(arrayList);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("scene");
        jSONObject.remove("scene");
        if (jSONObjectOptJSONObject2 != null) {
            lmnVar.d(jsonObject2Map(jSONObjectOptJSONObject2));
        }
        if (jSONObject.has("content")) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("content");
            jSONObject.remove("content");
        } else if (jSONObject.has(BI_KEY_CONTENT_UPPER)) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject(BI_KEY_CONTENT_UPPER);
            jSONObject.remove(BI_KEY_CONTENT_UPPER);
        } else {
            jSONObjectOptJSONObject = null;
        }
        if (jSONObjectOptJSONObject != null) {
            mapJsonObject2Map = jsonObject2Map(jSONObjectOptJSONObject);
        } else {
            mapJsonObject2Map = jsonObject2Map(jSONObject);
        }
        mapJsonObject2Map.putAll(linkedHashMap);
        lmnVar.e(mapJsonObject2Map);
        lmf.d().a(context, str, lmnVar, 0);
        return true;
    }

    private Map<String, Object> jsonObject2Map(JSONObject jSONObject) {
        return jsonObject2Map(jSONObject, false);
    }

    private Map<String, Object> jsonObject2Map(JSONObject jSONObject, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (z && (objOpt instanceof Boolean)) {
                linkedHashMap.put(next, String.valueOf(objOpt));
            } else {
                linkedHashMap.put(next, objOpt);
            }
        }
        return linkedHashMap;
    }
}
