package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import com.huawei.hms.network.embedded.g4;
import defpackage.amv;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    private static final long serialVersionUID = 0;
    final C endpoint;

    Cut<C> canonical(DiscreteDomain<C> discreteDomain) {
        return this;
    }

    public abstract void describeAsLowerBound(StringBuilder sb);

    public abstract void describeAsUpperBound(StringBuilder sb);

    @CheckForNull
    public abstract C greatestValueBelow(DiscreteDomain<C> discreteDomain);

    public abstract int hashCode();

    public abstract boolean isLessThan(C c2);

    @CheckForNull
    public abstract C leastValueAbove(DiscreteDomain<C> discreteDomain);

    abstract BoundType typeAsLowerBound();

    abstract BoundType typeAsUpperBound();

    public abstract Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain);

    public abstract Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain);

    Cut(C c2) {
        this.endpoint = c2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Cut<C> cut) {
        if (cut == belowAll()) {
            return 1;
        }
        if (cut == aboveAll()) {
            return -1;
        }
        int iB = amv.b(this.endpoint, cut.endpoint);
        return iB != 0 ? iB : Booleans.a(this instanceof b, cut instanceof b);
    }

    public C endpoint() {
        return this.endpoint;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        try {
            return compareTo((Cut) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public static <C extends Comparable> Cut<C> belowAll() {
        return e.f4316b;
    }

    static final class e extends Cut<Comparable<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final e f4316b = new e();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public boolean isLessThan(Comparable<?> comparable) {
            return true;
        }

        private e() {
            super("");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Comparable<?> endpoint() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        BoundType typeAsLowerBound() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        BoundType typeAsUpperBound() {
            throw new AssertionError("this statement should be unreachable");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withLowerBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withUpperBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
            sb.append("(-∞");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Comparable<?> leastValueAbove(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.minValue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Comparable<?> greatestValueBelow(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        Cut<Comparable<?>> canonical(DiscreteDomain<Comparable<?>> discreteDomain) {
            try {
                return Cut.belowValue(discreteDomain.minValue());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        public String toString() {
            return "-∞";
        }

        private Object readResolve() {
            return f4316b;
        }
    }

    public static <C extends Comparable> Cut<C> aboveAll() {
        return d.f4315a;
    }

    static final class d extends Cut<Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f4315a = new d();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public boolean isLessThan(Comparable<?> comparable) {
            return false;
        }

        private d() {
            super("");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Comparable<?> endpoint() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        BoundType typeAsLowerBound() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        BoundType typeAsUpperBound() {
            throw new IllegalStateException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withLowerBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withUpperBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
            sb.append("+∞)");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Comparable<?> leastValueAbove(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Comparable<?> greatestValueBelow(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.maxValue();
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        public String toString() {
            return "+∞";
        }

        private Object readResolve() {
            return f4315a;
        }
    }

    public static <C extends Comparable> Cut<C> belowValue(C c2) {
        return new a(c2);
    }

    static final class a<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) obj);
        }

        a(C c2) {
            super((Comparable) Preconditions.checkNotNull(c2));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public boolean isLessThan(C c2) {
            return amv.b(this.endpoint, c2) <= 0;
        }

        @Override // com.google.common.collect.Cut
        BoundType typeAsLowerBound() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        BoundType typeAsUpperBound() {
            return BoundType.OPEN;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = AnonymousClass3.e[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                Comparable comparablePrevious = discreteDomain.previous(this.endpoint);
                return comparablePrevious == null ? Cut.belowAll() : new b(comparablePrevious);
            }
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = AnonymousClass3.e[boundType.ordinal()];
            if (i == 1) {
                Comparable comparablePrevious = discreteDomain.previous(this.endpoint);
                return comparablePrevious == null ? Cut.aboveAll() : new b(comparablePrevious);
            }
            if (i == 2) {
                return this;
            }
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
            sb.append('[');
            sb.append(this.endpoint);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(g4.l);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public C leastValueAbove(DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        @CheckForNull
        public C greatestValueBelow(DiscreteDomain<C> discreteDomain) {
            return (C) discreteDomain.previous(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return this.endpoint.hashCode();
        }

        public String toString() {
            return "\\" + this.endpoint + "/";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Cut$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[BoundType.values().length];
            e = iArr;
            try {
                iArr[BoundType.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[BoundType.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static <C extends Comparable> Cut<C> aboveValue(C c2) {
        return new b(c2);
    }

    static final class b<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) obj);
        }

        b(C c2) {
            super((Comparable) Preconditions.checkNotNull(c2));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public boolean isLessThan(C c2) {
            return amv.b(this.endpoint, c2) < 0;
        }

        @Override // com.google.common.collect.Cut
        BoundType typeAsLowerBound() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        BoundType typeAsUpperBound() {
            return BoundType.CLOSED;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = AnonymousClass3.e[boundType.ordinal()];
            if (i == 1) {
                Comparable next = discreteDomain.next(this.endpoint);
                return next == null ? Cut.belowAll() : belowValue(next);
            }
            if (i == 2) {
                return this;
            }
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = AnonymousClass3.e[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                Comparable next = discreteDomain.next(this.endpoint);
                return next == null ? Cut.aboveAll() : belowValue(next);
            }
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
            sb.append(g4.k);
            sb.append(this.endpoint);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(']');
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        @CheckForNull
        public C leastValueAbove(DiscreteDomain<C> discreteDomain) {
            return (C) discreteDomain.next(this.endpoint);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        public C greatestValueBelow(DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        @Override // com.google.common.collect.Cut
        Cut<C> canonical(DiscreteDomain<C> discreteDomain) {
            Comparable comparableLeastValueAbove = leastValueAbove(discreteDomain);
            return comparableLeastValueAbove != null ? belowValue(comparableLeastValueAbove) : Cut.aboveAll();
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return ~this.endpoint.hashCode();
        }

        public String toString() {
            return "/" + this.endpoint + "\\";
        }
    }
}
