package yz1;

import c2.l2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h5.e0;
import i3.e5;
import i3.h1;
import i3.h7;
import i3.i7;
import i3.mh;
import i3.v5;
import kotlin.t1;
import o4.m1;
import o53.f0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f200480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f200481b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200482a;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.VALID_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f200482a = iArr;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f200480a = 6;
        f200481b = 10;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:169:0x0397  */
    /* JADX WARN: Code duplicated, block: B:200:0x0530  */
    /* JADX WARN: Code duplicated, block: B:212:0x058e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final h4.r rVar, final d dVar, final String str, final String str2, final u4.d dVar2, final o4.d0 d0Var, final float f14, final int i14, final o4.d0 d0Var2, final float f15, String str3, e23.a<Unit> aVar, p3.m mVar, final int i15, final int i16) {
        int i17;
        int i18;
        boolean z14;
        long jH;
        boolean z15;
        x0 x0VarB;
        u uVar;
        int i19;
        boolean z16;
        boolean z17;
        int i24;
        boolean z18;
        o0 o0VarE = mVar.E(-114489360);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.B(str2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.B(dVar2) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i17 |= o0VarE.B(d0Var) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i17 |= o0VarE.i(f14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i15) == 0) {
            i17 |= o0VarE.k(i14) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i17 |= o0VarE.B(d0Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i17 |= o0VarE.i(f15) ? 536870912 : 268435456;
        }
        if ((i16 & 6) == 0) {
            i18 = i16 | (o0VarE.B(str3) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= o0VarE.r(aVar) ? 32 : 16;
        }
        int i25 = i18;
        if (o0VarE.n(i17 & 1, ((306783379 & i17) == 306783378 && (i25 & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            if (e.b(dVar)) {
                o0VarE.C(1644889145);
                d92.b.f58623a.getClass();
                jH = d92.b.a(o0VarE).f().d();
                z14 = false;
            } else {
                z14 = false;
                o0VarE.C(-548028245);
                if (d0Var == null) {
                    o0VarE.C(1644890647);
                    jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
                } else {
                    o0VarE.C(1644889655);
                    o0VarE.g0(false);
                    jH = d0Var.f128833a;
                }
            }
            o0VarE.g0(z14);
            if (e.b(dVar)) {
                o0VarE.C(1644892832);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.f(j92.f.f97933j, o0VarE);
                z15 = false;
            } else {
                z15 = false;
                o0VarE.C(1644894078);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
            }
            o0VarE.g0(z15);
            x0 x0Var = x0VarB;
            if (dVar == null || (uVar = dVar.f200298a) == null) {
                uVar = u.LOADING;
            }
            boolean z19 = uVar == u.ERROR;
            y3 y3Var = t1.f91490h;
            float f69051c = ((g6.c) o0VarE.A(y3Var)).getF75992b();
            p3.m.a aVar2 = p3.m.f135153a;
            if (f69051c <= 1.0f || f69051c > 1.5f) {
                aVar = aVar;
                int i26 = i17;
                long j8 = jH;
                o0VarE.C(-545669176);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                e0.a aVar3 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
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
                if (dVar2 != null) {
                    o0VarE.C(-1415625695);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar5 = g6.f.f75994b;
                    i19 = 4;
                    i7.b(dVar2, null, x2.q(c2.l.C(aVar4, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), f14 * f69051c), j8, o0VarE, ((i26 >> 12) & 14) | 48, 0);
                    o0VarE.g0(false);
                } else {
                    i19 = 4;
                    o0VarE.C(-1415280262);
                    o0VarE.g0(false);
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                long j14 = j92.f.f97933j.f157322a.fontSize;
                f0.n(j14);
                long jH2 = f0.H(g6.q.d(j14) * i19, j14 & 1095216660480L);
                f0.n(jH2);
                long jH3 = f0.H(g6.q.d(jH2) / 3, jH2 & 1095216660480L);
                h4.r.a aVar6 = h4.r.S;
                g6.c cVar2 = (g6.c) o0VarE.A(y3Var);
                f0.n(jH3);
                float f16 = 2;
                h4.r rVarA = u2Var.a(x2.t(aVar6, 0.0f, cVar2.H0(f0.H(g6.q.d(jH3) * f16, 1095216660480L & jH3)), 0.0f, 13), 1.0f, true);
                g6.f.a aVar7 = g6.f.f75994b;
                h4.r rVarC2 = c2.l.C(rVarA, 0.0f, f16, 0.0f, 0.0f, 13);
                boolean z24 = (i26 & 7168) == 2048;
                Object objQ = o0VarE.q();
                if (z24) {
                    objQ = new y01.k(str2, 14);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new y01.k(str2, 14);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarC2, false);
                d6.p.f57793b.getClass();
                mh.c(str, rVarC3, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0Var, o0VarE, (i26 >> 6) & 14, 24960, 110588);
                if (i14 == 0 || z19) {
                    str3 = str3;
                    z16 = false;
                    o0VarE.C(-1413762502);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1414412138);
                    boolean z25 = (i25 & 112) == 32;
                    Object objQ2 = o0VarE.q();
                    if (z25) {
                        objQ2 = new yy1.d(aVar, 12);
                        o0VarE.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new yy1.d(aVar, 12);
                            o0VarE.K(objQ2);
                        }
                    }
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(c2.l.C(aVar6, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), f15 * f69051c);
                    str3 = str3;
                    h7.a((e23.a) objQ2, rVarQ, false, null, null, z3.f.c(2065090552, new p(i14, d0Var2, str3, 2), o0VarE), o0VarE, 1572864, 60);
                    z16 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-547644527);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC4 = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                e0.a aVar8 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC4, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r.a aVar9 = h4.r.S;
                h4.r rVarF = x2.f(aVar9, 1.0f);
                s2 s2VarA2 = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarE, 6);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC5 = h4.k.c(rVarF, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                int i27 = i17;
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC5, o0VarE);
                u2 u2Var2 = u2.f22900a;
                if (dVar2 != null) {
                    o0VarE.C(1450908206);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar10 = g6.f.f75994b;
                    z17 = false;
                    i24 = 32;
                    i7.b(dVar2, null, x2.q(c2.l.C(aVar9, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), f14 * f69051c), jH, o0VarE, ((i27 >> 12) & 14) | 48, 0);
                    o0VarE.g0(false);
                } else {
                    z17 = false;
                    i24 = 32;
                    o0VarE.C(1451288359);
                    o0VarE.g0(false);
                }
                if (i14 == 0 || z19) {
                    z18 = true;
                    o0VarE.C(1452085927);
                    o0VarE.g0(z17);
                } else {
                    o0VarE.C(1451378631);
                    boolean z26 = (i25 & 112) == i24 ? true : z17;
                    Object objQ3 = o0VarE.q();
                    if (z26) {
                        objQ3 = new yy1.d(aVar, 11);
                        o0VarE.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new yy1.d(aVar, 11);
                            o0VarE.K(objQ3);
                        }
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar11 = g6.f.f75994b;
                    z18 = true;
                    h7.a((e23.a) objQ3, x2.q(c2.l.C(aVar9, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), f15 * f69051c), false, null, null, z3.f.c(1722843115, new p(i14, d0Var2, str3, 1 == true ? 1 : 0), o0VarE), o0VarE, 1572864, 60);
                    o0VarE.g0(z17);
                }
                o0VarE.g0(z18);
                h4.r rVarF2 = x2.f(aVar9, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC6 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                boolean z27 = (i27 & 7168) == 2048 ? z18 : z17;
                Object objQ4 = o0VarE.q();
                if (z27) {
                    objQ4 = new y01.k(str2, 13);
                    o0VarE.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new y01.k(str2, 13);
                        o0VarE.K(objQ4);
                    }
                }
                mh.c(str, p5.v.c((e23.l) objQ4, rVarC6, z17), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, (i27 >> 6) & 14, 0, 131068);
                o0VarE.g0(z18);
                o0VarE.g0(z17);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            str3 = str3;
            aVar = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final String str4 = str3;
            final e23.a<Unit> aVar12 = aVar;
            p2VarI0.f135219d = new e23.p() { // from class: yz1.v
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iT = p0.t(i15 | 1);
                    int iT2 = p0.t(i16);
                    y.a(rVar, dVar, str, str2, dVar2, d0Var, f14, i14, d0Var2, f15, str4, aVar12, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:150:0x033d  */
    /* JADX WARN: Code duplicated, block: B:163:0x039d  */
    /* JADX WARN: Code duplicated, block: B:92:0x013b  */
    public static final void b(d dVar, u4.d dVar2, o4.d0 d0Var, String str, String str2, String str3, String str4, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        d dVar3;
        int i15;
        e23.a aVar3;
        String str5;
        String str6;
        String str7;
        long jH;
        boolean z14;
        h5.g.a.f fVar;
        p3.c<?> cVar;
        h5.g.a.b bVar;
        e0.a aVar4;
        boolean z15;
        h4.g.a aVar5;
        o0 o0VarE = mVar.E(849201659);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            dVar3 = dVar;
            i15 = (o0VarE.B(dVar3) ? 4 : 2) | i14;
        } else {
            dVar3 = dVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(d0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str3) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(str4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 38347923) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            if (e.b(dVar3)) {
                o0VarE.C(39019940);
                d92.b.f58623a.getClass();
                jH = d92.b.a(o0VarE).f().d();
            } else {
                o0VarE.C(1209633952);
                if (d0Var == null) {
                    o0VarE.C(39021442);
                    jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
                } else {
                    o0VarE.C(39020450);
                    o0VarE.g0(false);
                    jH = d0Var.f128833a;
                }
            }
            o0VarE.g0(false);
            h4.r.a aVar6 = h4.r.S;
            h4.r rVarD = x2.d(aVar6, 1.0f);
            boolean z16 = aVar2 != null;
            boolean z17 = (i16 & 234881024) == 67108864;
            Object objQ = o0VarE.q();
            p3.m.a aVar7 = p3.m.f135153a;
            if (z17) {
                objQ = new xx1.d(aVar2, 5);
                o0VarE.K(objQ);
            } else {
                aVar7.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xx1.d(aVar2, 5);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarA = wz1.i.a((e23.l) objQ, rVarD, z16);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97922g;
            float f15 = eVar.f97917b;
            bVar2.getClass();
            float f16 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarC = c2.l.C(rVarA, f16, f14, eVar.f97920e, 0.0f, 8);
            c2.j jVar = c2.j.f22691a;
            bVar2.getClass();
            float f17 = eVar.f97920e;
            h4.d.f81522a.getClass();
            h4.g.b bVar3 = h4.d.a.f81533k;
            jVar.getClass();
            c2.j.i iVarK = c2.j.k(f17, bVar3);
            h4.g.a aVar8 = h4.d.a.f81537o;
            c2.z zVarA = c2.y.a(iVarK, aVar8, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar9 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar9);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (m(dVar3)) {
                o0VarE.C(-1291409890);
                if (dVar2 != null) {
                    o0VarE.C(-1291432613);
                    cVar = cVar2;
                    aVar4 = aVar9;
                    fVar = fVar2;
                    aVar5 = aVar8;
                    bVar = bVar4;
                    z15 = false;
                    g02.i.a(null, dVar2, jH, d92.b.a(o0VarE).c().g(), wz1.b.f188181a, 0.0f, null, o0VarE, (i16 & 112) | 24576, 225);
                    o0VarE.g0(false);
                } else {
                    fVar = fVar2;
                    cVar = cVar2;
                    bVar = bVar4;
                    aVar4 = aVar9;
                    z15 = false;
                    aVar5 = aVar8;
                    o0VarE.C(-1291184675);
                    o0VarE.g0(false);
                }
                bVar2.getClass();
                c2.z zVarA2 = c2.y.a(c2.j.k(r24, bVar3), aVar5, o0VarE, 48);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(aVar6, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                h4.r rVarX = x2.x(aVar6, null, 3);
                boolean z18 = (i16 & 57344) == 16384 ? true : z15;
                Object objQ2 = o0VarE.q();
                if (z18) {
                    str5 = str2;
                    objQ2 = new y01.k(str5, 15);
                    o0VarE.K(objQ2);
                } else {
                    aVar7.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        str5 = str2;
                        objQ2 = new y01.k(str5, 15);
                        o0VarE.K(objQ2);
                    } else {
                        str5 = str2;
                    }
                }
                h4.r rVarC4 = p5.v.c((e23.l) objQ2, rVarX, z15);
                d6.h.f57752b.getClass();
                int i17 = d6.h.f57755e;
                d6.h hVarA = d6.h.a(i17);
                j92.f fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0Var = j92.f.f97933j;
                g02.c.a(str, rVarC4, 0L, hVarA, 0, false, 0, d92.c.b(x0Var, o0VarE), 0.0d, o0VarE, (i16 >> 9) & 14, 372);
                String str8 = str3 == null ? "" : str3;
                h4.r rVarX2 = x2.x(aVar6, null, 3);
                boolean z19 = (i16 & 458752) == 131072 ? true : z15;
                Object objQ3 = o0VarE.q();
                if (z19) {
                    str6 = str3;
                    objQ3 = new y01.k(str6, 16);
                    o0VarE.K(objQ3);
                } else {
                    aVar7.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        str6 = str3;
                        objQ3 = new y01.k(str6, 16);
                        o0VarE.K(objQ3);
                    } else {
                        str6 = str3;
                    }
                }
                h4.r rVarC5 = p5.v.c((e23.l) objQ3, rVarX2, z15);
                d6.h hVarA2 = d6.h.a(i17);
                fVar3.getClass();
                g02.c.a(str8, rVarC5, 0L, hVarA2, 0, false, 0, d92.c.f(x0Var, o0VarE), 0.0d, o0VarE, 0, 372);
                if (str4 != null) {
                    o0VarE.C(165636514);
                    m1.a aVar10 = m1.f128891a;
                    bVar2.getClass();
                    l2 l2VarE = c2.l.e(0.0f, f15, 0.0f, 0.0f, 13);
                    boolean z24 = (i16 & 29360128) == 8388608 ? true : z15;
                    Object objQ4 = o0VarE.q();
                    if (z24) {
                        aVar3 = aVar;
                        objQ4 = new yy1.d(aVar3, 13);
                        o0VarE.K(objQ4);
                    } else {
                        aVar7.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            aVar3 = aVar;
                            objQ4 = new yy1.d(aVar3, 13);
                            o0VarE.K(objQ4);
                        } else {
                            aVar3 = aVar;
                        }
                    }
                    str7 = str4;
                    h1.c((e23.a) objQ4, null, false, aVar10, null, null, l2VarE, null, z3.f.c(-217202820, new j21.p(str7, 29), o0VarE), o0VarE, 805309440, 374);
                    o0VarE.g0(z15);
                } else {
                    str7 = str4;
                    aVar3 = aVar;
                    o0VarE.C(166342446);
                    o0VarE.g0(z15);
                }
                z14 = true;
                o0VarE.g0(true);
                o0VarE.g0(z15);
            } else {
                aVar3 = aVar;
                str5 = str2;
                str6 = str3;
                str7 = str4;
                z14 = true;
                o0VarE.C(-1289350467);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            aVar3 = aVar;
            str5 = str2;
            str6 = str3;
            str7 = str4;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(dVar, dVar2, d0Var, str, str5, str6, str7, aVar3, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:164:0x0202  */
    /* JADX WARN: Code duplicated, block: B:166:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x0208  */
    /* JADX WARN: Code duplicated, block: B:169:0x020d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0219  */
    /* JADX WARN: Code duplicated, block: B:177:0x0221  */
    /* JADX WARN: Code duplicated, block: B:178:0x0228  */
    /* JADX WARN: Code duplicated, block: B:180:0x0230  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:186:0x0240  */
    /* JADX WARN: Code duplicated, block: B:187:0x0245  */
    /* JADX WARN: Code duplicated, block: B:189:0x024b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0251  */
    /* JADX WARN: Code duplicated, block: B:195:0x0259  */
    /* JADX WARN: Code duplicated, block: B:196:0x025e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0264  */
    /* JADX WARN: Code duplicated, block: B:200:0x026a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0281  */
    /* JADX WARN: Code duplicated, block: B:211:0x028a  */
    /* JADX WARN: Code duplicated, block: B:232:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:234:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:236:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:239:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:241:0x0301  */
    /* JADX WARN: Code duplicated, block: B:244:0x0306  */
    /* JADX WARN: Code duplicated, block: B:247:0x0322  */
    /* JADX WARN: Code duplicated, block: B:248:0x0333  */
    /* JADX WARN: Code duplicated, block: B:250:0x0337  */
    /* JADX WARN: Code duplicated, block: B:251:0x0339  */
    /* JADX WARN: Code duplicated, block: B:254:0x033f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0356  */
    /* JADX WARN: Code duplicated, block: B:257:0x035a  */
    /* JADX WARN: Code duplicated, block: B:258:0x035d  */
    /* JADX WARN: Code duplicated, block: B:261:0x0363  */
    /* JADX WARN: Code duplicated, block: B:263:0x0370  */
    /* JADX WARN: Code duplicated, block: B:265:0x037d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0383  */
    /* JADX WARN: Code duplicated, block: B:268:0x038b  */
    /* JADX WARN: Code duplicated, block: B:271:0x0391  */
    /* JADX WARN: Code duplicated, block: B:273:0x039e  */
    /* JADX WARN: Code duplicated, block: B:275:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:277:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:278:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:280:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:281:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:283:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:284:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:287:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:289:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:292:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:295:0x044a  */
    /* JADX WARN: Code duplicated, block: B:297:0x0453  */
    /* JADX WARN: Code duplicated, block: B:298:0x0457  */
    /* JADX WARN: Code duplicated, block: B:301:0x046c  */
    /* JADX WARN: Code duplicated, block: B:304:0x047d  */
    /* JADX WARN: Code duplicated, block: B:308:0x048b  */
    /* JADX WARN: Code duplicated, block: B:310:0x048f  */
    /* JADX WARN: Code duplicated, block: B:313:0x0495  */
    /* JADX WARN: Code duplicated, block: B:314:0x0497  */
    /* JADX WARN: Code duplicated, block: B:317:0x049f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:318:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:326:0x0553  */
    /* JADX WARN: Code duplicated, block: B:327:0x0555  */
    /* JADX WARN: Code duplicated, block: B:330:0x055c  */
    /* JADX WARN: Code duplicated, block: B:332:0x0563  */
    /* JADX WARN: Code duplicated, block: B:335:0x0589  */
    /* JADX WARN: Code duplicated, block: B:336:0x0593  */
    /* JADX WARN: Code duplicated, block: B:339:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:341:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:342:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:345:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:347:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:350:0x0666  */
    /* JADX WARN: Code duplicated, block: B:352:0x066f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0673  */
    /* JADX WARN: Code duplicated, block: B:356:0x0680  */
    /* JADX WARN: Code duplicated, block: B:358:0x068e  */
    /* JADX WARN: Code duplicated, block: B:361:0x069a  */
    /* JADX WARN: Code duplicated, block: B:363:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:364:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:367:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:370:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:372:0x0700  */
    /* JADX WARN: Code duplicated, block: B:374:0x0706  */
    /* JADX WARN: Code duplicated, block: B:376:0x070c  */
    /* JADX WARN: Code duplicated, block: B:379:0x0730  */
    /* JADX WARN: Code duplicated, block: B:381:? A[RETURN, SYNTHETIC] */
    public static final void c(final h4.r rVar, final d dVar, final String str, String str2, final u4.d dVar2, o4.d0 d0Var, float f14, int i14, o4.d0 d0Var2, float f15, String str3, h4.r rVar2, h4.r rVar3, e23.a<Unit> aVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.a<Unit> aVar2, z zVar, String str4, String str5, e23.a<Unit> aVar3, p3.m mVar, final int i15, final int i16, final int i17) {
        int i18;
        String str6;
        String str7;
        o4.d0 d0Var3;
        float f16;
        int i19;
        final o4.d0 d0VarA;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int iOrdinal;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean z14;
        o0 o0Var;
        final float f17;
        final h4.r rVar4;
        final e23.a<Unit> aVar4;
        final z zVar2;
        final String str8;
        final String str9;
        final e23.a<Unit> aVar5;
        final o4.d0 d0Var4;
        final float f18;
        final int i39;
        final String str10;
        final String str11;
        final h4.r rVar5;
        final e23.a<Unit> aVar6;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        p2 p2VarI0;
        int i44;
        p3.m.a aVar7;
        float f19;
        String str12;
        h4.r rVarY;
        h4.r rVar6;
        float f22;
        e23.a<Unit> aVar8;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        e23.a<Unit> aVar9;
        e23.a<Unit> aVar10;
        String str13;
        String str14;
        e23.a<Unit> aVar11;
        String str15;
        e23.a<Unit> aVar12;
        Object objQ;
        Object objQ2;
        Object objQ3;
        e23.a<Unit> aVar13;
        j92.b bVar;
        j92.e eVar;
        o4.d0 d0Var5;
        h4.g gVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        o4.d0 d0Var6;
        e0.a aVar14;
        float f24;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        String str16;
        int i45;
        h5.g.a.f fVar;
        u uVar;
        boolean z15;
        e23.a<Unit> aVar15;
        String str17;
        h4.r.a aVar16;
        boolean z16;
        boolean z17;
        Object objQ4;
        h4.r rVarY2;
        e23.a<Unit> aVar17;
        c2.z zVarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        o4.d0 d0Var7;
        z0 z0VarD2;
        int iHashCode3;
        i2 i2VarA2;
        h4.r rVarC3;
        boolean z18;
        boolean z19;
        int i46;
        int i47;
        str.getClass();
        o0 o0VarE = mVar.E(1227913325);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i15 & 6) == 0) {
            i18 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            str6 = str;
            i18 |= o0VarE.B(str6) ? 256 : 128;
        } else {
            str6 = str;
        }
        if ((i15 & 3072) == 0) {
            if ((i17 & 8) == 0) {
                str7 = str2;
                if (o0VarE.B(str7)) {
                    i47 = 2048;
                }
                i18 |= i47;
            } else {
                str7 = str2;
            }
            i47 = 1024;
            i18 |= i47;
        } else {
            str7 = str2;
        }
        if ((i15 & 24576) == 0) {
            i18 |= o0VarE.B(dVar2) ? 16384 : 8192;
        }
        int i48 = i17 & 32;
        if (i48 != 0) {
            i18 |= 196608;
            d0Var3 = d0Var;
        } else {
            d0Var3 = d0Var;
            if ((i15 & 196608) == 0) {
                i18 |= o0VarE.B(d0Var3) ? 131072 : 65536;
            }
        }
        int i49 = i15 & 1572864;
        int i54 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (i49 == 0) {
            f16 = f14;
            i18 |= ((i17 & 64) == 0 && o0VarE.i(f16)) ? 1048576 : 524288;
        } else {
            f16 = f14;
        }
        int i55 = i17 & 128;
        if (i55 != 0) {
            i18 |= 12582912;
            i19 = i14;
        } else {
            i19 = i14;
            if ((i15 & 12582912) == 0) {
                i18 |= o0VarE.k(i19) ? 8388608 : 4194304;
            }
        }
        if ((i15 & 100663296) == 0) {
            i24 = 131072;
            if ((i17 & 256) == 0) {
                d0VarA = d0Var2;
                if (o0VarE.B(d0VarA)) {
                    i46 = 67108864;
                }
                i18 |= i46;
            } else {
                d0VarA = d0Var2;
            }
            i46 = 33554432;
            i18 |= i46;
        } else {
            d0VarA = d0Var2;
            i24 = 131072;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i18 |= ((i17 & 512) == 0 && o0VarE.i(f15)) ? 536870912 : 268435456;
        }
        int i56 = i17 & 1024;
        if (i56 != 0) {
            i25 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            i25 = i16 | (o0VarE.B(str3) ? 4 : 2);
        } else {
            i25 = i16;
        }
        if ((i16 & 48) == 0) {
            i25 |= ((i17 & 2048) == 0 && o0VarE.B(rVar2)) ? 32 : 16;
        }
        int i57 = i25;
        int i58 = i17 & 4096;
        if (i58 != 0) {
            i26 = i57 | 384;
        } else {
            int i59 = i57;
            if ((i16 & 384) == 0) {
                i59 |= o0VarE.B(rVar3) ? 256 : 128;
            }
            i26 = i59;
        }
        int i64 = i17 & 8192;
        if (i64 != 0) {
            i27 = i26 | 3072;
        } else {
            int i65 = i26;
            if ((i16 & 3072) == 0) {
                i27 = i65 | (o0VarE.r(aVar) ? 2048 : 1024);
            } else {
                i27 = i65;
            }
        }
        int i66 = i17 & 16384;
        if (i66 == 0) {
            i28 = i27;
            if ((i16 & 24576) == 0) {
                i28 |= o0VarE.r(pVar) ? 16384 : 8192;
            }
            i29 = i17 & 32768;
            if (i29 != 0) {
                i28 |= 196608;
            } else if ((i16 & 196608) == 0) {
                if (o0VarE.r(aVar2)) {
                    i30 = i24;
                } else {
                    i30 = 65536;
                }
                i28 |= i30;
            }
            i34 = i17 & 65536;
            if (i34 != 0) {
                i28 |= 1572864;
            } else if ((i16 & 1572864) == 0) {
                if (zVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = zVar.ordinal();
                }
                if (!o0VarE.k(iOrdinal)) {
                    i54 = 524288;
                }
                i28 |= i54;
            }
            i35 = i17 & i24;
            if (i35 != 0) {
                i28 |= 12582912;
                i36 = i35;
            } else {
                i36 = i35;
                if ((i16 & 12582912) == 0) {
                    i28 |= o0VarE.B(str4) ? 8388608 : 4194304;
                }
            }
            i37 = i17 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
            if (i37 != 0) {
                i28 |= 100663296;
            } else if ((i16 & 100663296) == 0) {
                i28 |= o0VarE.B(str5) ? 67108864 : 33554432;
            }
            i38 = i17 & 524288;
            if (i38 != 0) {
                i28 |= C.ENCODING_PCM_32BIT;
            } else if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
                i28 |= o0VarE.r(aVar3) ? 536870912 : 268435456;
            }
            if ((i18 & 306783379) == 306783378 || (i28 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                o0VarE.G0();
                i44 = i15 & 1;
                aVar7 = p3.m.f135153a;
                if (i44 != 0 || o0VarE.o0()) {
                    if ((i17 & 8) != 0) {
                        i18 &= -7169;
                        str7 = str6;
                    }
                    if (i48 != 0) {
                        d0Var3 = null;
                    }
                    if ((i17 & 64) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i18 &= -3670017;
                        f16 = j92.b.f97901d.f97904c;
                    }
                    if (i55 != 0) {
                        i19 = 0;
                    }
                    if ((i17 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        i18 &= -234881025;
                        d0VarA = o4.d0.a(d92.b.a(o0VarE).f().a());
                    }
                    if ((i17 & 512) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f19 = j92.b.f97901d.f97904c;
                        i18 &= -1879048193;
                    } else {
                        f19 = f15;
                    }
                    if (i56 != 0) {
                        str12 = null;
                    } else {
                        str12 = str3;
                    }
                    if ((i17 & 2048) != 0) {
                        h4.r.a aVar18 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        rVarY = c2.l.y(aVar18, j92.b.f97899b.f97920e);
                        i28 &= -113;
                    } else {
                        rVarY = rVar2;
                    }
                    if (i58 != 0) {
                        rVar6 = h4.r.S;
                    } else {
                        rVar6 = rVar3;
                    }
                    f22 = f19;
                    if (i64 != 0) {
                        objQ3 = o0VarE.q();
                        aVar7.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new yx2.b(12);
                            o0VarE.K(objQ3);
                        }
                        aVar8 = (e23.a) objQ3;
                    } else {
                        aVar8 = aVar;
                    }
                    if (i66 != 0) {
                        b.f200243a.getClass();
                        pVar3 = b.f200244b;
                    } else {
                        pVar3 = pVar;
                    }
                    aVar9 = aVar8;
                    if (i29 != 0) {
                        objQ2 = o0VarE.q();
                        aVar7.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new yx2.b(13);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar2;
                    }
                    if (i34 != 0) {
                        zVar2 = z.VALID_DATA;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i36 != 0) {
                        str13 = null;
                    } else {
                        str13 = str4;
                    }
                    if (i37 != 0) {
                        str14 = null;
                    } else {
                        str14 = str5;
                    }
                    e23.a<Unit> aVar19 = aVar10;
                    if (i38 != 0) {
                        objQ = o0VarE.q();
                        aVar7.getClass();
                        z zVar3 = zVar2;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new yx2.b(14);
                            o0VarE.K(objQ);
                        }
                        zVar2 = zVar3;
                        aVar11 = (e23.a) objQ;
                    } else {
                        aVar11 = aVar3;
                    }
                    str15 = str13;
                    aVar12 = aVar19;
                } else {
                    o0VarE.e();
                    if ((i17 & 8) != 0) {
                        i18 &= -7169;
                    }
                    if ((i17 & 64) != 0) {
                        i18 &= -3670017;
                    }
                    if ((i17 & 256) != 0) {
                        i18 &= -234881025;
                    }
                    if ((i17 & 512) != 0) {
                        i18 &= -1879048193;
                    }
                    if ((i17 & 2048) != 0) {
                        i28 &= -113;
                    }
                    f22 = f15;
                    str12 = str3;
                    rVarY = rVar2;
                    rVar6 = rVar3;
                    pVar3 = pVar;
                    aVar12 = aVar2;
                    zVar2 = zVar;
                    str14 = str5;
                    aVar11 = aVar3;
                    i18 = i18;
                    i28 = i28;
                    aVar9 = aVar;
                    str15 = str4;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                aVar13 = aVar9;
                long jA = am.j.A(d92.b.f58623a, o0VarE);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                d0Var5 = d0VarA;
                h4.r rVarE = u1.n.e(rVar, jA, k2.i.a(eVar.f97918c));
                h4.d.f81522a.getClass();
                gVar = h4.d.a.f81524b;
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarE, o0VarE);
                h5.g.V.getClass();
                d0Var6 = d0Var3;
                aVar14 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                f24 = f16;
                if (o0VarE.T) {
                    o0VarE.M(aVar14);
                } else {
                    o0VarE.c();
                }
                eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                str16 = str12;
                if (o0VarE.T) {
                    i45 = i19;
                } else {
                    i45 = i19;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u uVar2 = c2.u.f22885a;
                    if (dVar != null || (uVar = dVar.f200298a) == null) {
                        uVar = u.LOADING;
                    }
                    if (uVar == u.ERROR) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (zVar2 != z.VALID_DATA || z15) {
                        o0Var = o0VarE;
                        aVar15 = aVar12;
                        str17 = str15;
                        e23.a<Unit> aVar20 = aVar11;
                        zVar2 = zVar2;
                        o0Var.C(-433476686);
                        aVar16 = h4.r.S;
                        h4.r rVarD = x2.d(aVar16, 1.0f);
                        z16 = z15;
                        if ((i28 & 458752) == i24) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objQ4 = o0Var.q();
                        if (z17) {
                            objQ4 = new yy1.d(aVar15, 15);
                            o0Var.K(objQ4);
                        } else {
                            aVar7.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new yy1.d(aVar15, 15);
                                o0Var.K(objQ4);
                            }
                        }
                        h4.r rVarD2 = u1.w.d(rVarD, false, null, null, (e23.a) objQ4, 15);
                        if (z16) {
                            bVar.getClass();
                            rVarY2 = c2.l.y(aVar16, eVar.f97918c);
                        } else {
                            rVarY2 = rVarY;
                        }
                        h4.r rVarThen = rVarD2.then(rVarY2);
                        c2.j.f22691a.getClass();
                        aVar11 = aVar20;
                        aVar17 = aVar15;
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var, 0);
                        iHashCode2 = Long.hashCode(o0Var.U);
                        i2VarA1 = o0Var.a0();
                        rVarC2 = h4.k.c(rVarThen, o0Var);
                        if (cVar == null) {
                            p0.l();
                            throw null;
                        }
                        o0Var.z();
                        String str18 = str7;
                        if (o0Var.T) {
                            o0Var.M(aVar14);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar2, zVarA, o0Var);
                        b4.c(c1623g, i2VarA1, o0Var);
                        if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                        }
                        b4.c(fVar, rVarC2, o0Var);
                        c2.b0 b0Var = c2.b0.f22601a;
                        float f25 = f22;
                        a(x2.x(aVar16, null, 3).then(rVar6), dVar, str, str18, dVar2, d0Var6, f24, i45, d0Var5, f25, str16, aVar13, o0Var, i18 & 2147483632, (i28 & 14) | ((i28 >> 6) & 112));
                        str7 = str18;
                        d0Var7 = d0Var5;
                        f22 = f25;
                        str16 = str16;
                        aVar13 = aVar13;
                        bVar.getClass();
                        h4.r rVarC4 = c2.l.C(aVar16, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                        d0Var6 = d0Var6;
                        z0VarD2 = c2.q.d(gVar, false);
                        rVar6 = rVar6;
                        iHashCode3 = Long.hashCode(o0Var.U);
                        i2VarA2 = o0Var.a0();
                        rVarC3 = h4.k.c(rVarC4, o0Var);
                        if (cVar == null) {
                            p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            f24 = f24;
                            o0Var.M(aVar14);
                        } else {
                            f24 = f24;
                            o0Var.c();
                        }
                        b4.c(eVar2, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA2, o0Var);
                        if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                            v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                        }
                        b4.c(fVar, rVarC3, o0Var);
                        if (m(dVar)) {
                            o0Var.C(-1280712427);
                            if (z16) {
                                o0Var.C(-1280676622);
                                e(x2.d(aVar16, 1.0f), o0Var, 6);
                                z18 = false;
                                o0Var.g0(false);
                            } else {
                                z18 = false;
                                o0Var.C(-1280547941);
                                e5.q((i28 >> 12) & 14, pVar3, o0Var, false);
                            }
                            o0Var.g0(z18);
                        } else {
                            z18 = false;
                            o0Var.C(-1280441425);
                            o0Var.g0(false);
                        }
                        z19 = true;
                        e5.u(o0Var, true, true, z18);
                    } else {
                        if (zVar2 == z.EMPTY) {
                            o0VarE.C(-433424726);
                            int i67 = i18 >> 9;
                            int i68 = ((i18 >> 3) & 14) | (i67 & 112) | (i67 & 896);
                            int i69 = i18 << 3;
                            int i74 = i68 | (i69 & 7168) | (i69 & 57344);
                            int i75 = i28 >> 6;
                            e23.a<Unit> aVar21 = aVar12;
                            String str19 = str15;
                            e23.a<Unit> aVar22 = aVar11;
                            b(dVar, dVar2, d0Var6, str, str7, str19, str14, aVar22, aVar21, o0VarE, i74 | (i75 & 458752) | (3670016 & i75) | (i75 & 29360128) | (234881024 & (i28 << 9)));
                            str17 = str19;
                            o0Var = o0VarE;
                            o0Var.g0(false);
                            aVar17 = aVar21;
                            aVar11 = aVar22;
                        } else {
                            o0Var = o0VarE;
                            e23.a<Unit> aVar23 = aVar12;
                            str17 = str15;
                            o0Var.C(-550913541);
                            o0Var.g0(false);
                            aVar17 = aVar23;
                        }
                        z19 = true;
                        d0Var7 = d0Var5;
                    }
                    o0Var.g0(z19);
                    d0Var4 = d0Var6;
                    f18 = f24;
                    rVar5 = rVarY;
                    d0VarA = d0Var7;
                    f17 = f22;
                    str10 = str7;
                    aVar5 = aVar11;
                    str11 = str16;
                    rVar4 = rVar6;
                    i39 = i45;
                    aVar6 = aVar13;
                    pVar2 = pVar3;
                    str9 = str14;
                    str8 = str17;
                    aVar4 = aVar17;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar3 = c2.u.f22885a;
                if (dVar != null) {
                    uVar = u.LOADING;
                } else {
                    uVar = u.LOADING;
                }
                if (uVar == u.ERROR) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (zVar2 != z.VALID_DATA) {
                    o0Var = o0VarE;
                    aVar15 = aVar12;
                    str17 = str15;
                    e23.a<Unit> aVar24 = aVar11;
                    zVar2 = zVar2;
                    o0Var.C(-433476686);
                    aVar16 = h4.r.S;
                    h4.r rVarD3 = x2.d(aVar16, 1.0f);
                    z16 = z15;
                    if ((i28 & 458752) == i24) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objQ4 = o0Var.q();
                    if (z17) {
                        aVar7.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new yy1.d(aVar15, 15);
                            o0Var.K(objQ4);
                        }
                    } else {
                        objQ4 = new yy1.d(aVar15, 15);
                        o0Var.K(objQ4);
                    }
                    h4.r rVarD4 = u1.w.d(rVarD3, false, null, null, (e23.a) objQ4, 15);
                    if (z16) {
                        bVar.getClass();
                        rVarY2 = c2.l.y(aVar16, eVar.f97918c);
                    } else {
                        rVarY2 = rVarY;
                    }
                    h4.r rVarThen2 = rVarD4.then(rVarY2);
                    c2.j.f22691a.getClass();
                    aVar11 = aVar24;
                    aVar17 = aVar15;
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var, 0);
                    iHashCode2 = Long.hashCode(o0Var.U);
                    i2VarA1 = o0Var.a0();
                    rVarC2 = h4.k.c(rVarThen2, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    String str110 = str7;
                    if (o0Var.T) {
                        o0Var.M(aVar14);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar2, zVarA, o0Var);
                    b4.c(c1623g, i2VarA1, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                    } else {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0Var);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    float f26 = f22;
                    a(x2.x(aVar16, null, 3).then(rVar6), dVar, str, str110, dVar2, d0Var6, f24, i45, d0Var5, f26, str16, aVar13, o0Var, i18 & 2147483632, (i28 & 14) | ((i28 >> 6) & 112));
                    str7 = str110;
                    d0Var7 = d0Var5;
                    f22 = f26;
                    str16 = str16;
                    aVar13 = aVar13;
                    bVar.getClass();
                    h4.r rVarC5 = c2.l.C(aVar16, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    d0Var6 = d0Var6;
                    z0VarD2 = c2.q.d(gVar, false);
                    rVar6 = rVar6;
                    iHashCode3 = Long.hashCode(o0Var.U);
                    i2VarA2 = o0Var.a0();
                    rVarC3 = h4.k.c(rVarC5, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        f24 = f24;
                        o0Var.M(aVar14);
                    } else {
                        f24 = f24;
                        o0Var.c();
                    }
                    b4.c(eVar2, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA2, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                    } else {
                        v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, o0Var);
                    if (m(dVar)) {
                        o0Var.C(-1280712427);
                        if (z16) {
                            o0Var.C(-1280676622);
                            e(x2.d(aVar16, 1.0f), o0Var, 6);
                            z18 = false;
                            o0Var.g0(false);
                        } else {
                            z18 = false;
                            o0Var.C(-1280547941);
                            e5.q((i28 >> 12) & 14, pVar3, o0Var, false);
                        }
                        o0Var.g0(z18);
                    } else {
                        z18 = false;
                        o0Var.C(-1280441425);
                        o0Var.g0(false);
                    }
                    z19 = true;
                    e5.u(o0Var, true, true, z18);
                } else {
                    o0Var = o0VarE;
                    aVar15 = aVar12;
                    str17 = str15;
                    e23.a<Unit> aVar25 = aVar11;
                    zVar2 = zVar2;
                    o0Var.C(-433476686);
                    aVar16 = h4.r.S;
                    h4.r rVarD5 = x2.d(aVar16, 1.0f);
                    z16 = z15;
                    if ((i28 & 458752) == i24) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objQ4 = o0Var.q();
                    if (z17) {
                        aVar7.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new yy1.d(aVar15, 15);
                            o0Var.K(objQ4);
                        }
                    } else {
                        objQ4 = new yy1.d(aVar15, 15);
                        o0Var.K(objQ4);
                    }
                    h4.r rVarD6 = u1.w.d(rVarD5, false, null, null, (e23.a) objQ4, 15);
                    if (z16) {
                        bVar.getClass();
                        rVarY2 = c2.l.y(aVar16, eVar.f97918c);
                    } else {
                        rVarY2 = rVarY;
                    }
                    h4.r rVarThen3 = rVarD6.then(rVarY2);
                    c2.j.f22691a.getClass();
                    aVar11 = aVar25;
                    aVar17 = aVar15;
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var, 0);
                    iHashCode2 = Long.hashCode(o0Var.U);
                    i2VarA1 = o0Var.a0();
                    rVarC2 = h4.k.c(rVarThen3, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    String str111 = str7;
                    if (o0Var.T) {
                        o0Var.M(aVar14);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar2, zVarA, o0Var);
                    b4.c(c1623g, i2VarA1, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                    } else {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0Var);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    float f27 = f22;
                    a(x2.x(aVar16, null, 3).then(rVar6), dVar, str, str111, dVar2, d0Var6, f24, i45, d0Var5, f27, str16, aVar13, o0Var, i18 & 2147483632, (i28 & 14) | ((i28 >> 6) & 112));
                    str7 = str111;
                    d0Var7 = d0Var5;
                    f22 = f27;
                    str16 = str16;
                    aVar13 = aVar13;
                    bVar.getClass();
                    h4.r rVarC6 = c2.l.C(aVar16, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    d0Var6 = d0Var6;
                    z0VarD2 = c2.q.d(gVar, false);
                    rVar6 = rVar6;
                    iHashCode3 = Long.hashCode(o0Var.U);
                    i2VarA2 = o0Var.a0();
                    rVarC3 = h4.k.c(rVarC6, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        f24 = f24;
                        o0Var.M(aVar14);
                    } else {
                        f24 = f24;
                        o0Var.c();
                    }
                    b4.c(eVar2, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA2, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                    } else {
                        v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, o0Var);
                    if (m(dVar)) {
                        o0Var.C(-1280712427);
                        if (z16) {
                            o0Var.C(-1280676622);
                            e(x2.d(aVar16, 1.0f), o0Var, 6);
                            z18 = false;
                            o0Var.g0(false);
                        } else {
                            z18 = false;
                            o0Var.C(-1280547941);
                            e5.q((i28 >> 12) & 14, pVar3, o0Var, false);
                        }
                        o0Var.g0(z18);
                    } else {
                        z18 = false;
                        o0Var.C(-1280441425);
                        o0Var.g0(false);
                    }
                    z19 = true;
                    e5.u(o0Var, true, true, z18);
                }
                o0Var.g0(z19);
                d0Var4 = d0Var6;
                f18 = f24;
                rVar5 = rVarY;
                d0VarA = d0Var7;
                f17 = f22;
                str10 = str7;
                aVar5 = aVar11;
                str11 = str16;
                rVar4 = rVar6;
                i39 = i45;
                aVar6 = aVar13;
                pVar2 = pVar3;
                str9 = str14;
                str8 = str17;
                aVar4 = aVar17;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f17 = f15;
                rVar4 = rVar3;
                aVar4 = aVar2;
                zVar2 = zVar;
                str8 = str4;
                str9 = str5;
                aVar5 = aVar3;
                d0Var4 = d0Var3;
                f18 = f16;
                i39 = i19;
                str10 = str7;
                str11 = str3;
                rVar5 = rVar2;
                aVar6 = aVar;
                pVar2 = pVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: yz1.w
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i15 | 1);
                        int iT2 = p0.t(i16);
                        y.c(rVar, dVar, str, str10, dVar2, d0Var4, f18, i39, d0VarA, f17, str11, rVar5, rVar4, aVar6, pVar2, aVar4, zVar2, str8, str9, aVar5, (p3.m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i28 = i27 | 24576;
        i29 = i17 & 32768;
        if (i29 != 0) {
            i28 |= 196608;
        } else if ((i16 & 196608) == 0) {
            if (o0VarE.r(aVar2)) {
                i30 = i24;
            } else {
                i30 = 65536;
            }
            i28 |= i30;
        }
        i34 = i17 & 65536;
        if (i34 != 0) {
            i28 |= 1572864;
        } else if ((i16 & 1572864) == 0) {
            if (zVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = zVar.ordinal();
            }
            if (!o0VarE.k(iOrdinal)) {
                i54 = 524288;
            }
            i28 |= i54;
        }
        i35 = i17 & i24;
        if (i35 != 0) {
            i28 |= 12582912;
            i36 = i35;
        } else {
            i36 = i35;
            if ((i16 & 12582912) == 0) {
                i28 |= o0VarE.B(str4) ? 8388608 : 4194304;
            }
        }
        i37 = i17 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
        if (i37 != 0) {
            i28 |= 100663296;
        } else if ((i16 & 100663296) == 0) {
            i28 |= o0VarE.B(str5) ? 67108864 : 33554432;
        }
        i38 = i17 & 524288;
        if (i38 != 0) {
            i28 |= C.ENCODING_PCM_32BIT;
        } else if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
            i28 |= o0VarE.r(aVar3) ? 536870912 : 268435456;
        }
        if ((i18 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (o0VarE.n(i18 & 1, z14)) {
            o0VarE.G0();
            i44 = i15 & 1;
            aVar7 = p3.m.f135153a;
            if (i44 != 0) {
                if ((i17 & 8) != 0) {
                    i18 &= -7169;
                    str7 = str6;
                }
                if (i48 != 0) {
                    d0Var3 = null;
                }
                if ((i17 & 64) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i18 &= -3670017;
                    f16 = j92.b.f97901d.f97904c;
                }
                if (i55 != 0) {
                    i19 = 0;
                }
                if ((i17 & 256) != 0) {
                    d92.b.f58623a.getClass();
                    i18 &= -234881025;
                    d0VarA = o4.d0.a(d92.b.a(o0VarE).f().a());
                }
                if ((i17 & 512) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f19 = j92.b.f97901d.f97904c;
                    i18 &= -1879048193;
                } else {
                    f19 = f15;
                }
                if (i56 != 0) {
                    str12 = null;
                } else {
                    str12 = str3;
                }
                if ((i17 & 2048) != 0) {
                    h4.r.a aVar110 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    rVarY = c2.l.y(aVar110, j92.b.f97899b.f97920e);
                    i28 &= -113;
                } else {
                    rVarY = rVar2;
                }
                if (i58 != 0) {
                    rVar6 = h4.r.S;
                } else {
                    rVar6 = rVar3;
                }
                f22 = f19;
                if (i64 != 0) {
                    objQ3 = o0VarE.q();
                    aVar7.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new yx2.b(12);
                        o0VarE.K(objQ3);
                    }
                    aVar8 = (e23.a) objQ3;
                } else {
                    aVar8 = aVar;
                }
                if (i66 != 0) {
                    b.f200243a.getClass();
                    pVar3 = b.f200244b;
                } else {
                    pVar3 = pVar;
                }
                aVar9 = aVar8;
                if (i29 != 0) {
                    objQ2 = o0VarE.q();
                    aVar7.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new yx2.b(13);
                        o0VarE.K(objQ2);
                    }
                    aVar10 = (e23.a) objQ2;
                } else {
                    aVar10 = aVar2;
                }
                if (i34 != 0) {
                    zVar2 = z.VALID_DATA;
                } else {
                    zVar2 = zVar;
                }
                if (i36 != 0) {
                    str13 = null;
                } else {
                    str13 = str4;
                }
                if (i37 != 0) {
                    str14 = null;
                } else {
                    str14 = str5;
                }
                e23.a<Unit> aVar111 = aVar10;
                if (i38 != 0) {
                    objQ = o0VarE.q();
                    aVar7.getClass();
                    z zVar4 = zVar2;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new yx2.b(14);
                        o0VarE.K(objQ);
                    }
                    zVar2 = zVar4;
                    aVar11 = (e23.a) objQ;
                } else {
                    aVar11 = aVar3;
                }
                str15 = str13;
                aVar12 = aVar111;
            } else {
                if ((i17 & 8) != 0) {
                    i18 &= -7169;
                    str7 = str6;
                }
                if (i48 != 0) {
                    d0Var3 = null;
                }
                if ((i17 & 64) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i18 &= -3670017;
                    f16 = j92.b.f97901d.f97904c;
                }
                if (i55 != 0) {
                    i19 = 0;
                }
                if ((i17 & 256) != 0) {
                    d92.b.f58623a.getClass();
                    i18 &= -234881025;
                    d0VarA = o4.d0.a(d92.b.a(o0VarE).f().a());
                }
                if ((i17 & 512) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f19 = j92.b.f97901d.f97904c;
                    i18 &= -1879048193;
                } else {
                    f19 = f15;
                }
                if (i56 != 0) {
                    str12 = null;
                } else {
                    str12 = str3;
                }
                if ((i17 & 2048) != 0) {
                    h4.r.a aVar112 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    rVarY = c2.l.y(aVar112, j92.b.f97899b.f97920e);
                    i28 &= -113;
                } else {
                    rVarY = rVar2;
                }
                if (i58 != 0) {
                    rVar6 = h4.r.S;
                } else {
                    rVar6 = rVar3;
                }
                f22 = f19;
                if (i64 != 0) {
                    objQ3 = o0VarE.q();
                    aVar7.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new yx2.b(12);
                        o0VarE.K(objQ3);
                    }
                    aVar8 = (e23.a) objQ3;
                } else {
                    aVar8 = aVar;
                }
                if (i66 != 0) {
                    b.f200243a.getClass();
                    pVar3 = b.f200244b;
                } else {
                    pVar3 = pVar;
                }
                aVar9 = aVar8;
                if (i29 != 0) {
                    objQ2 = o0VarE.q();
                    aVar7.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new yx2.b(13);
                        o0VarE.K(objQ2);
                    }
                    aVar10 = (e23.a) objQ2;
                } else {
                    aVar10 = aVar2;
                }
                if (i34 != 0) {
                    zVar2 = z.VALID_DATA;
                } else {
                    zVar2 = zVar;
                }
                if (i36 != 0) {
                    str13 = null;
                } else {
                    str13 = str4;
                }
                if (i37 != 0) {
                    str14 = null;
                } else {
                    str14 = str5;
                }
                e23.a<Unit> aVar113 = aVar10;
                if (i38 != 0) {
                    objQ = o0VarE.q();
                    aVar7.getClass();
                    z zVar5 = zVar2;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new yx2.b(14);
                        o0VarE.K(objQ);
                    }
                    zVar2 = zVar5;
                    aVar11 = (e23.a) objQ;
                } else {
                    aVar11 = aVar3;
                }
                str15 = str13;
                aVar12 = aVar113;
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            aVar13 = aVar9;
            long jA2 = am.j.A(d92.b.f58623a, o0VarE);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            d0Var5 = d0VarA;
            h4.r rVarE2 = u1.n.e(rVar, jA2, k2.i.a(eVar.f97918c));
            h4.d.f81522a.getClass();
            gVar = h4.d.a.f81524b;
            z0VarD = c2.q.d(gVar, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarE2, o0VarE);
            h5.g.V.getClass();
            d0Var6 = d0Var3;
            aVar14 = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            f24 = f16;
            if (o0VarE.T) {
                o0VarE.M(aVar14);
            } else {
                o0VarE.c();
            }
            eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            str16 = str12;
            if (o0VarE.T) {
                i45 = i19;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar4 = c2.u.f22885a;
                if (dVar != null) {
                    uVar = u.LOADING;
                } else {
                    uVar = u.LOADING;
                }
                if (uVar == u.ERROR) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (zVar2 != z.VALID_DATA) {
                    o0Var = o0VarE;
                    aVar15 = aVar12;
                    str17 = str15;
                    e23.a<Unit> aVar26 = aVar11;
                    zVar2 = zVar2;
                    o0Var.C(-433476686);
                    aVar16 = h4.r.S;
                    h4.r rVarD7 = x2.d(aVar16, 1.0f);
                    z16 = z15;
                    if ((i28 & 458752) == i24) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objQ4 = o0Var.q();
                    if (z17) {
                        aVar7.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new yy1.d(aVar15, 15);
                            o0Var.K(objQ4);
                        }
                    } else {
                        objQ4 = new yy1.d(aVar15, 15);
                        o0Var.K(objQ4);
                    }
                    h4.r rVarD8 = u1.w.d(rVarD7, false, null, null, (e23.a) objQ4, 15);
                    if (z16) {
                        bVar.getClass();
                        rVarY2 = c2.l.y(aVar16, eVar.f97918c);
                    } else {
                        rVarY2 = rVarY;
                    }
                    h4.r rVarThen4 = rVarD8.then(rVarY2);
                    c2.j.f22691a.getClass();
                    aVar11 = aVar26;
                    aVar17 = aVar15;
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var, 0);
                    iHashCode2 = Long.hashCode(o0Var.U);
                    i2VarA1 = o0Var.a0();
                    rVarC2 = h4.k.c(rVarThen4, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    String str112 = str7;
                    if (o0Var.T) {
                        o0Var.M(aVar14);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar2, zVarA, o0Var);
                    b4.c(c1623g, i2VarA1, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                    } else {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0Var);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    float f28 = f22;
                    a(x2.x(aVar16, null, 3).then(rVar6), dVar, str, str112, dVar2, d0Var6, f24, i45, d0Var5, f28, str16, aVar13, o0Var, i18 & 2147483632, (i28 & 14) | ((i28 >> 6) & 112));
                    str7 = str112;
                    d0Var7 = d0Var5;
                    f22 = f28;
                    str16 = str16;
                    aVar13 = aVar13;
                    bVar.getClass();
                    h4.r rVarC7 = c2.l.C(aVar16, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    d0Var6 = d0Var6;
                    z0VarD2 = c2.q.d(gVar, false);
                    rVar6 = rVar6;
                    iHashCode3 = Long.hashCode(o0Var.U);
                    i2VarA2 = o0Var.a0();
                    rVarC3 = h4.k.c(rVarC7, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        f24 = f24;
                        o0Var.M(aVar14);
                    } else {
                        f24 = f24;
                        o0Var.c();
                    }
                    b4.c(eVar2, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA2, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                    } else {
                        v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, o0Var);
                    if (m(dVar)) {
                        o0Var.C(-1280712427);
                        if (z16) {
                            o0Var.C(-1280676622);
                            e(x2.d(aVar16, 1.0f), o0Var, 6);
                            z18 = false;
                            o0Var.g0(false);
                        } else {
                            z18 = false;
                            o0Var.C(-1280547941);
                            e5.q((i28 >> 12) & 14, pVar3, o0Var, false);
                        }
                        o0Var.g0(z18);
                    } else {
                        z18 = false;
                        o0Var.C(-1280441425);
                        o0Var.g0(false);
                    }
                    z19 = true;
                    e5.u(o0Var, true, true, z18);
                } else {
                    o0Var = o0VarE;
                    aVar15 = aVar12;
                    str17 = str15;
                    e23.a<Unit> aVar27 = aVar11;
                    zVar2 = zVar2;
                    o0Var.C(-433476686);
                    aVar16 = h4.r.S;
                    h4.r rVarD9 = x2.d(aVar16, 1.0f);
                    z16 = z15;
                    if ((i28 & 458752) == i24) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objQ4 = o0Var.q();
                    if (z17) {
                        aVar7.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new yy1.d(aVar15, 15);
                            o0Var.K(objQ4);
                        }
                    } else {
                        objQ4 = new yy1.d(aVar15, 15);
                        o0Var.K(objQ4);
                    }
                    h4.r rVarD10 = u1.w.d(rVarD9, false, null, null, (e23.a) objQ4, 15);
                    if (z16) {
                        bVar.getClass();
                        rVarY2 = c2.l.y(aVar16, eVar.f97918c);
                    } else {
                        rVarY2 = rVarY;
                    }
                    h4.r rVarThen5 = rVarD10.then(rVarY2);
                    c2.j.f22691a.getClass();
                    aVar11 = aVar27;
                    aVar17 = aVar15;
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var, 0);
                    iHashCode2 = Long.hashCode(o0Var.U);
                    i2VarA1 = o0Var.a0();
                    rVarC2 = h4.k.c(rVarThen5, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    String str113 = str7;
                    if (o0Var.T) {
                        o0Var.M(aVar14);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar2, zVarA, o0Var);
                    b4.c(c1623g, i2VarA1, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                    } else {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0Var);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    float f29 = f22;
                    a(x2.x(aVar16, null, 3).then(rVar6), dVar, str, str113, dVar2, d0Var6, f24, i45, d0Var5, f29, str16, aVar13, o0Var, i18 & 2147483632, (i28 & 14) | ((i28 >> 6) & 112));
                    str7 = str113;
                    d0Var7 = d0Var5;
                    f22 = f29;
                    str16 = str16;
                    aVar13 = aVar13;
                    bVar.getClass();
                    h4.r rVarC8 = c2.l.C(aVar16, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    d0Var6 = d0Var6;
                    z0VarD2 = c2.q.d(gVar, false);
                    rVar6 = rVar6;
                    iHashCode3 = Long.hashCode(o0Var.U);
                    i2VarA2 = o0Var.a0();
                    rVarC3 = h4.k.c(rVarC8, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        f24 = f24;
                        o0Var.M(aVar14);
                    } else {
                        f24 = f24;
                        o0Var.c();
                    }
                    b4.c(eVar2, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA2, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                    } else {
                        v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, o0Var);
                    if (m(dVar)) {
                        o0Var.C(-1280712427);
                        if (z16) {
                            o0Var.C(-1280676622);
                            e(x2.d(aVar16, 1.0f), o0Var, 6);
                            z18 = false;
                            o0Var.g0(false);
                        } else {
                            z18 = false;
                            o0Var.C(-1280547941);
                            e5.q((i28 >> 12) & 14, pVar3, o0Var, false);
                        }
                        o0Var.g0(z18);
                    } else {
                        z18 = false;
                        o0Var.C(-1280441425);
                        o0Var.g0(false);
                    }
                    z19 = true;
                    e5.u(o0Var, true, true, z18);
                }
                o0Var.g0(z19);
                d0Var4 = d0Var6;
                f18 = f24;
                rVar5 = rVarY;
                d0VarA = d0Var7;
                f17 = f22;
                str10 = str7;
                aVar5 = aVar11;
                str11 = str16;
                rVar4 = rVar6;
                i39 = i45;
                aVar6 = aVar13;
                pVar2 = pVar3;
                str9 = str14;
                str8 = str17;
                aVar4 = aVar17;
            } else {
                i45 = i19;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar5 = c2.u.f22885a;
            if (dVar != null) {
                uVar = u.LOADING;
            } else {
                uVar = u.LOADING;
            }
            if (uVar == u.ERROR) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (zVar2 != z.VALID_DATA) {
                o0Var = o0VarE;
                aVar15 = aVar12;
                str17 = str15;
                e23.a<Unit> aVar28 = aVar11;
                zVar2 = zVar2;
                o0Var.C(-433476686);
                aVar16 = h4.r.S;
                h4.r rVarD11 = x2.d(aVar16, 1.0f);
                z16 = z15;
                if ((i28 & 458752) == i24) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ4 = o0Var.q();
                if (z17) {
                    aVar7.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new yy1.d(aVar15, 15);
                        o0Var.K(objQ4);
                    }
                } else {
                    objQ4 = new yy1.d(aVar15, 15);
                    o0Var.K(objQ4);
                }
                h4.r rVarD12 = u1.w.d(rVarD11, false, null, null, (e23.a) objQ4, 15);
                if (z16) {
                    bVar.getClass();
                    rVarY2 = c2.l.y(aVar16, eVar.f97918c);
                } else {
                    rVarY2 = rVarY;
                }
                h4.r rVarThen6 = rVarD12.then(rVarY2);
                c2.j.f22691a.getClass();
                aVar11 = aVar28;
                aVar17 = aVar15;
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var, 0);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(rVarThen6, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                String str114 = str7;
                if (o0Var.T) {
                    o0Var.M(aVar14);
                } else {
                    o0Var.c();
                }
                b4.c(eVar2, zVarA, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0Var);
                c2.b0 b0Var6 = c2.b0.f22601a;
                float f210 = f22;
                a(x2.x(aVar16, null, 3).then(rVar6), dVar, str, str114, dVar2, d0Var6, f24, i45, d0Var5, f210, str16, aVar13, o0Var, i18 & 2147483632, (i28 & 14) | ((i28 >> 6) & 112));
                str7 = str114;
                d0Var7 = d0Var5;
                f22 = f210;
                str16 = str16;
                aVar13 = aVar13;
                bVar.getClass();
                h4.r rVarC9 = c2.l.C(aVar16, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                d0Var6 = d0Var6;
                z0VarD2 = c2.q.d(gVar, false);
                rVar6 = rVar6;
                iHashCode3 = Long.hashCode(o0Var.U);
                i2VarA2 = o0Var.a0();
                rVarC3 = h4.k.c(rVarC9, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    f24 = f24;
                    o0Var.M(aVar14);
                } else {
                    f24 = f24;
                    o0Var.c();
                }
                b4.c(eVar2, z0VarD2, o0Var);
                b4.c(c1623g, i2VarA2, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                } else {
                    v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, o0Var);
                if (m(dVar)) {
                    o0Var.C(-1280712427);
                    if (z16) {
                        o0Var.C(-1280676622);
                        e(x2.d(aVar16, 1.0f), o0Var, 6);
                        z18 = false;
                        o0Var.g0(false);
                    } else {
                        z18 = false;
                        o0Var.C(-1280547941);
                        e5.q((i28 >> 12) & 14, pVar3, o0Var, false);
                    }
                    o0Var.g0(z18);
                } else {
                    z18 = false;
                    o0Var.C(-1280441425);
                    o0Var.g0(false);
                }
                z19 = true;
                e5.u(o0Var, true, true, z18);
            } else {
                o0Var = o0VarE;
                aVar15 = aVar12;
                str17 = str15;
                e23.a<Unit> aVar29 = aVar11;
                zVar2 = zVar2;
                o0Var.C(-433476686);
                aVar16 = h4.r.S;
                h4.r rVarD13 = x2.d(aVar16, 1.0f);
                z16 = z15;
                if ((i28 & 458752) == i24) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ4 = o0Var.q();
                if (z17) {
                    aVar7.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new yy1.d(aVar15, 15);
                        o0Var.K(objQ4);
                    }
                } else {
                    objQ4 = new yy1.d(aVar15, 15);
                    o0Var.K(objQ4);
                }
                h4.r rVarD14 = u1.w.d(rVarD13, false, null, null, (e23.a) objQ4, 15);
                if (z16) {
                    bVar.getClass();
                    rVarY2 = c2.l.y(aVar16, eVar.f97918c);
                } else {
                    rVarY2 = rVarY;
                }
                h4.r rVarThen7 = rVarD14.then(rVarY2);
                c2.j.f22691a.getClass();
                aVar11 = aVar29;
                aVar17 = aVar15;
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var, 0);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(rVarThen7, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                String str115 = str7;
                if (o0Var.T) {
                    o0Var.M(aVar14);
                } else {
                    o0Var.c();
                }
                b4.c(eVar2, zVarA, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0Var);
                c2.b0 b0Var7 = c2.b0.f22601a;
                float f211 = f22;
                a(x2.x(aVar16, null, 3).then(rVar6), dVar, str, str115, dVar2, d0Var6, f24, i45, d0Var5, f211, str16, aVar13, o0Var, i18 & 2147483632, (i28 & 14) | ((i28 >> 6) & 112));
                str7 = str115;
                d0Var7 = d0Var5;
                f22 = f211;
                str16 = str16;
                aVar13 = aVar13;
                bVar.getClass();
                h4.r rVarC10 = c2.l.C(aVar16, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                d0Var6 = d0Var6;
                z0VarD2 = c2.q.d(gVar, false);
                rVar6 = rVar6;
                iHashCode3 = Long.hashCode(o0Var.U);
                i2VarA2 = o0Var.a0();
                rVarC3 = h4.k.c(rVarC10, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    f24 = f24;
                    o0Var.M(aVar14);
                } else {
                    f24 = f24;
                    o0Var.c();
                }
                b4.c(eVar2, z0VarD2, o0Var);
                b4.c(c1623g, i2VarA2, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                } else {
                    v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, o0Var);
                if (m(dVar)) {
                    o0Var.C(-1280712427);
                    if (z16) {
                        o0Var.C(-1280676622);
                        e(x2.d(aVar16, 1.0f), o0Var, 6);
                        z18 = false;
                        o0Var.g0(false);
                    } else {
                        z18 = false;
                        o0Var.C(-1280547941);
                        e5.q((i28 >> 12) & 14, pVar3, o0Var, false);
                    }
                    o0Var.g0(z18);
                } else {
                    z18 = false;
                    o0Var.C(-1280441425);
                    o0Var.g0(false);
                }
                z19 = true;
                e5.u(o0Var, true, true, z18);
            }
            o0Var.g0(z19);
            d0Var4 = d0Var6;
            f18 = f24;
            rVar5 = rVarY;
            d0VarA = d0Var7;
            f17 = f22;
            str10 = str7;
            aVar5 = aVar11;
            str11 = str16;
            rVar4 = rVar6;
            i39 = i45;
            aVar6 = aVar13;
            pVar2 = pVar3;
            str9 = str14;
            str8 = str17;
            aVar4 = aVar17;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            f17 = f15;
            rVar4 = rVar3;
            aVar4 = aVar2;
            zVar2 = zVar;
            str8 = str4;
            str9 = str5;
            aVar5 = aVar3;
            d0Var4 = d0Var3;
            f18 = f16;
            i39 = i19;
            str10 = str7;
            str11 = str3;
            rVar5 = rVar2;
            aVar6 = aVar;
            pVar2 = pVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: yz1.w
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i15 | 1);
                    int iT2 = p0.t(i16);
                    y.c(rVar, dVar, str, str10, dVar2, d0Var4, f18, i39, d0VarA, f17, str11, rVar5, rVar4, aVar6, pVar2, aVar4, zVar2, str8, str9, aVar5, (p3.m) obj, iT, iT2, i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0158  */
    /* JADX WARN: Code duplicated, block: B:105:0x015b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:109:0x0169  */
    /* JADX WARN: Code duplicated, block: B:110:0x016c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0173  */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0182  */
    /* JADX WARN: Code duplicated, block: B:122:0x0188  */
    /* JADX WARN: Code duplicated, block: B:124:0x018e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0198  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:166:0x0201 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x0203  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:172:0x0213  */
    /* JADX WARN: Code duplicated, block: B:173:0x0215  */
    /* JADX WARN: Code duplicated, block: B:175:0x0219  */
    /* JADX WARN: Code duplicated, block: B:178:0x0220  */
    /* JADX WARN: Code duplicated, block: B:180:0x0227  */
    /* JADX WARN: Code duplicated, block: B:182:0x022f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0235  */
    /* JADX WARN: Code duplicated, block: B:185:0x0238  */
    /* JADX WARN: Code duplicated, block: B:189:0x0241  */
    /* JADX WARN: Code duplicated, block: B:190:0x0244  */
    /* JADX WARN: Code duplicated, block: B:192:0x024a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0252  */
    /* JADX WARN: Code duplicated, block: B:196:0x0259  */
    /* JADX WARN: Code duplicated, block: B:199:0x0261  */
    /* JADX WARN: Code duplicated, block: B:200:0x0264  */
    /* JADX WARN: Code duplicated, block: B:202:0x026a  */
    /* JADX WARN: Code duplicated, block: B:204:0x0272  */
    /* JADX WARN: Code duplicated, block: B:207:0x0279  */
    /* JADX WARN: Code duplicated, block: B:216:0x0297  */
    /* JADX WARN: Code duplicated, block: B:219:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:231:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:233:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:236:0x030f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0312  */
    /* JADX WARN: Code duplicated, block: B:240:0x032f  */
    /* JADX WARN: Code duplicated, block: B:241:0x033a  */
    /* JADX WARN: Code duplicated, block: B:243:0x0340  */
    /* JADX WARN: Code duplicated, block: B:244:0x0342  */
    /* JADX WARN: Code duplicated, block: B:247:0x0348  */
    /* JADX WARN: Code duplicated, block: B:249:0x0355  */
    /* JADX WARN: Code duplicated, block: B:251:0x0362  */
    /* JADX WARN: Code duplicated, block: B:253:0x0368  */
    /* JADX WARN: Code duplicated, block: B:254:0x036a  */
    /* JADX WARN: Code duplicated, block: B:257:0x039a  */
    /* JADX WARN: Code duplicated, block: B:258:0x039c  */
    /* JADX WARN: Code duplicated, block: B:260:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:261:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:263:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:264:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:266:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:267:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:269:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:270:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:272:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:273:0x03be  */
    /* JADX WARN: Code duplicated, block: B:276:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:278:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:281:0x0400  */
    /* JADX WARN: Code duplicated, block: B:288:0x041e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0425  */
    /* JADX WARN: Code duplicated, block: B:293:0x042d  */
    /* JADX WARN: Code duplicated, block: B:294:0x0430  */
    /* JADX WARN: Code duplicated, block: B:296:0x0434  */
    /* JADX WARN: Code duplicated, block: B:298:0x043f  */
    /* JADX WARN: Code duplicated, block: B:301:0x0450  */
    /* JADX WARN: Code duplicated, block: B:304:0x0491  */
    /* JADX WARN: Code duplicated, block: B:307:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:309:0x053a  */
    /* JADX WARN: Code duplicated, block: B:311:0x0543  */
    /* JADX WARN: Code duplicated, block: B:312:0x0547  */
    /* JADX WARN: Code duplicated, block: B:315:0x055c  */
    /* JADX WARN: Code duplicated, block: B:318:0x056d  */
    /* JADX WARN: Code duplicated, block: B:322:0x058b  */
    /* JADX WARN: Code duplicated, block: B:324:0x058e  */
    /* JADX WARN: Code duplicated, block: B:325:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:327:0x0603  */
    /* JADX WARN: Code duplicated, block: B:329:0x0623  */
    /* JADX WARN: Code duplicated, block: B:330:0x0625  */
    /* JADX WARN: Code duplicated, block: B:333:0x0630  */
    /* JADX WARN: Code duplicated, block: B:334:0x0632  */
    /* JADX WARN: Code duplicated, block: B:337:0x0639  */
    /* JADX WARN: Code duplicated, block: B:339:0x0640  */
    /* JADX WARN: Code duplicated, block: B:342:0x0673  */
    /* JADX WARN: Code duplicated, block: B:344:0x067c  */
    /* JADX WARN: Code duplicated, block: B:345:0x0680  */
    /* JADX WARN: Code duplicated, block: B:348:0x068d  */
    /* JADX WARN: Code duplicated, block: B:350:0x069b  */
    /* JADX WARN: Code duplicated, block: B:353:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:354:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:357:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:358:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:361:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:363:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:366:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:368:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:369:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:372:0x0709  */
    /* JADX WARN: Code duplicated, block: B:374:0x0717  */
    /* JADX WARN: Code duplicated, block: B:377:0x0791  */
    /* JADX WARN: Code duplicated, block: B:379:0x079d  */
    /* JADX WARN: Code duplicated, block: B:380:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:382:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:384:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:386:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:388:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:391:0x080f  */
    /* JADX WARN: Code duplicated, block: B:394:0x0822  */
    /* JADX WARN: Code duplicated, block: B:396:0x0827  */
    /* JADX WARN: Code duplicated, block: B:400:0x0837  */
    /* JADX WARN: Code duplicated, block: B:402:0x0847  */
    /* JADX WARN: Code duplicated, block: B:406:0x085d  */
    /* JADX WARN: Code duplicated, block: B:409:0x088b  */
    /* JADX WARN: Code duplicated, block: B:412:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:413:0x08af  */
    /* JADX WARN: Code duplicated, block: B:416:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:417:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:420:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:421:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:424:0x08e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:425:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:428:0x092c  */
    /* JADX WARN: Code duplicated, block: B:430:0x0933  */
    /* JADX WARN: Code duplicated, block: B:431:0x0937  */
    /* JADX WARN: Code duplicated, block: B:434:0x0944  */
    /* JADX WARN: Code duplicated, block: B:436:0x0952  */
    /* JADX WARN: Code duplicated, block: B:439:0x095e  */
    /* JADX WARN: Code duplicated, block: B:441:0x0970  */
    /* JADX WARN: Code duplicated, block: B:444:0x099e  */
    /* JADX WARN: Code duplicated, block: B:446:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:448:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:450:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:452:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:454:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:457:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:458:0x0a0d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:459:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x0112  */
    /* JADX WARN: Code duplicated, block: B:84:0x0116  */
    /* JADX WARN: Code duplicated, block: B:86:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0123  */
    /* JADX WARN: Code duplicated, block: B:89:0x0128  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x0139  */
    /* JADX WARN: Code duplicated, block: B:96:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0147  */
    /* JADX WARN: Code duplicated, block: B:99:0x014a  */
    public static final void d(final h4.r rVar, final d dVar, final String str, String str2, final u4.d dVar2, final o4.d0 d0Var, float f14, int i14, o4.d0 d0Var2, float f15, String str3, e23.a<Unit> aVar, boolean z14, long j8, h4.r rVar2, final e23.p<? super p3.m, ? super Integer, Unit> pVar, final e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, z zVar, String str4, String str5, e23.a<Unit> aVar5, p3.m mVar, final int i15, final int i16, final int i17, final int i18) {
        int i19;
        String str6;
        String str7;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int iOrdinal;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i64;
        int i65;
        int i66;
        boolean z15;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        final float f16;
        final int i67;
        final String str8;
        final e23.a<Unit> aVar6;
        final boolean z16;
        final long j14;
        final h4.r rVar3;
        final e23.a<Unit> aVar7;
        final e23.a<Unit> aVar8;
        final e23.a<Unit> aVar9;
        final z zVar2;
        final String str9;
        final String str10;
        final e23.a<Unit> aVar10;
        o0 o0Var;
        final String str11;
        final o4.d0 d0Var3;
        final float f17;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        p2 p2Var;
        int i68;
        p3.m.a aVar11;
        d92.b bVar;
        j92.b bVar2;
        j92.c cVar;
        int i69;
        o4.d0 d0VarA;
        int i74;
        float f18;
        int i75;
        String str12;
        e23.a<Unit> aVar12;
        boolean z17;
        long jC;
        e23.a<Unit> aVar13;
        boolean z18;
        int i76;
        e23.a<Unit> aVar14;
        e23.a<Unit> aVar15;
        e23.a<Unit> aVar16;
        z zVar3;
        String str13;
        String str14;
        h4.r rVar4;
        e23.a<Unit> aVar17;
        final e23.a<Unit> aVar18;
        e23.a<Unit> aVar19;
        String str15;
        float f19;
        e23.a<Unit> aVar20;
        z zVar4;
        int i77;
        String str16;
        int i78;
        int i79;
        String str17;
        final String str18;
        float f22;
        Object objQ;
        Object objQ2;
        u uVar;
        final String str19;
        float f24;
        int i84;
        float f25;
        String str20;
        e23.a<Unit> aVar21;
        e23.a<Unit> aVar22;
        boolean z19;
        e23.a<Unit> aVar23;
        e23.a<Unit> aVar24;
        e23.a<Unit> aVar25;
        String str21;
        j92.b bVar3;
        j92.e eVar;
        h4.g gVar;
        int i85;
        z0 z0VarD;
        int iHashCode;
        h4.r rVar5;
        i2 i2VarA0;
        h4.r rVarC;
        int i86;
        e0.a aVar26;
        String str22;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar4;
        String str23;
        h5.g.a.f fVar;
        int i87;
        String str24;
        h4.r.a aVar27;
        boolean z24;
        boolean z25;
        Object objQ3;
        c2.j.k kVar;
        h4.g.a aVar28;
        c2.z zVarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        c2.b0 b0Var;
        boolean z26;
        boolean z27;
        Object objQ4;
        c2.z zVarA2;
        int iHashCode3;
        i2 i2VarA2;
        h4.r rVarC3;
        e23.a<Unit> aVar29;
        o4.d0 d0Var4;
        z0 z0VarD2;
        int iHashCode4;
        i2 i2VarA3;
        h4.r rVarC4;
        e0.a aVar30;
        h5.g.a.e eVar3;
        h5.g.a.C1623g c1623g2;
        String str25;
        h5.g.a.b bVar5;
        h5.g.a.f fVar2;
        boolean z28;
        boolean z29;
        h4.r.a aVar31;
        Object objQ5;
        p3.m.a.C2565a c2565a;
        float f26;
        e23.a<Unit> aVar32;
        boolean z34;
        int i88;
        boolean z35;
        Object objQ6;
        z0 z0VarD3;
        int iHashCode5;
        i2 i2VarA4;
        h4.r rVarC5;
        boolean z36;
        boolean z37;
        e23.a<Unit> aVar33;
        boolean z38;
        final int i89;
        final float f27;
        final o4.d0 d0Var5;
        p2 p2VarI1;
        Object objH;
        int i93;
        int i94;
        str.getClass();
        pVar.getClass();
        pVar2.getClass();
        o0 o0VarE = mVar.E(-1454621994);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i15 & 6) == 0) {
            i19 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i19 = i15;
        }
        if ((i15 & 48) == 0) {
            i19 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            str6 = str;
            i19 |= o0VarE.B(str6) ? 256 : 128;
        } else {
            str6 = str;
        }
        if ((i15 & 3072) == 0) {
            if ((i18 & 8) == 0) {
                str7 = str2;
                if (o0VarE.B(str7)) {
                    i94 = 2048;
                }
                i19 |= i94;
            } else {
                str7 = str2;
            }
            i94 = 1024;
            i19 |= i94;
        } else {
            str7 = str2;
        }
        if ((i15 & 24576) == 0) {
            i19 |= o0VarE.B(dVar2) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i19 |= o0VarE.B(d0Var) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i19 |= 524288;
        }
        int i95 = i18 & 128;
        if (i95 == 0) {
            if ((i15 & 12582912) == 0) {
                i24 = 8388608;
                i19 |= o0VarE.k(i14) ? 8388608 : 4194304;
            }
            if ((i15 & 100663296) == 0) {
                i19 |= 33554432;
            }
            if ((i15 & C.ENCODING_PCM_32BIT) != 0) {
                i19 |= ((i18 & 512) == 0 || !o0VarE.i(f15)) ? 268435456 : 536870912;
            }
            i25 = i18 & 1024;
            if (i25 != 0) {
                i26 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (o0VarE.B(str3)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i16 | i27;
            } else {
                i26 = i16;
            }
            i28 = i18 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i16 & 48) != 0) {
                if (o0VarE.r(aVar)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            i30 = i26;
            i34 = i18 & 4096;
            if (i34 != 0) {
                i36 = i30 | 384;
            } else {
                i35 = i30;
                if ((i16 & 384) != 0) {
                    if (o0VarE.h(z14)) {
                        i37 = 256;
                    } else {
                        i37 = 128;
                    }
                    i35 |= i37;
                }
                i36 = i35;
            }
            if ((i16 & 3072) == 0) {
                i36 |= 1024;
            }
            if ((i16 & 24576) == 0) {
                i36 |= 8192;
            }
            if ((i16 & 196608) == 0) {
                i36 |= o0VarE.r(pVar) ? 131072 : 65536;
            }
            if ((i16 & 1572864) == 0) {
                if (o0VarE.r(pVar2)) {
                    i93 = 1048576;
                } else {
                    i93 = 524288;
                }
                i36 |= i93;
            }
            i38 = i18 & 131072;
            if (i38 != 0) {
                i36 |= 12582912;
            } else if ((i16 & 12582912) == 0) {
                if (o0VarE.r(aVar2)) {
                    i39 = i24;
                } else {
                    i39 = 4194304;
                }
                i36 |= i39;
            }
            i44 = i18 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
            if (i44 != 0) {
                i36 |= 100663296;
            } else if ((i16 & 100663296) == 0) {
                i36 |= o0VarE.r(aVar3) ? 67108864 : 33554432;
            }
            i45 = i18 & 524288;
            if (i45 != 0) {
                i36 |= C.ENCODING_PCM_32BIT;
            } else if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
                i36 |= o0VarE.r(aVar4) ? 536870912 : 268435456;
            }
            i46 = i18 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            if (i46 != 0) {
                i47 = i17 | 6;
            } else if ((i17 & 6) == 0) {
                if (zVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = zVar.ordinal();
                }
                if (o0VarE.k(iOrdinal)) {
                    i48 = 4;
                } else {
                    i48 = 2;
                }
                i47 = i17 | i48;
            } else {
                i47 = i17;
            }
            i49 = 2097152 & i18;
            if (i49 != 0) {
                i47 |= 48;
                i54 = i49;
            } else {
                i54 = i49;
                if ((i17 & 48) == 0) {
                    if (o0VarE.B(str4)) {
                        i55 = 32;
                    } else {
                        i55 = 16;
                    }
                    i47 |= i55;
                }
            }
            i56 = i47;
            i57 = i18 & 4194304;
            if (i57 != 0) {
                i58 = i56 | 384;
            } else if ((i17 & 384) == 0) {
                i58 = i56 | (o0VarE.B(str5) ? 256 : 128);
            } else {
                i58 = i56;
            }
            i59 = i18 & i24;
            if (i59 != 0) {
                i65 = i58 | 3072;
            } else {
                i64 = i58;
                if ((i17 & 3072) != 0) {
                    i64 |= o0VarE.r(aVar5) ? 2048 : 1024;
                }
                i65 = i64;
            }
            i66 = i36;
            if ((i19 & 306783379) != 306783378 && (i66 & 306783379) == 306783378 && (i65 & 1171) == 1170) {
                z15 = false;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                o0VarE.G0();
                i68 = i15 & 1;
                aVar11 = p3.m.f135153a;
                if (i68 != 0 || o0VarE.o0()) {
                    if ((i18 & 8) != 0) {
                        i19 &= -7169;
                        str7 = str6;
                    }
                    bVar = d92.b.f58623a;
                    bVar.getClass();
                    bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    cVar = j92.b.f97901d;
                    float f28 = cVar.f97904c;
                    if (i95 != 0) {
                        i69 = 0;
                    } else {
                        i69 = i14;
                    }
                    bVar.getClass();
                    d0VarA = o4.d0.a(d92.b.a(o0VarE).f().a());
                    i74 = i19 & (-238551041);
                    if ((i18 & 512) != 0) {
                        bVar.getClass();
                        bVar2.getClass();
                        f18 = cVar.f97904c;
                        i75 = i19 & (-2117599233);
                    } else {
                        f18 = f15;
                        i75 = i74;
                    }
                    if (i25 != 0) {
                        str12 = null;
                    } else {
                        str12 = str3;
                    }
                    float f29 = f18;
                    if (i28 != 0) {
                        objQ2 = o0VarE.q();
                        aVar11.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new yx2.b(10);
                            o0VarE.K(objQ2);
                        }
                        aVar12 = (e23.a) objQ2;
                    } else {
                        aVar12 = aVar;
                    }
                    if (i34 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    bVar.getClass();
                    jC = d92.b.a(o0VarE).j().c();
                    aVar13 = aVar12;
                    h4.r.a aVar34 = h4.r.S;
                    bVar.getClass();
                    bVar2.getClass();
                    z18 = z17;
                    j92.e eVar4 = j92.b.f97899b;
                    i76 = i75;
                    float f34 = eVar4.f97920e;
                    bVar2.getClass();
                    h4.r rVarZ = c2.l.z(aVar34, f34, eVar4.f97918c);
                    int i96 = i66 & (-64513);
                    if (i38 != 0) {
                        aVar14 = null;
                    } else {
                        aVar14 = aVar2;
                    }
                    if (i44 != 0) {
                        aVar15 = null;
                    } else {
                        aVar15 = aVar3;
                    }
                    if (i45 != 0) {
                        aVar16 = null;
                    } else {
                        aVar16 = aVar4;
                    }
                    if (i46 != 0) {
                        zVar3 = z.VALID_DATA;
                    } else {
                        zVar3 = zVar;
                    }
                    if (i54 != 0) {
                        str13 = null;
                    } else {
                        str13 = str4;
                    }
                    if (i57 != 0) {
                        str14 = null;
                    } else {
                        str14 = str5;
                    }
                    rVar4 = rVarZ;
                    if (i59 != 0) {
                        objQ = o0VarE.q();
                        aVar11.getClass();
                        e23.a<Unit> aVar35 = aVar14;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new yx2.b(11);
                            o0VarE.K(objQ);
                        }
                        aVar17 = aVar35;
                        aVar18 = (e23.a) objQ;
                    } else {
                        aVar17 = aVar14;
                        aVar18 = aVar5;
                    }
                    aVar19 = aVar15;
                    str15 = str12;
                    f19 = f28;
                    aVar20 = aVar16;
                    zVar4 = zVar3;
                    i77 = i69;
                    str16 = str13;
                    i78 = 67108864;
                    i79 = i96;
                    str17 = str7;
                    str18 = str14;
                    f22 = f29;
                } else {
                    o0VarE.e();
                    if ((i18 & 8) != 0) {
                        i19 &= -7169;
                    }
                    i76 = i19 & (-238551041);
                    if ((i18 & 512) != 0) {
                        i76 = i19 & (-2117599233);
                    }
                    f19 = f14;
                    i77 = i14;
                    d0VarA = d0Var2;
                    aVar13 = aVar;
                    z18 = z14;
                    jC = j8;
                    rVar4 = rVar2;
                    aVar17 = aVar2;
                    aVar19 = aVar3;
                    aVar20 = aVar4;
                    zVar4 = zVar;
                    str16 = str4;
                    aVar18 = aVar5;
                    i79 = i66 & (-64513);
                    str17 = str7;
                    i78 = 67108864;
                    f22 = f15;
                    str15 = str3;
                    str18 = str5;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                if (dVar != null || (uVar = dVar.f200298a) == null) {
                    uVar = u.LOADING;
                }
                str19 = str15;
                if (uVar == u.ERROR) {
                    o0VarE.C(1577469503);
                    if (aVar17 == null) {
                        aVar33 = aVar20;
                    } else {
                        aVar33 = aVar17;
                    }
                    if (aVar33 == null) {
                        objH = r1.q2.h(o0VarE, 1578063370, aVar11);
                        if (objH == p3.m.a.f135155b) {
                            objH = new yx2.b(15);
                            o0VarE.K(objH);
                        }
                        aVar33 = (e23.a) objH;
                        z38 = false;
                    } else {
                        z38 = false;
                        o0VarE.C(-2027306045);
                    }
                    o0VarE.g0(z38);
                    i89 = i77;
                    f27 = f22;
                    d0Var5 = d0VarA;
                    c(rVar, dVar, str, str17, dVar2, d0Var, f19, i89, d0Var5, f27, str19, null, null, null, null, aVar33, null, null, null, null, o0VarE, i76 & 2147483646, i79 & 14, 1013760);
                    o0VarE.g0(false);
                    p2VarI1 = o0VarE.i0();
                    if (p2VarI1 != null) {
                        return;
                    }
                    final int i97 = 0;
                    final String str26 = str17;
                    final e23.a<Unit> aVar36 = aVar13;
                    final boolean z39 = z18;
                    final h4.r rVar6 = rVar4;
                    final e23.a<Unit> aVar37 = aVar17;
                    final long j15 = jC;
                    final e23.a<Unit> aVar38 = aVar19;
                    final e23.a<Unit> aVar39 = aVar20;
                    final z zVar5 = zVar4;
                    final String str27 = str16;
                    final float f35 = f19;
                    pVar4 = new e23.p() { // from class: yz1.x
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            switch (i97) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    y.d(rVar, dVar, str, str26, dVar2, d0Var, f35, i89, d0Var5, f27, str19, aVar36, z39, j15, rVar6, pVar, pVar2, aVar37, aVar38, aVar39, zVar5, str27, str18, aVar18, mVar2, p0.t(i15 | 1), p0.t(i16), p0.t(i17), i18);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    y.d(rVar, dVar, str, str26, dVar2, d0Var, f35, i89, d0Var5, f27, str19, aVar36, z39, j15, rVar6, pVar, pVar2, aVar37, aVar38, aVar39, zVar5, str27, str18, aVar18, mVar2, p0.t(i15 | 1), p0.t(i16), p0.t(i17), i18);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    p2Var = p2VarI1;
                } else {
                    f24 = f19;
                    i84 = i77;
                    f25 = f22;
                    str20 = str18;
                    aVar21 = aVar18;
                    aVar22 = aVar13;
                    z19 = z18;
                    aVar23 = aVar17;
                    aVar24 = aVar19;
                    aVar25 = aVar20;
                    zVar2 = zVar4;
                    str21 = str16;
                    o0VarE.C(1578097036);
                    o0VarE.g0(false);
                    long jA = am.j.A(d92.b.f58623a, o0VarE);
                    bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarE = u1.n.e(rVar, jA, k2.i.a(eVar.f97918c));
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81524b;
                    i85 = i76;
                    z0VarD = c2.q.d(gVar, false);
                    iHashCode = Long.hashCode(o0VarE.getU());
                    rVar5 = rVar4;
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarE, o0VarE);
                    h5.g.V.getClass();
                    i86 = i79;
                    aVar26 = h5.g.a.f81805b;
                    if (r24 != 0) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    str22 = str17;
                    if (o0VarE.T) {
                        o0VarE.M(aVar26);
                    } else {
                        o0VarE.c();
                    }
                    eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, z0VarD, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar4 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        str23 = str21;
                    } else {
                        str23 = str21;
                        if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0VarE);
                        c2.u uVar2 = c2.u.f22885a;
                        i87 = a.f200482a[zVar2.ordinal()];
                        if (i87 != 1) {
                            str24 = str23;
                            o0VarE.C(-570849012);
                            aVar27 = h4.r.S;
                            h4.r rVarD = x2.d(aVar27, 1.0f);
                            if (aVar25 != null) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if ((i86 & 1879048192) == 536870912) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            objQ3 = o0VarE.q();
                            if (z25) {
                                objQ3 = new xx1.d(aVar25, 6);
                                o0VarE.K(objQ3);
                            } else {
                                aVar11.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new xx1.d(aVar25, 6);
                                    o0VarE.K(objQ3);
                                }
                            }
                            h4.r rVarA = wz1.i.a((e23.l) objQ3, rVarD, z24);
                            c2.j.f22691a.getClass();
                            kVar = c2.j.f22694d;
                            aVar28 = h4.d.a.f81536n;
                            zVarA = c2.y.a(kVar, aVar28, o0VarE, 0);
                            iHashCode2 = Long.hashCode(o0VarE.getU());
                            i2VarA1 = o0VarE.a0();
                            rVarC2 = h4.k.c(rVarA, o0VarE);
                            if (r24 != 0) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar26);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(eVar2, zVarA, o0VarE);
                            b4.c(c1623g, i2VarA1, o0VarE);
                            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                            }
                            b4.c(fVar, rVarC2, o0VarE);
                            b0Var = c2.b0.f22601a;
                            h4.r rVarA2 = b0Var.a(x2.f(aVar27, 1.0f), 0.75f, true);
                            if (aVar23 != null) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if ((i86 & 29360128) == i24) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objQ4 = o0VarE.q();
                            if (z27) {
                                objQ4 = new xx1.d(aVar23, 7);
                                o0VarE.K(objQ4);
                            } else {
                                aVar11.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new xx1.d(aVar23, 7);
                                    o0VarE.K(objQ4);
                                }
                            }
                            h4.r rVarA3 = wz1.i.a((e23.l) objQ4, rVarA2, z26);
                            zVarA2 = c2.y.a(kVar, aVar28, o0VarE, 0);
                            iHashCode3 = Long.hashCode(o0VarE.getU());
                            i2VarA2 = o0VarE.a0();
                            rVarC3 = h4.k.c(rVarA3, o0VarE);
                            if (r24 != 0) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar26);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(eVar2, zVarA2, o0VarE);
                            b4.c(c1623g, i2VarA2, o0VarE);
                            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                            }
                            b4.c(fVar, rVarC3, o0VarE);
                            h4.r rVarX = x2.x(x2.f(aVar27, 1.0f), null, 3);
                            bVar3.getClass();
                            float f36 = eVar.f97920e;
                            bVar3.getClass();
                            float f37 = eVar.f97920e;
                            bVar3.getClass();
                            aVar29 = aVar25;
                            aVar7 = aVar23;
                            d0Var4 = d0VarA;
                            a(c2.l.C(rVarX, f37, f36, eVar.f97920e, 0.0f, 8), dVar, str, str22, dVar2, d0Var, f24, i84, d0Var4, f25, str19, aVar22, o0VarE, i85 & 2147483632, i86 & 126);
                            f17 = f25;
                            o0VarE = o0VarE;
                            aVar6 = aVar22;
                            str8 = str19;
                            if (rVar5 == null) {
                                o0VarE.C(397211641);
                                if (m(dVar)) {
                                    o0VarE.C(397264651);
                                    e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                                } else {
                                    o0VarE.C(397348258);
                                    o0VarE.g0(false);
                                }
                                o0VarE.g0(false);
                                aVar30 = aVar26;
                                rVar5 = rVar5;
                                str25 = str22;
                                eVar3 = eVar2;
                                c1623g2 = c1623g;
                                bVar5 = bVar4;
                                fVar2 = fVar;
                                z29 = true;
                            } else {
                                o0VarE.C(397388682);
                                z0VarD2 = c2.q.d(gVar, false);
                                iHashCode4 = Long.hashCode(o0VarE.getU());
                                i2VarA3 = o0VarE.a0();
                                rVar5 = rVar5;
                                rVarC4 = h4.k.c(rVar5, o0VarE);
                                if (r24 != 0) {
                                    p0.l();
                                    throw null;
                                }
                                o0VarE.z();
                                if (o0VarE.T) {
                                    aVar30 = aVar26;
                                    o0VarE.M(aVar30);
                                } else {
                                    aVar30 = aVar26;
                                    o0VarE.c();
                                }
                                eVar3 = eVar2;
                                b4.c(eVar3, z0VarD2, o0VarE);
                                c1623g2 = c1623g;
                                b4.c(c1623g2, i2VarA3, o0VarE);
                                if (o0VarE.T) {
                                    str25 = str22;
                                } else {
                                    str25 = str22;
                                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                                        bVar5 = bVar4;
                                    }
                                    fVar2 = fVar;
                                    b4.c(fVar2, rVarC4, o0VarE);
                                    if (m(dVar)) {
                                        o0VarE.C(-1562852519);
                                        z28 = false;
                                        e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                                    } else {
                                        z28 = false;
                                        o0VarE.C(-1562761224);
                                        o0VarE.g0(false);
                                    }
                                    z29 = true;
                                    o0VarE.g0(true);
                                    o0VarE.g0(z28);
                                }
                                bVar5 = bVar4;
                                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar5);
                                fVar2 = fVar;
                                b4.c(fVar2, rVarC4, o0VarE);
                                if (m(dVar)) {
                                    o0VarE.C(-1562852519);
                                    z28 = false;
                                    e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                                } else {
                                    z28 = false;
                                    o0VarE.C(-1562761224);
                                    o0VarE.g0(false);
                                }
                                z29 = true;
                                o0VarE.g0(true);
                                o0VarE.g0(z28);
                            }
                            o0VarE.g0(z29);
                            if (z19 || !m(dVar)) {
                                aVar31 = aVar27;
                                o0VarE.C(48540664);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(48330205);
                                aVar31 = aVar27;
                                v5.a(0.0f, 6, 2, jC, x2.f(aVar31, 1.0f), o0VarE);
                                o0VarE.g0(false);
                            }
                            objQ5 = o0VarE.q();
                            aVar11.getClass();
                            c2565a = p3.m.a.f135155b;
                            if (objQ5 == c2565a) {
                                objQ5 = new yq.d(12);
                                o0VarE.K(objQ5);
                            }
                            f26 = f24;
                            h4.r rVarA4 = b0Var.a(x2.f(p5.v.c((e23.l) objQ5, aVar31, true), 1.0f), 0.25f, true);
                            aVar32 = aVar24;
                            if (aVar32 != null) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            i88 = i84;
                            if ((i86 & 234881024) == i78) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            objQ6 = o0VarE.q();
                            if (z35 || objQ6 == c2565a) {
                                objQ6 = new xx1.d(aVar32, 8);
                                o0VarE.K(objQ6);
                            }
                            h4.r rVarA5 = wz1.i.a((e23.l) objQ6, rVarA4, z34);
                            bVar3.getClass();
                            float f38 = eVar.f97920e;
                            bVar3.getClass();
                            h4.r rVarC6 = c2.l.C(rVarA5, f38, 0.0f, eVar.f97920e, 0.0f, 10);
                            z0VarD3 = c2.q.d(h4.d.a.f81528f, false);
                            iHashCode5 = Long.hashCode(o0VarE.getU());
                            i2VarA4 = o0VarE.a0();
                            rVarC5 = h4.k.c(rVarC6, o0VarE);
                            if (cVar2 != null) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar30);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(eVar3, z0VarD3, o0VarE);
                            b4.c(c1623g2, i2VarA4, o0VarE);
                            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                                v.h.A(iHashCode5, o0VarE, iHashCode5, bVar5);
                            }
                            b4.c(fVar2, rVarC5, o0VarE);
                            if (m(dVar)) {
                                o0VarE.C(1724190240);
                                pVar3 = pVar2;
                                z36 = false;
                                e5.q((i86 >> 18) & 14, pVar3, o0VarE, false);
                            } else {
                                pVar3 = pVar2;
                                z36 = false;
                                o0VarE.C(1724269042);
                                o0VarE.g0(false);
                            }
                            z37 = true;
                            e5.u(o0VarE, true, true, z36);
                            Unit unit = Unit.INSTANCE;
                        } else {
                            if (i87 == 2) {
                                throw kg.f.h(o0VarE, -570850499, false);
                            }
                            o0VarE.C(-570745729);
                            int i98 = i85 >> 9;
                            int i99 = ((i85 >> 3) & 14) | (i98 & 112) | (i98 & 896);
                            int i100 = i85 << 3;
                            int i101 = i99 | (i100 & 7168) | (i100 & 57344);
                            int i102 = i65 << 12;
                            String str28 = str23;
                            b(dVar, dVar2, d0Var, str, str22, str28, str20, aVar21, aVar25, o0VarE, i101 | (458752 & i102) | (3670016 & i102) | (i102 & 29360128) | ((i86 >> 3) & 234881024));
                            str24 = str28;
                            o0VarE.g0(false);
                            Unit unit2 = Unit.INSTANCE;
                            pVar3 = pVar2;
                            str25 = str22;
                            aVar32 = aVar24;
                            f26 = f24;
                            f17 = f25;
                            str8 = str19;
                            d0Var4 = d0VarA;
                            aVar6 = aVar22;
                            aVar29 = aVar25;
                            i88 = i84;
                            aVar7 = aVar23;
                            z37 = true;
                        }
                        o0VarE.g0(z37);
                        str11 = str25;
                        rVar3 = rVar5;
                        f16 = f26;
                        aVar8 = aVar32;
                        o0Var = o0VarE;
                        z16 = z19;
                        str10 = str20;
                        aVar10 = aVar21;
                        j14 = jC;
                        d0Var3 = d0Var4;
                        str9 = str24;
                        i67 = i88;
                        aVar9 = aVar29;
                    }
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u uVar3 = c2.u.f22885a;
                    i87 = a.f200482a[zVar2.ordinal()];
                    if (i87 != 1) {
                        str24 = str23;
                        o0VarE.C(-570849012);
                        aVar27 = h4.r.S;
                        h4.r rVarD2 = x2.d(aVar27, 1.0f);
                        if (aVar25 != null) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((i86 & 1879048192) == 536870912) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objQ3 = o0VarE.q();
                        if (z25) {
                            aVar11.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new xx1.d(aVar25, 6);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new xx1.d(aVar25, 6);
                            o0VarE.K(objQ3);
                        }
                        h4.r rVarA6 = wz1.i.a((e23.l) objQ3, rVarD2, z24);
                        c2.j.f22691a.getClass();
                        kVar = c2.j.f22694d;
                        aVar28 = h4.d.a.f81536n;
                        zVarA = c2.y.a(kVar, aVar28, o0VarE, 0);
                        iHashCode2 = Long.hashCode(o0VarE.getU());
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarA6, o0VarE);
                        if (r24 != 0) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar26);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, zVarA, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        b0Var = c2.b0.f22601a;
                        h4.r rVarA7 = b0Var.a(x2.f(aVar27, 1.0f), 0.75f, true);
                        if (aVar23 != null) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if ((i86 & 29360128) == i24) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objQ4 = o0VarE.q();
                        if (z27) {
                            aVar11.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new xx1.d(aVar23, 7);
                                o0VarE.K(objQ4);
                            }
                        } else {
                            objQ4 = new xx1.d(aVar23, 7);
                            o0VarE.K(objQ4);
                        }
                        h4.r rVarA8 = wz1.i.a((e23.l) objQ4, rVarA7, z26);
                        zVarA2 = c2.y.a(kVar, aVar28, o0VarE, 0);
                        iHashCode3 = Long.hashCode(o0VarE.getU());
                        i2VarA2 = o0VarE.a0();
                        rVarC3 = h4.k.c(rVarA8, o0VarE);
                        if (r24 != 0) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar26);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, zVarA2, o0VarE);
                        b4.c(c1623g, i2VarA2, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                        } else {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                        }
                        b4.c(fVar, rVarC3, o0VarE);
                        h4.r rVarX2 = x2.x(x2.f(aVar27, 1.0f), null, 3);
                        bVar3.getClass();
                        float f39 = eVar.f97920e;
                        bVar3.getClass();
                        float f310 = eVar.f97920e;
                        bVar3.getClass();
                        aVar29 = aVar25;
                        aVar7 = aVar23;
                        d0Var4 = d0VarA;
                        a(c2.l.C(rVarX2, f310, f39, eVar.f97920e, 0.0f, 8), dVar, str, str22, dVar2, d0Var, f24, i84, d0Var4, f25, str19, aVar22, o0VarE, i85 & 2147483632, i86 & 126);
                        f17 = f25;
                        o0VarE = o0VarE;
                        aVar6 = aVar22;
                        str8 = str19;
                        if (rVar5 == null) {
                            o0VarE.C(397211641);
                            if (m(dVar)) {
                                o0VarE.C(397264651);
                                e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                            } else {
                                o0VarE.C(397348258);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(false);
                            aVar30 = aVar26;
                            rVar5 = rVar5;
                            str25 = str22;
                            eVar3 = eVar2;
                            c1623g2 = c1623g;
                            bVar5 = bVar4;
                            fVar2 = fVar;
                            z29 = true;
                        } else {
                            o0VarE.C(397388682);
                            z0VarD2 = c2.q.d(gVar, false);
                            iHashCode4 = Long.hashCode(o0VarE.getU());
                            i2VarA3 = o0VarE.a0();
                            rVar5 = rVar5;
                            rVarC4 = h4.k.c(rVar5, o0VarE);
                            if (r24 != 0) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                aVar30 = aVar26;
                                o0VarE.M(aVar30);
                            } else {
                                aVar30 = aVar26;
                                o0VarE.c();
                            }
                            eVar3 = eVar2;
                            b4.c(eVar3, z0VarD2, o0VarE);
                            c1623g2 = c1623g;
                            b4.c(c1623g2, i2VarA3, o0VarE);
                            if (o0VarE.T) {
                                str25 = str22;
                                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                                    bVar5 = bVar4;
                                }
                                fVar2 = fVar;
                                b4.c(fVar2, rVarC4, o0VarE);
                                if (m(dVar)) {
                                    o0VarE.C(-1562852519);
                                    z28 = false;
                                    e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                                } else {
                                    z28 = false;
                                    o0VarE.C(-1562761224);
                                    o0VarE.g0(false);
                                }
                                z29 = true;
                                o0VarE.g0(true);
                                o0VarE.g0(z28);
                            } else {
                                str25 = str22;
                            }
                            bVar5 = bVar4;
                            v.h.A(iHashCode4, o0VarE, iHashCode4, bVar5);
                            fVar2 = fVar;
                            b4.c(fVar2, rVarC4, o0VarE);
                            if (m(dVar)) {
                                o0VarE.C(-1562852519);
                                z28 = false;
                                e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                            } else {
                                z28 = false;
                                o0VarE.C(-1562761224);
                                o0VarE.g0(false);
                            }
                            z29 = true;
                            o0VarE.g0(true);
                            o0VarE.g0(z28);
                        }
                        o0VarE.g0(z29);
                        if (z19) {
                            aVar31 = aVar27;
                            o0VarE.C(48540664);
                            o0VarE.g0(false);
                        } else {
                            aVar31 = aVar27;
                            o0VarE.C(48540664);
                            o0VarE.g0(false);
                        }
                        objQ5 = o0VarE.q();
                        aVar11.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ5 == c2565a) {
                            objQ5 = new yq.d(12);
                            o0VarE.K(objQ5);
                        }
                        f26 = f24;
                        h4.r rVarA9 = b0Var.a(x2.f(p5.v.c((e23.l) objQ5, aVar31, true), 1.0f), 0.25f, true);
                        aVar32 = aVar24;
                        if (aVar32 != null) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        i88 = i84;
                        if ((i86 & 234881024) == i78) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objQ6 = o0VarE.q();
                        if (z35) {
                            objQ6 = new xx1.d(aVar32, 8);
                            o0VarE.K(objQ6);
                        } else {
                            objQ6 = new xx1.d(aVar32, 8);
                            o0VarE.K(objQ6);
                        }
                        h4.r rVarA10 = wz1.i.a((e23.l) objQ6, rVarA9, z34);
                        bVar3.getClass();
                        float f311 = eVar.f97920e;
                        bVar3.getClass();
                        h4.r rVarC7 = c2.l.C(rVarA10, f311, 0.0f, eVar.f97920e, 0.0f, 10);
                        z0VarD3 = c2.q.d(h4.d.a.f81528f, false);
                        iHashCode5 = Long.hashCode(o0VarE.getU());
                        i2VarA4 = o0VarE.a0();
                        rVarC5 = h4.k.c(rVarC7, o0VarE);
                        if (cVar2 != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar30);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar3, z0VarD3, o0VarE);
                        b4.c(c1623g2, i2VarA4, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode5, o0VarE, iHashCode5, bVar5);
                        } else {
                            v.h.A(iHashCode5, o0VarE, iHashCode5, bVar5);
                        }
                        b4.c(fVar2, rVarC5, o0VarE);
                        if (m(dVar)) {
                            o0VarE.C(1724190240);
                            pVar3 = pVar2;
                            z36 = false;
                            e5.q((i86 >> 18) & 14, pVar3, o0VarE, false);
                        } else {
                            pVar3 = pVar2;
                            z36 = false;
                            o0VarE.C(1724269042);
                            o0VarE.g0(false);
                        }
                        z37 = true;
                        e5.u(o0VarE, true, true, z36);
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        if (i87 == 2) {
                            throw kg.f.h(o0VarE, -570850499, false);
                        }
                        o0VarE.C(-570745729);
                        int i910 = i85 >> 9;
                        int i911 = ((i85 >> 3) & 14) | (i910 & 112) | (i910 & 896);
                        int i103 = i85 << 3;
                        int i104 = i911 | (i103 & 7168) | (i103 & 57344);
                        int i105 = i65 << 12;
                        String str29 = str23;
                        b(dVar, dVar2, d0Var, str, str22, str29, str20, aVar21, aVar25, o0VarE, i104 | (458752 & i105) | (3670016 & i105) | (i105 & 29360128) | ((i86 >> 3) & 234881024));
                        str24 = str29;
                        o0VarE.g0(false);
                        Unit unit4 = Unit.INSTANCE;
                        pVar3 = pVar2;
                        str25 = str22;
                        aVar32 = aVar24;
                        f26 = f24;
                        f17 = f25;
                        str8 = str19;
                        d0Var4 = d0VarA;
                        aVar6 = aVar22;
                        aVar29 = aVar25;
                        i88 = i84;
                        aVar7 = aVar23;
                        z37 = true;
                    }
                    o0VarE.g0(z37);
                    str11 = str25;
                    rVar3 = rVar5;
                    f16 = f26;
                    aVar8 = aVar32;
                    o0Var = o0VarE;
                    z16 = z19;
                    str10 = str20;
                    aVar10 = aVar21;
                    j14 = jC;
                    d0Var3 = d0Var4;
                    str9 = str24;
                    i67 = i88;
                    aVar9 = aVar29;
                }
                p2Var.f135219d = pVar4;
            }
            pVar3 = pVar2;
            o0VarE.e();
            f16 = f14;
            i67 = i14;
            str8 = str3;
            aVar6 = aVar;
            z16 = z14;
            j14 = j8;
            rVar3 = rVar2;
            aVar7 = aVar2;
            aVar8 = aVar3;
            aVar9 = aVar4;
            zVar2 = zVar;
            str9 = str4;
            str10 = str5;
            aVar10 = aVar5;
            o0Var = o0VarE;
            str11 = str7;
            d0Var3 = d0Var2;
            f17 = f15;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final int i106 = 1;
                final e23.p<? super p3.m, ? super Integer, Unit> pVar5 = pVar3;
                pVar4 = new e23.p() { // from class: yz1.x
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        switch (i106) {
                            case 0:
                                ((Integer) obj2).getClass();
                                y.d(rVar, dVar, str, str11, dVar2, d0Var, f16, i67, d0Var3, f17, str8, aVar6, z16, j14, rVar3, pVar, pVar5, aVar7, aVar8, aVar9, zVar2, str9, str10, aVar10, mVar2, p0.t(i15 | 1), p0.t(i16), p0.t(i17), i18);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                y.d(rVar, dVar, str, str11, dVar2, d0Var, f16, i67, d0Var3, f17, str8, aVar6, z16, j14, rVar3, pVar, pVar5, aVar7, aVar8, aVar9, zVar2, str9, str10, aVar10, mVar2, p0.t(i15 | 1), p0.t(i16), p0.t(i17), i18);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p2Var = p2VarI0;
                p2Var.f135219d = pVar4;
            }
        }
        i19 |= 12582912;
        i24 = 8388608;
        if ((i15 & 100663296) == 0) {
            i19 |= 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) != 0) {
            i19 |= ((i18 & 512) == 0 || !o0VarE.i(f15)) ? 268435456 : 536870912;
        }
        i25 = i18 & 1024;
        if (i25 != 0) {
            i26 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (o0VarE.B(str3)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i16 | i27;
        } else {
            i26 = i16;
        }
        i28 = i18 & 2048;
        if (i28 != 0) {
            i26 |= 48;
        } else if ((i16 & 48) != 0) {
            if (o0VarE.r(aVar)) {
                i29 = 32;
            } else {
                i29 = 16;
            }
            i26 |= i29;
        }
        i30 = i26;
        i34 = i18 & 4096;
        if (i34 != 0) {
            i36 = i30 | 384;
        } else {
            i35 = i30;
            if ((i16 & 384) != 0) {
                if (o0VarE.h(z14)) {
                    i37 = 256;
                } else {
                    i37 = 128;
                }
                i35 |= i37;
            }
            i36 = i35;
        }
        if ((i16 & 3072) == 0) {
            i36 |= 1024;
        }
        if ((i16 & 24576) == 0) {
            i36 |= 8192;
        }
        if ((i16 & 196608) == 0) {
            i36 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        if ((i16 & 1572864) == 0) {
            if (o0VarE.r(pVar2)) {
                i93 = 1048576;
            } else {
                i93 = 524288;
            }
            i36 |= i93;
        }
        i38 = i18 & 131072;
        if (i38 != 0) {
            i36 |= 12582912;
        } else if ((i16 & 12582912) == 0) {
            if (o0VarE.r(aVar2)) {
                i39 = i24;
            } else {
                i39 = 4194304;
            }
            i36 |= i39;
        }
        i44 = i18 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
        if (i44 != 0) {
            i36 |= 100663296;
        } else if ((i16 & 100663296) == 0) {
            i36 |= o0VarE.r(aVar3) ? 67108864 : 33554432;
        }
        i45 = i18 & 524288;
        if (i45 != 0) {
            i36 |= C.ENCODING_PCM_32BIT;
        } else if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
            i36 |= o0VarE.r(aVar4) ? 536870912 : 268435456;
        }
        i46 = i18 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (i46 != 0) {
            i47 = i17 | 6;
        } else if ((i17 & 6) == 0) {
            if (zVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = zVar.ordinal();
            }
            if (o0VarE.k(iOrdinal)) {
                i48 = 4;
            } else {
                i48 = 2;
            }
            i47 = i17 | i48;
        } else {
            i47 = i17;
        }
        i49 = 2097152 & i18;
        if (i49 != 0) {
            i47 |= 48;
            i54 = i49;
        } else {
            i54 = i49;
            if ((i17 & 48) == 0) {
                if (o0VarE.B(str4)) {
                    i55 = 32;
                } else {
                    i55 = 16;
                }
                i47 |= i55;
            }
        }
        i56 = i47;
        i57 = i18 & 4194304;
        if (i57 != 0) {
            i58 = i56 | 384;
        } else if ((i17 & 384) == 0) {
            i58 = i56 | (o0VarE.B(str5) ? 256 : 128);
        } else {
            i58 = i56;
        }
        i59 = i18 & i24;
        if (i59 != 0) {
            i65 = i58 | 3072;
        } else {
            i64 = i58;
            if ((i17 & 3072) != 0) {
                i64 |= o0VarE.r(aVar5) ? 2048 : 1024;
            }
            i65 = i64;
        }
        i66 = i36;
        if ((i19 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (o0VarE.n(i19 & 1, z15)) {
            o0VarE.G0();
            i68 = i15 & 1;
            aVar11 = p3.m.f135153a;
            if (i68 != 0) {
                if ((i18 & 8) != 0) {
                    i19 &= -7169;
                    str7 = str6;
                }
                bVar = d92.b.f58623a;
                bVar.getClass();
                bVar2 = d92.b.f58625c;
                bVar2.getClass();
                cVar = j92.b.f97901d;
                float f210 = cVar.f97904c;
                if (i95 != 0) {
                    i69 = 0;
                } else {
                    i69 = i14;
                }
                bVar.getClass();
                d0VarA = o4.d0.a(d92.b.a(o0VarE).f().a());
                i74 = i19 & (-238551041);
                if ((i18 & 512) != 0) {
                    bVar.getClass();
                    bVar2.getClass();
                    f18 = cVar.f97904c;
                    i75 = i19 & (-2117599233);
                } else {
                    f18 = f15;
                    i75 = i74;
                }
                if (i25 != 0) {
                    str12 = null;
                } else {
                    str12 = str3;
                }
                float f211 = f18;
                if (i28 != 0) {
                    objQ2 = o0VarE.q();
                    aVar11.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new yx2.b(10);
                        o0VarE.K(objQ2);
                    }
                    aVar12 = (e23.a) objQ2;
                } else {
                    aVar12 = aVar;
                }
                if (i34 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                bVar.getClass();
                jC = d92.b.a(o0VarE).j().c();
                aVar13 = aVar12;
                h4.r.a aVar310 = h4.r.S;
                bVar.getClass();
                bVar2.getClass();
                z18 = z17;
                j92.e eVar5 = j92.b.f97899b;
                i76 = i75;
                float f312 = eVar5.f97920e;
                bVar2.getClass();
                h4.r rVarZ2 = c2.l.z(aVar310, f312, eVar5.f97918c);
                int i912 = i66 & (-64513);
                if (i38 != 0) {
                    aVar14 = null;
                } else {
                    aVar14 = aVar2;
                }
                if (i44 != 0) {
                    aVar15 = null;
                } else {
                    aVar15 = aVar3;
                }
                if (i45 != 0) {
                    aVar16 = null;
                } else {
                    aVar16 = aVar4;
                }
                if (i46 != 0) {
                    zVar3 = z.VALID_DATA;
                } else {
                    zVar3 = zVar;
                }
                if (i54 != 0) {
                    str13 = null;
                } else {
                    str13 = str4;
                }
                if (i57 != 0) {
                    str14 = null;
                } else {
                    str14 = str5;
                }
                rVar4 = rVarZ2;
                if (i59 != 0) {
                    objQ = o0VarE.q();
                    aVar11.getClass();
                    e23.a<Unit> aVar311 = aVar14;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new yx2.b(11);
                        o0VarE.K(objQ);
                    }
                    aVar17 = aVar311;
                    aVar18 = (e23.a) objQ;
                } else {
                    aVar17 = aVar14;
                    aVar18 = aVar5;
                }
                aVar19 = aVar15;
                str15 = str12;
                f19 = f210;
                aVar20 = aVar16;
                zVar4 = zVar3;
                i77 = i69;
                str16 = str13;
                i78 = 67108864;
                i79 = i912;
                str17 = str7;
                str18 = str14;
                f22 = f211;
            } else {
                if ((i18 & 8) != 0) {
                    i19 &= -7169;
                    str7 = str6;
                }
                bVar = d92.b.f58623a;
                bVar.getClass();
                bVar2 = d92.b.f58625c;
                bVar2.getClass();
                cVar = j92.b.f97901d;
                float f212 = cVar.f97904c;
                if (i95 != 0) {
                    i69 = 0;
                } else {
                    i69 = i14;
                }
                bVar.getClass();
                d0VarA = o4.d0.a(d92.b.a(o0VarE).f().a());
                i74 = i19 & (-238551041);
                if ((i18 & 512) != 0) {
                    bVar.getClass();
                    bVar2.getClass();
                    f18 = cVar.f97904c;
                    i75 = i19 & (-2117599233);
                } else {
                    f18 = f15;
                    i75 = i74;
                }
                if (i25 != 0) {
                    str12 = null;
                } else {
                    str12 = str3;
                }
                float f213 = f18;
                if (i28 != 0) {
                    objQ2 = o0VarE.q();
                    aVar11.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new yx2.b(10);
                        o0VarE.K(objQ2);
                    }
                    aVar12 = (e23.a) objQ2;
                } else {
                    aVar12 = aVar;
                }
                if (i34 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                bVar.getClass();
                jC = d92.b.a(o0VarE).j().c();
                aVar13 = aVar12;
                h4.r.a aVar312 = h4.r.S;
                bVar.getClass();
                bVar2.getClass();
                z18 = z17;
                j92.e eVar6 = j92.b.f97899b;
                i76 = i75;
                float f313 = eVar6.f97920e;
                bVar2.getClass();
                h4.r rVarZ3 = c2.l.z(aVar312, f313, eVar6.f97918c);
                int i913 = i66 & (-64513);
                if (i38 != 0) {
                    aVar14 = null;
                } else {
                    aVar14 = aVar2;
                }
                if (i44 != 0) {
                    aVar15 = null;
                } else {
                    aVar15 = aVar3;
                }
                if (i45 != 0) {
                    aVar16 = null;
                } else {
                    aVar16 = aVar4;
                }
                if (i46 != 0) {
                    zVar3 = z.VALID_DATA;
                } else {
                    zVar3 = zVar;
                }
                if (i54 != 0) {
                    str13 = null;
                } else {
                    str13 = str4;
                }
                if (i57 != 0) {
                    str14 = null;
                } else {
                    str14 = str5;
                }
                rVar4 = rVarZ3;
                if (i59 != 0) {
                    objQ = o0VarE.q();
                    aVar11.getClass();
                    e23.a<Unit> aVar313 = aVar14;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new yx2.b(11);
                        o0VarE.K(objQ);
                    }
                    aVar17 = aVar313;
                    aVar18 = (e23.a) objQ;
                } else {
                    aVar17 = aVar14;
                    aVar18 = aVar5;
                }
                aVar19 = aVar15;
                str15 = str12;
                f19 = f212;
                aVar20 = aVar16;
                zVar4 = zVar3;
                i77 = i69;
                str16 = str13;
                i78 = 67108864;
                i79 = i913;
                str17 = str7;
                str18 = str14;
                f22 = f213;
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            if (dVar != null) {
                uVar = u.LOADING;
            } else {
                uVar = u.LOADING;
            }
            str19 = str15;
            if (uVar == u.ERROR) {
                o0VarE.C(1577469503);
                if (aVar17 == null) {
                    aVar33 = aVar20;
                } else {
                    aVar33 = aVar17;
                }
                if (aVar33 == null) {
                    objH = r1.q2.h(o0VarE, 1578063370, aVar11);
                    if (objH == p3.m.a.f135155b) {
                        objH = new yx2.b(15);
                        o0VarE.K(objH);
                    }
                    aVar33 = (e23.a) objH;
                    z38 = false;
                } else {
                    z38 = false;
                    o0VarE.C(-2027306045);
                }
                o0VarE.g0(z38);
                i89 = i77;
                f27 = f22;
                d0Var5 = d0VarA;
                c(rVar, dVar, str, str17, dVar2, d0Var, f19, i89, d0Var5, f27, str19, null, null, null, null, aVar33, null, null, null, null, o0VarE, i76 & 2147483646, i79 & 14, 1013760);
                o0VarE.g0(false);
                p2VarI1 = o0VarE.i0();
                if (p2VarI1 != null) {
                    return;
                }
                final int i914 = 0;
                final String str210 = str17;
                final e23.a aVar314 = aVar13;
                final boolean z310 = z18;
                final h4.r rVar7 = rVar4;
                final e23.a aVar315 = aVar17;
                final long j16 = jC;
                final e23.a aVar316 = aVar19;
                final e23.a aVar317 = aVar20;
                final z zVar6 = zVar4;
                final String str211 = str16;
                final float f314 = f19;
                pVar4 = new e23.p() { // from class: yz1.x
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        switch (i914) {
                            case 0:
                                ((Integer) obj2).getClass();
                                y.d(rVar, dVar, str, str210, dVar2, d0Var, f314, i89, d0Var5, f27, str19, aVar314, z310, j16, rVar7, pVar, pVar2, aVar315, aVar316, aVar317, zVar6, str211, str18, aVar18, mVar2, p0.t(i15 | 1), p0.t(i16), p0.t(i17), i18);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                y.d(rVar, dVar, str, str210, dVar2, d0Var, f314, i89, d0Var5, f27, str19, aVar314, z310, j16, rVar7, pVar, pVar2, aVar315, aVar316, aVar317, zVar6, str211, str18, aVar18, mVar2, p0.t(i15 | 1), p0.t(i16), p0.t(i17), i18);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p2Var = p2VarI1;
            } else {
                f24 = f19;
                i84 = i77;
                f25 = f22;
                str20 = str18;
                aVar21 = aVar18;
                aVar22 = aVar13;
                z19 = z18;
                aVar23 = aVar17;
                aVar24 = aVar19;
                aVar25 = aVar20;
                zVar2 = zVar4;
                str21 = str16;
                o0VarE.C(1578097036);
                o0VarE.g0(false);
                long jA2 = am.j.A(d92.b.f58623a, o0VarE);
                bVar3 = d92.b.f58625c;
                bVar3.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarE2 = u1.n.e(rVar, jA2, k2.i.a(eVar.f97918c));
                h4.d.f81522a.getClass();
                gVar = h4.d.a.f81524b;
                i85 = i76;
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.getU());
                rVar5 = rVar4;
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarE2, o0VarE);
                h5.g.V.getClass();
                i86 = i79;
                aVar26 = h5.g.a.f81805b;
                if (r24 != 0) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                str22 = str17;
                if (o0VarE.T) {
                    o0VarE.M(aVar26);
                } else {
                    o0VarE.c();
                }
                eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar4 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    str23 = str21;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u uVar4 = c2.u.f22885a;
                    i87 = a.f200482a[zVar2.ordinal()];
                    if (i87 != 1) {
                        str24 = str23;
                        o0VarE.C(-570849012);
                        aVar27 = h4.r.S;
                        h4.r rVarD3 = x2.d(aVar27, 1.0f);
                        if (aVar25 != null) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((i86 & 1879048192) == 536870912) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objQ3 = o0VarE.q();
                        if (z25) {
                            aVar11.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new xx1.d(aVar25, 6);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new xx1.d(aVar25, 6);
                            o0VarE.K(objQ3);
                        }
                        h4.r rVarA11 = wz1.i.a((e23.l) objQ3, rVarD3, z24);
                        c2.j.f22691a.getClass();
                        kVar = c2.j.f22694d;
                        aVar28 = h4.d.a.f81536n;
                        zVarA = c2.y.a(kVar, aVar28, o0VarE, 0);
                        iHashCode2 = Long.hashCode(o0VarE.getU());
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarA11, o0VarE);
                        if (r24 != 0) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar26);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, zVarA, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        b0Var = c2.b0.f22601a;
                        h4.r rVarA12 = b0Var.a(x2.f(aVar27, 1.0f), 0.75f, true);
                        if (aVar23 != null) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if ((i86 & 29360128) == i24) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objQ4 = o0VarE.q();
                        if (z27) {
                            aVar11.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new xx1.d(aVar23, 7);
                                o0VarE.K(objQ4);
                            }
                        } else {
                            objQ4 = new xx1.d(aVar23, 7);
                            o0VarE.K(objQ4);
                        }
                        h4.r rVarA13 = wz1.i.a((e23.l) objQ4, rVarA12, z26);
                        zVarA2 = c2.y.a(kVar, aVar28, o0VarE, 0);
                        iHashCode3 = Long.hashCode(o0VarE.getU());
                        i2VarA2 = o0VarE.a0();
                        rVarC3 = h4.k.c(rVarA13, o0VarE);
                        if (r24 != 0) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar26);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, zVarA2, o0VarE);
                        b4.c(c1623g, i2VarA2, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                        } else {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                        }
                        b4.c(fVar, rVarC3, o0VarE);
                        h4.r rVarX3 = x2.x(x2.f(aVar27, 1.0f), null, 3);
                        bVar3.getClass();
                        float f315 = eVar.f97920e;
                        bVar3.getClass();
                        float f316 = eVar.f97920e;
                        bVar3.getClass();
                        aVar29 = aVar25;
                        aVar7 = aVar23;
                        d0Var4 = d0VarA;
                        a(c2.l.C(rVarX3, f316, f315, eVar.f97920e, 0.0f, 8), dVar, str, str22, dVar2, d0Var, f24, i84, d0Var4, f25, str19, aVar22, o0VarE, i85 & 2147483632, i86 & 126);
                        f17 = f25;
                        o0VarE = o0VarE;
                        aVar6 = aVar22;
                        str8 = str19;
                        if (rVar5 == null) {
                            o0VarE.C(397211641);
                            if (m(dVar)) {
                                o0VarE.C(397264651);
                                e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                            } else {
                                o0VarE.C(397348258);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(false);
                            aVar30 = aVar26;
                            rVar5 = rVar5;
                            str25 = str22;
                            eVar3 = eVar2;
                            c1623g2 = c1623g;
                            bVar5 = bVar4;
                            fVar2 = fVar;
                            z29 = true;
                        } else {
                            o0VarE.C(397388682);
                            z0VarD2 = c2.q.d(gVar, false);
                            iHashCode4 = Long.hashCode(o0VarE.getU());
                            i2VarA3 = o0VarE.a0();
                            rVar5 = rVar5;
                            rVarC4 = h4.k.c(rVar5, o0VarE);
                            if (r24 != 0) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                aVar30 = aVar26;
                                o0VarE.M(aVar30);
                            } else {
                                aVar30 = aVar26;
                                o0VarE.c();
                            }
                            eVar3 = eVar2;
                            b4.c(eVar3, z0VarD2, o0VarE);
                            c1623g2 = c1623g;
                            b4.c(c1623g2, i2VarA3, o0VarE);
                            if (o0VarE.T) {
                                str25 = str22;
                                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                                    bVar5 = bVar4;
                                }
                                fVar2 = fVar;
                                b4.c(fVar2, rVarC4, o0VarE);
                                if (m(dVar)) {
                                    o0VarE.C(-1562852519);
                                    z28 = false;
                                    e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                                } else {
                                    z28 = false;
                                    o0VarE.C(-1562761224);
                                    o0VarE.g0(false);
                                }
                                z29 = true;
                                o0VarE.g0(true);
                                o0VarE.g0(z28);
                            } else {
                                str25 = str22;
                            }
                            bVar5 = bVar4;
                            v.h.A(iHashCode4, o0VarE, iHashCode4, bVar5);
                            fVar2 = fVar;
                            b4.c(fVar2, rVarC4, o0VarE);
                            if (m(dVar)) {
                                o0VarE.C(-1562852519);
                                z28 = false;
                                e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                            } else {
                                z28 = false;
                                o0VarE.C(-1562761224);
                                o0VarE.g0(false);
                            }
                            z29 = true;
                            o0VarE.g0(true);
                            o0VarE.g0(z28);
                        }
                        o0VarE.g0(z29);
                        if (z19) {
                            aVar31 = aVar27;
                            o0VarE.C(48540664);
                            o0VarE.g0(false);
                        } else {
                            aVar31 = aVar27;
                            o0VarE.C(48540664);
                            o0VarE.g0(false);
                        }
                        objQ5 = o0VarE.q();
                        aVar11.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ5 == c2565a) {
                            objQ5 = new yq.d(12);
                            o0VarE.K(objQ5);
                        }
                        f26 = f24;
                        h4.r rVarA14 = b0Var.a(x2.f(p5.v.c((e23.l) objQ5, aVar31, true), 1.0f), 0.25f, true);
                        aVar32 = aVar24;
                        if (aVar32 != null) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        i88 = i84;
                        if ((i86 & 234881024) == i78) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objQ6 = o0VarE.q();
                        if (z35) {
                            objQ6 = new xx1.d(aVar32, 8);
                            o0VarE.K(objQ6);
                        } else {
                            objQ6 = new xx1.d(aVar32, 8);
                            o0VarE.K(objQ6);
                        }
                        h4.r rVarA15 = wz1.i.a((e23.l) objQ6, rVarA14, z34);
                        bVar3.getClass();
                        float f317 = eVar.f97920e;
                        bVar3.getClass();
                        h4.r rVarC8 = c2.l.C(rVarA15, f317, 0.0f, eVar.f97920e, 0.0f, 10);
                        z0VarD3 = c2.q.d(h4.d.a.f81528f, false);
                        iHashCode5 = Long.hashCode(o0VarE.getU());
                        i2VarA4 = o0VarE.a0();
                        rVarC5 = h4.k.c(rVarC8, o0VarE);
                        if (cVar2 != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar30);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar3, z0VarD3, o0VarE);
                        b4.c(c1623g2, i2VarA4, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode5, o0VarE, iHashCode5, bVar5);
                        } else {
                            v.h.A(iHashCode5, o0VarE, iHashCode5, bVar5);
                        }
                        b4.c(fVar2, rVarC5, o0VarE);
                        if (m(dVar)) {
                            o0VarE.C(1724190240);
                            pVar3 = pVar2;
                            z36 = false;
                            e5.q((i86 >> 18) & 14, pVar3, o0VarE, false);
                        } else {
                            pVar3 = pVar2;
                            z36 = false;
                            o0VarE.C(1724269042);
                            o0VarE.g0(false);
                        }
                        z37 = true;
                        e5.u(o0VarE, true, true, z36);
                        Unit unit5 = Unit.INSTANCE;
                    } else {
                        if (i87 == 2) {
                            throw kg.f.h(o0VarE, -570850499, false);
                        }
                        o0VarE.C(-570745729);
                        int i915 = i85 >> 9;
                        int i916 = ((i85 >> 3) & 14) | (i915 & 112) | (i915 & 896);
                        int i107 = i85 << 3;
                        int i108 = i916 | (i107 & 7168) | (i107 & 57344);
                        int i109 = i65 << 12;
                        String str212 = str23;
                        b(dVar, dVar2, d0Var, str, str22, str212, str20, aVar21, aVar25, o0VarE, i108 | (458752 & i109) | (3670016 & i109) | (i109 & 29360128) | ((i86 >> 3) & 234881024));
                        str24 = str212;
                        o0VarE.g0(false);
                        Unit unit6 = Unit.INSTANCE;
                        pVar3 = pVar2;
                        str25 = str22;
                        aVar32 = aVar24;
                        f26 = f24;
                        f17 = f25;
                        str8 = str19;
                        d0Var4 = d0VarA;
                        aVar6 = aVar22;
                        aVar29 = aVar25;
                        i88 = i84;
                        aVar7 = aVar23;
                        z37 = true;
                    }
                    o0VarE.g0(z37);
                    str11 = str25;
                    rVar3 = rVar5;
                    f16 = f26;
                    aVar8 = aVar32;
                    o0Var = o0VarE;
                    z16 = z19;
                    str10 = str20;
                    aVar10 = aVar21;
                    j14 = jC;
                    d0Var3 = d0Var4;
                    str9 = str24;
                    i67 = i88;
                    aVar9 = aVar29;
                } else {
                    str23 = str21;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar5 = c2.u.f22885a;
                i87 = a.f200482a[zVar2.ordinal()];
                if (i87 != 1) {
                    str24 = str23;
                    o0VarE.C(-570849012);
                    aVar27 = h4.r.S;
                    h4.r rVarD4 = x2.d(aVar27, 1.0f);
                    if (aVar25 != null) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i86 & 1879048192) == 536870912) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objQ3 = o0VarE.q();
                    if (z25) {
                        aVar11.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new xx1.d(aVar25, 6);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new xx1.d(aVar25, 6);
                        o0VarE.K(objQ3);
                    }
                    h4.r rVarA16 = wz1.i.a((e23.l) objQ3, rVarD4, z24);
                    c2.j.f22691a.getClass();
                    kVar = c2.j.f22694d;
                    aVar28 = h4.d.a.f81536n;
                    zVarA = c2.y.a(kVar, aVar28, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.getU());
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarA16, o0VarE);
                    if (r24 != 0) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar26);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    b0Var = c2.b0.f22601a;
                    h4.r rVarA17 = b0Var.a(x2.f(aVar27, 1.0f), 0.75f, true);
                    if (aVar23 != null) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if ((i86 & 29360128) == i24) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z27) {
                        aVar11.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new xx1.d(aVar23, 7);
                            o0VarE.K(objQ4);
                        }
                    } else {
                        objQ4 = new xx1.d(aVar23, 7);
                        o0VarE.K(objQ4);
                    }
                    h4.r rVarA18 = wz1.i.a((e23.l) objQ4, rVarA17, z26);
                    zVarA2 = c2.y.a(kVar, aVar28, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.getU());
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarA18, o0VarE);
                    if (r24 != 0) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar26);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                    } else {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    h4.r rVarX4 = x2.x(x2.f(aVar27, 1.0f), null, 3);
                    bVar3.getClass();
                    float f318 = eVar.f97920e;
                    bVar3.getClass();
                    float f319 = eVar.f97920e;
                    bVar3.getClass();
                    aVar29 = aVar25;
                    aVar7 = aVar23;
                    d0Var4 = d0VarA;
                    a(c2.l.C(rVarX4, f319, f318, eVar.f97920e, 0.0f, 8), dVar, str, str22, dVar2, d0Var, f24, i84, d0Var4, f25, str19, aVar22, o0VarE, i85 & 2147483632, i86 & 126);
                    f17 = f25;
                    o0VarE = o0VarE;
                    aVar6 = aVar22;
                    str8 = str19;
                    if (rVar5 == null) {
                        o0VarE.C(397211641);
                        if (m(dVar)) {
                            o0VarE.C(397264651);
                            e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                        } else {
                            o0VarE.C(397348258);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(false);
                        aVar30 = aVar26;
                        rVar5 = rVar5;
                        str25 = str22;
                        eVar3 = eVar2;
                        c1623g2 = c1623g;
                        bVar5 = bVar4;
                        fVar2 = fVar;
                        z29 = true;
                    } else {
                        o0VarE.C(397388682);
                        z0VarD2 = c2.q.d(gVar, false);
                        iHashCode4 = Long.hashCode(o0VarE.getU());
                        i2VarA3 = o0VarE.a0();
                        rVar5 = rVar5;
                        rVarC4 = h4.k.c(rVar5, o0VarE);
                        if (r24 != 0) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            aVar30 = aVar26;
                            o0VarE.M(aVar30);
                        } else {
                            aVar30 = aVar26;
                            o0VarE.c();
                        }
                        eVar3 = eVar2;
                        b4.c(eVar3, z0VarD2, o0VarE);
                        c1623g2 = c1623g;
                        b4.c(c1623g2, i2VarA3, o0VarE);
                        if (o0VarE.T) {
                            str25 = str22;
                            if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                                bVar5 = bVar4;
                            }
                            fVar2 = fVar;
                            b4.c(fVar2, rVarC4, o0VarE);
                            if (m(dVar)) {
                                o0VarE.C(-1562852519);
                                z28 = false;
                                e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                            } else {
                                z28 = false;
                                o0VarE.C(-1562761224);
                                o0VarE.g0(false);
                            }
                            z29 = true;
                            o0VarE.g0(true);
                            o0VarE.g0(z28);
                        } else {
                            str25 = str22;
                        }
                        bVar5 = bVar4;
                        v.h.A(iHashCode4, o0VarE, iHashCode4, bVar5);
                        fVar2 = fVar;
                        b4.c(fVar2, rVarC4, o0VarE);
                        if (m(dVar)) {
                            o0VarE.C(-1562852519);
                            z28 = false;
                            e5.q((i86 >> 15) & 14, pVar, o0VarE, false);
                        } else {
                            z28 = false;
                            o0VarE.C(-1562761224);
                            o0VarE.g0(false);
                        }
                        z29 = true;
                        o0VarE.g0(true);
                        o0VarE.g0(z28);
                    }
                    o0VarE.g0(z29);
                    if (z19) {
                        aVar31 = aVar27;
                        o0VarE.C(48540664);
                        o0VarE.g0(false);
                    } else {
                        aVar31 = aVar27;
                        o0VarE.C(48540664);
                        o0VarE.g0(false);
                    }
                    objQ5 = o0VarE.q();
                    aVar11.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ5 == c2565a) {
                        objQ5 = new yq.d(12);
                        o0VarE.K(objQ5);
                    }
                    f26 = f24;
                    h4.r rVarA19 = b0Var.a(x2.f(p5.v.c((e23.l) objQ5, aVar31, true), 1.0f), 0.25f, true);
                    aVar32 = aVar24;
                    if (aVar32 != null) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    i88 = i84;
                    if ((i86 & 234881024) == i78) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objQ6 = o0VarE.q();
                    if (z35) {
                        objQ6 = new xx1.d(aVar32, 8);
                        o0VarE.K(objQ6);
                    } else {
                        objQ6 = new xx1.d(aVar32, 8);
                        o0VarE.K(objQ6);
                    }
                    h4.r rVarA110 = wz1.i.a((e23.l) objQ6, rVarA19, z34);
                    bVar3.getClass();
                    float f3110 = eVar.f97920e;
                    bVar3.getClass();
                    h4.r rVarC9 = c2.l.C(rVarA110, f3110, 0.0f, eVar.f97920e, 0.0f, 10);
                    z0VarD3 = c2.q.d(h4.d.a.f81528f, false);
                    iHashCode5 = Long.hashCode(o0VarE.getU());
                    i2VarA4 = o0VarE.a0();
                    rVarC5 = h4.k.c(rVarC9, o0VarE);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar30);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar3, z0VarD3, o0VarE);
                    b4.c(c1623g2, i2VarA4, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode5, o0VarE, iHashCode5, bVar5);
                    } else {
                        v.h.A(iHashCode5, o0VarE, iHashCode5, bVar5);
                    }
                    b4.c(fVar2, rVarC5, o0VarE);
                    if (m(dVar)) {
                        o0VarE.C(1724190240);
                        pVar3 = pVar2;
                        z36 = false;
                        e5.q((i86 >> 18) & 14, pVar3, o0VarE, false);
                    } else {
                        pVar3 = pVar2;
                        z36 = false;
                        o0VarE.C(1724269042);
                        o0VarE.g0(false);
                    }
                    z37 = true;
                    e5.u(o0VarE, true, true, z36);
                    Unit unit7 = Unit.INSTANCE;
                } else {
                    if (i87 == 2) {
                        throw kg.f.h(o0VarE, -570850499, false);
                    }
                    o0VarE.C(-570745729);
                    int i917 = i85 >> 9;
                    int i918 = ((i85 >> 3) & 14) | (i917 & 112) | (i917 & 896);
                    int i1010 = i85 << 3;
                    int i1011 = i918 | (i1010 & 7168) | (i1010 & 57344);
                    int i1012 = i65 << 12;
                    String str213 = str23;
                    b(dVar, dVar2, d0Var, str, str22, str213, str20, aVar21, aVar25, o0VarE, i1011 | (458752 & i1012) | (3670016 & i1012) | (i1012 & 29360128) | ((i86 >> 3) & 234881024));
                    str24 = str213;
                    o0VarE.g0(false);
                    Unit unit8 = Unit.INSTANCE;
                    pVar3 = pVar2;
                    str25 = str22;
                    aVar32 = aVar24;
                    f26 = f24;
                    f17 = f25;
                    str8 = str19;
                    d0Var4 = d0VarA;
                    aVar6 = aVar22;
                    aVar29 = aVar25;
                    i88 = i84;
                    aVar7 = aVar23;
                    z37 = true;
                }
                o0VarE.g0(z37);
                str11 = str25;
                rVar3 = rVar5;
                f16 = f26;
                aVar8 = aVar32;
                o0Var = o0VarE;
                z16 = z19;
                str10 = str20;
                aVar10 = aVar21;
                j14 = jC;
                d0Var3 = d0Var4;
                str9 = str24;
                i67 = i88;
                aVar9 = aVar29;
            }
            p2Var.f135219d = pVar4;
        }
        pVar3 = pVar2;
        o0VarE.e();
        f16 = f14;
        i67 = i14;
        str8 = str3;
        aVar6 = aVar;
        z16 = z14;
        j14 = j8;
        rVar3 = rVar2;
        aVar7 = aVar2;
        aVar8 = aVar3;
        aVar9 = aVar4;
        zVar2 = zVar;
        str9 = str4;
        str10 = str5;
        aVar10 = aVar5;
        o0Var = o0VarE;
        str11 = str7;
        d0Var3 = d0Var2;
        f17 = f15;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i1013 = 1;
            final e23.p pVar6 = pVar3;
            pVar4 = new e23.p() { // from class: yz1.x
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    switch (i1013) {
                        case 0:
                            ((Integer) obj2).getClass();
                            y.d(rVar, dVar, str, str11, dVar2, d0Var, f16, i67, d0Var3, f17, str8, aVar6, z16, j14, rVar3, pVar, pVar6, aVar7, aVar8, aVar9, zVar2, str9, str10, aVar10, mVar2, p0.t(i15 | 1), p0.t(i16), p0.t(i17), i18);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            y.d(rVar, dVar, str, str11, dVar2, d0Var, f16, i67, d0Var3, f17, str8, aVar6, z16, j14, rVar3, pVar, pVar6, aVar7, aVar8, aVar9, zVar2, str9, str10, aVar10, mVar2, p0.t(i15 | 1), p0.t(i16), p0.t(i17), i18);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2Var = p2VarI0;
            p2Var.f135219d = pVar4;
        }
    }

    public static final void e(h4.r rVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1427987199);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(rVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarD, eVar.f97920e, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar3 = h4.r.S;
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar3, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.loading_error);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            d6.h.f57752b.getClass();
            int i15 = d6.h.f57755e;
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            bVar.getClass();
            float f14 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarC3 = c2.l.C(aVar3, 0.0f, f14, 0.0f, eVar.f97918c, 5);
            String strQ2 = gl1.y.Q(o0VarE, R.string.loading_error_message);
            fVar.getClass();
            mh.c(strQ2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 28);
        }
    }

    public static final float f(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        float f69051c = ((g6.c) mVar.A(t1.f91490h)).getF75992b();
        if (f69051c > 1.0f && f69051c <= 1.5f) {
            return wz1.b.f188181a;
        }
        if (f69051c > 1.5f) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            return j92.b.f97901d.f97908g;
        }
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        return j92.b.f97901d.f97906e;
    }

    public static final float g(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        float f69051c = ((g6.c) mVar.A(t1.f91490h)).getF75992b();
        if (f69051c > 1.0f && f69051c <= 1.5f) {
            g6.f.a aVar = g6.f.f75994b;
            return 8.0f;
        }
        if (f69051c > 1.5f) {
            g6.f.a aVar2 = g6.f.f75994b;
            return 10.0f;
        }
        g6.f.a aVar3 = g6.f.f75994b;
        return 6.0f;
    }

    public static final float h(float f14) {
        g6.f.a aVar = g6.f.f75994b;
        if ((f14 <= 1.0f || f14 > 1.5f) && f14 <= 1.5f) {
            return 260.0f;
        }
        return 260.0f * f14;
    }

    public static final float i(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        float f14 = ((g6.c) mVar.A(t1.f91490h)).getF75992b() > 1.5f ? 4.0f : 2.0f;
        g6.f.a aVar = g6.f.f75994b;
        return f14;
    }

    public static h4.r j(h4.r rVar, float f14) {
        float f15 = 170;
        g6.f.a aVar = g6.f.f75994b;
        float fH = h(f14);
        rVar.getClass();
        return rVar.then(f14 > 1.5f ? x2.r(rVar, f15 * 2, fH) : x2.r(rVar, f15, fH));
    }

    public static final float k(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        float fH = h(((g6.c) mVar.A(t1.f91490h)).getF75992b()) * 0.34f;
        g6.f.a aVar = g6.f.f75994b;
        return fH;
    }

    public static final float l(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        float f14 = ((g6.c) mVar.A(t1.f91490h)).getF75992b() > 1.5f ? 4.0f : 2.0f;
        g6.f.a aVar = g6.f.f75994b;
        return f14;
    }

    public static final boolean m(d dVar) {
        return (dVar == null || dVar.f200298a == u.LOADING) ? false : true;
    }
}
