package t13;

import e23.l;
import p005kotlin.Metadata;
import t13.g.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt13/b;", "Lt13/g$a;", "B", "E", "Lt13/g$b;", "baseKey", "Lkotlin/Function1;", "safeCast", "<init>", "(Lt13/g$b;Le23/l;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b<B extends g.a, E extends B> implements g.b<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<g.a, E> f161742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.b<?> f161743b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [t13.g$b<?>] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [e23.l<? super t13.g$a, ? extends E extends B>, e23.l<t13.g$a, E extends B>, java.lang.Object] */
    public b(g.b<B> bVar, l<? super g.a, ? extends E> lVar) {
        bVar.getClass();
        lVar.getClass();
        this.f161742a = lVar;
        this.f161743b = bVar instanceof b ? (g.b<B>) ((b) bVar).f161743b : bVar;
    }
}
