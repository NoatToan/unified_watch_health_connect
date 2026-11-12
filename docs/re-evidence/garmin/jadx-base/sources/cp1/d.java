package cp1;

import c2.a0;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54902a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f54903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f54904c;

    public /* synthetic */ d(a0 a0Var, i53.c cVar) {
        this.f54903b = a0Var;
        this.f54904c = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f54902a;
        i53.c cVar = this.f54904c;
        a0 a0Var = this.f54903b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    e.b(a0Var, cVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                e.b(a0Var, cVar, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(a0 a0Var, i53.c cVar, int i14) {
        this.f54903b = a0Var;
        this.f54904c = cVar;
    }
}
