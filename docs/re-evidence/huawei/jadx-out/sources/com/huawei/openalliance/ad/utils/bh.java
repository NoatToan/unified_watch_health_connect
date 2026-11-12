package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.constant.TagConstants;
import com.huawei.openalliance.ad.hw;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class bh {
    public static void a(String str, Map<String, String> map) {
        String string;
        try {
            hw.a("IntentSceneTagUtil", "get intentScene tag is %s", str);
            JSONArray jSONArray = new JSONArray(str);
            hw.b("IntentSceneTagUtil", "intentSceneInput size is %d", Integer.valueOf(jSONArray.length()));
            if (jSONArray.length() == 0) {
                return;
            }
            JSONArray jSONArrayA = a(jSONArray);
            hw.b("IntentSceneTagUtil", "intentSceneOutput size is %d", Integer.valueOf(jSONArrayA.length()));
            if (jSONArrayA.length() == 0) {
                return;
            }
            if (map.containsKey(TagConstants.SCENE_TYPE)) {
                JSONArray jSONArray2 = new JSONArray(map.get(TagConstants.SCENE_TYPE));
                for (int i = 0; i < jSONArrayA.length(); i++) {
                    jSONArray2.put(jSONArrayA.get(i));
                }
                string = jSONArray2.toString();
            } else {
                string = jSONArrayA.toString();
            }
            map.put(TagConstants.SCENE_TYPE, string);
        } catch (Throwable th) {
            hw.c("IntentSceneTagUtil", "get json error, %s", th.getClass().getSimpleName());
        }
    }

    private static JSONArray a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString(TagConstants.SCENE_NAME, "");
                String strOptString2 = jSONObject.optString("sceneId", "");
                if (!dg.b(strOptString) && !dg.b(strOptString2)) {
                    long jOptLong = jSONObject.optLong("expireTime", 0L);
                    if (jOptLong < jCurrentTimeMillis) {
                        hw.a("IntentSceneTagUtil", "tag %s expire time %d", strOptString2, Long.valueOf(jOptLong));
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(TagConstants.SCENE_NAME, strOptString);
                        jSONObject2.put(TagConstants.SCENE_SCORE, 1);
                        jSONObject2.put("sceneId", strOptString2);
                        jSONArray2.put(jSONObject2);
                    }
                }
            } catch (Throwable th) {
                hw.c("IntentSceneTagUtil", "get json error, %s", th.getClass().getSimpleName());
            }
        }
        hw.a("IntentSceneTagUtil", "report intentScene tag is %s", jSONArray2.toString());
        return jSONArray2;
    }
}
