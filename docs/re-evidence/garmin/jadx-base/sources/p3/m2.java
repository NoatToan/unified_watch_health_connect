package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp3/m2;", "T", "Lp3/t;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Le23/a;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m2<T> extends t<T> {
    public m2(e23.a<? extends T> aVar) {
        super(aVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 java.lang.Object) = (r5v9 java.lang.Object), (r5v10 java.lang.Object) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p3.t
    public final c4<T> b(n2<T> n2Var, c4<T> c4Var) {
        b0 b0Var;
        Object obj;
        z3 z3Var;
        k0 k0Var = null;
        if (c4Var instanceof k0) {
            if (n2Var.f135172f) {
                k0Var = (k0) c4Var;
                k0Var.f135136a.setValue(n2Var.a());
            }
        } else if (c4Var instanceof z3) {
            if ((n2Var.f135168b || n2Var.f135173g != null) && !n2Var.f135172f) {
                z3Var = (z3) c4Var;
                if (p005kotlin.jvm.internal.s.g(n2Var.a(), z3Var.f135394a)) {
                    obj = b0Var;
                    obj = z3Var;
                    k0Var = (c4<T>) obj;
                }
            }
        } else if (c4Var instanceof b0) {
            b0Var = (b0) c4Var;
            if (n2Var.f135171e == b0Var.f135042a) {
                obj = b0Var;
                obj = z3Var;
                k0Var = (c4<T>) obj;
            }
        }
        if (k0Var != null) {
            return k0Var;
        }
        boolean z14 = n2Var.f135172f;
        p1<T> c2Var = n2Var.f135170d;
        if (!z14) {
            e23.l<u, T> lVar = n2Var.f135171e;
            if (lVar != null) {
                return new b0(lVar);
            }
            return c2Var != null ? new k0(c2Var) : new z3(n2Var.a());
        }
        if (c2Var == null) {
            T t7 = n2Var.f135173g;
            p3 p3Var = n2Var.f135169c;
            if (p3Var == null) {
                p3Var = a4.f135041a;
                p3Var.getClass();
            }
            c2Var = new c2(t7, p3Var);
        }
        return new k0(c2Var);
    }

    public abstract n2<T> c(T t7);
}
