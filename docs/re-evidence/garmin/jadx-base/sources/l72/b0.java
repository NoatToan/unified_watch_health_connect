package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0.a f110905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f110906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f110907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f110908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f110909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f110910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f110911h;

    public /* synthetic */ b0(f0.a aVar, String str, h4.r rVar, boolean z14, e23.a aVar2, int i14, int i15, int i16) {
        this.f110904a = i16;
        this.f110905b = aVar;
        this.f110906c = str;
        this.f110907d = rVar;
        this.f110908e = z14;
        this.f110909f = aVar2;
        this.f110910g = i14;
        this.f110911h = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f110904a;
        int i15 = this.f110910g;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0.a aVar = f0.a.f111000a;
                this.f110905b.f(this.f110906c, this.f110907d, this.f110908e, this.f110909f, mVar, p3.p0.t(i15 | 1), this.f110911h);
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0.a aVar2 = f0.a.f111000a;
                this.f110905b.j(this.f110906c, this.f110907d, this.f110908e, this.f110909f, mVar2, p3.p0.t(i15 | 1), this.f110911h);
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0.a aVar3 = f0.a.f111000a;
                this.f110905b.m(this.f110906c, this.f110907d, this.f110908e, this.f110909f, mVar3, p3.p0.t(i15 | 1), this.f110911h);
                break;
        }
        return Unit.INSTANCE;
    }
}
