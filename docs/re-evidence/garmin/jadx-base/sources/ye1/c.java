package ye1;

import af1.f;
import af1.o;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o4.d0;
import o70.t;
import p13.h0;
import p13.x;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import qe1.i;
import tz1.h;
import ue1.e;
import w2.a0;
import w52.k0;
import we1.d;
import yz1.u;
import yz1.z;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:110:0x0228  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, e eVar, d dVar, m mVar, int i14) {
        o0 o0Var;
        d0 d0VarA;
        Double dValueOf;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        String strJ;
        z zVar;
        List<ue1.d> list;
        boolean z15;
        String strL;
        Integer num;
        Integer num2;
        List<ue1.d> list2;
        List<ue1.d> list3;
        Integer num3;
        o0 o0VarE = mVar.E(-1432382860);
        int i15 = (i14 & 6) == 0 ? (o0VarE.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(dVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            t tVar = t.f130079x;
            String strD = tVar.d(a0.s(o0VarE), null);
            u4.d dVarB = t.b(tVar);
            l.f68084a.getClass();
            boolean z16 = TextUtils.isEmpty(l.a.a().w()) || l.a.a().w().equals("MALE");
            int iIntValue = (eVar == null || (num3 = eVar.f170241a.f170235b) == null) ? 0 : num3.intValue();
            String str = eVar != null ? eVar.f170241a.f170236c : null;
            Integer numValueOf = str != null ? Integer.valueOf(af1.e.valueOf(str).f3082a) : null;
            if (str == null) {
                o0VarE.C(-1616906030);
                o0VarE.g0(false);
                d0VarA = null;
            } else {
                o0VarE.C(-1616906029);
                long jA = f.a(af1.e.valueOf(str), o0VarE);
                o0VarE.g0(false);
                d0VarA = d0.a(jA);
            }
            if (str != null) {
                o oVar = o.f3110a;
                i iVar = (i) dVar.f184783h.getF182175a();
                af1.e eVarValueOf = af1.e.valueOf(str);
                oVar.getClass();
                dValueOf = Double.valueOf(o.a(iIntValue, z16, iVar, eVarValueOf));
            } else {
                dValueOf = null;
            }
            if (eVar == null || (list3 = eVar.f170242b) == null) {
                z14 = true;
                arrayList = null;
            } else {
                z14 = true;
                arrayList = new ArrayList(y.r(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add((ue1.d) it.next());
                }
            }
            if (eVar == null || (list2 = eVar.f170242b) == null) {
                arrayList2 = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list2) {
                    ue1.d dVar2 = (ue1.d) obj;
                    o oVar2 = o.f3110a;
                    Integer num4 = dVar2.f170239c;
                    oVar2.getClass();
                    if (o.c(num4) != 0 && !o.b(dVar2.f170240d).equals("")) {
                        arrayList3.add(obj);
                    }
                }
                arrayList2 = new ArrayList(y.r(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Integer num5 = ((ue1.d) it3.next()).f170239c;
                    arrayList2.add(Integer.valueOf(num5 != null ? num5.intValue() : 0));
                }
            }
            int iIntValue2 = (arrayList2 == null || (num2 = (Integer) h0.t0(arrayList2)) == null) ? 0 : num2.intValue();
            int iIntValue3 = (arrayList2 == null || (num = (Integer) h0.o0(arrayList2)) == null) ? 0 : num.intValue();
            int i16 = R.string.running_economy_home_genesis_description;
            if (eVar == null || arrayList2 == null || (!arrayList2.isEmpty()) != z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1615798120, R.string.running_economy_home_genesis_description, o0VarE, false);
            } else {
                o0VarE.C(-1615981640);
                String strValueOf = String.valueOf(iIntValue);
                if (numValueOf == null) {
                    o0VarE.C(-1615870258);
                    z15 = false;
                    o0VarE.g0(false);
                    strL = null;
                } else {
                    z15 = false;
                    strL = u0.l(o0VarE, -1615870257, numValueOf, o0VarE, false);
                }
                strJ = oi0.c.P(x.k(strD, strValueOf, strL));
                o0VarE.g0(z15);
            }
            String strP = gl1.y.P(R.string.msg_view_last_4_week_feature_trend, new Object[]{strD}, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_no_data_available);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new h(context, 22);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new h(context, 22);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            yz1.d dVar3 = new yz1.d(u.SUCCESS, null, false, 6, null);
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            if (eVar == null) {
                zVar = z.EMPTY;
            } else {
                o oVar3 = o.f3110a;
                Integer num6 = eVar.f170241a.f170235b;
                oVar3.getClass();
                if (o.c(num6) != 0 || (list = eVar.f170242b) == null) {
                    zVar = z.VALID_DATA;
                } else {
                    if (!list.isEmpty()) {
                        Iterator<T> it4 = list.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                ue1.d dVar4 = (ue1.d) it4.next();
                                o oVar4 = o.f3110a;
                                Integer num7 = dVar4.f170239c;
                                oVar4.getClass();
                                if (o.c(num7) != 0 && !o.b(dVar4.f170240d).equals("")) {
                                    zVar = z.VALID_DATA;
                                }
                            }
                        }
                    }
                    zVar = z.EMPTY;
                }
                i16 = R.string.running_economy_home_genesis_description;
            }
            String strQ2 = gl1.y.Q(o0VarE, i16);
            d0 d0VarA2 = d0.a(jD);
            z3.e eVarC = z3.f.c(818762904, new k0(strJ, iIntValue, dValueOf, numValueOf), o0VarE);
            z3.e eVarC2 = z3.f.c(705152409, new b(d0VarA, arrayList, iIntValue3, iIntValue2, strQ, strP), o0VarE);
            boolean zR2 = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new h(context, 23);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new h(context, 23);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            yz1.y.d(rVar, dVar3, strD, strD, dVarB, d0VarA2, 0.0f, 0, null, 0.0f, null, null, false, 0L, null, eVarC, eVarC2, aVar2, (e23.a) objQ2, aVar2, zVar, strQ2, null, null, o0Var, i15 & 14, 1769472, 0, 12615616);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(rVar, eVar, dVar, i14, 15);
        }
    }
}
