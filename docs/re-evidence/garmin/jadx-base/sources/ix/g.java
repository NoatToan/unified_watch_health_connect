package ix;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.p;
import p005kotlin.Unit;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95597a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f95598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f95599c;

    public /* synthetic */ g(j jVar, e23.a aVar) {
        this.f95598b = jVar;
        this.f95599c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f95597a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                    j jVar = this.f95598b;
                    p1 p1VarC = s9.c.c(jVar.f95628h, mVar);
                    p1 p1VarC2 = s9.c.c(jVar.f95629i, mVar);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        n82.f.a aVar = new n82.f.a(((l) p1VarC.getF182175a()).f95662b, null, ((l) p1VarC.getF182175a()).f95663c, 2, null);
                        mVar.K(aVar);
                        objQ = aVar;
                    }
                    z02.d.a(((l) p1VarC.getF182175a()).f95661a, z3.f.c(-2017773568, new g52.d(this.f95599c, p1VarC, jVar, context, 27), mVar), null, null, null, z3.f.c(-56272004, new h(context, n82.j.a((n82.f.a) objQ, null, mVar, 2), jVar, p1VarC, p1VarC2, 0), mVar), mVar, 196656, 28);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                i.a(this.f95598b, this.f95599c, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(j jVar, e23.a aVar, int i14) {
        this.f95598b = jVar;
        this.f95599c = aVar;
    }
}
