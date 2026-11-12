package sz1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.f0;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import i3.xi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.t1;
import lc.u0;
import o4.d0;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import rk0.a1;
import s5.x0;
import s70.j1;
import sk0.k1;
import sk0.r1;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161559a;

        static {
            int[] iArr = new int[oz1.c.values().length];
            try {
                iArr[oz1.c.SLEEP_SCORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oz1.c.RECOVERY_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oz1.c.HRV_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[oz1.c.ACUTE_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[oz1.c.RECENT_SLEEP_SCORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[oz1.c.RECENT_STRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[oz1.c.RECENT_DIVES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f161559a = iArr;
        }
    }

    public static final void a(h4.r rVar, String str, int i14, d0 d0Var, p3.m mVar, int i15) {
        d0 d0Var2;
        o0 o0Var;
        int i16;
        o0 o0VarE = mVar.E(-1173162239);
        int i17 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.B(d0Var) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b() >= 1.5f;
            if (d0Var == null) {
                o0VarE.C(-1527090535);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                if (z14) {
                    d6.h.f57752b.getClass();
                    i16 = d6.h.f57757g;
                } else {
                    i16 = i14;
                }
                mh.c(str, rVar, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, z14 ? Integer.MAX_VALUE : 1, 0, null, x0VarB, o0VarE, ((i17 >> 3) & 14) | ((i17 << 3) & 112), 0, 113660);
                o0VarE.g0(false);
                d0Var2 = d0Var;
                o0Var = o0VarE;
            } else {
                o0VarE.C(-1526792470);
                h4.d.f81522a.getClass();
                h4.g.b bVar = h4.d.a.f81534l;
                h4.r rVarF = x2.f(rVar, 1.0f);
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                h4.r.a aVar2 = h4.r.S;
                h4.r rVarA = u2Var.a(aVar2, 1.0f, true);
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                h4.r rVarC2 = c2.l.C(rVarA, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11);
                d92.b.f58624b.getClass();
                x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
                d6.h.f57752b.getClass();
                mh.c(str, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(z14 ? d6.h.f57757g : d6.h.f57758h), 0L, 0, false, z14 ? Integer.MAX_VALUE : 1, 0, null, x0VarB2, o0VarE, (i17 >> 3) & 14, 0, 113660);
                o0Var = o0VarE;
                bVar3.getClass();
                d0Var2 = d0Var;
                c2.q.a(u1.n.e(l4.k.b(x2.q(aVar2, j92.b.f97901d.f97904c), k2.i.f102406a), d0Var2.f128833a, m1.f128891a), o0Var, 0);
                o0Var.g0(true);
                o0Var.g0(false);
            }
        } else {
            d0Var2 = d0Var;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.n(rVar, str, i14, d0Var2, i15);
        }
    }

    public static final void b(Context context, h4.r rVar, String str, String str2, p3.m mVar, int i14) {
        o0 o0Var;
        h4.r rVar2;
        c2.j.l lVar;
        h4.r.a aVar;
        boolean z14;
        o0 o0VarE = mVar.E(1110844859);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 48 | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1169) != 1168)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            if (str2 == null) {
                c2.j.f22691a.getClass();
                lVar = c2.j.f22696f;
            } else {
                c2.j.f22691a.getClass();
                lVar = c2.j.f22699i;
            }
            h4.d.f81522a.getClass();
            z zVarA = y.a(lVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (str2 == null || str2.equals("")) {
                o0Var = o0VarE;
                o0Var.C(-209290142);
                h4.g.b bVar2 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0Var, 48);
                int iHashCode2 = Long.hashCode(o0Var.U);
                i2 i2VarA1 = o0Var.a0();
                h4.r rVarC2 = h4.k.c(aVar2, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, s2VarA, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0Var);
                u2 u2Var = u2.f22900a;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarE = d92.c.e(d92.c.b(j92.f.f97932i, o0Var));
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                bVar3.getClass();
                aVar = aVar2;
                mh.c(str, c2.l.C(aVar2, f14, 0.0f, eVar2.f97918c, 0.0f, 10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, o0Var, (i15 >> 6) & 14, 0, 131068);
                z14 = true;
                o0Var.g0(true);
                o0Var.g0(false);
            } else {
                o0VarE.C(-209871919);
                h4.g.b bVar4 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA2 = q2.a(c2.j.f22692b, bVar4, o0VarE, 48);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(aVar2, o0VarE);
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
                b4.c(eVar, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var2 = u2.f22900a;
                d92.b.f58623a.getClass();
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0VarE2 = d92.c.e(d92.c.b(j92.f.f97932i, o0VarE));
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f15 = eVar3.f97920e;
                bVar5.getClass();
                aVar = aVar2;
                mh.c(str, c2.l.C(aVar2, f15, 0.0f, eVar3.f97918c, 0.0f, 10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE2, o0VarE, (i15 >> 6) & 14, 0, 131068);
                o0VarE.g0(true);
                fVar2.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                bVar5.getClass();
                float f16 = eVar3.f97920e;
                bVar5.getClass();
                mh.c(str2, c2.l.C(aVar, f16, eVar3.f97917b, 0.0f, 0.0f, 12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, (i15 >> 9) & 14, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
                z14 = true;
            }
            o0Var.g0(z14);
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1(context, rVar2, str, str2, i14, 2);
        }
    }

    public static final void c(oz1.a aVar, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        String strA;
        long jD;
        Object obj;
        aVar.getClass();
        int i16 = aVar.f134492c;
        oz1.c cVar = aVar.f134490a;
        o0 o0VarE = mVar.E(2123899829);
        int i17 = (o0VarE.B(aVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            o oVar = new o(context);
            cVar.getClass();
            switch (o.a.f161566a[cVar.ordinal()]) {
                case 1:
                    i15 = R.string.lbl_sleep_score;
                    break;
                case 2:
                    i15 = R.string.tr_factor_recovery_time;
                    break;
                case 3:
                    i15 = R.string.tr_factor_hrv_status;
                    break;
                case 4:
                    i15 = R.string.tr_factor_acute_load;
                    break;
                case 5:
                    i15 = R.string.tr_factor_recent_sleep_score;
                    break;
                case 6:
                    i15 = R.string.tr_factor_recent_stress;
                    break;
                case 7:
                    i15 = R.string.recent_dives;
                    break;
                default:
                    u0.r();
                    return;
            }
            String string = oVar.f161565b.getString(i15);
            String str = (cVar == oz1.c.RECENT_SLEEP_SCORE || cVar == oz1.c.RECENT_STRESS) ? null : aVar.f134491b;
            oz1.c cVar2 = oz1.c.RECOVERY_TIME;
            p3.m.a aVar2 = p3.m.f135153a;
            if (cVar == cVar2) {
                o0VarE.C(-357858663);
                if (str == null) {
                    o0VarE.C(-357858664);
                    o0VarE.g0(false);
                    strA = null;
                } else {
                    Object objH = r1.q2.h(o0VarE, 958287497, aVar2);
                    if (objH == p3.m.a.f135155b) {
                        objH = new r1(16);
                        o0VarE.K(objH);
                    }
                    strA = oi0.c.A(context, (e23.l) objH, str);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-357796012);
                o0VarE.g0(false);
                strA = str;
            }
            String strQ = gl1.y.Q(o0VarE, i16);
            Object objQ = o0VarE.q();
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new r1(17);
                o0VarE.K(objQ);
            }
            String strA2 = oi0.c.A(context, (e23.l) objQ, strQ);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            LinkedHashMap linkedHashMap = c0235a.f16962a;
            linkedHashMap.put("label_secondary", strA);
            linkedHashMap.put("value", strA2);
            b92.a aVarB = c0235a.b();
            int i18 = i17 & 14;
            switch (a.f161559a[cVar.ordinal()]) {
                case 1:
                    o0VarE.C(-723026049);
                    oz1.n.f134585c.getClass();
                    oz1.n nVarA = oz1.n.a.a(i16);
                    nVarA.getClass();
                    int i19 = oz1.o.f134596a[nVarA.ordinal()];
                    if (i19 == 1 || i19 == 2) {
                        o0VarE.C(-587266277);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).d();
                        o0VarE.g0(false);
                    } else if (i19 == 3) {
                        o0VarE.C(-587263428);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).h();
                        o0VarE.g0(false);
                    } else if (i19 == 4 || i19 == 5) {
                        o0VarE.C(-587258247);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).l();
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-587257121);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).g();
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                    break;
                case 2:
                    o0VarE.C(-722817233);
                    oz1.j.f134561c.getClass();
                    jD = oz1.k.a(oz1.j.a.a(i16), o0VarE);
                    o0VarE.g0(false);
                    break;
                case 3:
                    o0VarE.C(-722596327);
                    oz1.h.f134549c.getClass();
                    oz1.h hVarA = oz1.h.a.a(i16);
                    hVarA.getClass();
                    int i24 = oz1.i.f134560a[hVarA.ordinal()];
                    if (i24 == 1 || i24 == 2) {
                        o0VarE.C(1659564152);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).d();
                        o0VarE.g0(false);
                    } else if (i24 == 3) {
                        o0VarE.C(1659567001);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).h();
                        o0VarE.g0(false);
                    } else if (i24 == 4 || i24 == 5) {
                        o0VarE.C(1659572118);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).l();
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1659573276);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).g();
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                    break;
                case 4:
                    o0VarE.C(-722384907);
                    oz1.d.f134527c.getClass();
                    oz1.d dVarA = oz1.d.a.a(i16);
                    dVarA.getClass();
                    switch (oz1.e.f134540a[dVarA.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            o0VarE.C(-1213760609);
                            gl.c.f77766a.getClass();
                            jD = gl.c.a(o0VarE).d();
                            o0VarE.g0(false);
                            break;
                        case 5:
                            o0VarE.C(-1213757792);
                            gl.c.f77766a.getClass();
                            jD = gl.c.a(o0VarE).h();
                            o0VarE.g0(false);
                            break;
                        case 6:
                        case 7:
                            o0VarE.C(-1213752675);
                            gl.c.f77766a.getClass();
                            jD = gl.c.a(o0VarE).l();
                            o0VarE.g0(false);
                            break;
                        default:
                            o0VarE.C(-1213751549);
                            gl.c.f77766a.getClass();
                            jD = gl.c.a(o0VarE).g();
                            o0VarE.g0(false);
                            break;
                    }
                    o0VarE.g0(false);
                    break;
                case 5:
                    o0VarE.C(-722161180);
                    oz1.l.f134573c.getClass();
                    oz1.l lVarA = oz1.l.a.a(i16);
                    lVarA.getClass();
                    int i25 = oz1.m.f134584a[lVarA.ordinal()];
                    if (i25 == 1 || i25 == 2) {
                        o0VarE.C(2136371089);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).d();
                        o0VarE.g0(false);
                    } else if (i25 == 3) {
                        o0VarE.C(2136374002);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).h();
                        o0VarE.g0(false);
                    } else if (i25 == 4 || i25 == 5) {
                        o0VarE.C(2136379311);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).l();
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(2136380437);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).g();
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                    break;
                case 6:
                    o0VarE.C(-721926324);
                    oz1.p.f134597c.getClass();
                    oz1.p pVarA = oz1.p.a.a(i16);
                    pVarA.getClass();
                    int i26 = oz1.q.f134608a[pVarA.ordinal()];
                    if (i26 == 1 || i26 == 2) {
                        o0VarE.C(-1981755995);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).d();
                        o0VarE.g0(false);
                    } else if (i26 == 3) {
                        o0VarE.C(-1981753050);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).h();
                        o0VarE.g0(false);
                    } else if (i26 == 4 || i26 == 5) {
                        o0VarE.C(-1981747677);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).l();
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1981746551);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).g();
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                    break;
                case 7:
                    o0VarE.C(-721700334);
                    oz1.f.f134541b.getClass();
                    Iterator<T> it = oz1.f.f134546g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((oz1.f) next).f134547a == i16) {
                                obj = next;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    oz1.f fVar = (oz1.f) obj;
                    if (fVar == null) {
                        fVar = oz1.f.SHORT;
                    }
                    fVar.getClass();
                    x1 x1Var2 = p3.n.f135158a;
                    int i27 = oz1.g.f134548a[fVar.ordinal()];
                    if (i27 == 1 || i27 == 2) {
                        o0VarE.C(-181024797);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).l();
                        o0VarE.g0(false);
                    } else {
                        if (i27 != 3) {
                            throw kg.f.h(o0VarE, -181029726, false);
                        }
                        o0VarE.C(-181022106);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(o0VarE).h();
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                    break;
                default:
                    o0VarE.C(-23274157);
                    gl.c.f77766a.getClass();
                    jD = gl.c.a(o0VarE).g();
                    o0VarE.g0(false);
                    break;
            }
            boolean z14 = ((i17 & 112) == 32) | (i18 == 4);
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == p3.m.a.f135155b) {
                objQ2 = new j1(14, lVar, aVar);
                o0VarE.K(objQ2);
            }
            e23.a aVar3 = (e23.a) objQ2;
            if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() < 1.5f) {
                o0VarE.C(-357233579);
                h4.r.a aVar4 = h4.r.S;
                Object objQ3 = o0VarE.q();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new r1(18);
                    o0VarE.K(objQ3);
                }
                h4.r rVarC = v.c((e23.l) objQ3, aVar4, true);
                z3.e eVarC = z3.f.c(680683588, new f0(aVar, jD, 1), o0VarE);
                int i28 = b92.a.f16960b;
                l72.l.d(string, str, eVarC, rVarC, aVarB, false, aVar3, o0VarE, 384, 32);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                String str2 = str;
                o0VarE.C(-356572101);
                h4.r.a aVar5 = h4.r.S;
                Object objQ4 = o0VarE.q();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new r1(19);
                    o0VarE.K(objQ4);
                }
                h4.r rVarC2 = v.c((e23.l) objQ4, aVar5, true);
                z3.e eVarC2 = z3.f.c(1736637643, new xi(context, string, str2, aVar, jD), o0VarE);
                int i29 = b92.a.f16960b;
                l72.l.c(eVarC2, null, rVarC2, aVarB, false, aVar3, o0VarE, 6, 18);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a1(aVar, lVar, i14, 27);
        }
    }

    public static final int d(oz1.a aVar) {
        aVar.getClass();
        int i14 = aVar.f134492c;
        x1 x1Var = p3.n.f135158a;
        if (a.f161559a[aVar.f134490a.ordinal()] != 2) {
            return i14;
        }
        oz1.j.f134561c.getClass();
        return p005kotlin.jvm.internal.s.g(aVar.f134491b, "0h") ? R.string.lbl_recovered : oz1.j.a.a(i14).f134570a;
    }
}
