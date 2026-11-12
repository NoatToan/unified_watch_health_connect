package et1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65705a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f65706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f65707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f65708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f65709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f65710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f65711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f65712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f65713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f65714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o13.h f65715k;

    public /* synthetic */ m1(pt1.d dVar, je2.b bVar, boolean z14, boolean z15, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.r rVar, e23.l lVar2, int i14) {
        this.f65712h = dVar;
        this.f65713i = bVar;
        this.f65706b = z14;
        this.f65707c = z15;
        this.f65711g = lVar;
        this.f65708d = aVar;
        this.f65709e = aVar2;
        this.f65710f = aVar3;
        this.f65715k = rVar;
        this.f65714j = lVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f65705a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(65);
                w1.a((pt1.d) this.f65712h, (je2.b) this.f65713i, this.f65706b, this.f65707c, this.f65711g, this.f65708d, this.f65709e, this.f65710f, (e23.r) this.f65715k, (e23.l) this.f65714j, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(1);
                rk0.d0.d(this.f65706b, (rk0.f0) this.f65712h, (i53.c) this.f65713i, this.f65707c, (gg1.o0) this.f65714j, this.f65708d, this.f65709e, this.f65710f, this.f65711g, (e23.a) this.f65715k, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m1(boolean z14, rk0.f0 f0Var, i53.c cVar, boolean z15, gg1.o0 o0Var, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar, e23.a aVar4, int i14) {
        this.f65706b = z14;
        this.f65712h = f0Var;
        this.f65713i = cVar;
        this.f65707c = z15;
        this.f65714j = o0Var;
        this.f65708d = aVar;
        this.f65709e = aVar2;
        this.f65710f = aVar3;
        this.f65711g = lVar;
        this.f65715k = aVar4;
    }
}
