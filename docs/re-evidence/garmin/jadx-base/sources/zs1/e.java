package zs1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f206859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.t f206860b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(e23.l<? super Long, Unit> lVar, pt1.t tVar) {
        this.f206859a = lVar;
        this.f206860b = tVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f206859a.invoke(Long.valueOf(this.f206860b.f140967a));
        return Unit.INSTANCE;
    }
}
