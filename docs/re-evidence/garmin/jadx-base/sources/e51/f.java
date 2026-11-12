package e51;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import r82.n;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f63058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f63059c;

    public /* synthetic */ f(r rVar, i53.c cVar, int i14, int i15) {
        this.f63057a = i15;
        this.f63059c = rVar;
        this.f63058b = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f63057a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                h.d(p0.t(1), this.f63059c, this.f63058b, mVar);
                break;
            case 1:
                h.c(p0.t(1), this.f63059c, this.f63058b, mVar);
                break;
            case 2:
                gt1.p.a(p0.t(1), this.f63059c, this.f63058b, mVar);
                break;
            case 3:
                j82.e.k(p0.t(1), this.f63059c, this.f63058b, mVar);
                break;
            case 4:
                n.a(p0.t(1), this.f63059c, this.f63058b, mVar);
                break;
            default:
                z01.e.a(p0.t(1), this.f63059c, this.f63058b, mVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(i53.c cVar, r rVar, int i14, int i15) {
        this.f63057a = i15;
        this.f63058b = cVar;
        this.f63059c = rVar;
    }
}
