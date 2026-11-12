package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc53/g0;", "T", "R", "Lc53/j;", "sequence", "Lkotlin/Function2;", "", "transformer", "<init>", "(Lc53/j;Le23/p;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0<T, R> implements j<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f24546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<Integer, T, R> f24547b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c53/g0$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<R>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f24548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g0<T, R> f24550c;

        public a(g0<T, R> g0Var) {
            this.f24550c = g0Var;
            this.f24548a = g0Var.f24546a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24548a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            e23.p<Integer, T, R> pVar = this.f24550c.f24547b;
            int i14 = this.f24549b;
            this.f24549b = i14 + 1;
            if (i14 >= 0) {
                return (R) pVar.invoke(Integer.valueOf(i14), this.f24548a.next());
            }
            p13.x.q();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(j<? extends T> jVar, e23.p<? super Integer, ? super T, ? extends R> pVar) {
        jVar.getClass();
        pVar.getClass();
        this.f24546a = jVar;
        this.f24547b = pVar;
    }

    @Override // c53.j
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
