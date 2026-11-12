package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89960a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f89961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f89962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f89964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f89965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f89966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f89967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f89968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f89969j;

    public /* synthetic */ v(e23.p pVar, h4.r rVar, e23.p pVar2, e23.q qVar, float f14, c2.k3 k3Var, mj mjVar, int i14, int i15) {
        this.f89965f = pVar;
        this.f89961b = rVar;
        this.f89966g = pVar2;
        this.f89967h = qVar;
        this.f89962c = f14;
        this.f89968i = k3Var;
        this.f89969j = mjVar;
        this.f89963d = i14;
        this.f89964e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f89960a;
        int i15 = this.f89963d;
        Object obj3 = this.f89969j;
        Object obj4 = this.f89968i;
        Object obj5 = this.f89967h;
        Object obj6 = this.f89966g;
        Object obj7 = this.f89965f;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(i15 | 1);
                y.b((e23.p) obj7, this.f89961b, (e23.p) obj6, (e23.q) obj5, this.f89962c, (c2.k3) obj4, (mj) obj3, (p3.m) obj, iT, this.f89964e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(i15 | 1);
                u1.y0.a((t4.d) obj7, (String) obj6, this.f89961b, (h4.d) obj5, (f5.k) obj4, this.f89962c, (o4.e0) obj3, (p3.m) obj, iT2, this.f89964e);
                break;
            default:
                ((Integer) obj2).getClass();
                ww.f.a aVar = ww.f.f187506i;
                int iT3 = p3.p0.t(i15 | 1);
                ((ww.f) obj7).i((c2.t2) obj6, (String) obj5, this.f89961b, (String) obj4, this.f89962c, (h4.d.b) obj3, (p3.m) obj, iT3, this.f89964e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v(t4.d dVar, String str, h4.r rVar, h4.d dVar2, f5.k kVar, float f14, o4.e0 e0Var, int i14, int i15) {
        this.f89965f = dVar;
        this.f89966g = str;
        this.f89961b = rVar;
        this.f89967h = dVar2;
        this.f89968i = kVar;
        this.f89962c = f14;
        this.f89969j = e0Var;
        this.f89963d = i14;
        this.f89964e = i15;
    }

    public /* synthetic */ v(ww.f fVar, c2.t2 t2Var, String str, h4.r rVar, String str2, float f14, h4.d.b bVar, int i14, int i15) {
        this.f89965f = fVar;
        this.f89966g = t2Var;
        this.f89967h = str;
        this.f89961b = rVar;
        this.f89968i = str2;
        this.f89962c = f14;
        this.f89969j = bVar;
        this.f89963d = i14;
        this.f89964e = i15;
    }
}
