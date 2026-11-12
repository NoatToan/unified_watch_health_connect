package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    public static String a(String str) {
        JSONArray jSONArrayOptJSONArray;
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONArray jSONArrayOptJSONArray2 = new JSONObject(str).optJSONArray("services");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("name", "");
                        if (!TextUtils.isEmpty(strOptString2) && "com.huawei.hianalytics.sdk".equals(strOptString2) && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("servings")) != null && jSONArrayOptJSONArray.length() != 0) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= jSONArrayOptJSONArray.length()) {
                                    strOptString = "";
                                    break;
                                }
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                                if (jSONObjectOptJSONObject3 != null) {
                                    String strOptString3 = jSONObjectOptJSONObject3.optString("countryOrAreaGroup");
                                    if (!TextUtils.isEmpty(strOptString3) && "DR1".equals(strOptString3) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("addresses")) != null) {
                                        strOptString = jSONObjectOptJSONObject.optString("MEPREQUESTURL", "");
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (!TextUtils.isEmpty(strOptString)) {
                                return strOptString;
                            }
                        }
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            HiLog.w("GrsUtils", "get GRS value failed");
        }
    }
}
