package b82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l72.f0 f16572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.r f16573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l72.b2 f16574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f16575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f16576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16578h;

    public /* synthetic */ g(l72.f0 f0Var, h4.r rVar, l72.b2 b2Var, String str, e23.a aVar, int i14, int i15, int i16) {
        this.f16571a = i16;
        this.f16572b = f0Var;
        this.f16573c = rVar;
        this.f16574d = b2Var;
        this.f16575e = str;
        this.f16576f = aVar;
        this.f16577g = i14;
        this.f16578h = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16571a) {
            case 0:
                ((Integer) obj2).getClass();
                h.b(this.f16572b, this.f16573c, this.f16574d, this.f16575e, this.f16576f, (p3.m) obj, p3.p0.t(this.f16577g | 1), this.f16578h);
                break;
            default:
                ((Integer) obj2).getClass();
                h.a(this.f16572b, this.f16573c, this.f16574d, this.f16575e, this.f16576f, (p3.m) obj, p3.p0.t(this.f16577g | 1), this.f16578h);
                break;
        }
        return Unit.INSTANCE;
    }
}
