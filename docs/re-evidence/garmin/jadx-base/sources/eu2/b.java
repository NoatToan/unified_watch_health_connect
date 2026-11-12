package eu2;

import android.location.Location;
import android.text.TextUtils;
import com.garmin.net.weather.exception.FailedHttpRequestException;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import fu2.f;
import fu2.i;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Leu2/b;", "Leu2/a;", "", "Lgu2/a;", "Lfu2/f;", "environment", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "Lfu2/i;", "xGarminData", "<init>", "(Lfu2/f;Landroid/location/Location;Lfu2/i;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends a<List<? extends gu2.a>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f66119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Location f66120g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, Location location, i iVar) {
        super("WTHR#AlertsHttpReq", location, iVar);
        fVar.getClass();
        location.getClass();
        iVar.getClass();
        this.f66119f = fVar;
        this.f66120g = location;
    }

    @Override // eu2.a
    public final List<? extends gu2.a> a(HttpURLConnection httpURLConnection) throws IOException, FailedHttpRequestException {
        ArrayList arrayList;
        httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        Logger logger = this.f66115b;
        if (responseCode != 200) {
            String str = "HTTP Response " + httpURLConnection.getResponseCode() + ", alerts request -> " + a.e(httpURLConnection);
            logger.warn(str);
            throw new FailedHttpRequestException(httpURLConnection.getResponseCode(), str);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        inputStream.getClass();
        hu2.b bVar = new hu2.b(a.d(inputStream), this.f66120g);
        String str2 = bVar.f85738b;
        if (str2 == null || TextUtils.isEmpty(str2)) {
            arrayList = new ArrayList();
        } else {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i14);
                    jSONObject.getClass();
                    arrayList.add(i14, bVar.f(jSONObject));
                }
            } catch (JSONException e4) {
                LoggerFactory.getLogger("WTHR#AlertParser").error((String) null, (Throwable) e4);
                arrayList = new ArrayList();
            }
        }
        logger.debug("HTTP Response {}, alert -> {}", Integer.valueOf(httpURLConnection.getResponseCode()), arrayList);
        return arrayList;
    }

    @Override // eu2.a
    public final URL c() {
        return new URL(this.f66119f.f73586a + "/v2/alerts?lat=" + this.f66117d + "&lon=" + this.f66118e);
    }
}
