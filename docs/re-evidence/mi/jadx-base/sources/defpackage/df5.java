package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class df5<C extends Comparable> implements Comparable<df5<C>>, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f15472a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15473a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f15473a = iArr;
            try {
                iArr[BoundType.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15473a[BoundType.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class b extends df5<Comparable<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f15474b = new b();
        private static final long serialVersionUID = 0;

        public b() {
            super("");
        }

        private Object readResolve() {
            return f15474b;
        }

        @Override // defpackage.df5, java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(df5<Comparable<?>> df5Var) {
            return df5Var == this ? 0 : 1;
        }

        @Override // defpackage.df5
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // defpackage.df5
        public void i(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // defpackage.df5
        public void k(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // defpackage.df5
        public Comparable<?> m() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // defpackage.df5
        public Comparable<?> n(ey6<Comparable<?>> ey6Var) {
            return ey6Var.d();
        }

        @Override // defpackage.df5
        public boolean o(Comparable<?> comparable) {
            return false;
        }

        @Override // defpackage.df5
        public Comparable<?> p(ey6<Comparable<?>> ey6Var) {
            throw new AssertionError();
        }

        @Override // defpackage.df5
        public BoundType r() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // defpackage.df5
        public BoundType s() {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }

        @Override // defpackage.df5
        public df5<Comparable<?>> u(BoundType boundType, ey6<Comparable<?>> ey6Var) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // defpackage.df5
        public df5<Comparable<?>> w(BoundType boundType, ey6<Comparable<?>> ey6Var) {
            throw new IllegalStateException();
        }
    }

    public static final class c<C extends Comparable> extends df5<C> {
        private static final long serialVersionUID = 0;

        public c(C c) {
            super((Comparable) c6i.o(c));
        }

        @Override // defpackage.df5, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((df5) obj);
        }

        @Override // defpackage.df5
        public df5<C> e(ey6<C> ey6Var) {
            Comparable comparableP = p(ey6Var);
            return comparableP != null ? df5.d(comparableP) : df5.a();
        }

        @Override // defpackage.df5
        public int hashCode() {
            return ~this.f15472a.hashCode();
        }

        @Override // defpackage.df5
        public void i(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f15472a);
        }

        @Override // defpackage.df5
        public void k(StringBuilder sb) {
            sb.append(this.f15472a);
            sb.append(AbstractJsonLexerKt.END_LIST);
        }

        @Override // defpackage.df5
        public C n(ey6<C> ey6Var) {
            return this.f15472a;
        }

        @Override // defpackage.df5
        public boolean o(C c) {
            return Range.compareOrThrow(this.f15472a, c) < 0;
        }

        @Override // defpackage.df5
        public C p(ey6<C> ey6Var) {
            return (C) ey6Var.f(this.f15472a);
        }

        @Override // defpackage.df5
        public BoundType r() {
            return BoundType.OPEN;
        }

        @Override // defpackage.df5
        public BoundType s() {
            return BoundType.CLOSED;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f15472a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 2);
            sb.append("/");
            sb.append(strValueOf);
            sb.append("\\");
            return sb.toString();
        }

        @Override // defpackage.df5
        public df5<C> u(BoundType boundType, ey6<C> ey6Var) {
            int i = a.f15473a[boundType.ordinal()];
            if (i == 1) {
                Comparable comparableF = ey6Var.f(this.f15472a);
                return comparableF == null ? df5.c() : df5.d(comparableF);
            }
            if (i == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // defpackage.df5
        public df5<C> w(BoundType boundType, ey6<C> ey6Var) {
            int i = a.f15473a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i != 2) {
                throw new AssertionError();
            }
            Comparable comparableF = ey6Var.f(this.f15472a);
            return comparableF == null ? df5.a() : df5.d(comparableF);
        }
    }

    public static final class d extends df5<Comparable<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f15475b = new d();
        private static final long serialVersionUID = 0;

        public d() {
            super("");
        }

        private Object readResolve() {
            return f15475b;
        }

        @Override // defpackage.df5
        public df5<Comparable<?>> e(ey6<Comparable<?>> ey6Var) {
            try {
                return df5.d(ey6Var.e());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // defpackage.df5, java.lang.Comparable
        /* JADX INFO: renamed from: h */
        public int compareTo(df5<Comparable<?>> df5Var) {
            return df5Var == this ? 0 : -1;
        }

        @Override // defpackage.df5
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // defpackage.df5
        public void i(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // defpackage.df5
        public void k(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // defpackage.df5
        public Comparable<?> m() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // defpackage.df5
        public Comparable<?> n(ey6<Comparable<?>> ey6Var) {
            throw new AssertionError();
        }

        @Override // defpackage.df5
        public boolean o(Comparable<?> comparable) {
            return true;
        }

        @Override // defpackage.df5
        public Comparable<?> p(ey6<Comparable<?>> ey6Var) {
            return ey6Var.e();
        }

        @Override // defpackage.df5
        public BoundType r() {
            throw new IllegalStateException();
        }

        @Override // defpackage.df5
        public BoundType s() {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }

        @Override // defpackage.df5
        public df5<Comparable<?>> u(BoundType boundType, ey6<Comparable<?>> ey6Var) {
            throw new IllegalStateException();
        }

        @Override // defpackage.df5
        public df5<Comparable<?>> w(BoundType boundType, ey6<Comparable<?>> ey6Var) {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    public static final class e<C extends Comparable> extends df5<C> {
        private static final long serialVersionUID = 0;

        public e(C c) {
            super((Comparable) c6i.o(c));
        }

        @Override // defpackage.df5, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((df5) obj);
        }

        @Override // defpackage.df5
        public int hashCode() {
            return this.f15472a.hashCode();
        }

        @Override // defpackage.df5
        public void i(StringBuilder sb) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.f15472a);
        }

        @Override // defpackage.df5
        public void k(StringBuilder sb) {
            sb.append(this.f15472a);
            sb.append(')');
        }

        @Override // defpackage.df5
        public C n(ey6<C> ey6Var) {
            return (C) ey6Var.h(this.f15472a);
        }

        @Override // defpackage.df5
        public boolean o(C c) {
            return Range.compareOrThrow(this.f15472a, c) <= 0;
        }

        @Override // defpackage.df5
        public C p(ey6<C> ey6Var) {
            return this.f15472a;
        }

        @Override // defpackage.df5
        public BoundType r() {
            return BoundType.CLOSED;
        }

        @Override // defpackage.df5
        public BoundType s() {
            return BoundType.OPEN;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f15472a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 2);
            sb.append("\\");
            sb.append(strValueOf);
            sb.append("/");
            return sb.toString();
        }

        @Override // defpackage.df5
        public df5<C> u(BoundType boundType, ey6<C> ey6Var) {
            int i = a.f15473a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i != 2) {
                throw new AssertionError();
            }
            Comparable comparableH = ey6Var.h(this.f15472a);
            return comparableH == null ? df5.c() : new c(comparableH);
        }

        @Override // defpackage.df5
        public df5<C> w(BoundType boundType, ey6<C> ey6Var) {
            int i = a.f15473a[boundType.ordinal()];
            if (i == 1) {
                Comparable comparableH = ey6Var.h(this.f15472a);
                return comparableH == null ? df5.a() : new c(comparableH);
            }
            if (i == 2) {
                return this;
            }
            throw new AssertionError();
        }
    }

    public df5(C c2) {
        this.f15472a = c2;
    }

    public static <C extends Comparable> df5<C> a() {
        return b.f15474b;
    }

    public static <C extends Comparable> df5<C> b(C c2) {
        return new c(c2);
    }

    public static <C extends Comparable> df5<C> c() {
        return d.f15475b;
    }

    public static <C extends Comparable> df5<C> d(C c2) {
        return new e(c2);
    }

    public df5<C> e(ey6<C> ey6Var) {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof df5)) {
            return false;
        }
        try {
            return compareTo((df5) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h */
    public int compareTo(df5<C> df5Var) {
        if (df5Var == c()) {
            return 1;
        }
        if (df5Var == a()) {
            return -1;
        }
        int iCompareOrThrow = Range.compareOrThrow(this.f15472a, df5Var.f15472a);
        return iCompareOrThrow != 0 ? iCompareOrThrow : t43.a(this instanceof c, df5Var instanceof c);
    }

    public abstract int hashCode();

    public abstract void i(StringBuilder sb);

    public abstract void k(StringBuilder sb);

    public C m() {
        return this.f15472a;
    }

    public abstract C n(ey6<C> ey6Var);

    public abstract boolean o(C c2);

    public abstract C p(ey6<C> ey6Var);

    public abstract BoundType r();

    public abstract BoundType s();

    public abstract df5<C> u(BoundType boundType, ey6<C> ey6Var);

    public abstract df5<C> w(BoundType boundType, ey6<C> ey6Var);
}
