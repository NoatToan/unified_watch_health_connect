package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean a;

    @LazyInit
    @MonotonicNonNullDecl
    private transient Converter<B, A> b;

    public class a implements Iterable<B> {
        public final /* synthetic */ Iterable a;

        /* JADX INFO: renamed from: com.google.common.base.Converter$a$a, reason: collision with other inner class name */
        public class C0161a implements Iterator<B> {
            private final Iterator<? extends A> a;

            public C0161a() {
                this.a = a.this.a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) Converter.this.convert(this.a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.a.remove();
            }
        }

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new C0161a();
        }
    }

    public static final class b<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Converter<A, B> c;
        public final Converter<B, C> d;

        public b(Converter<A, B> converter, Converter<B, C> converter2) {
            this.c = converter;
            this.d = converter2;
        }

        @Override // com.google.common.base.Converter
        @NullableDecl
        public A a(@NullableDecl C c) {
            return (A) this.c.a(this.d.a(c));
        }

        @Override // com.google.common.base.Converter
        @NullableDecl
        public C b(@NullableDecl A a) {
            return (C) this.d.b(this.c.b(a));
        }

        @Override // com.google.common.base.Converter
        public A doBackward(C c) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public C doForward(A a) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.c.equals(bVar.c) && this.d.equals(bVar.d);
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            return this.c + ".andThen(" + this.d + ")";
        }
    }

    public static final class c<A, B> extends Converter<A, B> implements Serializable {
        private final Function<? super A, ? extends B> c;
        private final Function<? super B, ? extends A> d;

        public /* synthetic */ c(Function function, Function function2, a aVar) {
            this(function, function2);
        }

        @Override // com.google.common.base.Converter
        public A doBackward(B b) {
            return this.d.apply(b);
        }

        @Override // com.google.common.base.Converter
        public B doForward(A a) {
            return this.c.apply(a);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.c.equals(cVar.c) && this.d.equals(cVar.d);
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.c + ", " + this.d + ")";
        }

        private c(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            this.c = (Function) Preconditions.checkNotNull(function);
            this.d = (Function) Preconditions.checkNotNull(function2);
        }
    }

    public static final class d<T> extends Converter<T, T> implements Serializable {
        public static final d c = new d();
        private static final long serialVersionUID = 0;

        private d() {
        }

        private Object readResolve() {
            return c;
        }

        @Override // com.google.common.base.Converter
        public <S> Converter<T, S> c(Converter<T, S> converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        @Override // com.google.common.base.Converter
        public T doBackward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        public T doForward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public d<T> reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    public static final class e<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Converter<A, B> c;

        public e(Converter<A, B> converter) {
            this.c = converter;
        }

        @Override // com.google.common.base.Converter
        @NullableDecl
        public B a(@NullableDecl A a) {
            return this.c.b(a);
        }

        @Override // com.google.common.base.Converter
        @NullableDecl
        public A b(@NullableDecl B b) {
            return this.c.a(b);
        }

        @Override // com.google.common.base.Converter
        public B doBackward(A a) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public A doForward(B b) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof e) {
                return this.c.equals(((e) obj).c);
            }
            return false;
        }

        public int hashCode() {
            return ~this.c.hashCode();
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> reverse() {
            return this.c;
        }

        public String toString() {
            return this.c + ".reverse()";
        }
    }

    public Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new c(function, function2, null);
    }

    public static <T> Converter<T, T> identity() {
        return d.c;
    }

    @NullableDecl
    public A a(@NullableDecl B b2) {
        if (!this.a) {
            return doBackward(b2);
        }
        if (b2 == null) {
            return null;
        }
        return (A) Preconditions.checkNotNull(doBackward(b2));
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return c(converter);
    }

    @Override // com.google.common.base.Function
    @CanIgnoreReturnValue
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a2) {
        return convert(a2);
    }

    @NullableDecl
    public B b(@NullableDecl A a2) {
        if (!this.a) {
            return doForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return (B) Preconditions.checkNotNull(doForward(a2));
    }

    public <C> Converter<A, C> c(Converter<B, C> converter) {
        return new b(this, (Converter) Preconditions.checkNotNull(converter));
    }

    @CanIgnoreReturnValue
    @NullableDecl
    public final B convert(@NullableDecl A a2) {
        return b(a2);
    }

    @CanIgnoreReturnValue
    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new a(iterable);
    }

    @ForOverride
    public abstract A doBackward(B b2);

    @ForOverride
    public abstract B doForward(A a2);

    @Override // com.google.common.base.Function
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.b;
        if (converter != null) {
            return converter;
        }
        e eVar = new e(this);
        this.b = eVar;
        return eVar;
    }

    public Converter(boolean z) {
        this.a = z;
    }
}
