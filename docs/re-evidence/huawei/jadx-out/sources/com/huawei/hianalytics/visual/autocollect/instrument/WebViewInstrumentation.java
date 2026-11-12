package com.huawei.hianalytics.visual.autocollect.instrument;

import android.text.TextUtils;
import android.view.View;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.R;
import com.huawei.hianalytics.visual.autocollect.HAWebViewInterface;
import com.huawei.hianalytics.visual.b0;
import com.huawei.hianalytics.visual.d0;
import com.huawei.hianalytics.visual.i1;
import com.huawei.hianalytics.visual.o0;
import com.huawei.hianalytics.visual.w;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class WebViewInstrumentation {
    public static void loadUrl(View view, String str) {
        String strSubstring;
        Method method;
        Method method2;
        if (view == null) {
            HiLog.w("HAWI", "fail to init webView");
            return;
        }
        if (!w.a().f() && w.a().b() && view.getTag(R.id.hianalytics_web_view_visaul_bridge_tag) == null) {
            HiLog.d("VisualUtils", "buildH5VisualBridgeFromAndroid");
            view.setTag(R.id.hianalytics_web_view_visaul_bridge_tag, new Object());
            b0 b0Var = new b0();
            try {
                Class<?> cls = view.getClass();
                try {
                    Object objInvoke = cls.getMethod("getSettings", new Class[0]).invoke(view, new Object[0]);
                    if (objInvoke != null && (method2 = objInvoke.getClass().getMethod("setJavaScriptEnabled", Boolean.TYPE)) != null) {
                        method2.invoke(objInvoke, Boolean.TRUE);
                    }
                } catch (Exception e) {
                    HiLog.w("VisualUtils", "fail to find getSettings or setJavaScriptEnabled class Exception:" + e.getMessage());
                }
                cls.getMethod("addJavascriptInterface", Object.class, String.class).invoke(view, b0Var, "haVisualJsBridge");
            } catch (Exception e2) {
                d0.a(e2, new StringBuilder("fail to find addJavascriptInterface class Exception:"), "VisualUtils");
            }
        }
        if (!w.a().f() && w.a().b() && view.getTag(R.id.hianalytics_web_view_bridge_tag) == null) {
            view.setTag(R.id.hianalytics_web_view_bridge_tag, new Object());
            HAWebViewInterface hAWebViewInterface = new HAWebViewInterface();
            try {
                Class<?> cls2 = view.getClass();
                try {
                    Object objInvoke2 = cls2.getMethod("getSettings", new Class[0]).invoke(view, new Object[0]);
                    if (objInvoke2 != null && (method = objInvoke2.getClass().getMethod("setJavaScriptEnabled", Boolean.TYPE)) != null) {
                        method.invoke(objInvoke2, Boolean.TRUE);
                    }
                } catch (Exception unused) {
                    HiLog.w("HAWI", "fail to find getSettings or setJavaScriptEnabled class");
                }
                cls2.getMethod("addJavascriptInterface", Object.class, String.class).invoke(view, hAWebViewInterface, "haJsBridge");
            } catch (Exception unused2) {
                HiLog.w("HAWI", "fail to find addJavascriptInterface class");
            }
        }
        if (!TextUtils.isEmpty(str) && str.contains("target_resource_scope")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("$url", str);
                if (TextUtils.isEmpty(str)) {
                    strSubstring = "";
                } else {
                    String strSubstring2 = str.substring(str.indexOf("target_resource_scope"));
                    int iIndexOf = strSubstring2.indexOf("&");
                    strSubstring = iIndexOf == -1 ? strSubstring2.substring(22) : strSubstring2.substring(22, iIndexOf);
                }
                jSONObject.put("$scope", strSubstring);
                i1.a(o0.b(o0.a(view.getContext(), view)), jSONObject);
                JSONObject jSONObject2 = (JSONObject) view.getTag(R.id.hianalytics_view_custom_property_tag);
                if (jSONObject2 != null) {
                    i1.a(jSONObject2, jSONObject);
                }
                w.a().a("$ResourceClick", jSONObject);
            } catch (Exception unused3) {
                HiLog.w("HAWI", "fail to report resource click event");
            }
        }
    }
}
