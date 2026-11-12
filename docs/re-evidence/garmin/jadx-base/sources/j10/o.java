package j10;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsPrivacyActivity;
import gl1.y;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupSettingsPrivacyActivity f96389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f96390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f96391d;

    public /* synthetic */ o(GroupSettingsPrivacyActivity groupSettingsPrivacyActivity, p1 p1Var, p1 p1Var2, int i14) {
        this.f96388a = i14;
        this.f96389b = groupSettingsPrivacyActivity;
        this.f96390c = p1Var;
        this.f96391d = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96388a;
        p1 p1Var = this.f96391d;
        p1 p1Var2 = this.f96390c;
        GroupSettingsPrivacyActivity groupSettingsPrivacyActivity = this.f96389b;
        Object[] objArr = 0;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GroupSettingsPrivacyActivity.a aVar = GroupSettingsPrivacyActivity.f31458b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(-733377150, new o(groupSettingsPrivacyActivity, p1Var2, p1Var, i15), mVar), null, null, null, z3.f.c(-2115705978, new q(p1Var2, p1Var, (int) (objArr == true ? 1 : 0)), mVar), mVar, 196656, 29);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                GroupSettingsPrivacyActivity.a aVar2 = GroupSettingsPrivacyActivity.f31458b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = y.Q(mVar2, R.string.lbl_group_privacy);
                    boolean zR = mVar2.r(groupSettingsPrivacyActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new p(groupSettingsPrivacyActivity, p1Var2, p1Var, 1);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new p(groupSettingsPrivacyActivity, p1Var2, p1Var, 1);
                            mVar2.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ, null, strQ, mVar2, null);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
