package defpackage;

import com.huawei.openalliance.ad.constant.AssetAlias;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.openplatform.abl.log.HiAdLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class axe {
    public static axw c(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(ContentTemplateRecord.ASSETS);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        axw axwVar = new axw();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("alias");
            if (strOptString.startsWith(AssetAlias.VIDEO)) {
                a(jSONObjectOptJSONObject, axwVar);
            } else if (strOptString.startsWith(AssetAlias.IMAGE)) {
                c(jSONObjectOptJSONObject, axwVar);
            }
        }
        return axwVar;
    }

    private static void a(JSONObject jSONObject, axw axwVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        axwVar.b(jSONObjectOptJSONObject.optInt("W"));
        axwVar.c(jSONObjectOptJSONObject.optInt("H"));
    }

    public static String d(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(ContentTemplateRecord.ASSETS)) != null && jSONArrayOptJSONArray.length() != 0) {
            String strOptString = "";
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.get(i);
                    if (AssetAlias.AD_TITLE.equals(jSONObject2.optString("alias"))) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("title");
                        if (jSONObjectOptJSONObject != null) {
                            strOptString = jSONObjectOptJSONObject.optString("text");
                            break;
                        }
                        return strOptString;
                    }
                    continue;
                } catch (JSONException unused) {
                    HiAdLog.e("AdContentParserV3", "get title error");
                    strOptString = "";
                }
            }
            return strOptString;
        }
        return "";
    }

    private static void c(JSONObject jSONObject, axw axwVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("img");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        axwVar.b(jSONObjectOptJSONObject.optInt("W"));
        axwVar.c(jSONObjectOptJSONObject.optInt("H"));
        axwVar.a(jSONObjectOptJSONObject.optString("url"));
    }

    public static String e(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(ContentTemplateRecord.ASSETS)) != null && jSONArrayOptJSONArray.length() != 0) {
            String strOptString = "";
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.get(i);
                    if (AssetAlias.AD_LABEL.equals(jSONObject2.optString("alias"))) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                        if (jSONObjectOptJSONObject != null) {
                            strOptString = jSONObjectOptJSONObject.optString("value");
                            break;
                        }
                        return strOptString;
                    }
                    continue;
                } catch (JSONException unused) {
                    HiAdLog.e("AdContentParserV3", "get adBrandInfo error");
                    strOptString = "";
                }
            }
            return strOptString;
        }
        return "";
    }
}
