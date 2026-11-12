package o53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo53/a2;", "Lo53/o1;", "Lt13/d;", "", "continuation", "<init>", "(Lt13/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a2 extends o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t13.d<Unit> f129305e;

    /* JADX WARN: Multi-variable type inference failed */
    public a2(t13.d<? super Unit> dVar) {
        this.f129305e = dVar;
    }

    @Override // o53.o1
    public final boolean i() {
        return false;
    }

    @Override // o53.o1
    public final void j(Throwable th3) {
        int i14 = o13.q.f128596b;
        this.f129305e.resumeWith(Unit.INSTANCE);
    }
}
