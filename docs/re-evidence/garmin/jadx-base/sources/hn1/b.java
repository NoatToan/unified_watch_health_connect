package hn1;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import et1.b2;
import i3.ff;
import i3.hf;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f84512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f84513c;

    public /* synthetic */ b(boolean z14, p1 p1Var, int i14) {
        this.f84511a = i14;
        this.f84512b = z14;
        this.f84513c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        int i16 = this.f84511a;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = this.f84512b;
        p1 p1Var = this.f84513c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i16) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (z14) {
                        mVar.C(1077546999);
                        boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                        Object objQ = mVar.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b2(p1Var, 23);
                            mVar.K(objQ);
                        }
                        g.e(zBooleanValue, (e23.l) objQ, mVar, 48);
                        mVar.f();
                    } else {
                        mVar.C(1077708447);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 1:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    hf.a(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, this.f84512b, d92.c.a(ff.f88115a, mVar), mVar, 48, 76);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (z14) {
                        i14 = 475854701;
                        i15 = R.string.lbl_results;
                    } else {
                        i14 = 475936107;
                        i15 = R.string.lbl_scan_food;
                    }
                    String strH = sn.a.h(mVar, i14, i15, mVar);
                    Object objQ2 = mVar.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new vd0.c(p1Var, 24);
                        mVar.K(objQ2);
                    }
                    z02.f.c(3072, 54, null, (e23.a) objQ2, null, strH, mVar, null);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    hf.a(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, this.f84512b, d92.c.a(ff.f88115a, mVar), mVar, 48, 76);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    y01.p.b(((Boolean) p1Var.getF182175a()).booleanValue(), z14, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
