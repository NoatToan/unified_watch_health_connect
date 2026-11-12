package rm0;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import v62.t5;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f153514b;

    public /* synthetic */ b(d dVar, int i14) {
        this.f153513a = i14;
        this.f153514b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f153513a;
        d dVar = this.f153514b;
        int i15 = 2;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = d.X;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(315077962, new b(dVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = d.X;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1751790035, new b(dVar, 3), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i18 = d.X;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = t5.a(t62.b.f162798a);
                    String string = dVar.getString(R.string.social_group_activities_feed_off);
                    String string2 = dVar.getString(R.string.social_group_activities_feed_off_message);
                    string2.getClass();
                    String string3 = dVar.getString(R.string.lbl_admin_settings);
                    boolean zR = mVar3.r(dVar);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new a(dVar, 1);
                        mVar3.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new a(dVar, 1);
                            mVar3.K(objQ);
                        }
                    }
                    b82.n.d(dVarA, string, string2, null, string3, (e23.a) objQ, null, null, mVar3, 0, 200);
                } else {
                    mVar3.e();
                }
                break;
            default:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i19 = d.X;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = t5.a(t62.b.f162798a);
                    String string4 = dVar.getString(R.string.social_group_no_recent_shared_activities);
                    String string5 = dVar.getString(R.string.social_group_no_recent_activities_message);
                    string5.getClass();
                    b82.n.c(dVarA2, string4, string5, null, null, mVar4, 0, 24);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
