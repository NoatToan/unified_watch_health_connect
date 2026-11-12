package eu2;

import android.location.Location;
import android.text.TextUtils;
import com.garmin.net.weather.exception.FailedHttpRequestException;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import fu2.f;
import fu2.i;
import i3.e5;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Leu2/e;", "Leu2/a;", "", "Lgu2/d;", "Lfu2/f;", "environment", "Lfu2/d;", "tempUnit", "Lfu2/c;", "speedUnit", "", "nbrHours", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "Lfu2/i;", "xGarminData", "<init>", "(Lfu2/f;Lfu2/d;Lfu2/c;ILandroid/location/Location;Lfu2/i;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends a<List<? extends gu2.d>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f66129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fu2.d f66130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fu2.c f66131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f66132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Location f66133j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, fu2.d dVar, fu2.c cVar, int i14, Location location, i iVar) {
        super("WTHR#HourlyForecastHttpReq", location, iVar);
        fVar.getClass();
        dVar.getClass();
        cVar.getClass();
        location.getClass();
        iVar.getClass();
        this.f66129f = fVar;
        this.f66130g = dVar;
        this.f66131h = cVar;
        this.f66132i = i14;
        this.f66133j = location;
    }

    @Override // eu2.a
    public final List<? extends gu2.d> a(HttpURLConnection httpURLConnection) throws IOException, FailedHttpRequestException {
        ArrayList arrayList;
        httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        Logger logger = this.f66115b;
        if (responseCode != 200) {
            String str = "HTTP Response " + httpURLConnection.getResponseCode() + ", hourly forecast request -> " + a.e(httpURLConnection);
            logger.warn(str);
            throw new FailedHttpRequestException(httpURLConnection.getResponseCode(), str);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        inputStream.getClass();
        hu2.e eVar = new hu2.e(a.d(inputStream), this.f66133j);
        String str2 = eVar.f85741b;
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
                    arrayList.add(i14, eVar.f(jSONObject));
                }
            } catch (JSONException e4) {
                LoggerFactory.getLogger("WTHR#HourlyForecastParser").error((String) null, (Throwable) e4);
                arrayList = new ArrayList();
            }
        }
        z.i("HTTP ", httpURLConnection.getResponseCode(), logger);
        return arrayList;
    }

    @Override // eu2.a
    public final URL c() {
        String str = this.f66129f.f73586a;
        String strName = this.f66130g.name();
        String strName2 = this.f66131h.name();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("/v2/forecast/hour?lat=");
        sb3.append(this.f66117d);
        sb3.append("&lon=");
        sb3.append(this.f66118e);
        sb3.append("&duration=");
        sb3.append(this.f66132i);
        return new URL(e5.h(sb3, "&tempUnit=", strName, "&speedUnit=", strName2));
    }
}
