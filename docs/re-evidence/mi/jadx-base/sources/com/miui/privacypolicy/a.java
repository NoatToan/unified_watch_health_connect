package com.miui.privacypolicy;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.onetrack.OneTrack;
import defpackage.ghh;
import defpackage.mm9;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static int a(Context context, String str, String str2, String str3, String str4, String str5) throws Throwable {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str4)) {
            str4 = context.getPackageName();
        }
        map.put(OneTrack.Param.PKG, str4);
        map.put("policyName", str);
        map.put("idContent", str2);
        map.put("miuiVersion", NetUtils.f10320a);
        if (TextUtils.isEmpty(str5)) {
            str5 = ghh.a(context);
        }
        map.put("apkVersion", str5);
        String strE = mm9.e(context, "privacy_temp_update_version", str);
        if (TextUtils.isEmpty(strE)) {
            strE = "";
        }
        map.put("policyVersion", strE);
        map.put("language", Locale.getDefault().getLanguage());
        map.put("region", Locale.getDefault().getCountry());
        map.put("timestamp", str3);
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (Exception unused) {
        }
        String strH = NetUtils.h(map, "https://data.sec.miui.com/privacy/agree/v1", NetUtils.HttpMethod.POST, jSONObject);
        if (TextUtils.isEmpty(strH)) {
            mm9.g(jSONObject.toString(), context, "privacy_agree_error", str);
            return -2;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strH);
            int iOptInt = jSONObject2.optInt("code");
            String strOptString = jSONObject2.optString("message");
            if (iOptInt == 200 && "success".equals(strOptString)) {
                String strOptString2 = new JSONObject(jSONObject2.optString("data")).optString("latestPolicyVersion");
                if (!TextUtils.isEmpty(strOptString2)) {
                    mm9.g(strOptString2, context, "privacy_version", str);
                    mm9.d(context, "privacy_agree_error", str);
                    mm9.d(context, "privacy_temp_update_version", str);
                    mm9.d(context, "privacy_update", str);
                    return 1;
                }
            }
        } catch (Exception unused2) {
        }
        mm9.g(jSONObject.toString(), context, "privacy_agree_error", str);
        return -3;
    }
}
