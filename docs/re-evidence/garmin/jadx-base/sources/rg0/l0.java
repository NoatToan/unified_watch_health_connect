package rg0;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserActivity.b;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import v62.o7;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InviteAuthorizedUserActivity f152580b;

    public /* synthetic */ l0(InviteAuthorizedUserActivity inviteAuthorizedUserActivity, int i14) {
        this.f152579a = i14;
        this.f152580b = inviteAuthorizedUserActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        fw.m mVar;
        Object bVar;
        p3.m mVar2;
        switch (this.f152579a) {
            case 0:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                InviteAuthorizedUserActivity.a aVar = InviteAuthorizedUserActivity.f34996q;
                int i14 = 1;
                if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1310144712, new l0(this.f152580b, i14), mVar3), mVar3, 196608, 31);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                InviteAuthorizedUserActivity.a aVar2 = InviteAuthorizedUserActivity.f34996q;
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    Context context = (Context) mVar4.A(AndroidCompositionLocals_androidKt.f6042b);
                    InviteAuthorizedUserActivity inviteAuthorizedUserActivity = this.f152580b;
                    p1 p1VarC = s9.c.c(inviteAuthorizedUserActivity.ha().f35161j, mVar4);
                    p1 p1VarC2 = s9.c.c(r53.s.d(inviteAuthorizedUserActivity.ha().f35156e), mVar4);
                    Object objQ = mVar4.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        mVar4.K(objQ);
                    }
                    p1 p1Var = (p1) objQ;
                    Object objQ2 = mVar4.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p0.n(Boolean.FALSE);
                        mVar4.K(objQ2);
                    }
                    p1 p1Var2 = (p1) objQ2;
                    Object objQ3 = mVar4.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.valueOf(((hi0.a) p1VarC2.getF182175a()) != null));
                        mVar4.K(objQ3);
                    }
                    p1 p1Var3 = (p1) objQ3;
                    p1 p1VarB = s9.c.b(inviteAuthorizedUserActivity.ha().f35162k, 0, mVar4, 48);
                    p1 p1VarC3 = s9.c.c(r53.s.d(inviteAuthorizedUserActivity.ha().f35155d), mVar4);
                    fw.m mVar5 = (fw.m) p1VarC3.getF182175a();
                    boolean zB = mVar4.B(p1VarC3) | mVar4.r(inviteAuthorizedUserActivity);
                    Object objQ4 = mVar4.q();
                    if (zB || objQ4 == c2565a) {
                        mVar = mVar5;
                        bVar = inviteAuthorizedUserActivity.new b(p1VarC3, p1Var, p1Var2, null);
                        mVar4.K(bVar);
                    } else {
                        bVar = objQ4;
                        mVar = mVar5;
                    }
                    fw.m.a aVar3 = fw.m.f73767e;
                    p3.l0.e((e23.p) bVar, mVar, mVar4);
                    hi0.a aVar4 = (hi0.a) p1VarC2.getF182175a();
                    boolean zB2 = mVar4.B(p1VarC2);
                    Object objQ5 = mVar4.q();
                    if (zB2 || objQ5 == c2565a) {
                        objQ5 = new InviteAuthorizedUserActivity.c(p1VarC2, p1Var3, null);
                        mVar4.K(objQ5);
                    }
                    Parcelable.Creator<hi0.a> creator = hi0.a.CREATOR;
                    p3.l0.e((e23.p) objQ5, aVar4, mVar4);
                    h4.r.a aVar5 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode = Long.hashCode(mVar4.getU());
                    i2 i2VarX = mVar4.x();
                    h4.r rVarC = h4.k.c(aVar5, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar6);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar4);
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar4.C(-1664676668);
                        s62.a.f157643a.getClass();
                        mVar2 = mVar4;
                        b82.n.c(o7.a(t62.b.f162798a), gl1.y.Q(mVar4, R.string.msg_no_friends), gl1.y.Q(mVar4, R.string.msg_to_add_an_authorized_viewer), null, null, mVar2, 0, 24);
                        mVar2.f();
                    } else {
                        mVar4.C(-1664320571);
                        List list = (List) p1VarC.getF182175a();
                        h4.r rVarA = b0Var.a(x2.f(aVar5, 1.0f), 1.0f, true);
                        boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                        int iIntValue3 = ((Number) p1VarB.getF182175a()).intValue();
                        boolean zR = mVar4.r(inviteAuthorizedUserActivity);
                        Object objQ6 = mVar4.q();
                        if (zR || objQ6 == c2565a) {
                            objQ6 = new qn0.f(27, inviteAuthorizedUserActivity, p1Var);
                            mVar4.K(objQ6);
                        }
                        e23.a aVar7 = (e23.a) objQ6;
                        boolean zR2 = mVar4.r(inviteAuthorizedUserActivity);
                        Object objQ7 = mVar4.q();
                        if (zR2 || objQ7 == c2565a) {
                            objQ7 = new qw0.y(inviteAuthorizedUserActivity, 12);
                            mVar4.K(objQ7);
                        }
                        i.a(list, rVarA, zBooleanValue, iIntValue3, aVar7, (e23.l) objQ7, mVar4, 0);
                        l72.f0 f0Var = l72.f0.f110999a;
                        String strQ = gl1.y.Q(mVar4, R.string.send_request);
                        boolean zBooleanValue2 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                        h4.r rVarF = x2.f(aVar5, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                        boolean zR3 = mVar4.r(inviteAuthorizedUserActivity) | mVar4.r(context);
                        Object objQ8 = mVar4.q();
                        if (zR3 || objQ8 == c2565a) {
                            objQ8 = new qn0.f(28, inviteAuthorizedUserActivity, context);
                            mVar4.K(objQ8);
                        }
                        f0Var.d(0, 1, (e23.a) objQ8, rVarY, strQ, mVar4, null, zBooleanValue2);
                        mVar2 = mVar4;
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }
}
