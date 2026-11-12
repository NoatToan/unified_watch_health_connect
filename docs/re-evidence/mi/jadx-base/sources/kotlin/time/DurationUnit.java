package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = {ExperimentalTime.class})
public enum DurationUnit {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final TimeUnit timeUnit;

    DurationUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @NotNull
    public static EnumEntries<DurationUnit> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
