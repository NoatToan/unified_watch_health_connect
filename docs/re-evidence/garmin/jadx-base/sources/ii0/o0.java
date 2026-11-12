package ii0;

import i3.e5;
import java.util.List;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93719a;

        static {
            int[] iArr = new int[p003ji0.k.values().length];
            try {
                iArr[p003ji0.k.FOLLOWERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p003ji0.k.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93719a = iArr;
        }
    }

    public static final void a(final mi0.j jVar, p003ji0.k kVar, final e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        jVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(2007420146);
        int i15 = i14 | (o0VarE.r(jVar) ? 4 : 2) | (o0VarE.k(kVar == null ? -1 : kVar.ordinal()) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            final List listK = p13.x.k(p003ji0.k.FOLLOWERS, p003ji0.k.FOLLOWING);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                int iG0 = p13.h0.g0(kVar, listK);
                if (iG0 < 0) {
                    iG0 = 0;
                }
                objQ = e5.o(iG0, o0VarE);
            }
            final n1 n1Var = (n1) objQ;
            final p1 p1VarC = p3.p0.c(jVar.f118914r, o0VarE, 0);
            final e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            final e2.i0 i0VarA2 = e2.k0.a(0, 0, 3, o0VarE);
            final e2.i0 i0VarA3 = e2.k0.a(0, 0, 3, o0VarE);
            final e2.i0 i0VarA4 = e2.k0.a(0, 0, 3, o0VarE);
            final zc.d dVarA = zc.g.a(jVar.f118909m, o0VarE);
            final zc.d dVarA2 = zc.g.a(jVar.f118912p, o0VarE);
            final zc.d dVarA3 = zc.g.a(jVar.f118910n, o0VarE);
            final zc.d dVarA4 = zc.g.a(jVar.f118913q, o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ2);
            }
            final p1 p1Var = (p1) objQ2;
            yc.s sVarD = dVarA.d();
            yc.s sVarD2 = dVarA2.d();
            boolean zR = o0VarE.r(dVarA) | o0VarE.r(dVarA2);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new l0(dVarA, dVarA2, p1Var, null);
                o0VarE.K(objQ3);
            }
            p3.l0.f(sVarD, sVarD2, (e23.p) objQ3, o0VarE);
            final u2.h hVarC = u2.i.c(o0VarE);
            boolean zB = o0VarE.B(hVarC) | o0VarE.r(jVar);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new m0(hVarC, jVar, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, hVarC, o0VarE);
            final u2.h hVarC2 = u2.i.c(o0VarE);
            boolean zB2 = o0VarE.B(hVarC2) | o0VarE.r(jVar);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == c2565a) {
                objQ5 = new n0(hVarC2, jVar, null);
                o0VarE.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, hVarC2, o0VarE);
            final p003ji0.a aVarA = p003ji0.b.a(o0VarE);
            final p003ji0.a aVarA2 = p003ji0.b.a(o0VarE);
            e23.p pVar = new e23.p() { // from class: ii0.h0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                        e23.a aVar2 = aVar;
                        x3 x3Var = p1VarC;
                        z02.d.a(zBooleanValue, z3.f.c(1949002925, new af0.c(aVar2, x3Var, 1), mVar2), null, null, null, z3.f.c(1149990065, new i0(listK, n1Var, dVarA, dVarA3, jVar, hVarC, aVarA, i0VarA, i0VarA3, dVarA2, dVarA4, hVarC2, aVarA2, i0VarA2, i0VarA4, x3Var), mVar2), mVar2, 196656, 28);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            };
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(2054133544, pVar, o0Var), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(jVar, kVar, aVar, i14, 14);
        }
    }
}
