package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    @RetainedWith
    @LazyInit
    private transient Converter<B, A> reverse;

    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> first;
        final Converter<B, C> second;

        public ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
            this.first = converter;
            this.second = converter2;
        }

        @Override // com.google.common.base.Converter
        public A correctedDoBackward(C c14) {
            return (A) this.first.correctedDoBackward(this.second.correctedDoBackward(c14));
        }

        @Override // com.google.common.base.Converter
        public C correctedDoForward(A a14) {
            return (C) this.second.correctedDoForward(this.first.correctedDoForward(a14));
        }

        @Override // com.google.common.base.Converter
        public A doBackward(C c14) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public C doForward(A a14) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ConverterComposition) {
                ConverterComposition converterComposition = (ConverterComposition) obj;
                if (this.first.equals(converterComposition.first) && this.second.equals(converterComposition.second)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.second.hashCode() + (this.first.hashCode() * 31);
        }

        public String toString() {
            return this.first + ".andThen(" + this.second + ")";
        }
    }

    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final Function<? super B, ? extends A> backwardFunction;
        private final Function<? super A, ? extends B> forwardFunction;

        private FunctionBasedConverter(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            this.forwardFunction = (Function) Preconditions.checkNotNull(function);
            this.backwardFunction = (Function) Preconditions.checkNotNull(function2);
        }

        @Override // com.google.common.base.Converter
        public A doBackward(B b14) {
            return this.backwardFunction.apply(b14);
        }

        @Override // com.google.common.base.Converter
        public B doForward(A a14) {
            return this.forwardFunction.apply(a14);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof FunctionBasedConverter) {
                FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
                if (this.forwardFunction.equals(functionBasedConverter.forwardFunction) && this.backwardFunction.equals(functionBasedConverter.backwardFunction)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.backwardFunction.hashCode() + (this.forwardFunction.hashCode() * 31);
        }

        public String toString() {
            return "Converter.from(" + this.forwardFunction + ", " + this.backwardFunction + ")";
        }
    }

    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> original;

        public ReverseConverter(Converter<A, B> converter) {
            this.original = converter;
        }

        @Override // com.google.common.base.Converter
        public B correctedDoBackward(A a14) {
            return this.original.correctedDoForward(a14);
        }

        @Override // com.google.common.base.Converter
        public A correctedDoForward(B b14) {
            return this.original.correctedDoBackward(b14);
        }

        @Override // com.google.common.base.Converter
        public B doBackward(A a14) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public A doForward(B b14) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.original.equals(((ReverseConverter) obj).original);
            }
            return false;
        }

        public int hashCode() {
            return ~this.original.hashCode();
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> reverse() {
            return this.original;
        }

        public String toString() {
            return this.original + ".reverse()";
        }
    }

    public Converter(boolean z14) {
        this.handleNullAutomatically = z14;
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new FunctionBasedConverter(function, function2);
    }

    public static <T> Converter<T, T> identity() {
        return (IdentityConverter) IdentityConverter.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private A unsafeDoBackward(B b14) {
        return (A) doBackward(NullnessCasts.uncheckedCastNullableTToT(b14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private B unsafeDoForward(A a14) {
        return (B) doForward(NullnessCasts.uncheckedCastNullableTToT(a14));
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // com.google.common.base.Function
    @InlineMe(replacement = "this.convert(a)")
    @Deprecated
    public final B apply(A a14) {
        return convert(a14);
    }

    public final B convert(A a14) {
        return correctedDoForward(a14);
    }

    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>(this) { // from class: com.google.common.base.Converter.1
            final /* synthetic */ Converter this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public Iterator<B> iterator() {
                return new Iterator<B>() { // from class: com.google.common.base.Converter.1.1
                    private final Iterator<? extends A> fromIterator;

                    {
                        this.fromIterator = iterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.fromIterator.hasNext();
                    }

                    @Override // java.util.Iterator
                    public B next() {
                        return (B) AnonymousClass1.this.this$0.convert(this.fromIterator.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        this.fromIterator.remove();
                    }
                };
            }
        };
    }

    public A correctedDoBackward(B b14) {
        if (!this.handleNullAutomatically) {
            return unsafeDoBackward(b14);
        }
        if (b14 == null) {
            return null;
        }
        return (A) Preconditions.checkNotNull(doBackward(b14));
    }

    public B correctedDoForward(A a14) {
        if (!this.handleNullAutomatically) {
            return unsafeDoForward(a14);
        }
        if (a14 == null) {
            return null;
        }
        return (B) Preconditions.checkNotNull(doForward(a14));
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new ConverterComposition(this, (Converter) Preconditions.checkNotNull(converter));
    }

    @ForOverride
    public abstract A doBackward(B b14);

    @ForOverride
    public abstract B doForward(A a14);

    @Override // com.google.common.base.Function
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @CheckReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        ReverseConverter reverseConverter = new ReverseConverter(this);
        this.reverse = reverseConverter;
        return reverseConverter;
    }

    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        static final Converter<?, ?> INSTANCE = new IdentityConverter();
        private static final long serialVersionUID = 0;

        private IdentityConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Converter
        public <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        @Override // com.google.common.base.Converter
        public T doBackward(T t7) {
            return t7;
        }

        @Override // com.google.common.base.Converter
        public T doForward(T t7) {
            return t7;
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // com.google.common.base.Converter
        public IdentityConverter<T> reverse() {
            return this;
        }
    }

    public Converter() {
        this(true);
    }
}
