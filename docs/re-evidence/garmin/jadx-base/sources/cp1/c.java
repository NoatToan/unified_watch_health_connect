package cp1;

import com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity.c;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity.d;
import e23.p;
import i3.e9;
import i3.mc;
import java.util.List;
import o53.b0;
import p005kotlin.Unit;
import p13.j0;
import p3.l0;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupRideAwardsWhatsNewActivity f54901b;

    public /* synthetic */ c(GroupRideAwardsWhatsNewActivity groupRideAwardsWhatsNewActivity, int i14) {
        this.f54900a = i14;
        this.f54901b = groupRideAwardsWhatsNewActivity;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f54900a;
        GroupRideAwardsWhatsNewActivity groupRideAwardsWhatsNewActivity = this.f54901b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = GroupRideAwardsWhatsNewActivity.f44735b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-68402176, new c(groupRideAwardsWhatsNewActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = GroupRideAwardsWhatsNewActivity.f44735b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    p1 p1VarC = s9.c.c(((com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b) groupRideAwardsWhatsNewActivity.f44736a.getValue()).f44752b, mVar2);
                    List<j> list = ((b) p1VarC.getF182175a()).f54899b;
                    m.a aVar = m.f135153a;
                    if (list == null || list.isEmpty()) {
                        mVar2.C(-1953846014);
                        mVar2.f();
                    } else {
                        mVar2.C(-1954575413);
                        mc mcVarF = e9.f(true, null, mVar2, 6, 2);
                        Object objQ = mVar2.q();
                        aVar.getClass();
                        m.a.C2565a c2565a = m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = l0.j(t13.h.f161748a, mVar2);
                            mVar2.K(objQ);
                        }
                        b0 b0Var = (b0) objQ;
                        Unit unit = Unit.INSTANCE;
                        boolean zB = mVar2.B(mcVarF);
                        Object objQ2 = mVar2.q();
                        if (zB || objQ2 == c2565a) {
                            objQ2 = new GroupRideAwardsWhatsNewActivity.a(mcVarF, null);
                            mVar2.K(objQ2);
                        }
                        l0.e((p) objQ2, unit, mVar2);
                        Iterable iterable = ((b) p1VarC.getF182175a()).f54899b;
                        if (iterable == null) {
                            iterable = j0.f134944a;
                        }
                        i53.f fVarJ = i53.a.j(iterable);
                        boolean zR = mVar2.r(b0Var) | mVar2.B(mcVarF) | mVar2.r(groupRideAwardsWhatsNewActivity);
                        Object objQ3 = mVar2.q();
                        if (zR || objQ3 == c2565a) {
                            objQ3 = new ak0.m(b0Var, 27, mcVarF, groupRideAwardsWhatsNewActivity);
                            mVar2.K(objQ3);
                        }
                        e.d(fVarJ, mcVarF, (e23.a) objQ3, mVar2, 0);
                        mVar2.f();
                    }
                    Boolean boolValueOf = Boolean.valueOf(((b) p1VarC.getF182175a()).f54898a);
                    boolean zB2 = mVar2.B(p1VarC) | mVar2.r(groupRideAwardsWhatsNewActivity);
                    Object objQ4 = mVar2.q();
                    if (zB2) {
                        objQ4 = groupRideAwardsWhatsNewActivity.new c(p1VarC, null);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = groupRideAwardsWhatsNewActivity.new c(p1VarC, null);
                            mVar2.K(objQ4);
                        }
                    }
                    l0.e((p) objQ4, boolValueOf, mVar2);
                    Unit unit2 = Unit.INSTANCE;
                    boolean zR2 = mVar2.r(groupRideAwardsWhatsNewActivity);
                    Object objQ5 = mVar2.q();
                    if (zR2) {
                        objQ5 = groupRideAwardsWhatsNewActivity.new d(null);
                        mVar2.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = groupRideAwardsWhatsNewActivity.new d(null);
                            mVar2.K(objQ5);
                        }
                    }
                    l0.e((p) objQ5, unit2, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
