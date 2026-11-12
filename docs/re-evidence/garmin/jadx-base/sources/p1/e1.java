package p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/e1;", "E", "", "Lp1/c1;", "parent", "<init>", "(Lp1/c1;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class e1<E> implements Set<E>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1<E> f134710a;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lc53/l;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
    public static final class a extends v13.h implements e23.p<c53.l<? super E>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f134711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long[] f134712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f134713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f134714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f134715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e1<E> f134716f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e1<E> e1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f134716f = e1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f134716f, dVar);
            aVar.f134715e = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((a) create((c53.l) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            int i14;
            Object[] objArr;
            long[] jArr;
            c53.l lVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f134714d;
            if (i15 == 0) {
                o13.r.b(obj);
                c53.l lVar2 = (c53.l) this.f134715e;
                c1<E> c1Var = this.f134716f.f134710a;
                Object[] objArr2 = c1Var.f134684b;
                long[] jArr2 = c1Var.f134685c;
                i14 = c1Var.f134687e;
                objArr = objArr2;
                jArr = jArr2;
                lVar = lVar2;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = this.f134713c;
                jArr = this.f134712b;
                objArr = this.f134711a;
                lVar = (c53.l) this.f134715e;
                o13.r.b(obj);
            }
            while (i14 != Integer.MAX_VALUE) {
                int i16 = (int) ((jArr[i14] >> 31) & 2147483647L);
                Object obj2 = objArr[i14];
                this.f134715e = lVar;
                this.f134711a = objArr;
                this.f134712b = jArr;
                this.f134713c = i16;
                this.f134714d = 1;
                if (lVar.a(obj2, this) == aVar) {
                    return aVar;
                }
                i14 = i16;
            }
            return Unit.INSTANCE;
        }
    }

    public e1(c1<E> c1Var) {
        c1Var.getClass();
        this.f134710a = c1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f134710a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f134710a.a((E) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f134710a.equals(((e1) obj).f134710a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f134710a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f134710a.f134689g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return c53.n.a(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f134710a.f134689g;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    public final String toString() {
        return this.f134710a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }
}
