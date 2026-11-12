package u2;

import d6.m;
import java.util.List;
import o4.q1;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.w;
import p3.n;
import p3.x1;
import s5.i0;
import s5.w0;
import w5.b0;
import w5.c0;
import w5.f0;
import w5.q;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final List a(w0 w0Var, q3.c cVar) {
        if (cVar != null && cVar.f142358c != 0) {
            return h0.b1(cVar.f());
        }
        if (w0Var != null) {
            long j8 = w0Var.f157317a;
            if (!w0.e(j8)) {
                d6.i.f57760b.getClass();
                return w.c(new s5.c.d(new i0(0L, 0L, (f0) null, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (m) null, (z5.c) null, 0L, d6.i.f57762d, (q1) null, (s5.b0) null, (q4.g) null, 61439, (p005kotlin.jvm.internal.j) null), w0.h(j8), w0.g(j8)));
            }
        }
        return j0.f134944a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h hVar) {
        hVar.getClass();
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68799i() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            boolean zBooleanValue = ((Boolean) hVar.f167848c.getF182175a()).booleanValue();
            f4.f.a.e(fVarA, fVarB, f68793s);
            if (zBooleanValue) {
                b2.e.c("TextFieldState does not support concurrent or nested editing.");
            }
            hVar.d(true);
            d dVar = new d(hVar.b(), null, null, null, 14, null);
            try {
                dVar.c(0, dVar.f167831b.length(), "");
                og2.k.B(dVar);
                boolean z14 = dVar.a().f175101a.f142358c > 0;
                boolean zD = true ^ w0.d(dVar.f167833d, hVar.f167847b.f167833d);
                if (z14) {
                    hVar.c(hVar.b(), d.g(dVar, 0L, null, 15), dVar.a(), x2.c.NeverMerge);
                }
                hVar.e(dVar, z14, zD);
            } finally {
                hVar.d(false);
            }
        } catch (Throwable th3) {
            f4.f.a.e(fVarA, fVarB, f68793s);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0029  */
    public static final h c(p3.m mVar) {
        int length = "".length();
        long jL = og.a.l(length, length);
        x1 x1Var = n.f135158a;
        Object[] objArr = new Object[0];
        h.b bVar = h.b.f167852a;
        boolean zB = mVar.B("") | mVar.l(jL);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new a90.b(jL, 15);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new a90.b(jL, 15);
                mVar.K(objQ);
            }
        }
        return (h) d4.a.c(objArr, bVar, (e23.a) objQ, mVar, 48);
    }
}
