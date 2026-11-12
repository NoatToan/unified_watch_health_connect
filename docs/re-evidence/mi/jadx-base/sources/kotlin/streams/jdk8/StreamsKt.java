package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.streams.jdk8.StreamsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@JvmName(name = "StreamsKt")
public final class StreamsKt {
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<T> asSequence(@NotNull final Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "<this>");
        return new Sequence<T>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                Iterator<T> it = stream.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                return it;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Stream<T> asStream(@NotNull final Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: ijo
            @Override // java.util.function.Supplier
            public final Object get() {
                return StreamsKt.asStream$lambda$4(sequence);
            }
        }, 16, false);
        Intrinsics.checkNotNullExpressionValue(stream, "stream(...)");
        return stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator asStream$lambda$4(Sequence sequence) {
        return Spliterators.spliteratorUnknownSize(sequence.iterator(), 16);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<T> toList(@NotNull Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "<this>");
        Object objCollect = stream.collect(Collectors.toList());
        Intrinsics.checkNotNullExpressionValue(objCollect, "collect(...)");
        return (List) objCollect;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<Integer> asSequence(@NotNull final IntStream intStream) {
        Intrinsics.checkNotNullParameter(intStream, "<this>");
        return new Sequence<Integer>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$2
            @Override // kotlin.sequences.Sequence
            public Iterator<Integer> iterator() {
                Iterator<Integer> it = intStream.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                return it;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Integer> toList(@NotNull IntStream intStream) {
        Intrinsics.checkNotNullParameter(intStream, "<this>");
        int[] array = intStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return ArraysKt___ArraysJvmKt.asList(array);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<Long> asSequence(@NotNull final LongStream longStream) {
        Intrinsics.checkNotNullParameter(longStream, "<this>");
        return new Sequence<Long>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$3
            @Override // kotlin.sequences.Sequence
            public Iterator<Long> iterator() {
                Iterator<Long> it = longStream.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                return it;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Long> toList(@NotNull LongStream longStream) {
        Intrinsics.checkNotNullParameter(longStream, "<this>");
        long[] array = longStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return ArraysKt___ArraysJvmKt.asList(array);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<Double> asSequence(@NotNull final DoubleStream doubleStream) {
        Intrinsics.checkNotNullParameter(doubleStream, "<this>");
        return new Sequence<Double>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            public Iterator<Double> iterator() {
                Iterator<Double> it = doubleStream.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                return it;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Double> toList(@NotNull DoubleStream doubleStream) {
        Intrinsics.checkNotNullParameter(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return ArraysKt___ArraysJvmKt.asList(array);
    }
}
