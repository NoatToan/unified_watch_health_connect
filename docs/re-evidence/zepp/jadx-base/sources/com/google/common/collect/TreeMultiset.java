package com.google.common.collect;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class TreeMultiset<E> extends m<E> implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 1;
    private final transient g<f<E>> e;
    private final transient y0<E> f;
    private final transient f<E> g;

    public class a extends Multisets.f<E> {
        public final /* synthetic */ f a;

        public a(f fVar) {
            this.a = fVar;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            int iX = this.a.x();
            return iX == 0 ? TreeMultiset.this.count(getElement()) : iX;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public E getElement() {
            return (E) this.a.y();
        }
    }

    public class b implements Iterator<Multiset.Entry<E>> {
        public f<E> a;

        @NullableDecl
        public Multiset.Entry<E> b;

        public b() {
            this.a = TreeMultiset.this.u();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Multiset.Entry<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Multiset.Entry<E> entryY = TreeMultiset.this.y(this.a);
            this.b = entryY;
            if (((f) this.a).i == TreeMultiset.this.g) {
                this.a = null;
            } else {
                this.a = ((f) this.a).i;
            }
            return entryY;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == null) {
                return false;
            }
            if (!TreeMultiset.this.f.r(this.a.y())) {
                return true;
            }
            this.a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            u.e(this.b != null);
            TreeMultiset.this.setCount(this.b.getElement(), 0);
            this.b = null;
        }
    }

    public class c implements Iterator<Multiset.Entry<E>> {
        public f<E> a;
        public Multiset.Entry<E> b = null;

        public c() {
            this.a = TreeMultiset.this.v();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Multiset.Entry<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Multiset.Entry<E> entryY = TreeMultiset.this.y(this.a);
            this.b = entryY;
            if (((f) this.a).h == TreeMultiset.this.g) {
                this.a = null;
            } else {
                this.a = ((f) this.a).h;
            }
            return entryY;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == null) {
                return false;
            }
            if (!TreeMultiset.this.f.s(this.a.y())) {
                return true;
            }
            this.a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            u.e(this.b != null);
            TreeMultiset.this.setCount(this.b.getElement(), 0);
            this.b = null;
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BoundType.values().length];
            a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e DISTINCT;
        public static final e SIZE;

        public static enum a extends e {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public int a(f<?> fVar) {
                return ((f) fVar).b;
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public long b(@NullableDecl f<?> fVar) {
                if (fVar == null) {
                    return 0L;
                }
                return ((f) fVar).d;
            }
        }

        public static enum b extends e {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public int a(f<?> fVar) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public long b(@NullableDecl f<?> fVar) {
                if (fVar == null) {
                    return 0L;
                }
                return ((f) fVar).c;
            }
        }

        static {
            a aVar = new a("SIZE", 0);
            SIZE = aVar;
            b bVar = new b("DISTINCT", 1);
            DISTINCT = bVar;
            $VALUES = new e[]{aVar, bVar};
        }

        private e(String str, int i) {
            super(str, i);
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }

        public abstract int a(f<?> fVar);

        public abstract long b(@NullableDecl f<?> fVar);

        public /* synthetic */ e(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static final class f<E> {

        @NullableDecl
        private final E a;
        private int b;
        private int c;
        private long d;
        private int e;

        @NullableDecl
        private f<E> f;

        @NullableDecl
        private f<E> g;

        @NullableDecl
        private f<E> h;

        @NullableDecl
        private f<E> i;

        public f(@NullableDecl E e, int i) {
            Preconditions.checkArgument(i > 0);
            this.a = e;
            this.b = i;
            this.d = i;
            this.c = 1;
            this.e = 1;
            this.f = null;
            this.g = null;
        }

        private f<E> A() {
            int iS = s();
            if (iS == -2) {
                if (this.g.s() > 0) {
                    this.g = this.g.I();
                }
                return H();
            }
            if (iS != 2) {
                C();
                return this;
            }
            if (this.f.s() < 0) {
                this.f = this.f.H();
            }
            return I();
        }

        private void B() {
            D();
            C();
        }

        private void C() {
            this.e = Math.max(z(this.f), z(this.g)) + 1;
        }

        private void D() {
            this.c = TreeMultiset.t(this.f) + 1 + TreeMultiset.t(this.g);
            this.d = ((long) this.b) + L(this.f) + L(this.g);
        }

        private f<E> F(f<E> fVar) {
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                return this.f;
            }
            this.g = fVar2.F(fVar);
            this.c--;
            this.d -= (long) fVar.b;
            return A();
        }

        private f<E> G(f<E> fVar) {
            f<E> fVar2 = this.f;
            if (fVar2 == null) {
                return this.g;
            }
            this.f = fVar2.G(fVar);
            this.c--;
            this.d -= (long) fVar.b;
            return A();
        }

        private f<E> H() {
            Preconditions.checkState(this.g != null);
            f<E> fVar = this.g;
            this.g = fVar.f;
            fVar.f = this;
            fVar.d = this.d;
            fVar.c = this.c;
            B();
            fVar.C();
            return fVar;
        }

        private f<E> I() {
            Preconditions.checkState(this.f != null);
            f<E> fVar = this.f;
            this.f = fVar.g;
            fVar.g = this;
            fVar.d = this.d;
            fVar.c = this.c;
            B();
            fVar.C();
            return fVar;
        }

        private static long L(@NullableDecl f<?> fVar) {
            if (fVar == null) {
                return 0L;
            }
            return ((f) fVar).d;
        }

        private f<E> q(E e, int i) {
            f<E> fVar = new f<>(e, i);
            this.f = fVar;
            TreeMultiset.x(this.h, fVar, this);
            this.e = Math.max(2, this.e);
            this.c++;
            this.d += (long) i;
            return this;
        }

        private f<E> r(E e, int i) {
            f<E> fVar = new f<>(e, i);
            this.g = fVar;
            TreeMultiset.x(this, fVar, this.i);
            this.e = Math.max(2, this.e);
            this.c++;
            this.d += (long) i;
            return this;
        }

        private int s() {
            return z(this.f) - z(this.g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @NullableDecl
        public f<E> t(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, this.a);
            if (iCompare < 0) {
                f<E> fVar = this.f;
                return fVar == null ? this : (f) MoreObjects.firstNonNull(fVar.t(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                return null;
            }
            return fVar2.t(comparator, e);
        }

        private f<E> v() {
            int i = this.b;
            this.b = 0;
            TreeMultiset.w(this.h, this.i);
            f<E> fVar = this.f;
            if (fVar == null) {
                return this.g;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                return fVar;
            }
            if (fVar.e >= fVar2.e) {
                f<E> fVar3 = this.h;
                fVar3.f = fVar.F(fVar3);
                fVar3.g = this.g;
                fVar3.c = this.c - 1;
                fVar3.d = this.d - ((long) i);
                return fVar3.A();
            }
            f<E> fVar4 = this.i;
            fVar4.g = fVar2.G(fVar4);
            fVar4.f = this.f;
            fVar4.c = this.c - 1;
            fVar4.d = this.d - ((long) i);
            return fVar4.A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @NullableDecl
        public f<E> w(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, this.a);
            if (iCompare > 0) {
                f<E> fVar = this.g;
                return fVar == null ? this : (f) MoreObjects.firstNonNull(fVar.w(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            f<E> fVar2 = this.f;
            if (fVar2 == null) {
                return null;
            }
            return fVar2.w(comparator, e);
        }

        private static int z(@NullableDecl f<?> fVar) {
            if (fVar == null) {
                return 0;
            }
            return ((f) fVar).e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f<E> E(Comparator<? super E> comparator, @NullableDecl E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, this.a);
            if (iCompare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f = fVar.E(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.c--;
                        this.d -= (long) iArr[0];
                    } else {
                        this.d -= (long) i;
                    }
                }
                return iArr[0] == 0 ? this : A();
            }
            if (iCompare <= 0) {
                int i2 = this.b;
                iArr[0] = i2;
                if (i >= i2) {
                    return v();
                }
                this.b = i2 - i;
                this.d -= (long) i;
                return this;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.g = fVar2.E(comparator, e, i, iArr);
            if (iArr[0] > 0) {
                if (i >= iArr[0]) {
                    this.c--;
                    this.d -= (long) iArr[0];
                } else {
                    this.d -= (long) i;
                }
            }
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f<E> J(Comparator<? super E> comparator, @NullableDecl E e, int i, int i2, int[] iArr) {
            int iCompare = comparator.compare(e, this.a);
            if (iCompare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return (i != 0 || i2 <= 0) ? this : q(e, i2);
                }
                this.f = fVar.J(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.c--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.c++;
                    }
                    this.d += (long) (i2 - iArr[0]);
                }
                return A();
            }
            if (iCompare <= 0) {
                int i3 = this.b;
                iArr[0] = i3;
                if (i == i3) {
                    if (i2 == 0) {
                        return v();
                    }
                    this.d += (long) (i2 - i3);
                    this.b = i2;
                }
                return this;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return (i != 0 || i2 <= 0) ? this : r(e, i2);
            }
            this.g = fVar2.J(comparator, e, i, i2, iArr);
            if (iArr[0] == i) {
                if (i2 == 0 && iArr[0] != 0) {
                    this.c--;
                } else if (i2 > 0 && iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) (i2 - iArr[0]);
            }
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f<E> K(Comparator<? super E> comparator, @NullableDecl E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, this.a);
            if (iCompare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return i > 0 ? q(e, i) : this;
                }
                this.f = fVar.K(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) (i - iArr[0]);
                return A();
            }
            if (iCompare <= 0) {
                int i2 = this.b;
                iArr[0] = i2;
                if (i == 0) {
                    return v();
                }
                this.d += (long) (i - i2);
                this.b = i;
                return this;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return i > 0 ? r(e, i) : this;
            }
            this.g = fVar2.K(comparator, e, i, iArr);
            if (i == 0 && iArr[0] != 0) {
                this.c--;
            } else if (i > 0 && iArr[0] == 0) {
                this.c++;
            }
            this.d += (long) (i - iArr[0]);
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f<E> p(Comparator<? super E> comparator, @NullableDecl E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, this.a);
            if (iCompare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return q(e, i);
                }
                int i2 = fVar.e;
                f<E> fVarP = fVar.p(comparator, e, i, iArr);
                this.f = fVarP;
                if (iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) i;
                return fVarP.e == i2 ? this : A();
            }
            if (iCompare <= 0) {
                int i3 = this.b;
                iArr[0] = i3;
                long j = i;
                Preconditions.checkArgument(((long) i3) + j <= ParserMinimalBase.MAX_INT_L);
                this.b += i;
                this.d += j;
                return this;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return r(e, i);
            }
            int i4 = fVar2.e;
            f<E> fVarP2 = fVar2.p(comparator, e, i, iArr);
            this.g = fVarP2;
            if (iArr[0] == 0) {
                this.c++;
            }
            this.d += (long) i;
            return fVarP2.e == i4 ? this : A();
        }

        public String toString() {
            return Multisets.immutableEntry(y(), x()).toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int u(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, this.a);
            if (iCompare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    return 0;
                }
                return fVar.u(comparator, e);
            }
            if (iCompare <= 0) {
                return this.b;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                return 0;
            }
            return fVar2.u(comparator, e);
        }

        public int x() {
            return this.b;
        }

        public E y() {
            return this.a;
        }
    }

    public static final class g<T> {

        @NullableDecl
        private T a;

        private g() {
        }

        public void a(@NullableDecl T t, T t2) {
            if (this.a != t) {
                throw new ConcurrentModificationException();
            }
            this.a = t2;
        }

        public void b() {
            this.a = null;
        }

        @NullableDecl
        public T c() {
            return this.a;
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public TreeMultiset(g<f<E>> gVar, y0<E> y0Var, f<E> fVar) {
        super(y0Var.b());
        this.e = gVar;
        this.f = y0Var;
        this.g = fVar;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(Ordering.natural());
    }

    private long q(e eVar, @NullableDecl f<E> fVar) {
        long jB;
        long jQ;
        if (fVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(this.f.j(), ((f) fVar).a);
        if (iCompare > 0) {
            return q(eVar, ((f) fVar).g);
        }
        if (iCompare == 0) {
            int i = d.a[this.f.i().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return eVar.b(((f) fVar).g);
                }
                throw new AssertionError();
            }
            jB = eVar.a(fVar);
            jQ = eVar.b(((f) fVar).g);
        } else {
            jB = eVar.b(((f) fVar).g) + ((long) eVar.a(fVar));
            jQ = q(eVar, ((f) fVar).f);
        }
        return jB + jQ;
    }

    private long r(e eVar, @NullableDecl f<E> fVar) {
        long jB;
        long jR;
        if (fVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(this.f.h(), ((f) fVar).a);
        if (iCompare < 0) {
            return r(eVar, ((f) fVar).f);
        }
        if (iCompare == 0) {
            int i = d.a[this.f.g().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return eVar.b(((f) fVar).f);
                }
                throw new AssertionError();
            }
            jB = eVar.a(fVar);
            jR = eVar.b(((f) fVar).f);
        } else {
            jB = eVar.b(((f) fVar).f) + ((long) eVar.a(fVar));
            jR = r(eVar, ((f) fVar).g);
        }
        return jB + jR;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        k2.a(m.class, "comparator").b(this, comparator);
        k2.a(TreeMultiset.class, "range").b(this, y0.a(comparator));
        k2.a(TreeMultiset.class, "rootReference").b(this, new g(null));
        f fVar = new f(null, 1);
        k2.a(TreeMultiset.class, "header").b(this, fVar);
        w(fVar, fVar);
        k2.f(this, objectInputStream);
    }

    private long s(e eVar) {
        f<E> fVarC = this.e.c();
        long jB = eVar.b(fVarC);
        if (this.f.k()) {
            jB -= r(eVar, fVarC);
        }
        return this.f.m() ? jB - q(eVar, fVarC) : jB;
    }

    public static int t(@NullableDecl f<?> fVar) {
        if (fVar == null) {
            return 0;
        }
        return ((f) fVar).c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public f<E> u() {
        f<E> fVarT;
        if (this.e.c() == null) {
            return null;
        }
        if (this.f.k()) {
            E eH = this.f.h();
            fVarT = this.e.c().t(comparator(), eH);
            if (fVarT == null) {
                return null;
            }
            if (this.f.g() == BoundType.OPEN && comparator().compare(eH, fVarT.y()) == 0) {
                fVarT = ((f) fVarT).i;
            }
        } else {
            fVarT = ((f) this.g).i;
        }
        if (fVarT == this.g || !this.f.c(fVarT.y())) {
            return null;
        }
        return fVarT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public f<E> v() {
        f<E> fVarW;
        if (this.e.c() == null) {
            return null;
        }
        if (this.f.m()) {
            E eJ = this.f.j();
            fVarW = this.e.c().w(comparator(), eJ);
            if (fVarW == null) {
                return null;
            }
            if (this.f.i() == BoundType.OPEN && comparator().compare(eJ, fVarW.y()) == 0) {
                fVarW = ((f) fVarW).h;
            }
        } else {
            fVarW = ((f) this.g).h;
        }
        if (fVarW == this.g || !this.f.c(fVarW.y())) {
            return null;
        }
        return fVarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void w(f<T> fVar, f<T> fVar2) {
        ((f) fVar).i = fVar2;
        ((f) fVar2).h = fVar;
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        k2.k(this, objectOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void x(f<T> fVar, f<T> fVar2, f<T> fVar3) {
        w(fVar, fVar2);
        w(fVar2, fVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset.Entry<E> y(f<E> fVar) {
        return new a(fVar);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(@NullableDecl E e2, int i) {
        u.b(i, "occurrences");
        if (i == 0) {
            return count(e2);
        }
        Preconditions.checkArgument(this.f.c(e2));
        f<E> fVarC = this.e.c();
        if (fVarC != null) {
            int[] iArr = new int[1];
            this.e.a(fVarC, fVarC.p(comparator(), e2, i, iArr));
            return iArr[0];
        }
        comparator().compare(e2, e2);
        f<E> fVar = new f<>(e2, i);
        f<E> fVar2 = this.g;
        x(fVar2, fVar, fVar2);
        this.e.a(fVarC, fVar);
        return 0;
    }

    @Override // com.google.common.collect.h
    public int b() {
        return Ints.saturatedCast(s(e.DISTINCT));
    }

    @Override // com.google.common.collect.h
    public Iterator<E> c() {
        return Multisets.e(e());
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f.k() || this.f.m()) {
            Iterators.c(e());
            return;
        }
        f<E> fVar = ((f) this.g).i;
        while (true) {
            f<E> fVar2 = this.g;
            if (fVar == fVar2) {
                w(fVar2, fVar2);
                this.e.b();
                return;
            }
            f<E> fVar3 = ((f) fVar).i;
            ((f) fVar).b = 0;
            ((f) fVar).f = null;
            ((f) fVar).g = null;
            ((f) fVar).h = null;
            ((f) fVar).i = null;
            fVar = fVar3;
        }
    }

    @Override // com.google.common.collect.m, com.google.common.collect.SortedMultiset, com.google.common.collect.n2
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@NullableDecl Object obj) {
        try {
            f<E> fVarC = this.e.c();
            if (this.f.c(obj) && fVarC != null) {
                return fVarC.u(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.m, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.h
    public Iterator<Multiset.Entry<E>> e() {
        return new b();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.m
    public Iterator<Multiset.Entry<E>> h() {
        return new c();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(@NullableDecl E e2, BoundType boundType) {
        return new TreeMultiset(this.e, this.f.n(y0.t(comparator(), e2, boundType)), this.g);
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i) {
        u.b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        f<E> fVarC = this.e.c();
        int[] iArr = new int[1];
        try {
            if (this.f.c(obj) && fVarC != null) {
                this.e.a(fVarC, fVarC.E(comparator(), obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(@NullableDecl E e2, int i) {
        u.b(i, "count");
        if (!this.f.c(e2)) {
            Preconditions.checkArgument(i == 0);
            return 0;
        }
        f<E> fVarC = this.e.c();
        if (fVarC == null) {
            if (i > 0) {
                add(e2, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.e.a(fVarC, fVarC.K(comparator(), e2, i, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.saturatedCast(s(e.SIZE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset subMultiset(@NullableDecl Object obj, BoundType boundType, @NullableDecl Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(@NullableDecl E e2, BoundType boundType) {
        return new TreeMultiset(this.e, this.f.n(y0.e(comparator(), e2, boundType)), this.g);
    }

    public static <E> TreeMultiset<E> create(@NullableDecl Comparator<? super E> comparator) {
        return comparator == null ? new TreeMultiset<>(Ordering.natural()) : new TreeMultiset<>(comparator);
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> treeMultisetCreate = create();
        Iterables.addAll(treeMultisetCreate, iterable);
        return treeMultisetCreate;
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.f = y0.a(comparator);
        f<E> fVar = new f<>(null, 1);
        this.g = fVar;
        w(fVar, fVar);
        this.e = new g<>(null);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(@NullableDecl E e2, int i, int i2) {
        u.b(i2, "newCount");
        u.b(i, "oldCount");
        Preconditions.checkArgument(this.f.c(e2));
        f<E> fVarC = this.e.c();
        if (fVarC != null) {
            int[] iArr = new int[1];
            this.e.a(fVarC, fVarC.J(comparator(), e2, i, i2, iArr));
            return iArr[0] == i;
        }
        if (i != 0) {
            return false;
        }
        if (i2 > 0) {
            add(e2, i2);
        }
        return true;
    }
}
