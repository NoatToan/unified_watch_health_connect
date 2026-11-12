package p13;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Lp13/k;", "E", "Lp13/f;", "", "initialCapacity", "<init>", "(I)V", "()V", "", "elements", "(Ljava/util/Collection;)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k<E> extends f<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f134945d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f134947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134948c;

    static {
        new a(null);
        f134945d = new Object[0];
    }

    public k(int i14) {
        Object[] objArr;
        if (i14 == 0) {
            objArr = f134945d;
        } else {
            if (i14 <= 0) {
                vb.h.s(am.j.h(i14, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i14];
        }
        this.f134947b = objArr;
    }

    @Override // p13.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF97124f() {
        return this.f134948c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i14, E e4) {
        int length;
        c.a aVar = c.f134916a;
        int i15 = this.f134948c;
        aVar.getClass();
        c.a.c(i14, i15);
        if (i14 == this.f134948c) {
            addLast(e4);
            return;
        }
        if (i14 == 0) {
            addFirst(e4);
            return;
        }
        n();
        d(this.f134948c + 1);
        int iM = m(this.f134946a + i14);
        int i16 = this.f134948c;
        if (i14 < ((i16 + 1) >> 1)) {
            if (iM == 0) {
                Object[] objArr = this.f134947b;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM - 1;
            }
            int length2 = this.f134946a;
            if (length2 == 0) {
                Object[] objArr2 = this.f134947b;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i17 = length2 - 1;
            int i18 = this.f134946a;
            Object[] objArr3 = this.f134947b;
            if (length >= i18) {
                objArr3[i17] = objArr3[i18];
                s.h(objArr3, objArr3, i18, i18 + 1, length + 1);
            } else {
                s.h(objArr3, objArr3, i18 - 1, i18, objArr3.length);
                Object[] objArr4 = this.f134947b;
                objArr4[objArr4.length - 1] = objArr4[0];
                s.h(objArr4, objArr4, 0, 1, length + 1);
            }
            this.f134947b[length] = e4;
            this.f134946a = i17;
        } else {
            int iM2 = m(i16 + this.f134946a);
            Object[] objArr5 = this.f134947b;
            if (iM < iM2) {
                s.h(objArr5, objArr5, iM + 1, iM, iM2);
            } else {
                s.h(objArr5, objArr5, 1, 0, iM2);
                Object[] objArr6 = this.f134947b;
                objArr6[0] = objArr6[objArr6.length - 1];
                s.h(objArr6, objArr6, iM + 1, iM, objArr6.length - 1);
            }
            this.f134947b[iM] = e4;
        }
        this.f134948c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i14, Collection<? extends E> collection) {
        collection.getClass();
        c.a aVar = c.f134916a;
        int i15 = this.f134948c;
        aVar.getClass();
        c.a.c(i14, i15);
        if (collection.isEmpty()) {
            return false;
        }
        if (i14 == this.f134948c) {
            return addAll(collection);
        }
        n();
        d(collection.size() + this.f134948c);
        int iM = m(this.f134948c + this.f134946a);
        int iM2 = m(this.f134946a + i14);
        int size = collection.size();
        if (i14 >= ((this.f134948c + 1) >> 1)) {
            int i16 = iM2 + size;
            Object[] objArr = this.f134947b;
            if (iM2 < iM) {
                int i17 = size + iM;
                if (i17 <= objArr.length) {
                    s.h(objArr, objArr, i16, iM2, iM);
                } else if (i16 >= objArr.length) {
                    s.h(objArr, objArr, i16 - objArr.length, iM2, iM);
                } else {
                    int length = iM - (i17 - objArr.length);
                    s.h(objArr, objArr, 0, length, iM);
                    Object[] objArr2 = this.f134947b;
                    s.h(objArr2, objArr2, i16, iM2, length);
                }
            } else {
                s.h(objArr, objArr, size, 0, iM);
                Object[] objArr3 = this.f134947b;
                if (i16 >= objArr3.length) {
                    s.h(objArr3, objArr3, i16 - objArr3.length, iM2, objArr3.length);
                } else {
                    s.h(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.f134947b;
                    s.h(objArr4, objArr4, i16, iM2, objArr4.length - size);
                }
            }
            c(iM2, collection);
            return true;
        }
        int i18 = this.f134946a;
        int length2 = i18 - size;
        Object[] objArr5 = this.f134947b;
        if (iM2 < i18) {
            s.h(objArr5, objArr5, length2, i18, objArr5.length);
            Object[] objArr6 = this.f134947b;
            if (size >= iM2) {
                s.h(objArr6, objArr6, objArr6.length - size, 0, iM2);
            } else {
                s.h(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.f134947b;
                s.h(objArr7, objArr7, 0, size, iM2);
            }
        } else if (length2 >= 0) {
            s.h(objArr5, objArr5, length2, i18, iM2);
        } else {
            length2 += objArr5.length;
            int i19 = iM2 - i18;
            int length3 = objArr5.length - length2;
            if (length3 >= i19) {
                s.h(objArr5, objArr5, length2, i18, iM2);
            } else {
                s.h(objArr5, objArr5, length2, i18, i18 + length3);
                Object[] objArr8 = this.f134947b;
                s.h(objArr8, objArr8, 0, this.f134946a + length3, iM2);
            }
        }
        this.f134946a = length2;
        c(i(iM2 - size), collection);
        return true;
    }

    public final void addFirst(E e4) {
        n();
        d(this.f134948c + 1);
        int length = this.f134946a;
        if (length == 0) {
            Object[] objArr = this.f134947b;
            objArr.getClass();
            length = objArr.length;
        }
        int i14 = length - 1;
        this.f134946a = i14;
        this.f134947b[i14] = e4;
        this.f134948c++;
    }

    public final void addLast(E e4) {
        n();
        d(getF97124f() + 1);
        this.f134947b[m(getF97124f() + this.f134946a)] = e4;
        this.f134948c = getF97124f() + 1;
    }

    @Override // p13.f
    public final E b(int i14) {
        c.a aVar = c.f134916a;
        int i15 = this.f134948c;
        aVar.getClass();
        c.a.b(i14, i15);
        if (i14 == getF97124f() - 1) {
            return removeLast();
        }
        if (i14 == 0) {
            return removeFirst();
        }
        n();
        int iM = m(this.f134946a + i14);
        Object[] objArr = this.f134947b;
        E e4 = (E) objArr[iM];
        int i16 = this.f134948c >> 1;
        int i17 = this.f134946a;
        if (i14 < i16) {
            if (iM >= i17) {
                s.h(objArr, objArr, i17 + 1, i17, iM);
            } else {
                s.h(objArr, objArr, 1, 0, iM);
                Object[] objArr2 = this.f134947b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i18 = this.f134946a;
                s.h(objArr2, objArr2, i18 + 1, i18, objArr2.length - 1);
            }
            Object[] objArr3 = this.f134947b;
            int i19 = this.f134946a;
            objArr3[i19] = null;
            this.f134946a = g(i19);
        } else {
            int iM2 = m((getF97124f() - 1) + i17);
            Object[] objArr4 = this.f134947b;
            if (iM <= iM2) {
                s.h(objArr4, objArr4, iM, iM + 1, iM2 + 1);
            } else {
                s.h(objArr4, objArr4, iM, iM + 1, objArr4.length);
                Object[] objArr5 = this.f134947b;
                objArr5[objArr5.length - 1] = objArr5[0];
                s.h(objArr5, objArr5, 0, 1, iM2 + 1);
            }
            this.f134947b[iM2] = null;
        }
        this.f134948c--;
        return e4;
    }

    public final void c(int i14, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f134947b.length;
        while (i14 < length && it.hasNext()) {
            this.f134947b[i14] = it.next();
            i14++;
        }
        int i15 = this.f134946a;
        for (int i16 = 0; i16 < i15 && it.hasNext(); i16++) {
            this.f134947b[i16] = it.next();
        }
        this.f134948c = collection.size() + this.f134948c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.f134946a, m(getF97124f() + this.f134946a));
        }
        this.f134946a = 0;
        this.f134948c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i14) {
        if (i14 < 0) {
            vb.h.z("Deque is too big.");
            return;
        }
        Object[] objArr = this.f134947b;
        if (i14 <= objArr.length) {
            return;
        }
        if (objArr == f134945d) {
            if (i14 < 10) {
                i14 = 10;
            }
            this.f134947b = new Object[i14];
            return;
        }
        c.a aVar = c.f134916a;
        int length = objArr.length;
        aVar.getClass();
        Object[] objArr2 = new Object[c.a.e(length, i14)];
        Object[] objArr3 = this.f134947b;
        s.h(objArr3, objArr2, 0, this.f134946a, objArr3.length);
        Object[] objArr4 = this.f134947b;
        int length2 = objArr4.length;
        int i15 = this.f134946a;
        s.h(objArr4, objArr2, length2 - i15, 0, i15);
        this.f134946a = 0;
        this.f134947b = objArr2;
    }

    public final E e() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f134947b[this.f134946a];
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.f134947b[this.f134946a];
        }
        n23.j.s("ArrayDeque is empty.");
        return null;
    }

    public final int g(int i14) {
        Object[] objArr = this.f134947b;
        objArr.getClass();
        if (i14 == objArr.length - 1) {
            return 0;
        }
        return i14 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i14) {
        c.a aVar = c.f134916a;
        int i15 = this.f134948c;
        aVar.getClass();
        c.a.b(i14, i15);
        return (E) this.f134947b[m(this.f134946a + i14)];
    }

    public final E h() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f134947b[m((size() - 1) + this.f134946a)];
    }

    public final int i(int i14) {
        return i14 < 0 ? i14 + this.f134947b.length : i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i14;
        int iM = m(getF97124f() + this.f134946a);
        int length = this.f134946a;
        if (length < iM) {
            while (length < iM) {
                if (p005kotlin.jvm.internal.s.g(obj, this.f134947b[length])) {
                    i14 = this.f134946a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f134946a) < iM) {
            return -1;
        }
        int length2 = this.f134947b.length;
        while (length < length2) {
            if (p005kotlin.jvm.internal.s.g(obj, this.f134947b[length])) {
                i14 = this.f134946a;
            } else {
                length++;
            }
        }
        for (int i15 = 0; i15 < iM; i15++) {
            if (p005kotlin.jvm.internal.s.g(obj, this.f134947b[i15])) {
                length = i15 + this.f134947b.length;
                i14 = this.f134946a;
            }
        }
        return -1;
        return length - i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getF97124f() == 0;
    }

    public final void l(int i14, int i15) {
        Object[] objArr = this.f134947b;
        if (i14 < i15) {
            s.m(i14, i15, null, objArr);
        } else {
            s.m(i14, objArr.length, null, objArr);
            s.m(0, i15, null, this.f134947b);
        }
    }

    public final E last() {
        if (isEmpty()) {
            n23.j.s("ArrayDeque is empty.");
            return null;
        }
        return (E) this.f134947b[m((size() - 1) + this.f134946a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i14;
        int iM = m(this.f134948c + this.f134946a);
        int i15 = this.f134946a;
        if (i15 < iM) {
            length = iM - 1;
            if (i15 <= length) {
                while (!p005kotlin.jvm.internal.s.g(obj, this.f134947b[length])) {
                    if (length != i15) {
                        length--;
                    }
                }
                i14 = this.f134946a;
                return length - i14;
            }
            return -1;
        }
        if (!isEmpty() && this.f134946a >= iM) {
            do {
                iM--;
                objArr = this.f134947b;
                if (-1 >= iM) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i16 = this.f134946a;
                    if (i16 <= length) {
                        while (!p005kotlin.jvm.internal.s.g(obj, this.f134947b[length])) {
                            if (length != i16) {
                                length--;
                            }
                        }
                        i14 = this.f134946a;
                    }
                }
                return length - i14;
            } while (!p005kotlin.jvm.internal.s.g(obj, objArr[iM]));
            length = iM + this.f134947b.length;
            i14 = this.f134946a;
            return length - i14;
        }
        return -1;
    }

    public final int m(int i14) {
        Object[] objArr = this.f134947b;
        return i14 >= objArr.length ? i14 - objArr.length : i14;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int iM;
        Object[] objArr;
        collection.getClass();
        boolean z14 = false;
        z14 = false;
        z14 = false;
        if (!isEmpty() && this.f134947b.length != 0) {
            int iM2 = m(getF97124f() + this.f134946a);
            int i14 = this.f134946a;
            if (i14 < iM2) {
                iM = i14;
                while (true) {
                    objArr = this.f134947b;
                    if (i14 >= iM2) {
                        break;
                    }
                    Object obj = objArr[i14];
                    if (collection.contains(obj)) {
                        z14 = true;
                    } else {
                        this.f134947b[iM] = obj;
                        iM++;
                    }
                    i14++;
                }
                s.m(iM, iM2, null, objArr);
            } else {
                int length = this.f134947b.length;
                boolean z15 = false;
                int i15 = i14;
                while (i14 < length) {
                    Object[] objArr2 = this.f134947b;
                    Object obj2 = objArr2[i14];
                    objArr2[i14] = null;
                    if (collection.contains(obj2)) {
                        z15 = true;
                    } else {
                        this.f134947b[i15] = obj2;
                        i15++;
                    }
                    i14++;
                }
                iM = m(i15);
                for (int i16 = 0; i16 < iM2; i16++) {
                    Object[] objArr3 = this.f134947b;
                    Object obj3 = objArr3[i16];
                    objArr3[i16] = null;
                    if (collection.contains(obj3)) {
                        z15 = true;
                    } else {
                        this.f134947b[iM] = obj3;
                        iM = g(iM);
                    }
                }
                z14 = z15;
            }
            if (z14) {
                n();
                this.f134948c = i(iM - this.f134946a);
            }
        }
        return z14;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            n23.j.s("ArrayDeque is empty.");
            return null;
        }
        n();
        Object[] objArr = this.f134947b;
        int i14 = this.f134946a;
        E e4 = (E) objArr[i14];
        objArr[i14] = null;
        this.f134946a = g(i14);
        this.f134948c = getF97124f() - 1;
        return e4;
    }

    public final E removeLast() {
        if (isEmpty()) {
            n23.j.s("ArrayDeque is empty.");
            return null;
        }
        n();
        int iM = m((size() - 1) + this.f134946a);
        Object[] objArr = this.f134947b;
        E e4 = (E) objArr[iM];
        objArr[iM] = null;
        this.f134948c = getF97124f() - 1;
        return e4;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        c.a aVar = c.f134916a;
        int i16 = this.f134948c;
        aVar.getClass();
        c.a.d(i14, i15, i16);
        int i17 = i15 - i14;
        if (i17 == 0) {
            return;
        }
        if (i17 == this.f134948c) {
            clear();
            return;
        }
        if (i17 == 1) {
            b(i14);
            return;
        }
        n();
        int i18 = this.f134948c - i15;
        int i19 = this.f134946a;
        if (i14 < i18) {
            int iM = m((i14 - 1) + i19);
            int iM2 = m(this.f134946a + (i15 - 1));
            while (i14 > 0) {
                int i24 = iM + 1;
                int iMin = Math.min(i14, Math.min(i24, iM2 + 1));
                Object[] objArr = this.f134947b;
                int i25 = iM2 - iMin;
                int i26 = iM - iMin;
                s.h(objArr, objArr, i25 + 1, i26 + 1, i24);
                iM = i(i26);
                iM2 = i(i25);
                i14 -= iMin;
            }
            int iM3 = m(this.f134946a + i17);
            l(this.f134946a, iM3);
            this.f134946a = iM3;
        } else {
            int iM4 = m(i19 + i15);
            int iM5 = m(this.f134946a + i14);
            int i27 = this.f134948c;
            while (true) {
                i27 -= i15;
                if (i27 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f134947b;
                i15 = Math.min(i27, Math.min(objArr2.length - iM4, objArr2.length - iM5));
                Object[] objArr3 = this.f134947b;
                int i28 = iM4 + i15;
                s.h(objArr3, objArr3, iM5, iM4, i28);
                iM4 = m(i28);
                iM5 = m(iM5 + i15);
            }
            int iM6 = m(this.f134948c + this.f134946a);
            l(i(iM6 - i17), iM6);
        }
        this.f134948c -= i17;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        int iM;
        Object[] objArr;
        collection.getClass();
        boolean z14 = false;
        z14 = false;
        z14 = false;
        if (!isEmpty() && this.f134947b.length != 0) {
            int iM2 = m(getF97124f() + this.f134946a);
            int i14 = this.f134946a;
            if (i14 < iM2) {
                iM = i14;
                while (true) {
                    objArr = this.f134947b;
                    if (i14 >= iM2) {
                        break;
                    }
                    Object obj = objArr[i14];
                    if (collection.contains(obj)) {
                        this.f134947b[iM] = obj;
                        iM++;
                    } else {
                        z14 = true;
                    }
                    i14++;
                }
                s.m(iM, iM2, null, objArr);
            } else {
                int length = this.f134947b.length;
                boolean z15 = false;
                int i15 = i14;
                while (i14 < length) {
                    Object[] objArr2 = this.f134947b;
                    Object obj2 = objArr2[i14];
                    objArr2[i14] = null;
                    if (collection.contains(obj2)) {
                        this.f134947b[i15] = obj2;
                        i15++;
                    } else {
                        z15 = true;
                    }
                    i14++;
                }
                iM = m(i15);
                for (int i16 = 0; i16 < iM2; i16++) {
                    Object[] objArr3 = this.f134947b;
                    Object obj3 = objArr3[i16];
                    objArr3[i16] = null;
                    if (collection.contains(obj3)) {
                        this.f134947b[iM] = obj3;
                        iM = g(iM);
                    } else {
                        z15 = true;
                    }
                }
                z14 = z15;
            }
            if (z14) {
                n();
                this.f134948c = i(iM - this.f134946a);
            }
        }
        return z14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i14, E e4) {
        c.a aVar = c.f134916a;
        int i15 = this.f134948c;
        aVar.getClass();
        c.a.b(i14, i15);
        int iM = m(this.f134946a + i14);
        Object[] objArr = this.f134947b;
        E e14 = (E) objArr[iM];
        objArr[iM] = e4;
        return e14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i14 = this.f134948c;
        if (length < i14) {
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i14);
            objNewInstance.getClass();
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        int iM = m(this.f134948c + this.f134946a);
        int i15 = this.f134946a;
        if (i15 < iM) {
            s.j(this.f134947b, tArr, i15, iM, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f134947b;
            s.h(objArr, tArr, 0, this.f134946a, objArr.length);
            Object[] objArr2 = this.f134947b;
            s.h(objArr2, tArr, objArr2.length - this.f134946a, 0, iM);
        }
        int i16 = this.f134948c;
        if (i16 < tArr.length) {
            tArr[i16] = null;
        }
        return tArr;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp13/k$a;", "", "<init>", "()V", "", "emptyElementData", "[Ljava/lang/Object;", "", "defaultMinCapacity", "I", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public k() {
        this.f134947b = f134945d;
    }

    public k(Collection<? extends E> collection) {
        collection.getClass();
        Object[] array = collection.toArray(new Object[0]);
        this.f134947b = array;
        this.f134948c = array.length;
        if (array.length == 0) {
            this.f134947b = f134945d;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getF97124f()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        addLast(e4);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        n();
        d(collection.size() + getF97124f());
        c(m(getF97124f() + this.f134946a), collection);
        return true;
    }
}
