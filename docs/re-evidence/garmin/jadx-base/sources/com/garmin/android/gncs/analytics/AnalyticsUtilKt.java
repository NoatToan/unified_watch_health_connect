package com.garmin.android.gncs.analytics;

import android.os.Build;
import com.garmin.android.gncs.BuildConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p13.u0;
import p13.w;
import zk.a;
import zk.b;
import zk.c;
import zk.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0001¨\u0006\b"}, d2 = {"logEvent", "", "eventType", "Lcom/garmin/android/gncs/analytics/AnalyticEventType;", "attributes", "", "", "", "gncs-all-modules_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnalyticsUtilKt {
    public static final void logEvent(AnalyticEventType analyticEventType, Map<String, ? extends Object> map) {
        Map map2;
        analyticEventType.getClass();
        Map mapE = u0.e(new p("android_model", Build.MODEL), new p("android_mfg", Build.MANUFACTURER), new p("os_ver", Integer.valueOf(Build.VERSION.SDK_INT)), new p("lib", BuildConfig.ARTIFACT_ID), new p("lib_ver", BuildConfig.MAVEN_VERSION));
        if (map == null || map.isEmpty()) {
            map2 = mapE;
        } else {
            HashMap map3 = new HashMap();
            map3.putAll(mapE);
            map3.putAll(map);
            map2 = map3;
        }
        c cVar = c.f205034a;
        List listC = w.c("FIREBASE");
        cVar.getClass();
        b bVar = new b("FIREBASE", new d(cVar, null, listC));
        a aVar = new a(analyticEventType.getEventName(), map2, 0L, 4, null);
        aVar.f205031c = aVar.f205031c;
        bVar.f205033a.a(aVar);
    }

    public static /* synthetic */ void logEvent$default(AnalyticEventType analyticEventType, Map map, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            map = null;
        }
        logEvent(analyticEventType, map);
    }

    public static final void logEvent(AnalyticEventType analyticEventType) {
        analyticEventType.getClass();
        logEvent$default(analyticEventType, null, 2, null);
    }
}
