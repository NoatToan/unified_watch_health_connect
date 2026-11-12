package com.huawei.hms.network.embedded;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.inner.DomainManager;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14541a = "CacheManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14543c = 300000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0<m0> f14542b = new d0<>();
    public static long d = 0;

    public static void e() {
        Map<String, m0> mapC = c();
        if (mapC == null || mapC.isEmpty()) {
            return;
        }
        Logger.v(f14541a, "Totol Cache Num: %s", Integer.valueOf(mapC.size()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - d < 300000 || !NetworkUtil.isForeground()) {
            return;
        }
        Logger.v(f14541a, "updateAllCache updateAll all");
        d = jCurrentTimeMillis;
        ListIterator listIterator = new ArrayList(mapC.entrySet()).listIterator(mapC.size());
        int i = 0;
        while (listIterator.hasPrevious()) {
            String str = (String) ((Map.Entry) listIterator.previous()).getKey();
            if (i >= 5) {
                c(str);
            } else if (t.m().f(str) != 1) {
                g0.a(str, "dns_network_change", 2);
                i++;
            }
        }
    }

    public static void d() {
        Logger.v(f14541a, "enter loadFileCacheToMemeory");
        try {
            for (Map.Entry<String, m0> entry : c0.b().entrySet()) {
                Logger.v(f14541a, "Load a record from File, host:%s, value:%s", entry.getKey(), entry.getValue());
                f14542b.a(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            Logger.w(f14541a, "loadFileCacheToMemeory error:" + e.getMessage());
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str) && f14542b.a(str)) {
            c0.b(str);
        }
    }

    public static Map<String, m0> c() {
        return f14542b.b();
    }

    public static void b() {
        f14542b.a();
        c0.e();
    }

    public static m0 b(String str) {
        return c0.a(str);
    }

    public static void a(String str, m0 m0Var) {
        if (TextUtils.isEmpty(str) || y.b(m0Var)) {
            Logger.w(f14541a, "saveValidIP: host or dnsResult is null");
            return;
        }
        if (DomainManager.getInstance().isExcludePrefetch(str)) {
            Logger.v(f14541a, "exclude save db");
            return;
        }
        d0<m0> d0Var = f14542b;
        m0 m0VarB = d0Var.b(str);
        if (m0Var.a(m0VarB) || m0VarB.g() != 0) {
            Logger.v(f14541a, "saveValidIP，host: %s, value: %s", str, m0Var);
            d0Var.a(str, m0Var);
            c0.b(str, m0Var);
        }
    }

    public static void a(NetworkInfo networkInfo) {
        int iC = w.c();
        if (iC == 0) {
            a();
            return;
        }
        if (iC != 1) {
            if (iC != 2) {
                Logger.w(f14541a, "Unkown netowrk change strategy, used to update all cache, strategy:" + w.c());
                e();
                return;
            }
        } else if (networkInfo == null || NetworkUtil.getNetworkType(networkInfo) != 1) {
            return;
        }
        e();
    }

    public static void a() {
        f14542b.a();
    }

    public static m0 a(String str) {
        m0 m0VarB = f14542b.b(str);
        if (m0VarB == null) {
            return null;
        }
        Logger.v(f14541a, "Memory Cache host:" + str);
        m0VarB.a(1);
        int iG = m0VarB.g();
        if (iG != 0) {
            if (iG != 1) {
                c(str);
                return null;
            }
            g0.a(str, "dns_lazy_update", t.m().k() ? 3 : 2);
        }
        return m0VarB;
    }
}
