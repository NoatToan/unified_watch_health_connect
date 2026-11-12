package tw;

import a42.a0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.t;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kw.i;
import kw.k;
import kw.m;
import l72.x0;
import lc.u0;
import o13.u;
import o4.m1;
import o53.f0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.v;
import s70.r0;
import t21.l0;
import t21.v0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166667a;

        static {
            int[] iArr = new int[kw.b.values().length];
            try {
                iArr[kw.b.ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kw.b.TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kw.b.THREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kw.b.FOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kw.b.FIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f166667a = iArr;
        }
    }

    public static final void a(Context context, k kVar, m mVar, p3.m mVar2, int i14) {
        Map<String, Integer> mapB;
        Integer num;
        Map<String, Integer> mapB2;
        Integer num2;
        Map<String, Integer> mapB3;
        Integer num3;
        Map<String, Integer> mapB4;
        Integer num4;
        Map<String, Integer> mapB5;
        o0 o0VarE = mVar2.E(537832747);
        int i15 = 4;
        int i16 = i14 | (o0VarE.r(context) ? 4 : 2) | (o0VarE.r(kVar) ? 32 : 16) | (o0VarE.r(mVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<kw.b, kw.f> entry : mVar.f106878b.entrySet()) {
                int i17 = a.f166667a[entry.getKey().ordinal()];
                if (i17 == 1) {
                    int iIntValue = (kVar == null || (mapB = kVar.b()) == null || (num = mapB.get(entry.getValue().f106836a)) == null) ? 0 : num.intValue();
                    arrayList.add(new u(String.valueOf(iIntValue), entry.getValue().f106837b, context.getResources().getQuantityString(R.plurals.lbl_reports_days, iIntValue)));
                } else if (i17 == 2) {
                    int iIntValue2 = (kVar == null || (mapB2 = kVar.b()) == null || (num2 = mapB2.get(entry.getValue().f106836a)) == null) ? 0 : num2.intValue();
                    arrayList.add(new u(String.valueOf(iIntValue2), entry.getValue().f106837b, context.getResources().getQuantityString(R.plurals.lbl_reports_days, iIntValue2)));
                } else if (i17 == 3) {
                    int iIntValue3 = (kVar == null || (mapB3 = kVar.b()) == null || (num3 = mapB3.get(entry.getValue().f106836a)) == null) ? 0 : num3.intValue();
                    arrayList.add(new u(String.valueOf(iIntValue3), entry.getValue().f106837b, context.getResources().getQuantityString(R.plurals.lbl_reports_days, iIntValue3)));
                } else if (i17 == i15) {
                    int iIntValue4 = (kVar == null || (mapB4 = kVar.b()) == null || (num4 = mapB4.get(entry.getValue().f106836a)) == null) ? 0 : num4.intValue();
                    arrayList.add(new u(String.valueOf(iIntValue4), entry.getValue().f106837b, context.getResources().getQuantityString(R.plurals.lbl_reports_days, iIntValue4)));
                } else {
                    if (i17 != 5) {
                        u0.r();
                        return;
                    }
                    Integer num5 = (kVar == null || (mapB5 = kVar.b()) == null) ? null : mapB5.get(entry.getValue().f106836a);
                    if (num5 != null && num5.intValue() > 0) {
                        arrayList.add(new u(String.valueOf(num5.intValue()), entry.getValue().f106837b, context.getResources().getQuantityString(R.plurals.lbl_reports_days, num5.intValue())));
                    }
                }
                i15 = 4;
            }
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar2 = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0 x0Var = x0.f111346a;
            float f14 = 16;
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarB = l.B(aVar, f14, f14, f14, f14);
            z3.e eVarC = z3.f.c(-1731414918, new gw1.h(1, arrayList), o0VarE);
            int i18 = x0.f111348c << 6;
            x0Var.e(rVarB, eVarC, o0VarE, i18 | 48, 0);
            int i19 = i18 | 54;
            x0Var.e(l.C(aVar, f14, 0.0f, f14, f14, 2), z3.f.c(-2108450191, new gw1.h(2, arrayList), o0VarE), o0VarE, i19, 0);
            u uVar = (u) h0.e0(4, arrayList);
            if (uVar == null) {
                o0VarE.C(-1709503715);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1709503714);
                x0Var.e(l.C(aVar, f14, 0.0f, f14, f14, 2), z3.f.c(383180343, new v0(uVar, 6), o0VarE), o0VarE, i19, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(context, kVar, mVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x030f  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r23v0, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r8v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v5, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r8v8, types: [p3.o0] */
    public static final void b(qw.g gVar, i iVar, DateTime dateTime, DateTime dateTime2, boolean z14, e23.l<? super o, Unit> lVar, p3.m mVar, int i14) {
        e23.l<? super o, Unit> lVar2;
        i iVar2;
        qw.g gVar2;
        ?? r14;
        j.k kVar;
        e0.a aVar;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.f fVar;
        h5.g.a.b bVar;
        Context context;
        ?? r15;
        boolean z15;
        r.a aVar2;
        ?? r16;
        int i15;
        ?? r17;
        kw.h hVar;
        kw.h hVar2;
        List<kw.l> listD;
        gVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-684716869);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(gVar) ? 4 : 2) | (o0VarE.r(iVar) ? 32 : 16) | (o0VarE.r(dateTime) ? 256 : 128) | (o0VarE.r(dateTime2) ? 2048 : 1024) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (i16 & 74899) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarG = f0.G(gVar.f148252g, o0VarE);
            r.a aVar3 = r.S;
            r rVarD = x2.d(aVar3, 1.0f);
            j.f22691a.getClass();
            j.k kVar2 = j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            z zVarA = y.a(kVar2, aVar4, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            h.a(iVar, dateTime, dateTime2, z14, o0VarE, (i16 >> 3) & 8190);
            if (iVar != null) {
                o0VarE.C(3566689);
                String str = iVar.f106860b.f106879c;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                float f14 = 16;
                g6.f.a aVar6 = g6.f.f75994b;
                aVar2 = aVar3;
                r rVarC2 = l.C(aVar2, f14, 0.0f, f14, f14, 2);
                z15 = true;
                fVar = fVar2;
                context = context2;
                eVar = eVar2;
                r15 = 0;
                aVar = aVar5;
                c1623g = c1623g2;
                bVar = bVar2;
                kVar = kVar2;
                iVar2 = iVar;
                mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 48, 0, 131068);
                o0 o0Var = o0VarE;
                o0Var.g0(false);
                r16 = o0Var;
            } else {
                kVar = kVar2;
                aVar = aVar5;
                eVar = eVar2;
                c1623g = c1623g2;
                fVar = fVar2;
                bVar = bVar2;
                context = context2;
                r15 = 0;
                z15 = true;
                o0 o0Var2 = o0VarE;
                iVar2 = iVar;
                aVar2 = aVar3;
                o0Var2.C(3788029);
                o0Var2.g0(false);
                r16 = o0Var2;
            }
            if (iVar2 == null || (hVar2 = iVar2.f106859a) == null || (listD = hVar2.d()) == null || (!listD.isEmpty()) != z15) {
                i15 = 8;
                r16.C(4226493);
                r16.g0(r15);
                r17 = r16;
            } else {
                r16.C(3875728);
                a(context, hVar2.getBloodPressureStats(), iVar2.f106860b, r16, r15);
                String strP = gl1.y.P(R.string.lbl_readings_number, new Object[]{""}, r16);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), r16);
                float f15 = 16;
                g6.f.a aVar7 = g6.f.f75994b;
                ?? r24 = r16;
                i15 = 8;
                mh.c(strP, l.B(aVar2, f15, 8, f15, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, r24, 0, 0, 131068);
                ?? r18 = r24;
                r18.g0(r15);
                r17 = r18;
            }
            g6.f.a aVar8 = g6.f.f75994b;
            r rVarC3 = l.C(u1.n.e(aVar2, vb.h.f(d92.b.f58623a, r17), m1.f128891a), 0.0f, i15, 0.0f, 0.0f, 13);
            z zVarA2 = y.a(kVar, aVar4, r17, r15);
            int iHashCode2 = Long.hashCode(r17.U);
            i2 i2VarA1 = r17.a0();
            r rVarC4 = h4.k.c(rVarC3, r17);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            r17.z();
            if (r17.T) {
                r17.M(aVar);
            } else {
                r17.c();
            }
            b4.c(eVar, zVarA2, r17);
            b4.c(c1623g, i2VarA1, r17);
            if (r17.T || !s.g(r17.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, r17, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC4, r17);
            List<kw.l> listD2 = (iVar2 == null || (hVar = iVar2.f106859a) == null) ? null : hVar.d();
            m mVar2 = iVar2 != null ? iVar2.f106860b : null;
            ?? r19 = (i16 & 458752) == 131072 ? 1 : r15;
            Object objQ = r17.q();
            p3.m.a aVar9 = p3.m.f135153a;
            if (r19 == 0) {
                aVar9.getClass();
                if (objQ == p3.m.a.f135155b) {
                    lVar2 = lVar;
                    objQ = new ta0.j(lVar2, i15);
                    r17.K(objQ);
                } else {
                    lVar2 = lVar;
                }
            } else {
                lVar2 = lVar;
                objQ = new ta0.j(lVar2, i15);
                r17.K(objQ);
            }
            e(listD2, mVar2, z14, (e23.l) objQ, r17, 384);
            v60.a aVar10 = (v60.a) p1VarG.getF182175a();
            if (aVar10 == null || !aVar10.f175792a) {
                gVar2 = gVar;
                r17.C(666687379);
                r17.g0(r15);
            } else {
                r17.C(666522087);
                v60.a aVar11 = (v60.a) p1VarG.getF182175a();
                String str2 = aVar11 != null ? aVar11.f175793b : null;
                gVar2 = gVar;
                boolean zR = r17.r(gVar2);
                Object objQ2 = r17.q();
                if (zR) {
                    objQ2 = new qw.e(gVar2, 3);
                    r17.K(objQ2);
                } else {
                    aVar9.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new qw.e(gVar2, 3);
                        r17.K(objQ2);
                    }
                }
                g.a(r15, (e23.a) objQ2, str2, r17);
                r17.g0(r15);
            }
            r17.g0(true);
            r17.g0(true);
            r14 = r17;
        } else {
            lVar2 = lVar;
            iVar2 = iVar;
            gVar2 = gVar;
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(gVar2, iVar2, dateTime, dateTime2, z14, lVar2, i14, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0135  */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x0164  */
    /* JADX WARN: Code duplicated, block: B:83:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0174  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0204  */
    /* JADX WARN: Code duplicated, block: B:94:0x020b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0284  */
    public static final void c(t tVar, String str, String str2, String str3, String str4, int i14, p3.m mVar, int i15) {
        int i16;
        o0 o0Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean z14;
        Object objQ;
        p3.m.a aVar;
        boolean z15;
        Object objQ2;
        o0 o0VarE = mVar.E(-671152947);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(tVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.B(str4) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.k(i14) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            float f14 = 16;
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarY = l.y(aVar2, f14);
            h4.d.f81522a.getClass();
            r rVarC2 = tVar.c(rVarY, h4.d.a.f81529g);
            h4.g.b bVar = h4.d.a.f81534l;
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22692b, bVar, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var = u2.f22900a;
                zVarA = y.a(j.f22694d, h4.d.a.f81538p, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                if ((i16 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ = o0VarE.q();
                aVar = p3.m.f135153a;
                if (z14) {
                    objQ = new r0(str2, 23);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new r0(str2, 23);
                        o0VarE.K(objQ);
                    }
                }
                r rVarC4 = v.c((e23.l) objQ, aVar2, false);
                d92.b.f58623a.getClass();
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                s5.x0 x0Var = j92.f.f97932i;
                mh.c(str, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(x0Var, o0VarE)), o0VarE, (i16 >> 3) & 14, 0, 131068);
                r rVarC5 = l.C(aVar2, 0.0f, 4, 0.0f, 0.0f, 13);
                if ((57344 & i16) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ2 = o0VarE.q();
                if (z15) {
                    objQ2 = new r0(str4, 24);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new r0(str4, 24);
                        o0VarE.K(objQ2);
                    }
                }
                r rVarC6 = v.c((e23.l) objQ2, rVarC5, false);
                fVar2.getClass();
                mh.c(str3, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(x0Var, o0VarE)), o0VarE, (i16 >> 9) & 14, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(true);
                q.a(u1.n.e(l4.k.b(x2.q(x2.c(l.C(aVar2, f14, 0.0f, 0.0f, 0.0f, 14), 1.0f), 24), k2.i.f102406a), n5.a.a(o0Var, i14), m1.f128891a), o0Var, 0);
                o0Var.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var2 = u2.f22900a;
            zVarA = y.a(j.f22694d, h4.d.a.f81538p, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            if ((i16 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ = o0VarE.q();
            aVar = p3.m.f135153a;
            if (z14) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new r0(str2, 23);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new r0(str2, 23);
                o0VarE.K(objQ);
            }
            r rVarC7 = v.c((e23.l) objQ, aVar2, false);
            d92.b.f58623a.getClass();
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            s5.x0 x0Var2 = j92.f.f97932i;
            mh.c(str, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(x0Var2, o0VarE)), o0VarE, (i16 >> 3) & 14, 0, 131068);
            r rVarC8 = l.C(aVar2, 0.0f, 4, 0.0f, 0.0f, 13);
            if ((57344 & i16) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ2 = o0VarE.q();
            if (z15) {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new r0(str4, 24);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new r0(str4, 24);
                o0VarE.K(objQ2);
            }
            r rVarC9 = v.c((e23.l) objQ2, rVarC8, false);
            fVar3.getClass();
            mh.c(str3, rVarC9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(x0Var2, o0VarE)), o0VarE, (i16 >> 9) & 14, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            q.a(u1.n.e(l4.k.b(x2.q(x2.c(l.C(aVar2, f14, 0.0f, 0.0f, 0.0f, 14), 1.0f), 24), k2.i.f102406a), n5.a.a(o0Var, i14), m1.f128891a), o0Var, 0);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(tVar, str, str2, str3, str4, i14, i15, 26);
        }
    }

    public static final void d(t tVar, String str, String str2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1682176547);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarY = l.y(aVar, 16);
            h4.d.f81522a.getClass();
            r rVarC = tVar.c(rVarY, h4.d.a.f81527e);
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97932i, o0VarE)), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0Var = o0VarE;
            if (str2 == null) {
                o0Var.C(868030136);
                o0Var.g0(false);
            } else {
                o0Var.C(868030137);
                r rVarC3 = l.C(aVar, 0.0f, 4, 0.0f, 0.0f, 13);
                fVar.getClass();
                mh.c(str2, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 48, 0, 131068);
                o0Var = o0Var;
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(tVar, str, str2, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:164:0x0344  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r8v98 */
    public static final void e(List<kw.l> list, m mVar, boolean z14, e23.l<? super o, Unit> lVar, p3.m mVar2, int i14) {
        String string;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        int i15;
        Map<kw.b, kw.f> map;
        Collection<kw.f> collectionValues;
        o0 o0VarE = mVar2.E(-284293504);
        int i16 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(mVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        boolean z15 = false;
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            yw.b bVar = new yw.b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            if (list == null) {
                o0VarE.C(288078024);
                o0VarE.g0(false);
            } else {
                o0VarE.C(288078025);
                for (kw.l lVar2 : list) {
                    p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                    pi0.e eVar = bVar.f199876b;
                    l22.a aVar = bVar.f199875a;
                    if (z14) {
                        lVar2.getClass();
                        string = aVar.getString(R.string.common_week_label);
                        DateTime dateTimeQ = lVar2.q();
                        DateTime dateTimeF = lVar2.f();
                        if (dateTimeQ != null && dateTimeF != null) {
                            string = eVar.l(dateTimeQ, dateTimeF, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                        }
                    } else {
                        lVar2.getClass();
                        String string2 = aVar.getString(R.string.mct_next_phase_day);
                        DateTime dateTimeQ2 = lVar2.q();
                        if (dateTimeQ2 != null) {
                            string2 = eVar.a(dateTimeQ2, qi0.a.WEEKDAY);
                        }
                        string = string2;
                        DateTime dateTimeQ3 = lVar2.q();
                        T tA = dateTimeQ3 != null ? eVar.a(dateTimeQ3, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY) : "";
                        Integer numberOfMeasurements = lVar2.getNumberOfMeasurements();
                        int iIntValue = numberOfMeasurements != null ? numberOfMeasurements.intValue() : 0;
                        if (iIntValue > i17) {
                            tA = aVar.a(R.string.lbl_named_readings_count, tA, String.valueOf(iIntValue));
                        }
                        r0Var.f105810a = tA;
                    }
                    lVar2.getClass();
                    Integer numberOfMeasurements2 = lVar2.getNumberOfMeasurements();
                    Object obj = null;
                    if (numberOfMeasurements2 != null && numberOfMeasurements2.intValue() == i17) {
                        Double lowSystolic = lVar2.getLowSystolic();
                        strValueOf = String.valueOf(lowSystolic != null ? Integer.valueOf((int) lowSystolic.doubleValue()) : null);
                    } else {
                        Double lowSystolic2 = lVar2.getLowSystolic();
                        Integer numValueOf = lowSystolic2 != null ? Integer.valueOf((int) lowSystolic2.doubleValue()) : null;
                        Double highSystolic = lVar2.getHighSystolic();
                        strValueOf = numValueOf + "-" + (highSystolic != null ? Integer.valueOf((int) highSystolic.doubleValue()) : null);
                    }
                    String strA = aVar.a(R.string.string_space_string_pattern, strValueOf, aVar.getString(R.string.lbl_systolic_abbreviation));
                    Integer numberOfMeasurements3 = lVar2.getNumberOfMeasurements();
                    if (numberOfMeasurements3 != null && numberOfMeasurements3.intValue() == 1) {
                        Double lowSystolic3 = lVar2.getLowSystolic();
                        strValueOf2 = String.valueOf(lowSystolic3 != null ? Integer.valueOf((int) lowSystolic3.doubleValue()) : null);
                    } else {
                        Double lowSystolic4 = lVar2.getLowSystolic();
                        Integer numValueOf2 = lowSystolic4 != null ? Integer.valueOf((int) lowSystolic4.doubleValue()) : null;
                        Double highSystolic2 = lVar2.getHighSystolic();
                        strValueOf2 = numValueOf2 + "-" + (highSystolic2 != null ? Integer.valueOf((int) highSystolic2.doubleValue()) : null);
                    }
                    String strA2 = aVar.a(R.string.string_space_string_pattern, strValueOf2, aVar.getString(R.string.lbl_blood_pressure_systolic));
                    Integer numberOfMeasurements4 = lVar2.getNumberOfMeasurements();
                    if (numberOfMeasurements4 != null && numberOfMeasurements4.intValue() == 1) {
                        Double lowDiastolic = lVar2.getLowDiastolic();
                        strValueOf3 = String.valueOf(lowDiastolic != null ? Integer.valueOf((int) lowDiastolic.doubleValue()) : null);
                    } else {
                        Double lowDiastolic2 = lVar2.getLowDiastolic();
                        Integer numValueOf3 = lowDiastolic2 != null ? Integer.valueOf((int) lowDiastolic2.doubleValue()) : null;
                        Double highDiastolic = lVar2.getHighDiastolic();
                        strValueOf3 = numValueOf3 + "-" + (highDiastolic != null ? Integer.valueOf((int) highDiastolic.doubleValue()) : null);
                    }
                    String strA3 = aVar.a(R.string.string_space_string_pattern, strValueOf3, aVar.getString(R.string.lbl_diastolic_abbreviation));
                    Integer numberOfMeasurements5 = lVar2.getNumberOfMeasurements();
                    if (numberOfMeasurements5 != null && numberOfMeasurements5.intValue() == 1) {
                        Double lowDiastolic3 = lVar2.getLowDiastolic();
                        strValueOf4 = String.valueOf(lowDiastolic3 != null ? Integer.valueOf((int) lowDiastolic3.doubleValue()) : null);
                    } else {
                        Double lowDiastolic4 = lVar2.getLowDiastolic();
                        Integer numValueOf4 = lowDiastolic4 != null ? Integer.valueOf((int) lowDiastolic4.doubleValue()) : null;
                        Double highDiastolic2 = lVar2.getHighDiastolic();
                        strValueOf4 = numValueOf4 + "-" + (highDiastolic2 != null ? Integer.valueOf((int) highDiastolic2.doubleValue()) : null);
                    }
                    String strA4 = aVar.a(R.string.string_space_string_pattern, strValueOf4, aVar.getString(R.string.lbl_blood_pressure_diastolic));
                    if (mVar == null || (map = mVar.f106878b) == null || (collectionValues = map.values()) == null) {
                        i15 = R.color.blood_pressure_category1;
                    } else {
                        for (Object obj2 : collectionValues) {
                            if (s.g(((kw.f) obj2).f106836a, lVar2.getCategoryName())) {
                                obj = obj2;
                                break;
                            }
                        }
                        kw.f fVar = (kw.f) obj;
                        if (fVar != null) {
                            i15 = fVar.f106844i;
                        } else {
                            i15 = R.color.blood_pressure_category1;
                        }
                    }
                    int i18 = i15;
                    z3.e eVarC = z3.f.c(-2069147340, new ry0.g(22, string, r0Var), o0VarE);
                    z3.e eVarC2 = z3.f.c(186356469, new a42.m(i18, strA, strA2, strA3, strA4), o0VarE);
                    r.a aVar2 = r.S;
                    float f14 = 8;
                    g6.f.a aVar3 = g6.f.f75994b;
                    r rVarC = l.C(aVar2, f14, 0.0f, f14, f14, 2);
                    boolean zR = o0VarE.r(lVar2) | ((i16 & 7168) == 2048);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new tb0.d(10, lVar2, lVar);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new tb0.d(10, lVar2, lVar);
                            o0VarE.K(objQ);
                        }
                    }
                    l72.l.c(eVarC, eVarC2, rVarC, null, false, (e23.a) objQ, o0VarE, 438, 24);
                    z15 = false;
                    bVar = bVar;
                    i17 = 1;
                }
                o0VarE.g0(z15);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(list, mVar, z14, lVar, i14, 16);
        }
    }
}
