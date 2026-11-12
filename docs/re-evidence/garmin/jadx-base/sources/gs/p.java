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
import com.google.android.gms.maps.model.LatLng;
import com.google.mlkit.common.MlKitException;
import ds.f0;
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
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;
import s5.x0;
import u1.w;
import u1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78652a;

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
            f78652a = iArr;
        }
    }

    public static final void a(final h4.r rVar, final p0 p0Var, float f14, final ds.n nVar, final e23.a aVar, final e23.a aVar2, p3.m mVar, int i14) {
        float f15;
        float f16;
        float f17;
        p0Var.getClass();
        List<l0> list = p0Var.f127285d;
        aVar2.getClass();
        o0 o0VarE = mVar.E(-441953317);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.k(nVar.ordinal()) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            l0 l0Var = (l0) h0.e0(0, list);
            r22.p pVar = l0Var != null ? l0Var.f127250a : null;
            l0 l0Var2 = (l0) h0.e0(1, list);
            r22.p pVar2 = l0Var2 != null ? l0Var2.f127250a : null;
            l0 l0Var3 = (l0) h0.e0(2, list);
            r22.p pVar3 = l0Var3 != null ? l0Var3.f127250a : null;
            p0.a aVar3 = p0Var.f127286e;
            boolean z14 = aVar3 instanceof p0.a.i;
            p0.a.i iVar = z14 ? (p0.a.i) aVar3 : null;
            final List<List<LatLng>> list2 = iVar != null ? iVar.f127302a : null;
            p0.a.i iVar2 = z14 ? (p0.a.i) aVar3 : null;
            boolean z15 = iVar2 != null ? iVar2.f127303b : true;
            final long jB = (z15 ? j92.a.a() : j92.a.b()).k().b();
            y3 y3Var = t1.f91490h;
            is.n nVar2 = new is.n(((g6.c) o0VarE.A(y3Var)).getF75991a() * f14, 1.0f);
            if (nVar == ds.n.f61014k) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f15 = j92.b.f97899b.f97921f;
            } else {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f15 = j92.b.f97899b.f97922g;
            }
            final float f18 = f15;
            int[] iArr = a.f78652a;
            int i16 = iArr[nVar.ordinal()];
            if (i16 == 1) {
                f16 = MlKitException.CODE_SCANNER_TASK_IN_PROGRESS;
                g6.f.a aVar4 = g6.f.f75994b;
            } else if (i16 == 2) {
                f16 = 88;
                g6.f.a aVar5 = g6.f.f75994b;
            } else if (i16 != 3) {
                u0.r();
                return;
            } else {
                f16 = 56;
                g6.f.a aVar6 = g6.f.f75994b;
            }
            final float f19 = f16;
            int i17 = iArr[nVar.ordinal()];
            if (i17 == 1) {
                f17 = 64;
            } else if (i17 == 2) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f17 = j92.b.f97899b.f97922g;
            } else if (i17 != 3) {
                u0.r();
                return;
            } else {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f17 = j92.b.f97899b.f97921f;
            }
            final float f22 = f17;
            h4.r.a aVar7 = h4.r.S;
            h4.r rVarD = x2.d(aVar7, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar8 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
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
            final c2.u uVar = c2.u.f22885a;
            wf.f.a aVar9 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            pr.b bVar2 = pr.b.f139599a;
            String strA = is.c.a(nVar, true);
            bVar2.getClass();
            aVar9.f184930c = pr.b.c(strA);
            wf.h.a(aVar9);
            wf.f fVarA = aVar9.a();
            h4.r rVarD2 = x2.d(aVar7, 1.0f);
            f5.k.f68985a.getClass();
            final r22.p pVar4 = pVar3;
            jf.r.a(fVarA, null, rVarD2, null, null, f5.k.a.f68988c, null, o0VarE, 1573296, 1976);
            n2 n2VarC = y3Var.c(nVar2);
            final r22.p pVar5 = pVar2;
            final r22.p pVar6 = pVar;
            final boolean z16 = z15;
            o0VarE = o0VarE;
            v.a(n2VarC, z3.f.c(-1607012395, new e23.p() { // from class: gs.o
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18;
                    float f24;
                    e0.a aVar10;
                    h5.g.a.b bVar3;
                    h5.g.a.b bVar4;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar11 = h4.r.S;
                        h4.r rVarD3 = x2.d(aVar11, 1.0f);
                        d0.f128823b.getClass();
                        h4.r rVarE = u1.n.e(rVarD3, d0.f128831j, m1.f128891a);
                        Object objQ = mVar2.q();
                        p3.m.f135153a.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = tn.k.c(mVar2);
                        }
                        a2.j jVar = (a2.j) objQ;
                        e23.a aVar12 = aVar2;
                        boolean zB = mVar2.B(aVar12);
                        e23.a aVar13 = aVar;
                        boolean zB2 = zB | mVar2.B(aVar13);
                        Object objQ2 = mVar2.q();
                        if (zB2 || objQ2 == c2565a) {
                            objQ2 = new at1.e(aVar12, aVar13, 4);
                            mVar2.K(objQ2);
                        }
                        h4.r rVarThen = w.b(rVarE, jVar, null, false, null, null, (e23.a) objQ2, 28).then(rVar);
                        h4.d.f81522a.getClass();
                        z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarThen, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar14 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar14);
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
                        c2.u uVar2 = c2.u.f22885a;
                        h4.r rVarD4 = x2.d(aVar11, 1.0f);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.g.a aVar15 = h4.d.a.f81536n;
                        z zVarA = y.a(kVar, aVar15, mVar2, 0);
                        int iHashCode3 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC3 = h4.k.c(rVarD4, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar14);
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
                        ds.n nVar3 = ds.n.f61012i;
                        ds.n nVar4 = nVar;
                        float f25 = nVar4 == nVar3 ? 69 : 21;
                        g6.f.a aVar16 = g6.f.f75994b;
                        w5.w wVarB = w5.r.b(w5.v.a(R.font.oswald_regular, null, 14));
                        long j8 = jB;
                        f0.a(str, str2, num, null, null, j8, j8, j8, f25, wVarB, mVar2, 3072, 16);
                        c2.l.f(b0Var.a(aVar11, 1.0f, true), mVar2);
                        h4.r rVarO = c2.l.o(aVar11, q1.Min);
                        if (nVar4 == nVar3) {
                            f24 = 124;
                            i18 = 0;
                        } else {
                            i18 = 0;
                            f24 = 0;
                        }
                        h4.r rVarC4 = c2.l.C(rVarO, 0.0f, 0.0f, 0.0f, f24, 7);
                        s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar2, i18);
                        int iHashCode4 = Long.hashCode(mVar2.getU());
                        i2 i2VarX3 = mVar2.x();
                        h4.r rVarC5 = h4.k.c(rVarC4, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            aVar10 = aVar14;
                            mVar2.M(aVar10);
                        } else {
                            aVar10 = aVar14;
                            mVar2.c();
                        }
                        b4.c(eVar, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX3, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                            bVar3 = bVar5;
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar3);
                        } else {
                            bVar3 = bVar5;
                        }
                        b4.c(fVar, rVarC5, mVar2);
                        u2 u2Var = u2.f22900a;
                        t4.d dVarA = n5.c.a(R.drawable.photosharing_line, mVar2, i18);
                        o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, j8);
                        h4.r rVarC6 = x2.c(aVar11, 1.0f);
                        f5.k.f68985a.getClass();
                        e0.a aVar17 = aVar10;
                        h5.g.a.b bVar6 = bVar3;
                        y0.a(dVarA, null, rVarC6, null, f5.k.a.f68987b, 0.0f, rVarA, mVar2, 25008, 40);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        h4.r rVarC7 = c2.l.C(c2.l.A(aVar11, 0.0f, eVar2.f97918c, 1), eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14);
                        z zVarA2 = y.a(kVar, aVar15, mVar2, i18);
                        int iHashCode5 = Long.hashCode(mVar2.getU());
                        i2 i2VarX4 = mVar2.x();
                        h4.r rVarC8 = h4.k.c(rVarC7, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar17);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA2, mVar2);
                        b4.c(c1623g, i2VarX4, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode5))) {
                            bVar4 = bVar6;
                            v.h.z(iHashCode5, mVar2, iHashCode5, bVar4);
                        } else {
                            bVar4 = bVar6;
                        }
                        b4.c(fVar, rVarC8, mVar2);
                        r22.p pVar7 = pVar6;
                        String strH = pVar7 != null ? pVar7.f149774a : null;
                        if (strH == null) {
                            strH = sn.a.h(mVar2, -120591643, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(-120592263);
                            mVar2.f();
                        }
                        h5.g.a.b bVar7 = bVar4;
                        ds.b0.a(null, strH, j8, pVar7 != null ? pVar7.f149776c : null, pVar7 != null ? pVar7.f149775b : null, 0, false, false, mVar2, 0, 225);
                        r22.p pVar8 = pVar5;
                        String strH2 = pVar8 != null ? pVar8.f149774a : null;
                        if (strH2 == null) {
                            strH2 = sn.a.h(mVar2, -120580475, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(-120581126);
                            mVar2.f();
                        }
                        String str3 = strH2;
                        String str4 = pVar8 != null ? pVar8.f149776c : null;
                        String str5 = pVar8 != null ? pVar8.f149775b : null;
                        float f26 = f18;
                        ds.b0.a(c2.l.C(aVar11, 0.0f, f26, 0.0f, 0.0f, 13), str3, j8, str4, str5, 0, false, false, mVar2, 0, 224);
                        r22.p pVar9 = pVar4;
                        String strH3 = pVar9 != null ? pVar9.f149774a : null;
                        if (strH3 == null) {
                            strH3 = sn.a.h(mVar2, -120566683, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(-120567303);
                            mVar2.f();
                        }
                        ds.b0.a(c2.l.C(aVar11, 0.0f, f26, 0.0f, 0.0f, 13), strH3, j8, pVar9 != null ? pVar9.f149776c : null, pVar9 != null ? pVar9.f149775b : null, 0, false, false, mVar2, 0, 224);
                        mVar2.y();
                        mVar2.y();
                        mVar2.y();
                        h4.r rVarD5 = x2.d(aVar11, 1.0f);
                        z zVarA3 = y.a(c2.j.f22698h, h4.d.a.f81538p, mVar2, 54);
                        int iHashCode6 = Long.hashCode(mVar2.getU());
                        i2 i2VarX5 = mVar2.x();
                        h4.r rVarC9 = h4.k.c(rVarD5, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar17);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA3, mVar2);
                        b4.c(c1623g, i2VarX5, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode6))) {
                            v.h.z(iHashCode6, mVar2, iHashCode6, bVar7);
                        }
                        b4.c(fVar, rVarC9, mVar2);
                        y0.a(n5.c.a(z16 ? R.drawable.garmin_logo_tag_vertical_white : R.drawable.garmin_logo_tag_vertical, mVar2, 0), null, c2.l.C(aVar11, 0.0f, f22, 0.0f, 0.0f, 13), null, null, 0.0f, null, mVar2, 48, 120);
                        c2.l.f(x2.h(aVar11, eVar2.f97920e), mVar2);
                        l.b(x2.h(c2.l.C(aVar11, 0.0f, 0.0f, eVar2.f97921f, f19, 3), 196), list2, o4.f0.j(j8), mVar2, 0, 0);
                        mVar2.y();
                        mVar2.y();
                        String upperCase = gl1.y.Q(mVar2, R.string.lbl_transparent).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(x0.a(j92.f.f97935l, 0L, o53.f0.B(16), null, null, o53.f0.B(1), null, null, 0, 0L, null, null, 16777085), mVar2);
                        float f27 = eVar2.f97918c;
                        mh.c(upperCase, c2.l.z(u1.n.e(uVar.c(c2.l.C(aVar11, 0.0f, 0.0f, f27, f27, 3), h4.d.a.f81532j), d92.b.a(mVar2).e().g(), k2.i.a(j92.b.f97900c.f97910b)), eVar2.f97918c, eVar2.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 56);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g02.o0(rVar, p0Var, f14, nVar, aVar, aVar2, i14);
        }
    }
}
