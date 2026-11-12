package ho0;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f84704b;

    public /* synthetic */ c(h hVar, int i14, int i15) {
        this.f84703a = i15;
        this.f84704b = hVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f84703a;
        h hVar = this.f84704b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = h.f84713l;
        switch (i14) {
            case 0:
                hVar.g(mVar, p0.t(1));
                break;
            case 1:
                hVar.k(mVar, p0.t(1));
                break;
            case 2:
                hVar.h(mVar, p0.t(1));
                break;
            case 3:
                hVar.i(mVar, p0.t(1));
                break;
            default:
                hVar.j(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
