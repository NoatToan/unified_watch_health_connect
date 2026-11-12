package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class c7 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f87719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f87720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f87721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f87722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87723e;

    /* JADX WARN: Multi-variable type inference failed */
    public c7(long j8, s5.x0 x0Var, float f14, float f15, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f87719a = j8;
        this.f87720b = x0Var;
        this.f87721c = f14;
        this.f87722d = f15;
        this.f87723e = pVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            l3.k.b(this.f87719a, this.f87720b, z3.f.c(-1767363041, new b7(this.f87721c, this.f87722d, this.f87723e), mVar2), mVar2, 384);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
