package sg2;

import c2.t;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.i7;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import v62.c6;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159218a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f159219b;

    public /* synthetic */ c(t tVar) {
        this.f159219b = tVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f159218a;
        t tVar = this.f159219b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                d.b(tVar, (p3.m) obj, p0.t(7));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = xg0.m.I0;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97904c);
                    h4.d.f81522a.getClass();
                    h4.r rVarC = tVar.c(rVarQ, h4.d.a.f81526d);
                    s62.a.f157643a.getClass();
                    i7.b(c6.a(t62.b.f162798a), y.Q(mVar, R.string.lbl_settings), rVarC, sn.a.b(mVar), mVar, 0, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
