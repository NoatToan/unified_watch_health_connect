package f71;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d71.j;
import f2.o;
import gl1.y;
import h4.r;
import j53.l;
import java.util.ArrayList;
import java.util.List;
import m92.h0;
import o13.p;
import o4.d0;
import p13.j0;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.z;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:103:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:83:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x013f  */
    /* JADX WARN: Code duplicated, block: B:86:0x015e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, j.b bVar, m mVar, int i14) {
        o0 o0Var;
        List listG;
        String str;
        i53.f fVarB;
        int iIntValue;
        String strJ;
        String strQ;
        String strP;
        Object obj;
        boolean zR;
        Object objQ;
        z zVar;
        i53.c<p<Double, Double>> cVar;
        i53.c<Double> cVar2;
        r rVar2 = rVar;
        o0 o0VarE = mVar.E(-1269582327);
        int i15 = (i14 & 6) == 0 ? i14 | (o0VarE.B(rVar2) ? 4 : 2) : i14;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Integer num = bVar != null ? bVar.f58170b : null;
            Integer num2 = bVar != null ? bVar.f58171c : null;
            if (bVar == null || (cVar2 = bVar.f58172d) == null || (listG = c02.a.g(cVar2)) == null) {
                listG = j0.f134944a;
            }
            if (bVar == null || (cVar = bVar.f58173e) == null) {
                str = null;
            } else {
                ArrayList arrayList = new ArrayList();
                int i17 = 0;
                for (p<Double, Double> pVar : cVar) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        x.q();
                        throw null;
                    }
                    p<Double, Double> pVar2 = pVar;
                    Double d14 = pVar2 != null ? pVar2.f128594a : null;
                    Double d15 = pVar2 != null ? pVar2.f128595b : null;
                    h0.d.b bVar2 = (pVar2 == null || d14 == null || d15 == null) ? null : new h0.d.b(i17, d14.floatValue(), d15.floatValue());
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                    i17 = i18;
                }
                str = null;
                fVarB = i53.a.j(arrayList);
                if (fVarB == null) {
                }
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = R.string.lbl_no_status;
                }
                String strQ2 = y.Q(o0VarE, iIntValue);
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    l3.f23124b.getClass();
                    strJ = l3.a.Z0(iIntValue2);
                } else {
                    strJ = str;
                }
                if (strJ == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -297878865, R.string.no_value, o0VarE, false);
                } else {
                    o0VarE.C(-297881314);
                    o0VarE.g0(false);
                }
                gl.c.f77766a.getClass();
                long jD = gl.c.a(o0VarE).d();
                long jF = gl.c.a(o0VarE).f();
                String strQ3 = y.Q(o0VarE, R.string.lbl_training_load);
                strQ = y.Q(o0VarE, R.string.tr_factor_acute_load);
                if (num == null) {
                    o0VarE.C(-643863047);
                    o0VarE.g0(false);
                    strP = str;
                } else {
                    o0VarE.C(-643863046);
                    strP = y.P(R.string.string_space_string_pattern, new Object[]{Integer.valueOf(num.intValue()), strQ}, o0VarE);
                    o0VarE.g0(false);
                }
                if (strP == null) {
                    strP = "";
                }
                String strP2 = oi0.c.P(x.k(strQ2, strP));
                String strP3 = y.P(R.string.msg_view_last_4_week_feature_trend, new Object[]{strQ}, o0VarE);
                if (bVar != null) {
                    obj = bVar.f58169a;
                } else {
                    obj = str;
                }
                s62.a.f157643a.getClass();
                u4.d dVarA = f72.a.a(t62.c.f162799a);
                d92.b.f58623a.getClass();
                d0 d0VarA = d0.a(d92.b.a(o0VarE).f().b());
                z3.e eVarC = z3.f.c(195789157, new c81.i(strP2, strQ2, strJ), o0VarE);
                z3.e eVarC2 = z3.f.c(-692248380, new b(listG, fVarB, strP3, jD, jF, rVar), o0VarE);
                zR = o0VarE.r(context);
                objQ = o0VarE.q();
                if (zR) {
                    objQ = new cy1.a(context, 9);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new cy1.a(context, 9);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar = (e23.a) objQ;
                if (bVar == null && bVar.f58174f) {
                    zVar = z.VALID_DATA;
                } else {
                    zVar = z.EMPTY;
                }
                o0Var = o0VarE;
                rVar2 = rVar;
                yz1.y.d(rVar2, obj, strQ3, null, dVarA, d0VarA, 0.0f, 0, null, 0.0f, null, null, false, 0L, null, eVarC, eVarC2, null, null, aVar, zVar, y.Q(o0VarE, R.string.training_load_card_no_data_state_message), null, null, o0Var, i16 & 14, 1769472, 0, 13008840);
                x1 x1Var2 = n.f135158a;
            }
            fVarB = l.b();
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = R.string.lbl_no_status;
            }
            String strQ4 = y.Q(o0VarE, iIntValue);
            if (num != null) {
                int iIntValue3 = num.intValue();
                l3.f23124b.getClass();
                strJ = l3.a.Z0(iIntValue3);
            } else {
                strJ = str;
            }
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -297878865, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(-297881314);
                o0VarE.g0(false);
            }
            gl.c.f77766a.getClass();
            long jD2 = gl.c.a(o0VarE).d();
            long jF2 = gl.c.a(o0VarE).f();
            String strQ5 = y.Q(o0VarE, R.string.lbl_training_load);
            strQ = y.Q(o0VarE, R.string.tr_factor_acute_load);
            if (num == null) {
                o0VarE.C(-643863047);
                o0VarE.g0(false);
                strP = str;
            } else {
                o0VarE.C(-643863046);
                strP = y.P(R.string.string_space_string_pattern, new Object[]{Integer.valueOf(num.intValue()), strQ}, o0VarE);
                o0VarE.g0(false);
            }
            if (strP == null) {
                strP = "";
            }
            String strP4 = oi0.c.P(x.k(strQ4, strP));
            String strP5 = y.P(R.string.msg_view_last_4_week_feature_trend, new Object[]{strQ}, o0VarE);
            if (bVar != null) {
                obj = bVar.f58169a;
            } else {
                obj = str;
            }
            s62.a.f157643a.getClass();
            u4.d dVarA2 = f72.a.a(t62.c.f162799a);
            d92.b.f58623a.getClass();
            d0 d0VarA2 = d0.a(d92.b.a(o0VarE).f().b());
            z3.e eVarC3 = z3.f.c(195789157, new c81.i(strP4, strQ4, strJ), o0VarE);
            z3.e eVarC4 = z3.f.c(-692248380, new b(listG, fVarB, strP5, jD2, jF2, rVar), o0VarE);
            zR = o0VarE.r(context);
            objQ = o0VarE.q();
            if (zR) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new cy1.a(context, 9);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new cy1.a(context, 9);
                o0VarE.K(objQ);
            }
            e23.a aVar2 = (e23.a) objQ;
            if (bVar == null) {
                zVar = z.EMPTY;
            } else {
                zVar = z.EMPTY;
            }
            o0Var = o0VarE;
            rVar2 = rVar;
            yz1.y.d(rVar2, obj, strQ5, null, dVarA2, d0VarA2, 0.0f, 0, null, 0.0f, null, null, false, 0L, null, eVarC3, eVarC4, null, null, aVar2, zVar, y.Q(o0VarE, R.string.training_load_card_no_data_state_message), null, null, o0Var, i16 & 14, 1769472, 0, 13008840);
            x1 x1Var3 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar2, bVar, i14, 6);
        }
    }
}
