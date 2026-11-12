package t31;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f162216b;

    public /* synthetic */ f(g gVar, int i14, int i15) {
        this.f162215a = i15;
        this.f162216b = gVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f162215a;
        g gVar = this.f162216b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i15 = g.f162217g;
        switch (i14) {
            case 0:
                gVar.g(mVar, p0.t(1));
                break;
            default:
                gVar.h(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
