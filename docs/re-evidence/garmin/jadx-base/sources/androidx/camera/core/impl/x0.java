package androidx.camera.core.impl;

import com.google.auto.value.AutoValue;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface x0 {

    @AutoValue
    public static abstract class a<T> {
        public static h a(Class cls, String str) {
            return new h(str, cls, null);
        }

        public abstract String b();

        public abstract Object c();

        public abstract Class<T> d();
    }

    public enum b {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    static void E(w1 w1Var, x0 x0Var, x0 x0Var2, a<?> aVar) {
        if (!Objects.equals(aVar, n1.f5651s)) {
            w1Var.W(aVar, x0Var2.h(aVar), x0Var2.e(aVar));
            return;
        }
        u0.c cVarA = (u0.c) x0Var2.f(aVar, null);
        u0.c cVar = (u0.c) x0Var.f(aVar, null);
        b bVarH = x0Var2.h(aVar);
        if (cVarA == null) {
            cVarA = cVar;
        } else if (cVar != null) {
            u0.c.a aVarB = u0.c.a.b(cVar);
            u0.a aVar2 = cVarA.f167324a;
            if (aVar2 != null) {
                aVarB.f167328a = aVar2;
            }
            u0.d dVar = cVarA.f167325b;
            if (dVar != null) {
                aVarB.f167329b = dVar;
            }
            u0.b bVar = cVarA.f167326c;
            if (bVar != null) {
                aVarB.f167330c = bVar;
            }
            int i14 = cVarA.f167327d;
            if (i14 != 0) {
                aVarB.f167331d = i14;
            }
            cVarA = aVarB.a();
        }
        w1Var.W(aVar, bVarH, cVarA);
    }

    static a2 P(x0 x0Var, x0 x0Var2) {
        if (x0Var == null && x0Var2 == null) {
            return a2.P;
        }
        w1 w1VarV = x0Var2 != null ? w1.V(x0Var2) : w1.U();
        if (x0Var != null) {
            Iterator<a<?>> it = x0Var.d().iterator();
            while (it.hasNext()) {
                E(w1VarV, x0Var2, x0Var, it.next());
            }
        }
        return a2.T(w1VarV);
    }

    Set<b> a(a<?> aVar);

    boolean b(a<?> aVar);

    <ValueT> ValueT c(a<ValueT> aVar, b bVar);

    Set<a<?>> d();

    <ValueT> ValueT e(a<ValueT> aVar);

    <ValueT> ValueT f(a<ValueT> aVar, ValueT valuet);

    void g(a0.h hVar);

    b h(a<?> aVar);
}
