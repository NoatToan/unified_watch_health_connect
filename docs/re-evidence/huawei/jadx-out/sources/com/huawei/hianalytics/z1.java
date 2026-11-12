package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.transport.TransportHandlerFactory;
import com.huawei.hianalytics.core.transport.net.Response;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.secure.android.common.util.SafeBase64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z1 {
    public static boolean a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                HiLog.i("RUtils", "url is null");
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JsbMapKeyNames.H5_USER_ID, "");
            jSONObject.put("userAttribute", new JSONObject());
            Response responseExecute = TransportHandlerFactory.create(str, null, jSONObject.toString().getBytes(StandardCharsets.UTF_8), 1).execute();
            if (responseExecute.getHttpCode() != 200) {
                return false;
            }
            return b(responseExecute.getContent());
        } catch (Throwable th) {
            HiLog.i("RUtils", "requestConfig fail: " + th.getMessage());
            return false;
        }
    }

    public static boolean b(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("result");
            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("featureConfigValues")) != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 != null && TextUtils.equals(jSONObjectOptJSONObject2.optString("paramKey"), "common_cfg")) {
                        String strOptString = jSONObjectOptJSONObject2.optString("paramValue");
                        if (TextUtils.isEmpty(strOptString)) {
                            break;
                        }
                        c2.a("global_v2", "DcCfg", strOptString);
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static ArrayList a(List list) {
        String strA;
        String string = "";
        if (list != null && !list.isEmpty()) {
            try {
                strA = j1.a().k;
                if (TextUtils.isEmpty(strA)) {
                    if (!j2.f11561b.a()) {
                        HiLog.i("RUtils", "user lock");
                    } else {
                        strA = c2.a("global_v2", "lastMetricMepUrl");
                        if (TextUtils.isEmpty(strA)) {
                            String strA2 = u.a(EnvUtils.getAppContext());
                            if (!TextUtils.isEmpty(strA2)) {
                                strA = w.a(strA2);
                                c2.a("global_v2", "lastMetricMepUrl", strA);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
                strA = "";
            }
            if (TextUtils.isEmpty(strA)) {
                return new ArrayList();
            }
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject((String) it.next()));
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("Music", jSONArray);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("flowId", "");
                jSONObject2.put("bId", "");
                jSONObject2.put("uuId", UUID.randomUUID().toString());
                jSONObject2.put("dataFormat", "1");
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(jSONObject);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("scenarioId", "music101");
                jSONObject3.put("content", jSONArray2);
                String string2 = new StringBuilder(SafeBase64.encodeToString(jSONObject3.toString().getBytes(StandardCharsets.UTF_8), 0)).reverse().toString();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("data", string2);
                jSONObject4.put("version", "1.0");
                jSONObject4.put("meta", jSONObject2);
                string = jSONObject4.toString();
            } catch (JSONException e) {
                HiLog.e("RUtils", "JsonException" + e.getMessage());
            }
            Charset charset = StandardCharsets.UTF_8;
            Response responseExecute = TransportHandlerFactory.create(strA + "/tag/v1/service", null, string.getBytes(charset), 1).execute();
            ArrayList arrayList = new ArrayList();
            if (responseExecute.getHttpCode() != 200) {
                r1.b(0, "0");
            } else {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(responseExecute.getContent()).optJSONObject("result");
                    if (jSONObjectOptJSONObject == null) {
                        r1.b(0, "1");
                    } else {
                        int iOptInt = jSONObjectOptJSONObject.optInt("code", -1);
                        if (iOptInt != 0) {
                            HiLog.i("RUtils", "request failed");
                            r1.b(iOptInt, "2");
                        } else {
                            String strOptString = jSONObjectOptJSONObject.optString("content");
                            if (TextUtils.isEmpty(strOptString)) {
                                r1.b(0, "3");
                            } else {
                                JSONArray jSONArrayOptJSONArray = new JSONArray(new String(SafeBase64.decode(new StringBuilder(strOptString).reverse().toString(), 0), charset)).optJSONObject(0).optJSONArray("Music");
                                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                        arrayList.add(a(jSONArrayOptJSONArray.getJSONObject(i)));
                                    }
                                }
                            }
                        }
                    }
                } catch (JSONException unused2) {
                    HiLog.w("RUtils", "HR JsonException");
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static String a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("item_id", jSONObject.optString("item_id", ""));
        jSONObject2.put("content_code", jSONObject.optString("content_code", ""));
        jSONObject2.put("metric_tag", new JSONObject(jSONObject.optString("tag_info", "")).optString(RemoteMessageConst.Notification.TAG, ""));
        return jSONObject2.toString();
    }
}
