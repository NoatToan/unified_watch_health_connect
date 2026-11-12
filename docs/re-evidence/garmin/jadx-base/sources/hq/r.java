package hq;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class r implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Unit> f85138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85139b;

    /* JADX WARN: Multi-variable type inference failed */
    public r(e23.l<? super Integer, Unit> lVar, int i14) {
        this.f85138a = lVar;
        this.f85139b = i14;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f85138a.invoke(Integer.valueOf(this.f85139b));
        return Unit.INSTANCE;
    }
}
