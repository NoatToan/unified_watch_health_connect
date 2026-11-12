package c22;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/i0;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f23086a = new i0();

    private i0() {
    }

    public static DateTimeZone a(long j8, long j14) {
        try {
            if (j8 <= 0 || j14 <= 0) {
                DateTimeZone dateTimeZone = DateTimeZone.getDefault();
                dateTimeZone.getClass();
                return dateTimeZone;
            }
            DateTimeZone dateTimeZoneForOffsetMillis = DateTimeZone.forOffsetMillis((int) (j14 - j8));
            dateTimeZoneForOffsetMillis.getClass();
            return dateTimeZoneForOffsetMillis;
        } catch (IllegalArgumentException unused) {
            DateTimeZone dateTimeZoneForOffsetMillis2 = DateTimeZone.forOffsetMillis((int) ((j14 - j8) % ((long) DateTimeConstants.MILLIS_PER_DAY)));
            dateTimeZoneForOffsetMillis2.getClass();
            return dateTimeZoneForOffsetMillis2;
        }
    }
}
