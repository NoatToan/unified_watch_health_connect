package rr0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import l72.x0;
import l72.y0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import rk0.a1;

/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public static final void a(Integer num, Integer num2, Integer num3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1345968499);
        int i15 = i14 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.B(num2) ? 32 : 16) | (o0VarE.B(num3) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            x00.a aVar = new x00.a(context);
            String strE = aVar.e();
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
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
            b0 b0Var = b0.f22601a;
            x0 x0Var = x0.f111346a;
            float f14 = 16;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f14, 7);
            z3.e eVarC = z3.f.c(-156267234, new h(aVar, num, strE, context, num2, 0), o0VarE);
            int i16 = (x0.f111348c << 6) | 54;
            x0Var.e(rVarC2, eVarC, o0VarE, i16, 0);
            x0Var.e(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f14, 7), z3.f.c(-1298445817, new i(aVar, num3, strE, context, 0), o0VarE), o0VarE, i16, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(num, num2, num3, i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154  */
    /* JADX WARN: Code duplicated, block: B:89:0x0237  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [int] */
    /* JADX WARN: Type inference failed for: r9v31 */
    public static final void b(ArrayList arrayList, e23.l lVar, p3.m mVar, int i14) {
        p2 p2VarI0;
        f21.y yVar;
        Integer numValueOf;
        Integer numValueOf2;
        String strA;
        am.x0 x0VarB;
        o0 o0VarE = mVar.E(-1988752498);
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (arrayList.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    yVar = new f21.y(i14, 3, lVar, arrayList);
                }
            } else {
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                x00.a aVar = new x00.a(context);
                mn.a aVar2 = new mn.a(new l22.a(context));
                h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                float f14 = 16;
                g6.f.a aVar3 = g6.f.f75994b;
                float f15 = 8;
                h4.r rVarB = c2.l.B(rVarE, f14, f15, f14, f14);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarB, o0VarE);
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
                o0VarE.C(136118212);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ir0.b bVar2 = (ir0.b) it.next();
                    boolean zD = bVar2.d();
                    gs1.f fVar = bVar2.f94782a;
                    ActivityListItemDTO activityListItemDTO = bVar2.f94783b;
                    if (zD) {
                        if (fVar != null) {
                            numValueOf = fVar.getModerateIntensityMinutes();
                        } else {
                            numValueOf = null;
                        }
                    } else if (activityListItemDTO != null) {
                        numValueOf = Integer.valueOf(activityListItemDTO.W1);
                    } else {
                        numValueOf = null;
                    }
                    ?? IntValue = numValueOf != null ? numValueOf.intValue() : z14;
                    if (bVar2.d()) {
                        if (fVar != null) {
                            numValueOf2 = fVar.getVigorousIntensityMinutes();
                        } else {
                            numValueOf2 = null;
                        }
                    } else if (activityListItemDTO != null) {
                        numValueOf2 = Integer.valueOf(activityListItemDTO.X1);
                    } else {
                        numValueOf2 = null;
                    }
                    ?? IntValue2 = numValueOf2 != null ? numValueOf2.intValue() : z14;
                    if (bVar2.d()) {
                        o0VarE.C(-1799885668);
                        if (bVar2.d()) {
                            if (fVar != null) {
                                x0VarB = fs1.b.b(fVar);
                            } else {
                                x0VarB = null;
                            }
                        } else if (activityListItemDTO != null) {
                            x0VarB = activityListItemDTO.f29265g;
                        } else {
                            x0VarB = null;
                        }
                        if (x0VarB == null) {
                            x0VarB = am.x0.F;
                        }
                        strA = gl1.y.P(R.string.string_short_dash_line_string_pattern, new Object[]{gl1.d.T(x0VarB.f4360c, o0VarE, 0), gl1.y.Q(o0VarE, R.string.moveiq_lbl)}, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1799635281);
                        o0VarE.g0(z14);
                        strA = aVar2.a((bVar2.d() || activityListItemDTO == null) ? null : activityListItemDTO.f29253c);
                    }
                    Integer numValueOf3 = Integer.valueOf((int) IntValue);
                    Integer numValueOf4 = Integer.valueOf((int) IntValue2);
                    String strB = aVar.b(numValueOf3);
                    String strB2 = aVar.b(numValueOf4);
                    int i16 = i15;
                    String str = strA;
                    l22.a aVar5 = aVar.f188233a;
                    mn.a aVar6 = aVar2;
                    ?? r24 = IntValue;
                    String strO = am.j.o(StringUtils.SPACE, aVar5.getString(R.string.lbl_intensity_vigorous_short), e5.l(strB, StringUtils.SPACE, aVar5.getString(R.string.lbl_intensity_moderate_short), StringUtils.SPACE, strB2));
                    DateTime dateTimeB = bVar2.b();
                    String strN = fb1.c.n("@ ", gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{j0.r(context, dateTimeB != null ? dateTimeB.withZone(DateTimeZone.getDefault()) : null), strO}, o0VarE));
                    String strA2 = aVar5.a(R.string.common_minutes_abbreviation_label, aVar.b(Integer.valueOf(oe2.f.y(Integer.valueOf(r24 == true ? 1 : 0), Integer.valueOf((int) IntValue2)))));
                    h4.r rVarA = c2.l.A(h4.r.S, 0.0f, f15, 1);
                    boolean zR = o0VarE.r(bVar2) | ((i16 & 112) == 32);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new rk0.f(8, lVar, bVar2);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new rk0.f(8, lVar, bVar2);
                            o0VarE.K(objQ);
                        }
                    }
                    yz1.t.a(str, strN, strA2, rVarA, false, (e23.a) objQ, o0VarE, 3072, 16);
                    context = context;
                    z14 = false;
                    aVar = aVar;
                    f15 = f15;
                    i15 = i16;
                    aVar2 = aVar6;
                }
                o0VarE.g0(z14);
                o0VarE.g0(true);
                x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = yVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            yVar = new f21.y(i14, 4, lVar, arrayList);
            p2VarI0.f135219d = yVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v11, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static final void c(ir0.a aVar, e23.l<? super ir0.b, Unit> lVar, p3.m mVar, int i14) {
        e23.l<? super ir0.b, Unit> lVar2;
        ?? r14;
        boolean z14;
        ?? r15;
        ?? r16;
        ArrayList arrayList;
        ?? r17;
        lVar.getClass();
        o0 o0VarE = mVar.E(1732026897);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar3, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
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
            if (aVar == null) {
                lVar2 = lVar;
                o0 o0Var = o0VarE;
                z14 = true;
                o0Var.C(-167211817);
                s.a(o0Var, 0);
                o0Var.g0(false);
                r15 = o0Var;
            } else {
                if (aVar.f94767d != null) {
                    o0VarE.C(-168125480);
                    ArrayList arrayListI = oc.b.i(aVar.f94779p);
                    h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                    c2.z zVarA2 = c2.y.a(kVar, aVar3, o0VarE, 0);
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
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
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    d(aVar, o0VarE, ir0.a.f94762r | (i15 & 14));
                    if (arrayListI.isEmpty()) {
                        o0 o0Var2 = o0VarE;
                        z14 = true;
                        r16 = 0;
                        arrayList = arrayListI;
                        o0Var2.C(336743448);
                        o0Var2.g0(false);
                        r17 = o0Var2;
                    } else {
                        o0VarE.C(336445941);
                        String strQ = gl1.y.Q(o0VarE, R.string.intensity_lbl_activity_im);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97932i), o0VarE);
                        g6.f.a aVar5 = g6.f.f75994b;
                        float f14 = 16;
                        arrayList = arrayListI;
                        z14 = true;
                        r16 = 0;
                        mh.c(strQ, c2.l.B(aVar2, f14, 24, f14, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                        o0 o0Var3 = o0VarE;
                        o0Var3.g0(false);
                        r17 = o0Var3;
                    }
                    r17.g0(z14);
                    ?? r18 = (i15 & 112) == 32 ? z14 : r16;
                    Object objQ = r17.q();
                    if (r18 == 0) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            lVar2 = lVar;
                            objQ = new qe2.c(lVar2, 11);
                            r17.K(objQ);
                        } else {
                            lVar2 = lVar;
                        }
                    } else {
                        lVar2 = lVar;
                        objQ = new qe2.c(lVar2, 11);
                        r17.K(objQ);
                    }
                    b(arrayList, (e23.l) objQ, r17, r16);
                    r17.g0(r16);
                    r15 = r17;
                } else {
                    lVar2 = lVar;
                    o0 o0Var4 = o0VarE;
                    z14 = true;
                    o0Var4.C(-167211817);
                    s.a(o0Var4, 0);
                    o0Var4.g0(false);
                    r15 = o0Var4;
                }
            }
            r15.g0(z14);
            r14 = r15;
        } else {
            lVar2 = lVar;
            o0 o0Var5 = o0VarE;
            o0Var5.e();
            r14 = o0Var5;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(aVar, lVar2, i14, 22);
        }
    }

    public static final void d(ir0.a aVar, p3.m mVar, int i14) {
        int i15;
        String str;
        String str2;
        String str3;
        String str4;
        o0 o0VarE = mVar.E(1573874687);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            DateTime dateTimeQ = null;
            LocalDate localDateW = (aVar == null || (str4 = aVar.f94765b) == null) ? null : g22.k.w(str4, "yyyy-MM-dd");
            DateTime dateTimeQ2 = (aVar == null || (str3 = aVar.f94766c) == null) ? null : g22.k.q(str3, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
            DateTime dateTimeQ3 = (aVar == null || (str2 = aVar.f94767d) == null) ? null : g22.k.q(str2, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
            if (aVar != null && (str = aVar.f94769f) != null) {
                dateTimeQ = g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
            }
            m92.o.a(null, gl1.y.Q(o0VarE, R.string.lbl_daily_timeline), null, null, z3.f.c(994735999, new a1(3, aVar, new hz.c(localDateW, dateTimeQ2, dateTimeQ3, dateTimeQ, 15).a()), o0VarE), null, z3.f.c(1124600577, new r12.a(aVar, 17), o0VarE), o0VarE, 1597440, 45);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(aVar, i14, 19);
        }
    }
}
