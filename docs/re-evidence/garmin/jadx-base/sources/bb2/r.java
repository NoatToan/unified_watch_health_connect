package bb2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import org.joda.time.DateTimeUtils;

/* JADX INFO: loaded from: classes8.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17389e;

    public r(String str, String str2, long j8, long j14, long j15) {
        this.f17385a = str;
        this.f17386b = str2;
        this.f17387c = j8;
        this.f17388d = j14 < 0 ? AbstractComponentTracker.LINGERING_TIMEOUT : j14;
        this.f17389e = j15 >= 0 ? j8 + j15 : j8 + 2592000000L;
    }

    public r(String str, String str2, long j8) {
        this(str, str2, j8, 0L, 0L);
    }

    public r(String str, String str2) {
        this(str, str2, DateTimeUtils.currentTimeMillis());
    }
}
