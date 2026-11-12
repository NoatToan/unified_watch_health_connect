package com.google.android.gms.internal.fitness;

import com.huami.message.api.WebConst;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class t3 {
    private static final t3 c = new t3();
    private final ConcurrentMap<Class<?>, x3<?>> b = new ConcurrentHashMap();
    private final w3 a = new c3();

    private t3() {
    }

    public static t3 a() {
        return c;
    }

    public final <T> x3<T> b(Class<T> cls) {
        zzhc.c(cls, WebConst.QueryParam.MESSAGE_TYPE);
        x3<T> x3Var = (x3) this.b.get(cls);
        if (x3Var != null) {
            return x3Var;
        }
        x3<T> x3VarA = this.a.a(cls);
        zzhc.c(cls, WebConst.QueryParam.MESSAGE_TYPE);
        zzhc.c(x3VarA, "schema");
        x3<T> x3Var2 = (x3) this.b.putIfAbsent(cls, x3VarA);
        return x3Var2 != null ? x3Var2 : x3VarA;
    }

    public final <T> x3<T> c(T t) {
        return b(t.getClass());
    }
}
