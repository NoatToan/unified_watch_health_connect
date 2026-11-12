package androidx.health.connect.client.time;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Instant;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B9\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\u0013\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00068G¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u00068G¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0018"}, d2 = {"Landroidx/health/connect/client/time/TimeRangeFilter;", "", "startTime", "Ljava/time/Instant;", "endTime", "localStartTime", "Ljava/time/LocalDateTime;", "localEndTime", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getStartTime", "()Ljava/time/Instant;", "getEndTime", "getLocalStartTime", "()Ljava/time/LocalDateTime;", "getLocalEndTime", "isBasedOnLocalTime", "", "isBasedOnLocalTime$connect_client_release", "equals", "other", WatchFaceConstant.HASHCODE, "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeRangeFilter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Instant endTime;
    private final LocalDateTime localEndTime;
    private final LocalDateTime localStartTime;
    private final Instant startTime;

    public TimeRangeFilter(Instant instant, Instant instant2, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.startTime = instant;
        this.endTime = instant2;
        this.localStartTime = localDateTime;
        this.localEndTime = localDateTime2;
    }

    public /* synthetic */ TimeRangeFilter(Instant instant, Instant instant2, LocalDateTime localDateTime, LocalDateTime localDateTime2, int i, zcm zcmVar) {
        this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? null : instant2, (i & 4) != 0 ? null : localDateTime, (i & 8) != 0 ? null : localDateTime2);
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final LocalDateTime getLocalStartTime() {
        return this.localStartTime;
    }

    public final LocalDateTime getLocalEndTime() {
        return this.localEndTime;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Landroidx/health/connect/client/time/TimeRangeFilter$Companion;", "", "<init>", "()V", "between", "Landroidx/health/connect/client/time/TimeRangeFilter;", "startTime", "Ljava/time/Instant;", "endTime", "Ljava/time/LocalDateTime;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final TimeRangeFilter between(Instant startTime, Instant endTime) {
            zcp.c(startTime, "");
            zcp.c(endTime, "");
            if (!startTime.isBefore(endTime)) {
                throw new IllegalArgumentException("end time needs be after start time".toString());
            }
            return new TimeRangeFilter(startTime, endTime, null, null, 12, null);
        }

        @JvmStatic
        public final TimeRangeFilter between(LocalDateTime startTime, LocalDateTime endTime) {
            zcp.c(startTime, "");
            zcp.c(endTime, "");
            if (!startTime.isBefore(endTime)) {
                throw new IllegalArgumentException("end time needs be after start time".toString());
            }
            return new TimeRangeFilter(null, null, startTime, endTime);
        }

        @JvmStatic
        public final TimeRangeFilter before(Instant endTime) {
            zcp.c(endTime, "");
            return new TimeRangeFilter(null, endTime, null, null, 12, null);
        }

        @JvmStatic
        public final TimeRangeFilter before(LocalDateTime endTime) {
            zcp.c(endTime, "");
            return new TimeRangeFilter(null, null, null, endTime);
        }

        @JvmStatic
        public final TimeRangeFilter after(Instant startTime) {
            zcp.c(startTime, "");
            return new TimeRangeFilter(startTime, null, null, null, 14, null);
        }

        @JvmStatic
        public final TimeRangeFilter after(LocalDateTime startTime) {
            zcp.c(startTime, "");
            return new TimeRangeFilter(null, null, startTime, null, 8, null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    public final boolean isBasedOnLocalTime$connect_client_release() {
        return (this.localStartTime == null && this.localEndTime == null) ? false : true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeRangeFilter)) {
            return false;
        }
        TimeRangeFilter timeRangeFilter = (TimeRangeFilter) other;
        return zcp.b(this.startTime, timeRangeFilter.startTime) && zcp.b(this.endTime, timeRangeFilter.endTime) && zcp.b(this.localStartTime, timeRangeFilter.localStartTime) && zcp.b(this.localEndTime, timeRangeFilter.localEndTime);
    }

    public int hashCode() {
        Instant instant = this.startTime;
        int iHashCode = instant != null ? instant.hashCode() : 0;
        Instant instant2 = this.endTime;
        int iHashCode2 = instant2 != null ? instant2.hashCode() : 0;
        LocalDateTime localDateTime = this.localStartTime;
        int iHashCode3 = localDateTime != null ? localDateTime.hashCode() : 0;
        LocalDateTime localDateTime2 = this.localEndTime;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
    }

    @JvmStatic
    public static final TimeRangeFilter between(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        return INSTANCE.between(localDateTime, localDateTime2);
    }

    @JvmStatic
    public static final TimeRangeFilter between(Instant instant, Instant instant2) {
        return INSTANCE.between(instant, instant2);
    }

    @JvmStatic
    public static final TimeRangeFilter before(LocalDateTime localDateTime) {
        return INSTANCE.before(localDateTime);
    }

    @JvmStatic
    public static final TimeRangeFilter before(Instant instant) {
        return INSTANCE.before(instant);
    }

    @JvmStatic
    public static final TimeRangeFilter after(LocalDateTime localDateTime) {
        return INSTANCE.after(localDateTime);
    }

    @JvmStatic
    public static final TimeRangeFilter after(Instant instant) {
        return INSTANCE.after(instant);
    }

    public TimeRangeFilter() {
        this(null, null, null, null, 15, null);
    }
}
