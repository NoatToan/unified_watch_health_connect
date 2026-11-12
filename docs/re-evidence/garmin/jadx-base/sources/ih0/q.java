package ih0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import l72.i3;
import lc.y;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f93477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f93478c;

    public /* synthetic */ q(int i14, e23.a aVar, y yVar) {
        this.f93476a = i14;
        this.f93477b = aVar;
        this.f93478c = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0139  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a6  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f93476a;
        p3.m.a aVar = p3.m.f135153a;
        y yVar = this.f93478c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_fitness_age);
                    i53.f fVarA = i53.a.a(new i3("HELP", gl1.y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR = mVar.r(yVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new c42.o(yVar, 2);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new c42.o(yVar, 2);
                            mVar.K(objQ);
                        }
                    }
                    z02.f.d(strQ, null, null, this.f93477b, fVarA, null, (e23.l) objQ, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar2, R.string.running_tolerance);
                    i53.f fVarA2 = i53.a.a(new i3("HELP", gl1.y.Q(mVar2, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR2 = mVar2.r(yVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new c42.o(yVar, 3);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new c42.o(yVar, 3);
                            mVar2.K(objQ2);
                        }
                    }
                    z02.f.d(strQ2, null, null, this.f93477b, fVarA2, null, (e23.l) objQ2, mVar2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar3, R.string.race_time_prediction);
                    i53.f fVarA3 = i53.a.a(new i3("HELP", gl1.y.Q(mVar3, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR3 = mVar3.r(yVar);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new c42.o(yVar, 7);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new c42.o(yVar, 7);
                            mVar3.K(objQ3);
                        }
                    }
                    z02.f.d(strQ3, null, null, this.f93477b, fVarA3, null, (e23.l) objQ3, mVar3, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar3.e();
                }
                break;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String strQ4 = gl1.y.Q(mVar4, R.string.running_economy);
                    i53.f fVarA4 = i53.a.a(new i3("HELP", gl1.y.Q(mVar4, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR4 = mVar4.r(yVar);
                    Object objQ4 = mVar4.q();
                    if (zR4) {
                        objQ4 = new c42.o(yVar, 12);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new c42.o(yVar, 12);
                            mVar4.K(objQ4);
                        }
                    }
                    z02.f.d(strQ4, null, null, this.f93477b, fVarA4, null, (e23.l) objQ4, mVar4, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
