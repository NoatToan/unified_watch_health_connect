package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
abstract class d0<C extends Comparable> implements Comparable<d0<C>>, Serializable {
    private static final long serialVersionUID = 0;

    @NullableDecl
    public final C a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BoundType.values().length];
            a = iArr;
            try {
                iArr[BoundType.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BoundType.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class b extends d0<Comparable<?>> {
        private static final b b = new b();
        private static final long serialVersionUID = 0;

        private b() {
            super(null);
        }

        private Object readResolve() {
            return b;
        }

        @Override // com.google.common.collect.d0, java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(d0<Comparable<?>> d0Var) {
            return d0Var == this ? 0 : 1;
        }

        @Override // com.google.common.collect.d0
        public void h(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.d0
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.d0
        public void i(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.d0
        public Comparable<?> j() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.d0
        public Comparable<?> k(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.maxValue();
        }

        @Override // com.google.common.collect.d0
        public boolean m(Comparable<?> comparable) {
            return false;
        }

        @Override // com.google.common.collect.d0
        public Comparable<?> n(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.d0
        public BoundType o() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.d0
        public BoundType p() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.d0
        public d0<Comparable<?>> q(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.d0
        public d0<Comparable<?>> r(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }
    }

    public static final class c<C extends Comparable> extends d0<C> {
        private static final long serialVersionUID = 0;

        public c(C c) {
            super((Comparable) Preconditions.checkNotNull(c));
        }

        @Override // com.google.common.collect.d0, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((d0) obj);
        }

        @Override // com.google.common.collect.d0
        public d0<C> f(DiscreteDomain<C> discreteDomain) {
            Comparable comparableN = n(discreteDomain);
            return comparableN != null ? d0.e(comparableN) : d0.a();
        }

        @Override // com.google.common.collect.d0
        public void h(StringBuilder sb) {
            sb.append('(');
            sb.append(this.a);
        }

        @Override // com.google.common.collect.d0
        public int hashCode() {
            return ~this.a.hashCode();
        }

        @Override // com.google.common.collect.d0
        public void i(StringBuilder sb) {
            sb.append(this.a);
            sb.append(JsonLexerKt.END_LIST);
        }

        @Override // com.google.common.collect.d0
        public C k(DiscreteDomain<C> discreteDomain) {
            return this.a;
        }

        @Override // com.google.common.collect.d0
        public boolean m(C c) {
            return Range.b(this.a, c) < 0;
        }

        @Override // com.google.common.collect.d0
        public C n(DiscreteDomain<C> discreteDomain) {
            return (C) discreteDomain.next(this.a);
        }

        @Override // com.google.common.collect.d0
        public BoundType o() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.d0
        public BoundType p() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.d0
        public d0<C> q(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = a.a[boundType.ordinal()];
            if (i == 1) {
                Comparable next = discreteDomain.next(this.a);
                return next == null ? d0.c() : d0.e(next);
            }
            if (i == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.d0
        public d0<C> r(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = a.a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i != 2) {
                throw new AssertionError();
            }
            Comparable next = discreteDomain.next(this.a);
            return next == null ? d0.a() : d0.e(next);
        }

        public String toString() {
            return FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.a + "\\";
        }
    }

    public static final class d extends d0<Comparable<?>> {
        private static final d b = new d();
        private static final long serialVersionUID = 0;

        private d() {
            super(null);
        }

        private Object readResolve() {
            return b;
        }

        @Override // com.google.common.collect.d0
        public d0<Comparable<?>> f(DiscreteDomain<Comparable<?>> discreteDomain) {
            try {
                return d0.e(discreteDomain.minValue());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.d0, java.lang.Comparable
        /* JADX INFO: renamed from: g */
        public int compareTo(d0<Comparable<?>> d0Var) {
            return d0Var == this ? 0 : -1;
        }

        @Override // com.google.common.collect.d0
        public void h(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.d0
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.d0
        public void i(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.d0
        public Comparable<?> j() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.d0
        public Comparable<?> k(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.d0
        public boolean m(Comparable<?> comparable) {
            return true;
        }

        @Override // com.google.common.collect.d0
        public Comparable<?> n(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.minValue();
        }

        @Override // com.google.common.collect.d0
        public BoundType o() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.d0
        public BoundType p() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.d0
        public d0<Comparable<?>> q(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.d0
        public d0<Comparable<?>> r(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }
    }

    public static final class e<C extends Comparable> extends d0<C> {
        private static final long serialVersionUID = 0;

        public e(C c) {
            super((Comparable) Preconditions.checkNotNull(c));
        }

        @Override // com.google.common.collect.d0, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((d0) obj);
        }

        @Override // com.google.common.collect.d0
        public void h(StringBuilder sb) {
            sb.append(JsonLexerKt.BEGIN_LIST);
            sb.append(this.a);
        }

        @Override // com.google.common.collect.d0
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.google.common.collect.d0
        public void i(StringBuilder sb) {
            sb.append(this.a);
            sb.append(')');
        }

        @Override // com.google.common.collect.d0
        public C k(DiscreteDomain<C> discreteDomain) {
            return (C) discreteDomain.previous(this.a);
        }

        @Override // com.google.common.collect.d0
        public boolean m(C c) {
            return Range.b(this.a, c) <= 0;
        }

        @Override // com.google.common.collect.d0
        public C n(DiscreteDomain<C> discreteDomain) {
            return this.a;
        }

        @Override // com.google.common.collect.d0
        public BoundType o() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.d0
        public BoundType p() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.d0
        public d0<C> q(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = a.a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i != 2) {
                throw new AssertionError();
            }
            Comparable comparablePrevious = discreteDomain.previous(this.a);
            return comparablePrevious == null ? d0.c() : new c(comparablePrevious);
        }

        @Override // com.google.common.collect.d0
        public d0<C> r(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = a.a[boundType.ordinal()];
            if (i == 1) {
                Comparable comparablePrevious = discreteDomain.previous(this.a);
                return comparablePrevious == null ? d0.a() : new c(comparablePrevious);
            }
            if (i == 2) {
                return this;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "\\" + this.a + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        }
    }

    public d0(@NullableDecl C c2) {
        this.a = c2;
    }

    public static <C extends Comparable> d0<C> a() {
        return b.b;
    }

    public static <C extends Comparable> d0<C> b(C c2) {
        return new c(c2);
    }

    public static <C extends Comparable> d0<C> c() {
        return d.b;
    }

    public static <C extends Comparable> d0<C> e(C c2) {
        return new e(c2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        try {
            return compareTo((d0) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public d0<C> f(DiscreteDomain<C> discreteDomain) {
        return this;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g */
    public int compareTo(d0<C> d0Var) {
        if (d0Var == c()) {
            return 1;
        }
        if (d0Var == a()) {
            return -1;
        }
        int iB = Range.b(this.a, d0Var.a);
        return iB != 0 ? iB : Booleans.compare(this instanceof c, d0Var instanceof c);
    }

    public abstract void h(StringBuilder sb);

    public abstract int hashCode();

    public abstract void i(StringBuilder sb);

    public C j() {
        return this.a;
    }

    public abstract C k(DiscreteDomain<C> discreteDomain);

    public abstract boolean m(C c2);

    public abstract C n(DiscreteDomain<C> discreteDomain);

    public abstract BoundType o();

    public abstract BoundType p();

    public abstract d0<C> q(BoundType boundType, DiscreteDomain<C> discreteDomain);

    public abstract d0<C> r(BoundType boundType, DiscreteDomain<C> discreteDomain);
}
