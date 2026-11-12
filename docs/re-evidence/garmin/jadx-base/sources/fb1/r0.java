package fb1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 {
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    public static final void a(int i14, int i15, int i16, p3.m mVar) {
        ArrayList arrayList;
        p3.o0 o0VarE = mVar.E(-206820610);
        int i17 = (o0VarE.k(i14) ? 32 : 16) | i16 | (o0VarE.k(i15) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int i18 = ((float) i14) <= 295.0f ? i14 : 295;
            int i19 = i17 & 112;
            int i24 = i17 & 896;
            boolean z14 = (i19 == 32) | (i24 == 256);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                tb1.e.a aVar2 = tb1.e.f163745a;
                Integer numValueOf = Integer.valueOf(R.style.PieChartCenterPrimaryValueText);
                aVar2.getClass();
                objQ = tb1.e.a.e(context, i14, i15, false, numValueOf);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    tb1.e.a aVar3 = tb1.e.f163745a;
                    Integer numValueOf2 = Integer.valueOf(R.style.PieChartCenterPrimaryValueText);
                    aVar3.getClass();
                    objQ = tb1.e.a.e(context, i14, i15, false, numValueOf2);
                    o0VarE.K(objQ);
                }
            }
            CharSequence charSequence = (CharSequence) objQ;
            Float fValueOf = Float.valueOf(0.3333f);
            if (i14 <= 0) {
                arrayList = p13.x.m(fValueOf, fValueOf, Float.valueOf(0.3334f));
            } else {
                arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.3322034f));
                arrayList.add(Float.valueOf(0.3322034f));
                arrayList.add(Float.valueOf(0.33559322f));
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                float fFloatValue = ((Number) it.next()).floatValue();
                f02.v.f67750a.getClass();
                gl.c.f77766a.getClass();
                arrayList2.add(new z72.l(fFloatValue, gl.c.f77767b.f77787j, null));
                i18 = i18;
            }
            int i25 = i18;
            i53.f fVarJ = i53.a.j(arrayList2);
            h4.r rVarA = x2.a(h4.r.S, gl.b.q(o0VarE, R.dimen.gauge_chart_size_small), gl.b.q(o0VarE, R.dimen.gauge_chart_size_small));
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new f21.g0(28);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVarA, true);
            boolean zR = o0VarE.r(context) | (i19 == 32) | (i24 == 256);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new q0(context, i14, i15, 0);
                o0VarE.K(objQ3);
            }
            h4.r rVarB = p5.v.b(rVarC, (e23.l) objQ3);
            float f14 = i25;
            float f15 = f14 >= r10 ? 1.0f : f14 / 295.0f;
            f02.v.f67750a.getClass();
            gl.c.f77766a.getClass();
            z72.k.d(f15, 0.0f, 3.0f, 14180352, 32, gl.c.f77767b.f77817y, z3.f.c(-407288269, new et1.v(charSequence, 6), o0VarE), rVarB, fVarJ, o0VarE, true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a71.l(i14, i15, i16, 4);
        }
    }
}
