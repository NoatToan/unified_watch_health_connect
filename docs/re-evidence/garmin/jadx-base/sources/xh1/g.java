package xh1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f191062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f191063c;

    public /* synthetic */ g(h hVar, int i14, int i15) {
        this.f191061a = i15;
        this.f191062b = hVar;
        this.f191063c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f191061a;
        int i15 = this.f191063c;
        h hVar = this.f191062b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i16 = h.f191064f;
        switch (i14) {
            case 0:
                hVar.g(mVar, p0.t(i15 | 1));
                break;
            case 1:
                hVar.h(mVar, p0.t(i15 | 1));
                break;
            default:
                hVar.i(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
