package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class k implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f88644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f88645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f88646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f88647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f88648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f88649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88651k;

    /* JADX WARN: Multi-variable type inference failed */
    public k(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, o4.r1 r1Var, long j8, float f14, long j14, long j15, long j16, e23.p<? super p3.m, ? super Integer, Unit> pVar4, e23.p<? super p3.m, ? super Integer, Unit> pVar5) {
        this.f88641a = pVar;
        this.f88642b = pVar2;
        this.f88643c = pVar3;
        this.f88644d = r1Var;
        this.f88645e = j8;
        this.f88646f = f14;
        this.f88647g = j14;
        this.f88648h = j15;
        this.f88649i = j16;
        this.f88650j = pVar4;
        this.f88651k = pVar5;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(1367541877, new j(this.f88650j, this.f88651k), mVar2);
            n3.o.f123178a.getClass();
            l.a(eVarC, null, this.f88641a, this.f88642b, this.f88643c, this.f88644d, this.f88645e, this.f88646f, k2.e(n3.o.f123179b, mVar2), this.f88647g, this.f88648h, this.f88649i, mVar2, 6);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
