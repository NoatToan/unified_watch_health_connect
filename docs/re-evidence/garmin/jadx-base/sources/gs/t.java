package gs;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ds.f0;
import et1.b2;
import f5.g0;
import f5.z0;
import h5.e0;
import i3.mh;
import java.util.List;
import java.util.Locale;
import kotlin.t1;
import lc.u0;
import nr.l0;
import nr.p0;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.n2;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.x0;
import u1.w;
import u1.y0;
import w5.v;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78681a;

        static {
            int[] iArr = new int[ds.n.values().length];
            try {
                iArr[ds.n.f61012i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ds.n.f61013j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ds.n.f61014k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78681a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0195  */
    /* JADX WARN: Code duplicated, block: B:106:0x0198  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:121:0x0215  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:81:0x010b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0112  */
    /* JADX WARN: Code duplicated, block: B:85:0x0115  */
    /* JADX WARN: Code duplicated, block: B:87:0x0118  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0130  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:98:0x0169  */
    public static final void a(h4.r rVar, final p0 p0Var, boolean z14, float f14, ds.n nVar, e23.a<Unit> aVar, final e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        int i17;
        boolean z15;
        ds.n nVar2;
        h4.r rVar3;
        ds.n nVar3;
        h4.r rVar4;
        l0 l0Var;
        r22.p pVar;
        l0 l0Var2;
        r22.p pVar2;
        l0 l0Var3;
        r22.p pVar3;
        p0.a aVar3;
        p0.a.h hVar;
        boolean z16;
        d92.a aVarB;
        final long jB;
        Object objQ;
        final p1 p1Var;
        y3 y3Var;
        is.n nVar4;
        float f15;
        final float f16;
        int i18;
        float f17;
        h4.r.a aVar4;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar5;
        h5.g.a.b bVar;
        final e23.a<Unit> aVar6 = aVar;
        p0Var.getClass();
        List<l0> list = p0Var.f127285d;
        aVar2.getClass();
        o0 o0VarE = mVar.E(1208652087);
        int i19 = i15 & 1;
        if (i19 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        }
        int i24 = i16 | (o0VarE.r(p0Var) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i24 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i24 |= o0VarE.i(f14) ? 2048 : 1024;
        }
        if ((i15 & 16) != 0) {
            i17 = 8192;
        } else {
            if (o0VarE.k(nVar == null ? -1 : nVar.ordinal())) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
        }
        int i25 = i24 | i17;
        if ((196608 & i14) == 0) {
            i25 |= o0VarE.r(aVar6) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i25 |= o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i25 & 1, (599187 & i25) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if (i19 != 0) {
                    rVar2 = h4.r.S;
                }
                if ((i15 & 16) != 0) {
                    ds.n.f61011h.getClass();
                    h4.r rVar5 = rVar2;
                    nVar3 = ds.n.f61012i;
                    rVar4 = rVar5;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                l0Var = (l0) h0.e0(0, list);
                if (l0Var != null) {
                    pVar = l0Var.f127250a;
                } else {
                    pVar = null;
                }
                l0Var2 = (l0) h0.e0(1, list);
                if (l0Var2 != null) {
                    pVar2 = l0Var2.f127250a;
                } else {
                    pVar2 = null;
                }
                l0Var3 = (l0) h0.e0(2, list);
                if (l0Var3 != null) {
                    pVar3 = l0Var3.f127250a;
                } else {
                    pVar3 = null;
                }
                aVar3 = p0Var.f127286e;
                if (aVar3 instanceof p0.a.h) {
                    hVar = (p0.a.h) aVar3;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    z16 = hVar.f127301a;
                } else {
                    z16 = true;
                }
                if (z16) {
                    aVarB = j92.a.a();
                } else {
                    aVarB = j92.a.b();
                }
                jB = aVarB.k().b();
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p3.p0.n(null);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                y3Var = t1.f91490h;
                nVar4 = new is.n(((g6.c) o0VarE.A(y3Var)).getF75991a() * f14, 1.0f);
                if (nVar3 == ds.n.f61014k) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f15 = j92.b.f97899b.f97921f;
                } else {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f15 = j92.b.f97899b.f97922g;
                }
                f16 = f15;
                i18 = a.f78681a[nVar3.ordinal()];
                if (i18 != 1) {
                    f17 = 64;
                    g6.f.a aVar7 = g6.f.f75994b;
                } else if (i18 != 2) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f17 = j92.b.f97899b.f97922g;
                } else if (i18 == 3) {
                    u0.r();
                    return;
                } else {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f17 = j92.b.f97899b.f97921f;
                }
                aVar4 = h4.r.S;
                h4.r rVarD = x2.d(aVar4, 1.0f);
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD, o0VarE);
                h5.g.V.getClass();
                aVar5 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                final r22.p pVar4 = pVar3;
                final h4.r rVar6 = rVar4;
                final c2.u uVar = c2.u.f22885a;
                wf.f.a aVar8 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                pr.b bVar2 = pr.b.f139599a;
                String strA = is.c.a(nVar3, true);
                bVar2.getClass();
                aVar8.f184930c = pr.b.c(strA);
                wf.h.a(aVar8);
                wf.f fVarA = aVar8.a();
                h4.r rVarD2 = x2.d(aVar4, 1.0f);
                f5.k.f68985a.getClass();
                final ds.n nVar5 = nVar3;
                jf.r.a(fVarA, null, rVarD2, null, null, f5.k.a.f68988c, null, o0VarE, 1573296, 1976);
                n2 n2VarC = y3Var.c(nVar4);
                final r22.p pVar5 = pVar;
                final r22.p pVar6 = pVar2;
                final float f18 = f17;
                final boolean z17 = z16;
                e23.p pVar7 = new e23.p() { // from class: gs.q
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i26;
                        float f19;
                        q qVar;
                        e0.a aVar9;
                        h5.g.a.b bVar3;
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var2 = p3.n.f135158a;
                            h4.r.a aVar10 = h4.r.S;
                            h4.r rVarD3 = x2.d(aVar10, 1.0f);
                            d0.f128823b.getClass();
                            h4.r rVarE = u1.n.e(rVarD3, d0.f128831j, m1.f128891a);
                            Object objQ2 = mVar2.q();
                            p3.m.f135153a.getClass();
                            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                            if (objQ2 == c2565a) {
                                objQ2 = tn.k.c(mVar2);
                            }
                            a2.j jVar = (a2.j) objQ2;
                            e23.a aVar11 = aVar2;
                            boolean zB = mVar2.B(aVar11);
                            e23.a aVar12 = aVar6;
                            boolean zB2 = zB | mVar2.B(aVar12);
                            Object objQ3 = mVar2.q();
                            if (zB2 || objQ3 == c2565a) {
                                objQ3 = new at1.e(aVar11, aVar12, 5);
                                mVar2.K(objQ3);
                            }
                            h4.r rVarThen = w.b(rVarE, jVar, null, false, null, null, (e23.a) objQ3, 28).then(rVar6);
                            h4.d.f81522a.getClass();
                            z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                            int iHashCode2 = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC2 = h4.k.c(rVarThen, mVar2);
                            h5.g.V.getClass();
                            e0.a aVar13 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar13);
                            } else {
                                mVar2.c();
                            }
                            h5.g.a.e eVar = h5.g.a.f81810g;
                            b4.c(eVar, z0VarD2, mVar2);
                            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                            b4.c(c1623g, i2VarX, mVar2);
                            h5.g.a.b bVar4 = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                v.h.z(iHashCode2, mVar2, iHashCode2, bVar4);
                            }
                            h5.g.a.f fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC2, mVar2);
                            c2.u uVar2 = c2.u.f22885a;
                            h4.r rVarD4 = x2.d(aVar10, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar = c2.j.f22694d;
                            h4.g.a aVar14 = h4.d.a.f81536n;
                            z zVarA = y.a(kVar, aVar14, mVar2, 0);
                            int iHashCode3 = Long.hashCode(mVar2.getU());
                            i2 i2VarX2 = mVar2.x();
                            h4.r rVarC3 = h4.k.c(rVarD4, mVar2);
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar13);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar, zVarA, mVar2);
                            b4.c(c1623g, i2VarX2, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar2, iHashCode3, bVar4);
                            }
                            b4.c(fVar, rVarC3, mVar2);
                            b0 b0Var = b0.f22601a;
                            p0 p0Var2 = p0Var;
                            String str = p0Var2.f127282a;
                            String str2 = p0Var2.f127283b;
                            Integer num = p0Var2.f127284c;
                            ds.n nVar6 = ds.n.f61012i;
                            ds.n nVar7 = nVar5;
                            float f22 = nVar7 == nVar6 ? 69 : 21;
                            g6.f.a aVar15 = g6.f.f75994b;
                            w5.w wVarB = w5.r.b(v.a(R.font.oswald_regular, null, 14));
                            long j8 = jB;
                            f0.a(str, str2, num, null, null, j8, j8, j8, f22, wVarB, mVar2, 3072, 16);
                            c2.l.f(b0Var.a(aVar10, 1.0f, true), mVar2);
                            if (nVar7 == nVar6) {
                                f19 = 124;
                                i26 = 0;
                            } else {
                                i26 = 0;
                                f19 = 0;
                            }
                            h4.r rVarO = c2.l.o(c2.l.C(aVar10, 0.0f, 0.0f, 0.0f, f19, 7), q1.Min);
                            Object objQ4 = mVar2.q();
                            if (objQ4 == c2565a) {
                                qVar = this;
                                objQ4 = new b2(p1Var, 22);
                                mVar2.K(objQ4);
                            } else {
                                qVar = this;
                            }
                            h4.r rVarF = g0.f(rVarO, (e23.l) objQ4);
                            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81535m, mVar2, 48);
                            int iHashCode4 = Long.hashCode(mVar2.getU());
                            i2 i2VarX3 = mVar2.x();
                            h4.r rVarC4 = h4.k.c(rVarF, mVar2);
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                aVar9 = aVar13;
                                mVar2.M(aVar9);
                            } else {
                                aVar9 = aVar13;
                                mVar2.c();
                            }
                            b4.c(eVar, s2VarA, mVar2);
                            b4.c(c1623g, i2VarX3, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                                bVar3 = bVar4;
                                v.h.z(iHashCode4, mVar2, iHashCode4, bVar3);
                            } else {
                                bVar3 = bVar4;
                            }
                            b4.c(fVar, rVarC4, mVar2);
                            u2 u2Var = u2.f22900a;
                            t4.d dVarA = n5.c.a(R.drawable.photosharing_line, mVar2, i26);
                            o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, j8);
                            h4.r rVarC5 = x2.c(aVar10, 1.0f);
                            f5.k.f68985a.getClass();
                            h5.g.a.b bVar5 = bVar3;
                            y0.a(dVarA, null, rVarC5, null, f5.k.a.f68987b, 0.0f, rVarA, mVar2, 25008, 40);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar2 = j92.b.f97899b;
                            h4.r rVarC6 = c2.l.C(c2.l.A(aVar10, 0.0f, eVar2.f97918c, 1), eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14);
                            z zVarA2 = y.a(kVar, aVar14, mVar2, 0);
                            int iHashCode5 = Long.hashCode(mVar2.getU());
                            i2 i2VarX4 = mVar2.x();
                            h4.r rVarC7 = h4.k.c(rVarC6, mVar2);
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar9);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar, zVarA2, mVar2);
                            b4.c(c1623g, i2VarX4, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode5))) {
                                v.h.z(iHashCode5, mVar2, iHashCode5, bVar5);
                            }
                            b4.c(fVar, rVarC7, mVar2);
                            r22.p pVar8 = pVar5;
                            String strH = pVar8 != null ? pVar8.f149774a : null;
                            if (strH == null) {
                                strH = sn.a.h(mVar2, 1003251009, R.string.no_value, mVar2);
                            } else {
                                mVar2.C(1003250389);
                                mVar2.f();
                            }
                            ds.b0.a(null, strH, j8, pVar8 != null ? pVar8.f149776c : null, pVar8 != null ? pVar8.f149775b : null, 0, false, false, mVar2, 0, 225);
                            r22.p pVar9 = pVar6;
                            String strH2 = pVar9 != null ? pVar9.f149774a : null;
                            if (strH2 == null) {
                                strH2 = sn.a.h(mVar2, 1003262177, R.string.no_value, mVar2);
                            } else {
                                mVar2.C(1003261526);
                                mVar2.f();
                            }
                            String str3 = pVar9 != null ? pVar9.f149776c : null;
                            String str4 = pVar9 != null ? pVar9.f149775b : null;
                            float f24 = f16;
                            ds.b0.a(c2.l.C(aVar10, 0.0f, f24, 0.0f, 0.0f, 13), strH2, j8, str3, str4, 0, false, false, mVar2, 0, 224);
                            r22.p pVar10 = pVar4;
                            String strH3 = pVar10 != null ? pVar10.f149774a : null;
                            if (strH3 == null) {
                                strH3 = sn.a.h(mVar2, 1003275969, R.string.no_value, mVar2);
                            } else {
                                mVar2.C(1003275349);
                                mVar2.f();
                            }
                            ds.b0.a(c2.l.C(aVar10, 0.0f, f24, 0.0f, 0.0f, 13), strH3, j8, pVar10 != null ? pVar10.f149776c : null, pVar10 != null ? pVar10.f149775b : null, 0, false, false, mVar2, 0, 224);
                            mVar2.y();
                            mVar2.y();
                            mVar2.y();
                            y0.a(n5.c.a(z17 ? R.drawable.garmin_logo_tag_vertical_white : R.drawable.garmin_logo_tag_vertical, mVar2, 0), null, uVar2.c(c2.l.C(aVar10, 0.0f, f18, 0.0f, 0.0f, 13), h4.d.a.f81526d), null, null, 0.0f, null, mVar2, 48, 120);
                            mVar2.y();
                            String upperCase = gl1.y.Q(mVar2, R.string.lbl_transparent).toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            d92.b.f58624b.getClass();
                            x0 x0VarB = d92.c.b(x0.a(j92.f.f97935l, 0L, o53.f0.B(16), null, null, o53.f0.B(1), null, null, 0, 0L, null, null, 16777085), mVar2);
                            float f25 = eVar2.f97918c;
                            mh.c(upperCase, c2.l.z(u1.n.e(uVar.c(c2.l.C(aVar10, 0.0f, 0.0f, f25, f25, 3), h4.d.a.f81532j), d92.b.a(mVar2).e().g(), k2.i.a(j92.b.f97900c.f97910b)), eVar2.f97918c, eVar2.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                };
                aVar6 = aVar6;
                o0VarE = o0VarE;
                p3.v.a(n2VarC, z3.f.c(1003079473, pVar7, o0VarE), o0VarE, 56);
                z15 = z14;
                p3.v.a(y3Var.c(new g6.d(((g6.c) o0VarE.A(y3Var)).getF75991a(), 1.0f)), z3.f.c(-1152696550, new r(aVar6, p1Var, z15), o0VarE), o0VarE, 56);
                o0VarE.g0(true);
                rVar3 = rVar6;
                nVar2 = nVar5;
            } else {
                o0VarE.e();
            }
            rVar4 = rVar2;
            nVar3 = nVar;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            l0Var = (l0) h0.e0(0, list);
            if (l0Var != null) {
                pVar = l0Var.f127250a;
            } else {
                pVar = null;
            }
            l0Var2 = (l0) h0.e0(1, list);
            if (l0Var2 != null) {
                pVar2 = l0Var2.f127250a;
            } else {
                pVar2 = null;
            }
            l0Var3 = (l0) h0.e0(2, list);
            if (l0Var3 != null) {
                pVar3 = l0Var3.f127250a;
            } else {
                pVar3 = null;
            }
            aVar3 = p0Var.f127286e;
            if (aVar3 instanceof p0.a.h) {
                hVar = (p0.a.h) aVar3;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                z16 = hVar.f127301a;
            } else {
                z16 = true;
            }
            if (z16) {
                aVarB = j92.a.a();
            } else {
                aVarB = j92.a.b();
            }
            jB = aVarB.k().b();
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.p0.n(null);
                o0VarE.K(objQ);
            }
            p1Var = (p1) objQ;
            y3Var = t1.f91490h;
            nVar4 = new is.n(((g6.c) o0VarE.A(y3Var)).getF75991a() * f14, 1.0f);
            if (nVar3 == ds.n.f61014k) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f15 = j92.b.f97899b.f97921f;
            } else {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f15 = j92.b.f97899b.f97922g;
            }
            f16 = f15;
            i18 = a.f78681a[nVar3.ordinal()];
            if (i18 != 1) {
                f17 = 64;
                g6.f.a aVar9 = g6.f.f75994b;
            } else if (i18 != 2) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f17 = j92.b.f97899b.f97922g;
            } else if (i18 == 3) {
                u0.r();
                return;
            } else {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f17 = j92.b.f97899b.f97921f;
            }
            aVar4 = h4.r.S;
            h4.r rVarD3 = x2.d(aVar4, 1.0f);
            h4.d.f81522a.getClass();
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD3, o0VarE);
            h5.g.V.getClass();
            aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            final r22.p pVar8 = pVar3;
            final h4.r rVar7 = rVar4;
            final c2.t uVar2 = c2.u.f22885a;
            wf.f.a aVar10 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            pr.b bVar3 = pr.b.f139599a;
            String strA2 = is.c.a(nVar3, true);
            bVar3.getClass();
            aVar10.f184930c = pr.b.c(strA2);
            wf.h.a(aVar10);
            wf.f fVarA2 = aVar10.a();
            h4.r rVarD4 = x2.d(aVar4, 1.0f);
            f5.k.f68985a.getClass();
            final ds.n nVar6 = nVar3;
            jf.r.a(fVarA2, null, rVarD4, null, null, f5.k.a.f68988c, null, o0VarE, 1573296, 1976);
            n2 n2VarC2 = y3Var.c(nVar4);
            final r22.p pVar9 = pVar;
            final r22.p pVar10 = pVar2;
            final float f19 = f17;
            final boolean z18 = z16;
            e23.p pVar11 = new e23.p() { // from class: gs.q
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i26;
                    float f110;
                    q qVar;
                    e0.a aVar11;
                    h5.g.a.b bVar4;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var3 = p3.n.f135158a;
                        h4.r.a aVar12 = h4.r.S;
                        h4.r rVarD5 = x2.d(aVar12, 1.0f);
                        d0.f128823b.getClass();
                        h4.r rVarE = u1.n.e(rVarD5, d0.f128831j, m1.f128891a);
                        Object objQ2 = mVar2.q();
                        p3.m.f135153a.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            objQ2 = tn.k.c(mVar2);
                        }
                        a2.j jVar = (a2.j) objQ2;
                        e23.a aVar13 = aVar2;
                        boolean zB = mVar2.B(aVar13);
                        e23.a aVar14 = aVar6;
                        boolean zB2 = zB | mVar2.B(aVar14);
                        Object objQ3 = mVar2.q();
                        if (zB2 || objQ3 == c2565a) {
                            objQ3 = new at1.e(aVar13, aVar14, 5);
                            mVar2.K(objQ3);
                        }
                        h4.r rVarThen = w.b(rVarE, jVar, null, false, null, null, (e23.a) objQ3, 28).then(rVar7);
                        h4.d.f81522a.getClass();
                        z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarThen, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar15 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar15);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar = h5.g.a.f81810g;
                        b4.c(eVar, z0VarD2, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar5);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC2, mVar2);
                        c2.u uVar3 = c2.u.f22885a;
                        h4.r rVarD6 = x2.d(aVar12, 1.0f);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.g.a aVar16 = h4.d.a.f81536n;
                        z zVarA = y.a(kVar, aVar16, mVar2, 0);
                        int iHashCode3 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC3 = h4.k.c(rVarD6, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar15);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar5);
                        }
                        b4.c(fVar, rVarC3, mVar2);
                        b0 b0Var = b0.f22601a;
                        p0 p0Var2 = p0Var;
                        String str = p0Var2.f127282a;
                        String str2 = p0Var2.f127283b;
                        Integer num = p0Var2.f127284c;
                        ds.n nVar7 = ds.n.f61012i;
                        ds.n nVar8 = nVar6;
                        float f22 = nVar8 == nVar7 ? 69 : 21;
                        g6.f.a aVar17 = g6.f.f75994b;
                        w5.w wVarB = w5.r.b(v.a(R.font.oswald_regular, null, 14));
                        long j8 = jB;
                        f0.a(str, str2, num, null, null, j8, j8, j8, f22, wVarB, mVar2, 3072, 16);
                        c2.l.f(b0Var.a(aVar12, 1.0f, true), mVar2);
                        if (nVar8 == nVar7) {
                            f110 = 124;
                            i26 = 0;
                        } else {
                            i26 = 0;
                            f110 = 0;
                        }
                        h4.r rVarO = c2.l.o(c2.l.C(aVar12, 0.0f, 0.0f, 0.0f, f110, 7), q1.Min);
                        Object objQ4 = mVar2.q();
                        if (objQ4 == c2565a) {
                            qVar = this;
                            objQ4 = new b2(p1Var, 22);
                            mVar2.K(objQ4);
                        } else {
                            qVar = this;
                        }
                        h4.r rVarF = g0.f(rVarO, (e23.l) objQ4);
                        s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81535m, mVar2, 48);
                        int iHashCode4 = Long.hashCode(mVar2.getU());
                        i2 i2VarX3 = mVar2.x();
                        h4.r rVarC4 = h4.k.c(rVarF, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            aVar11 = aVar15;
                            mVar2.M(aVar11);
                        } else {
                            aVar11 = aVar15;
                            mVar2.c();
                        }
                        b4.c(eVar, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX3, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                            bVar4 = bVar5;
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar4);
                        } else {
                            bVar4 = bVar5;
                        }
                        b4.c(fVar, rVarC4, mVar2);
                        u2 u2Var = u2.f22900a;
                        t4.d dVarA = n5.c.a(R.drawable.photosharing_line, mVar2, i26);
                        o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, j8);
                        h4.r rVarC5 = x2.c(aVar12, 1.0f);
                        f5.k.f68985a.getClass();
                        h5.g.a.b bVar6 = bVar4;
                        y0.a(dVarA, null, rVarC5, null, f5.k.a.f68987b, 0.0f, rVarA, mVar2, 25008, 40);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        h4.r rVarC6 = c2.l.C(c2.l.A(aVar12, 0.0f, eVar2.f97918c, 1), eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14);
                        z zVarA2 = y.a(kVar, aVar16, mVar2, 0);
                        int iHashCode5 = Long.hashCode(mVar2.getU());
                        i2 i2VarX4 = mVar2.x();
                        h4.r rVarC7 = h4.k.c(rVarC6, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar11);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA2, mVar2);
                        b4.c(c1623g, i2VarX4, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode5))) {
                            v.h.z(iHashCode5, mVar2, iHashCode5, bVar6);
                        }
                        b4.c(fVar, rVarC7, mVar2);
                        r22.p pVar12 = pVar9;
                        String strH = pVar12 != null ? pVar12.f149774a : null;
                        if (strH == null) {
                            strH = sn.a.h(mVar2, 1003251009, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(1003250389);
                            mVar2.f();
                        }
                        ds.b0.a(null, strH, j8, pVar12 != null ? pVar12.f149776c : null, pVar12 != null ? pVar12.f149775b : null, 0, false, false, mVar2, 0, 225);
                        r22.p pVar13 = pVar10;
                        String strH2 = pVar13 != null ? pVar13.f149774a : null;
                        if (strH2 == null) {
                            strH2 = sn.a.h(mVar2, 1003262177, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(1003261526);
                            mVar2.f();
                        }
                        String str3 = pVar13 != null ? pVar13.f149776c : null;
                        String str4 = pVar13 != null ? pVar13.f149775b : null;
                        float f24 = f16;
                        ds.b0.a(c2.l.C(aVar12, 0.0f, f24, 0.0f, 0.0f, 13), strH2, j8, str3, str4, 0, false, false, mVar2, 0, 224);
                        r22.p pVar14 = pVar8;
                        String strH3 = pVar14 != null ? pVar14.f149774a : null;
                        if (strH3 == null) {
                            strH3 = sn.a.h(mVar2, 1003275969, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(1003275349);
                            mVar2.f();
                        }
                        ds.b0.a(c2.l.C(aVar12, 0.0f, f24, 0.0f, 0.0f, 13), strH3, j8, pVar14 != null ? pVar14.f149776c : null, pVar14 != null ? pVar14.f149775b : null, 0, false, false, mVar2, 0, 224);
                        mVar2.y();
                        mVar2.y();
                        mVar2.y();
                        y0.a(n5.c.a(z18 ? R.drawable.garmin_logo_tag_vertical_white : R.drawable.garmin_logo_tag_vertical, mVar2, 0), null, uVar3.c(c2.l.C(aVar12, 0.0f, f19, 0.0f, 0.0f, 13), h4.d.a.f81526d), null, null, 0.0f, null, mVar2, 48, 120);
                        mVar2.y();
                        String upperCase = gl1.y.Q(mVar2, R.string.lbl_transparent).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(x0.a(j92.f.f97935l, 0L, o53.f0.B(16), null, null, o53.f0.B(1), null, null, 0, 0L, null, null, 16777085), mVar2);
                        float f25 = eVar2.f97918c;
                        mh.c(upperCase, c2.l.z(u1.n.e(uVar2.c(c2.l.C(aVar12, 0.0f, 0.0f, f25, f25, 3), h4.d.a.f81532j), d92.b.a(mVar2).e().g(), k2.i.a(j92.b.f97900c.f97910b)), eVar2.f97918c, eVar2.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            };
            aVar6 = aVar6;
            o0VarE = o0VarE;
            p3.v.a(n2VarC2, z3.f.c(1003079473, pVar11, o0VarE), o0VarE, 56);
            z15 = z14;
            p3.v.a(y3Var.c(new g6.d(((g6.c) o0VarE.A(y3Var)).getF75991a(), 1.0f)), z3.f.c(-1152696550, new r(aVar6, p1Var, z15), o0VarE), o0VarE, 56);
            o0VarE.g0(true);
            rVar3 = rVar7;
            nVar2 = nVar6;
        } else {
            z15 = z14;
            o0VarE.e();
            nVar2 = nVar;
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s(rVar3, p0Var, z15, f14, nVar2, aVar6, aVar2, i14, i15);
        }
    }
}
