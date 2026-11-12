package lg2;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.e5;
import i3.mh;
import l72.o2;
import lc.u0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import yg2.j0;

/* JADX INFO: loaded from: classes11.dex */
public final class u {
    /* JADX WARN: Code duplicated, block: B:129:0x0205  */
    /* JADX WARN: Code duplicated, block: B:131:0x020c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0210  */
    /* JADX WARN: Code duplicated, block: B:137:0x022b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0235  */
    /* JADX WARN: Code duplicated, block: B:142:0x0238  */
    /* JADX WARN: Code duplicated, block: B:149:0x027c  */
    /* JADX WARN: Code duplicated, block: B:171:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:189:0x0353  */
    /* JADX WARN: Code duplicated, block: B:194:0x0388  */
    /* JADX WARN: Code duplicated, block: B:196:0x0396  */
    /* JADX WARN: Code duplicated, block: B:199:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:204:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:207:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:210:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:211:0x03de  */
    /* JADX WARN: Code duplicated, block: B:217:0x044f  */
    /* JADX WARN: Code duplicated, block: B:238:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:254:0x0570  */
    /* JADX WARN: Code duplicated, block: B:261:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:263:0x05eb  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final h4.r rVar, final e23.a aVar, final ag2.e eVar, final e23.q qVar, r rVar2, final e23.l lVar, j0 j0Var, boolean z14, final boolean z15, boolean z16, e23.a aVar2, p3.m mVar, final int i14, final int i15) {
        r rVar3;
        j0 j0Var2;
        o0 o0Var;
        final boolean z17;
        final boolean z18;
        final e23.a aVar3;
        e23.a aVar4;
        h4.r rVar4;
        h5.g.a.f fVar;
        j92.b bVar;
        j92.e eVar2;
        h4.r.a aVar5;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        u2 u2Var;
        boolean z19;
        boolean z24;
        String str;
        int i16;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objQ;
        boolean z28;
        e23.a aVar6;
        j92.e eVar3;
        i53.c<nt2.e> cVarE;
        int i17;
        boolean z29;
        rVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-941123493);
        p3.c<?> cVar = o0VarE.f135177b;
        int i18 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i18 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i18 |= o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 256 : 128;
        }
        int i19 = i18 | (o0VarE.r(qVar) ? 2048 : 1024) | (o0VarE.B(rVar2) ? 16384 : 8192);
        if ((196608 & i14) == 0) {
            i19 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i19 |= o0VarE.B(j0Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i24 = i15 & 128;
        if (i24 != 0) {
            i19 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            i19 |= o0VarE.h(z14) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i19 |= o0VarE.h(z15) ? 67108864 : 33554432;
        }
        int i25 = i15 & 512;
        int i26 = i25 != 0 ? i19 | C.ENCODING_PCM_32BIT : i19 | (o0VarE.h(z16) ? 536870912 : 268435456);
        int i27 = i15 & 1024;
        int i28 = i27 != 0 ? 6 : o0VarE.r(aVar2) ? 4 : 2;
        if (o0VarE.n(i26 & 1, ((i26 & 306783379) == 306783378 && (i28 & 3) == 2) ? false : true)) {
            boolean z34 = i24 != 0 ? true : z14;
            boolean z35 = i25 != 0 ? false : z16;
            p3.m.a aVar7 = p3.m.f135153a;
            if (i27 != 0) {
                Object objQ2 = o0VarE.q();
                aVar7.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new o2(20);
                    o0VarE.K(objQ2);
                }
                aVar4 = (e23.a) objQ2;
            } else {
                aVar4 = aVar2;
            }
            x1 x1Var = p3.n.f135158a;
            ag2.e eVar4 = ag2.e.START_RECORDING;
            boolean z36 = eVar == eVar4 || eVar == ag2.e.START;
            h4.r rVarF = eVar == null ? x2.f(h4.r.S, 1.0f) : x2.f(h4.r.S, 0.3f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar8 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            boolean z37 = z34;
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar5 = h5.g.a.f81810g;
            b4.c(eVar5, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            int i29 = i26;
            if (o0VarE.T) {
                rVar4 = rVarF;
            } else {
                rVar4 = rVarF;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar2 = j92.b.f97899b;
                c2.j.i iVarI = c2.j.i(eVar2.f97920e);
                h4.g.b bVar3 = h4.d.a.f81534l;
                aVar5 = h4.r.S;
                s2VarA = q2.a(iVarI, bVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar5, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar5, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2Var = u2.f22900a;
                if (aVar != null) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                rVar3 = rVar2;
                w.a(z19, eVar, z3.f.c(-265346, new d62.f(rVar3, z37, rVar4, aVar, u2Var, 8), o0VarE), o0VarE, ((i29 >> 3) & 112) | 384);
                z24 = rVar3.f112355a;
                str = "";
                int i30 = 3;
                if (eVar != eVar4 || eVar == ag2.e.START || eVar == ag2.e.END) {
                    i16 = 2;
                    o0VarE.C(-1800121818);
                    m mVar2 = m.f112346a;
                    if (z24) {
                        o0VarE.C(-1799826359);
                    } else {
                        o0VarE.C(1881604029);
                        str = (String) qVar.invoke(eVar, o0VarE, Integer.valueOf((i29 >> 6) & 126));
                    }
                    o0VarE.g0(false);
                    String str2 = str;
                    h4.r rVarF2 = x2.f(aVar5, 1.0f);
                    boolean z38 = !z24;
                    z3.e eVarC = z3.f.c(1966484800, new o(u2Var, z24, i16), o0VarE);
                    if ((i29 & 458752) == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i29 & 896) == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z25;
                    objQ = o0VarE.q();
                    if (z27) {
                        z28 = true;
                        objQ = new p(lVar, eVar, 1);
                        o0VarE.K(objQ);
                    } else {
                        aVar7.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            z28 = true;
                            objQ = new p(lVar, eVar, 1);
                            o0VarE.K(objQ);
                        } else {
                            z28 = true;
                        }
                    }
                    mVar2.c(rVarF2, eVarC, str2, z38, (e23.a) objQ, o0VarE, 196662);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                } else {
                    if (eVar == ag2.e.STOP_RECORDING) {
                        o0VarE.C(-1799419358);
                        m mVar3 = m.f112346a;
                        if (z24) {
                            o0VarE.C(-1799120055);
                            z29 = false;
                        } else {
                            z29 = false;
                            o0VarE.C(1881626813);
                            str = (String) qVar.invoke(eVar, o0VarE, Integer.valueOf((i29 >> 6) & 126));
                        }
                        o0VarE.g0(z29);
                        String str3 = str;
                        h4.r rVarF3 = x2.f(aVar5, 1.0f);
                        boolean z39 = !z24;
                        z3.e eVarC2 = z3.f.c(-1445430039, new o(u2Var, z24, i30), o0VarE);
                        boolean z44 = ((i29 & 896) == 256) | ((i29 & 458752) == 131072);
                        Object objQ3 = o0VarE.q();
                        if (z44) {
                            i17 = 2;
                            objQ3 = new p(lVar, eVar, 2);
                            o0VarE.K(objQ3);
                        } else {
                            aVar7.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                i17 = 2;
                                objQ3 = new p(lVar, eVar, 2);
                                o0VarE.K(objQ3);
                            } else {
                                i17 = 2;
                            }
                        }
                        mVar3.a(rVarF3, eVarC2, str3, z39, (e23.a) objQ3, o0VarE, 196662);
                        o0Var = o0VarE;
                        o0Var.g0(false);
                    } else {
                        o0Var = o0VarE;
                        i17 = 2;
                        if (eVar != null) {
                            o0Var.C(-1798777193);
                            m mVar4 = m.f112346a;
                            ag2.e.f3224c.getClass();
                            u4.d dVarB = ag2.e.a.b(eVar);
                            String str4 = (String) qVar.invoke(eVar, o0Var, Integer.valueOf((i29 >> 6) & 126));
                            h4.r rVarF4 = x2.f(aVar5, 1.0f);
                            boolean z45 = ((i29 & 896) == 256) | ((458752 & i29) == 131072);
                            Object objQ4 = o0Var.q();
                            if (z45) {
                                objQ4 = new p(lVar, eVar, 3);
                                o0Var.K(objQ4);
                            } else {
                                aVar7.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new p(lVar, eVar, 3);
                                    o0Var.K(objQ4);
                                }
                            }
                            mVar4.b(196992, (e23.a) objQ4, rVarF4, str4, o0Var, dVarB, false);
                            o0Var.g0(false);
                            i16 = 2;
                            o0Var = o0Var;
                        } else {
                            o0Var.C(-1798330421);
                            o0Var.g0(false);
                        }
                        z28 = true;
                    }
                    i16 = i17;
                    z28 = true;
                }
                o0Var.g0(z28);
                if (z35 || !z36) {
                    aVar6 = aVar4;
                    eVar3 = eVar2;
                    o0Var.C(803055889);
                    o0Var.g0(false);
                } else {
                    o0Var.C(802735566);
                    m mVar5 = m.f112346a;
                    String strQ = gl1.y.Q(o0Var, R.string.lbl_follow_a_workout);
                    h4.r rVarF5 = x2.f(aVar5, 1.0f);
                    bVar.getClass();
                    eVar3 = eVar2;
                    h4.r rVarC3 = c2.l.C(rVarF5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                    j.f112330a.getClass();
                    e23.a aVar9 = aVar4;
                    mVar5.d(j.f112334e, strQ, rVarC3, false, aVar9, o0Var, ((i28 << 12) & 57344) | 196656, 8);
                    aVar6 = aVar9;
                    o0Var.g0(false);
                }
                if (z15 || j0Var == null) {
                    j0Var2 = j0Var;
                    o0Var.C(804235997);
                    bVar.getClass();
                    e5.t(aVar5, eVar3.f97920e, o0Var, false);
                } else {
                    o0Var.C(803155926);
                    bVar.getClass();
                    h4.r rVarF6 = x2.f(c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), 1.0f);
                    s2 s2VarA2 = q2.a(c2.j.f22693c, h4.d.a.f81533k, o0Var, 6);
                    x1 x1Var2 = p3.n.f135158a;
                    int iHashCode3 = Long.hashCode(o0Var.U);
                    i2 i2VarA2 = o0Var.a0();
                    h4.r rVarC4 = h4.k.c(rVarF6, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar8);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar5, s2VarA2, o0Var);
                    b4.c(c1623g, i2VarA2, o0Var);
                    if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC4, o0Var);
                    j0Var2 = j0Var;
                    nt2.e eVarA = j0Var2.a(o0Var);
                    boolean zR = o0Var.r(eVarA);
                    Object objQ5 = o0Var.q();
                    if (zR) {
                        objQ5 = new n(eVarA, i16);
                        o0Var.K(objQ5);
                    } else {
                        aVar7.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new n(eVarA, i16);
                            o0Var.K(objQ5);
                        }
                    }
                    h4.r rVarC5 = p5.v.c((e23.l) objQ5, aVar5, false);
                    String str5 = eVarA.f127844a;
                    d92.b.f58624b.getClass();
                    mh.c(str5, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 131068);
                    o0Var.C(1741957822);
                    if (j0Var2 instanceof j0.b) {
                        cVarE = ((j0.b) j0Var2).f197060a.f197056d;
                    } else {
                        if (!(j0Var2 instanceof j0.a)) {
                            u0.r();
                            return;
                        }
                        cVarE = i53.a.e(p13.j0.f134944a);
                    }
                    for (nt2.e eVar6 : cVarE) {
                        h4.r.a aVar10 = h4.r.S;
                        boolean zR2 = o0Var.r(eVar6);
                        Object objQ6 = o0Var.q();
                        if (zR2) {
                            objQ6 = new n(eVar6, 3);
                            o0Var.K(objQ6);
                        } else {
                            aVar7.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new n(eVar6, 3);
                                o0Var.K(objQ6);
                            }
                        }
                        h4.r rVarC6 = p5.v.c((e23.l) objQ6, aVar10, false);
                        String strConcat = " • ".concat(eVar6.f127844a);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97933j, o0Var);
                        d6.p.f57793b.getClass();
                        mh.c(strConcat, rVarC6, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 1, 0, null, x0VarF, o0Var, 0, 24960, 110588);
                    }
                    e5.u(o0Var, false, z28, false);
                }
                o0Var.g0(z28);
                x1 x1Var3 = p3.n.f135158a;
                z17 = z37;
                aVar3 = aVar6;
                z18 = z35;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar2 = j92.b.f97899b;
            c2.j.i iVarI2 = c2.j.i(eVar2.f97920e);
            h4.g.b bVar4 = h4.d.a.f81534l;
            aVar5 = h4.r.S;
            s2VarA = q2.a(iVarI2, bVar4, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar5, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(eVar5, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2Var = u2.f22900a;
            if (aVar != null) {
                z19 = true;
            } else {
                z19 = false;
            }
            rVar3 = rVar2;
            w.a(z19, eVar, z3.f.c(-265346, new d62.f(rVar3, z37, rVar4, aVar, u2Var, 8), o0VarE), o0VarE, ((i29 >> 3) & 112) | 384);
            z24 = rVar3.f112355a;
            str = "";
            int i34 = 3;
            if (eVar != eVar4) {
                i16 = 2;
                o0VarE.C(-1800121818);
                m mVar6 = m.f112346a;
                if (z24) {
                    o0VarE.C(-1799826359);
                } else {
                    o0VarE.C(1881604029);
                    str = (String) qVar.invoke(eVar, o0VarE, Integer.valueOf((i29 >> 6) & 126));
                }
                o0VarE.g0(false);
                String str6 = str;
                h4.r rVarF7 = x2.f(aVar5, 1.0f);
                boolean z310 = !z24;
                z3.e eVarC3 = z3.f.c(1966484800, new o(u2Var, z24, i16), o0VarE);
                if ((i29 & 458752) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i29 & 896) == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z25;
                objQ = o0VarE.q();
                if (z27) {
                    aVar7.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        z28 = true;
                        objQ = new p(lVar, eVar, 1);
                        o0VarE.K(objQ);
                    } else {
                        z28 = true;
                    }
                } else {
                    z28 = true;
                    objQ = new p(lVar, eVar, 1);
                    o0VarE.K(objQ);
                }
                mVar6.c(rVarF7, eVarC3, str6, z310, (e23.a) objQ, o0VarE, 196662);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                i16 = 2;
                o0VarE.C(-1800121818);
                m mVar7 = m.f112346a;
                if (z24) {
                    o0VarE.C(-1799826359);
                } else {
                    o0VarE.C(1881604029);
                    str = (String) qVar.invoke(eVar, o0VarE, Integer.valueOf((i29 >> 6) & 126));
                }
                o0VarE.g0(false);
                String str7 = str;
                h4.r rVarF8 = x2.f(aVar5, 1.0f);
                boolean z311 = !z24;
                z3.e eVarC4 = z3.f.c(1966484800, new o(u2Var, z24, i16), o0VarE);
                if ((i29 & 458752) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i29 & 896) == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z25;
                objQ = o0VarE.q();
                if (z27) {
                    aVar7.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        z28 = true;
                        objQ = new p(lVar, eVar, 1);
                        o0VarE.K(objQ);
                    } else {
                        z28 = true;
                    }
                } else {
                    z28 = true;
                    objQ = new p(lVar, eVar, 1);
                    o0VarE.K(objQ);
                }
                mVar7.c(rVarF8, eVarC4, str7, z311, (e23.a) objQ, o0VarE, 196662);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            o0Var.g0(z28);
            if (z35) {
                aVar6 = aVar4;
                eVar3 = eVar2;
                o0Var.C(803055889);
                o0Var.g0(false);
            } else {
                aVar6 = aVar4;
                eVar3 = eVar2;
                o0Var.C(803055889);
                o0Var.g0(false);
            }
            if (z15) {
                j0Var2 = j0Var;
                o0Var.C(804235997);
                bVar.getClass();
                e5.t(aVar5, eVar3.f97920e, o0Var, false);
            } else {
                j0Var2 = j0Var;
                o0Var.C(804235997);
                bVar.getClass();
                e5.t(aVar5, eVar3.f97920e, o0Var, false);
            }
            o0Var.g0(z28);
            x1 x1Var4 = p3.n.f135158a;
            z17 = z37;
            aVar3 = aVar6;
            z18 = z35;
        } else {
            rVar3 = rVar2;
            j0Var2 = j0Var;
            o0Var = o0VarE;
            o0Var.e();
            z17 = z14;
            z18 = z16;
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final j0 j0Var3 = j0Var2;
            final r rVar5 = rVar3;
            p2VarI0.f135219d = new e23.p() { // from class: lg2.t
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u.a(rVar, aVar, eVar, qVar, rVar5, lVar, j0Var3, z17, z15, z18, aVar3, (p3.m) obj, p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
