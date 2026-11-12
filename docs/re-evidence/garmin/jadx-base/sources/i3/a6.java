package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class a6 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b6 f87426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f87427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f87428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.t0<Boolean> f87429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.p1<o4.z1> f87430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1.d2 f87431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f87432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f87433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f87434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f87435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u1.u f87436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f87437l;

    /* JADX WARN: Multi-variable type inference failed */
    public a6(b6 b6Var, h4.r rVar, boolean z14, s1.t0<Boolean> t0Var, p3.p1<o4.z1> p1Var, u1.d2 d2Var, o4.r1 r1Var, long j8, float f14, float f15, u1.u uVar, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar) {
        this.f87426a = b6Var;
        this.f87427b = rVar;
        this.f87428c = z14;
        this.f87429d = t0Var;
        this.f87430e = p1Var;
        this.f87431f = d2Var;
        this.f87432g = r1Var;
        this.f87433h = j8;
        this.f87434i = f14;
        this.f87435j = f15;
        this.f87436k = uVar;
        this.f87437l = qVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            y7.a(this.f87426a.b(this.f87427b, this.f87428c), this.f87429d, this.f87430e, this.f87431f, this.f87432g, this.f87433h, this.f87434i, this.f87435j, this.f87436k, this.f87437l, mVar2, 384);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
