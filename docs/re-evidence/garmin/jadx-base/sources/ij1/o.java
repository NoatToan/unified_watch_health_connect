package ij1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f93886b;

    public /* synthetic */ o(r rVar, int i14) {
        this.f93885a = i14;
        this.f93886b = rVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f93885a;
        r rVar = this.f93886b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = r.f93892k;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    if (rVar.f93893f) {
                        mVar.C(158069748);
                        rVar.h(mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(158140335);
                        rVar.g(mVar, 0);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = r.f93892k;
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ej1.b bVar = rVar.f93894g;
                    ej1.b bVar2 = ej1.b.WEARABLE_DEVICE;
                    int i17 = bVar == bVar2 ? R.string.primary_wearable : R.string.primary_training_device;
                    int i18 = bVar == bVar2 ? R.string.primary_wearable_help_description : R.string.primary_training_help_description;
                    int i19 = (iIntValue2 << 3) & 112;
                    rVar2.D(i17, mVar2, i19);
                    rVar2.l(i18, (iIntValue2 << 6) & 896, 2, null, mVar2);
                    int i24 = i19 | 6;
                    rVar2.j(z3.f.c(1755034449, new q(rVar2, rVar), mVar2), mVar2, i24);
                    rVar2.j(z3.f.c(622748346, new q(rVar, rVar2), mVar2), mVar2, i24);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
