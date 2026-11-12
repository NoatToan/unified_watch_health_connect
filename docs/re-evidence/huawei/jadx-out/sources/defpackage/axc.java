package defpackage;

import com.huawei.ads.fund.util.JsonUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class axc {
    private static axw a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        axw axwVar = new axw();
        double dOptDouble = jSONObjectOptJSONObject.optDouble("videoRatio");
        axwVar.c(1000);
        axwVar.b((int) (dOptDouble * 1000.0d));
        return axwVar;
    }

    public static axw c(JSONObject jSONObject) {
        JSONObject jSONObjectCreateJsonObj = JsonUtil.createJsonObj(jSONObject.optString("metaData"));
        if (jSONObjectCreateJsonObj == null) {
            return null;
        }
        return jSONObjectCreateJsonObj.has("videoInfo") ? a(jSONObjectCreateJsonObj) : b(jSONObjectCreateJsonObj);
    }

    private static axw b(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("imageInfo");
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        axw axwVar = new axw();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                axwVar.b(jSONObjectOptJSONObject.optInt("width"));
                axwVar.c(jSONObjectOptJSONObject.optInt("height"));
                axwVar.a(jSONObjectOptJSONObject.optString("url"));
            }
        }
        return axwVar;
    }
}
