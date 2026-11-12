package u53;

import ch.qos.logback.core.CoreConstants;
import o53.f2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu53/a0;", "T", "Lo53/f2;", "value", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0<T> implements f2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f168716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal<T> f168717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f168718c;

    public a0(T t7, ThreadLocal<T> threadLocal) {
        this.f168716a = t7;
        this.f168717b = threadLocal;
        this.f168718c = new b0(threadLocal);
    }

    @Override // o53.f2
    public final Object S() {
        ThreadLocal<T> threadLocal = this.f168717b;
        T t7 = threadLocal.get();
        threadLocal.set(this.f168716a);
        return t7;
    }

    @Override // t13.g
    public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) t13.g.a.C3052a.a(this, r14, pVar);
    }

    @Override // t13.g
    public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        if (p005kotlin.jvm.internal.s.g(this.f168718c, bVar)) {
            return this;
        }
        return null;
    }

    @Override // t13.g.a
    public final t13.g.b<?> getKey() {
        return this.f168718c;
    }

    @Override // t13.g
    public final t13.g minusKey(t13.g.b<?> bVar) {
        return p005kotlin.jvm.internal.s.g(this.f168718c, bVar) ? t13.h.f161748a : this;
    }

    @Override // t13.g
    public final t13.g plus(t13.g gVar) {
        return t13.g.a.C3052a.d(gVar, this);
    }

    @Override // o53.f2
    public final void s(Object obj) {
        this.f168717b.set(obj);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f168716a + ", threadLocal = " + this.f168717b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
