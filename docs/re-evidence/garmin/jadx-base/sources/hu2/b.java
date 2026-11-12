package hu2;

import android.location.Location;
import android.os.SystemClock;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhu2/b;", "Lhu2/a;", "", "jsonStr", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "<init>", "(Ljava/lang/String;Landroid/location/Location;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Location location) {
        super(location);
        location.getClass();
        this.f85738b = str;
    }

    public final gu2.a f(JSONObject jSONObject) {
        fu2.a aVarValueOf;
        fu2.b bVarValueOf;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strC = a.c(jSONObject, TtmlNode.ATTR_ID);
        String strC2 = a.c(jSONObject, "description");
        Integer numB = a.b(jSONObject, "epochIssuedTime");
        Integer numB2 = a.b(jSONObject, "epochExpireTime");
        String strC3 = a.c(jSONObject, "source");
        String strC4 = a.c(jSONObject, "text");
        try {
            String strOptString = jSONObject.optString("severity", "UNKNOWN");
            strOptString.getClass();
            aVarValueOf = fu2.a.valueOf(strOptString);
        } catch (IllegalArgumentException unused) {
            aVarValueOf = fu2.a.UNKNOWN;
        }
        fu2.a aVar = aVarValueOf;
        try {
            String strOptString2 = jSONObject.optString(NotificationConstants.KEY_DATA_MIME_TYPE, "");
            strOptString2.getClass();
            bVarValueOf = fu2.b.valueOf(strOptString2);
        } catch (IllegalArgumentException unused2) {
            bVarValueOf = null;
        }
        return new gu2.a(jElapsedRealtime, this.f85737a, strC, strC2, numB, numB2, strC3, strC4, aVar, bVarValueOf);
    }
}
