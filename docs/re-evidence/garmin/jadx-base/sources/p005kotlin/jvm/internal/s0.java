package p005kotlin.jvm.internal;

import java.util.Collections;
import k23.d;
import k23.p;
import k23.r;
import n23.d4;

/* JADX INFO: loaded from: classes3.dex */
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f105811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d[] f105812b;

    static {
        t0 t0Var = null;
        try {
            t0Var = (t0) d4.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (t0Var == null) {
            t0Var = new t0();
        }
        f105811a = t0Var;
        f105812b = new d[0];
    }

    public static d a(Class cls) {
        return f105811a.b(cls);
    }

    public static p b(Class cls) {
        t0 t0Var = f105811a;
        return t0Var.l(t0Var.b(cls), Collections.EMPTY_LIST, true);
    }

    public static p c(Class cls) {
        t0 t0Var = f105811a;
        return t0Var.l(t0Var.b(cls), Collections.EMPTY_LIST, false);
    }

    public static p d(Class cls, r rVar) {
        t0 t0Var = f105811a;
        return t0Var.l(t0Var.b(cls), Collections.singletonList(rVar), false);
    }
}
