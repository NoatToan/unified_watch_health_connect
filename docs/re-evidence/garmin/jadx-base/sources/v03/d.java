package v03;

import q03.p;
import q03.t;

/* JADX INFO: loaded from: classes3.dex */
public enum d implements x03.c<Object> {
    INSTANCE,
    /* JADX INFO: Fake field, exist only in values array */
    NEVER;

    public static void a(p<?> pVar) {
        pVar.a(INSTANCE);
        pVar.onComplete();
    }

    public static void c(Throwable th3, q03.d dVar) {
        dVar.a(INSTANCE);
        dVar.onError(th3);
    }

    public static void d(Throwable th3, p<?> pVar) {
        pVar.a(INSTANCE);
        pVar.onError(th3);
    }

    public static void f(Throwable th3, t<?> tVar) {
        tVar.a(INSTANCE);
        tVar.onError(th3);
    }

    @Override // s03.b
    public final boolean b() {
        return this == INSTANCE;
    }

    @Override // x03.h
    public final void clear() {
    }

    @Override // s03.b
    public final void dispose() {
    }

    @Override // x03.d
    public final int e() {
        return 2;
    }

    @Override // x03.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // x03.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // x03.h
    public final Object poll() {
        return null;
    }
}
