package hu2;

import android.location.Location;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhu2/c;", "Lhu2/a;", "", "jsonStr", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "<init>", "(Ljava/lang/String;Landroid/location/Location;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85739b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Location location) {
        super(location);
        location.getClass();
        this.f85739b = str;
    }

    public final gu2.b f(JSONObject jSONObject) throws JSONException {
        Integer numB = a.b(jSONObject, "epochSeconds");
        return new gu2.b(SystemClock.elapsedRealtime(), this.f85737a, numB, a.d(jSONObject, "temperature"), a.c(jSONObject, "description"), a.b(jSONObject, "icon"), a.d(jSONObject, "feelsLikeTemperature"), a.d(jSONObject, "dewPoint"), a.d(jSONObject, "windChill"), a.a(jSONObject, "relativeHumidity"), e(numB, jSONObject), a.c(jSONObject, "locationName"), a.d(jSONObject, "realFeel"), a.d(jSONObject, "realFeelShade"));
    }
}
