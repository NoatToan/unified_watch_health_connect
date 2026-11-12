package f4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f68805a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f68806b = new Object();

    public static final void a(int i14, int i15) {
        if (i14 < 0 || i14 >= i15) {
            throw new IndexOutOfBoundsException("index (" + i14 + ") is out of bound of [0, " + i15 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final boolean b(a0 a0Var, int i14, u3.c cVar, boolean z14) {
        boolean z15;
        synchronized (f68805a) {
            try {
                int i15 = a0Var.f68717d;
                if (i15 == i14) {
                    a0Var.f68716c = cVar;
                    z15 = true;
                    if (z14) {
                        a0Var.f68718e++;
                    }
                    a0Var.f68717d = i15 + 1;
                } else {
                    z15 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z15;
    }

    public static final int c(long[] jArr, long j8) {
        int length = jArr.length - 1;
        int i14 = 0;
        while (i14 <= length) {
            int i15 = (i14 + length) >>> 1;
            long j14 = jArr[i15];
            if (j8 > j14) {
                i14 = i15 + 1;
            } else {
                if (j8 >= j14) {
                    return i15;
                }
                length = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public static final a0 d(s sVar) {
        a0 a0Var = sVar.f68804a;
        a0Var.getClass();
        return (a0) l.s(a0Var, sVar);
    }

    public static final int e(s sVar) {
        a0 a0Var = sVar.f68804a;
        a0Var.getClass();
        return ((a0) l.g(a0Var)).f68718e;
    }

    public static final boolean f(s sVar, e23.l lVar) {
        int i14;
        u3.c<? extends T> cVar;
        Object objInvoke;
        f fVarI;
        boolean zB;
        do {
            synchronized (f68805a) {
                a0 a0Var = sVar.f68804a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.g(a0Var);
                i14 = a0Var2.f68717d;
                cVar = a0Var2.f68716c;
                Unit unit = Unit.INSTANCE;
            }
            cVar.getClass();
            v3.f fVarBuilder = cVar.builder();
            objInvoke = lVar.invoke(fVarBuilder);
            u3.c cVarC = fVarBuilder.c();
            if (p005kotlin.jvm.internal.s.g(cVarC, cVar)) {
                break;
            }
            a0 a0Var3 = sVar.f68804a;
            a0Var3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zB = b((a0) l.v(a0Var3, sVar, fVarI), i14, cVarC, true);
            }
            l.m(fVarI, sVar);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }
}
