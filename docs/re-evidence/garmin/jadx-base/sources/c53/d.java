package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc53/d;", "T", "Lc53/j;", "Lc53/e;", "sequence", "", "count", "<init>", "(Lc53/j;I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements j<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f24518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24519b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c53/d$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f24520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24521b;

        public a(d<T> dVar) {
            this.f24520a = dVar.f24518a.iterator();
            this.f24521b = dVar.f24519b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i14 = this.f24521b;
                it = this.f24520a;
                if (i14 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f24521b--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i14 = this.f24521b;
                it = this.f24520a;
                if (i14 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f24521b--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(j<? extends T> jVar, int i14) {
        jVar.getClass();
        this.f24518a = jVar;
        this.f24519b = i14;
        if (i14 >= 0) {
            return;
        }
        vb.h.x(ds.e0.i("count must be non-negative, but was ", i14, '.'));
        throw null;
    }

    @Override // c53.e
    public final j<T> a(int i14) {
        int i15 = this.f24519b;
        int i16 = i15 + i14;
        return i16 < 0 ? new e0(this, i14) : new d0(this.f24518a, i15, i16);
    }

    @Override // c53.e
    public final j<T> b(int i14) {
        int i15 = this.f24519b + i14;
        return i15 < 0 ? new d(this, i14) : new d(this.f24518a, i15);
    }

    @Override // c53.j
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
