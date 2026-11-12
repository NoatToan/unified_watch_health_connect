package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc53/e0;", "T", "Lc53/j;", "Lc53/e;", "sequence", "", "count", "<init>", "(Lc53/j;I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0<T> implements j<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f24528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24529b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c53/e0$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f24531b;

        public a(e0<T> e0Var) {
            this.f24530a = e0Var.f24529b;
            this.f24531b = e0Var.f24528a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24530a > 0 && this.f24531b.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            int i14 = this.f24530a;
            if (i14 != 0) {
                this.f24530a = i14 - 1;
                return this.f24531b.next();
            }
            c22.t.g();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(j<? extends T> jVar, int i14) {
        jVar.getClass();
        this.f24528a = jVar;
        this.f24529b = i14;
        if (i14 >= 0) {
            return;
        }
        vb.h.x(ds.e0.i("count must be non-negative, but was ", i14, '.'));
        throw null;
    }

    @Override // c53.e
    public final j<T> a(int i14) {
        return i14 >= this.f24529b ? this : new e0(this.f24528a, i14);
    }

    @Override // c53.e
    public final j<T> b(int i14) {
        int i15 = this.f24529b;
        return i14 >= i15 ? f.f24532a : new d0(this.f24528a, i14, i15);
    }

    @Override // c53.j
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
