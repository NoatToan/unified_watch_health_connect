package m30;

import p005kotlin.Unit;
import p3.p0;
import w2.a0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n50.e f116341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f116342c;

    public /* synthetic */ e(n50.e eVar, e23.l lVar, int i14, int i15) {
        this.f116340a = i15;
        this.f116341b = eVar;
        this.f116342c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f116340a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                ge1.b.b(this.f116341b, this.f116342c, mVar, p0.t(49));
                break;
            default:
                a0.a(this.f116341b, this.f116342c, mVar, p0.t(49));
                break;
        }
        return Unit.INSTANCE;
    }
}
