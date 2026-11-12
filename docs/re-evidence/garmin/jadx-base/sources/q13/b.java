package q13;

import c22.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.MapboxMap;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003\f\r\u000eB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lq13/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lp13/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "b", "c", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b<E> extends p13.f<E> implements List<E>, RandomAccess, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f142102d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E[] f142103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f142104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f142105c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq13/b$c;", "E", "", "Lq13/b;", "list", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Lq13/b;I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c<E> implements ListIterator<E>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<E> f142115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f142116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f142117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f142118d;

        public c(b<E> bVar, int i14) {
            bVar.getClass();
            this.f142115a = bVar;
            this.f142116b = i14;
            this.f142117c = -1;
            this.f142118d = ((AbstractList) bVar).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f142115a).modCount == this.f142118d) {
                return;
            }
            org.apache.commons.lang3.e.h();
        }

        @Override // java.util.ListIterator
        public final void add(E e4) {
            a();
            int i14 = this.f142116b;
            this.f142116b = i14 + 1;
            b<E> bVar = this.f142115a;
            bVar.add(i14, e4);
            this.f142117c = -1;
            this.f142118d = ((AbstractList) bVar).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f142116b < this.f142115a.f142104b;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f142116b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            a();
            int i14 = this.f142116b;
            b<E> bVar = this.f142115a;
            if (i14 >= bVar.f142104b) {
                t.g();
                return null;
            }
            this.f142116b = i14 + 1;
            this.f142117c = i14;
            return bVar.f142103a[i14];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f142116b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            a();
            int i14 = this.f142116b;
            if (i14 <= 0) {
                t.g();
                return null;
            }
            int i15 = i14 - 1;
            this.f142116b = i15;
            this.f142117c = i15;
            return this.f142115a.f142103a[i15];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f142116b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i14 = this.f142117c;
            if (i14 == -1) {
                h.z("Call next() or previous() before removing element from the iterator.");
                return;
            }
            b<E> bVar = this.f142115a;
            bVar.b(i14);
            this.f142116b = this.f142117c;
            this.f142117c = -1;
            this.f142118d = ((AbstractList) bVar).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e4) {
            a();
            int i14 = this.f142117c;
            if (i14 != -1) {
                this.f142115a.set(i14, e4);
            } else {
                h.z("Call next() or previous() before replacing element from the iterator.");
            }
        }
    }

    static {
        new C2669b(null);
        b bVar = new b(0);
        bVar.f142105c = true;
        f142102d = bVar;
    }

    public b(int i14) {
        if (i14 >= 0) {
            this.f142103a = (E[]) new Object[i14];
        } else {
            h.s("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // p13.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF175371h() {
        return this.f142104b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i14, E e4) {
        g();
        p13.c.a aVar = p13.c.f134916a;
        int i15 = this.f142104b;
        aVar.getClass();
        p13.c.a.c(i14, i15);
        ((AbstractList) this).modCount++;
        h(i14, 1);
        this.f142103a[i14] = e4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i14, Collection<? extends E> collection) {
        collection.getClass();
        g();
        p13.c.a aVar = p13.c.f134916a;
        int i15 = this.f142104b;
        aVar.getClass();
        p13.c.a.c(i14, i15);
        int size = collection.size();
        d(i14, collection, size);
        return size > 0;
    }

    @Override // p13.f
    public final E b(int i14) {
        g();
        p13.c.a aVar = p13.c.f134916a;
        int i15 = this.f142104b;
        aVar.getClass();
        p13.c.a.b(i14, i15);
        return i(i14);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        l(0, this.f142104b);
    }

    public final void d(int i14, Collection<? extends E> collection, int i15) {
        ((AbstractList) this).modCount++;
        h(i14, i15);
        Iterator<? extends E> it = collection.iterator();
        for (int i16 = 0; i16 < i15; i16++) {
            this.f142103a[i14 + i16] = it.next();
        }
    }

    public final void e(int i14, E e4) {
        ((AbstractList) this).modCount++;
        h(i14, 1);
        this.f142103a[i14] = e4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.f142103a;
            int i14 = this.f142104b;
            if (i14 == list.size()) {
                for (int i15 = 0; i15 < i14; i15++) {
                    if (s.g(eArr[i15], list.get(i15))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g() {
        if (this.f142105c) {
            com.google.protobuf.a.m();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i14) {
        p13.c.a aVar = p13.c.f134916a;
        int i15 = this.f142104b;
        aVar.getClass();
        p13.c.a.b(i14, i15);
        return this.f142103a[i14];
    }

    public final void h(int i14, int i15) {
        int i16 = this.f142104b + i15;
        if (i16 < 0) {
            com.google.protobuf.a.b();
            return;
        }
        E[] eArr = this.f142103a;
        if (i16 > eArr.length) {
            p13.c.a aVar = p13.c.f134916a;
            int length = eArr.length;
            aVar.getClass();
            int iE = p13.c.a.e(length, i16);
            E[] eArr2 = this.f142103a;
            eArr2.getClass();
            this.f142103a = (E[]) Arrays.copyOf(eArr2, iE);
        }
        E[] eArr3 = this.f142103a;
        p13.s.h(eArr3, eArr3, i14 + i15, i14, this.f142104b);
        this.f142104b += i15;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.f142103a;
        int i14 = this.f142104b;
        int iHashCode = 1;
        for (int i15 = 0; i15 < i14; i15++) {
            E e4 = eArr[i15];
            iHashCode = (iHashCode * 31) + (e4 != null ? e4.hashCode() : 0);
        }
        return iHashCode;
    }

    public final E i(int i14) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.f142103a;
        E e4 = eArr[i14];
        p13.s.h(eArr, eArr, i14, i14 + 1, this.f142104b);
        E[] eArr2 = this.f142103a;
        int i15 = this.f142104b - 1;
        eArr2.getClass();
        eArr2[i15] = null;
        this.f142104b--;
        return e4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i14 = 0; i14 < this.f142104b; i14++) {
            if (s.g(this.f142103a[i14], obj)) {
                return i14;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f142104b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void l(int i14, int i15) {
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.f142103a;
        p13.s.h(eArr, eArr, i14, i14 + i15, this.f142104b);
        E[] eArr2 = this.f142103a;
        int i16 = this.f142104b;
        oi0.c.U(i16 - i15, i16, eArr2);
        this.f142104b -= i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i14 = this.f142104b - 1; i14 >= 0; i14--) {
            if (s.g(this.f142103a[i14], obj)) {
                return i14;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i14) {
        p13.c.a aVar = p13.c.f134916a;
        int i15 = this.f142104b;
        aVar.getClass();
        p13.c.a.c(i14, i15);
        return new c(this, i14);
    }

    public final int m(int i14, int i15, Collection<? extends E> collection, boolean z14) {
        E[] eArr;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            eArr = this.f142103a;
            if (i16 >= i15) {
                break;
            }
            int i18 = i14 + i16;
            if (collection.contains(eArr[i18]) == z14) {
                E[] eArr2 = this.f142103a;
                i16++;
                eArr2[i17 + i14] = eArr2[i18];
                i17++;
            } else {
                i16++;
            }
        }
        int i19 = i15 - i17;
        p13.s.h(eArr, eArr, i14 + i17, i15 + i14, this.f142104b);
        E[] eArr3 = this.f142103a;
        int i24 = this.f142104b;
        oi0.c.U(i24 - i19, i24, eArr3);
        if (i19 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f142104b -= i19;
        return i19;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        g();
        return m(0, this.f142104b, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        g();
        return m(0, this.f142104b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i14, E e4) {
        g();
        p13.c.a aVar = p13.c.f134916a;
        int i15 = this.f142104b;
        aVar.getClass();
        p13.c.a.b(i14, i15);
        E[] eArr = this.f142103a;
        E e14 = eArr[i14];
        eArr[i14] = e4;
        return e14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i14, int i15) {
        p13.c.a aVar = p13.c.f134916a;
        int i16 = this.f142104b;
        aVar.getClass();
        p13.c.a.d(i14, i15, i16);
        return new a(this.f142103a, i14, i15 - i14, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i14 = this.f142104b;
        E[] eArr = this.f142103a;
        if (length < i14) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, 0, i14, tArr.getClass());
            tArr2.getClass();
            return tArr2;
        }
        p13.s.h(eArr, tArr, 0, 0, i14);
        int i15 = this.f142104b;
        if (i15 < tArr.length) {
            tArr[i15] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return oi0.c.i(this.f142103a, 0, this.f142104b, this);
    }

    /* JADX INFO: renamed from: q13.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq13/b$b;", "", "<init>", "()V", "Lq13/b;", "", "Empty", "Lq13/b;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2669b {
        public /* synthetic */ C2669b(j jVar) {
            this();
        }

        private C2669b() {
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public b() {
        this(0, 1, null);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001\u0012BC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lq13/b$a;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lp13/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", MapboxMap.QFE_OFFSET, "length", "parent", "Lq13/b;", "root", "<init>", "([Ljava/lang/Object;IILq13/b$a;Lq13/b;)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<E> extends p13.f<E> implements List<E>, RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public E[] f142106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f142107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f142108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a<E> f142109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b<E> f142110e;

        /* JADX INFO: renamed from: q13.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq13/b$a$a;", "E", "", "Lq13/b$a;", "list", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Lq13/b$a;I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2668a<E> implements ListIterator<E>, f23.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a<E> f142111a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f142112b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f142113c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f142114d;

            public C2668a(a<E> aVar, int i14) {
                aVar.getClass();
                this.f142111a = aVar;
                this.f142112b = i14;
                this.f142113c = -1;
                this.f142114d = ((AbstractList) aVar).modCount;
            }

            public final void a() {
                if (((AbstractList) this.f142111a.f142110e).modCount == this.f142114d) {
                    return;
                }
                org.apache.commons.lang3.e.h();
            }

            @Override // java.util.ListIterator
            public final void add(E e4) {
                a();
                int i14 = this.f142112b;
                this.f142112b = i14 + 1;
                a<E> aVar = this.f142111a;
                aVar.add(i14, e4);
                this.f142113c = -1;
                this.f142114d = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f142112b < this.f142111a.f142108c;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f142112b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                a();
                int i14 = this.f142112b;
                a<E> aVar = this.f142111a;
                if (i14 >= aVar.f142108c) {
                    t.g();
                    return null;
                }
                this.f142112b = i14 + 1;
                this.f142113c = i14;
                return aVar.f142106a[aVar.f142107b + i14];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f142112b;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                a();
                int i14 = this.f142112b;
                if (i14 <= 0) {
                    t.g();
                    return null;
                }
                int i15 = i14 - 1;
                this.f142112b = i15;
                this.f142113c = i15;
                a<E> aVar = this.f142111a;
                return aVar.f142106a[aVar.f142107b + i15];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f142112b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i14 = this.f142113c;
                if (i14 == -1) {
                    h.z("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                a<E> aVar = this.f142111a;
                aVar.b(i14);
                this.f142112b = this.f142113c;
                this.f142113c = -1;
                this.f142114d = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e4) {
                a();
                int i14 = this.f142113c;
                if (i14 != -1) {
                    this.f142111a.set(i14, e4);
                } else {
                    h.z("Call next() or previous() before replacing element from the iterator.");
                }
            }
        }

        public a(E[] eArr, int i14, int i15, a<E> aVar, b<E> bVar) {
            eArr.getClass();
            bVar.getClass();
            this.f142106a = eArr;
            this.f142107b = i14;
            this.f142108c = i15;
            this.f142109d = aVar;
            this.f142110e = bVar;
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }

        @Override // p13.f
        /* JADX INFO: renamed from: a */
        public final int getF175371h() {
            g();
            return this.f142108c;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i14, E e4) {
            h();
            g();
            p13.c.a aVar = p13.c.f134916a;
            int i15 = this.f142108c;
            aVar.getClass();
            p13.c.a.c(i14, i15);
            e(this.f142107b + i14, e4);
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i14, Collection<? extends E> collection) {
            collection.getClass();
            h();
            g();
            p13.c.a aVar = p13.c.f134916a;
            int i15 = this.f142108c;
            aVar.getClass();
            p13.c.a.c(i14, i15);
            int size = collection.size();
            d(this.f142107b + i14, collection, size);
            return size > 0;
        }

        @Override // p13.f
        public final E b(int i14) {
            h();
            g();
            p13.c.a aVar = p13.c.f134916a;
            int i15 = this.f142108c;
            aVar.getClass();
            p13.c.a.b(i14, i15);
            return i(this.f142107b + i14);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            h();
            g();
            l(this.f142107b, this.f142108c);
        }

        public final void d(int i14, Collection<? extends E> collection, int i15) {
            ((AbstractList) this).modCount++;
            b<E> bVar = this.f142110e;
            a<E> aVar = this.f142109d;
            if (aVar != null) {
                aVar.d(i14, collection, i15);
            } else {
                b bVar2 = b.f142102d;
                bVar.d(i14, collection, i15);
            }
            this.f142106a = bVar.f142103a;
            this.f142108c += i15;
        }

        public final void e(int i14, E e4) {
            ((AbstractList) this).modCount++;
            b<E> bVar = this.f142110e;
            a<E> aVar = this.f142109d;
            if (aVar != null) {
                aVar.e(i14, e4);
            } else {
                b bVar2 = b.f142102d;
                bVar.e(i14, e4);
            }
            this.f142106a = bVar.f142103a;
            this.f142108c++;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            g();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                E[] eArr = this.f142106a;
                int i14 = this.f142108c;
                if (i14 == list.size()) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (s.g(eArr[this.f142107b + i15], list.get(i15))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final void g() {
            if (((AbstractList) this.f142110e).modCount == ((AbstractList) this).modCount) {
                return;
            }
            org.apache.commons.lang3.e.h();
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i14) {
            g();
            p13.c.a aVar = p13.c.f134916a;
            int i15 = this.f142108c;
            aVar.getClass();
            p13.c.a.b(i14, i15);
            return this.f142106a[this.f142107b + i14];
        }

        public final void h() {
            if (this.f142110e.f142105c) {
                com.google.protobuf.a.m();
            }
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            g();
            E[] eArr = this.f142106a;
            int i14 = this.f142108c;
            int iHashCode = 1;
            for (int i15 = 0; i15 < i14; i15++) {
                E e4 = eArr[this.f142107b + i15];
                iHashCode = (iHashCode * 31) + (e4 != null ? e4.hashCode() : 0);
            }
            return iHashCode;
        }

        public final E i(int i14) {
            E eI;
            ((AbstractList) this).modCount++;
            a<E> aVar = this.f142109d;
            if (aVar != null) {
                eI = aVar.i(i14);
            } else {
                b bVar = b.f142102d;
                eI = this.f142110e.i(i14);
            }
            this.f142108c--;
            return eI;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            g();
            for (int i14 = 0; i14 < this.f142108c; i14++) {
                if (s.g(this.f142106a[this.f142107b + i14], obj)) {
                    return i14;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            g();
            return this.f142108c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final void l(int i14, int i15) {
            if (i15 > 0) {
                ((AbstractList) this).modCount++;
            }
            a<E> aVar = this.f142109d;
            if (aVar != null) {
                aVar.l(i14, i15);
            } else {
                b bVar = b.f142102d;
                this.f142110e.l(i14, i15);
            }
            this.f142108c -= i15;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            g();
            for (int i14 = this.f142108c - 1; i14 >= 0; i14--) {
                if (s.g(this.f142106a[this.f142107b + i14], obj)) {
                    return i14;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i14) {
            g();
            p13.c.a aVar = p13.c.f134916a;
            int i15 = this.f142108c;
            aVar.getClass();
            p13.c.a.c(i14, i15);
            return new C2668a(this, i14);
        }

        public final int m(int i14, int i15, Collection<? extends E> collection, boolean z14) {
            int iM;
            a<E> aVar = this.f142109d;
            if (aVar != null) {
                iM = aVar.m(i14, i15, collection, z14);
            } else {
                b bVar = b.f142102d;
                iM = this.f142110e.m(i14, i15, collection, z14);
            }
            if (iM > 0) {
                ((AbstractList) this).modCount++;
            }
            this.f142108c -= iM;
            return iM;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            h();
            g();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                b(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            h();
            g();
            return m(this.f142107b, this.f142108c, collection, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            h();
            g();
            return m(this.f142107b, this.f142108c, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i14, E e4) {
            h();
            g();
            p13.c.a aVar = p13.c.f134916a;
            int i15 = this.f142108c;
            aVar.getClass();
            p13.c.a.b(i14, i15);
            E[] eArr = this.f142106a;
            int i16 = this.f142107b + i14;
            E e14 = eArr[i16];
            eArr[i16] = e4;
            return e14;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i14, int i15) {
            p13.c.a aVar = p13.c.f134916a;
            int i16 = this.f142108c;
            aVar.getClass();
            p13.c.a.d(i14, i15, i16);
            return new a(this.f142106a, this.f142107b + i14, i15 - i14, this, this.f142110e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            g();
            int length = tArr.length;
            int i14 = this.f142108c;
            E[] eArr = this.f142106a;
            int i15 = this.f142107b;
            if (length < i14) {
                T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i15, i14 + i15, tArr.getClass());
                tArr2.getClass();
                return tArr2;
            }
            p13.s.h(eArr, tArr, 0, i15, i14 + i15);
            int i16 = this.f142108c;
            if (i16 < tArr.length) {
                tArr[i16] = null;
            }
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            g();
            return oi0.c.i(this.f142106a, this.f142107b, this.f142108c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e4) {
            h();
            g();
            e(this.f142107b + this.f142108c, e4);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> collection) {
            collection.getClass();
            h();
            g();
            int size = collection.size();
            d(this.f142107b + this.f142108c, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            g();
            E[] eArr = this.f142106a;
            int i14 = this.f142108c;
            int i15 = this.f142107b;
            return p13.s.l(i15, i14 + i15, eArr);
        }
    }

    public /* synthetic */ b(int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 10 : i14);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        g();
        int i14 = this.f142104b;
        ((AbstractList) this).modCount++;
        h(i14, 1);
        this.f142103a[i14] = e4;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        g();
        int size = collection.size();
        d(this.f142104b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return p13.s.l(0, this.f142104b, this.f142103a);
    }
}
