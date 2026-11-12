package p1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import i3.e5;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u0007\b\tB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lp1/q0;", "E", "Lp1/a1;", "", "initialCapacity", "<init>", "(I)V", "a", "b", "c", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q0<E> extends a1<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b<E> f134799c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp1/q0$a;", "T", "", "", "list", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Ljava/util/List;I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements ListIterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<T> f134800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f134801b;

        public a(List<T> list, int i14) {
            list.getClass();
            this.f134800a = list;
            this.f134801b = i14 - 1;
        }

        @Override // java.util.ListIterator
        public final void add(T t7) {
            int i14 = this.f134801b + 1;
            this.f134801b = i14;
            this.f134800a.add(i14, t7);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f134801b < this.f134800a.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f134801b >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i14 = this.f134801b + 1;
            this.f134801b = i14;
            return this.f134800a.get(i14);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f134801b + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i14 = this.f134801b;
            this.f134801b = i14 - 1;
            return this.f134800a.get(i14);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f134801b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f134800a.remove(this.f134801b);
            this.f134801b--;
        }

        @Override // java.util.ListIterator
        public final void set(T t7) {
            this.f134800a.set(this.f134801b, t7);
        }
    }

    public /* synthetic */ q0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 16 : i14);
    }

    public final void g(Object obj) {
        int i14 = this.f134668b + 1;
        Object[] objArr = this.f134667a;
        if (objArr.length < i14) {
            n(i14, objArr);
        }
        Object[] objArr2 = this.f134667a;
        int i15 = this.f134668b;
        objArr2[i15] = obj;
        this.f134668b = i15 + 1;
    }

    public final void h(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i14 = this.f134668b;
        int size = list.size() + i14;
        Object[] objArr = this.f134667a;
        if (objArr.length < size) {
            n(size, objArr);
        }
        Object[] objArr2 = this.f134667a;
        int size2 = list.size();
        for (int i15 = 0; i15 < size2; i15++) {
            objArr2[i15 + i14] = list.get(i15);
        }
        this.f134668b = list.size() + this.f134668b;
    }

    public final void i(a1 a1Var) {
        a1Var.getClass();
        if (a1Var.d()) {
            return;
        }
        int i14 = this.f134668b + a1Var.f134668b;
        Object[] objArr = this.f134667a;
        if (objArr.length < i14) {
            n(i14, objArr);
        }
        p13.s.h(a1Var.f134667a, this.f134667a, this.f134668b, 0, a1Var.f134668b);
        this.f134668b += a1Var.f134668b;
    }

    public final void j() {
        p13.s.m(0, this.f134668b, null, this.f134667a);
        this.f134668b = 0;
    }

    public final boolean k(E e4) {
        int iC = c(e4);
        if (iC < 0) {
            return false;
        }
        l(iC);
        return true;
    }

    public final E l(int i14) {
        int i15;
        if (i14 < 0 || i14 >= (i15 = this.f134668b)) {
            f(i14);
            throw null;
        }
        Object[] objArr = this.f134667a;
        E e4 = (E) objArr[i14];
        if (i14 != i15 - 1) {
            p13.s.h(objArr, objArr, i14, i14 + 1, i15);
        }
        int i16 = this.f134668b - 1;
        this.f134668b = i16;
        objArr[i16] = null;
        return e4;
    }

    public final void m(int i14, int i15) {
        int i16;
        if (i14 < 0 || i14 > (i16 = this.f134668b) || i15 < 0 || i15 > i16) {
            l2.j(this.f134668b, e5.j(i14, i15, "Start (", ") and end (", ") must be in 0.."));
            return;
        }
        if (i15 < i14) {
            throw new IllegalArgumentException("Start (" + i14 + ") is more than end (" + i15 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (i15 != i14) {
            if (i15 < i16) {
                Object[] objArr = this.f134667a;
                p13.s.h(objArr, objArr, i14, i15, i16);
            }
            int i17 = this.f134668b;
            int i18 = i17 - (i15 - i14);
            p13.s.m(i18, i17, null, this.f134667a);
            this.f134668b = i18;
        }
    }

    public final void n(int i14, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i14, (length * 3) / 2)];
        p13.s.h(objArr, objArr2, 0, 0, length);
        this.f134667a = objArr2;
    }

    public final void o(int i14) {
        StringBuilder sbI = b71.i.i(i14, "Index ", " must be in 0..");
        sbI.append(this.f134668b);
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/q0$b;", "T", "", "Lp1/q0;", "objectList", "<init>", "(Lp1/q0;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements List<T>, f23.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0<T> f134802a;

        public b(q0<T> q0Var) {
            q0Var.getClass();
            this.f134802a = q0Var;
        }

        @Override // java.util.List
        public final void add(int i14, T t7) {
            int i15;
            q0<T> q0Var = this.f134802a;
            if (i14 < 0 || i14 > (i15 = q0Var.f134668b)) {
                q0Var.o(i14);
                throw null;
            }
            int i16 = i15 + 1;
            Object[] objArr = q0Var.f134667a;
            if (objArr.length < i16) {
                q0Var.n(i16, objArr);
            }
            Object[] objArr2 = q0Var.f134667a;
            int i17 = q0Var.f134668b;
            if (i14 != i17) {
                p13.s.h(objArr2, objArr2, i14 + 1, i14, i17);
            }
            objArr2[i14] = t7;
            q0Var.f134668b++;
        }

        @Override // java.util.List
        public final boolean addAll(int i14, Collection<? extends T> collection) {
            collection.getClass();
            q0<T> q0Var = this.f134802a;
            if (i14 < 0 || i14 > q0Var.f134668b) {
                q0Var.o(i14);
                throw null;
            }
            int i15 = 0;
            if (collection.isEmpty()) {
                return false;
            }
            int size = collection.size() + q0Var.f134668b;
            Object[] objArr = q0Var.f134667a;
            if (objArr.length < size) {
                q0Var.n(size, objArr);
            }
            Object[] objArr2 = q0Var.f134667a;
            if (i14 != q0Var.f134668b) {
                p13.s.h(objArr2, objArr2, collection.size() + i14, i14, q0Var.f134668b);
            }
            for (T t7 : collection) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                objArr2[i15 + i14] = t7;
                i15 = i16;
            }
            q0Var.f134668b = collection.size() + q0Var.f134668b;
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f134802a.j();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f134802a.c(obj) >= 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            collection.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (this.f134802a.c(it.next()) < 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i14) {
            b1.a(i14, this);
            return this.f134802a.b(i14);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f134802a.c(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f134802a.d();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            q0<T> q0Var = this.f134802a;
            Object[] objArr = q0Var.f134667a;
            int i14 = q0Var.f134668b;
            if (obj == null) {
                for (int i15 = i14 - 1; -1 < i15; i15--) {
                    if (objArr[i15] == null) {
                        return i15;
                    }
                }
            } else {
                for (int i16 = i14 - 1; -1 < i16; i16--) {
                    if (obj.equals(objArr[i16])) {
                        return i16;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final T remove(int i14) {
            b1.a(i14, this);
            return this.f134802a.l(i14);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            collection.getClass();
            q0<T> q0Var = this.f134802a;
            int i14 = q0Var.f134668b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                q0Var.k(it.next());
            }
            return i14 != q0Var.f134668b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            collection.getClass();
            q0<T> q0Var = this.f134802a;
            int i14 = q0Var.f134668b;
            Object[] objArr = q0Var.f134667a;
            for (int i15 = i14 - 1; -1 < i15; i15--) {
                if (!collection.contains(objArr[i15])) {
                    q0Var.l(i15);
                }
            }
            return i14 != q0Var.f134668b;
        }

        @Override // java.util.List
        public final T set(int i14, T t7) {
            b1.a(i14, this);
            q0<T> q0Var = this.f134802a;
            if (i14 < 0 || i14 >= q0Var.f134668b) {
                q0Var.f(i14);
                throw null;
            }
            Object[] objArr = q0Var.f134667a;
            T t14 = (T) objArr[i14];
            objArr[i14] = t7;
            return t14;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f134802a.f134668b;
        }

        @Override // java.util.List
        public final List<T> subList(int i14, int i15) {
            b1.b(i14, i15, this);
            return new c(this, i14, i15);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i14) {
            return new a(this, i14);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return p005kotlin.jvm.internal.i.c(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f134802a.k(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t7) {
            this.f134802a.g(t7);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            collection.getClass();
            q0<T> q0Var = this.f134802a;
            int i14 = q0Var.f134668b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                q0Var.g(it.next());
            }
            return i14 != q0Var.f134668b;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp1/q0$c;", "T", "", "list", "", TtmlNode.START, TtmlNode.END, "<init>", "(Ljava/util/List;II)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c<T> implements List<T>, f23.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<T> f134803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f134804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f134805c;

        public c(List<T> list, int i14, int i15) {
            list.getClass();
            this.f134803a = list;
            this.f134804b = i14;
            this.f134805c = i15;
        }

        @Override // java.util.List
        public final void add(int i14, T t7) {
            this.f134803a.add(i14 + this.f134804b, t7);
            this.f134805c++;
        }

        @Override // java.util.List
        public final boolean addAll(int i14, Collection<? extends T> collection) {
            collection.getClass();
            this.f134803a.addAll(i14 + this.f134804b, collection);
            this.f134805c = collection.size() + this.f134805c;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i14 = this.f134805c - 1;
            int i15 = this.f134804b;
            if (i15 <= i14) {
                while (true) {
                    this.f134803a.remove(i14);
                    if (i14 == i15) {
                        break;
                    } else {
                        i14--;
                    }
                }
            }
            this.f134805c = i15;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i14 = this.f134805c;
            for (int i15 = this.f134804b; i15 < i14; i15++) {
                if (p005kotlin.jvm.internal.s.g(this.f134803a.get(i15), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            collection.getClass();
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
            b1.a(i14, this);
            return this.f134803a.get(i14 + this.f134804b);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i14 = this.f134805c;
            int i15 = this.f134804b;
            for (int i16 = i15; i16 < i14; i16++) {
                if (p005kotlin.jvm.internal.s.g(this.f134803a.get(i16), obj)) {
                    return i16 - i15;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f134805c == this.f134804b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i14 = this.f134805c - 1;
            int i15 = this.f134804b;
            if (i15 > i14) {
                return -1;
            }
            while (!p005kotlin.jvm.internal.s.g(this.f134803a.get(i14), obj)) {
                if (i14 == i15) {
                    return -1;
                }
                i14--;
            }
            return i14 - i15;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i14 = this.f134805c;
            for (int i15 = this.f134804b; i15 < i14; i15++) {
                List<T> list = this.f134803a;
                if (p005kotlin.jvm.internal.s.g(list.get(i15), obj)) {
                    list.remove(i15);
                    this.f134805c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            collection.getClass();
            int i14 = this.f134805c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i14 != this.f134805c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            collection.getClass();
            int i14 = this.f134805c;
            int i15 = i14 - 1;
            int i16 = this.f134804b;
            if (i16 <= i15) {
                while (true) {
                    List<T> list = this.f134803a;
                    if (!collection.contains(list.get(i15))) {
                        list.remove(i15);
                        this.f134805c--;
                    }
                    if (i15 == i16) {
                        break;
                    }
                    i15--;
                }
            }
            return i14 != this.f134805c;
        }

        @Override // java.util.List
        public final T set(int i14, T t7) {
            b1.a(i14, this);
            return this.f134803a.set(i14 + this.f134804b, t7);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f134805c - this.f134804b;
        }

        @Override // java.util.List
        public final List<T> subList(int i14, int i15) {
            b1.b(i14, i15, this);
            return new c(this, i14, i15);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i14) {
            return new a(this, i14);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return p005kotlin.jvm.internal.i.c(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t7) {
            int i14 = this.f134805c;
            this.f134805c = i14 + 1;
            this.f134803a.add(i14, t7);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            collection.getClass();
            this.f134803a.addAll(this.f134805c, collection);
            this.f134805c = collection.size() + this.f134805c;
            return collection.size() > 0;
        }

        @Override // java.util.List
        public final T remove(int i14) {
            b1.a(i14, this);
            T tRemove = this.f134803a.remove(i14 + this.f134804b);
            this.f134805c--;
            return tRemove;
        }
    }

    public q0(int i14) {
        super(i14, null);
    }

    public q0() {
        this(0, 1, null);
    }
}
