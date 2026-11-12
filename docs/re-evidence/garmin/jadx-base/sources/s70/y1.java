package s70;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y1 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f157836b;

    public /* synthetic */ y1(t2 t2Var, int i14) {
        this.f157835a = i14;
        this.f157836b = t2Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f157835a;
        t2 t2Var = this.f157836b;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                v.h.y(427173750, rVar, (Integer) obj3, mVar);
                p3.x1 x1Var = p3.n.f135158a;
                h4.r rVarA = t2Var.a(rVar, 0.7f, true);
                mVar.f();
                return rVarA;
            case 1:
                String str = (String) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                str.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(str) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    l72.x0.f111346a.a(((iIntValue << 3) & 112) | (l72.x0.f111348c << 24), 124, null, this.f157836b, null, null, str, gl1.y.Q(mVar2, R.string.lbl_body_water), null, null, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                String str2 = (String) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                str2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(str2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    l72.x0.f111346a.a(((iIntValue2 << 3) & 112) | (l72.x0.f111348c << 24), 124, null, this.f157836b, null, null, str2, gl1.y.Q(mVar3, R.string.lbl_body_fat), null, null, mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                v.h.y(117897222, rVar2, (Integer) obj3, mVar4);
                p3.x1 x1Var4 = p3.n.f135158a;
                h4.r rVarA2 = t2Var.a(rVar2, 1.0f, true);
                mVar4.f();
                return rVarA2;
        }
    }
}
