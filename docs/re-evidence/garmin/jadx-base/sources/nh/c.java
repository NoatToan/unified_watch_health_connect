package nh;

import android.content.Context;
import android.net.NetworkInfo;
import android.util.Pair;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f126109a;

    public c(Context context) {
    }

    public static e a(Context context) {
        try {
            ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = oh.a.f132147a;
            Context applicationContext = context == null ? null : context.getApplicationContext();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            NetworkInfo networkInfo = (NetworkInfo) oh.a.b(2, 10L, timeUnit, new oh.c(), new oh.d(applicationContext), false, 10L, timeUnit, null, false);
            if (networkInfo == null || networkInfo.getType() != 0) {
                return (networkInfo == null || networkInfo.getType() != 1) ? e.NONE : e.WIFI;
            }
            int subtype = networkInfo.getSubtype();
            for (e eVar : e.values()) {
                if (eVar.f126113a == subtype) {
                    return eVar;
                }
            }
            return e.NONE;
        } catch (Exception unused) {
            return e.NONE;
        }
    }
}
