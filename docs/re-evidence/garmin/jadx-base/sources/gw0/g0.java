package gw0;

import b82.a1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import i3.e5;
import i3.e9;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.t1;
import kotlin.t3;
import l72.w1;
import lc.u0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {
    public static final void a(Double d14, pv0.r rVar, p3.m mVar, int i14) {
        o0 o0Var;
        String string;
        o0 o0VarE = mVar.E(109083180);
        int i15 = (o0VarE.B(d14) ? 4 : 2) | i14 | (o0VarE.k(rVar.ordinal()) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            aw0.a aVar = new aw0.a(w2.a0.s(o0VarE));
            Double dValueOf = d14 != null ? Double.valueOf(Math.floor(d14.doubleValue())) : null;
            String string2 = (dValueOf == null || Double.isNaN(dValueOf.doubleValue())) ? aVar.f13319a.getString(R.string.no_value_card) : String.valueOf(MathKt.b(dValueOf.doubleValue()));
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(string2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, o0VarE), o0VarE, 0, 0, 131070);
            zv0.d dVar = zv0.d.f207169a;
            l22.a aVarS = w2.a0.s(o0VarE);
            dVar.getClass();
            rVar.getClass();
            int i16 = zv0.d.a.f207170a[rVar.ordinal()];
            if (i16 == 1) {
                string = aVarS.getString(R.string.lbl_avg_overnight_stress);
            } else if (i16 == 2) {
                string = aVarS.getString(R.string.lbl_avg_overnight_hrv);
            } else {
                if (i16 != 3) {
                    u0.r();
                    return;
                }
                string = aVarS.getString(R.string.lbl_avg_score);
            }
            fVar.getClass();
            mh.c(string, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g80.e(d14, rVar, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0269  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(pv0.v vVar, b63.t tVar, o82.g gVar, u uVar, ug2.x xVar, e23.l lVar, p3.m mVar, int i14, int i15) {
        e23.l lVar2;
        int i16;
        o0 o0Var;
        e23.l lVar3;
        e23.l lVar4;
        boolean z14;
        int i17;
        o53.b0 b0Var;
        mc mcVar;
        boolean z15;
        e23.a aVar;
        TreeMap treeMap;
        e23.a aVar2;
        e23.a aVar3;
        boolean z16;
        gVar.getClass();
        uVar.getClass();
        o0 o0VarE = mVar.E(-1417400650);
        int i18 = i14 | ((i14 & 8) == 0 ? o0VarE.B(vVar) : o0VarE.r(vVar) ? 4 : 2) | (o0VarE.r(tVar) ? 32 : 16) | (o0VarE.k(gVar.ordinal()) ? 256 : 128) | (o0VarE.r(uVar) ? 2048 : 1024) | (o0VarE.r(xVar) ? 16384 : 8192);
        int i19 = i15 & 32;
        if (i19 != 0) {
            i16 = i18 | 196608;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            i16 = i18 | (o0VarE.r(lVar2) ? 131072 : 65536);
        }
        int i24 = i16;
        if (o0VarE.n(i24 & 1, (74899 & i24) != 74898)) {
            p3.m.a aVar4 = p3.m.f135153a;
            if (i19 != 0) {
                Object objQ = o0VarE.q();
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g11.e(27);
                    o0VarE.K(objQ);
                }
                lVar4 = (e23.l) objQ;
            } else {
                lVar4 = lVar2;
            }
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(uVar.f79771l, o0VarE);
            p1 p1VarC2 = s9.c.c(uVar.f79775p, o0VarE);
            p1 p1VarC3 = s9.c.c(uVar.f79773n, o0VarE);
            Object objQ2 = o0VarE.q();
            aVar4.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            o53.b0 b0Var2 = (o53.b0) objQ2;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(null);
                o0VarE.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            boolean z17 = gVar == o82.g.f130853f || gVar == o82.g.f130854g;
            pv0.r rVar = ((h0) p1VarC.getF182175a()).f79609a;
            boolean zR = o0VarE.r(uVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new h(uVar, 5);
                o0VarE.K(objQ4);
            }
            e23.a aVar5 = (e23.a) objQ4;
            h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarE, j92.b.f97899b.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            boolean z18 = z17;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            if (vVar == null) {
                o0VarE.C(442170287);
                d(o0VarE, 0);
                o0VarE.g0(false);
                Unit unit = Unit.INSTANCE;
                z14 = false;
                o0Var = o0VarE;
                i17 = i24;
                b0Var = b0Var2;
                mcVar = mcVarF;
            } else {
                Double d14 = vVar.f141428a;
                if (((Boolean) p1VarC2.getF182175a()).booleanValue()) {
                    o0VarE.C(822466818);
                    boolean zBooleanValue = ((Boolean) p1VarC3.getF182175a()).booleanValue();
                    zv0.e.f207174a.getClass();
                    String strA = zv0.e.a();
                    boolean zR2 = o0VarE.r(uVar);
                    Object objQ5 = o0VarE.q();
                    if (zR2 || objQ5 == c2565a) {
                        objQ5 = new h(uVar, 6);
                        o0VarE.K(objQ5);
                    }
                    e23.a aVar7 = (e23.a) objQ5;
                    z14 = false;
                    b0Var = b0Var2;
                    mcVar = mcVarF;
                    i17 = i24;
                    e(rVar, xVar, zBooleanValue, strA, aVar7, z3.f.c(-496819676, new a42.c(28, aVar5, vVar, b0Var, mcVar, p1VarC, p1Var), o0VarE), o0VarE, ((i24 >> 9) & 112) | 196608);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    z14 = false;
                    o0Var = o0VarE;
                    i17 = i24;
                    b0Var = b0Var2;
                    e23.a aVar8 = aVar5;
                    mcVar = mcVarF;
                    boolean z19 = true;
                    if (d14 != null) {
                        double dDoubleValue = d14.doubleValue();
                        if (Double.isNaN(dDoubleValue) || dDoubleValue <= 0.0d) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        o0Var.C(823632108);
                        d(o0Var, 0);
                        if (o72.t.P(vVar)) {
                            o0Var.C(823710476);
                            List<pv0.c> list = vVar.f141429b;
                            boolean z24 = ((h0) p1VarC.getF182175a()).f79614f;
                            boolean zR3 = o0Var.r(b0Var) | o0Var.B(mcVar) | o0Var.B(aVar8);
                            Object objQ6 = o0Var.q();
                            if (zR3 || objQ6 == c2565a) {
                                aVar3 = aVar8;
                                objQ6 = new x(b0Var, p1Var, aVar3, mcVar, 0);
                                o0Var.K(objQ6);
                            } else {
                                aVar3 = aVar8;
                            }
                            c(null, list, null, null, z24, aVar3, (e23.l) objQ6, o0Var, 6, 12);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(824223650);
                            o0Var.g0(false);
                        }
                        o0Var.g0(false);
                        Unit unit3 = Unit.INSTANCE;
                    } else if (o72.t.P(vVar)) {
                        o0Var.C(824405775);
                        a(d14, rVar, o0Var, 0);
                        if (z18) {
                            o0Var.C(824705142);
                            List<pv0.c> list2 = vVar.f141429b;
                            if (list2 != null) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Object obj : list2) {
                                    pv0.a aVarY = oi0.c.y((pv0.c) obj);
                                    Object arrayList = linkedHashMap.get(aVarY);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        linkedHashMap.put(aVarY, arrayList);
                                    }
                                    ((List) arrayList).add(obj);
                                }
                                treeMap = new TreeMap(new d0());
                                treeMap.putAll(linkedHashMap);
                            } else {
                                treeMap = null;
                            }
                            if (treeMap == null) {
                                o0Var.C(824705141);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(824705142);
                                int i25 = 0;
                                for (Object obj2 : treeMap.entrySet()) {
                                    int i26 = i25 + 1;
                                    if (i25 < 0) {
                                        p13.x.q();
                                        throw null;
                                    }
                                    Map.Entry entry = (Map.Entry) obj2;
                                    pv0.a aVar9 = (pv0.a) entry.getKey();
                                    List list3 = (List) entry.getValue();
                                    Long l14 = vVar.f141430c;
                                    Long l15 = vVar.f141431d;
                                    boolean z25 = (((h0) p1VarC.getF182175a()).f79614f && i25 == 0) ? z19 : false;
                                    boolean zR4 = o0Var.r(b0Var) | o0Var.B(mcVar) | o0Var.B(aVar8);
                                    Object objQ7 = o0Var.q();
                                    if (zR4 || objQ7 == p3.m.a.f135155b) {
                                        aVar2 = aVar8;
                                        objQ7 = new x(b0Var, p1Var, aVar2, mcVar, 1);
                                        o0Var.K(objQ7);
                                    } else {
                                        aVar2 = aVar8;
                                    }
                                    boolean z26 = z25;
                                    e23.a aVar10 = aVar2;
                                    c(aVar9, list3, l14, l15, z26, aVar10, (e23.l) objQ7, o0Var, 0, 0);
                                    aVar8 = aVar10;
                                    i25 = i26;
                                    z19 = true;
                                }
                                o0Var.g0(false);
                            }
                            o0Var.g0(false);
                        } else {
                            o0Var.C(825587371);
                            List<pv0.c> list4 = vVar.f141429b;
                            boolean z27 = ((h0) p1VarC.getF182175a()).f79614f;
                            boolean zR5 = o0Var.r(b0Var) | o0Var.B(mcVar) | o0Var.B(aVar8);
                            Object objQ8 = o0Var.q();
                            if (zR5 || objQ8 == c2565a) {
                                aVar = aVar8;
                                objQ8 = new x(b0Var, p1Var, aVar, mcVar, 2);
                                o0Var.K(objQ8);
                            } else {
                                aVar = aVar8;
                            }
                            c(null, list4, null, null, z27, aVar, (e23.l) objQ8, o0Var, 6, 12);
                            o0Var.g0(false);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(824283635);
                        d(o0Var, 0);
                        o0Var.g0(false);
                        Unit unit5 = Unit.INSTANCE;
                    }
                }
            }
            if (mcVar.e()) {
                o0Var.C(826181920);
                pv0.c cVar = (pv0.c) p1Var.getF182175a();
                boolean zR6 = o0Var.r(b0Var) | o0Var.B(mcVar);
                Object objQ9 = o0Var.q();
                if (zR6 || objQ9 == p3.m.a.f135155b) {
                    objQ9 = new cn1.t(b0Var, mcVar, 11);
                    o0Var.K(objQ9);
                }
                pv0.c.Companion companion = pv0.c.INSTANCE;
                int i27 = ((i17 >> 9) & 14) | (i17 & 112) | (i17 & 896) | ((i17 << 3) & 3670016);
                lVar3 = lVar4;
                z16 = true;
                c.a(uVar, tVar, gVar, cVar, mcVar, (e23.a) objQ9, lVar3, o0Var, i27);
                o0Var.g0(z14);
            } else {
                lVar3 = lVar4;
                z16 = true;
                o0Var.C(826614370);
                o0Var.g0(z14);
            }
            o0Var.g0(z16);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            lVar3 = lVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.u0(vVar, tVar, gVar, uVar, xVar, lVar3, i14, i15, 4);
        }
    }

    public static final void c(pv0.a aVar, List<pv0.c> list, Long l14, Long l15, boolean z14, e23.a<Unit> aVar2, e23.l<? super pv0.c, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        Long l16;
        int i17;
        int i18;
        Long l17;
        Long l18;
        o0 o0VarE = mVar.E(1044932222);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i19 = i16 | (o0VarE.r(list) ? 32 : 16);
        int i24 = i15 & 4;
        if (i24 != 0) {
            i17 = i19 | 384;
            l16 = l14;
        } else {
            l16 = l14;
            i17 = i19 | (o0VarE.B(l16) ? 256 : 128);
        }
        int i25 = i15 & 8;
        if (i25 != 0) {
            i18 = i17 | 3072;
        } else {
            i18 = i17 | (o0VarE.B(l15) ? 2048 : 1024);
        }
        int i26 = i18 | (o0VarE.h(z14) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i26 & 1, (599187 & i26) != 599186)) {
            Long l19 = i24 != 0 ? null : l16;
            Long l24 = i25 == 0 ? l15 : null;
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            int i27 = i26 << 6;
            a1.a(gl1.y.Q(o0VarE, R.string.msg_lifestyle_logging_behavior_details_hint), w1.TopStart, l72.x1.Center, null, 0L, z14, aVar2, z3.f.c(-2082137965, new ak0.j(aVar, list, l19, l24, lVar, 23), o0VarE), o0VarE, (i27 & 29360128) | (3670016 & i27) | 100666752, 50);
            o0VarE.g0(true);
            l18 = l19;
            l17 = l24;
        } else {
            o0VarE.e();
            l17 = l15;
            l18 = l16;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(aVar, list, l18, l17, z14, aVar2, lVar, i14, i15);
        }
    }

    public static final void d(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-748448492);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            b82.n.c(u62.a.a(t62.a.f162797a), gl1.y.Q(o0VarE, R.string.msg_no_data_available), gl1.y.Q(o0VarE, R.string.msg_lifestyle_logging_no_data), null, null, o0VarE, 0, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gq1.a(i14);
        }
    }

    public static final void e(pv0.r rVar, ug2.x xVar, boolean z14, String str, e23.a aVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String lowerCase;
        o0 o0VarE = mVar.E(-127670304);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(rVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(xVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            aw0.a aVar2 = new aw0.a(w2.a0.s(o0VarE));
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            s62.a.f157643a.getClass();
            u4.d dVarA = u62.a.a(t62.a.f162797a);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_no_data_available);
            rVar.getClass();
            int i16 = aw0.a.C0187a.f13320a[rVar.ordinal()];
            l22.b bVar2 = aVar2.f13319a;
            if (i16 == 1) {
                lowerCase = bVar2.getString(R.string.lbl_overnight_stress).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else if (i16 == 2) {
                lowerCase = bVar2.getString(R.string.lbl_lifestyle_logging_overnight_hrv);
            } else if (i16 != 3) {
                u0.r();
                return;
            } else {
                lowerCase = bVar2.getString(R.string.lbl_sleep_score).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            b82.n.d(dVarA, strQ, e5.g(bVar2.a(R.string.msg_current_device_does_not_provide_feature, lowerCase), StringUtils.SPACE, bVar2.getString(R.string.msg_upgrade_device_for_lifestyle_logging_experience)), null, gl1.y.Q(o0VarE, R.string.common_learn_more), xVar, null, null, o0VarE, (i15 << 12) & 458752, 200);
            o0Var = o0VarE;
            eVar.invoke(o0Var, Integer.valueOf((i15 >> 15) & 14));
            if (z14) {
                o0Var.C(-2123569056);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                yv0.b.a(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), str, aVar, o0Var, (i15 >> 6) & 1008);
                o0Var.g0(false);
            } else {
                o0Var.C(-2123361480);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(rVar, xVar, z14, str, aVar, eVar, i14, 6);
        }
    }

    public static final void f(pv0.c cVar, Long l14, Long l15, e23.l lVar, p3.m mVar, int i14) {
        Object next;
        String strJ;
        boolean z14;
        e23.a aVar;
        boolean z15;
        boolean z16;
        e23.a aVar2;
        o0 o0VarE = mVar.E(1040801695);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(l14) ? 32 : 16) | (o0VarE.B(l15) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            aw0.a aVar3 = new aw0.a(w2.a0.s(o0VarE));
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            w13.c cVar2 = pv0.w.T0;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            while (true) {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
                p13.c.b bVar = bVarN;
                if (((pv0.w) next).f141457a == cVar.f141352a) {
                    break;
                } else {
                    bVarN = bVar;
                }
            }
            pv0.w wVar = (pv0.w) next;
            long j8 = cVar.f141352a;
            String strA = aVar3.a(Long.valueOf(j8), cVar.f141353b);
            if ((l14 != null && j8 == l14.longValue()) || (l15 != null && j8 == l15.longValue())) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -516926870, R.string.lbl_highest_impact, o0VarE, false);
            } else {
                o0VarE.C(1155195518);
                o0VarE.g0(false);
                strJ = null;
            }
            if (strA.length() > 0) {
                o0VarE.C(1155255070);
                h4.r.a aVar4 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                if (wVar == null) {
                    o0VarE.C(1155462862);
                    z15 = false;
                    o0VarE.g0(false);
                    aVar = null;
                } else {
                    o0VarE.C(1155462863);
                    boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                    Object objQ2 = o0VarE.q();
                    if (zR || objQ2 == p3.m.a.f135155b) {
                        objQ2 = new cn1.t(b0Var, mcVarF, 9);
                        o0VarE.K(objQ2);
                    }
                    aVar = (e23.a) objQ2;
                    z15 = false;
                    o0VarE.g0(false);
                }
                if (lVar == null) {
                    o0VarE.C(1155550530);
                    o0VarE.g0(z15);
                    z16 = z15;
                    aVar2 = null;
                } else {
                    o0VarE.C(1155550531);
                    boolean zB = o0VarE.B(lVar) | ((i15 & 14) == 4);
                    Object objQ3 = o0VarE.q();
                    if (zB || objQ3 == p3.m.a.f135155b) {
                        objQ3 = new gp.f(9, lVar, cVar);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar5 = (e23.a) objQ3;
                    z16 = false;
                    o0VarE.g0(false);
                    aVar2 = aVar5;
                }
                wv0.f.a(rVarC, strA, strJ, aVar, aVar2, o0VarE, 0);
                o0VarE.g0(z16);
            } else {
                o0VarE.C(1155598147);
                o0VarE.g0(false);
            }
            if (mcVarF.e()) {
                o0VarE.C(1155646445);
                t3 t3Var = (t3) o0VarE.A(t1.f91501s);
                if (wVar != null) {
                    o0VarE.C(1155735632);
                    boolean zR2 = o0VarE.r(t3Var);
                    Object objQ4 = o0VarE.q();
                    if (zR2 || objQ4 == p3.m.a.f135155b) {
                        objQ4 = new ak0.k(t3Var, 2);
                        o0VarE.K(objQ4);
                    }
                    e23.l lVar2 = (e23.l) objQ4;
                    boolean zR3 = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                    Object objQ5 = o0VarE.q();
                    if (zR3 || objQ5 == p3.m.a.f135155b) {
                        objQ5 = new cn1.t(b0Var, mcVarF, 10);
                        o0VarE.K(objQ5);
                    }
                    wv0.w.a(wVar, null, lVar2, (e23.a) objQ5, o0VarE, 0);
                    o0VarE = o0VarE;
                    z14 = false;
                    o0VarE.g0(false);
                } else {
                    z14 = false;
                    o0VarE.C(1156061411);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
            } else {
                o0VarE.C(1156067363);
                o0VarE.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(cVar, l14, l15, lVar, i14, 8);
        }
    }
}
