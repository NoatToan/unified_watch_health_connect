package dp1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f60655b;

    public /* synthetic */ f(g gVar, int i14) {
        this.f60654a = i14;
        this.f60655b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0072  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f60654a;
        g gVar = this.f60655b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = g.f60656d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1853794594, new f(gVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = g.f60656d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = f72.x1.a(t62.c.f162799a);
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    String string = ((Context) mVar2.A(y3Var)).getString(R.string.lbl_no_group_rides);
                    String string2 = ((Context) mVar2.A(y3Var)).getString(R.string.lbl_group_ride_empty_state);
                    string2.getClass();
                    String string3 = ((Context) mVar2.A(y3Var)).getString(R.string.common_learn_more);
                    boolean zR = mVar2.r(gVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new cq0.g(gVar, 22);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new cq0.g(gVar, 22);
                            mVar2.K(objQ);
                        }
                    }
                    b82.n.d(dVarA, string, string2, null, string3, (e23.a) objQ, null, null, mVar2, 0, 200);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
