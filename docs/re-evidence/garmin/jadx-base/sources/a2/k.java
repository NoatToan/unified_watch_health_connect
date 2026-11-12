package a2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.g2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La2/k;", "La2/j;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f495a = g2.b(0, 16, q53.a.DROP_OLDEST, 1);

    @Override // a2.j
    public final boolean a(h hVar) {
        return this.f495a.d(hVar);
    }

    @Override // a2.j
    public final Object b(h hVar, t13.d<? super Unit> dVar) throws Throwable {
        Object objEmit = this.f495a.emit(hVar, dVar);
        return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
    }

    @Override // a2.i
    public final r53.i c() {
        return this.f495a;
    }
}
