package os0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f72.x2;
import n82.i;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import p3.y3;
import u4.d;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f133541b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f133540a = i14;
        this.f133541b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0070  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f133540a;
        c cVar = this.f133541b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(1977867555, new b(cVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    s62.a.f157643a.getClass();
                    d dVarA = x2.a(t62.c.f162799a);
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    String string = ((Context) mVar2.A(y3Var)).getString(R.string.lbl_jet_lag_advisor);
                    String string2 = ((Context) mVar2.A(y3Var)).getString(R.string.msg_jet_lag_startup_info);
                    string2.getClass();
                    String string3 = ((Context) mVar2.A(y3Var)).getString(R.string.lbl_add_trip_details);
                    boolean zR = mVar2.r(cVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new i(cVar, 25);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new i(cVar, 25);
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
