package fe1;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f70542b;

    public /* synthetic */ f(g gVar, int i14, int i15) {
        this.f70541a = i15;
        this.f70542b = gVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f70541a;
        g gVar = this.f70542b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        g.a aVar = g.f70543g;
        switch (i14) {
            case 0:
                gVar.i(mVar, p0.t(1));
                break;
            case 1:
                gVar.g(mVar, p0.t(1));
                break;
            case 2:
                gVar.j(mVar, p0.t(1));
                break;
            default:
                gVar.h(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
