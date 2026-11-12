package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class MeasureTimeKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final long measureTime(@NotNull Function0<Unit> function0) {
        TimeMark timeMarkMarkNow = TimeSource.Monotonic.INSTANCE.markNow();
        function0.invoke();
        return timeMarkMarkNow.mo4315elapsedNowUwyO8pc();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull Function0<? extends T> function0) {
        return new TimedValue<>(function0.invoke(), TimeSource.Monotonic.INSTANCE.markNow().mo4315elapsedNowUwyO8pc(), null);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final long measureTime(@NotNull TimeSource timeSource, @NotNull Function0<Unit> function0) {
        TimeMark timeMarkMarkNow = timeSource.markNow();
        function0.invoke();
        return timeMarkMarkNow.mo4315elapsedNowUwyO8pc();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource timeSource, @NotNull Function0<? extends T> function0) {
        return new TimedValue<>(function0.invoke(), timeSource.markNow().mo4315elapsedNowUwyO8pc(), null);
    }
}
