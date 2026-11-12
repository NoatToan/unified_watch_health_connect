package ht1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<us1.d, Unit> f85552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ us1.d f85553b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(e23.l<? super us1.d, Unit> lVar, us1.d dVar) {
        this.f85552a = lVar;
        this.f85553b = dVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f85552a.invoke(this.f85553b);
        return Unit.INSTANCE;
    }
}
