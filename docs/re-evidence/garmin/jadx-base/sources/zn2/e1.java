package zn2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e1 implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Unit> f205490a;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(o53.j<? super Unit> jVar) {
        this.f205490a = jVar;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        Throwable th4 = th3;
        int i14 = o13.q.f128596b;
        th4.getClass();
        this.f205490a.resumeWith(new o13.q.b(th4));
        return Unit.INSTANCE;
    }
}
