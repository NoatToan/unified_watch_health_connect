package y22;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<x, Unit> f194242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f194243b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(e23.l<? super x, Unit> lVar, x xVar) {
        this.f194242a = lVar;
        this.f194243b = xVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f194242a.invoke(this.f194243b);
        return Unit.INSTANCE;
    }
}
