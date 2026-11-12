package wt0;

import a3.b1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bv1.v;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.x;
import com.garmin.android.apps.connectmobile.leaderboard.model.o;
import com.garmin.android.apps.connectmobile.leaderboard.model.s;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import g02.c0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import kotlin.t1;
import o4.g0;
import o4.h0;
import o4.u1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.y0;
import uu.i0;
import uu.p;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(boolean z14, tt0.e.a aVar, m mVar, int i14) {
        int i15;
        String strJ;
        boolean z15 = z14;
        tt0.a aVar2 = aVar.f166376f;
        o0 o0VarE = mVar.E(1790079611);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z15) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(aVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Integer num = aVar.f166375e;
            String strQ = y.Q(o0VarE, s.a(num != null ? s.b(num.intValue()) : null));
            String strJ2 = aVar.f166372b;
            if (strJ2 == null) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2015369752, R.string.challenge_title, o0VarE, false);
            } else {
                o0VarE.C(-2015370310);
                o0VarE.g0(false);
            }
            String strF = x.f(context, tt0.c.b(aVar), tt0.c.a(aVar));
            String strF2 = x.f(context, tt0.c.b(aVar), tt0.c.a(aVar));
            if (aVar2 instanceof tt0.a.C3128a) {
                o0VarE.C(1948654513);
                boolean zIsAfter = DateTime.now().isAfter(tt0.c.b(aVar));
                tt0.a.C3128a c3128a = (tt0.a.C3128a) aVar2;
                int i17 = c3128a.f166363a;
                if (i17 == 1) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1948807622, R.string.lbl_one_participant, o0VarE, false);
                } else {
                    o0VarE.C(1948912123);
                    l3.f23124b.getClass();
                    String str = l3.f23131i.format(Integer.valueOf(i17));
                    str.getClass();
                    strJ = y.P(R.string.lbl_num_participants, new Object[]{str}, o0VarE);
                    o0VarE.g0(false);
                }
                if (zIsAfter) {
                    o0VarE.C(1949126705);
                    l3.f23124b.getClass();
                    String str2 = l3.f23131i.format(c3128a.f166364b);
                    str2.getClass();
                    String str3 = l3.f23131i.format(Integer.valueOf(i17));
                    str3.getClass();
                    strJ = y.P(R.string.string_space_dot_space_string_pattern, new Object[]{strJ, y.P(R.string.lbl_rank_of_total, new Object[]{str2, str3}, o0VarE)}, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1949647753);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                if (!(aVar2 instanceof tt0.a.b)) {
                    throw kg.f.h(o0VarE, -2015352240, false);
                }
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1949780371, R.string.lbl_invitation_waiting, o0VarE, false);
            }
            String str4 = strJ;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            int i18 = 12;
            if (objQ == m.a.f135155b) {
                objQ = new wp.b(12);
                o0VarE.K(objQ);
            }
            String strA = oi0.c.A(context, (l) objQ, str4);
            z3.e eVarC = z3.f.c(816376380, new vy0.e(aVar, i18), o0VarE);
            j.f187024a.getClass();
            z3.e eVar = j.f187025b;
            if (p005kotlin.jvm.internal.s.g(strQ, strJ2)) {
                strQ = null;
            }
            z15 = z14;
            c(z15, eVarC, strJ2, strF, strF2, eVar, str4, strA, strQ, false, o0VarE, (i16 & 14) | 196656, 512);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(z15, aVar, i14, 11);
        }
    }

    public static final void b(boolean z14, final tt0.e.b bVar, gg1.o0 o0Var, m mVar, int i14) {
        boolean z15;
        int i15;
        Context context;
        String strA;
        String strA2;
        boolean z16 = bVar.f166385i;
        o0Var.getClass();
        o0 o0VarE = mVar.E(-174947621);
        if ((i14 & 6) == 0) {
            z15 = z14;
            i15 = (o0VarE.h(z15) ? 4 : 2) | i14;
        } else {
            z15 = z14;
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(bVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(o0Var.ordinal()) ? 256 : 128;
        }
        final int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            o.a aVar = o.f38245b;
            Integer num = bVar.f166386j;
            aVar.getClass();
            String strQ = y.Q(o0VarE, o.a.b(o.a.a(num)));
            String strJ = bVar.f166378b;
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -620929336, R.string.challenge_title, o0VarE, false);
            } else {
                o0VarE.C(-620929894);
                o0VarE.g0(false);
            }
            String strF = x.f(context2, tt0.c.b(bVar), tt0.c.a(bVar));
            String strJ2 = x.j(context2, tt0.c.b(bVar), tt0.c.a(bVar), true, true);
            if (z16) {
                context = context2;
                strA = p.a(context, bVar.f166380d, bVar.f166381e, bVar.f166379c, (80 & 16) == 0, o0Var, false);
            } else {
                context = context2;
                strA = null;
            }
            if (z16) {
                int i18 = p.f172734a;
                strA2 = p.a(context, bVar.f166380d, bVar.f166381e, bVar.f166379c, (80 & 16) == 0, o0Var, false);
            } else {
                strA2 = null;
            }
            final int i19 = 1;
            c(z15, z3.f.c(1017791452, new e23.p() { // from class: wt0.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i24 = i17;
                    tt0.e.b bVar2 = bVar;
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i24) {
                        case 0:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                d.f(bVar2, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                if (bVar2.f166385i) {
                                    mVar2.C(1200229350);
                                    d.g(bVar2.f166382f, mVar2, 0);
                                } else {
                                    mVar2.C(-1447551606);
                                }
                                mVar2.f();
                            } else {
                                mVar2.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), strJ, strF, strJ2, z3.f.c(479460696, new e23.p() { // from class: wt0.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i24 = i19;
                    tt0.e.b bVar2 = bVar;
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i24) {
                        case 0:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                d.f(bVar2, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                if (bVar2.f166385i) {
                                    mVar2.C(1200229350);
                                    d.g(bVar2.f166382f, mVar2, 0);
                                } else {
                                    mVar2.C(-1447551606);
                                }
                                mVar2.f();
                            } else {
                                mVar2.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), strA, strA2, !p005kotlin.jvm.internal.s.g(strQ, strJ) ? strQ : null, bVar.f166387k, o0VarE, (i16 & 14) | 196656, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(z14, bVar, o0Var, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0208  */
    /* JADX WARN: Code duplicated, block: B:104:0x022f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0236  */
    /* JADX WARN: Code duplicated, block: B:107:0x023a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0255  */
    /* JADX WARN: Code duplicated, block: B:115:0x0294  */
    /* JADX WARN: Code duplicated, block: B:117:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:120:0x031a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0325  */
    /* JADX WARN: Code duplicated, block: B:123:0x036e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0372  */
    /* JADX WARN: Code duplicated, block: B:77:0x0131  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ed  */
    public static final void c(boolean z14, z3.e eVar, String str, String str2, String str3, e23.p pVar, String str4, String str5, String str6, boolean z15, m mVar, int i14, int i15) {
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        x0 x0VarB;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        u2 u2Var;
        int i18;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        j92.f fVar2;
        x0 x0Var;
        str.getClass();
        str2.getClass();
        str3.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-625271442);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.h(z14) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i19 = i16 | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192) | (o0VarE.B(str4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(str5) ? 8388608 : 4194304) | (o0VarE.B(str6) ? 67108864 : 33554432);
        int i24 = i15 & 512;
        if (i24 != 0) {
            i17 = i19 | C.ENCODING_PCM_32BIT;
            z16 = z15;
        } else {
            z16 = z15;
            i17 = i19 | (o0VarE.h(z16) ? 536870912 : 268435456);
        }
        if (o0VarE.n(i17 & 1, (i17 & 306783379) != 306783378)) {
            boolean z18 = i24 != 0 ? false : z16;
            x1 x1Var = n.f135158a;
            if (z14) {
                o0VarE.C(409578046);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.f(j92.f.f97931h, o0VarE);
            } else {
                o0VarE.C(409579228);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            }
            o0VarE.g0(false);
            x0 x0Var2 = x0VarB;
            r.a aVar = r.S;
            boolean z19 = ((234881024 & i17) == 67108864) | ((i17 & 896) == 256) | ((57344 & i17) == 16384) | ((29360128 & i17) == 8388608);
            Object objQ = o0VarE.q();
            if (z19) {
                c0 c0Var = new c0(1, str6, str, str3, str5);
                o0VarE.K(c0Var);
                objQ = c0Var;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    c0 c0Var2 = new c0(1, str6, str, str3, str5);
                    o0VarE.K(c0Var2);
                    objQ = c0Var2;
                }
            }
            r rVarC3 = p5.v.c((l) objQ, aVar, false);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81533k;
            s2 s2VarA2 = q2.a(iVarI, bVar2, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC4 = k.c(rVarC3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, s2VarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC4, o0VarE);
                u2Var = u2.f22900a;
                eVar.invoke(o0VarE, 6);
                bVar.getClass();
                i18 = i17;
                zVarA = c2.y.a(c2.j.i(eVar2.f97918c), h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(aVar, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                r rVarF = x2.f(aVar, 1.0f);
                s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarF, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                mh.c(str, u2Var.c(u2Var.a(aVar, 1.0f, false), h4.d.a.f81534l), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0VarE, (i18 >> 6) & 14, 0, 131068);
                if (z18) {
                    o0VarE.C(-1227883064);
                    r rVarC5 = u2Var.c(aVar, bVar2);
                    bVar.getClass();
                    float f15 = eVar2.f97920e;
                    bVar.getClass();
                    y0.a(n5.c.a(2131232836, o0VarE, 0), y.Q(o0VarE, R.string.default_image_view_content_description), c2.l.C(rVarC5, f15, eVar2.f97917b, 0.0f, 0.0f, 12), null, null, 0.0f, null, o0VarE, 0, 120);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1227451978);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97933j;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i18 >> 9) & 14, 0, 131070);
                o0VarE = o0VarE;
                pVar.invoke(o0VarE, 6);
                if (str4 == null) {
                    o0VarE.C(-1373482275);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1373482274);
                    fVar2.getClass();
                    mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, (i18 >> 18) & 14, 0, 131070);
                    o0VarE = o0VarE;
                    Unit unit = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(true);
                z17 = z18;
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC4, o0VarE);
            u2Var = u2.f22900a;
            eVar.invoke(o0VarE, 6);
            bVar.getClass();
            i18 = i17;
            zVarA = c2.y.a(c2.j.i(eVar2.f97918c), h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(aVar, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            r rVarF2 = x2.f(aVar, 1.0f);
            s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(rVarF2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            mh.c(str, u2Var.c(u2Var.a(aVar, 1.0f, false), h4.d.a.f81534l), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0VarE, (i18 >> 6) & 14, 0, 131068);
            if (z18) {
                o0VarE.C(-1227883064);
                r rVarC6 = u2Var.c(aVar, bVar2);
                bVar.getClass();
                float f16 = eVar2.f97920e;
                bVar.getClass();
                y0.a(n5.c.a(2131232836, o0VarE, 0), y.Q(o0VarE, R.string.default_image_view_content_description), c2.l.C(rVarC6, f16, eVar2.f97917b, 0.0f, 0.0f, 12), null, null, 0.0f, null, o0VarE, 0, 120);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1227451978);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97933j;
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i18 >> 9) & 14, 0, 131070);
            o0VarE = o0VarE;
            pVar.invoke(o0VarE, 6);
            if (str4 == null) {
                o0VarE.C(-1373482275);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1373482274);
                fVar2.getClass();
                mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, (i18 >> 18) & 14, 0, 131070);
                o0VarE = o0VarE;
                Unit unit2 = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
            z17 = z18;
        } else {
            o0VarE.e();
            z17 = z16;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new il1.d(z14, eVar, str, str2, str3, pVar, str4, str5, str6, z17, i14, i15);
        }
    }

    public static final void d(boolean z14, final tt0.e.c cVar, gg1.o0 o0Var, m mVar, int i14) {
        int i15;
        o0Var.getClass();
        o0 o0VarE = mVar.E(-18463473);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(cVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(o0Var.ordinal()) ? 256 : 128;
        }
        final int i17 = 1;
        final int i18 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.lbl_expedition);
            String strJ = cVar.f166390c;
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -563518244, R.string.challenge_title, o0VarE, false);
            } else {
                o0VarE.C(-563518802);
                o0VarE.g0(false);
            }
            String strP = y.P(R.string.lbl_value_completed, new Object[]{y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(cVar.f166393f)}, o0VarE)}, o0VarE);
            String strA = p.a(context, cVar.f166391d, cVar.f166392e, cVar.f166389b, (80 & 16) == 0, o0Var, false);
            String strA2 = p.a(context, cVar.f166391d, cVar.f166392e, cVar.f166389b, (80 & 16) == 0, o0Var, false);
            z3.e eVarC = z3.f.c(-1796900656, new e23.p() { // from class: wt0.a
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    tt0.e.c cVar2 = cVar;
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i19) {
                        case 0:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                d.f(cVar2, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                d.g(cVar2.f166393f, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            z3.e eVarC2 = z3.f.c(-914192564, new e23.p() { // from class: wt0.a
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i17;
                    tt0.e.c cVar2 = cVar;
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i19) {
                        case 0:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                d.f(cVar2, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                d.g(cVar2.f166393f, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            if (p005kotlin.jvm.internal.s.g(strQ, strJ)) {
                strQ = null;
            }
            c(z14, eVarC, strJ, strP, strP, eVarC2, strA, strA2, strQ, false, o0VarE, (i16 & 14) | 196656, 512);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(z14, cVar, o0Var, i14, 29);
        }
    }

    public static final void e(int i14, r rVar, String str, m mVar) {
        o0 o0VarE = mVar.E(1786211588);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strB = i0.b(0, str);
            t4.d dVarA = n5.c.a(2131231129, o0VarE, 0);
            t4.d dVarA2 = n5.c.a(2131231129, o0VarE, 0);
            o4.e0.a aVar = o4.e0.f128843b;
            float[] fArrA = g0.a();
            g0.b(0.0f, fArrA);
            Unit unit = Unit.INSTANCE;
            aVar.getClass();
            jf.r.b(strB, null, rVar, dVarA, dVarA2, null, null, null, null, null, null, new h0(fArrA, (p005kotlin.jvm.internal.j) null), o0VarE, ((i15 << 6) & 896) | 48, 0, 28640);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(rVar, str, i14, 11);
        }
    }

    public static final void f(tt0.e eVar, m mVar, int i14) {
        u4.d dVarA;
        o0 o0VarE = mVar.E(347326874);
        int i15 = (o0VarE.B(eVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarU = x2.u(aVar, h(o0VarE));
            if (eVar instanceof tt0.e.b) {
                o0VarE.C(638848968);
                e(0, rVarU, ((tt0.e.b) eVar).f166377a, o0VarE);
                o0VarE.g0(false);
            } else if (eVar instanceof tt0.e.c) {
                o0VarE.C(639026536);
                e(0, rVarU, ((tt0.e.c) eVar).f166388a, o0VarE);
                o0VarE.g0(false);
            } else {
                if (!(eVar instanceof tt0.e.a)) {
                    throw kg.f.h(o0VarE, -1226319262, false);
                }
                o0VarE.C(639208134);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA = c2.l.A(aVar, 0.0f, j92.b.f97899b.f97917b, 1);
                Integer num = ((tt0.e.a) eVar).f166375e;
                s sVarB = num != null ? s.b(num.intValue()) : null;
                if (sVarB == null || (dVarA = com.garmin.android.apps.connectmobile.leaderboard.model.y.b(sVarB)) == null) {
                    s62.a.f157643a.getClass();
                    dVarA = u62.a.a(t62.a.f162797a);
                }
                u4.d dVar = dVarA;
                f02.h.f67736a.getClass();
                long jA = f02.h.a(o0VarE);
                gl.c.f77766a.getClass();
                g02.i.a(rVarA, dVar, jA, gl.c.a(o0VarE).c(), h(o0VarE), 0.0f, null, o0VarE, 0, 224);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vy0.e(eVar, i14, 11);
        }
    }

    public static final void g(int i14, m mVar, int i15) {
        o0 o0VarE = mVar.E(-1309762695);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            g6.f.a aVar = g6.f.f75994b;
            r rVarH = x2.h(c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), 6);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new wp.b(13);
                o0VarE.K(objQ);
            }
            r rVarC = p5.v.c((l) objQ, rVarH, false);
            f02.e.f67730a.getClass();
            long jC = f02.e.c(o0VarE);
            gl.c.f77766a.getClass();
            long jF = gl.c.a(o0VarE).f();
            u1.f129010b.getClass();
            b1.c(i14 / 100.0f, u1.f129011c, 0, jF, jC, rVarC, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.e(i14, i15, 14);
        }
    }

    public static final float h(m mVar) {
        x1 x1Var = n.f135158a;
        float f75992b = ((g6.c) mVar.A(t1.f91490h)).getF75992b();
        if (f75992b > 1.0f && f75992b <= 1.5f) {
            return wz1.b.f188181a;
        }
        if (f75992b > 1.5f) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            return j92.b.f97901d.f97908g;
        }
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        return j92.b.f97901d.f97906e;
    }
}
