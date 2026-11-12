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
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Leu2/c;", "Leu2/a;", "Lgu2/b;", "Lfu2/f;", "environment", "Lfu2/d;", "tempUnit", "Lfu2/c;", "speedUnit", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "Lfu2/i;", "xGarminData", "<init>", "(Lfu2/f;Lfu2/d;Lfu2/c;Landroid/location/Location;Lfu2/i;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends a<gu2.b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f66121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fu2.d f66122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fu2.c f66123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Location f66124i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, fu2.d dVar, fu2.c cVar, Location location, i iVar) {
        super("WTHR#ConditionsHttpReq", location, iVar);
        fVar.getClass();
        dVar.getClass();
        cVar.getClass();
        location.getClass();
        iVar.getClass();
        this.f66121f = fVar;
        this.f66122g = dVar;
        this.f66123h = cVar;
        this.f66124i = location;
    }

    @Override // eu2.a
    public final gu2.b a(HttpURLConnection httpURLConnection) throws IOException, FailedHttpRequestException {
        httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        Logger logger = this.f66115b;
        if (responseCode != 200) {
            String str = "HTTP Response " + httpURLConnection.getResponseCode() + ", conditions request -> " + a.e(httpURLConnection);
            logger.warn(str);
            throw new FailedHttpRequestException(httpURLConnection.getResponseCode(), str);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        inputStream.getClass();
        hu2.c cVar = new hu2.c(a.d(inputStream), this.f66124i);
        gu2.b bVarF = null;
        String str2 = cVar.f85739b;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                bVarF = cVar.f(new JSONObject(str2));
            } catch (JSONException e4) {
                LoggerFactory.getLogger("WTHR#ConditionsParser").error((String) null, (Throwable) e4);
            }
        }
        z.i("HTTP ", httpURLConnection.getResponseCode(), logger);
        return bVarF;
    }

    @Override // eu2.a
    public final URL c() {
        String str = this.f66121f.f73586a;
        String strName = this.f66122g.name();
        String strName2 = this.f66123h.name();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("/v2/current?lat=");
        sb3.append(this.f66117d);
        sb3.append("&lon=");
        p6.b.k(this.f66118e, "&tempUnit=", strName, sb3);
        return new URL(j.o("&speedUnit=", strName2, sb3));
    }
}
