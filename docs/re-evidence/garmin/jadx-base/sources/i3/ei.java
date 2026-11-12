package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ei implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph f88031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.l f88032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f88033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f88034d;

    public ei(ph phVar, p1.l lVar, p pVar, boolean z14) {
        this.f88031a = phVar;
        this.f88032b = lVar;
        this.f88033c = pVar;
        this.f88034d = z14;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.v.a(s2.f89590a.c(o4.d0.a(this.f88031a.f89336f)), z3.f.c(-596940007, new di(this.f88032b, this.f88033c, this.f88034d), mVar2), mVar2, 56);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
