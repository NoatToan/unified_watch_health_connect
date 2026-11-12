package j30;

import e23.l;
import e23.p;
import k30.n;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96838a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f96839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f96840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f96841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f96842e;

    public /* synthetic */ b(e23.a aVar, n nVar, l lVar, l lVar2) {
        this.f96840c = aVar;
        this.f96839b = nVar;
        this.f96841d = lVar;
        this.f96842e = lVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f96838a) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(512914806, new hl1.i(this.f96840c, 9), mVar), null, null, null, z3.f.c(-75033478, new e(this.f96839b, this.f96841d, this.f96842e), mVar), mVar, 196656, 29);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                i.b(this.f96839b, this.f96840c, this.f96841d, this.f96842e, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(n nVar, e23.a aVar, l lVar, l lVar2, int i14) {
        this.f96839b = nVar;
        this.f96840c = aVar;
        this.f96841d = lVar;
        this.f96842e = lVar2;
    }
}
