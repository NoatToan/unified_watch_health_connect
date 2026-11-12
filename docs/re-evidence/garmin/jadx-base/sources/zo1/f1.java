package zo1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.q1;
import o4.t1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
public final class f1 {
    public static final void a(int i14, int i15, int i16, p3.m mVar) {
        p3.o0 o0VarE = mVar.E(60480073);
        int i17 = (o0VarE.k(i14) ? 4 : 2) | i16 | (o0VarE.k(i15) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            t4.d dVarA = n5.c.a(R.drawable.group_ride, o0VarE, 0);
            long jD = d92.b.a(o0VarE).f().d();
            bVar.getClass();
            i7.a(dVarA, null, x2.q(aVar, j92.b.f97901d.f97904c), jD, o0VarE, 48, 0);
            String strP = gl1.y.P(R.string.lbl_riders_finished, new Object[]{String.valueOf(i14), String.valueOf(i15)}, o0VarE);
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            bVar.getClass();
            mh.c(strP, c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a71.l(i14, i15, i16, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0141  */
    /* JADX WARN: Code duplicated, block: B:43:0x0170  */
    public static final void b(e23.a aVar, int i14, p3.m mVar, int i15) {
        p3.o0 o0VarE = mVar.E(952654982);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            s5.c.b bVarH = l2.h(o0VarE, 673408053, 0, 1, null);
            o0VarE.C(673408799);
            d92.b.f58623a.getClass();
            int iJ = bVarH.j(new s5.i0(d92.b.a(o0VarE).k().d(), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
            try {
                if (i14 == 0) {
                    o0VarE.C(883566680);
                    bVarH.b(gl1.y.Q(o0VarE, R.string.lbl_group_ride_no_riders_privacy));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(883676823);
                    bVarH.b(gl1.y.Q(o0VarE, R.string.lbl_groupride_results_description));
                    o0VarE.g0(false);
                }
                Unit unit = Unit.INSTANCE;
                bVarH.f(iJ);
                o0VarE.g0(false);
                bVarH.b(StringUtils.SPACE);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_groupride_privacy);
                bVarH.h("GroupRidePrivacyTag", strQ);
                int iJ2 = bVarH.j(new s5.i0(hb.a.e(o0VarE), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                try {
                    bVarH.b(strQ);
                    bVarH.f(iJ2);
                    bVarH.e();
                    s5.c cVarK = bVarH.k();
                    o0VarE.g0(false);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                    h4.r.a aVar2 = h4.r.S;
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarZ = c2.l.z(aVar2, f14, eVar.f97918c);
                    int i17 = i16 & 112;
                    boolean z14 = i17 == 32;
                    Object objQ = o0VarE.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (z14) {
                        objQ = new y0(aVar, 1);
                        o0VarE.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new y0(aVar, 1);
                            o0VarE.K(objQ);
                        }
                    }
                    h4.r rVarD = u1.w.d(rVarZ, false, null, null, (e23.a) objQ, 15);
                    boolean zB = o0VarE.B(cVarK) | (i17 == 32);
                    Object objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new ht1.u(cVarK, aVar, 2);
                        o0VarE.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ht1.u(cVarK, aVar, 2);
                            o0VarE.K(objQ2);
                        }
                    }
                    p006l2.c0.a(cVarK, rVarD, x0VarF, false, 0, 0, null, (e23.l) objQ2, o0VarE, 0, 120);
                } catch (Throwable th3) {
                    bVarH.f(iJ2);
                    throw th3;
                }
            } catch (Throwable th4) {
                bVarH.f(iJ);
                throw th4;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(i14, i15, 21, aVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    public static final void c(int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        p3.o0 o0VarE = mVar.E(1048114177);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            s5.c.b bVarH = l2.h(o0VarE, -2079586176, 0, 1, null);
            o0VarE.C(-2079585101);
            d92.b.f58623a.getClass();
            int iJ = bVarH.j(new s5.i0(d92.b.a(o0VarE).k().a(), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
            try {
                bVarH.b(gl1.y.Q(o0VarE, z14 ? R.string.lbl_view_results : R.string.lbl_view_preliminary_results));
                Unit unit = Unit.INSTANCE;
                bVarH.f(iJ);
                o0VarE.g0(false);
                s5.c cVarK = bVarH.k();
                o0VarE.g0(false);
                d92.b.f58624b.getClass();
                s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
                int i16 = i15 & 896;
                boolean z15 = i16 == 256;
                Object objQ = o0VarE.q();
                p3.m.a aVar2 = p3.m.f135153a;
                if (z15) {
                    objQ = new y0(aVar, 3);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new y0(aVar, 3);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarD = u1.w.d(rVar, false, null, null, (e23.a) objQ, 15);
                boolean z16 = i16 == 256;
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new xx1.d(aVar, 11);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new xx1.d(aVar, 11);
                        o0VarE.K(objQ2);
                    }
                }
                p006l2.c0.a(cVarK, rVarD, x0VarF, false, 0, 0, null, (e23.l) objQ2, o0VarE, 0, 120);
            } catch (Throwable th3) {
                bVarH.f(iJ);
                throw th3;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.n(rVar, z14, aVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX WARN: Code duplicated, block: B:39:0x0143  */
    /* JADX WARN: Code duplicated, block: B:48:0x0171  */
    public static final void d(int i14, e23.a aVar, String str, p3.m mVar) {
        p3.o0 o0VarE = mVar.E(667101240);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int iH = d53.w.H(str, "<link>", 0, false, 6);
            int iH2 = d53.w.H(str, "</link>", 0, false, 6);
            if (iH == -1 || iH2 == -1) {
                o0VarE.C(799646427);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
                h4.r.a aVar2 = h4.r.S;
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97920e;
                bVar.getClass();
                bVar.getClass();
                g6.f.a aVar3 = g6.f.f75994b;
                mh.c(str, c2.l.B(aVar2, f14, f15, f15, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i15 & 14, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(800056960);
                s5.i0 i0Var = new s5.i0(ds.e0.d(d92.b.f58623a, o0VarE), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null);
                s5.i0 i0Var2 = new s5.i0(hb.a.e(o0VarE), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null);
                int i16 = iH + 6;
                String strSubstring = str.substring(i16, iH2);
                s5.c.b bVar2 = new s5.c.b(0, 1, null);
                int iJ = bVar2.j(i0Var);
                try {
                    bVar2.b(str.substring(0, iH));
                    Unit unit = Unit.INSTANCE;
                    bVar2.f(iJ);
                    int iJ2 = bVar2.j(i0Var2);
                    try {
                        bVar2.b(str.substring(i16, iH2));
                        bVar2.f(iJ2);
                        int iJ3 = bVar2.j(i0Var);
                        try {
                            bVar2.b(str.substring(iH2 + 7, str.length()));
                            bVar2.f(iJ3);
                            s5.c cVarK = bVar2.k();
                            int iH3 = d53.w.H(cVarK, strSubstring, 0, false, 6);
                            int length = strSubstring.length() + iH3;
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarE = d92.c.e(j92.f.f97930g);
                            h4.r.a aVar4 = h4.r.S;
                            int i17 = i15 & 112;
                            boolean z14 = i17 == 32;
                            Object objQ = o0VarE.q();
                            p3.m.a aVar5 = p3.m.f135153a;
                            if (z14) {
                                objQ = new yy1.d(aVar, 28);
                                o0VarE.K(objQ);
                            } else {
                                aVar5.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new yy1.d(aVar, 28);
                                    o0VarE.K(objQ);
                                }
                            }
                            h4.r rVarD = u1.w.d(aVar4, false, null, null, (e23.a) objQ, 15);
                            j92.b bVar3 = d92.b.f58625c;
                            bVar3.getClass();
                            j92.e eVar2 = j92.b.f97899b;
                            float f16 = eVar2.f97920e;
                            float f17 = eVar2.f97920e;
                            bVar3.getClass();
                            bVar3.getClass();
                            g6.f.a aVar6 = g6.f.f75994b;
                            h4.r rVarB = c2.l.B(rVarD, f16, f17, f17, 0);
                            boolean zB = o0VarE.B(cVarK);
                            Object objQ2 = o0VarE.q();
                            if (zB) {
                                objQ2 = new yw2.h(cVarK, 17);
                                o0VarE.K(objQ2);
                            } else {
                                aVar5.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new yw2.h(cVarK, 17);
                                    o0VarE.K(objQ2);
                                }
                            }
                            h4.r rVarC = p5.v.c((e23.l) objQ2, rVarB, false);
                            boolean zK = (i17 == 32) | o0VarE.k(iH3) | o0VarE.k(length);
                            Object objQ3 = o0VarE.q();
                            if (zK) {
                                objQ3 = new h82.k(iH3, length, 1, aVar);
                                o0VarE.K(objQ3);
                            } else {
                                aVar5.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new h82.k(iH3, length, 1, aVar);
                                    o0VarE.K(objQ3);
                                }
                            }
                            p006l2.c0.a(cVarK, rVarC, x0VarE, false, 0, 0, null, (e23.l) objQ3, o0VarE, 0, 120);
                            o0VarE.g0(false);
                        } catch (Throwable th3) {
                            bVar2.f(iJ3);
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        bVar2.f(iJ2);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    bVar2.f(iJ);
                    throw th5;
                }
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new uu1.i(str, aVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ba  */
    public static final void e(ArrayList arrayList, e23.a aVar, p3.m mVar, int i14) {
        boolean z14;
        boolean z15;
        p3.o0 o0VarE = mVar.E(1236883335);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        boolean z16 = false;
        char c14 = 5;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            float f14 = 1.0f;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f15 = eVar.f97921f;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarF, f15, eVar.f97920e);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            char c15 = 6;
            boolean z17 = arrayList.size() > 6;
            List listSubList = z17 ? arrayList.subList(0, 5) : arrayList;
            o0VarE.C(1875755527);
            Iterator it = listSubList.iterator();
            int i16 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                p3.m.a aVar3 = p3.m.f135153a;
                if (!zHasNext) {
                    float f16 = f14;
                    o0VarE.g0(z16);
                    if (z17) {
                        o0VarE.C(-1980440758);
                        h4.r.a aVar4 = h4.r.S;
                        g6.f.a aVar5 = g6.f.f75994b;
                        h4.r rVarC2 = c2.l.C(x2.f(aVar4, f16), 250, 0.0f, 0.0f, 0.0f, 14);
                        h4.d.f81522a.getClass();
                        f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var2 = p3.n.f135158a;
                        int iHashCode2 = Long.hashCode(o0VarE.U);
                        i2 i2VarA1 = o0VarE.a0();
                        h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
                        h5.g.V.getClass();
                        h5.e0.a aVar6 = h5.g.a.f81805b;
                        if (cVar == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        h5.g.a.e eVar2 = h5.g.a.f81810g;
                        b4.c(eVar2, z0VarD2, o0VarE);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarA1, o0VarE);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, o0VarE);
                        c2.u uVar2 = c2.u.f22885a;
                        float f17 = 58;
                        h4.r rVarU = x2.u(x2.h(aVar4, f17), f17);
                        d92.b.f58623a.getClass();
                        long jA = d92.b.a(o0VarE).d().a().a();
                        k2.h hVar = k2.i.f102406a;
                        h4.r rVarB = l4.k.b(u1.n.e(rVarU, jA, hVar), hVar);
                        u1.u uVar3 = new u1.u(2, new t1(p6.b.b(o0VarE), null), null);
                        h4.r rVarC4 = u1.q.c(uVar3.f167683a, rVarB, uVar3.f167684b, hVar);
                        boolean z18 = (i15 & 112) == 32;
                        Object objQ = o0VarE.q();
                        if (z18) {
                            z15 = false;
                            objQ = new y0(aVar, 0);
                            o0VarE.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                z15 = false;
                                objQ = new y0(aVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                z15 = false;
                            }
                        }
                        h4.r rVarD = u1.w.d(rVarC4, false, null, null, (e23.a) objQ, 15);
                        f5.z0 z0VarD3 = c2.q.d(h4.d.a.f81528f, z15);
                        int iHashCode3 = Long.hashCode(o0VarE.U);
                        i2 i2VarA2 = o0VarE.a0();
                        h4.r rVarC5 = h4.k.c(rVarD, o0VarE);
                        if (cVar == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, z0VarD3, o0VarE);
                        b4.c(c1623g, i2VarA2, o0VarE);
                        if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
                        }
                        b4.c(fVar, rVarC5, o0VarE);
                        String strP = gl1.y.P(R.string.plus_string_pattern, new Object[]{Integer.valueOf(arrayList.size() - 6)}, o0VarE);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarA = s5.x0.a(j92.f.f97931h, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        d6.h.f57752b.getClass();
                        z14 = true;
                        mh.c(strP, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 130046);
                        o0VarE = o0VarE;
                        e5.u(o0VarE, true, true, z15);
                    } else {
                        z14 = true;
                        o0VarE.C(-1979280831);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z14);
                    x1 x1Var3 = p3.n.f135158a;
                    break;
                }
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                x0 x0Var = (x0) next;
                h4.r.a aVar7 = h4.r.S;
                g6.f.a aVar8 = g6.f.f75994b;
                h4.r rVarC6 = c2.l.C(x2.f(aVar7, f14), i16 * 50, 0.0f, 0.0f, 0.0f, 14);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD4 = c2.q.d(h4.d.a.f81524b, z16);
                x1 x1Var4 = p3.n.f135158a;
                char c16 = c15;
                int iHashCode4 = Long.hashCode(o0VarE.U);
                i2 i2VarA3 = o0VarE.a0();
                h4.r rVarC7 = h4.k.c(rVarC6, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar9 = h5.g.a.f81805b;
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar9);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD4, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA3, o0VarE);
                h5.g.a.b bVar4 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC7, o0VarE);
                c2.u uVar4 = c2.u.f22885a;
                boolean z19 = (i15 & 112) == 32;
                Object objQ2 = o0VarE.q();
                if (z19) {
                    objQ2 = new yy1.d(aVar, 29);
                    o0VarE.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new yy1.d(aVar, 29);
                        o0VarE.K(objQ2);
                    }
                }
                b12.k.b(u1.w.d(aVar7, false, null, null, (e23.a) objQ2, 15), null, 58, new b12.b(x0Var.f206489a, null, null, null, null, 30, null), o0VarE, (b12.b.f14385f << 9) | 384, 18);
                o0VarE.g0(true);
                f14 = 1.0f;
                i16 = i17;
                c14 = 5;
                c15 = c16;
                z16 = false;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zi1.a(arrayList, aVar, i14, 5);
        }
    }

    public static final void f(final yo1.j jVar, final String str, final List list, final Long l14, final String str2, final ActivityDetailChartDTO activityDetailChartDTO, final yo1.f fVar, final boolean z14, final String str3, final e23.a aVar, final e23.a aVar2, final e23.a aVar3, final e23.l lVar, p3.m mVar, final int i14) {
        int i15;
        String str4;
        List list2;
        String str5;
        ActivityDetailChartDTO activityDetailChartDTO2;
        p3.o0 o0Var;
        jVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-331204363);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(jVar) : o0VarE.r(jVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            str4 = str;
            i15 |= o0VarE.B(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i14 & 384) == 0) {
            list2 = list;
            i15 |= o0VarE.r(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(l14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            str5 = str2;
            i15 |= o0VarE.B(str5) ? 16384 : 8192;
        } else {
            str5 = str2;
        }
        if ((196608 & i14) == 0) {
            activityDetailChartDTO2 = activityDetailChartDTO;
            i15 |= o0VarE.r(activityDetailChartDTO2) ? 131072 : 65536;
        } else {
            activityDetailChartDTO2 = activityDetailChartDTO;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= (i14 & 2097152) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarE.h(z14) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarE.B(str3) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(aVar) ? 536870912 : 268435456;
        }
        char c14 = 256;
        int i16 = (o0VarE.r(aVar2) ? (char) 4 : (char) 2) | (o0VarE.r(aVar3) ? ' ' : (char) 16);
        if (!o0VarE.r(lVar)) {
            c14 = 128;
        }
        int i17 = i15;
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && ((i16 | c14) & 147) == 146) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(1483205247, new ds.b(l14, str5, str4, jVar, list2, activityDetailChartDTO2, fVar, z14, str3, aVar2, aVar3, lVar, aVar), o0VarE), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: zo1.z0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    f1.f(jVar, str, list, l14, str2, activityDetailChartDTO, fVar, z14, str3, aVar, aVar2, aVar3, lVar, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
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
    public static final void g(List<yo1.b> list, p3.m mVar, int i14) {
        bp1.a aVar;
        boolean z14;
        p3.o0 o0VarE = mVar.E(1592830358);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        boolean z15 = false;
        int i16 = 26;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            bp1.a aVar2 = new bp1.a(context, new l22.a(context));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                yo1.b bVar = (yo1.b) it.next();
                String title = bVar.getTitle();
                z3.e eVarC = z3.f.c(-933135788, new yr.d(bVar, i16), o0VarE);
                boolean z16 = z15;
                String strA = aVar2.a(bVar, z16);
                if (g22.n.d(strA)) {
                    o0VarE.C(602440249);
                    l72.p2 p2Var = l72.p2.f111205a;
                    h4.r.a aVar3 = h4.r.S;
                    boolean zB = o0VarE.B(title) | o0VarE.r(aVar2) | o0VarE.r(bVar);
                    Object objQ = o0VarE.q();
                    if (zB) {
                        objQ = new h0(title, aVar2, bVar);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(title, aVar2, bVar);
                            o0VarE.K(objQ);
                        }
                    }
                    aVar = aVar2;
                    z14 = z16;
                    p2Var.h(title, strA, null, p5.v.b(aVar3, (e23.l) objQ), null, false, false, eVarC, null, null, null, o0VarE, 12582912, 0, 1908);
                    o0VarE.g0(z14);
                } else {
                    aVar = aVar2;
                    z14 = z16;
                    o0VarE.C(602836987);
                    l72.p2.f111205a.g(title, null, null, eVarC, null, false, false, null, o0VarE, 3072, 502);
                    o0VarE.g0(z14);
                }
                z15 = z14;
                aVar2 = aVar;
                i16 = 26;
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01bd  */
    public static final void h(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(876934720);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarF, f14, eVar.f97918c);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String strJ = z14 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -500901512, R.string.lbl_your_achievements, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -500818339, R.string.lbl_achievements, o0VarE, false);
            d92.b.f58624b.getClass();
            mh.c(strJ, u2Var.a(aVar2, 0.7f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            h4.r rVarA = u2Var.a(aVar2, 0.3f, true);
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0Var.U);
            i2 i2VarA1 = o0Var.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0Var);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(eVar2, z0VarD, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0Var);
            h4.r rVarC3 = c2.u.f22885a.c(aVar2, h4.d.a.f81529g);
            boolean z15 = (i15 & 896) == 256;
            Object objQ = o0Var.q();
            if (z15) {
                objQ = new y0(aVar, 4);
                o0Var.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new y0(aVar, 4);
                    o0Var.K(objQ);
                }
            }
            c(48, (e23.a) objQ, rVarC3, o0Var, true);
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.g(z14, str, aVar, i14);
        }
    }
}
