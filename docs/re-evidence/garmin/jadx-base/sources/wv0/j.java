package wv0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f187434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pv0.d f187435b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(e23.l<? super Long, Unit> lVar, pv0.d dVar) {
        this.f187434a = lVar;
        this.f187435b = dVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f187434a.invoke(Long.valueOf(this.f187435b.f141358a));
        return Unit.INSTANCE;
    }
}
