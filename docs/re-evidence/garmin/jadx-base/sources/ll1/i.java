package ll1;

import b21.j0;
import c2.x2;
import c42.d0;
import c42.e0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import e23.r;
import gl1.y;
import java.util.List;
import l30.i0;
import l30.y0;
import l72.p2;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.x1;
import zd0.o;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f113397a = new a();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f113398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f113399b;

        public b(e23.l lVar, List list) {
            this.f113398a = lVar;
            this.f113399b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f113398a.invoke(this.f113399b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f113400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f113401b;

        public c(List list, e23.l lVar) {
            this.f113400a = list;
            this.f113401b = lVar;
        }

        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                o.a aVar = (o.a) this.f113400a.get(iIntValue);
                mVar2.C(-2048049911);
                i.a(aVar, this.f113401b, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    public static final void a(o.a aVar, e23.l<? super o.a, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(11818637);
        int i15 = (o0VarE.B(aVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, aVar.f204094e ? R.string.txt_garmin_device_connected : R.string.txt_garmin_device_disconnected);
            p2 p2Var = p2.f111205a;
            String str = aVar.f204092c;
            boolean z14 = true;
            boolean z15 = aVar.f204094e;
            if (z15) {
                o0VarE.C(-97316022);
                boolean z16 = (i15 & 112) == 32;
                if ((i15 & 14) != 4) {
                    z14 = false;
                }
                boolean z17 = z16 | z14;
                Object objQ = o0VarE.q();
                if (z17) {
                    objQ = new i0(13, lVar, aVar);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new i0(13, lVar, aVar);
                        o0VarE.K(objQ);
                    }
                }
                aVar2 = (e23.a) objQ;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-97267879);
                o0VarE.g0(false);
                aVar2 = null;
            }
            o0Var = o0VarE;
            p2Var.h(str, strQ, null, null, null, z15, false, z3.f.c(72515995, new kk1.h(aVar, 23), o0VarE), null, null, aVar2, o0Var, 12582912, 0, 860);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(aVar, lVar, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    public static final void b(List<o.a> list, e23.l<? super o.a, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(371111294);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarE, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            boolean zR = o0VarE.r(list) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new d0(list, lVar, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d0(list, lVar, 3);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarC, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e0(lVar, i14, 7, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(m mVar, e23.a aVar, gl1.a aVar2, j0 j0Var, p3.m mVar2, int i14) {
        p1 p1Var;
        m mVar3 = mVar;
        mVar3.getClass();
        aVar.getClass();
        o0 o0VarE = mVar2.E(-1782011025);
        int i15 = i14 | (o0VarE.r(mVar3) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(j0Var) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(mVar3.f113415c, o0VarE);
            p1 p1VarC2 = s9.c.c(mVar3.f113416d, o0VarE);
            l lVar = (l) p1VarC.getF182175a();
            boolean zB = ((i15 & 896) == 256) | o0VarE.B(p1VarC) | o0VarE.r(mVar3) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (zB) {
                j jVar = new j(p1VarC, mVar, aVar2, j0Var, null);
                p1Var = p1VarC;
                mVar3 = mVar;
                o0VarE.K(jVar);
                objQ = jVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    j jVar2 = new j(p1VarC, mVar, aVar2, j0Var, null);
                    p1Var = p1VarC;
                    mVar3 = mVar;
                    o0VarE.K(jVar2);
                    objQ = jVar2;
                } else {
                    p1Var = p1VarC;
                }
            }
            l0.e((p) objQ, lVar, o0VarE);
            z02.d.a(((l) p1Var.getF182175a()).f113410a, z3.f.c(1691734410, new g(aVar, 1), o0VarE), null, null, null, z3.f.c(1204094470, new y0(8, mVar3, p1VarC2), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(mVar3, aVar, aVar2, j0Var, i14, 21);
        }
    }
}
