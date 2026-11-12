package eo2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import d53.u;
import d53.w;
import ds.e0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import wr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leo2/d;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f64794a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f64795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<Boolean> f64796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static AtomicReference<Boolean> f64797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AtomicReference<String> f64798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static AtomicReference<String> f64799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static AtomicReference<Boolean> f64800g;

    static {
        int i14 = gt2.c.f79010a;
        f64795b = gt2.b.f79005a.h("PAY#EcomUtil");
        f64796c = new AtomicReference<>();
        f64797d = new AtomicReference<>();
        f64798e = new AtomicReference<>();
        f64799f = new AtomicReference<>();
        f64800g = new AtomicReference<>(Boolean.FALSE);
    }

    private d() {
    }

    public static void a() {
        f64797d = new AtomicReference<>();
        f64798e = new AtomicReference<>();
        f64799f = new AtomicReference<>();
        f64800g = new AtomicReference<>(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ep2.b b(String str, List list) {
        String strSubstring;
        str.getClass();
        Logger logger = f64795b;
        logger.debug("getCardType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ep2.b bVar = (ep2.b) it.next();
                Iterator<T> it3 = bVar.b().iterator();
                while (it3.hasNext()) {
                    p pVar = (p) it3.next();
                    String str2 = (String) pVar.f128595b;
                    linkedHashMap.put(new p(Long.valueOf(Long.parseLong((String) pVar.f128594a)), Long.valueOf(str2 != null ? Long.parseLong(str2) : -1L)), bVar);
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            p pVar2 = (p) entry.getKey();
            ep2.b bVar2 = (ep2.b) entry.getValue();
            try {
                B b14 = pVar2.f128595b;
                A a14 = pVar2.f128594a;
                int length = String.valueOf(((Number) b14).longValue()).length();
                if (((Number) b14).longValue() == -1) {
                    strSubstring = "-1";
                } else if (str.length() >= length) {
                    strSubstring = str.substring(0, length);
                } else {
                    continue;
                }
                if (((Number) b14).longValue() != -1 || !u.y(str, String.valueOf(((Number) a14).longValue()), false)) {
                    long jLongValue = ((Number) a14).longValue();
                    long jLongValue2 = ((Number) b14).longValue();
                    long j8 = Long.parseLong(strSubstring);
                    if (jLongValue > j8 || j8 > jLongValue2) {
                        logger.debug("getCardType: No card type found");
                    }
                }
                if (bVar2.getMaxLength() != null) {
                    return bVar2;
                }
                logger.error("getCardType: Unable to set length for " + bVar2.getCardType() + " because maxLength is null");
                return null;
            } catch (Exception e4) {
                e0.v("getCardType: Exception ", e4.getLocalizedMessage(), logger);
            }
        }
        return null;
    }

    public static void c(Activity activity) {
        Intent launchIntentForPackage;
        activity.getClass();
        String str = f64799f.get();
        Logger logger = f64795b;
        logger.debug("returnToCallingApp: " + str);
        a();
        try {
            if (str != null) {
                if (activity.getPackageManager().getLaunchIntentForPackage(str) != null) {
                    logger.debug("returnToCallingApp: For package ids");
                    launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(str);
                } else {
                    logger.debug("returnToCallingApp: For myapp://action formats");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    launchIntentForPackage = intent;
                }
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268435456);
                }
                if ((launchIntentForPackage != null ? launchIntentForPackage.resolveActivity(activity.getPackageManager()) : null) != null) {
                    j.f186862a.getClass();
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "GarminPayDeeplinkFinish");
                    activity.startActivity(launchIntentForPackage);
                } else {
                    j.f186862a.getClass();
                    j.a("EcomUtil.returnToCallingApp()", "cannot open app with current intent: " + launchIntentForPackage);
                    logger.error("returnToCallingApp: cannot open app with current intent: " + launchIntentForPackage);
                }
            } else {
                j.f186862a.getClass();
                j.a("EcomUtil.returnToCallingApp()", "callbackUrl is null");
                logger.error("returnToCallingApp: callbackUrl is null");
            }
            activity.finish();
        } catch (Exception e4) {
            j jVar = j.f186862a;
            String str2 = "exception: (" + e4 + ", " + e4.getMessage() + ")";
            jVar.getClass();
            j.a("EcomUtil.returnToCallingApp()", str2);
            logger.error("returnToCallingApp: exception: (" + e4 + ", " + e4.getMessage() + ")");
            activity.finish();
        }
    }

    public static void d(String str, String str2) {
        try {
            String str3 = (String) w.W(str, new String[]{"callbackURL="}).get(1);
            j.f186862a.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("EcomFlowSource", str2);
            ht.a.f85464a.getClass();
            ht.a.a(bundle, "GarminPayDeeplinkBegin");
            f64799f.set(str3);
        } catch (Exception e4) {
            e0.v("saveCallbackUrlFromEcomDeepLink - e", e4.getLocalizedMessage(), f64795b);
        }
    }
}
