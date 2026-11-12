package ai0;

import a42.f;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import defpackage.b;
import e23.l;
import gl1.y;
import lc.u0;
import o4.d0;
import o70.t;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.i;
import r70.q;
import r70.r;
import s9.c;
import u4.d;
import yz1.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lai0/a;", "Lr70/r;", "Lbi0/a;", "stateHolder", "<init>", "(Lbi0/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bi0.a f3308a;

    public a(bi0.a aVar) {
        aVar.getClass();
        this.f3308a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -488436011);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = (i) this.f3308a.f18011a.invoke();
                o0VarQ.K(objQ);
            }
            a0.a aVar = (a0.a) c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            String strQ = y.Q(o0VarQ, R.string.floors_title);
            String strQ2 = y.Q(o0VarQ, R.string.no_value);
            boolean zB = o0VarQ.B(strQ2);
            Object objQ2 = o0VarQ.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new b(strQ2, 8);
                o0VarQ.K(objQ2);
            }
            l lVar = (l) objQ2;
            Object objQ3 = o0VarQ.q();
            if (objQ3 == c2565a) {
                objQ3 = new a81.m(15);
                o0VarQ.K(objQ3);
            }
            l lVar2 = (l) objQ3;
            String strP = y.P(R.string.lbl_floors_plural, new Object[]{lVar2.invoke(aVar != null ? aVar.f200240c : null)}, o0VarQ);
            t tVar = t.f130075r;
            d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarQ, 1);
            String strQ3 = y.Q(o0VarQ, R.string.label_last_7d);
            String strQ4 = y.Q(o0VarQ, R.string.txt_empty_page_no_data);
            boolean zB2 = o0VarQ.B(strP);
            Object objQ4 = o0VarQ.q();
            if (zB2 || objQ4 == c2565a) {
                objQ4 = new b(strP, 9);
                o0VarQ.K(objQ4);
            }
            l lVar3 = (l) objQ4;
            boolean zR = o0VarQ.r(context);
            Object objQ5 = o0VarQ.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new a42.d(context, 2);
                o0VarQ.K(objQ5);
            }
            e23.a aVar2 = (e23.a) objQ5;
            boolean zR2 = o0VarQ.r(context);
            Object objQ6 = o0VarQ.q();
            if (zR2 || objQ6 == c2565a) {
                objQ6 = new a42.d(context, 3);
                o0VarQ.K(objQ6);
            }
            o0Var = o0VarQ;
            yz1.d0.b(rVar, strQ, dVarB, d0VarE, aVar, lVar, lVar2, strQ3, strQ4, null, lVar3, 0, 0.0f, null, null, aVar2, (e23.a) objQ6, yz1.d0.c(aVar), y.Q(o0VarQ, R.string.floors_card_no_data_state_message), null, null, o0Var, (i15 & 14) | 1572864, 1604096);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, rVar, qVar, i14, 4);
        }
    }
}
