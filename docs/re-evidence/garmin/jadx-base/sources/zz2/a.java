package zz2;

import c2.x2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class a implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f207643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f207644b;

    public a(float f14, float f15) {
        this.f207643a = f14;
        this.f207644b = f15;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        if ((num.intValue() & 11) == 2 && mVar2.b()) {
            mVar2.e();
        } else {
            c2.q.a(x2.r(h4.r.S, this.f207643a, this.f207644b), mVar2, 0);
        }
        return Unit.INSTANCE;
    }
}
