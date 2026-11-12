package androidx.health.connect.client.impl.platform.aggregate;

import androidx.health.connect.client.time.TimeRangeFilter;
import defpackage.zcp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAmount;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\b\u001a\u00020\u0003*\u00020\u0003H\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"createTimeRange", "Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "createInstantTimeRange", "Landroidx/health/connect/client/impl/platform/aggregate/InstantTimeRange;", "createLocalTimeRange", "Landroidx/health/connect/client/impl/platform/aggregate/LocalTimeRange;", "withBufferedStart", "RECORD_START_TIME_BUFFER", "Ljava/time/Duration;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TimeRangeFilterUtilsKt {
    private static final Duration RECORD_START_TIME_BUFFER;

    public static final TimeRange<?> createTimeRange(TimeRangeFilter timeRangeFilter) {
        zcp.c(timeRangeFilter, "");
        if (timeRangeFilter.isBasedOnLocalTime$connect_client_release()) {
            return createLocalTimeRange(timeRangeFilter);
        }
        return createInstantTimeRange(timeRangeFilter);
    }

    public static final InstantTimeRange createInstantTimeRange(TimeRangeFilter timeRangeFilter) {
        zcp.c(timeRangeFilter, "");
        if (timeRangeFilter.isBasedOnLocalTime$connect_client_release()) {
            throw new IllegalArgumentException("TimeRangeFilter should be based on instant time".toString());
        }
        Instant startTime = timeRangeFilter.getStartTime();
        if (startTime == null) {
            startTime = Instant.EPOCH;
        }
        Instant endTime = timeRangeFilter.getEndTime();
        if (endTime == null) {
            endTime = Instant.now();
        }
        zcp.e(startTime);
        zcp.e(endTime);
        return new InstantTimeRange(startTime, endTime);
    }

    public static final LocalTimeRange createLocalTimeRange(TimeRangeFilter timeRangeFilter) {
        zcp.c(timeRangeFilter, "");
        if (!timeRangeFilter.isBasedOnLocalTime$connect_client_release()) {
            throw new IllegalArgumentException("TimeRangeFilter should be based on local time".toString());
        }
        LocalDateTime localStartTime = timeRangeFilter.getLocalStartTime();
        if (localStartTime == null) {
            localStartTime = LocalDateTime.ofInstant(Instant.EPOCH, ZoneOffset.MIN);
        }
        LocalDateTime localEndTime = timeRangeFilter.getLocalEndTime();
        if (localEndTime == null) {
            localEndTime = LocalDateTime.ofInstant(Instant.now().plus((TemporalAmount) Duration.ofDays(1L)), ZoneOffset.MAX);
        }
        zcp.e(localStartTime);
        zcp.e(localEndTime);
        return new LocalTimeRange(localStartTime, localEndTime);
    }

    public static final TimeRangeFilter withBufferedStart(TimeRangeFilter timeRangeFilter) {
        zcp.c(timeRangeFilter, "");
        Instant startTime = timeRangeFilter.getStartTime();
        Instant instantMinus = startTime != null ? startTime.minus((TemporalAmount) RECORD_START_TIME_BUFFER) : null;
        Instant endTime = timeRangeFilter.getEndTime();
        LocalDateTime localStartTime = timeRangeFilter.getLocalStartTime();
        return new TimeRangeFilter(instantMinus, endTime, localStartTime != null ? localStartTime.minus((TemporalAmount) RECORD_START_TIME_BUFFER) : null, timeRangeFilter.getLocalEndTime());
    }

    static {
        Duration durationOfDays = Duration.ofDays(1L);
        zcp.b((Object) durationOfDays, "");
        RECORD_START_TIME_BUFFER = durationOfDays;
    }
}
