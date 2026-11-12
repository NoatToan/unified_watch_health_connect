package org.apache.commons.lang3.function;

import a0.c;
import a73.a;
import a73.b;
import a73.d;
import a73.e;
import a73.f;
import a73.g;
import a73.h;
import a73.j;
import a73.k;
import a73.l;
import a73.m;
import a73.n;
import a73.o;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.lang3.stream.Streams;

/* JADX INFO: loaded from: classes3.dex */
public class Failable {
    private Failable() {
    }

    public static <T, U, E extends Throwable> void accept(FailableBiConsumer<T, U, E> failableBiConsumer, T t7, U u8) {
        run(new f(failableBiConsumer, 1, t7, u8));
    }

    public static <T, U, R, E extends Throwable> R apply(FailableBiFunction<T, U, R, E> failableBiFunction, T t7, U u8) {
        return (R) get(new f(failableBiFunction, 2, t7, u8));
    }

    public static <E extends Throwable> double applyAsDouble(final FailableDoubleBinaryOperator<E> failableDoubleBinaryOperator, final double d14, final double d15) {
        return getAsDouble(new FailableDoubleSupplier() { // from class: a73.i
            @Override // org.apache.commons.lang3.function.FailableDoubleSupplier
            public final double getAsDouble() {
                return failableDoubleBinaryOperator.applyAsDouble(d14, d15);
            }
        });
    }

    public static <T, U> BiConsumer<T, U> asBiConsumer(FailableBiConsumer<T, U, ?> failableBiConsumer) {
        return new l(failableBiConsumer, 0);
    }

    public static <T, U, R> BiFunction<T, U, R> asBiFunction(FailableBiFunction<T, U, R, ?> failableBiFunction) {
        return new g(failableBiFunction, 0);
    }

    public static <T, U> BiPredicate<T, U> asBiPredicate(FailableBiPredicate<T, U, ?> failableBiPredicate) {
        return new a(failableBiPredicate, 0);
    }

    public static <V> Callable<V> asCallable(FailableCallable<V, ?> failableCallable) {
        return new h(failableCallable, 0);
    }

    public static <T> Consumer<T> asConsumer(FailableConsumer<T, ?> failableConsumer) {
        return new o(failableConsumer, 0);
    }

    public static <T, R> Function<T, R> asFunction(FailableFunction<T, R, ?> failableFunction) {
        return new k(failableFunction, 0);
    }

    public static <T> Predicate<T> asPredicate(FailablePredicate<T, ?> failablePredicate) {
        return new n(failablePredicate, 0);
    }

    public static Runnable asRunnable(FailableRunnable<?> failableRunnable) {
        return new c(failableRunnable, 1);
    }

    public static <T> Supplier<T> asSupplier(FailableSupplier<T, ?> failableSupplier) {
        return new e(failableSupplier, 0);
    }

    public static <V, E extends Throwable> V call(FailableCallable<V, E> failableCallable) {
        failableCallable.getClass();
        return (V) get(new j(failableCallable, 0));
    }

    public static <T, E extends Throwable> T get(FailableSupplier<T, E> failableSupplier) {
        try {
            return failableSupplier.get();
        } catch (Throwable th3) {
            throw rethrow(th3);
        }
    }

    public static <E extends Throwable> boolean getAsBoolean(FailableBooleanSupplier<E> failableBooleanSupplier) {
        try {
            return failableBooleanSupplier.getAsBoolean();
        } catch (Throwable th3) {
            throw rethrow(th3);
        }
    }

    public static <E extends Throwable> double getAsDouble(FailableDoubleSupplier<E> failableDoubleSupplier) {
        try {
            return failableDoubleSupplier.getAsDouble();
        } catch (Throwable th3) {
            throw rethrow(th3);
        }
    }

    public static <E extends Throwable> int getAsInt(FailableIntSupplier<E> failableIntSupplier) {
        try {
            return failableIntSupplier.getAsInt();
        } catch (Throwable th3) {
            throw rethrow(th3);
        }
    }

    public static <E extends Throwable> long getAsLong(FailableLongSupplier<E> failableLongSupplier) {
        try {
            return failableLongSupplier.getAsLong();
        } catch (Throwable th3) {
            throw rethrow(th3);
        }
    }

    public static <E extends Throwable> short getAsShort(FailableShortSupplier<E> failableShortSupplier) {
        try {
            return failableShortSupplier.getAsShort();
        } catch (Throwable th3) {
            throw rethrow(th3);
        }
    }

    public static RuntimeException rethrow(Throwable th3) {
        Objects.requireNonNull(th3, "throwable");
        if (th3 instanceof RuntimeException) {
            throw ((RuntimeException) th3);
        }
        if (th3 instanceof Error) {
            throw ((Error) th3);
        }
        if (th3 instanceof IOException) {
            throw new UncheckedIOException((IOException) th3);
        }
        throw new UndeclaredThrowableException(th3);
    }

    public static <E extends Throwable> void run(FailableRunnable<E> failableRunnable) {
        try {
            failableRunnable.run();
        } catch (Throwable th3) {
            throw rethrow(th3);
        }
    }

    public static <E> Streams.FailableStream<E> stream(Collection<E> collection) {
        return new Streams.FailableStream<>(collection.stream());
    }

    public static <T, U, E extends Throwable> boolean test(FailableBiPredicate<T, U, E> failableBiPredicate, T t7, U u8) {
        return getAsBoolean(new f(failableBiPredicate, 0, t7, u8));
    }

    @SafeVarargs
    public static void tryWithResources(FailableRunnable<? extends Throwable> failableRunnable, FailableConsumer<Throwable, ? extends Throwable> failableConsumer, FailableRunnable<? extends Throwable>... failableRunnableArr) {
        if (failableConsumer == null) {
            failableConsumer = new d(0);
        }
        if (failableRunnableArr != null) {
            for (FailableRunnable<? extends Throwable> failableRunnable2 : failableRunnableArr) {
                Objects.requireNonNull(failableRunnable2, "runnable");
            }
        }
        try {
            failableRunnable.run();
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (failableRunnableArr != null) {
            for (FailableRunnable<? extends Throwable> failableRunnable3 : failableRunnableArr) {
                try {
                    failableRunnable3.run();
                } catch (Throwable th4) {
                    if (th == null) {
                        th = th4;
                    }
                }
            }
        }
        if (th != null) {
            try {
                failableConsumer.accept(th);
            } catch (Throwable th5) {
                throw rethrow(th5);
            }
        }
    }

    public static <T, E extends Throwable> void accept(FailableConsumer<T, E> failableConsumer, T t7) {
        run(new a0.h(2, failableConsumer, t7));
    }

    public static <T> Streams.FailableStream<T> stream(Stream<T> stream) {
        return new Streams.FailableStream<>(stream);
    }

    public static <E extends Throwable> void accept(final FailableDoubleConsumer<E> failableDoubleConsumer, final double d14) {
        run(new FailableRunnable() { // from class: a73.c
            @Override // org.apache.commons.lang3.function.FailableRunnable
            public final void run() {
                failableDoubleConsumer.accept(d14);
            }
        });
    }

    public static <T, R, E extends Throwable> R apply(FailableFunction<T, R, E> failableFunction, T t7) {
        return (R) get(new a0.h(3, failableFunction, t7));
    }

    public static <T, E extends Throwable> boolean test(FailablePredicate<T, E> failablePredicate, T t7) {
        return getAsBoolean(new a0.h(1, failablePredicate, t7));
    }

    public static <E extends Throwable> void accept(FailableIntConsumer<E> failableIntConsumer, int i14) {
        run(new m(failableIntConsumer, i14, 0));
    }

    public static <E extends Throwable> void accept(FailableLongConsumer<E> failableLongConsumer, long j8) {
        run(new b(failableLongConsumer, j8, 0));
    }

    @SafeVarargs
    public static void tryWithResources(FailableRunnable<? extends Throwable> failableRunnable, FailableRunnable<? extends Throwable>... failableRunnableArr) {
        tryWithResources(failableRunnable, null, failableRunnableArr);
    }
}
