package yr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr.i0 f198849b;

    public /* synthetic */ b(nr.i0 i0Var) {
        this.f198848a = 1;
        this.f198849b = i0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198848a;
        nr.i0 i0Var = this.f198849b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                c.b(i0Var, (p3.m) obj, p3.p0.t(1));
                break;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    wf.f.a aVar = new wf.f.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
                    nr.g0 g0Var = i0Var.f127200f;
                    aVar.f184930c = g0Var != null ? g0Var.f127179a : null;
                    wf.g.a(aVar);
                    wf.f fVarA = aVar.a();
                    t4.d dVarA = n5.c.a(2131231129, mVar, 0);
                    t4.d dVarA2 = n5.c.a(2131231129, mVar, 0);
                    g6.f.a aVar2 = g6.f.f75994b;
                    jf.r.b(fVarA, null, x2.q(h4.r.S, 48), dVarA, dVarA2, null, null, null, null, null, null, null, mVar, 432, 0, 32736);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                e.b(i0Var, (p3.m) obj, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(nr.i0 i0Var, int i14, int i15) {
        this.f198848a = i15;
        this.f198849b = i0Var;
    }
}
