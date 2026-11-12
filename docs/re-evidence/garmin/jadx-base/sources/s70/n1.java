package s70;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/n1;", "Lr70/r;", "Ly70/s;", "stateHolder", "<init>", "(Ly70/s;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n1 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.s f157747a;

    public n1(y70.s sVar) {
        sVar.getClass();
        this.f157747a = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0252  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(final h4.r rVar, final r70.q qVar, p3.m mVar, final int i14) {
        int i15;
        p3.o0 o0Var;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        p3.m.a.C2565a c2565a;
        boolean zB;
        Object objQ;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -431297672);
        p3.c<?> cVar = o0VarQ.f135177b;
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
        int i16 = i15;
        if (o0VarQ.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            o70.u uVar = (o70.u) s9.c.b(this.f157747a.f194680a, null, o0VarQ, 48).getF182175a();
            if (uVar != null) {
                List<r70.s> list = uVar.f130102a;
                o0VarQ.C(1753419369);
                if (list.isEmpty()) {
                    o0VarQ.g0(false);
                    p2VarI0 = o0VarQ.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i17 = 0;
                    pVar = new e23.p(this) { // from class: s70.m1

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ n1 f157733b;

                        {
                            this.f157733b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = i17;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    this.f157733b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                default:
                                    this.f157733b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    String strQ = gl1.y.Q(o0VarQ, R.string.see_all_camel_case);
                    String strP = gl1.y.P(R.string.lbl_button_desc, new Object[]{strQ}, o0VarQ);
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar.getClass();
                    float f15 = eVar.f97921f;
                    bVar.getClass();
                    h4.r rVarC = c2.l.C(rVar, f14, f15, eVar.f97920e, 0.0f, 8);
                    c2.j jVar = c2.j.f22691a;
                    bVar.getClass();
                    float f16 = eVar.f97918c;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f16);
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarQ, 0);
                    int iHashCode = Long.hashCode(o0VarQ.U);
                    i2 i2VarA0 = o0VarQ.a0();
                    h4.r rVarC2 = h4.k.c(rVarC, o0VarQ);
                    h5.g.V.getClass();
                    h5.e0.a aVar = h5.g.a.f81805b;
                    if (cVar == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarQ.z();
                    if (o0VarQ.T) {
                        o0VarQ.M(aVar);
                    } else {
                        o0VarQ.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, o0VarQ);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarQ);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarQ.T || !p005kotlin.jvm.internal.s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarQ, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, o0VarQ);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    bVar.getClass();
                    h4.r rVarC3 = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                    s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarQ, 6);
                    int iHashCode2 = Long.hashCode(o0VarQ.U);
                    i2 i2VarA1 = o0VarQ.a0();
                    h4.r rVarC4 = h4.k.c(rVarC3, o0VarQ);
                    if (cVar == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarQ.z();
                    if (o0VarQ.T) {
                        o0VarQ.M(aVar);
                    } else {
                        o0VarQ.c();
                    }
                    b4.c(eVar2, s2VarA, o0VarQ);
                    b4.c(c1623g, i2VarA1, o0VarQ);
                    if (o0VarQ.T || !p005kotlin.jvm.internal.s.g(o0VarQ.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarQ, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC4, o0VarQ);
                    u2 u2Var = u2.f22900a;
                    Object objQ2 = o0VarQ.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ2 == c2565a2) {
                        objQ2 = new s5.e0(21);
                        o0VarQ.K(objQ2);
                    }
                    h4.r rVarC5 = p5.v.c((e23.l) objQ2, aVar2, false);
                    String strQ2 = gl1.y.Q(o0VarQ, R.string.lbl_at_a_glance);
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    mh.c(strQ2, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarQ), o0VarQ, 0, 0, 131068);
                    h4.r rVarC6 = u2Var.c(aVar2, h4.d.a.f81535m);
                    boolean zR = o0VarQ.r(qVar);
                    Object objQ3 = o0VarQ.q();
                    if (zR) {
                        c2565a = c2565a2;
                    } else {
                        c2565a = c2565a2;
                        if (objQ3 == c2565a) {
                        }
                        h4.r rVarD = u1.w.d(rVarC6, false, null, null, (e23.a) objQ3, 15);
                        zB = o0VarQ.B(strP);
                        objQ = o0VarQ.q();
                        if (zB || objQ == c2565a) {
                            objQ = new r0(strP, 3);
                            o0VarQ.K(objQ);
                        }
                        h4.r rVarC7 = p5.v.c((e23.l) objQ, rVarD, false);
                        fVar2.getClass();
                        mh.c(strQ, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97932i, hb.a.e(o0VarQ), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarQ, 0, 0, 131068);
                        o0Var = o0VarQ;
                        o0Var.g0(true);
                        l1.a(list, uVar.f130103b, qVar, o0Var, (i16 << 3) & 896);
                        o0Var.g0(true);
                        Unit unit = Unit.INSTANCE;
                        o0Var.g0(false);
                    }
                    objQ3 = new fp0.d(qVar, 3);
                    o0VarQ.K(objQ3);
                    h4.r rVarD2 = u1.w.d(rVarC6, false, null, null, (e23.a) objQ3, 15);
                    zB = o0VarQ.B(strP);
                    objQ = o0VarQ.q();
                    if (zB) {
                        objQ = new r0(strP, 3);
                        o0VarQ.K(objQ);
                    } else {
                        objQ = new r0(strP, 3);
                        o0VarQ.K(objQ);
                    }
                    h4.r rVarC8 = p5.v.c((e23.l) objQ, rVarD2, false);
                    fVar2.getClass();
                    mh.c(strQ, rVarC8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97932i, hb.a.e(o0VarQ), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarQ, 0, 0, 131068);
                    o0Var = o0VarQ;
                    o0Var.g0(true);
                    l1.a(list, uVar.f130103b, qVar, o0Var, (i16 << 3) & 896);
                    o0Var.g0(true);
                    Unit unit2 = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                p2VarI0.f135219d = pVar;
            }
            o0VarQ.C(1753419368);
            o0VarQ.g0(false);
            o0Var = o0VarQ;
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i18 = 1;
            pVar = new e23.p(this) { // from class: s70.m1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n1 f157733b;

                {
                    this.f157733b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i19) {
                        case 0:
                            this.f157733b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            this.f157733b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
