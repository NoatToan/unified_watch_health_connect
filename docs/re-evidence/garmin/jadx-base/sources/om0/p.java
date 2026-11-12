package om0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipActivity;
import gl1.y;
import o53.b0;
import p005kotlin.Unit;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupTransferOwnershipActivity f132954b;

    public /* synthetic */ p(GroupTransferOwnershipActivity groupTransferOwnershipActivity, int i14) {
        this.f132953a = i14;
        this.f132954b = groupTransferOwnershipActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f132953a;
        p3.m.a aVar = p3.m.f135153a;
        GroupTransferOwnershipActivity groupTransferOwnershipActivity = this.f132954b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GroupTransferOwnershipActivity.a aVar2 = GroupTransferOwnershipActivity.f36209d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-982435704, new p(groupTransferOwnershipActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                GroupTransferOwnershipActivity.a aVar3 = GroupTransferOwnershipActivity.f36209d;
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
                    Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    GroupTransferOwnershipActivity groupTransferOwnershipActivity2 = this.f132954b;
                    zc.d dVarA = zc.g.a(((com.garmin.android.apps.connectmobile.group.details.about.member.d) groupTransferOwnershipActivity2.f36212c.getValue()).f36253c, mVar2);
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p0.n(Boolean.FALSE);
                        mVar2.K(objQ2);
                    }
                    p1 p1Var = (p1) objQ2;
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.FALSE);
                        mVar2.K(objQ3);
                    }
                    p1 p1Var2 = (p1) objQ3;
                    z0 z0Var = dVarA.d().f196385a;
                    Boolean bool = (Boolean) p1Var2.getF182175a();
                    bool.booleanValue();
                    boolean zR = mVar2.r(dVarA);
                    Object objQ4 = mVar2.q();
                    if (zR || objQ4 == c2565a) {
                        objQ4 = new GroupTransferOwnershipActivity.b(dVarA, p1Var2, p1Var, null);
                        mVar2.K(objQ4);
                    }
                    l0.f(z0Var, bool, (e23.p) objQ4, mVar2);
                    Object objQ5 = mVar2.q();
                    if (objQ5 == c2565a) {
                        objQ5 = p0.n(null);
                        mVar2.K(objQ5);
                    }
                    p1 p1Var3 = (p1) objQ5;
                    Object objQ6 = mVar2.q();
                    if (objQ6 == c2565a) {
                        objQ6 = p0.n(Boolean.FALSE);
                        mVar2.K(objQ6);
                    }
                    z02.d.a(((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(2066375949, new p(groupTransferOwnershipActivity2, i15), mVar2), null, null, null, z3.f.c(-1620895471, new b21.l0((Object) dVarA, b0Var, (Object) groupTransferOwnershipActivity2, (Object) context, (Object) p1Var3, (p1) objQ6, p1Var2, 22), mVar2), mVar2, 196656, 28);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                GroupTransferOwnershipActivity.a aVar4 = GroupTransferOwnershipActivity.f36209d;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ = y.Q(mVar3, R.string.lbl_transfer_ownership);
                    boolean zR2 = mVar3.r(groupTransferOwnershipActivity);
                    Object objQ7 = mVar3.q();
                    if (zR2) {
                        objQ7 = new GroupTransferOwnershipActivity.c(groupTransferOwnershipActivity);
                        mVar3.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new GroupTransferOwnershipActivity.c(groupTransferOwnershipActivity);
                            mVar3.K(objQ7);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) ((k23.g) objQ7), null, strQ, mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
