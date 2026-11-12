package org.apache.commons.lang3;

import a73.g;
import a73.h;
import a73.k;
import a73.l;
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
import mt0.b2;
import o62.b0;
import org.apache.commons.lang3.function.FailableBooleanSupplier;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class Functions {

    @FunctionalInterface
    @Deprecated
    public interface FailableBiConsumer<O1, O2, T extends Throwable> {
        void accept(O1 o7, O2 o14);
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableBiFunction<O1, O2, R, T extends Throwable> {
        R apply(O1 o7, O2 o14);
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableBiPredicate<O1, O2, T extends Throwable> {
        boolean test(O1 o7, O2 o14);
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableCallable<R, T extends Throwable> {
        R call();
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableConsumer<O, T extends Throwable> {
        void accept(O o7);
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableFunction<I, R, T extends Throwable> {
        R apply(I i14);
    }

    @FunctionalInterface
    @Deprecated
    public interface FailablePredicate<I, T extends Throwable> {
        boolean test(I i14);
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableRunnable<T extends Throwable> {
        void run();
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableSupplier<R, T extends Throwable> {
        R get();
    }

    public static <O1, O2, T extends Throwable> void accept(FailableBiConsumer<O1, O2, T> failableBiConsumer, O1 o7, O2 o14) {
        run(new a73.f(failableBiConsumer, 28, o7, o14));
    }

    public static <O1, O2, O, T extends Throwable> O apply(FailableBiFunction<O1, O2, O, T> failableBiFunction, O1 o7, O2 o14) {
        return (O) get(new a73.f(failableBiFunction, 29, o7, o14));
    }

    public static <O1, O2> BiConsumer<O1, O2> asBiConsumer(FailableBiConsumer<O1, O2, ?> failableBiConsumer) {
        return new l(failableBiConsumer, 3);
    }

    public static <O1, O2, O> BiFunction<O1, O2, O> asBiFunction(FailableBiFunction<O1, O2, O, ?> failableBiFunction) {
        return new g(failableBiFunction, 1);
    }

    public static <O1, O2> BiPredicate<O1, O2> asBiPredicate(FailableBiPredicate<O1, O2, ?> failableBiPredicate) {
        return new a73.a(failableBiPredicate, 1);
    }

    public static <O> Callable<O> asCallable(FailableCallable<O, ?> failableCallable) {
        return new h(failableCallable, 8);
    }

    public static <I> Consumer<I> asConsumer(FailableConsumer<I, ?> failableConsumer) {
        return new o(failableConsumer, 7);
    }

    public static <I, O> Function<I, O> asFunction(FailableFunction<I, O, ?> failableFunction) {
        return new k(failableFunction, 7);
    }

    public static <I> Predicate<I> asPredicate(FailablePredicate<I, ?> failablePredicate) {
        return new n(failablePredicate, 23);
    }

    public static Runnable asRunnable(FailableRunnable<?> failableRunnable) {
        return new k32.n(failableRunnable, 25);
    }

    public static <O> Supplier<O> asSupplier(FailableSupplier<O, ?> failableSupplier) {
        return new a73.e(failableSupplier, 1);
    }

    public static <O, T extends Throwable> O call(FailableCallable<O, T> failableCallable) {
        failableCallable.getClass();
        return (O) get(new b2(failableCallable, 25));
    }

    public static <O, T extends Throwable> O get(FailableSupplier<O, T> failableSupplier) {
        try {
            return failableSupplier.get();
        } catch (Throwable th3) {
            throw rethrow(th3);
        }
    }

    private static <T extends Throwable> boolean getAsBoolean(FailableBooleanSupplier<T> failableBooleanSupplier) {
        try {
            return failableBooleanSupplier.getAsBoolean();
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

    public static <T extends Throwable> void run(FailableRunnable<T> failableRunnable) {
        try {
            failableRunnable.run();
        } catch (Throwable th3) {
            throw rethrow(th3);
        }
    }

    public static <O> Streams.FailableStream<O> stream(Collection<O> collection) {
        return new Streams.FailableStream<>(collection.stream());
    }

    public static <O1, O2, T extends Throwable> boolean test(FailableBiPredicate<O1, O2, T> failableBiPredicate, O1 o7, O2 o14) {
        return getAsBoolean(new a73.f(failableBiPredicate, 27, o7, o14));
    }

    @SafeVarargs
    public static void tryWithResources(FailableRunnable<? extends Throwable> failableRunnable, FailableConsumer<Throwable, ? extends Throwable> failableConsumer, FailableRunnable<? extends Throwable>... failableRunnableArr) {
        if (failableConsumer == null) {
            failableConsumer = new o2.c(27);
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

    public static <O> Streams.FailableStream<O> stream(Stream<O> stream) {
        return new Streams.FailableStream<>(stream);
    }

    public static <O, T extends Throwable> void accept(FailableConsumer<O, T> failableConsumer, O o7) {
        run(new b0(4, failableConsumer, o7));
    }

    public static <I, O, T extends Throwable> O apply(FailableFunction<I, O, T> failableFunction, I i14) {
        return (O) get(new b0(3, failableFunction, i14));
    }

    public static <O, T extends Throwable> boolean test(FailablePredicate<O, T> failablePredicate, O o7) {
        return getAsBoolean(new b0(2, failablePredicate, o7));
    }

    @SafeVarargs
    public static void tryWithResources(FailableRunnable<? extends Throwable> failableRunnable, FailableRunnable<? extends Throwable>... failableRunnableArr) {
        tryWithResources(failableRunnable, null, failableRunnableArr);
    }
}
