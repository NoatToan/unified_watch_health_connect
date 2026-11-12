package b82;

import c2.t2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f16441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2 f16442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.r f16444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.d.b f16445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16449j;

    public /* synthetic */ a2(d2 d2Var, t2 t2Var, String str, h4.r rVar, h4.d.b bVar, int i14, int i15, int i16, int i17, int i18) {
        this.f16440a = i18;
        this.f16441b = d2Var;
        this.f16442c = t2Var;
        this.f16443d = str;
        this.f16444e = rVar;
        this.f16445f = bVar;
        this.f16446g = i14;
        this.f16447h = i15;
        this.f16448i = i16;
        this.f16449j = i17;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16440a;
        int i15 = this.f16448i;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                d2 d2Var = d2.f16532a;
                this.f16441b.a(this.f16442c, this.f16443d, this.f16444e, this.f16445f, this.f16446g, this.f16447h, mVar, p3.p0.t(i15 | 1), this.f16449j);
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                d2 d2Var2 = d2.f16532a;
                this.f16441b.f(this.f16442c, this.f16443d, this.f16444e, this.f16445f, this.f16446g, this.f16447h, mVar2, p3.p0.t(i15 | 1), this.f16449j);
                break;
        }
        return Unit.INSTANCE;
    }
}
