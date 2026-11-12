package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
public final class ArrayDeque<E> extends AbstractMutableList<E> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Object[] d = new Object[0];
    private static final int e = 2147483639;
    private static final int f = 10;
    private int a;

    @NotNull
    private Object[] b;
    private int c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int newCapacity$kotlin_stdlib(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - ArrayDeque.e <= 0) {
                return i3;
            }
            if (i2 > ArrayDeque.e) {
                return Integer.MAX_VALUE;
            }
            return ArrayDeque.e;
        }
    }

    public ArrayDeque(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = d;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Illegal Capacity: ", Integer.valueOf(i)));
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    private final void a(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it2 = collection.iterator();
        int length = this.b.length;
        while (i < length) {
            int i2 = i + 1;
            if (!it2.hasNext()) {
                break;
            }
            this.b[i] = it2.next();
            i = i2;
        }
        int i3 = 0;
        int i4 = this.a;
        while (i3 < i4) {
            int i5 = i3 + 1;
            if (!it2.hasNext()) {
                break;
            }
            this.b[i3] = it2.next();
            i3 = i5;
        }
        this.c = size() + collection.size();
    }

    private final void c(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.b;
        ArraysKt.copyInto(objArr2, objArr, 0, this.a, objArr2.length);
        Object[] objArr3 = this.b;
        int length = objArr3.length;
        int i2 = this.a;
        ArraysKt.copyInto(objArr3, objArr, length - i2, 0, i2);
        this.a = 0;
        this.b = objArr;
    }

    private final int e(int i) {
        return i == 0 ? ArraysKt___ArraysKt.getLastIndex(this.b) : i - 1;
    }

    private final void f(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            this.b = new Object[kotlin.ranges.e.coerceAtLeast(i, 10)];
        } else {
            c(Companion.newCapacity$kotlin_stdlib(objArr.length, i));
        }
    }

    private final boolean g(Function1<? super E, Boolean> function1) {
        boolean z = false;
        z = false;
        int i = 0;
        z = false;
        if (!isEmpty()) {
            if (!(this.b.length == 0)) {
                int iM = m(this.a + size());
                int iM2 = this.a;
                if (this.a < iM) {
                    int i2 = this.a;
                    while (i2 < iM) {
                        i2++;
                        Object obj = this.b[i2];
                        if (function1.invoke(obj).booleanValue()) {
                            this.b[iM2] = obj;
                            iM2++;
                        } else {
                            z = true;
                        }
                    }
                    ArraysKt___ArraysJvmKt.fill(this.b, (Object) null, iM2, iM);
                } else {
                    int i3 = this.a;
                    int length = this.b.length;
                    boolean z2 = false;
                    while (i3 < length) {
                        i3++;
                        Object obj2 = this.b[i3];
                        this.b[i3] = null;
                        if (function1.invoke(obj2).booleanValue()) {
                            this.b[iM2] = obj2;
                            iM2++;
                        } else {
                            z2 = true;
                        }
                    }
                    iM2 = m(iM2);
                    while (i < iM) {
                        i++;
                        Object obj3 = this.b[i];
                        this.b[i] = null;
                        if (function1.invoke(obj3).booleanValue()) {
                            this.b[iM2] = obj3;
                            iM2 = h(iM2);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.c = k(iM2 - this.a);
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h(int i) {
        if (i == ArraysKt___ArraysKt.getLastIndex(this.b)) {
            return 0;
        }
        return i + 1;
    }

    @InlineOnly
    private final E i(int i) {
        return (E) this.b[i];
    }

    @InlineOnly
    private final int j(int i) {
        return m(this.a + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        addLast(e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        f(size() + collection.size());
        a(m(this.a + size()), collection);
        return true;
    }

    public final void addFirst(E e2) {
        f(size() + 1);
        int iE = e(this.a);
        this.a = iE;
        this.b[iE] = e2;
        this.c = size() + 1;
    }

    public final void addLast(E e2) {
        f(size() + 1);
        this.b[m(this.a + size())] = e2;
        this.c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iM = m(this.a + size());
        int i = this.a;
        if (i < iM) {
            ArraysKt___ArraysJvmKt.fill(this.b, (Object) null, i, iM);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, this.a, objArr.length);
            ArraysKt___ArraysJvmKt.fill(this.b, (Object) null, 0, iM);
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.b[this.a];
    }

    @Nullable
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.b[this.a];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return (E) this.b[m(this.a + i)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int iM = m(this.a + size());
        int length = this.a;
        if (length < iM) {
            while (length < iM) {
                int i2 = length + 1;
                if (Intrinsics.areEqual(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length = i2;
                }
            }
            return -1;
        }
        if (length < iM) {
            return -1;
        }
        int length2 = this.b.length;
        while (length < length2) {
            int i3 = length + 1;
            if (Intrinsics.areEqual(obj, this.b[length])) {
                i = this.a;
            } else {
                length = i3;
            }
        }
        int i4 = 0;
        while (i4 < iM) {
            int i5 = i4 + 1;
            if (Intrinsics.areEqual(obj, this.b[i4])) {
                length = i4 + this.b.length;
                i = this.a;
            } else {
                i4 = i5;
            }
        }
        return -1;
        return length - i;
    }

    public final void internalStructure$kotlin_stdlib(@NotNull Function2<? super Integer, ? super Object[], Unit> function2) {
        int i;
        function2.invoke(Integer.valueOf((isEmpty() || (i = this.a) < m(this.a + size())) ? this.a : i - this.b.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.b[m(this.a + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052 A[LOOP:2: B:25:0x0052->B:30:0x0064, LOOP_START, PHI: r0
      0x0052: PHI (r0v5 int) = (r0v4 int), (r0v6 int) binds: [B:24:0x0050, B:30:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0064 A[LOOP:2: B:25:0x0052->B:30:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i;
        int i2;
        int i3;
        int iM = m(this.a + size());
        int i4 = this.a;
        if (i4 < iM) {
            lastIndex = iM - 1;
            if (i4 > lastIndex) {
                return -1;
            }
            while (true) {
                int i5 = lastIndex - 1;
                if (Intrinsics.areEqual(obj, this.b[lastIndex])) {
                    i3 = this.a;
                    break;
                }
                if (lastIndex == i4) {
                    return -1;
                }
                lastIndex = i5;
            }
        } else {
            if (i4 <= iM) {
                return -1;
            }
            int i6 = iM - 1;
            if (i6 >= 0) {
                while (true) {
                    int i7 = i6 - 1;
                    if (Intrinsics.areEqual(obj, this.b[i6])) {
                        lastIndex = i6 + this.b.length;
                        i3 = this.a;
                    } else {
                        if (i7 < 0) {
                            break;
                        }
                        i6 = i7;
                    }
                }
                lastIndex = ArraysKt___ArraysKt.getLastIndex(this.b);
                i = this.a;
                if (i <= lastIndex) {
                    return -1;
                }
                while (true) {
                    i2 = lastIndex - 1;
                    if (Intrinsics.areEqual(obj, this.b[lastIndex])) {
                        i3 = this.a;
                        break;
                    }
                    if (lastIndex == i) {
                        return -1;
                    }
                    lastIndex = i2;
                }
            } else {
                lastIndex = ArraysKt___ArraysKt.getLastIndex(this.b);
                i = this.a;
                if (i <= lastIndex) {
                    return -1;
                }
                while (true) {
                    i2 = lastIndex - 1;
                    if (Intrinsics.areEqual(obj, this.b[lastIndex])) {
                        i3 = this.a;
                        break;
                    }
                    if (lastIndex == i) {
                        return -1;
                    }
                    lastIndex = i2;
                }
            }
        }
        return lastIndex - i3;
    }

    @Nullable
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.b[m(this.a + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        boolean z = false;
        z = false;
        int i = 0;
        z = false;
        if (!isEmpty()) {
            if (!(this.b.length == 0)) {
                int iM = m(this.a + size());
                int iM2 = this.a;
                if (this.a < iM) {
                    int i2 = this.a;
                    while (i2 < iM) {
                        i2++;
                        Object obj = this.b[i2];
                        if (!collection.contains(obj)) {
                            this.b[iM2] = obj;
                            iM2++;
                        } else {
                            z = true;
                        }
                    }
                    ArraysKt___ArraysJvmKt.fill(this.b, (Object) null, iM2, iM);
                } else {
                    int i3 = this.a;
                    int length = this.b.length;
                    boolean z2 = false;
                    while (i3 < length) {
                        i3++;
                        Object obj2 = this.b[i3];
                        this.b[i3] = null;
                        if (!collection.contains(obj2)) {
                            this.b[iM2] = obj2;
                            iM2++;
                        } else {
                            z2 = true;
                        }
                    }
                    iM2 = m(iM2);
                    while (i < iM) {
                        i++;
                        Object obj3 = this.b[i];
                        this.b[i] = null;
                        if (!collection.contains(obj3)) {
                            this.b[iM2] = obj3;
                            iM2 = h(iM2);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.c = k(iM2 - this.a);
                }
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        if (i == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int iM = m(this.a + i);
        E e2 = (E) this.b[iM];
        if (i < (size() >> 1)) {
            int i2 = this.a;
            if (iM >= i2) {
                Object[] objArr = this.b;
                ArraysKt.copyInto(objArr, objArr, i2 + 1, i2, iM);
            } else {
                Object[] objArr2 = this.b;
                ArraysKt.copyInto(objArr2, objArr2, 1, 0, iM);
                Object[] objArr3 = this.b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.a;
                ArraysKt.copyInto(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.b;
            int i4 = this.a;
            objArr4[i4] = null;
            this.a = h(i4);
        } else {
            int iM2 = m(this.a + CollectionsKt__CollectionsKt.getLastIndex(this));
            if (iM <= iM2) {
                Object[] objArr5 = this.b;
                ArraysKt.copyInto(objArr5, objArr5, iM, iM + 1, iM2 + 1);
            } else {
                Object[] objArr6 = this.b;
                ArraysKt.copyInto(objArr6, objArr6, iM, iM + 1, objArr6.length);
                Object[] objArr7 = this.b;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt.copyInto(objArr7, objArr7, 0, 1, iM2 + 1);
            }
            this.b[iM2] = null;
        }
        this.c = size() - 1;
        return e2;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        E e2 = (E) this.b[this.a];
        Object[] objArr = this.b;
        int i = this.a;
        objArr[i] = null;
        this.a = h(i);
        this.c = size() - 1;
        return e2;
    }

    @Nullable
    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iM = m(this.a + CollectionsKt__CollectionsKt.getLastIndex(this));
        E e2 = (E) this.b[iM];
        this.b[iM] = null;
        this.c = size() - 1;
        return e2;
    }

    @Nullable
    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        boolean z = false;
        z = false;
        int i = 0;
        z = false;
        if (!isEmpty()) {
            if (!(this.b.length == 0)) {
                int iM = m(this.a + size());
                int iM2 = this.a;
                if (this.a < iM) {
                    int i2 = this.a;
                    while (i2 < iM) {
                        i2++;
                        Object obj = this.b[i2];
                        if (collection.contains(obj)) {
                            this.b[iM2] = obj;
                            iM2++;
                        } else {
                            z = true;
                        }
                    }
                    ArraysKt___ArraysJvmKt.fill(this.b, (Object) null, iM2, iM);
                } else {
                    int i3 = this.a;
                    int length = this.b.length;
                    boolean z2 = false;
                    while (i3 < length) {
                        i3++;
                        Object obj2 = this.b[i3];
                        this.b[i3] = null;
                        if (collection.contains(obj2)) {
                            this.b[iM2] = obj2;
                            iM2++;
                        } else {
                            z2 = true;
                        }
                    }
                    iM2 = m(iM2);
                    while (i < iM) {
                        i++;
                        Object obj3 = this.b[i];
                        this.b[i] = null;
                        if (collection.contains(obj3)) {
                            this.b[iM2] = obj3;
                            iM2 = h(iM2);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.c = k(iM2 - this.a);
                }
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e2) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        int iM = m(this.a + i);
        E e3 = (E) this.b[iM];
        this.b[iM] = e2;
        return e3;
    }

    @NotNull
    public final <T> T[] testToArray$kotlin_stdlib(@NotNull T[] tArr) {
        return (T[]) toArray(tArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr.length < size()) {
            tArr = (T[]) b.arrayOfNulls(tArr, size());
        }
        int iM = m(this.a + size());
        int i = this.a;
        if (i < iM) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.b, tArr, 0, i, iM, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            ArraysKt.copyInto(objArr, tArr, 0, this.a, objArr.length);
            Object[] objArr2 = this.b;
            ArraysKt.copyInto(objArr2, tArr, objArr2.length - this.a, 0, iM);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e2) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (i == size()) {
            addLast(e2);
            return;
        }
        if (i == 0) {
            addFirst(e2);
            return;
        }
        f(size() + 1);
        int iM = m(this.a + i);
        if (i < ((size() + 1) >> 1)) {
            int iE = e(iM);
            int iE2 = e(this.a);
            int i2 = this.a;
            if (iE >= i2) {
                Object[] objArr = this.b;
                objArr[iE2] = objArr[i2];
                ArraysKt.copyInto(objArr, objArr, i2, i2 + 1, iE + 1);
            } else {
                Object[] objArr2 = this.b;
                ArraysKt.copyInto(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.b;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt.copyInto(objArr3, objArr3, 0, 1, iE + 1);
            }
            this.b[iE] = e2;
            this.a = iE2;
        } else {
            int iM2 = m(this.a + size());
            if (iM < iM2) {
                Object[] objArr4 = this.b;
                ArraysKt.copyInto(objArr4, objArr4, iM + 1, iM, iM2);
            } else {
                Object[] objArr5 = this.b;
                ArraysKt.copyInto(objArr5, objArr5, 1, 0, iM2);
                Object[] objArr6 = this.b;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt.copyInto(objArr6, objArr6, iM + 1, iM, objArr6.length - 1);
            }
            this.b[iM] = e2;
        }
        this.c = size() + 1;
    }

    @NotNull
    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        f(size() + collection.size());
        int iM = m(this.a + size());
        int iM2 = m(this.a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.a;
            int length = i2 - size;
            if (iM2 < i2) {
                Object[] objArr = this.b;
                ArraysKt.copyInto(objArr, objArr, length, i2, objArr.length);
                if (size >= iM2) {
                    Object[] objArr2 = this.b;
                    ArraysKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, iM2);
                } else {
                    Object[] objArr3 = this.b;
                    ArraysKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.b;
                    ArraysKt.copyInto(objArr4, objArr4, 0, size, iM2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.b;
                ArraysKt.copyInto(objArr5, objArr5, length, i2, iM2);
            } else {
                Object[] objArr6 = this.b;
                length += objArr6.length;
                int i3 = iM2 - i2;
                int length2 = objArr6.length - length;
                if (length2 >= i3) {
                    ArraysKt.copyInto(objArr6, objArr6, length, i2, iM2);
                } else {
                    ArraysKt.copyInto(objArr6, objArr6, length, i2, i2 + length2);
                    Object[] objArr7 = this.b;
                    ArraysKt.copyInto(objArr7, objArr7, 0, this.a + length2, iM2);
                }
            }
            this.a = length;
            a(k(iM2 - size), collection);
        } else {
            int i4 = iM2 + size;
            if (iM2 < iM) {
                int i5 = size + iM;
                Object[] objArr8 = this.b;
                if (i5 <= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i4, iM2, iM);
                } else if (i4 >= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i4 - objArr8.length, iM2, iM);
                } else {
                    int length3 = iM - (i5 - objArr8.length);
                    ArraysKt.copyInto(objArr8, objArr8, 0, length3, iM);
                    Object[] objArr9 = this.b;
                    ArraysKt.copyInto(objArr9, objArr9, i4, iM2, length3);
                }
            } else {
                Object[] objArr10 = this.b;
                ArraysKt.copyInto(objArr10, objArr10, size, 0, iM);
                Object[] objArr11 = this.b;
                if (i4 >= objArr11.length) {
                    ArraysKt.copyInto(objArr11, objArr11, i4 - objArr11.length, iM2, objArr11.length);
                } else {
                    ArraysKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.b;
                    ArraysKt.copyInto(objArr12, objArr12, i4, iM2, objArr12.length - size);
                }
            }
            a(iM2, collection);
        }
        return true;
    }

    public ArrayDeque() {
        this.b = d;
    }

    public ArrayDeque(@NotNull Collection<? extends E> collection) {
        Object[] array = collection.toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.b = array;
        this.c = array.length;
        if (array.length == 0) {
            this.b = d;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
