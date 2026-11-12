package defpackage;

import android.content.Context;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lei {
    private static Map<String, String> e = Collections.synchronizedMap(new HashMap(4));

    /* JADX WARN: Code duplicated, block: B:57:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String c(Context context, String str) {
        if (context != null && str != null && !"".equals(str)) {
            if (e.containsKey(str)) {
                return e.get(str);
            }
            StringBuffer stringBuffer = new StringBuffer();
            try {
                InputStream inputStreamOpen = context.getAssets().open("grs_app_global_route_config.json");
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            stringBuffer.append(line);
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th;
                    }
                    bufferedReader.close();
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    try {
                        JSONArray jSONArray = new JSONObject(stringBuffer.toString()).getJSONArray("services");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if ("com.huawei.health".equals(jSONObject.getString("name"))) {
                                String strC = c(jSONObject.getJSONArray("servings"), c(GRSManager.c(context).getCountryCode(), jSONObject.getJSONArray("countryGroups")), str);
                                e.put(str, strC);
                                return strC;
                            }
                        }
                    } catch (JSONException e2) {
                        ReleaseLogUtil.e("HiH_GrsJsonUtil", "json exception", LogAnonymous.b(e2));
                    }
                    return "";
                } catch (Throwable th4) {
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    throw th4;
                }
            } catch (IOException e3) {
                ReleaseLogUtil.e("HiH_GrsJsonUtil", "io Exception", LogAnonymous.b(e3));
            }
        }
        return "";
    }

    private static String c(String str, JSONArray jSONArray) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.getJSONObject(i).getString("countries").contains(str)) {
                return jSONArray.getJSONObject(i).getString("id");
            }
        }
        return "";
    }

    private static String c(JSONArray jSONArray, String str, String str2) throws JSONException {
        if (jSONArray.length() != 0 && !"".equals(str)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (str.equals(jSONObject.getString("countryGroup"))) {
                    return jSONObject.getJSONObject("addresses").getString(str2);
                }
            }
        }
        return "";
    }
}
