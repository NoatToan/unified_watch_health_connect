package e62;

import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import w52.a0;
import w52.d0;
import w52.o;
import w52.v0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f63207b;

    public /* synthetic */ i(v0 v0Var, int i14) {
        this.f63206a = i14;
        this.f63207b = v0Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f63206a;
        v0 v0Var = this.f63207b;
        e2.d dVar = (e2.d) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i14) {
            case 0:
                dVar.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    o.b(v0Var, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                dVar.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    a0.b(v0Var, y.Q(mVar, R.string.workout_procedure_title), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                dVar.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    d0.a(v0Var, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
