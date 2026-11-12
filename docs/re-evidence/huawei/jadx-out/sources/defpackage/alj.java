package defpackage;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import com.google.common.primitives.Ints;
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
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
class alj<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    transient Object[] f506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private transient int[] f507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f508c;
    private transient int d;

    @CheckForNull
    private transient Object e;

    int c(int i, int i2) {
        return i - 1;
    }

    public static <E> alj<E> a() {
        return new alj<>();
    }

    public static <E> alj<E> b(int i) {
        return new alj<>(i);
    }

    alj() {
        a(3);
    }

    alj(int i) {
        a(i);
    }

    void a(int i) {
        Preconditions.checkArgument(i >= 0, "Expected size must be >= 0");
        this.d = Ints.d(i, 1, 1073741823);
    }

    boolean h() {
        return this.e == null;
    }

    int b() {
        Preconditions.checkState(h(), "Arrays already allocated");
        int i = this.d;
        int iA = alk.a(i);
        this.e = alk.c(iA);
        f(iA - 1);
        this.f507b = new int[i];
        this.f506a = new Object[i];
        return i;
    }

    @CheckForNull
    Set<E> c() {
        Object obj = this.e;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    private Set<E> d(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    Set<E> d() {
        Set<E> setD = d(g() + 1);
        int iE = e();
        while (iE >= 0) {
            setD.add(i(iE));
            iE = e(iE);
        }
        this.e = setD;
        this.f507b = null;
        this.f506a = null;
        j();
        return setD;
    }

    private void f(int i) {
        this.d = alk.a(this.d, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private int g() {
        return (1 << (this.d & 31)) - 1;
    }

    void j() {
        this.d += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(@ParametricNullness E e) {
        if (h()) {
            b();
        }
        Set<E> setC = c();
        if (setC != null) {
            return setC.add(e);
        }
        int[] iArrI = i();
        Object[] objArrF = f();
        int i = this.f508c;
        int i2 = i + 1;
        int iC = aly.c(e);
        int iG = g();
        int i3 = iC & iG;
        int iB = alk.b(n(), i3);
        if (iB != 0) {
            int iC2 = alk.c(iC, iG);
            int i4 = 0;
            while (true) {
                int i5 = iB - 1;
                int i6 = iArrI[i5];
                if (alk.c(i6, iG) == iC2 && Objects.equal(e, objArrF[i5])) {
                    return false;
                }
                int iB2 = alk.b(i6, iG);
                i4++;
                if (iB2 != 0) {
                    iB = iB2;
                } else {
                    if (i4 >= 9) {
                        return d().add(e);
                    }
                    if (i2 > iG) {
                        iG = a(iG, alk.b(iG), iC, i);
                    } else {
                        iArrI[i5] = alk.a(i6, i2, iG);
                    }
                }
            }
        } else if (i2 > iG) {
            iG = a(iG, alk.b(iG), iC, i);
        } else {
            alk.e(n(), i3, i2);
        }
        j(i2);
        e(i, e, iC, iG);
        this.f508c = i2;
        j();
        return true;
    }

    void e(int i, @ParametricNullness E e, int i2, int i3) {
        b(i, alk.a(i2, 0, i3));
        a(i, e);
    }

    private void j(int i) {
        int iMin;
        int length = i().length;
        if (i <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        c(iMin);
    }

    void c(int i) {
        this.f507b = Arrays.copyOf(i(), i);
        this.f506a = Arrays.copyOf(f(), i);
    }

    private int a(int i, int i2, int i3, int i4) {
        Object objC = alk.c(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            alk.e(objC, i3 & i5, i4 + 1);
        }
        Object objN = n();
        int[] iArrI = i();
        for (int i6 = 0; i6 <= i; i6++) {
            int iB = alk.b(objN, i6);
            while (iB != 0) {
                int i7 = iB - 1;
                int i8 = iArrI[i7];
                int iC = alk.c(i8, i) | i6;
                int i9 = iC & i5;
                int iB2 = alk.b(objC, i9);
                alk.e(objC, i9, iB);
                iArrI[i7] = alk.a(iC, iB2, i5);
                iB = alk.b(i8, i);
            }
        }
        this.e = objC;
        f(i5);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (h()) {
            return false;
        }
        Set<E> setC = c();
        if (setC != null) {
            return setC.contains(obj);
        }
        int iC = aly.c(obj);
        int iG = g();
        int iB = alk.b(n(), iC & iG);
        if (iB == 0) {
            return false;
        }
        int iC2 = alk.c(iC, iG);
        do {
            int i = iB - 1;
            int iG2 = g(i);
            if (alk.c(iG2, iG) == iC2 && Objects.equal(obj, i(i))) {
                return true;
            }
            iB = alk.b(iG2, iG);
        } while (iB != 0);
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@CheckForNull Object obj) {
        if (h()) {
            return false;
        }
        Set<E> setC = c();
        if (setC != null) {
            return setC.remove(obj);
        }
        int iG = g();
        int iB = alk.b(obj, null, iG, n(), i(), f(), null);
        if (iB == -1) {
            return false;
        }
        d(iB, iG);
        this.f508c--;
        j();
        return true;
    }

    void d(int i, int i2) {
        Object objN = n();
        int[] iArrI = i();
        Object[] objArrF = f();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj = objArrF[i3];
            objArrF[i] = obj;
            objArrF[i3] = null;
            iArrI[i] = iArrI[i3];
            iArrI[i3] = 0;
            int iC = aly.c(obj) & i2;
            int iB = alk.b(objN, iC);
            if (iB == size) {
                alk.e(objN, iC, i + 1);
                return;
            }
            while (true) {
                int i4 = iB - 1;
                int i5 = iArrI[i4];
                int iB2 = alk.b(i5, i2);
                if (iB2 == size) {
                    iArrI[i4] = alk.a(i5, i + 1, i2);
                    return;
                }
                iB = iB2;
            }
        } else {
            objArrF[i] = null;
            iArrI[i] = 0;
        }
    }

    int e() {
        return isEmpty() ? -1 : 0;
    }

    int e(int i) {
        int i2 = i + 1;
        if (i2 < this.f508c) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setC = c();
        if (setC != null) {
            return setC.iterator();
        }
        return new Iterator<E>() { // from class: alj.5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f510b = -1;
            int d;
            int e;

            {
                this.d = alj.this.d;
                this.e = alj.this.e();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.e >= 0;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public E next() {
                d();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.e;
                this.f510b = i;
                E e = (E) alj.this.i(i);
                this.e = alj.this.e(this.e);
                return e;
            }

            @Override // java.util.Iterator
            public void remove() {
                d();
                ale.b(this.f510b >= 0);
                c();
                alj aljVar = alj.this;
                aljVar.remove(aljVar.i(this.f510b));
                this.e = alj.this.c(this.e, this.f510b);
                this.f510b = -1;
            }

            void c() {
                this.d += 32;
            }

            private void d() {
                if (alj.this.d != this.d) {
                    throw new ConcurrentModificationException();
                }
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setC = c();
        return setC != null ? setC.size() : this.f508c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (h()) {
            return new Object[0];
        }
        Set<E> setC = c();
        return setC != null ? setC.toArray() : Arrays.copyOf(f(), this.f508c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (h()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setC = c();
        if (setC != null) {
            return (T[]) setC.toArray(tArr);
        }
        return (T[]) amu.e(f(), 0, this.f508c, tArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (h()) {
            return;
        }
        j();
        Set<E> setC = c();
        if (setC != null) {
            this.d = Ints.d(size(), 3, 1073741823);
            setC.clear();
            this.e = null;
            this.f508c = 0;
            return;
        }
        Arrays.fill(f(), 0, this.f508c, (Object) null);
        alk.b(n());
        Arrays.fill(i(), 0, this.f508c, 0);
        this.f508c = 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid size: " + i);
        }
        a(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private Object n() {
        return java.util.Objects.requireNonNull(this.e);
    }

    private int[] i() {
        return (int[]) java.util.Objects.requireNonNull(this.f507b);
    }

    private Object[] f() {
        return (Object[]) java.util.Objects.requireNonNull(this.f506a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E i(int i) {
        return (E) f()[i];
    }

    private int g(int i) {
        return i()[i];
    }

    private void a(int i, E e) {
        f()[i] = e;
    }

    private void b(int i, int i2) {
        i()[i] = i2;
    }
}
