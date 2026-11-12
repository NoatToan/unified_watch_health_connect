package gs;

import c2.t2;
import nr.p0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78671a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f78672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f78673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f78674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f78675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f78676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f78677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f78678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f78679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f78680j;

    public /* synthetic */ s(h4.r rVar, p0 p0Var, boolean z14, float f14, ds.n nVar, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f78672b = rVar;
        this.f78677g = p0Var;
        this.f78674d = z14;
        this.f78673c = f14;
        this.f78678h = nVar;
        this.f78679i = aVar;
        this.f78680j = aVar2;
        this.f78675e = i14;
        this.f78676f = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f78671a;
        int i15 = this.f78675e;
        Object obj3 = this.f78680j;
        Object obj4 = this.f78679i;
        Object obj5 = this.f78678h;
        Object obj6 = this.f78677g;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(i15 | 1);
                t.a(this.f78672b, (p0) obj6, this.f78674d, this.f78673c, (ds.n) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, iT, this.f78676f);
                break;
            default:
                ((Integer) obj2).getClass();
                ww.f.a aVar = ww.f.f187506i;
                int iT2 = p3.p0.t(i15 | 1);
                ((ww.f) obj6).m((t2) obj5, (String) obj4, this.f78672b, this.f78673c, (h4.d.b) obj3, this.f78674d, (p3.m) obj, iT2, this.f78676f);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s(ww.f fVar, t2 t2Var, String str, h4.r rVar, float f14, h4.d.b bVar, boolean z14, int i14, int i15) {
        this.f78677g = fVar;
        this.f78678h = t2Var;
        this.f78679i = str;
        this.f78672b = rVar;
        this.f78673c = f14;
        this.f78680j = bVar;
        this.f78674d = z14;
        this.f78675e = i14;
        this.f78676f = i15;
    }
}
