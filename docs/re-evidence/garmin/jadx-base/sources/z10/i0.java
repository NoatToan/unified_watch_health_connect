package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class i0 implements e23.l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<Boolean> f201037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f201038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd2.m1 f201039c;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(t13.d<? super Boolean> dVar, o53.b0 b0Var, wd2.m1 m1Var) {
        this.f201037a = dVar;
        this.f201038b = b0Var;
        this.f201039c = m1Var;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        t13.d<Boolean> dVar = this.f201037a;
        if (!zBooleanValue) {
            int i14 = o13.q.f128596b;
            dVar.resumeWith(Boolean.FALSE);
        }
        ge1.b.T(this.f201038b, null, null, new h0(this.f201039c, dVar, null), 3);
        return Unit.INSTANCE;
    }
}
