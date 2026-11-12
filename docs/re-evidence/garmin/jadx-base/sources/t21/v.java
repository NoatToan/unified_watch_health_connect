package t21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class v implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<s21.m.c, Unit> f161965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s21.m f161966b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(e23.l<? super s21.m.c, Unit> lVar, s21.m mVar) {
        this.f161965a = lVar;
        this.f161966b = mVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f161965a.invoke((s21.m.c) this.f161966b);
        return Unit.INSTANCE;
    }
}
