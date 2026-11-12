package k82;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import w51.o0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f103394b;

    public /* synthetic */ b(int i14, int i15, double d14) {
        this.f103393a = i15;
        this.f103394b = d14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f103393a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                c.g(this.f103394b, mVar, p0.t(1));
                break;
            case 1:
                nc1.b.a(this.f103394b, mVar, p0.t(1));
                break;
            case 2:
                o0.b(this.f103394b, mVar, p0.t(1));
                break;
            default:
                z21.f.f(this.f103394b, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
