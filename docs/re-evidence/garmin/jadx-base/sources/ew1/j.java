package ew1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f66527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f66528c;

    public /* synthetic */ j(n nVar, String str, int i14) {
        this.f66526a = i14;
        this.f66527b = nVar;
        this.f66528c = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i14 = this.f66526a;
        n nVar = this.f66527b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                n.a aVar = n.C;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1058734808, new j(nVar, this.f66528c, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                n.a aVar2 = n.C;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    g02.b2.a(null, nVar.y6().R5(), nVar.y6().C5("FBTAddGoalDataFragment"), nVar.y6().Y5(), this.f66528c, gl1.y.Q(mVar2, R.string.try_to_be_optimistic_yet_realistic), null, null, null, mVar2, 0, 449);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
