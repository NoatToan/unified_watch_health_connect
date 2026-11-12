package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class t implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h4.r f89713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.t0<Boolean> f89714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1<o4.z1> f89715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.d2 f89716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f89717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f89718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f89719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f89720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u1.u f89721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f89722j;

    /* JADX WARN: Multi-variable type inference failed */
    public t(h4.r rVar, s1.t0<Boolean> t0Var, p3.p1<o4.z1> p1Var, u1.d2 d2Var, o4.r1 r1Var, long j8, float f14, float f15, u1.u uVar, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar) {
        this.f89713a = rVar;
        this.f89714b = t0Var;
        this.f89715c = p1Var;
        this.f89716d = d2Var;
        this.f89717e = r1Var;
        this.f89718f = j8;
        this.f89719g = f14;
        this.f89720h = f15;
        this.f89721i = uVar;
        this.f89722j = qVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            y7.a(this.f89713a, this.f89714b, this.f89715c, this.f89716d, this.f89717e, this.f89718f, this.f89719g, this.f89720h, this.f89721i, this.f89722j, mVar2, 384);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
