package com.google.android.gms.internal.measurement;

import com.huami.message.api.WebConst;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class x3 {
    private static final x3 c = new x3();
    private final ConcurrentMap<Class<?>, a4<?>> b = new ConcurrentHashMap();
    private final b4 a = new m3();

    private x3() {
    }

    public static x3 a() {
        return c;
    }

    public final <T> a4<T> b(Class<T> cls) {
        zzkf.c(cls, WebConst.QueryParam.MESSAGE_TYPE);
        a4<T> a4VarA = (a4) this.b.get(cls);
        if (a4VarA == null) {
            a4VarA = this.a.a(cls);
            zzkf.c(cls, WebConst.QueryParam.MESSAGE_TYPE);
            zzkf.c(a4VarA, "schema");
            a4<T> a4Var = (a4) this.b.putIfAbsent(cls, a4VarA);
            if (a4Var != null) {
                return a4Var;
            }
        }
        return a4VarA;
    }
}
