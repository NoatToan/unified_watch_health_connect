package yr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import i3.i7;
import i3.mh;
import l72.c1;
import l72.v2;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.d7;
import v62.l9;
import v62.m9;
import v62.z4;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f198860a;

        static {
            int[] iArr = new int[PrivacyType.values().length];
            try {
                iArr[PrivacyType.ONLY_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivacyType.MY_CONNECTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrivacyType.MY_GROUPS_AND_CONNECTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrivacyType.EVERYONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f198860a = iArr;
        }
    }

    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-327264787);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            ht.a.f85464a.getClass();
            ht.a.a(null, "ChildActivityPrivacyTapped");
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_activity_set_to_private);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_activity_set_to_private);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new ya0.l(aVar, 12);
                o0VarE.K(objQ);
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == c2565a) {
                objQ2 = new ya0.l(aVar, 13);
                o0VarE.K(objQ2);
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 6, 0, 728);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w51.n0(aVar, i14, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r12v4, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r26v0, types: [p3.m] */
    public static final void b(nr.g.m mVar, p3.m mVar2, int i14) {
        ?? r14;
        j92.e eVar;
        h4.r.a aVar;
        p3.m.a.C2565a c2565a;
        ?? r15;
        ?? r16;
        u4.d dVar;
        String strT;
        p1 p1Var;
        int i15;
        PrivacyType privacyType = mVar.f127096j;
        String str = mVar.f127097k;
        am.x0 x0Var = mVar.f127088b;
        boolean z14 = mVar.f127087a;
        p3.o0 o0VarE = mVar2.E(952786852);
        int i16 = i14 | (o0VarE.B(mVar) ? 4 : 2);
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(rVarE, f14, eVar2.f97918c);
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            u4.d dVarA = null;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            if (z14) {
                eVar = eVar2;
                aVar = aVar2;
                c2565a = c2565a2;
                r15 = 0;
                o0VarE.C(-798908510);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-799676659);
                wf.f.a aVar4 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                aVar4.f184930c = mVar.f127102p.f14387a;
                wf.g.a(aVar4);
                wf.f fVarA = aVar4.a();
                t4.d dVarA2 = n5.c.a(R.drawable.avatar_default, o0VarE, 0);
                t4.d dVarA3 = n5.c.a(R.drawable.avatar_default, o0VarE, 0);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_profile);
                h4.r rVarA = v2.a(aVar2, mVar.f127093g != null, new xn.t(mVar, 13), o0VarE, 6);
                bVar2.getClass();
                h4.r rVarC2 = c2.l.C(rVarA, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11);
                bVar2.getClass();
                h4.r rVarB = l4.k.b(x2.q(rVarC2, j92.b.f97901d.f97905d), k2.i.f102406a);
                eVar = eVar2;
                c2565a = c2565a2;
                r15 = 0;
                aVar = aVar2;
                jf.r.b(fVarA, strQ, rVarB, dVarA2, dVarA3, null, null, null, null, null, null, null, o0VarE, 0, 0, 32736);
                p3.o0 o0Var = o0VarE;
                o0Var.g0(false);
                r16 = o0Var;
            }
            if (x0Var != null) {
                r16 = o0VarE;
                dVar = x0Var.f4362e;
            } else {
                r16 = o0VarE;
                dVar = null;
            }
            if (dVar == null) {
                r16.C(-798860120);
                r16.g0(r15);
            } else {
                r16.C(-798860119);
                bVar2.getClass();
                i7.b(dVar, null, x2.q(aVar, j92.b.f97901d.f97903b), sn.a.y(r16), r16, 48, 0);
                Unit unit = Unit.INSTANCE;
                r16.g0(r15);
            }
            String str2 = mVar.f127103q;
            if (str2 == null) {
                str2 = "";
            }
            c3 c3Var = x0Var != null ? x0Var.f4360c : null;
            if (c3Var == null) {
                r16.C(-798434521);
                r16.g0(r15);
                strT = null;
            } else {
                r16.C(-798434520);
                strT = gl1.d.T(c3Var, r16, r15);
                r16.g0(r15);
            }
            if (strT == null) {
                strT = "";
            }
            String strP = gl1.y.P(R.string.lbl_activity_metadata_voice_over, new Object[]{str2, strT, str == 0 ? "" : str}, r16);
            String str3 = str == 0 ? "" : str;
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, r16);
            bVar2.getClass();
            h4.r.a aVar5 = aVar;
            h4.r rVarC3 = c2.l.C(aVar5, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
            boolean zB = r16.B(strP);
            Object objQ2 = r16.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new y01.k(strP, 8);
                r16.K(objQ2);
            }
            ?? r26 = r16;
            mh.c(str3, p5.v.b(rVarC3, (e23.l) objQ2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, r26, 0, 0, 131068);
            ?? r17 = r26;
            c2.l.f(u2Var.a(aVar5, 1.0f, true), r17);
            if (z14) {
                r17.C(-1826853861);
                int i17 = a.f198860a[privacyType.ordinal()];
                if (i17 == 1) {
                    i15 = 4;
                    s62.a.f157643a.getClass();
                    dVarA = z4.a(t62.b.f162798a);
                } else if (i17 == 2) {
                    i15 = 4;
                    s62.a.f157643a.getClass();
                    dVarA = l9.a(t62.b.f162798a);
                } else if (i17 != 3) {
                    i15 = 4;
                    if (i17 == 4) {
                        s62.a.f157643a.getClass();
                        dVarA = d7.a(t62.b.f162798a);
                    }
                } else {
                    i15 = 4;
                    s62.a.f157643a.getClass();
                    dVarA = m9.a(t62.b.f162798a);
                }
                u4.d dVar2 = dVarA;
                if (dVar2 == null) {
                    r17.C(-797894842);
                    r17.g0(r15);
                    p1Var = p1Var2;
                } else {
                    r17.C(-797894841);
                    bVar2.getClass();
                    h4.r rVarQ = x2.q(aVar5, j92.b.f97901d.f97903b);
                    ?? r18 = (i16 & 14) != i15 ? r15 : 1;
                    Object objQ3 = r17.q();
                    if (r18 != 0 || objQ3 == c2565a) {
                        p1Var = p1Var2;
                        objQ3 = new xr.a(26, mVar, p1Var);
                        r17.K(objQ3);
                    } else {
                        p1Var = p1Var2;
                    }
                    i7.b(dVar2, gl1.y.Q(r17, privacyType.getF28798b()), u1.w.d(rVarQ, false, null, null, (e23.a) objQ3, 15), sn.a.y(r17), r17, 0, 0);
                    Unit unit2 = Unit.INSTANCE;
                    r17.g0(r15);
                }
                r17.g0(r15);
            } else {
                p1Var = p1Var2;
                i15 = 4;
                r17.C(-797213182);
                r17.g0(r15);
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                r17.C(-797170805);
                Object objQ4 = r17.q();
                if (objQ4 == c2565a) {
                    objQ4 = new yg2.l0(p1Var, i15);
                    r17.K(objQ4);
                }
                a((e23.a) objQ4, r17, 6);
                r17.g0(r15);
            } else {
                r17.C(-797087198);
                r17.g0(r15);
            }
            r17.g0(true);
            r14 = r17;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(mVar, i14, 8);
        }
    }
}
