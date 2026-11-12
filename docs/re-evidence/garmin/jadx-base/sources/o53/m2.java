package o53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo53/m2;", "Lt13/g$a;", "Lt13/g$b;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m2 implements t13.g.a, t13.g.b<m2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m2 f129373a = new m2();

    private m2() {
    }

    @Override // t13.g
    public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) t13.g.a.C3052a.a(this, r14, pVar);
    }

    @Override // t13.g
    public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        return (E) t13.g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g.a
    public final t13.g.b<?> getKey() {
        return this;
    }

    @Override // t13.g
    public final t13.g minusKey(t13.g.b<?> bVar) {
        return t13.g.a.C3052a.c(this, bVar);
    }

    @Override // t13.g
    public final t13.g plus(t13.g gVar) {
        return t13.g.a.C3052a.d(gVar, this);
    }
}
