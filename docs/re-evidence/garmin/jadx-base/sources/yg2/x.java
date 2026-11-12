package yg2;

import com.garmin.android.apps.connectmobile.R;
import l72.h3;
import l72.i3;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f197232b;

    public /* synthetic */ x(h hVar, int i14) {
        this.f197231a = i14;
        this.f197232b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f197231a;
        p3.m.a aVar = p3.m.f135153a;
        h hVar = this.f197232b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.edit_workout);
                    i53.f fVarA = i53.a.a(new i3("CANCEL_EDIT_WORKOUT", gl1.y.Q(mVar, R.string.lbl_cancel), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR = mVar.r(hVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new ug2.z(hVar, 3);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ug2.z(hVar, 3);
                            mVar.K(objQ);
                        }
                    }
                    h3.f(null, strQ, null, null, null, fVarA, null, (e23.l) objQ, null, mVar, 262150, 348);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i15 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    String strQ2 = gl1.y.Q(mVar2, R.string.edit_workout);
                    boolean zR2 = mVar2.r(hVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new b0(hVar, 1);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new b0(hVar, 1);
                            mVar2.K(objQ2);
                        }
                    }
                    h3.e(dVarA, strQ2, null, null, (e23.a) objQ2, null, null, mVar2, 0, 108);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
