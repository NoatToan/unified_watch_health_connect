package z10;

import android.widget.FrameLayout;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f200916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f200917c;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.consent.a aVar, FrameLayout frameLayout, int i14) {
        this.f200915a = i14;
        this.f200916b = aVar;
        this.f200917c = frameLayout;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f200915a;
        FrameLayout frameLayout = this.f200917c;
        com.garmin.android.apps.connectmobile.consent.a aVar = this.f200916b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(576830941, new c(aVar, frameLayout, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_nothing_to_see_here);
                    String strQ2 = gl1.y.Q(mVar2, R.string.txt_empty_page_unable_load);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_retry);
                    boolean zR = mVar2.r(aVar) | mVar2.r(frameLayout);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new d(0, aVar, frameLayout);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new d(0, aVar, frameLayout);
                            mVar2.K(objQ);
                        }
                    }
                    b82.n.d(null, strQ, strQ2, rVarY, strQ3, (e23.a) objQ, null, null, mVar2, 0, 193);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
