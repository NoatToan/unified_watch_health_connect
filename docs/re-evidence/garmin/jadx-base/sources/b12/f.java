package b12;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f implements l<p007l6.d, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p007l6.e f14401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14402b;

    public f(p007l6.e eVar, float f14) {
        this.f14401a = eVar;
        this.f14402b = f14;
    }

    @Override // e23.l
    public final Unit invoke(p007l6.d dVar) {
        p007l6.d dVar2 = dVar;
        dVar2.getClass();
        float f14 = this.f14402b / 2.0f;
        g6.f.a aVar = g6.f.f75994b;
        p6.a aVar2 = new p6.a(new char[0]);
        aVar2.g(p6.h.g(this.f14401a.f110465b.toString()));
        aVar2.g(new p6.f(135.0f));
        aVar2.g(new p6.f(f14 * 0.97f));
        dVar2.f110449b.u("circular", aVar2);
        return Unit.INSTANCE;
    }
}
