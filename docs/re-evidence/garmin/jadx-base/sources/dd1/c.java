package dd1;

import a03.h0;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import e23.l;
import e23.p;
import gl1.y;
import k23.g;
import l72.i3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f59192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f59193c;

    public /* synthetic */ c(u uVar, e23.a aVar, int i14) {
        this.f59191a = i14;
        this.f59192b = uVar;
        this.f59193c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f59191a;
        m.a aVar = m.f135153a;
        e23.a aVar2 = this.f59193c;
        u uVar = this.f59192b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    String strQ = y.Q(mVar, R.string.lbl_race_predictor);
                    boolean zR = mVar.r(uVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new e.a(uVar);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new e.a(uVar);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) ((g) objQ);
                    i53.f fVarA = i53.a.a(new i3("menu_item_help", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (j) null));
                    boolean zB = mVar.B(aVar2);
                    Object objQ2 = mVar.q();
                    if (zB) {
                        objQ2 = new h0(aVar2, 18);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new h0(aVar2, 18);
                            mVar.K(objQ2);
                        }
                    }
                    z02.f.d(strQ, null, null, aVar3, fVarA, null, (l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    String strQ2 = y.Q(mVar2, R.string.solar_intensity);
                    boolean zR2 = mVar2.r(uVar);
                    Object objQ3 = mVar2.q();
                    if (zR2) {
                        objQ3 = new up1.b.a(uVar);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new up1.b.a(uVar);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar4 = (e23.a) ((g) objQ3);
                    i53.f fVarA2 = i53.a.a(new i3("menu_item_help", y.Q(mVar2, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (j) null));
                    boolean zB2 = mVar2.B(aVar2);
                    Object objQ4 = mVar2.q();
                    if (zB2) {
                        objQ4 = new rx1.m(aVar2, 14);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new rx1.m(aVar2, 14);
                            mVar2.K(objQ4);
                        }
                    }
                    z02.f.d(strQ2, null, null, aVar4, null, fVarA2, (l) objQ4, mVar2, 2097152, 54);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
