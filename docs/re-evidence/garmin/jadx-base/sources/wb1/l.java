package wb1;

import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import e23.p;
import gl1.y;
import lc.v0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.x1;
import zd0.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PromotionsDevMenuActivity f183890b;

    public /* synthetic */ l(PromotionsDevMenuActivity promotionsDevMenuActivity, int i14) {
        this.f183889a = i14;
        this.f183890b = promotionsDevMenuActivity;
    }

    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f183889a;
        PromotionsDevMenuActivity promotionsDevMenuActivity = this.f183890b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = PromotionsDevMenuActivity.f41027b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-920596126, new m(promotionsDevMenuActivity, y.I(new v0[0], mVar), (q0) KoinJavaComponent.get$default(q0.class, null, null, 6, null)), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = PromotionsDevMenuActivity.f41027b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h.a((o) promotionsDevMenuActivity.f41028a.getValue(), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
