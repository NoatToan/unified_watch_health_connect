package y22;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class t implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f194315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<w> f194316b;

    public t(w wVar, p1<w> p1Var) {
        this.f194315a = wVar;
        this.f194316b = p1Var;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f194316b.setValue(this.f194315a);
        return Unit.INSTANCE;
    }
}
