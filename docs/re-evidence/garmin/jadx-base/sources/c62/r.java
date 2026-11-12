package c62;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.ViewCompatibleActivityListActivity;
import java.util.List;
import p005kotlin.Unit;
import p3.y3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewCompatibleActivityListActivity f24866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f24868d;

    public /* synthetic */ r(ViewCompatibleActivityListActivity viewCompatibleActivityListActivity, String str, List list, int i14) {
        this.f24865a = 4;
        this.f24866b = viewCompatibleActivityListActivity;
        this.f24867c = str;
        this.f24868d = list;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f24865a;
        List<ww1.i0> list = this.f24868d;
        String str = this.f24867c;
        ViewCompatibleActivityListActivity viewCompatibleActivityListActivity = this.f24866b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                ViewCompatibleActivityListActivity.a aVar = ViewCompatibleActivityListActivity.f48480a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-407084346, new r(this.f24866b, this.f24867c, this.f24868d, 1, (byte) 0), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                ViewCompatibleActivityListActivity.a aVar2 = ViewCompatibleActivityListActivity.f48480a;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    y3 y3Var = g02.d.f74342a;
                    ViewCompatibleActivityListActivity viewCompatibleActivityListActivity2 = this.f24866b;
                    p3.v.a(y3Var.c(viewCompatibleActivityListActivity2.getOnBackPressedDispatcher()), z3.f.c(1678214662, new r(viewCompatibleActivityListActivity2, this.f24867c, this.f24868d, 2, (byte) 0), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                ViewCompatibleActivityListActivity.a aVar3 = ViewCompatibleActivityListActivity.f48480a;
                if (mVar.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    ViewCompatibleActivityListActivity viewCompatibleActivityListActivity3 = this.f24866b;
                    z02.d.a(false, z3.f.c(541812683, new a61.d(viewCompatibleActivityListActivity3, 28), mVar), null, null, null, z3.f.c(-373347121, new r(viewCompatibleActivityListActivity3, this.f24867c, this.f24868d, 3, (byte) 0), mVar), mVar, 196656, 29);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                int iIntValue4 = num.intValue();
                ViewCompatibleActivityListActivity.a aVar4 = ViewCompatibleActivityListActivity.f48480a;
                if (mVar.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    viewCompatibleActivityListActivity.da(str, list, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                ViewCompatibleActivityListActivity.a aVar5 = ViewCompatibleActivityListActivity.f48480a;
                viewCompatibleActivityListActivity.da(str, list, mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ r(ViewCompatibleActivityListActivity viewCompatibleActivityListActivity, String str, List list, int i14, byte b14) {
        this.f24865a = i14;
        this.f24866b = viewCompatibleActivityListActivity;
        this.f24867c = str;
        this.f24868d = list;
    }
}
