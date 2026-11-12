package ii0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.e5;
import java.util.List;
import p3.n1;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93670a;

        static {
            int[] iArr = new int[p003ji0.j.values().length];
            try {
                iArr[p003ji0.j.SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p003ji0.j.CONTACTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93670a = iArr;
        }
    }

    public static final void a(mi0.c cVar, boolean z14, p003ji0.j jVar, e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1305621343);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.k(jVar == null ? -1 : jVar.ordinal()) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            List listK = p13.x.k(p003ji0.j.SEARCH, p003ji0.j.CONTACTS);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                int iG0 = p13.h0.g0(jVar, listK);
                if (iG0 < 0) {
                    iG0 = 0;
                }
                objQ3 = e5.o(iG0, o0VarE);
            }
            n1 n1Var = (n1) objQ3;
            e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            e2.i0 i0VarA2 = e2.k0.a(0, 0, 3, o0VarE);
            zc.d dVarA = zc.g.a(cVar.f118714f, o0VarE);
            p1 p1VarB = s9.c.b(cVar.f118717i, p13.j0.f134944a, o0VarE, 48);
            p1 p1VarB2 = s9.c.b(cVar.f118716h, Boolean.FALSE, o0VarE, 48);
            u2.h hVarC = u2.i.c(o0VarE);
            boolean zB = o0VarE.B(hVarC) | o0VarE.r(cVar);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new l(hVarC, cVar, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, hVarC, o0VarE);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(-390469867, new da0.o(aVar, listK, n1Var, dVarA, cVar, hVarC, i0VarA, z14, i0VarA2, context, p1Var, p1VarB, p1VarB2, p1Var2), o0Var), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(cVar, z14, jVar, aVar, i14, 4);
        }
    }
}
