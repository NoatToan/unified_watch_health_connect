package du2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o13.q;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013BG\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Ldu2/g;", "Landroidx/lifecycle/k0;", "Landroid/content/Context;", "appContext", "Ldu2/g$c;", "delegate", "Lkotlin/Function1;", "Lrs2/c;", "", "shouldIncludeAlerts", "", "Ldu2/g$b;", "", "onPhoneLocationError", "<init>", "(Landroid/content/Context;Ldu2/g$c;Le23/l;Le23/l;)V", "a", "b", "c", "d", "weather-gdi_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class g implements k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f61293g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f61294h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f61295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f61296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<rs2.c, Boolean> f61297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<List<? extends b>, Unit> f61298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Location f61299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f61300f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldu2/g$b;", "", "<init>", "(Ljava/lang/String;I)V", "weather-gdi_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum b {
        PERMISSION_NOT_GRANTED,
        NOT_ENABLED,
        PERMISSION_NOT_GRANTED_ACCESS_BACKGROUND_LOCATION
    }

    public interface c extends xc2.b, xc2.a<ve2.e> {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldu2/g$d;", "", "<init>", "(Ljava/lang/String;I)V", "weather-gdi_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum d {
        PHONE,
        STATIC
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61308a;

        static {
            int[] iArr = new int[b0.a.values().length];
            try {
                iArr[b0.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61308a = iArr;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f61294h = gt2.b.f79005a.h("WTHR#WeatherHelper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context, c cVar, l<? super rs2.c, Boolean> lVar, l<? super List<? extends b>, Unit> lVar2) {
        context.getClass();
        cVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        this.f61295a = context;
        this.f61296b = cVar;
        this.f61297c = lVar;
        this.f61298d = lVar2;
        this.f61300f = new AtomicBoolean(true);
        cu2.h.f55758a.getClass();
        if (cu2.h.f55761d != null) {
            return;
        }
        cu2.h.g(30, 4000, 5, 30, cu2.g.f55757a);
    }

    public static final void a(g gVar, Location location, t13.d dVar) {
        Logger logger = f61294h;
        if (location != null) {
            gVar.getClass();
            Location locationD = cu2.h.d(location.getLatitude(), location.getLongitude());
            gVar.f61299e = locationD;
            double latitude = locationD.getLatitude();
            double longitude = locationD.getLongitude();
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("getDeviceLocation(network): lat[", latitude, "], long[");
            sbA.append(longitude);
            sbA.append("]");
            logger.debug(sbA.toString());
            int i14 = q.f128596b;
            dVar.resumeWith(locationD);
            return;
        }
        Location location2 = gVar.f61299e;
        Double dValueOf = location2 != null ? Double.valueOf(location2.getLatitude()) : null;
        Location location3 = gVar.f61299e;
        logger.debug("getDeviceLocation(network): last used lat[" + dValueOf + "], long[" + (location3 != null ? Double.valueOf(location3.getLongitude()) : null) + "]");
        int i15 = q.f128596b;
        dVar.resumeWith(gVar.f61299e);
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        int i14 = e.f61308a[aVar.ordinal()];
        AtomicBoolean atomicBoolean = this.f61300f;
        if (i14 == 1) {
            atomicBoolean.set(true);
        } else {
            if (i14 != 2) {
                return;
            }
            atomicBoolean.set(false);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Ldu2/g$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "SHARED_PREFERENCES_KEY", "Ljava/lang/String;", "USER_DEFAULT_WEATHER_LATITUDE_KEY", "USER_DEFAULT_WEATHER_LONGITUDE_KEY", "USER_PREFERRED_WEATHER_LOCATION_SOURCE_KEY", "weather-gdi_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @SuppressLint({"MissingPermission"})
        public static Location a(Context context) {
            context.getClass();
            Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            if (locationManager != null) {
                Criteria criteria = new Criteria();
                criteria.setCostAllowed(true);
                List<String> providers = locationManager.getProviders(criteria, false);
                providers.getClass();
                Iterator<T> it = providers.iterator();
                while (it.hasNext()) {
                    Location lastKnownLocation = locationManager.getLastKnownLocation((String) it.next());
                    if (lastKnownLocation != null) {
                        return lastKnownLocation;
                    }
                }
            }
            return null;
        }

        public static SharedPreferences b(Context context) {
            context.getClass();
            SharedPreferences sharedPreferences = context.getSharedPreferences("key_weather_lib_preferences", 0);
            sharedPreferences.getClass();
            return sharedPreferences;
        }

        public static Location c(Context context) {
            context.getClass();
            SharedPreferences sharedPreferencesB = b(context);
            if (!sharedPreferencesB.contains("key_user_default_weather_latitude") || !sharedPreferencesB.contains("key_user_default_weather_longitude")) {
                return null;
            }
            long j8 = sharedPreferencesB.getLong("key_user_default_weather_latitude", 200L);
            long j14 = sharedPreferencesB.getLong("key_user_default_weather_longitude", 200L);
            Location location = new Location("user_preference");
            cu2.h hVar = cu2.h.f55758a;
            double d14 = 2147483648L;
            location.setLatitude((j8 * 180.0d) / d14);
            location.setLongitude((j14 * 180.0d) / d14);
            if (cu2.h.i(location)) {
                return location;
            }
            return null;
        }

        public static d d(Context context) {
            context.getClass();
            SharedPreferences sharedPreferencesB = b(context);
            d dVar = d.PHONE;
            int i14 = sharedPreferencesB.getInt("key_user_preferred_weather_location_source", dVar.ordinal());
            if (i14 == dVar.ordinal()) {
                return dVar;
            }
            d dVar2 = d.STATIC;
            if (i14 == dVar2.ordinal()) {
                return dVar2;
            }
            vb.h.z(e0.f(i14, "preference value [", "] not recognized"));
            return null;
        }

        public static void e(Context context, Double d14, Double d15) {
            context.getClass();
            if (d14 == null || Double.isNaN(d14.doubleValue()) || d15 == null || Double.isNaN(d15.doubleValue())) {
                b(context).edit().remove("key_user_default_weather_latitude").remove("key_user_default_weather_longitude").apply();
                return;
            }
            if (cu2.h.i(cu2.h.d(d14.doubleValue(), d15.doubleValue()))) {
                b(context).edit().putLong("key_user_default_weather_latitude", cu2.h.e(d14.doubleValue())).putLong("key_user_default_weather_longitude", cu2.h.e(d15.doubleValue())).apply();
                return;
            }
            g.f61294h.warn("setUserDefaultWeatherLocation: invalid coordinates lat[" + d14 + "], long[" + d15 + "]");
        }

        public static void f(Context context, d dVar) {
            context.getClass();
            SharedPreferences.Editor editorEdit = b(context).edit();
            if (dVar == null) {
                dVar = d.PHONE;
            }
            editorEdit.putInt("key_user_preferred_weather_location_source", dVar.ordinal()).apply();
        }

        private a() {
        }
    }
}
