package l3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class c2 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f109202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f109203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f109204c;

    /* JADX WARN: Multi-variable type inference failed */
    public c2(long j8, s5.x0 x0Var, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f109202a = j8;
        this.f109203b = x0Var;
        this.f109204c = pVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            k2.b(this.f109202a, this.f109203b, this.f109204c, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
