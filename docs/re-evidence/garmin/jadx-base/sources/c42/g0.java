package c42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zd0.k.a f24397b;

    public /* synthetic */ g0(zd0.k.a aVar, int i14) {
        this.f24396a = i14;
        this.f24397b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f24396a;
        zd0.k.a aVar = this.f24397b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    wf.f.a aVar2 = new wf.f.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
                    aVar2.f184930c = aVar.f204044c;
                    wf.g.a(aVar2);
                    wf.f fVarA = aVar2.a();
                    t4.d dVarA = n5.c.a(2131231969, mVar, 0);
                    t4.d dVarA2 = n5.c.a(2131231969, mVar, 0);
                    g6.f.a aVar3 = g6.f.f75994b;
                    jf.r.b(fVarA, "", x2.q(h4.r.S, 48), dVarA, dVarA2, null, null, null, null, null, null, null, mVar, 432, 0, 32736);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    wf.f.a aVar4 = new wf.f.a((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b));
                    aVar4.f184930c = aVar.f204044c;
                    wf.g.a(aVar4);
                    wf.f fVarA2 = aVar4.a();
                    t4.d dVarA3 = n5.c.a(2131231969, mVar2, 0);
                    t4.d dVarA4 = n5.c.a(2131231969, mVar2, 0);
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    jf.r.b(fVarA2, "", x2.q(aVar5, j92.b.f97901d.f97906e), dVarA3, dVarA4, null, null, null, null, null, null, null, mVar2, 48, 0, 32736);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
