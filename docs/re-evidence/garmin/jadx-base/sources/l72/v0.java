package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111289a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f111290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2.t2 f111291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f111292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f111293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.b f111294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f111295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h4.r f111296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.q f111297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b92.a f111298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f111299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f111300l;

    public /* synthetic */ v0(x0 x0Var, c2.t2 t2Var, String str, String str2, x0.b bVar, String str3, e23.q qVar, h4.r rVar, b92.a aVar, int i14, int i15) {
        this.f111290b = x0Var;
        this.f111291c = t2Var;
        this.f111292d = str;
        this.f111293e = str2;
        this.f111294f = bVar;
        this.f111295g = str3;
        this.f111297i = qVar;
        this.f111296h = rVar;
        this.f111298j = aVar;
        this.f111299k = i14;
        this.f111300l = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f111289a;
        int i15 = this.f111299k;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                x0 x0Var = x0.f111346a;
                this.f111290b.a(p3.p0.t(i15 | 1), this.f111300l, this.f111298j, this.f111291c, this.f111297i, this.f111296h, this.f111292d, this.f111293e, this.f111295g, this.f111294f, mVar);
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                x0 x0Var2 = x0.f111346a;
                this.f111290b.f(p3.p0.t(i15 | 1), this.f111300l, this.f111298j, this.f111291c, this.f111297i, this.f111296h, this.f111292d, this.f111293e, this.f111295g, this.f111294f, mVar2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v0(x0 x0Var, c2.t2 t2Var, String str, String str2, x0.b bVar, String str3, h4.r rVar, e23.q qVar, b92.a aVar, int i14, int i15) {
        this.f111290b = x0Var;
        this.f111291c = t2Var;
        this.f111292d = str;
        this.f111293e = str2;
        this.f111294f = bVar;
        this.f111295g = str3;
        this.f111296h = rVar;
        this.f111297i = qVar;
        this.f111298j = aVar;
        this.f111299k = i14;
        this.f111300l = i15;
    }
}
