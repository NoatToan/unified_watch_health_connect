package jd0;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q1;
import c2.q2;
import c2.s0;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.base.Ascii;
import com.google.maps.android.PolyUtil;
import f5.z0;
import h2.o0;
import h5.e0;
import ho.d0;
import i3.i7;
import i3.m8;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import ky0.v1;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98382a;

        static {
            int[] iArr = new int[jr.l.values().length];
            try {
                iArr[jr.l.ActivityName.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jr.l.ActivityType.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f98382a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x021f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0262  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x0820  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r13v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v4, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v61, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r46v1, types: [boolean] */
    public static final void a(final h4.r rVar, final ps.q qVar, final ps.m mVar, final wg0.l lVar, String str, final e23.a aVar, p3.m mVar2, final int i14) throws Throwable {
        ?? r14;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        String str2;
        Object obj;
        List list;
        Object obj2;
        long j8;
        h4.r.a aVar2;
        int i15;
        ?? r15;
        e0.a aVar3;
        h5.g.a.b bVar;
        e0.a aVar4;
        h5.g.a.b bVar2;
        char c14;
        Throwable th3;
        ?? r16;
        boolean z14;
        int i16;
        Object obj3;
        String encodedSamples;
        String strC;
        String strC2;
        final String str3 = str;
        ?? E = mVar2.E(-1528983273);
        p3.c<?> cVar = E.f135177b;
        int i17 = ((i14 & 6) == 0 ? (E.B(rVar) ? 4 : 2) | i14 : i14) | 48;
        if ((i14 & 384) == 0) {
            i17 |= (i14 & 512) == 0 ? E.B(qVar) : E.r(qVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= (i14 & 4096) == 0 ? E.B(mVar) : E.r(mVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= (32768 & i14) == 0 ? E.B(lVar) : E.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i17 |= E.B(str3) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i17 |= E.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i18 = i17;
        if (E.n(i18 & 1, (599187 & i18) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) E.A(AndroidCompositionLocals_androidKt.f6042b);
            x0 x0VarO = qVar.o();
            jr.q qVarB = b(context, x0VarO);
            if (qVarB == null) {
                p2VarI0 = E.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i19 = 1;
                pVar = new e23.p() { // from class: jd0.w
                    @Override // e23.p
                    public final Object invoke(Object obj4, Object obj5) throws Throwable {
                        switch (i19) {
                            case 0:
                                ((Integer) obj5).getClass();
                                x.a(rVar, qVar, mVar, lVar, str3, aVar, (p3.m) obj4, p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj5).getClass();
                                x.a(rVar, qVar, mVar, lVar, str3, aVar, (p3.m) obj4, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                ArrayList arrayListA = is.o.a(qVarB.g(), qVar);
                String string = context.getString(R.string.no_value_card);
                string.getClass();
                jr.p pVar2 = (jr.p) h0.e0(0, arrayListA);
                ls.e eVarA = pVar2 != null ? is.m.a(pVar2) : null;
                jr.p pVar3 = (jr.p) h0.e0(1, arrayListA);
                ls.e eVarA2 = pVar3 != null ? is.m.a(pVar3) : null;
                jr.p pVar4 = (jr.p) h0.e0(2, arrayListA);
                ls.e eVarA3 = pVar4 != null ? is.m.a(pVar4) : null;
                String str4 = (eVarA == null || (strC2 = c(context, qVar, eVarA)) == null) ? "" : strC2;
                String str5 = (eVarA2 == null || (strC = c(context, qVar, eVarA2)) == null) ? "" : strC;
                String strC3 = eVarA3 != null ? c(context, qVar, eVarA3) : null;
                ArrayList arrayList = new ArrayList(p13.y.r(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    ls.e eVarA4 = is.m.a((jr.p) it.next());
                    arrayList.add(ss.k.b(eVarA4, new l22.a(context), ss.k.k(eVarA4, qVar), 32));
                }
                String activityName = qVar.getActivityName();
                if (activityName == null) {
                    activityName = com.airbnb.lottie.animation.keyframe.a.j(E, -474071365, R.string.txt_untitle, E, false);
                } else {
                    E.C(-474072450);
                    E.g0(false);
                }
                String strT = gl1.d.T(x0VarO.f4360c, E, 0);
                int i24 = a.f98382a[qVarB.c().ordinal()];
                if (i24 == 1) {
                    str2 = activityName;
                } else {
                    if (i24 != 2) {
                        u0.r();
                        return;
                    }
                    str2 = strT;
                }
                r0 r0Var = new r0();
                r0Var.f105810a = tn.k.g(str2, ".");
                if (qVarB.c() != jr.l.ActivityType) {
                    E.C(-1810936782);
                    r0Var.f105810a = r0Var.f105810a + StringUtils.SPACE + gl1.y.Q(E, R.string.txt_activity_type) + ", " + strT;
                    E.g0(false);
                } else {
                    E.C(-1810820501);
                    E.g0(false);
                }
                g.h hVar = new g.h();
                boolean z15 = (3670016 & i18) == 1048576;
                Object objQ = E.q();
                p3.m.a aVar5 = p3.m.f135153a;
                if (z15) {
                    obj = objQ;
                    m8 m8Var = new m8(aVar, 7);
                    E.K(m8Var);
                    obj = m8Var;
                } else {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        obj = objQ;
                        m8 m8Var2 = new m8(aVar, 7);
                        E.K(m8Var2);
                        obj = m8Var2;
                    }
                }
                obj = objQ;
                c.q qVarC = c.w.c(hVar, (e23.l) obj, E, 0);
                boolean zK = ((i18 & 896) == 256 || ((i18 & 512) != 0 && E.r(qVar))) | E.k(x0VarO.ordinal()) | E.r(context) | E.r(qVarC);
                Object objQ2 = E.q();
                if (zK) {
                    list = null;
                    d0 d0Var = new d0(qVar, x0VarO, context, qVarC, 11);
                    E.K(d0Var);
                    objQ2 = d0Var;
                } else {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        list = null;
                        d0 d0Var2 = new d0(qVar, x0VarO, context, qVarC, 11);
                        E.K(d0Var2);
                        objQ2 = d0Var2;
                    } else {
                        list = null;
                    }
                }
                e23.a aVar6 = (e23.a) objQ2;
                List listC = (!qVarB.getShowPolyline() || mVar == null || (encodedSamples = mVar.getEncodedSamples()) == null) ? list : p13.w.c(PolyUtil.decode(encodedSamples));
                long jA = am.j.A(d92.b.f58623a, E);
                g6.f.a aVar7 = g6.f.f75994b;
                h4.r rVarE = u1.n.e(rVar, jA, k2.i.a(8));
                boolean zB = E.B(aVar6);
                Object objQ3 = E.q();
                if (zB) {
                    obj2 = objQ3;
                    j22.d dVar = new j22.d(aVar6, 3);
                    E.K(dVar);
                    obj2 = dVar;
                } else {
                    aVar5.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        obj2 = objQ3;
                        j22.d dVar2 = new j22.d(aVar6, 3);
                        E.K(dVar2);
                        obj2 = dVar2;
                    }
                }
                obj2 = objQ3;
                h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) obj2, 15);
                h4.d.f81522a.getClass();
                h4.g gVar = h4.d.a.f81524b;
                z0 z0VarD = c2.q.d(gVar, false);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode = Long.hashCode(E.getU());
                i2 i2VarA0 = E.a0();
                h4.r rVarC = h4.k.c(rVarD, E);
                h5.g.V.getClass();
                e0.a aVar8 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar8);
                } else {
                    E.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, E);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, E);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, E, iHashCode, bVar3);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, E);
                c2.u uVar = c2.u.f22885a;
                if (d92.b.d(E)) {
                    gl.c.f77766a.getClass();
                    j8 = gl.c.f77767b.f77789k;
                } else {
                    gl.c.f77766a.getClass();
                    j8 = gl.c.f77767b.f77781g;
                }
                E.C(-2043497269);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97932i, E);
                E.g0(false);
                c2.j jVar = c2.j.f22691a;
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                long j14 = j8;
                h4.r.a aVar9 = h4.r.S;
                bVar4.getClass();
                String str6 = str2;
                h4.r rVarA = c2.l.A(aVar9, 0.0f, eVar2.f97920e, 1);
                h4.g.a aVar10 = h4.d.a.f81536n;
                c2.z zVarA = c2.y.a(iVarI, aVar10, E, 0);
                int iHashCode2 = Long.hashCode(E.getU());
                i2 i2VarA1 = E.a0();
                h4.r rVarC2 = h4.k.c(rVarA, E);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar8);
                } else {
                    E.c();
                }
                b4.c(eVar, zVarA, E);
                b4.c(c1623g, i2VarA1, E);
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, E, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, E);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r rVarO = c2.l.o(x2.f(aVar9, 1.0f), q1.Min);
                c2.j.a.f22700a.getClass();
                c2.j.a.e eVar3 = c2.j.a.f22703d;
                h4.g.b bVar5 = h4.d.a.f81533k;
                s2 s2VarA = q2.a(eVar3, bVar5, E, 6);
                int iHashCode3 = Long.hashCode(E.getU());
                i2 i2VarA2 = E.a0();
                h4.r rVarC3 = h4.k.c(rVarO, E);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                List list2 = listC;
                if (E.T) {
                    E.M(aVar8);
                } else {
                    E.c();
                }
                b4.c(eVar, s2VarA, E);
                b4.c(c1623g, i2VarA2, E);
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, E, iHashCode3, bVar3);
                }
                b4.c(fVar, rVarC3, E);
                u2 u2Var = u2.f22900a;
                bVar4.getClass();
                c2.j.i iVarI2 = c2.j.i(eVar2.f97918c);
                h4.r rVarC4 = x2.c(aVar9, 1.0f);
                c2.z zVarA2 = c2.y.a(iVarI2, aVar10, E, 0);
                int iHashCode4 = Long.hashCode(E.getU());
                i2 i2VarA3 = E.a0();
                h4.r rVarC5 = h4.k.c(rVarC4, E);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar8);
                } else {
                    E.c();
                }
                b4.c(eVar, zVarA2, E);
                b4.c(c1623g, i2VarA3, E);
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode4))) {
                    v.h.A(iHashCode4, E, iHashCode4, bVar3);
                }
                b4.c(fVar, rVarC5, E);
                bVar4.getClass();
                c2.j.i iVarI3 = c2.j.i(eVar2.f97918c);
                bVar4.getClass();
                h4.r rVarA2 = c2.l.A(aVar9, eVar2.f97920e, 0.0f, 2);
                s2 s2VarA2 = q2.a(iVarI3, bVar5, E, 0);
                int iHashCode5 = Long.hashCode(E.getU());
                i2 i2VarA4 = E.a0();
                h4.r rVarC6 = h4.k.c(rVarA2, E);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar8);
                } else {
                    E.c();
                }
                b4.c(eVar, s2VarA2, E);
                b4.c(c1623g, i2VarA4, E);
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode5))) {
                    v.h.A(iHashCode5, E, iHashCode5, bVar3);
                }
                b4.c(fVar, rVarC6, E);
                g6.f.a aVar11 = g6.f.f75994b;
                h4.r rVarA3 = c2.l.A(p5.v.c(new s0(r0Var, 6), aVar9, false), 0.0f, 2, 1);
                if (str6 != null) {
                    string = str6;
                }
                d6.p.f57793b.getClass();
                mh.c(string, rVarA3, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 1, 0, null, x0VarB, E, 0, 24960, 110588);
                if (qVarB.getShowExternalLinkIcon()) {
                    E.C(1927595115);
                    aVar2 = aVar9;
                    r15 = 1;
                    c2.l.f(u2Var.a(aVar2, 1.0f, true), E);
                    bVar4.getClass();
                    i15 = 0;
                    i7.a(n5.c.a(R.drawable.exterior_link, E, 0), null, u2Var.c(x2.q(aVar2, j92.b.f97901d.f97904c), h4.d.a.f81534l), am.j.d(E), E, 48, 0);
                    E.g0(false);
                } else {
                    aVar2 = aVar9;
                    i15 = 0;
                    r15 = 1;
                    E.C(1928154417);
                    E.g0(false);
                }
                E.g0(r15);
                h4.g.b bVar6 = ((double) ((g6.c) E.A(t1.f91490h)).getF75992b()) > 1.5d ? bVar5 : h4.d.a.f81534l;
                bVar4.getClass();
                h4.r rVarA4 = c2.l.A(aVar2, eVar2.f97920e, 0.0f, 2);
                s2 s2VarA3 = q2.a(c2.j.f22692b, bVar6, E, i15);
                x1 x1Var3 = p3.n.f135158a;
                int iHashCode6 = Long.hashCode(E.getU());
                i2 i2VarA5 = E.a0();
                h4.r rVarC7 = h4.k.c(rVarA4, E);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    aVar3 = aVar8;
                    E.M(aVar3);
                } else {
                    aVar3 = aVar8;
                    E.c();
                }
                b4.c(eVar, s2VarA3, E);
                b4.c(c1623g, i2VarA5, E);
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode6))) {
                    bVar = bVar3;
                    v.h.A(iHashCode6, E, iHashCode6, bVar);
                } else {
                    bVar = bVar3;
                }
                b4.c(fVar, rVarC7, E);
                h4.r.a aVar12 = aVar2;
                h4.r rVarC8 = c2.l.C(aVar12, 0.0f, 0.0f, 12, 0.0f, 11);
                u4.d dVar3 = x0VarO.f4362e;
                f02.h.f67736a.getClass();
                h5.g.a.b bVar7 = bVar;
                e0.a aVar13 = aVar3;
                g02.i.a(rVarC8, dVar3, f02.h.a(E), n5.a.a(E, x0VarO.f4366i), 40, 0.0f, null, E, 24582, 224);
                ?? r46 = r15;
                ?? r17 = E;
                g02.e0.a(str4, str5, strC3, null, false, false, false, (String) h0.e0(i15, arrayList), (String) h0.e0(r15, arrayList), (String) h0.e0(2, arrayList), null, null, r17, 0, 0, 3192);
                r17.g0(r46);
                r17.g0(r46);
                c2.z zVarA3 = c2.y.a(c2.j.f22694d, aVar10, r17, 0);
                int iHashCode7 = Long.hashCode(r17.getU());
                i2 i2VarA6 = r17.a0();
                h4.r rVarC9 = h4.k.c(aVar12, r17);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                r17.z();
                if (r17.T) {
                    aVar4 = aVar13;
                    r17.M(aVar4);
                } else {
                    aVar4 = aVar13;
                    r17.c();
                }
                b4.c(eVar, zVarA3, r17);
                b4.c(c1623g, i2VarA6, r17);
                if (r17.T || !p005kotlin.jvm.internal.s.g(r17.q(), Integer.valueOf(iHashCode7))) {
                    bVar2 = bVar7;
                    v.h.A(iHashCode7, r17, iHashCode7, bVar2);
                } else {
                    bVar2 = bVar7;
                }
                b4.c(fVar, rVarC9, r17);
                if ((list2 == null || list2.isEmpty()) ? r46 == true ? 1 : 0 : false) {
                    c14 = Ascii.MIN;
                    th3 = null;
                    r17.C(-2076608194);
                    r17.g0(false);
                } else {
                    r17.C(-2077328944);
                    bVar4.getClass();
                    h4.r rVarC10 = c2.l.C(aVar12, 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11);
                    c14 = Ascii.MIN;
                    h4.r rVarG = c2.l.g(rVarC10, 1.0f);
                    z0 z0VarD2 = c2.q.d(gVar, false);
                    int iHashCode8 = Long.hashCode(r17.getU());
                    i2 i2VarA7 = r17.a0();
                    h4.r rVarC11 = h4.k.c(rVarG, r17);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    r17.z();
                    if (r17.T) {
                        r17.M(aVar4);
                    } else {
                        r17.c();
                    }
                    b4.c(eVar, z0VarD2, r17);
                    b4.c(c1623g, i2VarA7, r17);
                    if (r17.T || !p005kotlin.jvm.internal.s.g(r17.q(), Integer.valueOf(iHashCode8))) {
                        v.h.A(iHashCode8, r17, iHashCode8, bVar2);
                    }
                    b4.c(fVar, rVarC11, r17);
                    h4.r rVarD2 = x2.d(aVar12, 1.0f);
                    Object objQ4 = r17.q();
                    aVar5.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    Object obj4 = objQ4;
                    if (objQ4 == c2565a) {
                        j02.r rVar2 = new j02.r(22);
                        r17.K(rVar2);
                        obj4 = rVar2;
                    }
                    e23.l lVar2 = (e23.l) obj4;
                    boolean zL = r17.l(j14) | r17.r(list2);
                    Object objQ5 = r17.q();
                    Object obj5 = objQ5;
                    if (zL || objQ5 == c2565a) {
                        an.a aVar14 = new an.a(j14, list2, r46 == true ? 1 : 0);
                        r17.K(aVar14);
                        obj5 = aVar14;
                    }
                    p002j6.c.b(lVar2, rVarD2, (e23.l) obj5, r17, 54, 0);
                    r17.g0(r46);
                    r17.g0(false);
                    th3 = null;
                }
                r17.g0(r46);
                r17.g0(r46);
                if (lVar == null || lVar.d().isEmpty()) {
                    r16 = 0;
                    r17.C(1558768047);
                    r17.g0(false);
                } else {
                    r17.C(1557251589);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayListD = lVar.d();
                    int i25 = lVar.f185106e;
                    boolean zR = r17.r(arrayListD);
                    Object objQ6 = r17.q();
                    if (zR) {
                        i16 = 2;
                        d62.n nVar = new d62.n(2, arrayListD);
                        r17.K(nVar);
                        obj3 = nVar;
                    } else {
                        aVar5.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            i16 = 2;
                            d62.n nVar2 = new d62.n(2, arrayListD);
                            r17.K(nVar2);
                            obj3 = nVar2;
                        } else {
                            i16 = 2;
                            obj3 = objQ6;
                        }
                    }
                    h2.b bVarB = o0.b(i25, (e23.a) obj3, r17, 0, i16);
                    r17.C(-1196681090);
                    int i26 = 0;
                    for (Object obj6 : arrayListD) {
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            p13.x.q();
                            throw th3;
                        }
                        wg0.f fVar2 = (wg0.f) obj6;
                        if (fVar2 instanceof wg0.c) {
                            r17.C(1712356121);
                            ps.j jVar2 = ((wg0.c) fVar2).f185077b;
                            String feedUrl = jVar2.getFeedUrl();
                            if (feedUrl == null) {
                                feedUrl = jVar2.getMediumUrl();
                            }
                            arrayList2.add(z3.f.c(-588176912, new fv1.b(feedUrl, 11), r17));
                            r17.g0(false);
                        } else {
                            r17.C(1712923266);
                            r17.g0(false);
                            Unit unit = Unit.INSTANCE;
                        }
                        i26 = i27;
                    }
                    r17.g0(false);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r16 = 0;
                    m82.d.b(c2.l.C(rVar, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), i53.a.e(arrayList2), 0.0f, null, 0.0f, null, null, null, bVarB, arrayListD.size() > i16 ? r46 == true ? 1 : 0 : false ? 1 : 0, false, null, r17, 1769472, 0, 3228);
                    r17.g0(false);
                }
                str3 = str;
                if (((str3 == null || str3.length() == 0) ? 1 : r16) == 0) {
                    r17.C(1558816438);
                    h4.r.a aVar15 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarF = x2.f(c2.l.A(aVar15, j92.b.f97899b.f97920e, 0.0f, 2), 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA4 = c2.y.a(kVar, h4.d.a.f81536n, r17, r16);
                    x1 x1Var4 = p3.n.f135158a;
                    int iHashCode9 = Long.hashCode(r17.getU());
                    i2 i2VarA8 = r17.a0();
                    h4.r rVarC12 = h4.k.c(rVarF, r17);
                    h5.g.V.getClass();
                    e0.a aVar16 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    r17.z();
                    if (r17.T) {
                        r17.M(aVar16);
                    } else {
                        r17.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA4, r17);
                    b4.c(h5.g.a.f81809f, i2VarA8, r17);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (r17.T || !p005kotlin.jvm.internal.s.g(r17.q(), Integer.valueOf(iHashCode9))) {
                        v.h.A(iHashCode9, r17, iHashCode9, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC12, r17);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    v1.a(str3, null, r17, (i18 >> 15) & 14, 2);
                    z14 = true;
                    r17.g0(true);
                    r17.g0(r16);
                } else {
                    z14 = true;
                    r17.C(1559024975);
                    r17.g0(r16);
                }
                r17.g0(z14);
                r17.g0(z14);
                x1 x1Var5 = p3.n.f135158a;
                r14 = r17;
            }
            p2VarI0.f135219d = pVar;
        }
        E.e();
        r14 = E;
        p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            final int i28 = 0;
            pVar = new e23.p() { // from class: jd0.w
                @Override // e23.p
                public final Object invoke(Object obj7, Object obj8) throws Throwable {
                    switch (i28) {
                        case 0:
                            ((Integer) obj8).getClass();
                            x.a(rVar, qVar, mVar, lVar, str3, aVar, (p3.m) obj7, p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj8).getClass();
                            x.a(rVar, qVar, mVar, lVar, str3, aVar, (p3.m) obj7, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final jr.q b(Context context, x0 x0Var) {
        List<jr.q> listA = new kr.a(context).a(x0Var).a();
        Object obj = null;
        if (listA == null) {
            return null;
        }
        for (Object obj2 : listA) {
            if (((jr.q) obj2).d() == jr.s.Home) {
                obj = obj2;
                break;
            }
        }
        return (jr.q) obj;
    }

    public static String c(Context context, ps.q qVar, ls.e eVar) {
        return ss.k.b(eVar, new l22.a(context), ss.k.k(eVar, qVar), ss.k.c(eVar));
    }
}
