package q3;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\n\u000b\fB!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lq3/c;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", FirebaseAnalytics.Param.CONTENT, "", "size", "<init>", "([Ljava/lang/Object;I)V", "c", "a", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<T> implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f142356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f142357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f142358c;

    /* JADX INFO: renamed from: q3.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq3/c$c;", "T", "", "", "list", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Ljava/util/List;I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2672c<T> implements ListIterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<T> f142363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f142364b;

        public C2672c(List<T> list, int i14) {
            this.f142363a = list;
            this.f142364b = i14;
        }

        @Override // java.util.ListIterator
        public final void add(T t7) {
            this.f142363a.add(this.f142364b, t7);
            this.f142364b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f142364b < this.f142363a.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f142364b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i14 = this.f142364b;
            this.f142364b = i14 + 1;
            return this.f142363a.get(i14);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f142364b;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i14 = this.f142364b - 1;
            this.f142364b = i14;
            return this.f142363a.get(i14);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f142364b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i14 = this.f142364b - 1;
            this.f142364b = i14;
            this.f142363a.remove(i14);
        }

        @Override // java.util.ListIterator
        public final void set(T t7) {
            this.f142363a.set(this.f142364b, t7);
        }
    }

    public c(T[] tArr, int i14) {
        this.f142356a = tArr;
        this.f142358c = i14;
    }

    public final void a(int i14, T t7) {
        int i15 = this.f142358c + 1;
        if (this.f142356a.length < i15) {
            m(i15);
        }
        T[] tArr = this.f142356a;
        int i16 = this.f142358c;
        if (i14 != i16) {
            System.arraycopy(tArr, i14, tArr, i14 + 1, i16 - i14);
        }
        tArr[i14] = t7;
        this.f142358c++;
    }

    public final void b(Object obj) {
        int i14 = this.f142358c + 1;
        if (this.f142356a.length < i14) {
            m(i14);
        }
        Object[] objArr = (T[]) this.f142356a;
        int i15 = this.f142358c;
        objArr[i15] = obj;
        this.f142358c = i15 + 1;
    }

    public final void c(int i14, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i15 = this.f142358c + size;
        if (this.f142356a.length < i15) {
            m(i15);
        }
        Object[] objArr = (T[]) this.f142356a;
        int i16 = this.f142358c;
        if (i14 != i16) {
            System.arraycopy(objArr, i14, objArr, i14 + size, i16 - i14);
        }
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            objArr[i14 + i17] = list.get(i17);
        }
        this.f142358c += size;
    }

    public final void d(int i14, c cVar) {
        int i15 = cVar.f142358c;
        if (i15 == 0) {
            return;
        }
        int i16 = this.f142358c + i15;
        if (this.f142356a.length < i16) {
            m(i16);
        }
        T[] tArr = this.f142356a;
        int i17 = this.f142358c;
        if (i14 != i17) {
            System.arraycopy(tArr, i14, tArr, i14 + i15, i17 - i14);
        }
        System.arraycopy(cVar.f142356a, 0, tArr, i14, i15);
        this.f142358c += i15;
    }

    public final boolean e(int i14, Collection<? extends T> collection) {
        int i15 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i16 = this.f142358c + size;
        if (this.f142356a.length < i16) {
            m(i16);
        }
        T[] tArr = this.f142356a;
        int i17 = this.f142358c;
        if (i14 != i17) {
            System.arraycopy(tArr, i14, tArr, i14 + size, i17 - i14);
        }
        for (T t7 : collection) {
            int i18 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            tArr[i15 + i14] = t7;
            i15 = i18;
        }
        this.f142358c += size;
        return true;
    }

    public final List<T> f() {
        a aVar = this.f142357b;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f142357b = aVar2;
        return aVar2;
    }

    public final void g() {
        T[] tArr = this.f142356a;
        int i14 = this.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            tArr[i15] = null;
        }
        this.f142358c = 0;
    }

    public final boolean h(T t7) {
        int i14 = this.f142358c - 1;
        if (i14 >= 0) {
            for (int i15 = 0; !s.g(this.f142356a[i15], t7); i15++) {
                if (i15 != i14) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(T t7) {
        T[] tArr = this.f142356a;
        int i14 = this.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (s.g(t7, tArr[i15])) {
                return i15;
            }
        }
        return -1;
    }

    public final boolean j(T t7) {
        int i14 = i(t7);
        if (i14 < 0) {
            return false;
        }
        k(i14);
        return true;
    }

    public final T k(int i14) {
        T[] tArr = this.f142356a;
        T t7 = tArr[i14];
        int i15 = this.f142358c;
        if (i14 != i15 - 1) {
            int i16 = i14 + 1;
            System.arraycopy(tArr, i16, tArr, i14, i15 - i16);
        }
        int i17 = this.f142358c - 1;
        this.f142358c = i17;
        tArr[i17] = null;
        return t7;
    }

    public final void l(int i14, int i15) {
        if (i15 > i14) {
            int i16 = this.f142358c;
            if (i15 < i16) {
                T[] tArr = this.f142356a;
                System.arraycopy(tArr, i15, tArr, i14, i16 - i15);
            }
            int i17 = this.f142358c;
            int i18 = i17 - (i15 - i14);
            int i19 = i17 - 1;
            if (i18 <= i19) {
                int i24 = i18;
                while (true) {
                    this.f142356a[i24] = null;
                    if (i24 == i19) {
                        break;
                    } else {
                        i24++;
                    }
                }
            }
            this.f142358c = i18;
        }
    }

    public final void m(int i14) {
        T[] tArr = this.f142356a;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i14, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.f142356a = tArr2;
    }

    public final void n(Comparator<T> comparator) {
        T[] tArr = this.f142356a;
        int i14 = this.f142358c;
        tArr.getClass();
        comparator.getClass();
        Arrays.sort(tArr, 0, i14, comparator);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq3/c$a;", "T", "", "Lq3/c;", "vector", "<init>", "(Lq3/c;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements List<T>, f23.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c<T> f142359a;

        public a(c<T> cVar) {
            this.f142359a = cVar;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t7) {
            this.f142359a.b(t7);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            c<T> cVar = this.f142359a;
            return cVar.e(cVar.f142358c, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f142359a.g();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f142359a.h(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            c<T> cVar = this.f142359a;
            cVar.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!cVar.h(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i14) {
            d.a(i14, this);
            return this.f142359a.f142356a[i14];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f142359a.i(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f142359a.f142358c == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new C2672c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            c<T> cVar = this.f142359a;
            T[] tArr = cVar.f142356a;
            for (int i14 = cVar.f142358c - 1; i14 >= 0; i14--) {
                if (s.g(obj, tArr[i14])) {
                    return i14;
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new C2672c(this, 0);
        }

        @Override // java.util.List
        public final T remove(int i14) {
            d.a(i14, this);
            return this.f142359a.k(i14);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            c<T> cVar = this.f142359a;
            cVar.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i14 = cVar.f142358c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                cVar.j(it.next());
            }
            return i14 != cVar.f142358c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            c<T> cVar = this.f142359a;
            int i14 = cVar.f142358c;
            for (int i15 = i14 - 1; -1 < i15; i15--) {
                if (!collection.contains(cVar.f142356a[i15])) {
                    cVar.k(i15);
                }
            }
            return i14 != cVar.f142358c;
        }

        @Override // java.util.List
        public final T set(int i14, T t7) {
            d.a(i14, this);
            T[] tArr = this.f142359a.f142356a;
            T t14 = tArr[i14];
            tArr[i14] = t7;
            return t14;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f142359a.f142358c;
        }

        @Override // java.util.List
        public final List<T> subList(int i14, int i15) {
            d.b(i14, i15, this);
            return new b(this, i14, i15);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return i.c(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) i.d(this, tArr);
        }

        @Override // java.util.List
        public final void add(int i14, T t7) {
            this.f142359a.a(i14, t7);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i14) {
            return new C2672c(this, i14);
        }

        @Override // java.util.List
        public final boolean addAll(int i14, Collection<? extends T> collection) {
            return this.f142359a.e(i14, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f142359a.j(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq3/c$b;", "T", "", "list", "", TtmlNode.START, TtmlNode.END, "<init>", "(Ljava/util/List;II)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements List<T>, f23.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<T> f142360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f142361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f142362c;

        public b(List<T> list, int i14, int i15) {
            this.f142360a = list;
            this.f142361b = i14;
            this.f142362c = i15;
        }

        @Override // java.util.List
        public final void add(int i14, T t7) {
            this.f142360a.add(i14 + this.f142361b, t7);
            this.f142362c++;
        }

        @Override // java.util.List
        public final boolean addAll(int i14, Collection<? extends T> collection) {
            this.f142360a.addAll(i14 + this.f142361b, collection);
            int size = collection.size();
            this.f142362c += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i14 = this.f142362c - 1;
            int i15 = this.f142361b;
            if (i15 <= i14) {
                while (true) {
                    this.f142360a.remove(i14);
                    if (i14 == i15) {
                        break;
                    } else {
                        i14--;
                    }
                }
            }
            this.f142362c = i15;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i14 = this.f142362c;
            for (int i15 = this.f142361b; i15 < i14; i15++) {
                if (s.g(this.f142360a.get(i15), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i14) {
            d.a(i14, this);
            return this.f142360a.get(i14 + this.f142361b);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i14 = this.f142362c;
            int i15 = this.f142361b;
            for (int i16 = i15; i16 < i14; i16++) {
                if (s.g(this.f142360a.get(i16), obj)) {
                    return i16 - i15;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f142362c == this.f142361b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new C2672c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i14 = this.f142362c - 1;
            int i15 = this.f142361b;
            if (i15 > i14) {
                return -1;
            }
            while (!s.g(this.f142360a.get(i14), obj)) {
                if (i14 == i15) {
                    return -1;
                }
                i14--;
            }
            return i14 - i15;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new C2672c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i14 = this.f142362c;
            for (int i15 = this.f142361b; i15 < i14; i15++) {
                List<T> list = this.f142360a;
                if (s.g(list.get(i15), obj)) {
                    list.remove(i15);
                    this.f142362c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int i14 = this.f142362c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i14 != this.f142362c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int i14 = this.f142362c;
            int i15 = i14 - 1;
            int i16 = this.f142361b;
            if (i16 <= i15) {
                while (true) {
                    List<T> list = this.f142360a;
                    if (!collection.contains(list.get(i15))) {
                        list.remove(i15);
                        this.f142362c--;
                    }
                    if (i15 == i16) {
                        break;
                    }
                    i15--;
                }
            }
            return i14 != this.f142362c;
        }

        @Override // java.util.List
        public final T set(int i14, T t7) {
            d.a(i14, this);
            return this.f142360a.set(i14 + this.f142361b, t7);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f142362c - this.f142361b;
        }

        @Override // java.util.List
        public final List<T> subList(int i14, int i15) {
            d.b(i14, i15, this);
            return new b(this, i14, i15);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return i.c(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) i.d(this, tArr);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i14) {
            return new C2672c(this, i14);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t7) {
            int i14 = this.f142362c;
            this.f142362c = i14 + 1;
            this.f142360a.add(i14, t7);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            this.f142360a.addAll(this.f142362c, collection);
            int size = collection.size();
            this.f142362c += size;
            return size > 0;
        }

        @Override // java.util.List
        public final T remove(int i14) {
            d.a(i14, this);
            T tRemove = this.f142360a.remove(i14 + this.f142361b);
            this.f142362c--;
            return tRemove;
        }
    }
}
