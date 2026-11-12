package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s3 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89592a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f89593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f89594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f89596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f89597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f89598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f89599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f89600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f89601j;

    public /* synthetic */ s3(h4.r rVar, e23.p pVar, e23.p pVar2, e23.p pVar3, b3 b3Var, s5.x0 x0Var, float f14, z3.e eVar, int i14) {
        this.f89593b = rVar;
        this.f89596e = pVar;
        this.f89597f = pVar2;
        this.f89598g = pVar3;
        this.f89599h = b3Var;
        this.f89600i = x0Var;
        this.f89594c = f14;
        this.f89601j = eVar;
        this.f89595d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f89592a) {
            case 0:
                ((Integer) obj2).getClass();
                x3.a(this.f89593b, (e23.p) this.f89596e, (e23.p) this.f89597f, (e23.p) this.f89598g, (b3) this.f89599h, (s5.x0) this.f89600i, this.f89594c, (z3.e) this.f89601j, (p3.m) obj, p3.p0.t(this.f89595d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                m92.w.a(this.f89593b, (i53.c) this.f89596e, (Float) this.f89597f, this.f89594c, (m92.h0.e.d) this.f89598g, (g6.f) this.f89599h, (Float) this.f89600i, (Float) this.f89601j, (p3.m) obj, p3.p0.t(this.f89595d | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s3(h4.r rVar, i53.c cVar, Float f14, float f15, m92.h0.e.d dVar, g6.f fVar, Float f16, Float f17, int i14) {
        this.f89593b = rVar;
        this.f89596e = cVar;
        this.f89597f = f14;
        this.f89594c = f15;
        this.f89598g = dVar;
        this.f89599h = fVar;
        this.f89600i = f16;
        this.f89601j = f17;
        this.f89595d = i14;
    }
}
