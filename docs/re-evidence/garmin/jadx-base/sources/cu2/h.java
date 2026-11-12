package cu2;

import am.j;
import android.location.Location;
import android.os.SystemClock;
import com.garmin.net.weather.exception.ApiSpamException;
import ds.e0;
import i3.e5;
import o13.m;
import o13.t;
import o53.a0;
import o53.c0;
import o53.s0;
import org.joda.time.DateTimeConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu2/h;", "", "<init>", "()V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static cu2.a f55761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f55762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f55763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55764g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f55758a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f55759b = m.b(b.f55767a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u53.d f55760c = c0.a(new a0("WeatherService").plus(ge1.b.h()).plus(s0.f129406a));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static e23.a<Boolean> f55765h = a.f55766a;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends w implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55766a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f55767a = new b();

        public b() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            return LoggerFactory.getLogger("WTHR#Service");
        }
    }

    private h() {
    }

    public static final void a(h hVar, int i14) {
        hVar.getClass();
        f55762e = SystemClock.elapsedRealtime() + ((long) (DateTimeConstants.MILLIS_PER_MINUTE * i14));
        com.airbnb.lottie.animation.keyframe.a.r("setEndpointCallBackoff: next call for [daily, hourly, alerts] available in ", i14, " minutes", f());
    }

    public static final void b(h hVar, int i14) {
        hVar.getClass();
        f55763f = SystemClock.elapsedRealtime() + ((long) (DateTimeConstants.MILLIS_PER_MINUTE * i14));
        com.airbnb.lottie.animation.keyframe.a.r("setEndpointCallBackoff: next call for [current conditions] available in ", i14, " minutes", f());
    }

    public static final void c(h hVar, long j8) throws ApiSpamException {
        hVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime >= j8) {
            return;
        }
        long j14 = j8 - jElapsedRealtime;
        String strI = j.i(j14 / ((long) 1000), " seconds)", e0.k(j14, "attempting to call getWeather too soon, next call available in ", " ms ("));
        f().warn(strI);
        throw new ApiSpamException(strI);
    }

    public static final Location d(double d14, double d15) {
        Location location = new Location("");
        location.setLatitude(d14);
        location.setLongitude(d15);
        return location;
    }

    public static final long e(double d14) {
        return (long) ((d14 * 2147483648L) / 180.0d);
    }

    public static Logger f() {
        Object value = f55759b.getValue();
        value.getClass();
        return (Logger) value;
    }

    public static final void g(int i14, int i15, int i16, int i17, e23.a<Boolean> aVar) {
        aVar.getClass();
        f55765h = aVar;
        f55762e = 0L;
        f55763f = 0L;
        f55764g = i16;
        cu2.a aVar2 = f55761d;
        h hVar = f55758a;
        if (aVar2 == null) {
            f55761d = new cu2.a(i14, i15, i17);
            hVar.getClass();
            Logger loggerF = f();
            StringBuilder sbJ = e5.j(i14, i15, "initialized -> cacheTTLMinutes ", ", cacheMaxRangeMeters ", ", currentConditionsCacheTTLMinutes ");
            sbJ.append(i17);
            loggerF.debug(sbJ.toString());
            return;
        }
        if (aVar2.f55730b / DateTimeConstants.MILLIS_PER_MINUTE == i14) {
            aVar2.getClass();
            if (aVar2.f55732d == i15) {
                cu2.a aVar3 = f55761d;
                aVar3.getClass();
                if (aVar3.f55731c / DateTimeConstants.MILLIS_PER_MINUTE == i17) {
                    return;
                }
            }
        }
        f55761d = new cu2.a(i14, i15, i17);
        hVar.getClass();
        Logger loggerF2 = f();
        StringBuilder sbJ2 = e5.j(i14, i15, "cache destroyed, reinitialized-> cacheTTLMinutes ", ", cacheMaxRangeMeters ", ", currentConditionsCacheTTLMinutes ");
        sbJ2.append(i17);
        loggerF2.warn(sbJ2.toString());
    }

    public static final boolean i(Location location) {
        location.getClass();
        return location.getLatitude() >= -90.0d && location.getLatitude() <= 90.0d && location.getLongitude() >= -180.0d && location.getLongitude() <= 180.0d;
    }
}
