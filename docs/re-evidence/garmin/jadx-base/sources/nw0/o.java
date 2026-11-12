package nw0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f128068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f128069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f128070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f128071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f128072f;

    public /* synthetic */ o(i53.c cVar, e23.l lVar, e23.l lVar2, e23.a aVar, int i14, int i15) {
        this.f128067a = i15;
        this.f128068b = cVar;
        this.f128069c = lVar;
        this.f128070d = lVar2;
        this.f128071e = aVar;
        this.f128072f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f128067a) {
            case 0:
                ((Integer) obj2).getClass();
                q.d(this.f128068b, this.f128069c, this.f128070d, this.f128071e, (p3.m) obj, p0.t(this.f128072f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wv0.i.j(this.f128068b, this.f128069c, this.f128070d, this.f128071e, (p3.m) obj, p0.t(this.f128072f | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
