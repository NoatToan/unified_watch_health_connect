package p006l2;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.n f108668b;

    public /* synthetic */ n(w2.n nVar, int i14, int i15) {
        this.f108667a = i15;
        this.f108668b = nVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f108667a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                r.f(this.f108668b, mVar, p0.t(1));
                break;
            default:
                r.e(this.f108668b, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
