package defpackage;

import android.text.TextUtils;
import com.huawei.hms.network.embedded.x2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class ykz {
    public static String b(String str) {
        JSONObject jSONObjectA = a(str);
        if (jSONObjectA == null) {
            yit.c("RequestJsonParser", "getRequestType requestHeaderObject is null");
            return "";
        }
        if (!jSONObjectA.has(x2.REQUEST_TYPE)) {
            yit.c("RequestJsonParser", "getRequestType requestHeaderObject not has request_type");
            return "";
        }
        try {
            return jSONObjectA.getString(x2.REQUEST_TYPE);
        } catch (JSONException unused) {
            yit.c("RequestJsonParser", "getRequestType JSONException");
            return "";
        }
    }

    public static String[] e(String str) {
        JSONObject jSONObjectD = d(str);
        String[] strArr = new String[0];
        if (jSONObjectD == null) {
            yit.c("RequestJsonParser", "getRequestBodyPermission requestBodyObject is null");
            return strArr;
        }
        if (!jSONObjectD.has("permissions")) {
            yit.c("RequestJsonParser", "getRequestBodyPermission requestBodyObject not has permissions");
            return strArr;
        }
        try {
            JSONArray jSONArray = jSONObjectD.getJSONArray("permissions");
            strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = jSONArray.getString(i);
            }
            return strArr;
        } catch (JSONException unused) {
            yit.b("RequestJsonParser", "getRequestBodyPermission JSONException");
            return strArr;
        }
    }

    public static String c(String str) {
        JSONObject jSONObjectD = d(str);
        if (jSONObjectD == null) {
            yit.c("RequestJsonParser", "getRequestBodyPackageName requestBodyObject is null");
            return "";
        }
        if (!jSONObjectD.has("package_name")) {
            yit.c("RequestJsonParser", "getRequestBodyPackageName requestBodyObject not has package_name");
            return "";
        }
        try {
            return jSONObjectD.getString("package_name");
        } catch (JSONException unused) {
            yit.b("RequestJsonParser", "getRequestBodyPackageName JSONException");
            return "";
        }
    }

    private static JSONObject a(String str) {
        if (TextUtils.isEmpty(str)) {
            yit.c("RequestJsonParser", "getRequestHeader requestJson is empty");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("request_header")) {
                yit.c("RequestJsonParser", "getRequestHeader not has request_header");
                return null;
            }
            return jSONObject.getJSONObject("request_header");
        } catch (JSONException unused) {
            yit.b("RequestJsonParser", "getRequestHeader JSONException");
            return null;
        }
    }

    private static JSONObject d(String str) {
        if (TextUtils.isEmpty(str)) {
            yit.c("RequestJsonParser", "getRequestBody requestJson is empty");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("request_body")) {
                yit.c("RequestJsonParser", "getRequestBody not has request_body");
                return null;
            }
            return jSONObject.getJSONObject("request_body");
        } catch (JSONException unused) {
            yit.b("RequestJsonParser", "getRequestBody JSONException");
            return null;
        }
    }
}
