package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class trg {
    public static String b(JSONObject jSONObject, String str) {
        if (jSONObject != null && !jSONObject.isNull(str)) {
            try {
                if (jSONObject.isNull(str)) {
                    return "";
                }
                return jSONObject.getString(str);
            } catch (JSONException e) {
                LogUtil.e("ConfiguredPage_ParseUtil", "getJsonValue meet json exception: ", e.getMessage());
            }
        }
        return "";
    }

    public static int c(JSONObject jSONObject, String str) {
        if (jSONObject != null && !jSONObject.isNull(str)) {
            try {
                if (jSONObject.isNull(str)) {
                    return 0;
                }
                return jSONObject.getInt(str);
            } catch (JSONException e) {
                LogUtil.e("ConfiguredPage_ParseUtil", "getJsonValue meet json exception: ", e.getMessage());
            }
        }
        return 0;
    }
}
