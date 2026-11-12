package androidx.health.connect.client.impl.platform;

import androidx.health.connect.client.impl.platform.aggregate.InstantTimeRange;
import androidx.health.connect.client.impl.platform.aggregate.LocalTimeRange;
import androidx.health.connect.client.impl.platform.aggregate.TimeRange;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.yyv;
import defpackage.zcp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0080\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\u001a\u0018\u0010\u000b\u001a\u00020\b*\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\fH\u0000\u001a$\u0010\u0011\u001a\u00020\u0012*\u00020\u00052\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\"\u0018\u0010\r\u001a\u00020\u0002*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {TtmlNode.TAG_DIV, "", "Ljava/time/Duration;", "divisor", "minus", "Ljava/time/Instant;", "other", "toInstantWithDefaultZoneFallback", "Ljava/time/LocalDateTime;", "zoneOffset", "Ljava/time/ZoneOffset;", "toLocalTimeWithDefaultZoneFallback", "Ljava/time/ZoneId;", "duration", "Landroidx/health/connect/client/records/IntervalRecord;", "getDuration", "(Landroidx/health/connect/client/records/IntervalRecord;)Ljava/time/Duration;", "isWithin", "", "timeRange", "Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TimeExtensionsKt {
    public static final double div(Duration duration, Duration duration2) {
        zcp.c(duration, "");
        zcp.c(duration2, "");
        return duration.toMillis() / duration2.toMillis();
    }

    public static final Duration minus(Instant instant, Instant instant2) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        Duration durationBetween = Duration.between(instant2, instant);
        zcp.b((Object) durationBetween, "");
        return durationBetween;
    }

    public static /* synthetic */ Instant toInstantWithDefaultZoneFallback$default(LocalDateTime localDateTime, ZoneOffset zoneOffset, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneOffset = null;
        }
        return toInstantWithDefaultZoneFallback(localDateTime, zoneOffset);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.time.ZonedDateTime] */
    public static final Instant toInstantWithDefaultZoneFallback(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        zcp.c(localDateTime, "");
        Instant instant = localDateTime.atZone(zoneOffset != null ? zoneOffset : ZoneId.systemDefault()).toInstant();
        zcp.b((Object) instant, "");
        return instant;
    }

    public static /* synthetic */ LocalDateTime toLocalTimeWithDefaultZoneFallback$default(Instant instant, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = null;
        }
        return toLocalTimeWithDefaultZoneFallback(instant, zoneId);
    }

    public static final LocalDateTime toLocalTimeWithDefaultZoneFallback(Instant instant, ZoneId zoneId) {
        zcp.c(instant, "");
        if (zoneId == null) {
            zoneId = ZoneId.systemDefault();
        }
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instant, zoneId);
        zcp.b((Object) localDateTimeOfInstant, "");
        return localDateTimeOfInstant;
    }

    public static final Duration getDuration(IntervalRecord intervalRecord) {
        zcp.c(intervalRecord, "");
        return minus(intervalRecord.getEndTime(), intervalRecord.getStartTime());
    }

    public static /* synthetic */ boolean isWithin$default(Instant instant, TimeRange timeRange, ZoneOffset zoneOffset, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneOffset = null;
        }
        return isWithin(instant, timeRange, zoneOffset);
    }

    public static final boolean isWithin(Instant instant, TimeRange<?> timeRange, ZoneOffset zoneOffset) {
        zcp.c(instant, "");
        zcp.c(timeRange, "");
        if (timeRange instanceof InstantTimeRange) {
            InstantTimeRange instantTimeRange = (InstantTimeRange) timeRange;
            return !instant.isBefore(instantTimeRange.getStartTime()) && instant.isBefore(instantTimeRange.getEndTime());
        }
        if (!(timeRange instanceof LocalTimeRange)) {
            throw new yyv();
        }
        LocalTimeRange localTimeRange = (LocalTimeRange) timeRange;
        return !instant.isBefore(toInstantWithDefaultZoneFallback(localTimeRange.getStartTime(), zoneOffset)) && instant.isBefore(toInstantWithDefaultZoneFallback(localTimeRange.getEndTime(), zoneOffset));
    }
}
