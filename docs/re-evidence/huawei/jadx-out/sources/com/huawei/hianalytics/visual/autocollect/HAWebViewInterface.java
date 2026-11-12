package com.huawei.hianalytics.visual.autocollect;

import android.net.NetworkInfo;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.f1;
import com.huawei.hianalytics.visual.i1;
import com.huawei.hianalytics.visual.m0;
import com.huawei.hianalytics.visual.w;
import com.huawei.hianalytics.visual.y0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class HAWebViewInterface {
    private static final String NETWORK = "network";
    private static final String SESSION_ID = "sessionId";
    private static final String TAG = "HAWebViewInterface";

    @JavascriptInterface
    public boolean enableH5Collection() {
        return w.a().b();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @JavascriptInterface
    public String haGetDeviceInfo(String str) {
        byte b2;
        JSONObject jSONObject = new JSONObject();
        try {
            HiLog.d(TAG, "haGetDeviceInfo");
            if (str == null) {
                return "";
            }
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit.length == 0) {
                return "";
            }
            for (String str2 : strArrSplit) {
                int iHashCode = str2.hashCode();
                boolean z = true;
                if (iHashCode != 607796817) {
                    if (iHashCode == 1843485230 && str2.equals(NETWORK)) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("sessionId")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    jSONObject.put("sessionId", f1.f11642b.f11643a.f11635a);
                } else if (b2 != 1) {
                    HiLog.d(TAG, "haGetDeviceInfo unknown type:" + str2);
                } else {
                    try {
                        NetworkInfo networkInfoA = m0.a(w.a().h());
                        if (networkInfoA == null || !networkInfoA.isConnected()) {
                            z = false;
                        }
                    } catch (Throwable unused) {
                    }
                    jSONObject.put(NETWORK, z);
                }
            }
        } catch (Exception unused2) {
            HiLog.w(TAG, "haGetDeviceInfo Exception");
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String haGetVisualizedConfig() {
        try {
            HiLog.d(TAG, "haGetVisualizedConfig");
            if (!w.a().f() && w.a().b()) {
                return y0.f11716a.d;
            }
            return null;
        } catch (Exception unused) {
            HiLog.w(TAG, "haGetVisualizedConfig Exception");
            return null;
        }
    }

    @JavascriptInterface
    public void reportJsEvent(String str) {
        if (w.a().f() || !w.a().b() || str == null || str.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("data")).getJSONObject("data");
            JSONObject jSONObject2 = jSONObject.getJSONObject("preset_properties");
            if (jSONObject2.has("$net_type")) {
                jSONObject2.remove("$net_type");
            }
            String string = jSONObject.getString("event");
            if (jSONObject.has("v_event") && !TextUtils.isEmpty(jSONObject.getString("v_event"))) {
                jSONObject.put("event", jSONObject.getString("v_event"));
                jSONObject.remove("v_event");
            }
            w.a().a(string, jSONObject);
        } catch (JSONException unused) {
            HiLog.w(TAG, "the jsEvent is not a json, please check");
        }
    }

    @JavascriptInterface
    public String setIdsite() {
        return i1.a(w.a().h());
    }
}
