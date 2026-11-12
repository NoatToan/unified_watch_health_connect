package t21;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import kotlin.m3;
import l72.i3;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161928a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.q f161929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f161930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f161931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f161932e;

    public /* synthetic */ n(e23.a aVar, m4.q qVar, m3 m3Var, e23.a aVar2) {
        this.f161931d = aVar;
        this.f161929b = qVar;
        this.f161930c = m3Var;
        this.f161932e = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:38:0x012d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f161928a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f161932e;
        e23.a aVar3 = this.f161931d;
        m3 m3Var = this.f161930c;
        m4.q qVar = this.f161929b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_edit_meal);
                    boolean zB = mVar.B(aVar3);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a(aVar3, 3);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a(aVar3, 3);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    i53.f fVarA = i53.a.a(new i3("SAVE", gl1.y.Q(mVar, R.string.lbl_done), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR = mVar.r(qVar) | mVar.B(m3Var) | mVar.B(aVar2);
                    Object objQ2 = mVar.q();
                    if (zR) {
                        objQ2 = new lm0.i(qVar, m3Var, aVar2, 1);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new lm0.i(qVar, m3Var, aVar2, 1);
                            mVar.K(objQ2);
                        }
                    }
                    z02.f.e(strQ, null, aVar4, fVarA, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.f23729ye);
                    boolean zR2 = mVar2.r(qVar) | mVar2.B(m3Var) | mVar2.B(aVar3);
                    Object objQ3 = mVar2.q();
                    if (zR2) {
                        objQ3 = new n0(qVar, m3Var, aVar3, 0);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new n0(qVar, m3Var, aVar3, 0);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ3;
                    i53.f fVarA2 = i53.a.a(new i3("DONE", gl1.y.Q(mVar2, R.string.lbl_done), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR3 = mVar2.r(qVar) | mVar2.B(m3Var) | mVar2.B(aVar2);
                    Object objQ4 = mVar2.q();
                    if (zR3) {
                        objQ4 = new lm0.i(qVar, m3Var, aVar2, 2);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new lm0.i(qVar, m3Var, aVar2, 2);
                            mVar2.K(objQ4);
                        }
                    }
                    z02.f.e(strW, null, aVar5, fVarA2, (e23.l) objQ4, mVar2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(m4.q qVar, m3 m3Var, e23.a aVar, e23.a aVar2) {
        this.f161929b = qVar;
        this.f161930c = m3Var;
        this.f161931d = aVar;
        this.f161932e = aVar2;
    }
}
