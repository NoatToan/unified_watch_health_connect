package b82;

import i3.ua;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16460a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f16462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f16463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f16465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16468i;

    public /* synthetic */ b1(d1 d1Var, float f14, int i14, float f15, long j8, long j14, int i15, int i16) {
        this.f16468i = d1Var;
        this.f16462c = f14;
        this.f16464e = i14;
        this.f16465f = f15;
        this.f16461b = j8;
        this.f16463d = j14;
        this.f16466g = i15;
        this.f16467h = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16460a;
        int i15 = this.f16466g;
        Object obj3 = this.f16468i;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                d1 d1Var = d1.f16531a;
                ((d1) obj3).a(this.f16462c, this.f16464e, this.f16465f, this.f16461b, this.f16463d, mVar, p3.p0.t(i15 | 1), this.f16467h);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(i15 | 1);
                float f14 = this.f16462c;
                float f15 = this.f16465f;
                int i16 = this.f16464e;
                int i17 = this.f16467h;
                long j8 = this.f16461b;
                long j14 = this.f16463d;
                ua.a(f14, f15, i16, iT, i17, j8, j14, (h4.r) obj3, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b1(h4.r rVar, long j8, float f14, long j14, int i14, float f15, int i15, int i16) {
        this.f16468i = rVar;
        this.f16461b = j8;
        this.f16462c = f14;
        this.f16463d = j14;
        this.f16464e = i14;
        this.f16465f = f15;
        this.f16466g = i15;
        this.f16467h = i16;
    }
}
