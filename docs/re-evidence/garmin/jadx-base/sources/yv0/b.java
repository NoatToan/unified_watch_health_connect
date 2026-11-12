package yv0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import ez0.c;
import gl1.y;
import h4.r;
import og2.k;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t60.d;
import t60.g;
import zy0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    public static final void a(r rVar, String str, e23.a aVar, m mVar, int i14) {
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(1406347333);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g gVar = new g("LifestyleLogging");
            String strN = k.n(context, gVar.f162711a);
            String strK = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).k(c.GC_WEB_URL);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(gVar);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zR) {
                objQ = new a(gVar, null);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(gVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, unit, o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_recommended_for_you);
            String strQ2 = y.Q(o0VarE, R.string.lbl_unlock_more_insights);
            String strQ3 = y.Q(o0VarE, R.string.msg_lifestyle_logging_unlock_more_insight);
            String strQ4 = str != null ? y.Q(o0VarE, R.string.lbl_shop_now) : null;
            String strConcat = strK.concat("/images/cross-sell/ursa-major.png");
            boolean zR2 = o0VarE.r(gVar) | ((i16 & 112) == 32) | o0VarE.r(context) | o0VarE.B(strN);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                d dVar = new d(str, gVar, context, strN, 1);
                o0VarE.K(dVar);
                objQ2 = dVar;
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    d dVar2 = new d(str, gVar, context, strN, 1);
                    o0VarE.K(dVar2);
                    objQ2 = dVar2;
                }
            }
            s82.b.a(rVar, strQ, strQ2, strQ3, strQ4, strConcat, (e23.a) objQ2, aVar, o0VarE, (i16 & 14) | ((i16 << 18) & 234881024));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.d(rVar, str, aVar, i14, 1);
        }
    }
}
