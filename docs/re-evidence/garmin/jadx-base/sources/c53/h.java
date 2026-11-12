package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc53/h;", "T", "R", "E", "Lc53/j;", "sequence", "Lkotlin/Function1;", "transformer", "", "iterator", "<init>", "(Lc53/j;Le23/l;Le23/l;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h<T, R, E> implements j<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f24551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<T, R> f24552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<R, Iterator<E>> f24553c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c53/h$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<E>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f24554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<? extends E> f24555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h<T, R, E> f24557d;

        public a(h<T, R, E> hVar) {
            this.f24557d = hVar;
            this.f24554a = hVar.f24551a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it;
            Iterator<? extends E> it3 = this.f24555b;
            if (it3 != null && it3.hasNext()) {
                this.f24556c = 1;
                return true;
            }
            do {
                Iterator<T> it4 = this.f24554a;
                if (!it4.hasNext()) {
                    this.f24556c = 2;
                    this.f24555b = null;
                    return false;
                }
                T next = it4.next();
                h<T, R, E> hVar = this.f24557d;
                it = (Iterator) hVar.f24553c.invoke(hVar.f24552b.invoke(next));
            } while (!it.hasNext());
            this.f24555b = it;
            this.f24556c = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i14 = this.f24556c;
            if (i14 == 1) {
                return true;
            }
            if (i14 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i14 = this.f24556c;
            if (i14 == 2) {
                c22.t.g();
                return null;
            }
            if (i14 == 0 && !a()) {
                c22.t.g();
                return null;
            }
            this.f24556c = 0;
            Iterator<? extends E> it = this.f24555b;
            it.getClass();
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(j<? extends T> jVar, e23.l<? super T, ? extends R> lVar, e23.l<? super R, ? extends Iterator<? extends E>> lVar2) {
        jVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        this.f24551a = jVar;
        this.f24552b = lVar;
        this.f24553c = lVar2;
    }

    @Override // c53.j
    public final Iterator<E> iterator() {
        return new a(this);
    }
}
