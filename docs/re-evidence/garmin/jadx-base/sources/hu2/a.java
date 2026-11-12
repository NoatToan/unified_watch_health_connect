package hu2;

import android.location.Location;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhu2/a;", "", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "<init>", "(Landroid/location/Location;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Location f85737a;

    public a(Location location) {
        location.getClass();
        this.f85737a = location;
    }

    public static Double a(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        try {
            return Double.valueOf(jSONObject.getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Integer b(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String c(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static fu2.e d(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.isNull(str)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        jSONObject2.getClass();
        return new fu2.e(a(jSONObject2, "value"), c(jSONObject2, "units"));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public final gu2.e e(Integer num, JSONObject jSONObject) throws JSONException {
        fu2.e eVar;
        if (jSONObject.isNull("wind")) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("wind");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        jSONObject2.getClass();
        fu2.e eVarD = d(jSONObject2, "speed");
        if ((eVarD != null ? eVarD.f73578a : null) == null) {
            eVar = eVarD;
        } else {
            Double d14 = eVarD.f73578a;
            d14.getClass();
            if (d14.doubleValue() >= 0.0d) {
                Double d15 = eVarD.f73578a;
                d15.getClass();
                if (d15.doubleValue() < 65535.0d) {
                    eVar = eVarD;
                }
            }
            eVar = new fu2.e(Double.valueOf(0.0d), eVarD.f73579b);
        }
        return new gu2.e(jElapsedRealtime, this.f85737a, num, eVar, c(jSONObject2, "directionString"), b(jSONObject2, "direction"));
    }
}
