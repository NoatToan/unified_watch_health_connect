package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class l0 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f88782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f88783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f88784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f88785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f88786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f88787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f88788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f88789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f88790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f88792k;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(a1 a1Var, float f14, float f15, boolean z14, o4.r1 r1Var, long j8, long j14, float f16, float f17, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar) {
        this.f88782a = a1Var;
        this.f88783b = f14;
        this.f88784c = f15;
        this.f88785d = z14;
        this.f88786e = r1Var;
        this.f88787f = j8;
        this.f88788g = j14;
        this.f88789h = f16;
        this.f88790i = f17;
        this.f88791j = pVar;
        this.f88792k = qVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            z0.c(this.f88782a.f87409a, this.f88783b, this.f88784c, this.f88785d, this.f88786e, this.f88787f, this.f88788g, this.f88789h, this.f88790i, this.f88791j, this.f88792k, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
