package t31;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f162214b;

    public /* synthetic */ e(g gVar, int i14) {
        this.f162213a = i14;
        this.f162214b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f162213a;
        g gVar = this.f162214b;
        int i15 = 0;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i16 = g.f162217g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    if (gVar.f162218f) {
                        mVar.C(-1673339832);
                        gVar.g(mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-1673265649);
                        gVar.h(mVar, 0);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i17 = g.f162217g;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i18 = (iIntValue2 << 6) & 896;
                    rVar.E(y.Q(mVar2, R.string.gcm_training_status_your_7d_avg), mVar2, i18);
                    rVar.m(i18, 2, y.Q(mVar2, R.string.ohrv_help_description), null, mVar2);
                    int i19 = ((iIntValue2 << 3) & 112) | 6;
                    rVar.j(z3.f.c(409833681, new t12.a(rVar, 7), mVar2), mVar2, i19);
                    rVar.j(z3.f.c(-1358726150, new t12.a(rVar, 5), mVar2), mVar2, i19);
                    Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean zR = mVar2.r(gVar) | mVar2.r(context);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new d(gVar, context, i15);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new d(gVar, context, i15);
                            mVar2.K(objQ);
                        }
                    }
                    rVar.i((e23.a) objQ, R.string.ohrv_help_link, mVar2, i18);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
