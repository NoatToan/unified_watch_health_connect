package kf;

import e23.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkf/g;", "Lt13/g;", "delegate", "<init>", "(Lt13/g;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class g implements t13.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f104581a;

    public g(t13.g gVar) {
        this.f104581a = gVar;
    }

    public abstract e b(g gVar, t13.g gVar2);

    public final boolean equals(Object obj) {
        return s.g(this.f104581a, obj);
    }

    @Override // t13.g
    public final <R> R fold(R r14, p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) this.f104581a.fold(r14, pVar);
    }

    @Override // t13.g
    public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        return (E) this.f104581a.get(bVar);
    }

    public final int hashCode() {
        return this.f104581a.hashCode();
    }

    @Override // t13.g
    public final t13.g minusKey(t13.g.b<?> bVar) {
        return b(this, this.f104581a.minusKey(bVar));
    }

    @Override // t13.g
    public final t13.g plus(t13.g gVar) {
        return b(this, this.f104581a.plus(gVar));
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f104581a + ")";
    }
}
