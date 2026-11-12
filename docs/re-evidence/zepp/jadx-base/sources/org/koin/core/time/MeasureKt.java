package org.koin.core.time;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.time.Duration;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0006\"\u0004\b\u0000\u0010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¨\u0006\b"}, d2 = {"Lkotlin/Function0;", "", "code", "", "measureDuration", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Pair;", "measureDurationForResult", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class MeasureKt {
    public static final double measureDuration(@NotNull Function0<Unit> function0) {
        TimeMark timeMarkMarkNow = TimeSource.Monotonic.INSTANCE.markNow();
        function0.invoke();
        return Duration.toDouble-impl(timeMarkMarkNow.mo4315elapsedNowUwyO8pc(), TimeUnit.MILLISECONDS);
    }

    @NotNull
    public static final <T> Pair<T, Double> measureDurationForResult(@NotNull Function0<? extends T> function0) {
        TimedValue timedValue = new TimedValue(function0.invoke(), TimeSource.Monotonic.INSTANCE.markNow().mo4315elapsedNowUwyO8pc(), null);
        return new Pair<>(timedValue.getValue(), Double.valueOf(Duration.toDouble-impl(timedValue.m4423getDurationUwyO8pc(), TimeUnit.MILLISECONDS)));
    }
}
