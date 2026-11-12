package cu2;

import android.location.Location;
import o13.m;
import o13.t;
import org.joda.time.DateTimeConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcu2/a;", "", "", "timeToLiveMinutes", "maxRangeMeters", "currentConditionsTimeToLiveMinutes", "<init>", "(III)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fu2.h f55733e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f55729a = m.b(C1205a.f55735a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f55734f = new Object();

    /* JADX INFO: renamed from: cu2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C1205a extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1205a f55735a = new C1205a();

        public C1205a() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            return LoggerFactory.getLogger("WTHR#CacheMgr");
        }
    }

    public a(int i14, int i15, int i16) {
        if (i14 < 1 || i16 < 1) {
            StringBuilder sb3 = new StringBuilder("setTimeoutMinutes: ");
            if (i14 < 1) {
                sb3.append("(invalid 'newCacheTimeout' " + i14 + ", must be >= 1)");
            }
            if (i16 < 1) {
                sb3.append("(invalid 'newCurrentConditionsTimeout' " + i16 + ", must be >= 1)");
            }
            String string = sb3.toString();
            a().error(string);
            vb.h.s(string);
            throw null;
        }
        int i17 = i14 * DateTimeConstants.MILLIS_PER_MINUTE;
        this.f55730b = i17;
        if (i16 > i14) {
            this.f55731c = i17;
            a().debug("setTimeoutMinutes: [daily, hourly, alerts -> {}], [current conditions -> {}]", Integer.valueOf(i14), Integer.valueOf(i14));
        } else {
            this.f55731c = DateTimeConstants.MILLIS_PER_MINUTE * i16;
            a().debug("setTimeoutMinutes: [daily, hourly, alerts -> {}], [current conditions -> {}]", Integer.valueOf(i14), Integer.valueOf(i16));
        }
        a().debug("setMaxRangeMeters: from " + this.f55732d + " to " + i15);
        this.f55732d = i15;
    }

    public final Logger a() {
        Object value = this.f55729a.getValue();
        value.getClass();
        return (Logger) value;
    }

    public final boolean b(long j8, long j14, Location location, Location location2) {
        if (j14 + ((long) this.f55730b) < j8) {
            com.airbnb.lottie.animation.keyframe.a.r("cache entry older than ", this.f55730b, " ms (EXPIRED)", a());
            return true;
        }
        com.airbnb.lottie.animation.keyframe.a.r("cache entry has not passed ", this.f55730b, " ms expiration (NOT EXPIRED)", a());
        if (location.distanceTo(location2) > this.f55732d) {
            com.airbnb.lottie.animation.keyframe.a.r("cache entry outside ", this.f55732d, " meter range", a());
            return true;
        }
        com.airbnb.lottie.animation.keyframe.a.r("cache entry within ", this.f55732d, " meter range", a());
        return false;
    }
}
