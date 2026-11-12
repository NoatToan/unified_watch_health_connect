package cr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.p9;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import m92.h0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.s0;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final class x {
    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x013c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    public static final void a(h4.r rVar, ep.e eVar, boolean z14, p3.m mVar, int i14) {
        h4.r rVar2;
        String string;
        eVar.getClass();
        o0 o0VarE = mVar.E(-1962257901);
        int i15 = i14 | 6;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            List<Integer> list = ep.f.f64816a;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue <= 59) {
                    string = context.getString(R.string.lbl_second);
                } else if (iIntValue <= 3599) {
                    iIntValue /= 60;
                    string = context.getString(R.string.common_min_abbreviated_without_period);
                } else {
                    iIntValue /= DateTimeConstants.SECONDS_PER_HOUR;
                    string = context.getString(R.string.lbl_hour);
                }
                arrayList.add(org.apache.commons.lang3.e.d(iIntValue, StringUtils.SPACE, string));
            }
            float size = ep.f.f64816a.size() - 1;
            float f14 = f(eVar.f64812a);
            i53.c<ep.b> cVar = eVar.f64813b;
            ArrayList arrayList2 = new ArrayList(p13.y.r(cVar, 10));
            Iterator<ep.b> it3 = cVar.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().f64801a);
            }
            float fMax = Math.max(f14, f(arrayList2));
            float fMax2 = Math.max(1, (int) (Math.ceil((((double) fMax) / 4.0d) / 5.0d) * ((double) 5)));
            float fCeil = ((float) Math.ceil(fMax / fMax2)) * fMax2;
            int i16 = i15 & 112;
            boolean zI = (i16 == 32) | o0VarE.i(size) | o0VarE.i(fCeil);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zI) {
                objQ = new v(0, size, fCeil, eVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v(0, size, fCeil, eVar);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zI2 = (i16 == 32) | o0VarE.i(size) | o0VarE.i(fCeil);
            Object objQ2 = o0VarE.q();
            if (zI2) {
                objQ2 = new v(1, size, fCeil, eVar);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new v(1, size, fCeil, eVar);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar2 = (e23.l) objQ2;
            boolean zI3 = (i16 == 32) | o0VarE.i(size) | o0VarE.i(fCeil);
            Object objQ3 = o0VarE.q();
            if (zI3) {
                objQ3 = new v(2, size, fCeil, eVar);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new v(2, size, fCeil, eVar);
                    o0VarE.K(objQ3);
                }
            }
            i53.f fVarA = i53.a.a(lVar2, (e23.l) objQ3, lVar);
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
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
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            g6.f.a aVar5 = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), 1.0f), 200);
            y3 y3Var = t1.f91493k;
            w5.q.b bVar2 = (w5.q.b) o0VarE.A(y3Var);
            y3 y3Var2 = t1.f91490h;
            g6.d dVar = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
            y3 y3Var3 = t1.f91496n;
            s0 s0Var = new s0(bVar2, dVar, (g6.o) o0VarE.A(y3Var3), 0, 8, null);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97935l;
            n92.l lVar3 = new n92.l(arrayList, s0Var, d92.c.f(x0Var, o0VarE));
            n92.j jVar = new n92.j(new d02.a(), Float.valueOf(0.0f), Float.valueOf(fCeil), 0, 8, null);
            s0 s0Var2 = new s0((w5.q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
            fVar.getClass();
            m92.r.b(rVarH, fVarA, null, null, false, gl1.y.Q(o0VarE, R.string.common_no_data), 0.0f, 0.0f, new n92.a(jVar, null, new n92.g(sn.a.c(o0VarE), s0Var2, d92.c.f(x0Var, o0VarE), null, 8, null), lVar3, 2, null), null, z3.f.c(-1315454676, new p9(eVar, arrayList, z14, 1), o0VarE), o0VarE, 0, 6, 732);
            o0VarE.g0(true);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(rVar2, eVar, z14, i14, 4);
        }
    }

    public static final void b(String str, String str2, String str3, long j8, boolean z14, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-17798722);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            m92.y.a(str, z3.f.c(-1806440689, new t(j8, str2, z14, str3), o0VarE), o0VarE, (i15 & 14) | 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.o(str, str2, str3, j8, z14, i14);
        }
    }

    public static final void c(String str, String str2, String str3, String str4, String str5, long j8, long j14, boolean z14, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-631222832);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(str4) ? 2048 : 1024) | (o0VarE.B(str5) ? 16384 : 8192) | (o0VarE.l(j8) ? 131072 : 65536) | (o0VarE.l(j14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.h(z14) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            m92.y.a(str, z3.f.c(1833762079, new a3.b(j8, str2, g(z14, o0VarE), str4, j14, str3, str5), o0VarE), o0VarE, (i15 & 14) | 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(str, str2, str3, str4, str5, j8, j14, z14, i14);
        }
    }

    public static final void d(h4.r rVar, long j8, long j14, p3.m mVar, int i14) {
        h4.r rVar2;
        o0 o0VarE = mVar.E(1948031856);
        int i15 = i14 | 6 | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.l(j14) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            List listK = p13.x.k(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_this_activity), new j82.g.a(j8, null), null, 4, null), new j82.f(gl1.y.Q(o0VarE, R.string.power_curve_record_label), new j82.g.a(j14, null), null, 4, null));
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarE, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.power_curve_interval_length);
            d92.b.f58624b.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            j82.e.h(i53.a.e(listK), null, null, o0VarE, 0, 6);
            o0VarE.g0(true);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(rVar2, j8, j14, i14);
        }
    }

    public static final void e(ep.e eVar, boolean z14, p3.m mVar, int i14) {
        eVar.getClass();
        o0 o0VarE = mVar.E(-1494929653);
        int i15 = (o0VarE.B(eVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new com.google.maps.android.compose.clustering.d(11);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, aVar, true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarE = u1.n.e(c2.l.A(rVarC, j92.b.f97899b.f97920e, 0.0f, 2), ds.e0.f(o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            a(null, eVar, z14, o0VarE, (i15 << 3) & 1008);
            d(null, eVar.f64814c, eVar.f64815d, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ap2.f(eVar, z14, i14, 5);
        }
    }

    public static final float f(List<h0.e.a> list) {
        Float fValueOf;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            float fMax = ((h0.e.a) it.next()).f117347b;
            while (it.hasNext()) {
                fMax = Math.max(fMax, ((h0.e.a) it.next()).f117347b);
            }
            fValueOf = Float.valueOf(fMax);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.0f;
    }

    public static final String g(boolean z14, p3.m mVar) {
        int i14;
        int i15;
        x1 x1Var = p3.n.f135158a;
        if (z14) {
            i14 = 1608413605;
            i15 = R.string.lbl_watt_kg;
        } else {
            i14 = 1608471172;
            i15 = R.string.common_watts;
        }
        return sn.a.h(mVar, i14, i15, mVar);
    }
}
