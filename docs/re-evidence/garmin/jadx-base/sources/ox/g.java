package ox;

import c2.a0;
import e23.p;
import gs1.l;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f134325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f134326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f134327d;

    public /* synthetic */ g(a0 a0Var, l lVar, int i14, int i15) {
        this.f134324a = i15;
        this.f134325b = a0Var;
        this.f134326c = lVar;
        this.f134327d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f134324a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                h.a(this.f134325b, this.f134326c, mVar, p0.t(this.f134327d | 1));
                break;
            default:
                i.a(this.f134325b, this.f134326c, mVar, p0.t(this.f134327d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
