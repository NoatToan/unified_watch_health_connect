package uk0;

import b82.t0;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171848a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f171849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f171850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f171851d;

    public /* synthetic */ n(int i14, e23.l lVar, String str, p1 p1Var) {
        this.f171851d = p1Var;
        this.f171849b = str;
        this.f171850c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f171848a;
        p1 p1Var = this.f171851d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                o.b(p1Var, this.f171849b, this.f171850c, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    t0 t0Var = t0.f16792a;
                    String strQ = y.Q(mVar, R.string.lbl_course_name);
                    String str = this.f171849b;
                    boolean z14 = !g22.n.d(str);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new yq.d(27);
                        mVar.K(objQ);
                    }
                    e23.l<? super l0, l0> lVar = (e23.l) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new xq1.c(p1Var, 18);
                        mVar.K(objQ2);
                    }
                    x5.v.f188954b.getClass();
                    t0Var.j(null, strQ, str, 128, z14, lVar, this.f171850c, (e23.l) objQ2, x5.v.f188955c, 0, null, mVar, 113445888, 0, 1537);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(e23.l lVar, String str, p1 p1Var) {
        this.f171849b = str;
        this.f171850c = lVar;
        this.f171851d = p1Var;
    }
}
