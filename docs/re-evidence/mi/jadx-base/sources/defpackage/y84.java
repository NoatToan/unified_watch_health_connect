package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes5.dex */
public class y84<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f39918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f39919b;
    public transient Object[] c;
    public transient int d;
    public transient int e;

    public class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39921b;
        public int c = -1;

        public a() {
            this.f39920a = y84.this.d;
            this.f39921b = y84.this.t();
        }

        public final void a() {
            if (y84.this.d != this.f39920a) {
                throw new ConcurrentModificationException();
            }
        }

        public void b() {
            this.f39920a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f39921b >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f39921b;
            this.c = i;
            E e = (E) y84.this.q(i);
            this.f39921b = y84.this.u(this.f39921b);
            return e;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            d44.e(this.c >= 0);
            b();
            y84 y84Var = y84.this;
            y84Var.remove(y84Var.q(this.c));
            this.f39921b = y84.this.g(this.f39921b, this.c);
            this.c = -1;
        }
    }

    public y84() {
        x(3);
    }

    public static <E> y84<E> j() {
        return new y84<>();
    }

    public static <E> y84<E> m(int i) {
        return new y84<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(i);
            throw new InvalidObjectException(sb.toString());
        }
        x(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public void A(int i, int i2) {
        Object objF = F();
        int[] iArrE = E();
        Object[] objArrC = C();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrC[i] = null;
            iArrE[i] = 0;
            return;
        }
        Object obj = objArrC[i3];
        objArrC[i] = obj;
        objArrC[i3] = null;
        iArrE[i] = iArrE[i3];
        iArrE[i3] = 0;
        int iD = qlb.d(obj) & i2;
        int iH = z84.h(objF, iD);
        if (iH == size) {
            z84.i(objF, iD, i + 1);
            return;
        }
        while (true) {
            int i4 = iH - 1;
            int i5 = iArrE[i4];
            int iC = z84.c(i5, i2);
            if (iC == size) {
                iArrE[i4] = z84.d(i5, i + 1, i2);
                return;
            }
            iH = iC;
        }
    }

    public boolean B() {
        return this.f39918a == null;
    }

    public final Object[] C() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] E() {
        int[] iArr = this.f39919b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object F() {
        Object obj = this.f39918a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public void G(int i) {
        this.f39919b = Arrays.copyOf(E(), i);
        this.c = Arrays.copyOf(C(), i);
    }

    public final void H(int i) {
        int iMin;
        int length = E().length;
        if (i <= length || (iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        G(iMin);
    }

    public final int I(int i, int i2, int i3, int i4) {
        Object objA = z84.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            z84.i(objA, i3 & i5, i4 + 1);
        }
        Object objF = F();
        int[] iArrE = E();
        for (int i6 = 0; i6 <= i; i6++) {
            int iH = z84.h(objF, i6);
            while (iH != 0) {
                int i7 = iH - 1;
                int i8 = iArrE[i7];
                int iB = z84.b(i8, i) | i6;
                int i9 = iB & i5;
                int iH2 = z84.h(objA, i9);
                z84.i(objA, i9, iH);
                iArrE[i7] = z84.d(iB, iH2, i5);
                iH = z84.c(i8, i);
            }
        }
        this.f39918a = objA;
        T(i5);
        return i5;
    }

    public final void L(int i, E e) {
        C()[i] = e;
    }

    public final void P(int i, int i2) {
        E()[i] = i2;
    }

    public final void T(int i) {
        this.d = z84.d(this.d, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (B()) {
            h();
        }
        Set<E> setO = o();
        if (setO != null) {
            return setO.add(e);
        }
        int[] iArrE = E();
        Object[] objArrC = C();
        int i = this.e;
        int i2 = i + 1;
        int iD = qlb.d(e);
        int iV = v();
        int i3 = iD & iV;
        int iH = z84.h(F(), i3);
        if (iH != 0) {
            int iB = z84.b(iD, iV);
            int i4 = 0;
            while (true) {
                int i5 = iH - 1;
                int i6 = iArrE[i5];
                if (z84.b(i6, iV) == iB && j4h.a(e, objArrC[i5])) {
                    return false;
                }
                int iC = z84.c(i6, iV);
                i4++;
                if (iC != 0) {
                    iH = iC;
                } else {
                    if (i4 >= 9) {
                        return i().add(e);
                    }
                    if (i2 > iV) {
                        iV = I(iV, z84.e(iV), iD, i);
                    } else {
                        iArrE[i5] = z84.d(i6, i2, iV);
                    }
                }
            }
        } else if (i2 > iV) {
            iV = I(iV, z84.e(iV), iD, i);
        } else {
            z84.i(F(), i3, i2);
        }
        H(i2);
        z(i, e, iD, iV);
        this.e = i2;
        w();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (B()) {
            return;
        }
        w();
        Set<E> setO = o();
        if (setO != null) {
            this.d = ahd.e(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            setO.clear();
            this.f39918a = null;
            this.e = 0;
            return;
        }
        Arrays.fill(C(), 0, this.e, (Object) null);
        z84.g(F());
        Arrays.fill(E(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (B()) {
            return false;
        }
        Set<E> setO = o();
        if (setO != null) {
            return setO.contains(obj);
        }
        int iD = qlb.d(obj);
        int iV = v();
        int iH = z84.h(F(), iD & iV);
        if (iH == 0) {
            return false;
        }
        int iB = z84.b(iD, iV);
        do {
            int i = iH - 1;
            int iR = r(i);
            if (z84.b(iR, iV) == iB && j4h.a(obj, q(i))) {
                return true;
            }
            iH = z84.c(iR, iV);
        } while (iH != 0);
        return false;
    }

    public int g(int i, int i2) {
        return i - 1;
    }

    public int h() {
        c6i.u(B(), "Arrays already allocated");
        int i = this.d;
        int iJ = z84.j(i);
        this.f39918a = z84.a(iJ);
        T(iJ - 1);
        this.f39919b = new int[i];
        this.c = new Object[i];
        return i;
    }

    public Set<E> i() {
        Set<E> setK = k(v() + 1);
        int iT = t();
        while (iT >= 0) {
            setK.add(q(iT));
            iT = u(iT);
        }
        this.f39918a = setK;
        this.f39919b = null;
        this.c = null;
        w();
        return setK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setO = o();
        return setO != null ? setO.iterator() : new a();
    }

    public final Set<E> k(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    public Set<E> o() {
        Object obj = this.f39918a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final E q(int i) {
        return (E) C()[i];
    }

    public final int r(int i) {
        return E()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (B()) {
            return false;
        }
        Set<E> setO = o();
        if (setO != null) {
            return setO.remove(obj);
        }
        int iV = v();
        int iF = z84.f(obj, null, iV, F(), E(), C(), null);
        if (iF == -1) {
            return false;
        }
        A(iF, iV);
        this.e--;
        w();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setO = o();
        return setO != null ? setO.size() : this.e;
    }

    public int t() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (B()) {
            return new Object[0];
        }
        Set<E> setO = o();
        return setO != null ? setO.toArray() : Arrays.copyOf(C(), this.e);
    }

    public int u(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public final int v() {
        return (1 << (this.d & 31)) - 1;
    }

    public void w() {
        this.d += 32;
    }

    public void x(int i) {
        c6i.e(i >= 0, "Expected size must be >= 0");
        this.d = ahd.e(i, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public void z(int i, E e, int i2, int i3) {
        P(i, z84.d(i2, 0, i3));
        L(i, e);
    }

    public y84(int i) {
        x(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (B()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setO = o();
        if (setO != null) {
            return (T[]) setO.toArray(tArr);
        }
        return (T[]) t3h.h(C(), 0, this.e, tArr);
    }
}
