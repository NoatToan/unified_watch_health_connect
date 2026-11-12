package pw1;

import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPPlanOverviewActivity;
import e23.p;
import p005kotlin.Unit;
import p3.n;
import p3.p0;
import p3.x1;
import tw1.m;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f141766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f141767c;

    public /* synthetic */ j(m mVar, int i14, int i15) {
        this.f141765a = i15;
        this.f141766b = mVar;
        this.f141767c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f141765a;
        int i15 = this.f141767c;
        m mVar = this.f141766b;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ITPPlanOverviewActivity.a aVar = ITPPlanOverviewActivity.f45632a;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1256179792, new j(mVar, i15, i16), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            case 1:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ITPPlanOverviewActivity.a aVar2 = ITPPlanOverviewActivity.f45632a;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    rw1.b.a(mVar, i15, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                rw1.b.a(mVar, i15, (p3.m) obj, p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                rw1.c.a(mVar, i15, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j(m mVar, int i14, int i15, int i16) {
        this.f141765a = i16;
        this.f141766b = mVar;
        this.f141767c = i14;
    }
}
