package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.inner.DomainManager;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14785a = "DNResolverManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Set<String> f14786b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f14787c = r0.a();

    public static void a(String str, String str2, int i) {
        if (DomainManager.getInstance().isExcludePrefetch(str)) {
            Logger.v(f14785a, "exclude dnsLazyUpdate");
        } else {
            if (TextUtils.isEmpty(str) || f14786b.contains(str)) {
                return;
            }
            f14786b.add(str);
            Logger.i(f14785a, "enter Dns lazy update flow, domain: %s, trigger type: %s, source: %s", str, str2, t.m().a(i));
            f14787c.a(i == 3 ? new b(str, i, str2) : new k0(str, str2, new a()));
        }
    }

    public static class a implements f0.a {
        @Override // com.huawei.hms.network.embedded.f0.a
        public void a(String str, Throwable th) {
            Logger.v(g0.f14785a, "lazyUpdateCallback onFailure");
            g0.f14786b.remove(str);
        }

        @Override // com.huawei.hms.network.embedded.f0.a
        public void a(String str, m0 m0Var) {
            Logger.v(g0.f14785a, "lazyUpdateCallback onRespone : " + m0Var);
            a0.a(str, m0Var);
            g0.f14786b.remove(str);
        }
    }

    public static m0 a(String str, int i) throws UnknownHostException {
        m0 m0VarA = i != 1 ? f14787c.a(str) : h0.f14839c.lookup(str);
        Logger.i(f14785a, str + " from server result is: " + m0VarA);
        return m0VarA;
    }

    public static class b extends f0 {
        @Override // com.huawei.hms.network.embedded.f0
        public m0 c() {
            m0 m0VarB = g0.f14787c.b(this.f14743a);
            g0.f14786b.remove(this.f14743a);
            return m0VarB;
        }

        public b(String str, int i, String str2) {
            super(str, i, str2);
        }
    }

    public static m0 a(f0 f0Var) {
        f0Var.run();
        return f0Var.a();
    }
}
