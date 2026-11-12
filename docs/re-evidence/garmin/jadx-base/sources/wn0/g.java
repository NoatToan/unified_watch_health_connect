package wn0;

import a11.v;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import f72.b2;
import gl1.y;
import h4.r;
import h5.e0;
import i3.e9;
import i3.mc;
import i3.mh;
import i3.ua;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l72.s;
import lc.u0;
import o4.m1;
import p005kotlin.Unit;
import p13.j0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import s5.x0;
import u1.w;
import v62.fa;
import vd0.s0;
import w51.n0;
import w52.k0;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f186119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f186120b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186121a;

        static {
            int[] iArr = new int[in0.m.values().length];
            try {
                iArr[in0.m.HRV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[in0.m.HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[in0.m.SKIN_TEMP_C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[in0.m.SKIN_TEMP_F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[in0.m.RESPIRATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[in0.m.PULSE_OX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f186121a = iArr;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f186119a = 3;
        f186120b = 36;
    }

    public static final void a(in0.m mVar, in0.h.a aVar, un0.a aVar2, e23.a<Unit> aVar3, p3.m mVar2, int i14) {
        int i15;
        String strA;
        o0 o0VarE = mVar2.E(-1741960897);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(mVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar2) : o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar3) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            in0.h.a.C1802a c1802a = aVar.f94451b;
            rn0.a.f153638a.getClass();
            String strQ = y.Q(o0VarE, rn0.a.a(mVar));
            in0.h.a.C1802a.EnumC1803a enumC1803a = c1802a.f94454b;
            j23.g<Double> gVar = c1802a.f94453a;
            l22.a aVar4 = aVar2.f172043a;
            String strG = aVar2.g(mVar, gVar, true);
            int i16 = un0.a.b.f172044a[enumC1803a.ordinal()];
            if (i16 == 1) {
                strA = aVar4.a(R.string.lbl_below, strG);
            } else if (i16 == 2) {
                strA = aVar4.a(R.string.lbl_above_speed, strG);
            } else {
                if (i16 != 3) {
                    u0.r();
                    return;
                }
                strA = aVar4.a(R.string.lbl_calories_within, strG);
            }
            z3.e eVarC = z3.f.c(1155887667, new s0(mVar, 10, aVar, aVar2), o0VarE);
            r.a aVar5 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            l72.l.d(strQ, strA, eVarC, c2.l.A(aVar5, 0.0f, j92.b.f97899b.f97917b, 1), null, false, aVar3, o0VarE, ((i15 << 9) & 3670016) | 384, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c((Object) mVar, (Object) aVar, (Object) aVar2, (Object) aVar3, i14, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    public static final void b(nk0.l lVar, e23.a aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1920866315);
        int i15 = i14 | (o0VarE.r(lVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            s sVar = s.f111232a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
            s62.a.f157643a.getClass();
            u4.d dVarA = b2.a(t62.c.f162799a);
            String strQ = y.Q(o0VarE, R.string.lbl_track_your_status);
            String strQ2 = y.Q(o0VarE, R.string.msg_track_your_status);
            String strQ3 = y.Q(o0VarE, R.string.lbl_go_to_home_settings);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new vv0.n(23, lVar, aVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new vv0.n(23, lVar, aVar);
                    o0VarE.K(objQ);
                }
            }
            sVar.c(rVarC, dVarA, null, null, strQ, strQ2, strQ3, false, aVar, (e23.a) objQ, o0VarE, (i15 << 24) & 1879048192, 0, 396);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wb1.i(lVar, aVar, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01a7  */
    public static final void c(in0.e eVar, un0.a aVar, nk0.l lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String string;
        int i16;
        l22.a aVar2 = aVar.f172043a;
        o0 o0VarE = mVar.E(1213026490);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar3 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
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
            b0 b0Var = b0.f22601a;
            eVar.getClass();
            in0.e.b bVar2 = in0.e.b.f94434a;
            if (eVar.equals(bVar2)) {
                string = g22.n.a(aVar2.getString(R.string.lbl_calibration_in_progress));
            } else if (eVar.equals(in0.e.a.f94433a)) {
                string = aVar2.getString(R.string.lbl_your_metrics_look_good);
            } else if (eVar instanceof in0.e.C1801e) {
                int i17 = ((in0.e.C1801e) eVar).f94437a;
                string = i17 == 1 ? aVar2.getString(R.string.lbl_one_outlier) : aVar2.a(R.string.lbl_x_outliers, Integer.valueOf(i17));
            } else if (eVar.equals(in0.e.c.f94435a) || eVar.equals(in0.e.d.f94436a)) {
                string = aVar2.getString(R.string.msg_no_data_available);
            } else {
                if (!eVar.equals(in0.e.f.f94439a)) {
                    u0.r();
                    return;
                }
                string = aVar2.getString(R.string.lbl_wrist_hr_turned_off);
            }
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(string, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97929f, o0VarE), o0VarE, 0, 0, 131070);
            if (eVar.equals(bVar2)) {
                i16 = R.string.msg_health_status_calibration_in_progress;
            } else if (eVar.equals(in0.e.a.f94433a)) {
                i16 = R.string.msg_health_status_significant_impact;
            } else if (eVar.equals(in0.e.c.f94435a)) {
                i16 = R.string.msg_health_status_no_data_available;
            } else if (eVar instanceof in0.e.C1801e) {
                if (((in0.e.C1801e) eVar).f94438b) {
                    i16 = R.string.msg_health_status_significant_impact;
                } else {
                    i16 = R.string.msg_health_status_less_impact;
                }
            } else if (eVar.equals(in0.e.d.f94436a)) {
                i16 = R.string.msg_health_status_not_capable_device;
            } else {
                if (!eVar.equals(in0.e.f.f94439a)) {
                    u0.r();
                    return;
                }
                i16 = R.string.msg_wrist_hr_turned_off;
            }
            String string2 = aVar2.getString(i16);
            fVar.getClass();
            x0 x0Var = j92.f.f97931h;
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            mh.c(string2, c2.l.C(aVar3, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            if ((eVar instanceof in0.e.d) || (eVar instanceof in0.e.f)) {
                o0Var.C(240443528);
                String strQ = y.Q(o0Var, R.string.common_learn_more);
                fVar.getClass();
                x0 x0VarA = x0.a(x0Var, hb.a.e(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                bVar3.getClass();
                mh.c(strQ, w.d(c2.l.C(aVar3, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), false, null, null, lVar, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var, 0, 0, 131068);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(240770578);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(eVar, aVar, lVar, i14, 5);
        }
    }

    public static final void d(in0.h.a.C1802a c1802a, in0.m mVar, p3.m mVar2, int i14) {
        int i15;
        o0 o0VarE = mVar2.E(1070939987);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(c1802a) : o0VarE.r(c1802a) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(mVar.ordinal()) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = mVar != in0.m.PULSE_OX;
            in0.h.a.C1802a.EnumC1803a enumC1803a = c1802a.f94454b;
            z72.k.a(x2.q(r.S, f186120b), ao0.d.a(z14, enumC1803a, o0VarE, 0, 0), Float.valueOf(ao0.d.b(c1802a.f94455c, enumC1803a, z14)), null, null, f186119a, 1.5f, false, false, null, o0VarE, 1769478, 920);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(c1802a, mVar, i14, 9);
        }
    }

    public static final void e(i53.c cVar, in0.e eVar, in0.g gVar, e23.p pVar, e23.l lVar, nk0.l lVar2, boolean z14, nk0.l lVar3, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        e23.l lVar4;
        o0 o0VarE = mVar.E(206607625);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            lVar4 = lVar;
            i15 |= o0VarE.r(lVar4) ? 16384 : 8192;
        } else {
            lVar4 = lVar;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            un0.a aVar2 = new un0.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            r rVarE = u1.n.e(x2.d(r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            r rVarY = c2.l.y(rVarE, j92.b.f97899b.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            c0.c(b0.f22601a, z14, null, null, null, null, z3.f.c(-1175182761, new vv0.e(14, lVar3, aVar), o0VarE), o0VarE, 1572870 | ((i15 >> 15) & 112), 30);
            int i16 = i15 >> 3;
            int i17 = un0.a.f172042b;
            c(eVar, aVar2, lVar2, o0VarE, (i16 & 14) | (i17 << 3) | ((i15 >> 9) & 896));
            n(cVar, gVar, aVar2, pVar, lVar4, o0VarE, (i16 & 112) | in0.h.f94445e | (i15 & 14) | (i17 << 6) | (i15 & 7168) | (i15 & 57344));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(cVar, eVar, gVar, pVar, lVar, lVar2, z14, lVar3, aVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0172  */
    /* JADX WARN: Code duplicated, block: B:113:0x017d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0181  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(in0.c cVar, l lVar, e23.a aVar, nk0.l lVar2, nk0.l lVar3, nk0.l lVar4, p3.m mVar, int i14) {
        int i15;
        l lVar5;
        boolean z14;
        in0.e eVar;
        in0.e c1801e;
        in0.e eVar2;
        int i16;
        mc mcVar;
        o53.b0 b0Var;
        List list = cVar.f94424e;
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1092909944);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar4) ? 131072 : 65536;
        }
        int i17 = i15;
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(lVar.f186139j, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var2 = (o53.b0) objQ;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            b63.o oVar = cVar.f94420a;
            i53.c cVarE = i53.a.e(list == null ? j0.f134944a : list);
            in0.g gVar = cVar.f94425f;
            lVar.f186132c.getClass();
            if (list == null) {
                list = j0.f134944a;
            }
            if (in0.l.a(list)) {
                c1801e = in0.e.b.f94434a;
                z14 = true;
            } else {
                if (in0.l.c(list)) {
                    if (list.isEmpty()) {
                        i16 = 0;
                    } else {
                        Iterator it = list.iterator();
                        int i18 = 0;
                        while (it.hasNext()) {
                            in0.h.a aVar2 = ((in0.h) it.next()).f94447b;
                            if (aVar2 != null && in0.l.d(aVar2) && (i18 = i18 + 1) < 0) {
                                x.p();
                                throw null;
                            }
                        }
                        i16 = i18;
                    }
                    c1801e = new in0.e.C1801e(i16, gVar != null ? gVar.f94442a.isEmpty() : true);
                } else {
                    if (in0.l.b(list)) {
                        eVar2 = in0.e.a.f94433a;
                    } else if (gVar == null || !gVar.f94444c) {
                        if (list.isEmpty()) {
                            z14 = true;
                            eVar = in0.e.c.f94435a;
                        } else if (list.isEmpty()) {
                            if (gVar != null) {
                                z14 = true;
                                if (gVar.f94442a.containsAll(in0.m.f94504i)) {
                                    eVar = in0.e.d.f94436a;
                                }
                            } else {
                                z14 = true;
                            }
                            eVar = in0.e.c.f94435a;
                        } else {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    if (gVar != null) {
                                        z14 = true;
                                        if (gVar.f94442a.containsAll(in0.m.f94504i)) {
                                            eVar = in0.e.d.f94436a;
                                        }
                                    }
                                    eVar = in0.e.c.f94435a;
                                } else if (((in0.h) it3.next()).f94447b == null) {
                                }
                                z14 = true;
                                eVar = in0.e.c.f94435a;
                            }
                        }
                        c1801e = eVar;
                    } else {
                        eVar2 = in0.e.f.f94439a;
                    }
                    c1801e = eVar2;
                }
                z14 = true;
            }
            boolean zR = o0VarE.r(lVar) | o0VarE.r(oVar) | o0VarE.r(b0Var2) | o0VarE.B(mcVarF);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == p3.m.a.f135155b) {
                lVar5 = lVar;
                mcVar = mcVarF;
                b0Var = b0Var2;
                w21.d dVar = new w21.d(lVar5, oVar, b0Var, mcVar, 10);
                o0VarE.K(dVar);
                objQ2 = dVar;
            } else {
                lVar5 = lVar;
                mcVar = mcVarF;
                b0Var = b0Var2;
            }
            e23.p pVar = (e23.p) objQ2;
            boolean z15 = (i17 & 896) == 256 ? z14 : false;
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == p3.m.a.f135155b) {
                objQ3 = new rx1.m(aVar, 23);
                o0VarE.K(objQ3);
            }
            e23.l lVar6 = (e23.l) objQ3;
            boolean z16 = ((p) p1VarC.getF182175a()).f186168d;
            boolean zR2 = o0VarE.r(lVar5);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == p3.m.a.f135155b) {
                objQ4 = new c(lVar5, 0);
                o0VarE.K(objQ4);
            }
            int i19 = 9;
            e(cVarE, c1801e, gVar, pVar, lVar6, lVar2, z16, lVar3, (e23.a) objQ4, o0VarE, in0.h.f94445e | ((i17 << 6) & 458752) | ((i17 << 9) & 29360128));
            o0VarE = o0VarE;
            if (mcVar.e()) {
                o0VarE.C(-1265428436);
                q qVar = (q) s9.c.c(lVar5.f186141l, o0VarE).getF182175a();
                if (qVar == null) {
                    o0VarE.C(-1265303693);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1265303692);
                    rn0.a aVar3 = rn0.a.f153638a;
                    in0.m f186172a = qVar.getF186172a();
                    aVar3.getClass();
                    String strQ = y.Q(o0VarE, rn0.a.a(f186172a));
                    boolean zR3 = o0VarE.r(b0Var) | o0VarE.B(mcVar);
                    Object objQ5 = o0VarE.q();
                    if (zR3 || objQ5 == p3.m.a.f135155b) {
                        objQ5 = new nw0.n(b0Var, mcVar, 21);
                        o0VarE.K(objQ5);
                    }
                    w13.b.b(strQ, mcVar, (e23.a) objQ5, z3.f.c(1012394255, new wb1.i(i19, qVar, lVar4), o0VarE), o0VarE, 3072);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1264630806);
                o0VarE.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            lVar5 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(cVar, lVar5, aVar, lVar2, lVar3, lVar4, i14, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(u82.f fVar, l lVar, e23.a aVar, nk0.l lVar2, e23.a aVar2, nk0.l lVar3, nk0.l lVar4, p3.m mVar, int i14) {
        int i15;
        fVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1620899400);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(!(fVar instanceof u82.f.b) ? fVar : null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean z14 = fVar instanceof u82.f.b;
            Boolean boolValueOf = Boolean.valueOf(!z14);
            boolean z15 = (i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(fVar));
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new d(fVar, p1Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((e23.p) objQ2, boolValueOf, o0VarE);
            u82.f fVar2 = z14 ? (u82.f) p1Var.getF182175a() : fVar;
            in0.c cVar = (in0.c) fVar.a();
            boolean z16 = fVar2 instanceof u82.f.c;
            if (z16 && cVar != null) {
                o0VarE.C(104135379);
                int i16 = (i15 & 112) | 8 | (i15 & 896) | (i15 & 7168);
                int i17 = i15 >> 3;
                f(cVar, lVar, aVar, lVar2, lVar3, lVar4, o0VarE, i16 | (57344 & i17) | (i17 & 458752));
                o0VarE.g0(false);
            } else if ((fVar2 instanceof u82.f.a) || z16) {
                o0VarE.C(104658504);
                h(aVar2, o0VarE, (i15 >> 12) & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(104727882);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(fVar, lVar, aVar, lVar2, aVar2, lVar3, lVar4, i14, 28);
        }
    }

    public static final void h(e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(-1361694143);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r rVarD = x2.d(r.S, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            s62.a.f157643a.getClass();
            aVar2 = aVar;
            b82.n.d(fa.a(t62.b.f162798a), y.Q(o0VarE, R.string.lbl_error_occurred), y.Q(o0VarE, R.string.problem_loading_refresh), null, y.Q(o0VarE, R.string.lbl_try_again), aVar2, null, null, o0VarE, (i15 << 15) & 458752, 200);
            o0VarE.g0(true);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar2, i14, 19);
        }
    }

    public static final void i(String str, z3.e eVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarE = mVar.E(1322701786);
        int i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarC = c2.l.C(aVar, 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            bVar.getClass();
            i15 = 1;
            mh.c(upperCase, c2.l.A(aVar, 0.0f, eVar2.f97918c, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            b71.i.n(6, eVar, o0Var, true);
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ml1.a(str, eVar, i14, i15);
        }
    }

    public static final void j(r rVar, in0.m mVar, in0.h.a aVar, un0.a aVar2, p3.m mVar2, int i14) {
        int i15;
        in0.m mVar3;
        o0 o0Var;
        String strF;
        o0 o0VarE = mVar2.E(-148610544);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(mVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(aVar2) : o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            r.a aVar3 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarThen = c2.l.y(aVar3, eVar.f97920e).then(rVar);
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            Double dValueOf = Double.valueOf(aVar.f94450a);
            mVar.getClass();
            switch (un0.a.b.f172045b[mVar.ordinal()]) {
                case 1:
                    strF = un0.a.f(aVar2, dValueOf, 6);
                    break;
                case 2:
                    strF = un0.a.c(aVar2, dValueOf, false, 6);
                    break;
                case 3:
                    strF = un0.a.m(aVar2, dValueOf, 6);
                    break;
                case 4:
                    int i16 = un0.a.f172042b;
                    strF = aVar2.k(dValueOf, true);
                    break;
                case 5:
                case 6:
                    int i17 = un0.a.f172042b;
                    strF = aVar2.o(dValueOf);
                    break;
                default:
                    u0.r();
                    return;
            }
            d92.b.f58624b.getClass();
            mh.c(strF, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            bVar2.getClass();
            c2.l.f(x2.u(aVar3, eVar.f97919d), o0Var);
            mVar3 = mVar;
            d(aVar.f94451b, mVar3, o0Var, i15 & 112);
            o0Var.g0(true);
        } else {
            mVar3 = mVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(rVar, mVar3, aVar, aVar2, i14, 16);
        }
    }

    public static final void k(in0.j jVar, nk0.l lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1821506755);
        int i15 = (o0VarE.r(jVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i16 = 8;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            un0.a aVar = new un0.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            switch (a.f186121a[jVar.f94471a.ordinal()]) {
                case 1:
                    o0VarE.C(1878673279);
                    yn0.k.e(jVar, aVar, lVar, o0VarE, ((i15 << 3) & 896) | (i15 & 14) | 8 | (un0.a.f172042b << 3));
                    o0VarE.g0(false);
                    break;
                case 2:
                    o0VarE.C(1878677840);
                    yn0.i.b(jVar, aVar, o0VarE, (i15 & 14) | 8 | (un0.a.f172042b << 3));
                    o0VarE.g0(false);
                    break;
                case 3:
                case 4:
                    o0VarE.C(1878682127);
                    yn0.n.b(jVar, aVar, o0VarE, (i15 & 14) | 8 | (un0.a.f172042b << 3));
                    o0VarE.g0(false);
                    break;
                case 5:
                    o0VarE.C(1878685234);
                    yn0.m.b(jVar, aVar, o0VarE, (i15 & 14) | 8 | (un0.a.f172042b << 3));
                    o0VarE.g0(false);
                    break;
                case 6:
                    o0VarE.C(1878688334);
                    yn0.l.b(jVar, aVar, o0VarE, (i15 & 14) | 8 | (un0.a.f172042b << 3));
                    o0VarE.g0(false);
                    break;
                default:
                    throw kg.f.h(o0VarE, 1878671755, false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wb1.i(jVar, lVar, i14, i16);
        }
    }

    public static final void l(e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(715573173);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r rVarD = x2.d(r.S, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22696f, aVar3, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
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
            b0 b0Var = b0.f22601a;
            s62.a.f157643a.getClass();
            aVar2 = aVar;
            b82.n.d(fa.a(t62.b.f162798a), y.Q(o0VarE, R.string.lbl_error_occurred), y.Q(o0VarE, R.string.problem_loading_refresh), null, y.Q(o0VarE, R.string.lbl_try_again), aVar2, null, null, o0VarE, (i15 << 15) & 458752, 200);
            o0VarE.g0(true);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(aVar2, i14, 7);
        }
    }

    public static final void m(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1340909031);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            r rVarD = x2.d(r.S, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            d92.b.f58623a.getClass();
            ua.a(0.0f, 0.0f, 0, 0, 61, d92.b.a(o0VarE).f().f63508c, 0L, null, o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wf2.b(i14, 15);
        }
    }

    public static final void n(final i53.c<in0.h> cVar, in0.g gVar, final un0.a aVar, final e23.p<? super in0.m, ? super in0.h.a, Unit> pVar, e23.l<? super in0.m, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        Object obj;
        boolean z14;
        boolean z15;
        o0 o0VarE = mVar.E(-1802940201);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            obj = lVar;
            i15 |= o0VarE.r(obj) ? 16384 : 8192;
        } else {
            obj = lVar;
        }
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97919d, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            if (in0.l.c(cVar)) {
                o0VarE.C(1725518617);
                i(y.Q(o0VarE, R.string.lbl_outliers), z3.f.c(-50469861, new e23.p() { // from class: wn0.a
                    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
                    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Object obj4;
                        Object obj5;
                        int i18 = i16;
                        p3.m.a aVar4 = p3.m.f135153a;
                        final e23.p pVar2 = pVar;
                        i53.c<in0.h> cVar2 = cVar;
                        boolean z16 = false;
                        final int i19 = 1;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i18) {
                            case 0:
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    for (final in0.h hVar : cVar2) {
                                        in0.h.a aVar5 = hVar.f94447b;
                                        final in0.h.a aVar6 = (aVar5 == null || !in0.l.d(aVar5)) ? null : aVar5;
                                        if (aVar6 == null) {
                                            mVar2.C(-1950197202);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(-1950197201);
                                            in0.m mVar3 = hVar.f94446a;
                                            boolean zB = mVar2.B(pVar2) | mVar2.r(hVar) | mVar2.r(aVar6);
                                            Object objQ = mVar2.q();
                                            if (zB) {
                                                obj4 = objQ;
                                                e23.a aVar7 = new e23.a() { // from class: wn0.b
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i19) {
                                                            case 0:
                                                                in0.h.a aVar8 = aVar6;
                                                                pVar2.invoke(hVar.f94446a, aVar8);
                                                                break;
                                                            default:
                                                                in0.h.a aVar9 = aVar6;
                                                                pVar2.invoke(hVar.f94446a, aVar9);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar2.K(aVar7);
                                                obj4 = aVar7;
                                            } else {
                                                aVar4.getClass();
                                                if (objQ == p3.m.a.f135155b) {
                                                    obj4 = objQ;
                                                    e23.a aVar8 = new e23.a() { // from class: wn0.b
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i19) {
                                                                case 0:
                                                                    in0.h.a aVar9 = aVar6;
                                                                    pVar2.invoke(hVar.f94446a, aVar9);
                                                                    break;
                                                                default:
                                                                    in0.h.a aVar10 = aVar6;
                                                                    pVar2.invoke(hVar.f94446a, aVar10);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(aVar8);
                                                    obj4 = aVar8;
                                                }
                                            }
                                            obj4 = objQ;
                                            g.a(mVar3, aVar6, aVar, (e23.a) obj4, mVar2, un0.a.f172042b << 6);
                                            mVar2.f();
                                        }
                                    }
                                    x1 x1Var3 = p3.n.f135158a;
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var4 = p3.n.f135158a;
                                    for (final in0.h hVar2 : cVar2) {
                                        in0.h.a aVar9 = hVar2.f94447b;
                                        final in0.h.a aVar10 = (aVar9 == null || aVar9.f94451b.f94454b != in0.h.a.C1802a.EnumC1803a.IN_RANGE) ? null : aVar9;
                                        if (aVar10 == null) {
                                            mVar2.C(1048484965);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(1048484966);
                                            in0.m mVar4 = hVar2.f94446a;
                                            boolean zB2 = mVar2.B(pVar2) | mVar2.r(hVar2) | mVar2.r(aVar10);
                                            Object objQ2 = mVar2.q();
                                            if (zB2) {
                                                obj5 = objQ2;
                                                final boolean z17 = z16 ? 1 : 0;
                                                e23.a aVar11 = new e23.a() { // from class: wn0.b
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (z17) {
                                                            case 0:
                                                                in0.h.a aVar12 = aVar10;
                                                                pVar2.invoke(hVar2.f94446a, aVar12);
                                                                break;
                                                            default:
                                                                in0.h.a aVar13 = aVar10;
                                                                pVar2.invoke(hVar2.f94446a, aVar13);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar2.K(aVar11);
                                                obj5 = aVar11;
                                            } else {
                                                aVar4.getClass();
                                                if (objQ2 == p3.m.a.f135155b) {
                                                    obj5 = objQ2;
                                                    final int z18 = z16 ? 1 : 0;
                                                    e23.a aVar12 = new e23.a() { // from class: wn0.b
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (z18) {
                                                                case 0:
                                                                    in0.h.a aVar13 = aVar10;
                                                                    pVar2.invoke(hVar2.f94446a, aVar13);
                                                                    break;
                                                                default:
                                                                    in0.h.a aVar14 = aVar10;
                                                                    pVar2.invoke(hVar2.f94446a, aVar14);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(aVar12);
                                                    obj5 = aVar12;
                                                }
                                            }
                                            obj5 = objQ2;
                                            g.a(mVar4, aVar10, aVar, (e23.a) obj5, mVar2, un0.a.f172042b << 6);
                                            mVar2.f();
                                        }
                                    }
                                    x1 x1Var5 = p3.n.f135158a;
                                } else {
                                    mVar2.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 48);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1726079841);
                o0VarE.g0(false);
            }
            if (!cVar.isEmpty()) {
                Iterator<in0.h> it = cVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                    in0.h.a aVar4 = it.next().f94447b;
                    if (aVar4 != null && aVar4.f94451b.f94454b == in0.h.a.C1802a.EnumC1803a.IN_RANGE) {
                        z14 = true;
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
            if (z14) {
                o0VarE.C(1726140725);
                i(y.Q(o0VarE, R.string.lbl_within_range), z3.f.c(-1233739644, new e23.p() { // from class: wn0.a
                    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
                    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Object obj4;
                        Object obj5;
                        int i18 = i17;
                        p3.m.a aVar5 = p3.m.f135153a;
                        final e23.p pVar2 = pVar;
                        i53.c<in0.h> cVar2 = cVar;
                        boolean z16 = false;
                        final int i19 = 1;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i18) {
                            case 0:
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    for (final in0.h hVar : cVar2) {
                                        in0.h.a aVar6 = hVar.f94447b;
                                        final in0.h.a aVar7 = (aVar6 == null || !in0.l.d(aVar6)) ? null : aVar6;
                                        if (aVar7 == null) {
                                            mVar2.C(-1950197202);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(-1950197201);
                                            in0.m mVar3 = hVar.f94446a;
                                            boolean zB = mVar2.B(pVar2) | mVar2.r(hVar) | mVar2.r(aVar7);
                                            Object objQ = mVar2.q();
                                            if (zB) {
                                                obj4 = objQ;
                                                e23.a aVar8 = new e23.a() { // from class: wn0.b
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i19) {
                                                            case 0:
                                                                in0.h.a aVar13 = aVar7;
                                                                pVar2.invoke(hVar.f94446a, aVar13);
                                                                break;
                                                            default:
                                                                in0.h.a aVar14 = aVar7;
                                                                pVar2.invoke(hVar.f94446a, aVar14);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar2.K(aVar8);
                                                obj4 = aVar8;
                                            } else {
                                                aVar5.getClass();
                                                if (objQ == p3.m.a.f135155b) {
                                                    obj4 = objQ;
                                                    e23.a aVar9 = new e23.a() { // from class: wn0.b
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i19) {
                                                                case 0:
                                                                    in0.h.a aVar13 = aVar7;
                                                                    pVar2.invoke(hVar.f94446a, aVar13);
                                                                    break;
                                                                default:
                                                                    in0.h.a aVar14 = aVar7;
                                                                    pVar2.invoke(hVar.f94446a, aVar14);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(aVar9);
                                                    obj4 = aVar9;
                                                }
                                            }
                                            obj4 = objQ;
                                            g.a(mVar3, aVar7, aVar, (e23.a) obj4, mVar2, un0.a.f172042b << 6);
                                            mVar2.f();
                                        }
                                    }
                                    x1 x1Var3 = p3.n.f135158a;
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var4 = p3.n.f135158a;
                                    for (final in0.h hVar2 : cVar2) {
                                        in0.h.a aVar10 = hVar2.f94447b;
                                        final in0.h.a aVar11 = (aVar10 == null || aVar10.f94451b.f94454b != in0.h.a.C1802a.EnumC1803a.IN_RANGE) ? null : aVar10;
                                        if (aVar11 == null) {
                                            mVar2.C(1048484965);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(1048484966);
                                            in0.m mVar4 = hVar2.f94446a;
                                            boolean zB2 = mVar2.B(pVar2) | mVar2.r(hVar2) | mVar2.r(aVar11);
                                            Object objQ2 = mVar2.q();
                                            if (zB2) {
                                                obj5 = objQ2;
                                                final int z18 = z16 ? 1 : 0;
                                                e23.a aVar12 = new e23.a() { // from class: wn0.b
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (z18) {
                                                            case 0:
                                                                in0.h.a aVar13 = aVar11;
                                                                pVar2.invoke(hVar2.f94446a, aVar13);
                                                                break;
                                                            default:
                                                                in0.h.a aVar14 = aVar11;
                                                                pVar2.invoke(hVar2.f94446a, aVar14);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar2.K(aVar12);
                                                obj5 = aVar12;
                                            } else {
                                                aVar5.getClass();
                                                if (objQ2 == p3.m.a.f135155b) {
                                                    obj5 = objQ2;
                                                    final int z19 = z16 ? 1 : 0;
                                                    e23.a aVar13 = new e23.a() { // from class: wn0.b
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (z19) {
                                                                case 0:
                                                                    in0.h.a aVar14 = aVar11;
                                                                    pVar2.invoke(hVar2.f94446a, aVar14);
                                                                    break;
                                                                default:
                                                                    in0.h.a aVar15 = aVar11;
                                                                    pVar2.invoke(hVar2.f94446a, aVar15);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(aVar13);
                                                    obj5 = aVar13;
                                                }
                                            }
                                            obj5 = objQ2;
                                            g.a(mVar4, aVar11, aVar, (e23.a) obj5, mVar2, un0.a.f172042b << 6);
                                            mVar2.f();
                                        }
                                    }
                                    x1 x1Var5 = p3.n.f135158a;
                                } else {
                                    mVar2.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 48);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1726705793);
                o0VarE.g0(false);
            }
            if (!cVar.isEmpty()) {
                Iterator<in0.h> it3 = cVar.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z15 = false;
                        break;
                    } else if (it3.next().f94447b == null) {
                        z15 = true;
                        break;
                    }
                }
            } else {
                z15 = false;
                break;
            }
            if (z15) {
                o0VarE.C(1726767080);
                i(y.Q(o0VarE, R.string.no_data_label), z3.f.c(-749102813, new w21.d(cVar, gVar, aVar, obj, 9), o0VarE), o0VarE, 48);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1727375393);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.j0(cVar, gVar, aVar, pVar, lVar, i14, 3);
        }
    }

    public static final void o(in0.m mVar, boolean z14, in0.g gVar, un0.a aVar, e23.a<Unit> aVar2, p3.m mVar2, int i14) {
        int i15;
        String string;
        l22.a aVar3 = aVar.f172043a;
        o0 o0VarE = mVar2.E(-358071504);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(mVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            rn0.a.f153638a.getClass();
            String strQ = y.Q(o0VarE, rn0.a.a(mVar));
            if (gVar != null && gVar.f94443b.contains(mVar)) {
                o0VarE.C(1390972157);
                String string2 = aVar3.getString(R.string.lbl_not_enabled_during_sleep);
                z3.e eVarC = z3.f.c(-1467848319, new vv0.e(13, aVar, aVar2), o0VarE);
                r.a aVar4 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                l72.l.d(strQ, string2, eVarC, c2.l.A(aVar4, 0.0f, j92.b.f97899b.f97917b, 1), null, false, null, o0VarE, 384, 112);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1391473985);
                if (z14) {
                    string = aVar3.getString(R.string.lbl_calibrating);
                } else {
                    string = gVar != null && gVar.f94442a.contains(mVar) ? aVar3.getString(R.string.lbl_not_supported) : aVar3.getString(R.string.no_data_label);
                }
                String string3 = aVar3.getString(R.string.no_value_card);
                r.a aVar5 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                l72.l.e(strQ, string, string3, null, null, null, c2.l.A(aVar5, 0.0f, j92.b.f97899b.f97917b, 1), null, false, null, o0VarE, 0, 952);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(mVar, z14, gVar, aVar, aVar2, i14);
        }
    }
}
