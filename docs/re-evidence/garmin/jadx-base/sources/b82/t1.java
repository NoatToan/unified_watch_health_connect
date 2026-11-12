package b82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f16807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f16808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f16810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f16811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f16812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f16813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f16814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.q f16815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16817l;

    public /* synthetic */ t1(y1 y1Var, i53.c cVar, int i14, boolean z14, boolean z15, boolean z16, long j8, long j14, e23.q qVar, int i15, int i16, int i17) {
        this.f16806a = i17;
        this.f16807b = y1Var;
        this.f16808c = cVar;
        this.f16809d = i14;
        this.f16810e = z14;
        this.f16811f = z15;
        this.f16812g = z16;
        this.f16813h = j8;
        this.f16814i = j14;
        this.f16815j = qVar;
        this.f16816k = i15;
        this.f16817l = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16806a;
        int i15 = this.f16816k;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                y1 y1Var = y1.f16902a;
                int iT = p3.p0.t(i15 | 1);
                this.f16807b.c(this.f16808c, this.f16809d, this.f16810e, this.f16811f, this.f16812g, this.f16813h, this.f16814i, this.f16815j, (p3.m) obj, iT, this.f16817l);
                break;
            default:
                ((Integer) obj2).getClass();
                y1 y1Var2 = y1.f16902a;
                int iT2 = p3.p0.t(i15 | 1);
                this.f16807b.a(this.f16808c, this.f16809d, this.f16810e, this.f16811f, this.f16812g, this.f16813h, this.f16814i, this.f16815j, (p3.m) obj, iT2, this.f16817l);
                break;
        }
        return Unit.INSTANCE;
    }
}
