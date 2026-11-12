package c42;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import l72.p2;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24398a = new a();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f24399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f24400b;

        public b(e23.l lVar, List list) {
            this.f24399a = lVar;
            this.f24400b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f24399a.invoke(this.f24400b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f24401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f24402b;

        public c(List list, e23.l lVar) {
            this.f24401a = list;
            this.f24402b = lVar;
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
                zd0.k.a aVar = (zd0.k.a) this.f24401a.get(iIntValue);
                mVar2.C(8713191);
                h0.a(aVar, this.f24402b, mVar2, zd0.k.a.f204041e);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    public static final void a(zd0.k.a aVar, e23.l<? super zd0.k.a, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        int i16;
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(2011259439);
        int i17 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (aVar.f204045d) {
                i15 = 85044757;
                i16 = R.string.lbl_connected;
            } else {
                i15 = 85046173;
                i16 = R.string.lbl_disconnected;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            p2 p2Var = p2.f111205a;
            String str = aVar.f204043b;
            boolean z14 = true;
            boolean z15 = aVar.f204045d;
            if (z15) {
                o0VarE.C(-1657824760);
                boolean z16 = (i17 & 112) == 32;
                if ((i17 & 14) != 4 && ((i17 & 8) == 0 || !o0VarE.r(aVar))) {
                    z14 = false;
                }
                boolean z17 = z16 | z14;
                Object objQ = o0VarE.q();
                if (z17) {
                    objQ = new f0(lVar, aVar, 0);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(lVar, aVar, 0);
                        o0VarE.K(objQ);
                    }
                }
                aVar2 = (e23.a) objQ;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1657776617);
                o0VarE.g0(false);
                aVar2 = null;
            }
            o0Var = o0VarE;
            p2Var.h(str, strJ, null, null, null, z15, false, z3.f.c(-1814553411, new g0(aVar, 0), o0VarE), null, null, aVar2, o0Var, 12582912, 0, 860);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(aVar, lVar, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    public static final void b(List<zd0.k.a> list, e23.l<? super zd0.k.a, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-195147936);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarE, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            boolean zR = o0VarE.r(list) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new d0(list, lVar, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d0(list, lVar, 0);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarC, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e0(lVar, i14, 0, list);
        }
    }

    public static final void c(i0 i0Var, p pVar, e23.a aVar, p3.m mVar, int i14) {
        i0Var.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(226112401);
        int i15 = (o0VarE.r(i0Var) ? 4 : 2) | i14 | (o0VarE.r(pVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(120981782, new a51.g(aVar, 27), o0VarE), null, null, null, z3.f.c(-678031078, new c0(0, pVar, s9.c.c(i0Var.f24406a, o0VarE)), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.e(i0Var, pVar, aVar, i14, 27);
        }
    }
}
