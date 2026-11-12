package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.secure.android.common.anonymization.Anonymizer;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.utils.HwLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public abstract class p3 {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strMaskCommonString = str.indexOf("@") > 0 ? Anonymizer.maskCommonString(str, str.indexOf("@") + 1, 1) : Anonymizer.maskCommonString(str, 0, str.length());
        return TextUtils.isEmpty(strMaskCommonString) ? strMaskCommonString : strMaskCommonString.replaceAll("\\*+", "*");
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strMaskCommonString = Anonymizer.maskCommonString(str, 0, str.length());
        return TextUtils.isEmpty(strMaskCommonString) ? strMaskCommonString : strMaskCommonString.replaceAll("\\*+", "*");
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? str : Anonymizer.maskCommonString(str, 5, 5);
    }

    public static String a(String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length == 0) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2)) {
                    a(jSONObject, str2.split("\\."));
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            HwLog.e("PrivacyUtils", "anonymizeJsonFields JSONException: " + HwLog.printException((Exception) e));
            return "";
        }
    }

    public static void a(JSONObject jSONObject, String[] strArr) {
        if (jSONObject == null || strArr == null || strArr.length == 0) {
            return;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            try {
                String str = strArr[i];
                if (!jSONObject.has(str)) {
                    return;
                }
                jSONObject = jSONObject.getJSONObject(str);
            } catch (JSONException e) {
                HwLog.e("PrivacyUtils", "anonymizeField JSONException: " + HwLog.printException((Exception) e));
                return;
            }
        }
        String str2 = strArr[strArr.length - 1];
        String strOptString = jSONObject.optString(str2);
        if (!jSONObject.has(str2) || TextUtils.isEmpty(strOptString)) {
            return;
        }
        jSONObject.put(str2, "*" + SafeString.substring(strOptString, strOptString.length() > 5 ? strOptString.length() - 5 : strOptString.length()));
    }
}
