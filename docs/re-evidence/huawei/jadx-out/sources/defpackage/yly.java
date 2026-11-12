package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class yly {
    public static boolean e(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null) {
            yis.d("JsonUtil", "getBoolean jsonObject is null");
            return z;
        }
        if (TextUtils.isEmpty(str)) {
            yis.d("JsonUtil", "getBoolean name is empty");
            return z;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            yis.d("JsonUtil", "getBoolean catch JSONException");
            return z;
        }
    }

    public static int d(JSONObject jSONObject, String str, int i) {
        if (jSONObject == null) {
            yis.d("JsonUtil", "getInt jsonObject is null");
            return i;
        }
        if (TextUtils.isEmpty(str)) {
            yis.d("JsonUtil", "getInt name is empty");
            return i;
        }
        try {
            return jSONObject.getInt(str);
        } catch (JSONException unused) {
            yis.d("JsonUtil", "getInt catch JSONException");
            return i;
        }
    }

    public static String b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            yis.d("JsonUtil", "getString jsonObject is null");
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            yis.d("JsonUtil", "getString name is empty");
            return "";
        }
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            yis.d("JsonUtil", "getString input json not has name");
            return "";
        } catch (JSONException unused) {
            yis.d("JsonUtil", "getString catch JSONException");
            return "";
        }
    }

    public static JSONObject e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            yis.d("JsonUtil", "getJSONObject jsonString is null");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            yis.d("JsonUtil", "getJSONObject name is null");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(e(str));
            if (jSONObject.has(str2)) {
                return jSONObject.getJSONObject(str2);
            }
            yis.d("JsonUtil", "getString input json not has name");
            return null;
        } catch (JSONException unused) {
            yis.d("JsonUtil", "getString catch JSONException");
            return null;
        }
    }

    public static JSONObject c(JSONArray jSONArray, int i) {
        if (jSONArray == null) {
            yis.d("JsonUtil", "getJSONObject jsonArray is null");
            return null;
        }
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException unused) {
            yis.d("JsonUtil", "getJSONObject catch JSONException");
            return null;
        }
    }

    public static JSONArray d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            yis.d("JsonUtil", "getJSONArray jsonString is empty");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            yis.d("JsonUtil", "getJSONArray name is empty");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(e(str));
            if (jSONObject.has(str2)) {
                return jSONObject.getJSONArray(str2);
            }
            yis.d("JsonUtil", "getJSONArray input json not has name");
            return null;
        } catch (JSONException unused) {
            yis.d("JsonUtil", "getJSONArray catch JSONException");
            return null;
        }
    }

    public static <T> T c(String str, Class<T> cls) {
        T t = null;
        if (str == null) {
            yit.b("JsonUtil", "fromJson --> json is null");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Gson gson = new Gson();
            if (!b(str)) {
                return null;
            }
            t = (T) gson.fromJson(e(str), (Class) cls);
        } catch (JsonSyntaxException unused) {
            yit.b("JsonUtil", "fromJson --> JsonSyntaxException.");
        }
        yit.a("JsonUtil", "fromJson(String json, Class<T> classOfT), time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return t;
    }

    public static boolean b(String str) {
        try {
            try {
                new JSONObject(str);
                return true;
            } catch (JSONException unused) {
                new JSONArray(str);
                return true;
            }
        } catch (JSONException unused2) {
            return false;
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new StringBuffer(JsonSanitizer.sanitize(str)).toString();
    }
}
