package eu2;

import am.j;
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
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Leu2/d;", "Leu2/a;", "", "Lgu2/c;", "Lfu2/f;", "environment", "Lfu2/d;", "tempUnit", "", "nbrDays", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "Lfu2/i;", "xGarminData", "<init>", "(Lfu2/f;Lfu2/d;ILandroid/location/Location;Lfu2/i;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends a<List<? extends gu2.c>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f66125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fu2.d f66126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f66127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Location f66128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, fu2.d dVar, int i14, Location location, i iVar) {
        super("WTHR#DailyForecastHttpReq", location, iVar);
        fVar.getClass();
        dVar.getClass();
        location.getClass();
        iVar.getClass();
        this.f66125f = fVar;
        this.f66126g = dVar;
        this.f66127h = i14;
        this.f66128i = location;
    }

    @Override // eu2.a
    public final List<? extends gu2.c> a(HttpURLConnection httpURLConnection) throws IOException, FailedHttpRequestException {
        ArrayList arrayList;
        httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        Logger logger = this.f66115b;
        if (responseCode != 200) {
            String str = "HTTP Response " + httpURLConnection.getResponseCode() + ", daily forecast request -> " + a.e(httpURLConnection);
            logger.warn(str);
            throw new FailedHttpRequestException(httpURLConnection.getResponseCode(), str);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        inputStream.getClass();
        hu2.d dVar = new hu2.d(a.d(inputStream), this.f66128i);
        String str2 = dVar.f85740b;
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
                    arrayList.add(i14, dVar.f(jSONObject));
                }
            } catch (JSONException e4) {
                LoggerFactory.getLogger("WTHR#DailyForecastParser").error((String) null, (Throwable) e4);
                arrayList = new ArrayList();
            }
        }
        z.i("HTTP ", httpURLConnection.getResponseCode(), logger);
        return arrayList;
    }

    @Override // eu2.a
    public final URL c() {
        String str = this.f66125f.f73586a;
        String strName = this.f66126g.name();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("/v2/forecast/day?lat=");
        sb3.append(this.f66117d);
        sb3.append("&lon=");
        sb3.append(this.f66118e);
        sb3.append("&duration=");
        sb3.append(this.f66127h);
        return new URL(j.o("&tempUnit=", strName, sb3));
    }
}
