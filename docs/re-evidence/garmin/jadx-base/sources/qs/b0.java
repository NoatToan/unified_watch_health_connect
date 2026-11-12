package qs;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqs/b0;", "", "", Action.KEY_ATTRIBUTE, "", "drawableResId", "descriptionStringId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b0 {
    /* JADX INFO: Fake field, exist only in values array */
    FAIR("Fair", R.drawable.icon_weather_clear, R.string.lbl_weather_clear),
    CLEAR("Clear", R.drawable.icon_weather_clear, R.string.lbl_weather_clear),
    /* JADX INFO: Fake field, exist only in values array */
    MOSTLY_CLEAR("Mostly Clear", R.drawable.icon_weather_clear, R.string.lbl_weather_clear),
    CLOUDY("Cloudy", R.drawable.icon_weather_cloudy, R.string.lbl_weather_cloudy),
    MOSTLY_CLOUDY("Mostly Cloudy", R.drawable.icon_weather_cloudy, R.string.lbl_weather_cloudy),
    FOG("Fog", R.drawable.icon_weather_fog, R.string.lbl_weather_fog),
    /* JADX INFO: Fake field, exist only in values array */
    DRIZZLE("Drizzle", R.drawable.icon_weather_fog, R.string.lbl_weather_fog),
    /* JADX INFO: Fake field, exist only in values array */
    MIST("Mist", R.drawable.icon_weather_fog, R.string.lbl_weather_fog),
    /* JADX INFO: Fake field, exist only in values array */
    SMOKE("Smoke", R.drawable.icon_weather_fog, R.string.lbl_weather_fog),
    HAZE("Haze", R.drawable.icon_weather_fog, R.string.lbl_weather_fog),
    /* JADX INFO: Fake field, exist only in values array */
    DUST("Dust", R.drawable.icon_weather_fog, R.string.lbl_weather_fog),
    /* JADX INFO: Fake field, exist only in values array */
    SAND("Sand", R.drawable.icon_weather_fog, R.string.lbl_weather_fog),
    /* JADX INFO: Fake field, exist only in values array */
    VOLCANIC_ASH("Volcanic Ash", R.drawable.icon_weather_fog, R.string.lbl_weather_fog),
    HAIL("Hail", R.drawable.icon_weather_hail, R.string.lbl_weather_hail),
    PARTIALY_CLOUDY("Partly Cloudy", R.drawable.icon_weather_partly_cloudy, R.string.lbl_weather_partly_cloudy),
    PRECIPITATION("Precip", R.drawable.icon_weather_rain, R.string.lbl_weather_rain),
    RAIN("Rain", R.drawable.icon_weather_rain, R.string.lbl_weather_rain),
    LIGHT_RAIN("Light Rain", R.drawable.icon_weather_rain, R.string.lbl_weather_rain),
    HEAVY_RAIN("Heavy Rain", R.drawable.icon_weather_rain, R.string.lbl_weather_rain),
    SHOWERS("Showers", R.drawable.icon_weather_rain, R.string.lbl_weather_rain),
    /* JADX INFO: Fake field, exist only in values array */
    HEAVY_SHOWERS("Heavy Showers", R.drawable.icon_weather_rain, R.string.lbl_weather_rain),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHT_SHOWERS("Light Showers", R.drawable.icon_weather_rain, R.string.lbl_weather_rain),
    SNOW("Snow", R.drawable.icon_weather_snow, R.string.lbl_weather_snow),
    LIGHT_SNOW("Light Snow", R.drawable.icon_weather_snow, R.string.lbl_weather_snow),
    HEAVY_SNOW("Heavy Snow", R.drawable.icon_weather_snow, R.string.lbl_weather_snow),
    /* JADX INFO: Fake field, exist only in values array */
    TORNADO("Tornado", R.drawable.icon_weather_tornado, R.string.lbl_weather_tornado),
    THUNDERSTORM("Thunderstorm", R.drawable.icon_weather_thunderstorm, R.string.lbl_weather_thunderstorm),
    SQALL("Sqall", R.drawable.icon_weather_wind, R.string.lbl_weather_wind),
    ICE("Ice", R.drawable.icon_weather_intermix, R.string.lbl_weather_winter_mix);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f147008d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147030c;

    b0(String str, int i14, int i15) {
        this.f147028a = str;
        this.f147029b = i14;
        this.f147030c = i15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/b0$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b0 a(int i14) {
            if (3 <= i14 && i14 < 7) {
                return b0.CLEAR;
            }
            if (7 <= i14 && i14 < 11) {
                return b0.PARTIALY_CLOUDY;
            }
            if (11 <= i14 && i14 < 13) {
                return b0.HAZE;
            }
            if (13 <= i14 && i14 < 15) {
                return b0.MOSTLY_CLOUDY;
            }
            if (15 <= i14 && i14 < 17) {
                return b0.CLOUDY;
            }
            if (i14 == 17) {
                return b0.PRECIPITATION;
            }
            if (18 <= i14 && i14 < 22) {
                return b0.SHOWERS;
            }
            if (i14 == 22) {
                return b0.LIGHT_RAIN;
            }
            if (23 <= i14 && i14 < 28) {
                return b0.THUNDERSTORM;
            }
            if (i14 == 28) {
                return b0.RAIN;
            }
            if (i14 == 29) {
                return b0.HEAVY_RAIN;
            }
            if (30 <= i14 && i14 < 35) {
                return b0.LIGHT_SNOW;
            }
            if (35 <= i14 && i14 < 38) {
                return b0.SNOW;
            }
            if (i14 == 38) {
                return b0.HEAVY_SNOW;
            }
            if (39 <= i14 && i14 < 44) {
                return b0.ICE;
            }
            if (44 <= i14 && i14 < 46) {
                return b0.HAIL;
            }
            if (i14 == 46) {
                return b0.SQALL;
            }
            if (47 > i14 || i14 >= 49) {
                return null;
            }
            return b0.FOG;
        }

        public static b0 b(String str) {
            for (b0 b0Var : b0.values()) {
                if (p005kotlin.jvm.internal.s.g(b0Var.f147028a, str)) {
                    return b0Var;
                }
            }
            return null;
        }

        private a() {
        }
    }
}
