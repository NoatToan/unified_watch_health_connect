package rv1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.t2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h5.e0;
import i3.mh;
import java.util.Locale;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public static final void a(final vv1.d dVar, p3.m mVar, int i14) {
        final vv1.d dVar2 = dVar;
        dVar2.getClass();
        o0 o0VarE = mVar.E(324379829);
        int i15 = i14 | (o0VarE.B(dVar2) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            final oi0.h hVar = new oi0.h((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            final String strQ = y.Q(o0VarE, R.string.no_duration_value);
            final String strQ2 = y.Q(o0VarE, R.string.txt_empty_page_no_data);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ3 = y.Q(o0VarE, uv1.d.f172941e.f172956a);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            h4.r rVarB = b0Var.b(aVar, aVar2);
            bVar.getClass();
            mh.c(strQ3, c2.l.C(rVarB, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            String strQ4 = y.Q(o0VarE, R.string.lbl_race_predictor_status);
            fVar.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            h4.r rVarB2 = b0Var.b(aVar, aVar2);
            bVar.getClass();
            mh.c(strQ4, c2.l.C(rVarB2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            l72.x0 x0Var = l72.x0.f111346a;
            bVar.getClass();
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, f14, eVar.f97920e, 3);
            final int i16 = 0;
            z3.e eVarC = z3.f.c(1514081094, new e23.q() { // from class: rv1.l
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i17 = i16;
                    oi0.h hVar2 = hVar;
                    String str = strQ2;
                    String str2 = strQ;
                    vv1.d dVar3 = dVar;
                    switch (i17) {
                        case 0:
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                o13.p<String, String> pVarB = dVar3.b(str2, str, hVar2);
                                String str3 = pVarB.f128594a;
                                String str4 = pVarB.f128595b;
                                l72.x0 x0Var2 = l72.x0.f111346a;
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                c0235a.f16962a.put("text", str4);
                                b92.a aVarB = c0235a.b();
                                String upperCase = y.Q(mVar2, R.string.pacepro_lbl_distance_5k).toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                int i18 = b92.a.f16960b;
                                int i19 = (iIntValue & 14) | (l72.x0.f111348c << 24);
                                x0Var2.a(i19, 60, aVarB, t2Var, null, null, str3, upperCase, null, null, mVar2);
                                o13.p<String, String> pVarC = dVar3.c(str2, str, hVar2);
                                String str5 = pVarC.f128594a;
                                String str6 = pVarC.f128595b;
                                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                c0235a2.f16962a.put("text", str6);
                                x0Var2.a(i19, 60, c0235a2.b(), t2Var, null, null, str5, y.Q(mVar2, R.string.atp_lbl_half_marathon), null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var3 = p3.n.f135158a;
                                o13.p<String, String> pVarA = dVar3.a(str2, str, hVar2);
                                String str7 = pVarA.f128594a;
                                String str8 = pVarA.f128595b;
                                l72.x0 x0Var3 = l72.x0.f111346a;
                                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                c0235a3.f16962a.put("text", str8);
                                b92.a aVarB2 = c0235a3.b();
                                String upperCase2 = y.Q(mVar3, R.string.pacepro_lbl_distance_10k).toUpperCase(Locale.ROOT);
                                upperCase2.getClass();
                                int i24 = b92.a.f16960b;
                                int i25 = (iIntValue2 & 14) | (l72.x0.f111348c << 24);
                                x0Var3.a(i25, 60, aVarB2, t2Var2, null, null, str7, upperCase2, null, null, mVar3);
                                o13.p<String, String> pVarD = dVar3.d(str2, str, hVar2);
                                String str9 = pVarD.f128594a;
                                String str10 = pVarD.f128595b;
                                b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                c0235a4.f16962a.put("text", str10);
                                x0Var3.a(i25, 60, c0235a4.b(), t2Var2, null, null, str9, y.Q(mVar3, R.string.pacepro_lbl_distance_marathon), null, null, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            int i17 = (l72.x0.f111348c << 6) | 48;
            x0Var.e(rVarC2, eVarC, o0VarE, i17, 0);
            bVar.getClass();
            final int i18 = 1;
            dVar2 = dVar;
            x0Var.e(c2.l.C(aVar, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), z3.f.c(371902511, new e23.q() { // from class: rv1.l
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i19 = i18;
                    oi0.h hVar2 = hVar;
                    String str = strQ2;
                    String str2 = strQ;
                    vv1.d dVar3 = dVar2;
                    switch (i19) {
                        case 0:
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                o13.p<String, String> pVarB = dVar3.b(str2, str, hVar2);
                                String str3 = pVarB.f128594a;
                                String str4 = pVarB.f128595b;
                                l72.x0 x0Var2 = l72.x0.f111346a;
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                c0235a.f16962a.put("text", str4);
                                b92.a aVarB = c0235a.b();
                                String upperCase = y.Q(mVar2, R.string.pacepro_lbl_distance_5k).toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                int i110 = b92.a.f16960b;
                                int i111 = (iIntValue & 14) | (l72.x0.f111348c << 24);
                                x0Var2.a(i111, 60, aVarB, t2Var, null, null, str3, upperCase, null, null, mVar2);
                                o13.p<String, String> pVarC = dVar3.c(str2, str, hVar2);
                                String str5 = pVarC.f128594a;
                                String str6 = pVarC.f128595b;
                                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                c0235a2.f16962a.put("text", str6);
                                x0Var2.a(i111, 60, c0235a2.b(), t2Var, null, null, str5, y.Q(mVar2, R.string.atp_lbl_half_marathon), null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var3 = p3.n.f135158a;
                                o13.p<String, String> pVarA = dVar3.a(str2, str, hVar2);
                                String str7 = pVarA.f128594a;
                                String str8 = pVarA.f128595b;
                                l72.x0 x0Var3 = l72.x0.f111346a;
                                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                c0235a3.f16962a.put("text", str8);
                                b92.a aVarB2 = c0235a3.b();
                                String upperCase2 = y.Q(mVar3, R.string.pacepro_lbl_distance_10k).toUpperCase(Locale.ROOT);
                                upperCase2.getClass();
                                int i24 = b92.a.f16960b;
                                int i25 = (iIntValue2 & 14) | (l72.x0.f111348c << 24);
                                x0Var3.a(i25, 60, aVarB2, t2Var2, null, null, str7, upperCase2, null, null, mVar3);
                                o13.p<String, String> pVarD = dVar3.d(str2, str, hVar2);
                                String str9 = pVarD.f128594a;
                                String str10 = pVarD.f128595b;
                                b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                c0235a4.f16962a.put("text", str10);
                                x0Var3.a(i25, 60, c0235a4.b(), t2Var2, null, null, str9, y.Q(mVar3, R.string.pacepro_lbl_distance_marathon), null, null, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i17, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r12.a(dVar2, i14, 23);
        }
    }
}
