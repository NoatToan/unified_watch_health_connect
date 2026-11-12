package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;

/* JADX INFO: loaded from: classes22.dex */
public class WebBrowserUtils {
    public static final String URL_JS_SDK_DEMO = "https://fe-testing-cdn.huami.com/jsbridge-sdk/0.1.10/index.html";
    private static final String a = "com.huami.web.container.WebActivity";
    private static final String b = "com.xiaomi.hm.health.action.WEB_URL";
    private static final String c = "Title";
    public static final String URL_NOTIFICATION_FAQ = HMServerDef.getHost() + "t/posts/watch?meta_key=tag&category=102&meta_value=faq";
    public static final String URL_CALL_FAQ = HMServerDef.getHost() + "t/posts/watch?meta_key=tag&category=103&meta_value=faq";
    private static String d = HMServerDef.getHost() + "/t/posts/mifit?meta_key=device&category=102&meta_value=";
    private static String e = HMServerDef.getHost() + "/t/posts/mifit?meta_key=device&category=103&meta_value=";

    public static String getZeppLifeFaqUrl(Boolean bool, HMDeviceSource hMDeviceSource) {
        HMDeviceType type;
        if (hMDeviceSource == null || (type = hMDeviceSource.getType()) == null) {
            return "";
        }
        int value = type.getValue();
        int value2 = hMDeviceSource.getValue();
        int[] pnp = hMDeviceSource.getPnp();
        if (pnp != null && pnp.length == 2) {
            if (bool.booleanValue()) {
                return d + pnp[0] + "." + pnp[1] + "." + value + "." + value2;
            }
            return e + pnp[0] + "." + pnp[1] + "." + value + "." + value2;
        }
        return "";
    }

    public static void jump2WebBrowser(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        ComponentName componentName = new ComponentName(context.getPackageName(), a);
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra(b, str);
        intent.putExtra(c, str2);
        context.startActivity(intent);
    }
}
