package wb1;

import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import e23.r;
import lc.m0;
import lc.v;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183895a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PromotionsDevMenuActivity f183896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f183897c;

    public /* synthetic */ n(PromotionsDevMenuActivity promotionsDevMenuActivity, m0 m0Var) {
        this.f183896b = promotionsDevMenuActivity;
        this.f183897c = m0Var;
    }

    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f183895a;
        m0 m0Var = this.f183897c;
        PromotionsDevMenuActivity promotionsDevMenuActivity = this.f183896b;
        int i15 = 1;
        r1.l lVar = (r1.l) obj;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                int i16 = PromotionsDevMenuActivity.f41027b;
                lVar.getClass();
                ((v) obj2).getClass();
                x1 x1Var = p3.n.f135158a;
                z02.d.a(false, z3.f.c(717924256, new ug2.v(m0Var, 5), mVar), null, null, null, z3.f.c(1908889884, new l(promotionsDevMenuActivity, i15), mVar), mVar, 196656, 29);
                break;
            default:
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                int i17 = PromotionsDevMenuActivity.f41027b;
                lVar.getClass();
                ((v) obj2).getClass();
                x1 x1Var2 = p3.n.f135158a;
                z02.d.a(false, z3.f.c(-211853736, new i(i15, promotionsDevMenuActivity, m0Var), mVar2), null, null, null, z3.f.c(1844814036, new ug2.v(m0Var, i15), mVar2), mVar2, 196656, 29);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(m0 m0Var, PromotionsDevMenuActivity promotionsDevMenuActivity) {
        this.f183897c = m0Var;
        this.f183896b = promotionsDevMenuActivity;
    }
}
