package sz0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;
import v62.x5;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f161508b;

    public /* synthetic */ t(u uVar, int i14) {
        this.f161507a = i14;
        this.f161508b = uVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f161507a;
        u uVar = this.f161508b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = u.E;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-127311587, new t(uVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = u.E;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = x5.a(t62.b.f162798a);
                    String string = uVar.getString(R.string.social_group_inbox_is_empty);
                    String string2 = uVar.getString(R.string.social_group_inbox_empty_message);
                    string2.getClass();
                    b82.n.c(dVarA, string, string2, null, null, mVar2, 0, 24);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
