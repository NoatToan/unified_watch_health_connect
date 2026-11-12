package np;

import am.x0;
import b82.y1;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l72.r1;
import mp.j;
import mp.k;
import mt0.s1;
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
public final class b {
    /* JADX WARN: Code duplicated, block: B:168:0x0370  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final o82.g gVar, final qp.d dVar, final u82.f<i53.d<k, qp.c>> fVar, final l<? super k, Unit> lVar, final p<? super o82.g, ? super Map<j, Boolean>, Unit> pVar, final l<? super x0, Unit> lVar2, final p<? super Integer, ? super Integer, Unit> pVar2, final p<? super Long, ? super x0, Unit> pVar3, final p<? super Long, ? super String, Unit> pVar4, m mVar, final int i14) {
        p<? super Long, ? super String, Unit> pVar5;
        l<? super x0, Unit> lVar3;
        o0 o0Var;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar6;
        ArrayList arrayList;
        int i15;
        i53.c<String> cVarB;
        boolean z14;
        boolean z15;
        boolean z16;
        String strT;
        x0 x0Var;
        gVar.getClass();
        dVar.getClass();
        k kVar = dVar.f146011e;
        fVar.getClass();
        lVar.getClass();
        pVar.getClass();
        lVar2.getClass();
        pVar2.getClass();
        pVar3.getClass();
        pVar4.getClass();
        o0 o0VarE = mVar.E(-1907217048);
        int iA = o0VarE.a();
        int i16 = (i14 & 6) == 0 ? (o0VarE.k(gVar.ordinal()) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(pVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.r(pVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            pVar5 = pVar4;
            i16 |= o0VarE.r(pVar5) ? 67108864 : 33554432;
        } else {
            pVar5 = pVar4;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (i17 & 38347923) != 38347922)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.f(r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            o0VarE.C(564257710);
            mp.a aVar2 = dVar.f146012f;
            mp.b bVar2 = aVar2 != null ? aVar2.f119946a : null;
            i53.c<k> cVar = dVar.f146013g;
            if (cVar.isEmpty()) {
                o0VarE.w(iA);
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i18 = 0;
                final p<? super Long, ? super String, Unit> pVar7 = pVar5;
                pVar6 = new p() { // from class: np.a
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i18) {
                            case 0:
                                ((Integer) obj2).intValue();
                                b.a(gVar, dVar, fVar, lVar, pVar, lVar2, pVar2, pVar3, pVar7, (m) obj, p0.t(i14 | 1));
                                break;
                            case 1:
                                ((Integer) obj2).intValue();
                                b.a(gVar, dVar, fVar, lVar, pVar, lVar2, pVar2, pVar3, pVar7, (m) obj, p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                b.a(gVar, dVar, fVar, lVar, pVar, lVar2, pVar2, pVar3, pVar7, (m) obj, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                i53.c<k> cVar2 = cVar.size() > 1 ? cVar : null;
                if (cVar2 == null) {
                    o0VarE.C(564469159);
                    o0VarE.g0(false);
                    arrayList = null;
                    i15 = 0;
                } else {
                    o0VarE.C(564469160);
                    arrayList = new ArrayList(p13.y.r(cVar2, 10));
                    Iterator<k> it = cVar2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(gl1.d.T(it.next().f120028a, o0VarE, 0));
                    }
                    i15 = 0;
                    o0VarE.g0(false);
                }
                if (arrayList == null || (cVarB = i53.a.e(arrayList)) == null) {
                    cVarB = j53.l.b();
                }
                Iterator<k> it3 = cVar.iterator();
                int i19 = i15;
                while (true) {
                    if (!it3.hasNext()) {
                        i19 = -1;
                        break;
                    } else if ((it3.next() == kVar ? 1 : i15) != 0) {
                        break;
                    } else {
                        i19++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i19);
                if ((i19 >= 0 ? 1 : i15) == 0) {
                    numValueOf = null;
                }
                mp.b bVar3 = bVar2;
                y1.f16902a.c(cVarB, numValueOf != null ? numValueOf.intValue() : i15, true, true, false, 0L, 0L, z3.f.c(-1494687802, new hv0.d(29, lVar, cVar), o0VarE), o0VarE, 12586368, 112);
                o0Var = o0VarE;
                if (kVar == null) {
                    o0Var.w(iA);
                    x1 x1Var2 = n.f135158a;
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i24 = 1;
                    pVar6 = new p() { // from class: np.a
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i24) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    b.a(gVar, dVar, fVar, lVar, pVar, lVar2, pVar2, pVar3, pVar4, (m) obj, p0.t(i14 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj2).intValue();
                                    b.a(gVar, dVar, fVar, lVar, pVar, lVar2, pVar2, pVar3, pVar4, (m) obj, p0.t(i14 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    b.a(gVar, dVar, fVar, lVar, pVar, lVar2, pVar2, pVar3, pVar4, (m) obj, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    r.a aVar3 = r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar4 = d92.b.f58625c;
                    bVar4.getClass();
                    j92.e eVar = j92.b.f97899b;
                    c2.l.f(c2.l.A(aVar3, 0.0f, eVar.f97918c, 1), o0Var);
                    i53.d<k, qp.c> dVarA = fVar.a();
                    qp.c cVar3 = dVarA != null ? dVarA.get(kVar) : null;
                    if (cVar3 == null) {
                        o0Var.C(565172580);
                        o0Var.g0(false);
                        lVar3 = lVar2;
                        z16 = true;
                        z15 = false;
                    } else {
                        o0Var.C(565172581);
                        i53.d<j, Boolean> dVarC = dVar.f146015i.get(new h(gVar, kVar).toString());
                        if (dVarC == null) {
                            dVarC = i53.a.c();
                        }
                        qp.c cVar4 = cVar3;
                        pp.h.a(kVar, cVar3.f146001c, cVar3.f146000b, gVar, cVar3.f146004f, cVar3.f146005g, cVar3.f146006h, dVar.f146014h, dVarC, pVar, o0Var, ((i17 << 9) & 7168) | ((i17 << 15) & 1879048192));
                        o0Var = o0Var;
                        if (cVar4.f146003e) {
                            o0Var.C(-2126022326);
                            l72.p2 p2Var = l72.p2.f111205a;
                            bVar4.getClass();
                            z14 = true;
                            r rVarA = c2.l.A(aVar3, 0.0f, eVar.f97920e, 1);
                            String strQ = gl1.y.Q(o0Var, R.string.activity_view_personal_records_label);
                            boolean zR = o0Var.r(cVar4) | ((i17 & 458752) == 131072);
                            Object objQ = o0Var.q();
                            if (zR) {
                                lVar3 = lVar2;
                                objQ = new s1(15, lVar3, cVar4);
                                o0Var.K(objQ);
                            } else {
                                m.f135153a.getClass();
                                if (objQ == m.a.f135155b) {
                                    lVar3 = lVar2;
                                    objQ = new s1(15, lVar3, cVar4);
                                    o0Var.K(objQ);
                                } else {
                                    lVar3 = lVar2;
                                }
                            }
                            p2Var.g(strQ, rVarA, null, null, null, false, false, (e23.a) objQ, o0Var, 0, 252);
                            z15 = false;
                            o0Var.g0(false);
                        } else {
                            lVar3 = lVar2;
                            z14 = true;
                            z15 = false;
                            o0Var.C(-2125719177);
                            o0Var.g0(false);
                        }
                        i53.c<yp.a> cVar5 = cVar4.f146002d;
                        if (cVar5.isEmpty()) {
                            z16 = z14;
                            o0Var.C(-2124121065);
                            o0Var.g0(z15);
                        } else {
                            o0Var.C(-2125576980);
                            c3 c3Var = (bVar3 == null || (x0Var = bVar3.f119948a) == null) ? null : x0Var.f4360c;
                            if (c3Var == null) {
                                o0Var.C(-2125448548);
                                o0Var.g0(z15);
                                strT = null;
                            } else {
                                o0Var.C(-2125448547);
                                strT = gl1.d.T(c3Var, o0Var, z15 ? 1 : 0);
                                o0Var.g0(z15);
                            }
                            if (strT == null) {
                                strT = "";
                            }
                            r1.b(gl1.y.P(R.string.event_activity_type, new Object[]{strT}, o0Var), null, o0Var, z15 ? 1 : 0, 2);
                            for (yp.a aVar4 : cVar5) {
                                if (aVar4 instanceof yp.d) {
                                    o0Var.C(-2129866525);
                                    pp.a.a((yp.d) aVar4, kVar, cVar4.f146005g, cVar4.f146006h, pVar3, pVar4, o0Var, (i17 >> 9) & 516096);
                                    o0Var.g0(z15);
                                } else {
                                    if (!(aVar4 instanceof yp.e)) {
                                        throw kg.f.h(o0Var, -1315633177, z15);
                                    }
                                    o0Var.C(-2129295970);
                                    pp.a.b((yp.e) aVar4, kVar, cVar4.f146005g, cVar4.f146006h, pVar2, o0Var, (i17 >> 6) & 57344);
                                    o0Var.g0(z15);
                                }
                                z14 = z14;
                            }
                            z16 = z14;
                            o0Var.g0(z15);
                        }
                        Unit unit = Unit.INSTANCE;
                        o0Var.g0(z15);
                    }
                    o0Var.g0(z15);
                    o0Var.g0(z16);
                    x1 x1Var3 = n.f135158a;
                }
            }
            p2VarI0.f135219d = pVar6;
        }
        lVar3 = lVar2;
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i25 = 2;
            final l<? super x0, Unit> lVar4 = lVar3;
            pVar6 = new p() { // from class: np.a
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i25) {
                        case 0:
                            ((Integer) obj2).intValue();
                            b.a(gVar, dVar, fVar, lVar, pVar, lVar4, pVar2, pVar3, pVar4, (m) obj, p0.t(i14 | 1));
                            break;
                        case 1:
                            ((Integer) obj2).intValue();
                            b.a(gVar, dVar, fVar, lVar, pVar, lVar4, pVar2, pVar3, pVar4, (m) obj, p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            b.a(gVar, dVar, fVar, lVar, pVar, lVar4, pVar2, pVar3, pVar4, (m) obj, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar6;
        }
    }
}
