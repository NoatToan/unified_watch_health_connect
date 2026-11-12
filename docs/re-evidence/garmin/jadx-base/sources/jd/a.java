package jd;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljd/a;", "Lt13/g$a;", "Lt13/g$b;", Action.KEY_ATTRIBUTE, "Ljd/r;", "connectionWrapper", "<init>", "(Lt13/g$b;Ljd/r;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements t13.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g.b<a> f98186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f98187b;

    public a(t13.g.b<a> bVar, r rVar) {
        bVar.getClass();
        rVar.getClass();
        this.f98186a = bVar;
        this.f98187b = rVar;
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
    public final t13.g.b<a> getKey() {
        return this.f98186a;
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
