package at;

import b82.d2;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import l72.x0;
import o13.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f12721b;

    public /* synthetic */ d(int i14, p pVar) {
        this.f12720a = i14;
        this.f12721b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f12720a;
        p pVar = this.f12721b;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    String strQ = y.Q(mVar, R.string.run_options_timer);
                    x0 x0Var = x0.f111346a;
                    String str = (String) pVar.f128594a;
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", (String) pVar.f128595b);
                    b92.a aVarB = c0235a.b();
                    int i15 = b92.a.f16960b;
                    x0Var.f((iIntValue & 14) | (x0.f111348c << 24), 60, aVarB, t2Var, null, null, str, strQ, null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                t2 t2Var2 = (t2) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = t61.e.f162741f;
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    d2 d2Var = d2.f16532a;
                    String strQ2 = y.Q(mVar2, ((Number) pVar.f128594a).intValue());
                    d2Var.getClass();
                    int i17 = iIntValue2 & 14;
                    d2Var.f(t2Var2, strQ2, t2Var2.a(d2.i(), 0.635f, true), null, 0, 0, mVar2, i17, 28);
                    d2Var.f(t2Var2, y.Q(mVar2, ((Number) pVar.f128595b).intValue()), t2Var2.a(d2.i(), 0.365f, true), null, 0, 0, mVar2, i17, 28);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
