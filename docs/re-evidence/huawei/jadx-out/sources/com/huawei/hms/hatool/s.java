package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Map<String, l1> f13494b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static s f13495c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g1 f13496a = new g1();

    public g1 b() {
        return this.f13496a;
    }

    public void a(String str, l1 l1Var) {
        f13494b.put(str, l1Var);
    }

    public Set<String> a() {
        return f13494b.keySet();
    }

    public l1 a(String str) {
        return f13494b.get(str);
    }

    private static void d() {
        synchronized (s.class) {
            if (f13495c == null) {
                f13495c = new s();
            }
        }
    }

    public static s c() {
        if (f13495c == null) {
            d();
        }
        return f13495c;
    }

    private s() {
    }
}
