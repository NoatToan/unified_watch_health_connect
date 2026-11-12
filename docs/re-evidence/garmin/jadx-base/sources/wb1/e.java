package wb1;

import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import e23.p;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import zd0.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183878a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f183879b;

    public /* synthetic */ e(q0 q0Var) {
        this.f183879b = q0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f183878a;
        q0 q0Var = this.f183879b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                f.a(q0Var, mVar, p0.t(1));
                break;
            default:
                int iIntValue = num.intValue();
                int i15 = PromotionsDevMenuActivity.f41027b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    f.a(q0Var, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
