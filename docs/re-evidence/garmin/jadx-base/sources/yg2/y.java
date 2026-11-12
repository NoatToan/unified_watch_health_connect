package yg2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f197234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f197235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf2.e f197236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f197237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f197238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lc.y f197239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f197240h;

    public /* synthetic */ y(h hVar, g gVar, vf2.e eVar, boolean z14, boolean z15, lc.y yVar, int i14, int i15) {
        this.f197233a = i15;
        this.f197234b = hVar;
        this.f197235c = gVar;
        this.f197236d = eVar;
        this.f197237e = z14;
        this.f197238f = z15;
        this.f197239g = yVar;
        this.f197240h = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f197233a) {
            case 0:
                ((Integer) obj2).getClass();
                f0.a(this.f197234b, this.f197235c, this.f197236d, this.f197237e, this.f197238f, this.f197239g, (p3.m) obj, p3.p0.t(this.f197240h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                f0.d(this.f197234b, this.f197235c, this.f197236d, this.f197237e, this.f197238f, this.f197239g, (p3.m) obj, p3.p0.t(this.f197240h | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
