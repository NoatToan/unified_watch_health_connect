package t13;

import ch.qos.logback.core.joran.action.Action;
import e23.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt13/a;", "Lt13/g$a;", "Lt13/g$b;", Action.KEY_ATTRIBUTE, "<init>", "(Lt13/g$b;)V", "Lt13/g$b;", "getKey", "()Lt13/g$b;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements g.a {
    private final g.b<?> key;

    public a(g.b<?> bVar) {
        bVar.getClass();
        this.key = bVar;
    }

    @Override // t13.g
    public /* bridge */ <R> R fold(R r14, p<? super R, ? super g.a, ? extends R> pVar) {
        return (R) g.a.C3052a.a(this, r14, pVar);
    }

    @Override // t13.g
    public /* bridge */ <E extends g.a> E get(g.b<E> bVar) {
        return (E) g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g.a
    public g.b<?> getKey() {
        return this.key;
    }

    @Override // t13.g
    public /* bridge */ g minusKey(g.b<?> bVar) {
        return g.a.C3052a.c(this, bVar);
    }

    @Override // t13.g
    public /* bridge */ g plus(g gVar) {
        return g.a.C3052a.d(gVar, this);
    }
}
