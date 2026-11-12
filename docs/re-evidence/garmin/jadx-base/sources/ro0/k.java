package ro0;

import com.garmin.android.apps.connectmobile.help.HelpDetailsActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HelpDetailsActivity f153780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f153781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f153782d;

    public /* synthetic */ k(String str, boolean z14, HelpDetailsActivity helpDetailsActivity) {
        this.f153779a = 2;
        this.f153781c = str;
        this.f153782d = z14;
        this.f153780b = helpDetailsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f153779a;
        HelpDetailsActivity helpDetailsActivity = this.f153780b;
        boolean z14 = this.f153782d;
        String str = this.f153781c;
        int i15 = 1;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                int i16 = HelpDetailsActivity.f36654a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1061606312, new k(helpDetailsActivity, str, z14, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                int i17 = HelpDetailsActivity.f36654a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p3.v.a(g02.d.f74342a.c(helpDetailsActivity.getOnBackPressedDispatcher()), z3.f.c(-357214104, new k(str, z14, helpDetailsActivity), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
            default:
                int i18 = HelpDetailsActivity.f36654a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zR = mVar.r(helpDetailsActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new g(helpDetailsActivity, i15);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new g(helpDetailsActivity, i15);
                            mVar.K(objQ);
                        }
                    }
                    og.a.d(0, (e23.a) objQ, str, mVar, z14);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(HelpDetailsActivity helpDetailsActivity, String str, boolean z14, int i14) {
        this.f153779a = i14;
        this.f153780b = helpDetailsActivity;
        this.f153781c = str;
        this.f153782d = z14;
    }
}
