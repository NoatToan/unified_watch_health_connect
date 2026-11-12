package com.tencent.connect.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.i;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Class<?> f30841a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class<?> f30842b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f30843c = null;
    private static Method d = null;
    private static Method e = null;
    private static Method f = null;
    private static boolean g = false;

    public static boolean a(Context context, QQToken qQToken) {
        return i.a(context, qQToken.getAppId()).b("Common_ta_enable");
    }

    public static void b(Context context, QQToken qQToken) {
        try {
            if (a(context, qQToken)) {
                f.invoke(f30841a, true);
            } else {
                f.invoke(f30841a, false);
            }
        } catch (Exception e2) {
            SLog.e("OpenConfig", "checkStatStatus exception: " + e2.toString());
        }
    }

    public static void c(Context context, QQToken qQToken) {
        String str = "Aqc" + qQToken.getAppId();
        try {
            f30841a = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f30842b = cls;
            f30843c = cls.getMethod("reportQQ", Context.class, String.class);
            d = f30842b.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            e = f30842b.getMethod("commitEvents", Context.class, Integer.TYPE);
            f = f30841a.getMethod("setEnableStatService", Boolean.TYPE);
            b(context, qQToken);
            f30841a.getMethod("setAutoExceptionCaught", Boolean.TYPE).invoke(f30841a, false);
            f30841a.getMethod("setEnableSmartReporting", Boolean.TYPE).invoke(f30841a, true);
            f30841a.getMethod("setSendPeriodMinutes", Integer.TYPE).invoke(f30841a, Integer.valueOf(ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL));
            Class<?> cls2 = Class.forName("com.tencent.stat.StatReportStrategy");
            f30841a.getMethod("setStatSendStrategy", cls2).invoke(f30841a, cls2.getField("PERIOD").get(null));
            f30842b.getMethod("startStatService", Context.class, String.class, String.class).invoke(f30842b, context, str, Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            g = true;
        } catch (Exception e2) {
            SLog.e("OpenConfig", "start4QQConnect exception: " + e2.toString());
        }
    }

    public static void d(Context context, QQToken qQToken) {
        if (!TextUtils.isEmpty(qQToken.getOpenId())) {
            e.a().a(qQToken.getOpenId(), qQToken.getAppId(), "2", "1", "11", "0", "0", "0");
        }
        if (g) {
            b(context, qQToken);
            if (qQToken.getOpenId() != null) {
                try {
                    f30843c.invoke(f30842b, context, qQToken.getOpenId());
                } catch (Exception e2) {
                    SLog.e("OpenConfig", "reportQQ exception: " + e2.toString());
                }
            }
        }
    }

    public static void a(Context context, QQToken qQToken, String str, String... strArr) {
        if (g) {
            b(context, qQToken);
            try {
                d.invoke(f30842b, context, str, strArr);
            } catch (Exception e2) {
                SLog.e("OpenConfig", "trackCustomEvent exception: " + e2.toString());
            }
        }
    }
}
