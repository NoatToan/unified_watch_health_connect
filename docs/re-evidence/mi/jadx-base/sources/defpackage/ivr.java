package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ivr {
    public static void a(String str, String str2, Map<String, Object> map) {
        lwr.b().sendJSEvent(str, str2, map);
    }

    public static void b(Context context, String str, Configuration configuration, Configuration configuration2, String str2) {
        if (configuration == null || configuration2 == null) {
            return;
        }
        int iUpdateFrom = configuration.updateFrom(configuration2);
        boolean z = (iUpdateFrom & 1024) != 0;
        boolean z2 = (iUpdateFrom & 2048) != 0;
        if (z2) {
            HashMap map = new HashMap();
            if (context != null) {
                map.put("inMultiScreenDevice", Boolean.valueOf(hvr.k(context)));
            }
            map.put("deviceModel", hvr.d());
            map.put("isLargeScreen", Boolean.valueOf(hvr.j(context)));
            map.put("screenLayoutChanged", Boolean.valueOf(z));
            map.put("displaySizeChange", Boolean.valueOf(z2));
            map.put("ratio", Float.valueOf(hvr.f(context, str2)));
            map.put("url", str2);
            a(str, "on_configuration_info_changed", map);
        }
    }

    public static void c(Context context, String str, int i, int i2, String str2, int i3) {
        if (i == 0 || i2 == 0) {
            return;
        }
        float fC = hvr.c(context);
        HashMap map = new HashMap();
        map.put("width", Integer.valueOf(i));
        map.put("height", Integer.valueOf(i2));
        map.put("widthDp", Integer.valueOf((int) ((i / fC) + 0.5f)));
        map.put("heightDp", Integer.valueOf((int) ((i2 / fC) + 0.5f)));
        float f = hvr.f(context, str2);
        if (context != null) {
            map.put("inMultiScreenDevice", Boolean.valueOf(hvr.k(context)));
            map.put("ratio", Float.valueOf(f));
        }
        map.put("deviceModel", hvr.d());
        map.put("isLargeScreen", Boolean.valueOf(hvr.j(context)));
        map.put("instance", String.valueOf(i3));
        map.put("url", str2);
        a(str, "viewSizeChanged", map);
    }

    public static void d(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2)) {
            zxr.b("YRNCEventHelper", "sendWillAppearEvent url is Empty!");
            return;
        }
        HashMap map = new HashMap();
        map.put("instance", String.valueOf(i));
        map.put("url", str2);
        a(str, "willAppear", map);
    }

    public static void e(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2)) {
            zxr.b("YRNCEventHelper", "sendWillDisappearEvent url is Empty!");
            return;
        }
        HashMap map = new HashMap();
        map.put("instance", String.valueOf(i));
        map.put("url", str2);
        a(str, "willDisappear", map);
    }

    public static void f(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2)) {
            zxr.b("YRNCEventHelper", "sendWillFullAppearEvent url is Empty!");
            return;
        }
        HashMap map = new HashMap();
        map.put("instance", String.valueOf(i));
        map.put("url", str2);
        a(str, "willFullAppear", map);
    }

    public static void g(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2)) {
            zxr.b("YRNCEventHelper", "sendWillFullDisappearEvent url is Empty!");
            return;
        }
        HashMap map = new HashMap();
        map.put("instance", String.valueOf(i));
        map.put("url", str2);
        a(str, "willFullDisappear", map);
    }
}
