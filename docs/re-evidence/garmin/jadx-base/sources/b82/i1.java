package b82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16602a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f16606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f16607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16610i;

    public /* synthetic */ i1(h4.r rVar, zc.d dVar, int i14, int i15, float f14, e23.l lVar, e23.l lVar2, int i16) {
        this.f16603b = rVar;
        this.f16609h = dVar;
        this.f16604c = i14;
        this.f16605d = i15;
        this.f16606e = f14;
        this.f16607f = lVar;
        this.f16610i = lVar2;
        this.f16608g = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16602a) {
            case 0:
                ((Integer) obj2).getClass();
                k1.a((i53.c) this.f16609h, this.f16604c, (h4.r) this.f16603b, (g6.f) this.f16610i, this.f16606e, this.f16607f, (p3.m) obj, p3.p0.t(this.f16605d | 1), this.f16608g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ct1.l.a((h4.r) this.f16603b, (zc.d) this.f16609h, this.f16604c, this.f16605d, this.f16606e, this.f16607f, (e23.l) this.f16610i, (p3.m) obj, p3.p0.t(this.f16608g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                l02.m.a((o53.b0) this.f16609h, (h2.j0) this.f16603b, this.f16604c, (String) this.f16610i, this.f16606e, this.f16607f, (p3.m) obj, p3.p0.t(this.f16605d | 1), this.f16608g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i1(i53.c cVar, int i14, h4.r rVar, g6.f fVar, float f14, e23.l lVar, int i15, int i16) {
        this.f16609h = cVar;
        this.f16604c = i14;
        this.f16603b = rVar;
        this.f16610i = fVar;
        this.f16606e = f14;
        this.f16607f = lVar;
        this.f16605d = i15;
        this.f16608g = i16;
    }

    public /* synthetic */ i1(o53.b0 b0Var, h2.j0 j0Var, int i14, String str, float f14, e23.l lVar, int i15, int i16) {
        this.f16609h = b0Var;
        this.f16603b = j0Var;
        this.f16604c = i14;
        this.f16610i = str;
        this.f16606e = f14;
        this.f16607f = lVar;
        this.f16605d = i15;
        this.f16608g = i16;
    }
}
