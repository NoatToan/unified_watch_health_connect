package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f111339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f111340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f111341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f111342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f111343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f111344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f111345h;

    public /* synthetic */ x(f0 f0Var, String str, h4.r rVar, boolean z14, e23.a aVar, int i14, int i15, int i16) {
        this.f111338a = i16;
        this.f111339b = f0Var;
        this.f111340c = str;
        this.f111341d = rVar;
        this.f111342e = z14;
        this.f111343f = aVar;
        this.f111344g = i14;
        this.f111345h = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f111338a;
        int i15 = this.f111344g;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0 f0Var = f0.f110999a;
                this.f111339b.i(this.f111340c, this.f111341d, this.f111342e, this.f111343f, mVar, p3.p0.t(i15 | 1), this.f111345h);
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0 f0Var2 = f0.f110999a;
                this.f111339b.b(this.f111340c, this.f111341d, this.f111342e, this.f111343f, mVar2, p3.p0.t(i15 | 1), this.f111345h);
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0 f0Var3 = f0.f110999a;
                this.f111339b.k(this.f111340c, this.f111341d, this.f111342e, this.f111343f, mVar3, p3.p0.t(i15 | 1), this.f111345h);
                break;
        }
        return Unit.INSTANCE;
    }
}
