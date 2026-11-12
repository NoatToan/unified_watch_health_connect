package z43;

import c22.t;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public class i<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f202424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f202425b;

    public static class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f202426a = new b();

        private b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    public class c extends d<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f202427b;

        public c() {
            super();
            this.f202427b = ((AbstractList) i.this).modCount;
        }

        @Override // z43.i.d
        public final void a() {
            i iVar = i.this;
            int i14 = ((AbstractList) iVar).modCount;
            int i15 = this.f202427b;
            if (i14 == i15) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) iVar).modCount + "; expected: " + i15);
        }

        @Override // z43.i.d
        public final E b() {
            return (E) i.this.f202425b;
        }

        @Override // java.util.Iterator
        public final void remove() {
            a();
            i.this.clear();
        }
    }

    public static abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f202429a;

        private d() {
        }

        public abstract void a();

        public abstract T b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f202429a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f202429a) {
                t.g();
                return null;
            }
            this.f202429a = true;
            a();
            return b();
        }
    }

    public static /* synthetic */ void a(int i14) {
        String str = (i14 == 2 || i14 == 3 || i14 == 5 || i14 == 6 || i14 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 2 || i14 == 3 || i14 == 5 || i14 == 6 || i14 == 7) ? 2 : 3];
        switch (i14) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i14 == 2 || i14 == 3) {
            objArr[1] = "iterator";
        } else if (i14 == 5 || i14 == 6 || i14 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i14) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 2 && i14 != 3 && i14 != 5 && i14 != 6 && i14 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i14, E e4) {
        int i15;
        if (i14 < 0 || i14 > (i15 = this.f202424a)) {
            l2.j(this.f202424a, b71.i.i(i14, "Index: ", ", Size: "));
            return;
        }
        if (i15 == 0) {
            this.f202425b = e4;
        } else if (i15 == 1 && i14 == 0) {
            this.f202425b = new Object[]{e4, this.f202425b};
        } else {
            Object[] objArr = new Object[i15 + 1];
            Object obj = this.f202425b;
            if (i15 == 1) {
                objArr[0] = obj;
            } else {
                Object[] objArr2 = (Object[]) obj;
                System.arraycopy(objArr2, 0, objArr, 0, i14);
                System.arraycopy(objArr2, i14, objArr, i14 + 1, this.f202424a - i14);
            }
            objArr[i14] = e4;
            this.f202425b = objArr;
        }
        this.f202424a++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f202425b = null;
        this.f202424a = 0;
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final E get(int i14) {
        int i15;
        if (i14 < 0 || i14 >= (i15 = this.f202424a)) {
            l2.j(this.f202424a, b71.i.i(i14, "Index: ", ", Size: "));
            return null;
        }
        E e4 = (E) this.f202425b;
        return i15 == 1 ? e4 : (E) ((Object[]) e4)[i14];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        int i14 = this.f202424a;
        if (i14 == 0) {
            b bVar = b.f202426a;
            if (bVar != null) {
                return bVar;
            }
            a(2);
            throw null;
        }
        if (i14 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i14) {
        int i15;
        if (i14 < 0 || i14 >= (i15 = this.f202424a)) {
            l2.j(this.f202424a, b71.i.i(i14, "Index: ", ", Size: "));
            return null;
        }
        Object obj = (E) this.f202425b;
        if (i15 == 1) {
            this.f202425b = null;
        } else {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[i14];
            if (i15 == 2) {
                this.f202425b = objArr[1 - i14];
            } else {
                int i16 = (i15 - i14) - 1;
                if (i16 > 0) {
                    System.arraycopy(objArr, i14 + 1, objArr, i14, i16);
                }
                objArr[this.f202424a - 1] = null;
            }
            obj = (E) obj2;
        }
        this.f202424a--;
        ((AbstractList) this).modCount++;
        return (E) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final E set(int i14, E e4) {
        int i15;
        if (i14 < 0 || i14 >= (i15 = this.f202424a)) {
            l2.j(this.f202424a, b71.i.i(i14, "Index: ", ", Size: "));
            return null;
        }
        E e14 = (E) this.f202425b;
        if (i15 == 1) {
            this.f202425b = e4;
            return e14;
        }
        Object[] objArr = (Object[]) e14;
        E e15 = (E) objArr[i14];
        objArr[i14] = e4;
        return e15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f202424a;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super E> comparator) {
        int i14 = this.f202424a;
        if (i14 >= 2) {
            Arrays.sort((Object[]) this.f202425b, 0, i14, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            a(4);
            throw null;
        }
        int length = tArr.length;
        int i14 = this.f202424a;
        if (i14 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f202425b;
                return tArr2;
            }
            tArr[0] = this.f202425b;
        } else {
            if (length < i14) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f202425b, i14, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                a(6);
                throw null;
            }
            if (i14 != 0) {
                System.arraycopy(this.f202425b, 0, tArr, 0, i14);
            }
        }
        int i15 = this.f202424a;
        if (length > i15) {
            tArr[i15] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        int i14 = this.f202424a;
        if (i14 == 0) {
            this.f202425b = e4;
        } else {
            Object obj = this.f202425b;
            if (i14 == 1) {
                this.f202425b = new Object[]{obj, e4};
            } else {
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                if (i14 >= length) {
                    int iA = androidx.core.view.j.a(length, 3, 2, 1);
                    int i15 = i14 + 1;
                    if (iA < i15) {
                        iA = i15;
                    }
                    Object[] objArr2 = new Object[iA];
                    this.f202425b = objArr2;
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    objArr = objArr2;
                }
                objArr[this.f202424a] = e4;
            }
        }
        this.f202424a++;
        ((AbstractList) this).modCount++;
        return true;
    }
}
