package mo;

import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import l30.i0;
import l30.y0;
import l72.j0;
import l72.r1;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c6  */
    public static final void a(final i iVar, final l lVar, final l lVar2, final e23.a aVar, final e23.a aVar2, r rVar, m mVar, final int i14) {
        l lVar3;
        final r rVar2;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        boolean z14;
        boolean z15;
        i53.c<pe0.b> cVar = iVar.f119864c;
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-778629054);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(iVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | 196608;
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            final r.a aVar3 = r.S;
            x1 x1Var = n.f135158a;
            if (iVar.f119862a) {
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(aVar3, o0VarE);
                h5.g.V.getClass();
                e0.a aVar4 = h5.g.a.f81805b;
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                x0.f23314a.getClass();
                r1.c(gl1.d.W(x0.f23441h8), gl1.y.Q(o0VarE, R.string.lbl_help), aVar2, false, null, null, o0VarE, (i15 >> 6) & 896, 56);
                l72.p2 p2Var = l72.p2.f111205a;
                String strW = gl1.d.W(x0.C8);
                z3.e eVarC = z3.f.c(717459809, new m92.f(iVar, 6), o0VarE);
                int i16 = i15 & 14;
                boolean z16 = ((i15 & 112) == 32) | (i16 == 4);
                Object objQ = o0VarE.q();
                m.a aVar5 = m.f135153a;
                if (z16) {
                    objQ = new i0(29, lVar, iVar);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new i0(29, lVar, iVar);
                        o0VarE.K(objQ);
                    }
                }
                o0VarE = o0VarE;
                p2Var.g(strW, null, null, null, eVarC, false, false, (e23.a) objQ, o0VarE, 24576, 238);
                if (iVar.f119863b) {
                    o0VarE.C(2036412590);
                    if (iVar.f119866e) {
                        lVar3 = lVar2;
                        z14 = true;
                        z15 = false;
                        o0VarE.C(2037824950);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(2036453603);
                        if (cVar.isEmpty()) {
                            o0VarE.C(2036461260);
                            p2Var.g(gl1.d.W(x0.W7), null, null, null, null, false, false, aVar, o0VarE, (i15 << 15) & 234881024, 254);
                            z15 = false;
                            o0VarE.g0(false);
                            lVar3 = lVar2;
                            z14 = true;
                        } else {
                            z15 = false;
                            o0VarE.C(2036697263);
                            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                            for (pe0.b bVar2 : cVar) {
                                arrayList.add(new j0(bVar2.f137403b, null, null, false, iVar.f119865d.contains(Long.valueOf(bVar2.f137402a)), 14, null));
                            }
                            i53.c cVarE = i53.a.e(arrayList);
                            r.a aVar6 = r.S;
                            r rVarF = x2.f(u1.n.e(aVar6, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
                            j.f22691a.getClass();
                            j.C0343j c0343j = j.f22692b;
                            h4.d.f81522a.getClass();
                            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                            x1 x1Var2 = n.f135158a;
                            int iHashCode2 = Long.hashCode(o0VarE.U);
                            i2 i2VarA1 = o0VarE.a0();
                            r rVarC2 = k.c(rVarF, o0VarE);
                            h5.g.V.getClass();
                            e0.a aVar7 = h5.g.a.f81805b;
                            if (cVar2 == null) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar7);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                            b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                            h5.g.a.b bVar3 = h5.g.a.f81813j;
                            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                            }
                            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                            u2 u2Var = u2.f22900a;
                            f82.e eVar = new f82.e();
                            j92.b bVar4 = d92.b.f58625c;
                            bVar4.getClass();
                            j92.e eVar2 = j92.b.f97899b;
                            float f14 = eVar2.f97920e;
                            bVar4.getClass();
                            float f15 = eVar2.f97920e;
                            bVar4.getClass();
                            r rVarC3 = c2.l.C(aVar6, f14, 0.0f, f15, eVar2.f97917b, 2);
                            boolean z17 = ((i15 & 896) == 256) | (i16 == 4);
                            Object objQ2 = o0VarE.q();
                            if (z17) {
                                lVar3 = lVar2;
                                objQ2 = new y0(26, iVar, lVar3);
                                o0VarE.K(objQ2);
                            } else {
                                aVar5.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    lVar3 = lVar2;
                                    objQ2 = new y0(26, iVar, lVar3);
                                    o0VarE.K(objQ2);
                                } else {
                                    lVar3 = lVar2;
                                }
                            }
                            e82.a.a(cVarE, rVarC3, eVar, (p) objQ2, o0VarE, 0, 0);
                            z14 = true;
                            o0VarE.g0(true);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z15);
                    }
                    o0VarE.g0(z15);
                } else {
                    lVar3 = lVar2;
                    z14 = true;
                    o0VarE.C(2037834870);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
                rVar2 = aVar3;
            } else {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new p(iVar, lVar, lVar2, aVar, aVar2, aVar3, i14, i17) { // from class: mo.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f119855a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i f119856b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ l f119857c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ l f119858d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ e23.a f119859e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.a f119860f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ r f119861g;

                    {
                        this.f119855a = i17;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f119855a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                h.a(this.f119856b, this.f119857c, this.f119858d, this.f119859e, this.f119860f, this.f119861g, (m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                h.a(this.f119856b, this.f119857c, this.f119858d, this.f119859e, this.f119860f, this.f119861g, (m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            p2VarI0.f135219d = pVar;
        }
        lVar3 = lVar2;
        o0VarE.e();
        rVar2 = rVar;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i18 = 1;
            final l lVar4 = lVar3;
            pVar = new p(iVar, lVar, lVar4, aVar, aVar2, rVar2, i14, i18) { // from class: mo.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f119855a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f119856b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ l f119857c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ l f119858d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.a f119859e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.a f119860f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ r f119861g;

                {
                    this.f119855a = i18;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f119855a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            h.a(this.f119856b, this.f119857c, this.f119858d, this.f119859e, this.f119860f, this.f119861g, (m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            h.a(this.f119856b, this.f119857c, this.f119858d, this.f119859e, this.f119860f, this.f119861g, (m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
