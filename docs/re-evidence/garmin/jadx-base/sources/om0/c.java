package om0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity;
import gl1.y;
import o53.b0;
import p005kotlin.Unit;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupManageMembersActivity f132903b;

    public /* synthetic */ c(GroupManageMembersActivity groupManageMembersActivity, int i14) {
        this.f132902a = i14;
        this.f132903b = groupManageMembersActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p1 p1Var;
        int i14 = this.f132902a;
        p3.m.a aVar = p3.m.f135153a;
        GroupManageMembersActivity groupManageMembersActivity = this.f132903b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GroupManageMembersActivity.a aVar2 = GroupManageMembersActivity.f36194d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-18066040, new c(groupManageMembersActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                GroupManageMembersActivity.a aVar3 = GroupManageMembersActivity.f36194d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = l0.j(t13.h.f161748a, mVar2);
                        mVar2.K(objQ);
                    }
                    b0 b0Var = (b0) objQ;
                    GroupManageMembersActivity groupManageMembersActivity2 = this.f132903b;
                    zc.d dVarA = zc.g.a(((com.garmin.android.apps.connectmobile.group.details.about.member.c) groupManageMembersActivity2.f36195a.getValue()).f36240g, mVar2);
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p0.n(Boolean.FALSE);
                        mVar2.K(objQ2);
                    }
                    p1 p1Var2 = (p1) objQ2;
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.FALSE);
                        mVar2.K(objQ3);
                    }
                    p1 p1Var3 = (p1) objQ3;
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a) {
                        objQ4 = p0.n(Boolean.FALSE);
                        mVar2.K(objQ4);
                    }
                    p1 p1Var4 = (p1) objQ4;
                    z0 z0Var = dVarA.d().f196385a;
                    boolean zR = mVar2.r(dVarA);
                    Object objQ5 = mVar2.q();
                    if (zR || objQ5 == c2565a) {
                        p1Var = p1Var4;
                        GroupManageMembersActivity.b bVar = new GroupManageMembersActivity.b(dVarA, p1Var3, p1Var, p1Var2, null);
                        mVar2.K(bVar);
                        objQ5 = bVar;
                    } else {
                        p1Var = p1Var4;
                    }
                    l0.e((e23.p) objQ5, z0Var, mVar2);
                    z02.d.a(((Boolean) p1Var2.getF182175a()).booleanValue(), z3.f.c(757651213, new c(groupManageMembersActivity2, i15), mVar2), null, null, null, z3.f.c(851955473, new ob0.e(b0Var, dVarA, groupManageMembersActivity2, p1Var, p1Var3, 2), mVar2), mVar2, 196656, 28);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                GroupManageMembersActivity.a aVar4 = GroupManageMembersActivity.f36194d;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ = y.Q(mVar3, R.string.lbl_manage_members);
                    boolean zR2 = mVar3.r(groupManageMembersActivity);
                    Object objQ6 = mVar3.q();
                    if (zR2) {
                        objQ6 = new GroupManageMembersActivity.c(groupManageMembersActivity);
                        mVar3.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new GroupManageMembersActivity.c(groupManageMembersActivity);
                            mVar3.K(objQ6);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) ((k23.g) objQ6), null, strQ, mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
