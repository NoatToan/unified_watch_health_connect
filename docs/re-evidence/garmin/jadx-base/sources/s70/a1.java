package s70;

import c2.l2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/a1;", "Lr70/r;", "Ly70/o;", "stateHolder", "<init>", "(Ly70/o;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a1 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.o f157648a;

    public a1(y70.o oVar) {
        oVar.getClass();
        this.f157648a = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0255  */
    /* JADX WARN: Code duplicated, block: B:76:0x0298  */
    /* JADX WARN: Code duplicated, block: B:77:0x02c7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(final h4.r rVar, final r70.q qVar, p3.m mVar, final int i14) {
        int i15;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        String strP;
        p3.m.a.C2565a c2565a;
        h2.b bVarB;
        boolean zR;
        Object objQ;
        boolean z14;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, 415106264);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            o70.p pVar2 = (o70.p) s9.c.b(this.f157648a.f194675a, null, o0VarQ, 48).getF182175a();
            if (pVar2 != null) {
                o0VarQ.C(1220104342);
                int size = pVar2.f130052b.size();
                if (size == 0) {
                    o0VarQ.g0(false);
                    p2VarI0 = o0VarQ.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i16 = 0;
                    pVar = new e23.p(this) { // from class: s70.z0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ a1 f157842b;

                        {
                            this.f157842b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i17 = i16;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i17) {
                                case 0:
                                    this.f157842b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                default:
                                    this.f157842b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    if (size == 1) {
                        o0VarQ.C(1568979326);
                        strP = gl1.y.P(R.string.lbl_num_item_singular, new Object[]{Integer.valueOf(size)}, o0VarQ);
                        o0VarQ.g0(false);
                    } else {
                        o0VarQ.C(1569087423);
                        strP = gl1.y.P(R.string.lbl_num_items_plural, new Object[]{Integer.valueOf(size)}, o0VarQ);
                        o0VarQ.g0(false);
                    }
                    String strP2 = oi0.c.P(p13.x.k(gl1.y.Q(o0VarQ, R.string.lbl_in_focus), gl1.y.Q(o0VarQ, R.string.lbl_carousel), strP));
                    boolean zB = o0VarQ.B(strP2);
                    Object objQ2 = o0VarQ.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zB) {
                        objQ2 = new r0(strP2, 2);
                        o0VarQ.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new r0(strP2, 2);
                            o0VarQ.K(objQ2);
                        }
                    }
                    h4.r rVarC = p5.v.c((e23.l) objQ2, rVar, false);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarQ, 0);
                    int iHashCode = Long.hashCode(o0VarQ.U);
                    i2 i2VarA0 = o0VarQ.a0();
                    h4.r rVarC2 = h4.k.c(rVarC, o0VarQ);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (o0VarQ.f135177b == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarQ.z();
                    if (o0VarQ.T) {
                        o0VarQ.M(aVar2);
                    } else {
                        o0VarQ.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarQ);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarQ);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (o0VarQ.T || !p005kotlin.jvm.internal.s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarQ, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0VarQ);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String strQ = gl1.y.Q(o0VarQ, R.string.lbl_in_focus);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar2.getClass();
                    float f15 = eVar.f97921f;
                    bVar2.getClass();
                    h4.r rVarC3 = c2.l.C(aVar3, f14, f15, eVar.f97920e, 0.0f, 8);
                    Object objQ3 = o0VarQ.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new s5.e0(18);
                        o0VarQ.K(objQ3);
                    }
                    h4.r rVarC4 = p5.v.c((e23.l) objQ3, rVarC3, false);
                    d6.h.f57752b.getClass();
                    d6.h hVarA = d6.h.a(d6.h.f57757g);
                    d92.b.f58624b.getClass();
                    int i17 = i15;
                    mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarQ), o0VarQ, 0, 0, 130044);
                    int i18 = pVar2.f130051a;
                    boolean zK = o0VarQ.k(size);
                    Object objQ4 = o0VarQ.q();
                    if (zK) {
                        c2565a = c2565a2;
                    } else {
                        c2565a = c2565a2;
                        if (objQ4 == c2565a) {
                        }
                        bVarB = h2.o0.b(i18, (e23.a) objQ4, o0VarQ, 0, 2);
                        bVar2.getClass();
                        float f16 = eVar.f97918c;
                        bVar2.getClass();
                        l2 l2VarA = c2.l.a(eVar.f97920e);
                        zR = o0VarQ.r(pVar2);
                        objQ = o0VarQ.q();
                        if (zR || objQ == c2565a) {
                            objQ = new b0(pVar2, 3);
                            o0VarQ.K(objQ);
                        }
                        h2.u.a(bVarB, rVar, l2VarA, null, 0, f16, null, null, false, (e23.l) objQ, null, null, null, z3.f.c(517944166, new o72.m1(5, pVar2, qVar), o0VarQ), o0VarQ, (i17 << 3) & 112, 24576, 15320);
                        o0VarQ = o0VarQ;
                        if (size > 1) {
                            o0VarQ.C(-2020500074);
                            int i19 = pVar2.f130051a;
                            h4.r rVarB = b0Var.b(aVar3, h4.d.a.f81537o);
                            bVar2.getClass();
                            l02.f.a(bVarB, rVarB, size, i19, 0L, 0L, j92.b.f97901d.f97902a, 0.0f, null, o0VarQ, 0, 944);
                            z14 = false;
                            o0VarQ.g0(false);
                        } else {
                            z14 = false;
                            o0VarQ.C(-2020108389);
                            o0VarQ.g0(false);
                        }
                        o0VarQ.g0(true);
                        Unit unit = Unit.INSTANCE;
                        o0VarQ.g0(z14);
                    }
                    objQ4 = new a51.c(size, 12);
                    o0VarQ.K(objQ4);
                    bVarB = h2.o0.b(i18, (e23.a) objQ4, o0VarQ, 0, 2);
                    bVar2.getClass();
                    float f17 = eVar.f97918c;
                    bVar2.getClass();
                    l2 l2VarA2 = c2.l.a(eVar.f97920e);
                    zR = o0VarQ.r(pVar2);
                    objQ = o0VarQ.q();
                    if (zR) {
                        objQ = new b0(pVar2, 3);
                        o0VarQ.K(objQ);
                    } else {
                        objQ = new b0(pVar2, 3);
                        o0VarQ.K(objQ);
                    }
                    h2.u.a(bVarB, rVar, l2VarA2, null, 0, f17, null, null, false, (e23.l) objQ, null, null, null, z3.f.c(517944166, new o72.m1(5, pVar2, qVar), o0VarQ), o0VarQ, (i17 << 3) & 112, 24576, 15320);
                    o0VarQ = o0VarQ;
                    if (size > 1) {
                        o0VarQ.C(-2020500074);
                        int i110 = pVar2.f130051a;
                        h4.r rVarB2 = b0Var.b(aVar3, h4.d.a.f81537o);
                        bVar2.getClass();
                        l02.f.a(bVarB, rVarB2, size, i110, 0L, 0L, j92.b.f97901d.f97902a, 0.0f, null, o0VarQ, 0, 944);
                        z14 = false;
                        o0VarQ.g0(false);
                    } else {
                        z14 = false;
                        o0VarQ.C(-2020108389);
                        o0VarQ.g0(false);
                    }
                    o0VarQ.g0(true);
                    Unit unit2 = Unit.INSTANCE;
                    o0VarQ.g0(z14);
                }
                p2VarI0.f135219d = pVar;
            }
            o0VarQ.C(1220104341);
            o0VarQ.g0(false);
        } else {
            o0VarQ.e();
        }
        p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            final int i24 = 1;
            pVar = new e23.p(this) { // from class: s70.z0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a1 f157842b;

                {
                    this.f157842b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i111 = i24;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i111) {
                        case 0:
                            this.f157842b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            this.f157842b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
