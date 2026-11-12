package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static y f13512b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Map<String, p0> f13513a = new HashMap();

    public p0 a(String str, long j) {
        p0 p0VarA = a(str);
        p0VarA.a(j);
        return p0VarA;
    }

    private static void b() {
        synchronized (y.class) {
            if (f13512b == null) {
                f13512b = new y();
            }
        }
    }

    public static y a() {
        if (f13512b == null) {
            b();
        }
        return f13512b;
    }

    private p0 a(String str) {
        if (!this.f13513a.containsKey(str)) {
            this.f13513a.put(str, new p0());
        }
        return this.f13513a.get(str);
    }

    private y() {
    }
}
