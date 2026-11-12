package p13;

import com.google.firebase.analytics.FirebaseAnalytics;
import i3.e5;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lp13/c;", "E", "Lp13/a;", "", "<init>", "()V", "d", "b", "c", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c<E> extends p13.a<E> implements List<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f134916a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp13/c$b;", "", "<init>", "(Lp13/c;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public class b implements Iterator<E>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134917a;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f134917a < c.this.getF97116d();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                c22.t.g();
                return null;
            }
            int i14 = this.f134917a;
            this.f134917a = i14 + 1;
            return c.this.get(i14);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: p13.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0004\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp13/c$c;", "Lp13/c$b;", "Lp13/c;", "", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Lp13/c;I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public class C2563c extends c<E>.b implements ListIterator<E> {
        public C2563c(int i14) {
            super();
            a aVar = c.f134916a;
            int f134922d = c.this.getF97116d();
            aVar.getClass();
            a.c(i14, f134922d);
            this.f134917a = i14;
        }

        @Override // java.util.ListIterator
        public final void add(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f134917a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f134917a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                c22.t.g();
                return null;
            }
            int i14 = this.f134917a - 1;
            this.f134917a = i14;
            return c.this.get(i14);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f134917a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lp13/c$d;", "E", "Lp13/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "fromIndex", "toIndex", "<init>", "(Lp13/c;II)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d<E> extends c<E> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c<E> f134920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f134921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f134922d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> cVar, int i14, int i15) {
            cVar.getClass();
            this.f134920b = cVar;
            this.f134921c = i14;
            int f134922d = cVar.getF97116d();
            c.f134916a.getClass();
            a.d(i14, i15, f134922d);
            this.f134922d = i15 - i14;
        }

        @Override // p13.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF97116d() {
            return this.f134922d;
        }

        @Override // java.util.List
        public final E get(int i14) {
            c.f134916a.getClass();
            a.b(i14, this.f134922d);
            return this.f134920b.get(this.f134921c + i14);
        }

        @Override // p13.c, java.util.List, i53.c
        public final List<E> subList(int i14, int i15) {
            c.f134916a.getClass();
            a.d(i14, i15, this.f134922d);
            int i16 = this.f134921c;
            return new d(this.f134920b, i14 + i16, i16 + i15);
        }
    }

    @Override // java.util.List
    public final void add(int i14, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i14, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        f134916a.getClass();
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it3 = iterator();
            while (it3.hasNext()) {
                if (!p005kotlin.jvm.internal.s.g(it3.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        f134916a.getClass();
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (p005kotlin.jvm.internal.s.g(it.next(), obj)) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (p005kotlin.jvm.internal.s.g(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C2563c(0);
    }

    @Override // java.util.List
    public final E remove(int i14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i14, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i14, int i15) {
        return new d(this, i14, i15);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp13/c$a;", "", "<init>", "()V", "", "maxArraySize", "I", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(int i14, int i15, int i16) {
            if (i14 < 0 || i15 > i16) {
                l2.j(i16, e5.j(i14, i15, "startIndex: ", ", endIndex: ", ", size: "));
            } else {
                if (i14 <= i15) {
                    return;
                }
                vb.h.s(tn.k.e(i14, i15, "startIndex: ", " > endIndex: "));
            }
        }

        public static void b(int i14, int i15) {
            if (i14 < 0 || i14 >= i15) {
                org.apache.commons.lang3.e.v(tn.k.e(i14, i15, "index: ", ", size: "));
            }
        }

        public static void c(int i14, int i15) {
            if (i14 < 0 || i14 > i15) {
                org.apache.commons.lang3.e.v(tn.k.e(i14, i15, "index: ", ", size: "));
            }
        }

        public static void d(int i14, int i15, int i16) {
            if (i14 < 0 || i15 > i16) {
                l2.j(i16, e5.j(i14, i15, "fromIndex: ", ", toIndex: ", ", size: "));
            } else {
                if (i14 <= i15) {
                    return;
                }
                vb.h.s(tn.k.e(i14, i15, "fromIndex: ", " > toIndex: "));
            }
        }

        public static int e(int i14, int i15) {
            int i16 = i14 + (i14 >> 1);
            if (i16 - i15 < 0) {
                i16 = i15;
            }
            if (i16 - 2147483639 > 0) {
                return i15 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i16;
        }

        private a() {
        }
    }

    public ListIterator<E> listIterator(int i14) {
        return new C2563c(i14);
    }
}
