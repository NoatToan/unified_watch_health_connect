package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc53/h0;", "T", "R", "Lc53/j;", "sequence", "Lkotlin/Function1;", "transformer", "<init>", "(Lc53/j;Le23/l;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0<T, R> implements j<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f24558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<T, R> f24559b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c53/h0$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<R>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f24560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0<T, R> f24561b;

        public a(h0<T, R> h0Var) {
            this.f24561b = h0Var;
            this.f24560a = h0Var.f24558a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24560a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.f24561b.f24559b.invoke(this.f24560a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(j<? extends T> jVar, e23.l<? super T, ? extends R> lVar) {
        jVar.getClass();
        lVar.getClass();
        this.f24558a = jVar;
        this.f24559b = lVar;
    }

    @Override // c53.j
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
