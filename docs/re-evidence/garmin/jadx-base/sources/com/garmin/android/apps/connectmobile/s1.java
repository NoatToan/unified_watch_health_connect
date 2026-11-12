package com.garmin.android.apps.connectmobile;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class s1 {
    public static JSONObject A(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str) || !jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public static void i(JSONObject jSONObject, String str, double d14) throws JSONException {
        if (Double.isNaN(d14)) {
            return;
        }
        jSONObject.put(str, d14);
    }

    public static void j(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (str2 != null) {
            jSONObject.put(str, str2);
        }
    }

    public static Boolean o(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return Boolean.valueOf(jSONObject.optBoolean(str));
    }

    public static Double q(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return Double.valueOf(jSONObject.optDouble(str));
    }

    public static Integer r(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return Integer.valueOf(jSONObject.optInt(str));
    }

    public static ArrayList s(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        int length = jSONArrayOptJSONArray.length();
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < length; i14++) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i14)));
        }
        return arrayList;
    }

    public static Long t(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return Long.valueOf(jSONObject.optLong(str));
    }

    public static String u(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public static List<String> y(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        String[] strArr = new String[jSONArray.length()];
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            strArr[i14] = (String) jSONArray.get(i14);
        }
        return Arrays.asList(strArr);
    }

    public static JSONArray z(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str) || !jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONArray(str);
    }

    public abstract void k(JSONObject jSONObject);

    public void m(String str) {
        if (str != null) {
            k(new JSONObject(str));
        }
    }
}
