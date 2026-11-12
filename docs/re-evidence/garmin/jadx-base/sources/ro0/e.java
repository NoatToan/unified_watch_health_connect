package ro0;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import gl1.y;
import java.util.LinkedHashMap;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HelpActivity f153756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h82.c f153757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f153758d;

    public /* synthetic */ e(HelpActivity helpActivity, h82.c cVar, Bundle bundle, int i14) {
        this.f153755a = i14;
        this.f153756b = helpActivity;
        this.f153757c = cVar;
        this.f153758d = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f153755a;
        HelpActivity helpActivity = this.f153756b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                HelpActivity.a aVar = HelpActivity.f36653a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1267029772, new e(helpActivity, this.f153757c, this.f153758d, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                HelpActivity.a aVar2 = HelpActivity.f36653a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = y.Q(mVar2, R.string.lbl_help);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p0.n(strQ);
                        mVar2.K(objQ);
                    }
                    p1 p1Var = (p1) objQ;
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p0.n(null);
                        mVar2.K(objQ2);
                    }
                    p1 p1Var2 = (p1) objQ2;
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    String str = (String) p1Var2.getF182175a();
                    LinkedHashMap linkedHashMap = c0235a.f16962a;
                    linkedHashMap.put("title", str);
                    linkedHashMap.put("navigateIconDescription", helpActivity.getString(R.string.lbl_navigate_up));
                    z02.d.a(false, z3.f.c(-979247279, new pp.g(helpActivity, 21, c0235a.b(), p1Var), mVar2), null, null, null, z3.f.c(-31459755, new f(this.f153757c, this.f153758d, p1Var, p1Var2, 0), mVar2), mVar2, 196656, 29);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
