package vd0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177354a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f177355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f177356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe0.d f177357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f177358e;

    public /* synthetic */ p1(i53.c cVar, i53.c cVar2, pe0.d dVar, e23.l lVar, int i14) {
        this.f177355b = cVar;
        this.f177356c = cVar2;
        this.f177357d = dVar;
        this.f177358e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f177354a) {
            case 0:
                ((Integer) obj2).getClass();
                x1.a(p3.p0.t(1), this.f177358e, this.f177355b, this.f177356c, (p3.m) obj, this.f177357d);
                break;
            default:
                ((Integer) obj2).getClass();
                f2.a(p3.p0.t(1), this.f177358e, this.f177355b, this.f177356c, (p3.m) obj, this.f177357d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ p1(i53.c cVar, pe0.d dVar, i53.c cVar2, e23.l lVar, int i14) {
        this.f177355b = cVar;
        this.f177357d = dVar;
        this.f177356c = cVar2;
        this.f177358e = lVar;
    }
}
