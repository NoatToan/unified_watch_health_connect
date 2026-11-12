package wv1;

import android.app.Activity;
import e23.l;
import lc.m0;
import nc.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import ug2.q;
import wv0.e;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187456a;

        static {
            int[] iArr = new int[uv1.c.values().length];
            try {
                iArr[uv1.c.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uv1.c.OPEN_LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f187456a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    public static final void a(Activity activity, qv1.b bVar, uv1.c cVar, vv1.c cVar2, m0 m0Var, m mVar, int i14) {
        bVar.getClass();
        cVar.getClass();
        o0 o0VarE = mVar.E(-428978690);
        int i15 = i14 | (o0VarE.r(activity) ? 4 : 2) | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.k(cVar.ordinal()) ? 256 : 128) | (o0VarE.r(cVar2) ? 2048 : 1024) | (o0VarE.r(m0Var) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            String str = c.b.f187459b.f187457a;
            boolean zR = o0VarE.r(bVar) | o0VarE.r(activity) | o0VarE.r(cVar2) | ((i15 & 896) == 256) | o0VarE.r(m0Var);
            Object objQ = o0VarE.q();
            if (zR) {
                q qVar = new q(bVar, activity, cVar2, cVar, m0Var, 10);
                o0VarE.K(qVar);
                objQ = qVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    q qVar2 = new q(bVar, activity, cVar2, cVar, m0Var, 10);
                    o0VarE.K(qVar2);
                    objQ = qVar2;
                }
            }
            y.b(m0Var, str, null, null, null, null, null, null, (l) objQ, o0VarE, (i15 >> 12) & 14, 1020);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(activity, bVar, cVar, cVar2, m0Var, i14, 1);
        }
    }
}
