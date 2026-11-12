package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0.a f110933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p f110934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f110935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.r f110936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f110937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f110938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f110939h;

    public /* synthetic */ c0(f0.a aVar, e23.p pVar, String str, h4.r rVar, boolean z14, e23.a aVar2, int i14, int i15) {
        this.f110932a = i15;
        this.f110933b = aVar;
        this.f110934c = pVar;
        this.f110935d = str;
        this.f110936e = rVar;
        this.f110937f = z14;
        this.f110938g = aVar2;
        this.f110939h = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f110932a;
        int i15 = this.f110939h;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0.a aVar = f0.a.f111000a;
                this.f110933b.b(this.f110934c, this.f110935d, this.f110936e, this.f110937f, this.f110938g, mVar, p3.p0.t(i15 | 1));
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0.a aVar2 = f0.a.f111000a;
                this.f110933b.e(this.f110934c, this.f110935d, this.f110936e, this.f110937f, this.f110938g, mVar2, p3.p0.t(i15 | 1));
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0.a aVar3 = f0.a.f111000a;
                this.f110933b.l(this.f110934c, this.f110935d, this.f110936e, this.f110937f, this.f110938g, mVar3, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
