package cw1;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import l72.g3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import u62.n5;

/* JADX INFO: loaded from: classes10.dex */
public final class q1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56183a;

        static {
            int[] iArr = new int[tw1.k.values().length];
            try {
                iArr[tw1.k.BEGINNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tw1.k.INTERMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56183a = iArr;
        }
    }

    public static final void a(int i14, h4.r rVar, String str, List list, p3.m mVar) {
        p3.o0 o0VarE = mVar.E(1778300845);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97917b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-729793030);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i7.b((u4.d) it.next(), null, x2.q(h4.r.S, d(o0VarE)), ds.e0.d(d92.b.f58623a, o0VarE), o0VarE, 48, 0);
            }
            o0VarE.g0(false);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cw1.a(list, str, rVar, i14, 1);
        }
    }

    public static final void b(final h4.r rVar, final String str, final String str2, final List list, final boolean z14, final boolean z15, final i53.c cVar, i53.c cVar2, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        i53.c cVar3;
        e23.a aVar2;
        p3.o0 o0VarE = mVar.E(422247588);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(list) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarE.h(z15) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(cVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            cVar3 = cVar2;
            i15 |= o0VarE.B(cVar3) ? 8388608 : 4194304;
        } else {
            cVar3 = cVar2;
        }
        if ((100663296 & i14) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            final i53.c cVar4 = cVar3;
            final e23.a aVar3 = aVar2;
            hw1.b.a(null, z14, 0.0f, 0L, null, z3.f.c(-249615460, new e23.q() { // from class: cw1.p1
                /* JADX WARN: Code duplicated, block: B:38:0x0179  */
                /* JADX WARN: Code duplicated, block: B:63:0x0338  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str3;
                    h4.r.a aVar4;
                    j92.e eVar;
                    int i16;
                    boolean z16;
                    i53.c cVar5;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c2.t) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r rVarF = x2.f(rVar, 1.0f);
                        d92.b.f58623a.getClass();
                        long jA = d92.b.a(mVar2).c().a();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        h4.r rVarD = u1.w.d(c2.l.y(l4.k.b(u1.n.e(rVarF, jA, k2.i.a(eVar2.f97918c)), k2.i.a(eVar2.f97918c)), eVar2.f97920e), true, null, null, aVar3, 14);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar5 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar5);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar3 = h5.g.a.f81810g;
                        b4.c(eVar3, zVarA, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, mVar2);
                        c2.b0 b0Var = c2.b0.f22601a;
                        h4.r.a aVar6 = h4.r.S;
                        h4.r rVarF2 = x2.f(aVar6, 1.0f);
                        s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81534l, mVar2, 54);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarF2, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar5);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar3, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, mVar2);
                        u2 u2Var = u2.f22900a;
                        boolean z17 = z14;
                        String str4 = str;
                        if (z17) {
                            mVar2.C(1343205298);
                            str3 = str4 + ". " + gl1.y.Q(mVar2, R.string.selected);
                            mVar2.f();
                        } else {
                            mVar2.C(1343299259);
                            mVar2.f();
                            str3 = str4;
                        }
                        boolean zB = mVar2.B(str3);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new cq.t(str3, 8);
                            mVar2.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new cq.t(str3, 8);
                                mVar2.K(objQ);
                            }
                        }
                        h4.r rVarC3 = p5.v.c((e23.l) objQ, aVar6, false);
                        d92.b.f58624b.getClass();
                        mh.c(str4, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131068);
                        if (z17) {
                            mVar2.C(1343644971);
                            h4.r rVarQ = x2.q(aVar6, q1.d(mVar2));
                            s62.a.f157643a.getClass();
                            i7.b(v62.e1.a(t62.b.f162798a), null, rVarQ, zl.a.a(mVar2), mVar2, 48, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(1343909804);
                            mVar2.f();
                        }
                        mVar2.y();
                        if (z15) {
                            mVar2.C(1368763173);
                            eVar = eVar2;
                            aVar4 = aVar6;
                            i16 = 0;
                            g3.a(0, 0, c2.l.C(aVar4, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(mVar2, R.string.lbl_recommended), mVar2);
                            mVar2.f();
                        } else {
                            aVar4 = aVar6;
                            eVar = eVar2;
                            i16 = 0;
                            mVar2.C(1368941392);
                            mVar2.f();
                        }
                        int i17 = i16;
                        mh.c(str2, c2.l.C(aVar4, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar2), mVar2, 0, 0, 131068);
                        mVar2.C(-1756946060);
                        for (r1 r1Var : list) {
                            h4.r.a aVar7 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            q1.a(i17, c2.l.C(aVar7, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), r1Var.f56186b, r1Var.f56185a, mVar2);
                        }
                        mVar2.f();
                        i53.c cVar6 = cVar;
                        if (cVar6 != null) {
                            z16 = true;
                            if (!cVar6.isEmpty()) {
                                mVar2.C(1369556990);
                                h4.r.a aVar8 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                j92.e eVar4 = j92.b.f97899b;
                                c.f(i17, c2.l.C(aVar8, 0.0f, eVar4.f97918c, eVar4.f97920e, 0.0f, 9), gl1.y.Q(mVar2, R.string.required_list_header), cVar6, mVar2);
                                mVar2.f();
                            }
                            cVar5 = cVar4;
                            if (cVar5 == null && (cVar5.isEmpty() ^ z16) == z16) {
                                mVar2.C(1369914110);
                                h4.r.a aVar9 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                j92.e eVar5 = j92.b.f97899b;
                                c.f(i17, c2.l.C(aVar9, 0.0f, eVar5.f97918c, eVar5.f97920e, 0.0f, 9), gl1.y.Q(mVar2, R.string.optional_list_header), cVar5, mVar2);
                                mVar2.f();
                            } else {
                                mVar2.C(1370208176);
                                mVar2.f();
                            }
                            mVar2.y();
                            x1 x1Var3 = p3.n.f135158a;
                        } else {
                            z16 = true;
                        }
                        mVar2.C(1369851056);
                        mVar2.f();
                        cVar5 = cVar4;
                        if (cVar5 == null) {
                            mVar2.C(1370208176);
                            mVar2.f();
                        } else {
                            mVar2.C(1370208176);
                            mVar2.f();
                        }
                        mVar2.y();
                        x1 x1Var4 = p3.n.f135158a;
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, ((i15 >> 9) & 112) | 196608);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o1(rVar, str, str2, list, z14, z15, cVar, cVar2, aVar, i14);
        }
    }

    public static final void c(h4.r rVar, tw1.k kVar, vt1.o oVar, boolean z14, boolean z15, Integer num, i53.c cVar, i53.c cVar2, e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        h4.r rVar2;
        int i15;
        int i16;
        String strP;
        boolean z16;
        List listA;
        p3.o0 o0VarE = mVar.E(223700863);
        int i17 = i14 | 6;
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.k(kVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.k(oVar == null ? -1 : oVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i17 |= o0VarE.B(num) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i17 |= o0VarE.B(cVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i17 |= o0VarE.B(cVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i17 |= o0VarE.r(aVar) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i17 & 1, (38347923 & i17) != 38347922)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, kVar.f166749c);
            if ((oVar != null ? tw1.k.b.f166750a[oVar.ordinal()] : -1) == 1) {
                i15 = 1371868249;
                i16 = R.string.lbl_cyclists;
            } else {
                i15 = 1371870104;
                i16 = R.string.lbl_runners;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            int i18 = tw1.k.b.f166751b[kVar.ordinal()];
            int i19 = i17;
            if (i18 == 1) {
                o0VarE.C(1371873371);
                strP = gl1.y.P(R.string.coach_difficulty_challenger_description, new Object[]{strJ}, o0VarE);
                o0VarE.g0(false);
            } else {
                if (i18 != 2) {
                    throw kg.f.h(o0VarE, 1371872301, false);
                }
                o0VarE.C(1371876569);
                strP = gl1.y.P(R.string.coach_difficulty_achiever_description, new Object[]{strJ}, o0VarE);
                o0VarE.g0(false);
            }
            String str = strP;
            int i24 = a.f56183a[kVar.ordinal()];
            if (i24 == 1) {
                o0VarE.C(-1440308118);
                q13.b bVarB = p13.w.b();
                s62.a.f157643a.getClass();
                bVarB.add(new r1(p13.w.c(v62.s0.a(t62.b.f162798a)), gl1.y.P(R.string.days_per_week_abbreviation, new Object[]{(num != null ? num.intValue() : 0) < 4 ? "3-4" : "4-5"}, o0VarE)));
                if (oVar == vt1.o.f180175f) {
                    o0VarE.C(-1448521340);
                    bVarB.add(new r1(p13.w.c(n5.a(t62.a.f162797a)), gl1.y.Q(o0VarE, R.string.run_walk_workouts_available)));
                    z16 = false;
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    o0VarE.C(-1448254182);
                    o0VarE.g0(false);
                }
                listA = p13.w.a(bVarB);
                o0VarE.g0(z16);
            } else {
                if (i24 != 2) {
                    throw kg.f.h(o0VarE, 230631627, false);
                }
                o0VarE.C(230656049);
                s62.a.f157643a.getClass();
                listA = p13.w.c(new r1(p13.w.c(v62.s0.a(t62.b.f162798a)), gl1.y.P(R.string.days_per_week_abbreviation, new Object[]{"5-7"}, o0VarE)));
                o0VarE.g0(false);
            }
            int i25 = i19 << 3;
            o0Var = o0VarE;
            b(aVar2, strQ, str, listA, z14, z15, cVar, cVar2, aVar, o0Var, (i19 & 14) | (57344 & i25) | (i25 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024));
            rVar2 = aVar2;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o1(rVar2, kVar, oVar, z14, z15, num, cVar, cVar2, aVar, i14, 0);
        }
    }

    public static final float d(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        float f75992b = ((g6.c) mVar.A(kotlin.t1.f91490h)).getF75992b();
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        float f14 = j92.b.f97901d.f97904c * f75992b;
        g6.f.a aVar = g6.f.f75994b;
        return f14;
    }
}
