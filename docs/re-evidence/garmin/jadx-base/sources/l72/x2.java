package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111360a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f111361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f111362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f111363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f111364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f111365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f111366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f111367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f111368i;

    public /* synthetic */ x2(h4.r rVar, v21.e eVar, g21.f0 f0Var, float f14, boolean z14, i53.c cVar, int i14, int i15) {
        this.f111361b = rVar;
        this.f111366g = eVar;
        this.f111367h = f0Var;
        this.f111362c = f14;
        this.f111363d = z14;
        this.f111368i = cVar;
        this.f111364e = i14;
        this.f111365f = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f111360a;
        int i15 = this.f111364e;
        Object obj3 = this.f111368i;
        Object obj4 = this.f111367h;
        Object obj5 = this.f111366g;
        switch (i14) {
            case 0:
                e23.p<? super p3.m, ? super Integer, Unit> pVar = (e23.p) obj3;
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                y2 y2Var = y2.f111386a;
                int iT = p3.p0.t(i15 | 1);
                ((y2) obj5).b(this.f111362c, this.f111361b, (e23.p) obj4, pVar, this.f111363d, mVar, iT, this.f111365f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(i15 | 1);
                h4.r rVar = this.f111361b;
                float f14 = this.f111362c;
                boolean z14 = this.f111363d;
                y01.r.a(rVar, (v21.e) obj5, (g21.f0) obj4, f14, z14, (i53.c) obj3, (p3.m) obj, iT2, this.f111365f);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ x2(y2 y2Var, float f14, h4.r rVar, e23.p pVar, e23.p pVar2, boolean z14, int i14, int i15) {
        this.f111366g = y2Var;
        this.f111362c = f14;
        this.f111361b = rVar;
        this.f111367h = pVar;
        this.f111368i = pVar2;
        this.f111363d = z14;
        this.f111364e = i14;
        this.f111365f = i15;
    }
}
