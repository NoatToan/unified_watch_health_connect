package t21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class z implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<s21.m.c, Unit> f161982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s21.m f161983b;

    /* JADX WARN: Multi-variable type inference failed */
    public z(e23.l<? super s21.m.c, Unit> lVar, s21.m mVar) {
        this.f161982a = lVar;
        this.f161983b = mVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f161982a.invoke((s21.m.c) this.f161983b);
        return Unit.INSTANCE;
    }
}
