package qq1;

import c2.a0;
import e23.p;
import nq1.k;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f146061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f146062c;

    public /* synthetic */ e(a0 a0Var, k kVar, int i14, int i15) {
        this.f146060a = i15;
        this.f146061b = a0Var;
        this.f146062c = kVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f146060a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                h.a(this.f146061b, this.f146062c, mVar, p0.t(7));
                break;
            case 1:
                h.g(this.f146061b, this.f146062c, mVar, p0.t(7));
                break;
            default:
                h.f(this.f146061b, this.f146062c, mVar, p0.t(7));
                break;
        }
        return Unit.INSTANCE;
    }
}
