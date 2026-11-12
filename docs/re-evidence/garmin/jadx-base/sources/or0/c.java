package or0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f133330b;

    public /* synthetic */ c(j jVar, int i14, int i15) {
        this.f133329a = i15;
        this.f133330b = jVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f133329a;
        j jVar = this.f133330b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        j.a aVar = j.f133348g;
        switch (i14) {
            case 0:
                jVar.k(mVar, p0.t(1));
                break;
            case 1:
                jVar.l(mVar, p0.t(1));
                break;
            case 2:
                jVar.g(mVar, p0.t(1));
                break;
            default:
                jVar.m(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
