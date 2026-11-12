package fe1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e11.f0;
import e23.p;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70553a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f70554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f70555c;

    public /* synthetic */ l(n nVar, e23.a aVar) {
        this.f70554b = nVar;
        this.f70555c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f70553a;
        e23.a aVar = this.f70555c;
        n nVar = this.f70554b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                    p1 p1VarC = s9.c.c(nVar.f70561e, mVar);
                    z02.d.a(((o) p1VarC.getF182175a()).f70579a, z3.f.c(-749439454, new f0(aVar, 11, context, p1VarC), mVar), null, null, null, z3.f.c(1212062110, new f0(p1VarC, 12, context, nVar), mVar), mVar, 196656, 28);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                m.a(nVar, aVar, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(n nVar, e23.a aVar, int i14) {
        this.f70554b = nVar;
        this.f70555c = aVar;
    }
}
