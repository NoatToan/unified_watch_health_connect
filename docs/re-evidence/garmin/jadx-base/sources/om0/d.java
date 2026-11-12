package om0;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity;
import li0.d0;
import p005kotlin.Unit;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132904a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupManageMembersActivity f132905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.a f132906c;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.group.details.about.member.a aVar, GroupManageMembersActivity groupManageMembersActivity) {
        this.f132906c = aVar;
        this.f132905b = groupManageMembersActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f132904a;
        p3.m.a aVar = p3.m.f135153a;
        com.garmin.android.apps.connectmobile.group.details.about.member.a aVar2 = this.f132906c;
        GroupManageMembersActivity groupManageMembersActivity = this.f132905b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GroupManageMembersActivity.a aVar3 = GroupManageMembersActivity.f36194d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = ((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar2).f36221a;
                    GroupDTO groupDTO = ((com.garmin.android.apps.connectmobile.group.details.about.member.c) groupManageMembersActivity.f36195a.getValue()).f36234a;
                    boolean zR = mVar.r(groupManageMembersActivity) | mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new o50.a(7, groupManageMembersActivity, aVar2);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new o50.a(7, groupManageMembersActivity, aVar2);
                            mVar.K(objQ);
                        }
                    }
                    com.garmin.android.apps.connectmobile.group.details.about.member.b.a(bVar, groupDTO, (e23.l) objQ, mVar, com.garmin.android.apps.connectmobile.connections.groups.services.model.b.f31612r);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                GroupManageMembersActivity.a aVar4 = GroupManageMembersActivity.f36194d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    boolean zR2 = mVar2.r(groupManageMembersActivity) | mVar2.B(aVar2);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e(groupManageMembersActivity, aVar2, 0);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e(groupManageMembersActivity, aVar2, 0);
                            mVar2.K(objQ2);
                        }
                    }
                    h4.r rVarD = w.d(aVar5, false, null, null, (e23.a) objQ2, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97901d.f97906e;
                    d0 d0Var = ((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar2).f36221a.f31627o;
                    b12.k.b(rVarD, null, f14, d0Var != null ? d0Var.f112648a : null, mVar2, b12.b.f14385f << 9, 18);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(GroupManageMembersActivity groupManageMembersActivity, com.garmin.android.apps.connectmobile.group.details.about.member.a aVar) {
        this.f132905b = groupManageMembersActivity;
        this.f132906c = aVar;
    }
}
