package f5;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface l2 {
    void a(a aVar);

    boolean b(Object obj, Object obj2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf5/l2$a;", "", "", "Lp1/r0;", "set", "<init>", "(Lp1/r0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Collection<Object>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p1.r0<Object> f69005a;

        public a(p1.r0 r0Var, int i14, p005kotlin.jvm.internal.j jVar) {
            int i15 = 1;
            if ((i14 & 1) != 0) {
                int i16 = p1.d1.f134694a;
                r0Var = new p1.r0(0, i15, null);
            }
            this(r0Var);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.f69005a.b(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f69005a.c();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.f69005a.a(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.f69005a.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.f69005a.f134689g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            p1.r0<Object> r0Var = this.f69005a;
            r0Var.getClass();
            return new p1.s0.a(new p1.s0(r0Var));
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f69005a.g(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return this.f69005a.g(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return this.f69005a.i(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f69005a.f134689g;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return p005kotlin.jvm.internal.i.c(this);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
        }

        public a(p1.r0<Object> r0Var) {
            this.f69005a = r0Var;
        }

        public a() {
            this(null, 1, null);
        }
    }
}
