package zn2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d1 implements e23.l<ms2.d, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Unit> f205477a;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(o53.j<? super Unit> jVar) {
        this.f205477a = jVar;
    }

    @Override // e23.l
    public final Unit invoke(ms2.d dVar) {
        int i14 = o13.q.f128596b;
        Unit unit = Unit.INSTANCE;
        this.f205477a.resumeWith(unit);
        return unit;
    }
}
