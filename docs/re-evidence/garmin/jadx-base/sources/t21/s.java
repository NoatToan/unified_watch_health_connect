package t21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f161952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f161953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f161954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f161955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f161956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f161957g;

    public /* synthetic */ s(String str, String str2, String str3, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f161951a = i14;
        this.f161952b = str;
        this.f161953c = str2;
        this.f161954d = str3;
        this.f161955e = aVar;
        this.f161956f = aVar2;
        this.f161957g = aVar3;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        p5.k0 k0Var = (p5.k0) obj;
        switch (this.f161951a) {
            case 0:
                k0Var.getClass();
                p5.h0.p(k0Var, p13.x.k(new p5.g(this.f161952b, new a(this.f161955e, 6)), new p5.g(this.f161953c, new a(this.f161956f, 7)), new p5.g(this.f161954d, new a(this.f161957g, 8))));
                break;
            default:
                k0Var.getClass();
                p5.h0.p(k0Var, p13.x.k(new p5.g(this.f161952b, new a(this.f161955e, 29)), new p5.g(this.f161953c, new t70.a1(this.f161956f, 0)), new p5.g(this.f161954d, new t70.a1(this.f161957g, 1))));
                break;
        }
        return Unit.INSTANCE;
    }
}
