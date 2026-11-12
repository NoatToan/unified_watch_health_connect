package t21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class y implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<s21.m.c, Unit> f161977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s21.m f161978b;

    /* JADX WARN: Multi-variable type inference failed */
    public y(e23.l<? super s21.m.c, Unit> lVar, s21.m mVar) {
        this.f161977a = lVar;
        this.f161978b = mVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f161977a.invoke((s21.m.c) this.f161978b);
        return Unit.INSTANCE;
    }
}
