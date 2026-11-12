package eu2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import cu2.h;
import fu2.i;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Leu2/a;", "T", "", "", "logTag", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "Lfu2/i;", "xGarminData", "<init>", "(Ljava/lang/String;Landroid/location/Location;Lfu2/i;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f66114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f66115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpURLConnection f66116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f66117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f66118e;

    public a(String str, Location location, i iVar) {
        str.getClass();
        location.getClass();
        iVar.getClass();
        this.f66114a = iVar;
        Logger logger = LoggerFactory.getLogger(str);
        logger.getClass();
        this.f66115b = logger;
        this.f66117d = h.e(location.getLatitude());
        this.f66118e = h.e(location.getLongitude());
    }

    public static String d(InputStream inputStream) throws Throwable {
        String line;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringBuilder sb3 = new StringBuilder();
                do {
                    line = bufferedReader2.readLine();
                    if (line != null) {
                        sb3.append(line);
                    }
                } while (line != null);
                String string = sb3.toString();
                bufferedReader2.close();
                return string;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String e(HttpURLConnection httpURLConnection) {
        String strConcat;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            strConcat = inputStream != null ? d(inputStream).concat("\n") : "";
        } catch (Throwable unused) {
        }
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return strConcat;
            }
            return ((Object) strConcat) + d(errorStream);
        } catch (Throwable unused2) {
            return strConcat;
        }
    }

    public abstract T a(HttpURLConnection httpURLConnection);

    public final T b() {
        Logger logger = this.f66115b;
        URL urlC = c();
        try {
            URLConnection uRLConnectionOpenConnection = urlC.openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            logger.debug(urlC.toString());
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoInput(true);
            f(httpURLConnection);
            this.f66116c = httpURLConnection;
            T tA = a(httpURLConnection);
            HttpURLConnection httpURLConnection2 = this.f66116c;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return tA;
        } catch (Throwable th3) {
            try {
                logger.error((String) null, th3);
                throw th3;
            } catch (Throwable th4) {
                HttpURLConnection httpURLConnection3 = this.f66116c;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                throw th4;
            }
        }
    }

    public abstract URL c();

    public final void f(HttpURLConnection httpURLConnection) {
        String str;
        i iVar = this.f66114a;
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + iVar.f73608e);
        httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        httpURLConnection.setRequestProperty(HttpHeaders.CACHE_CONTROL, "no-cache");
        String str2 = iVar.f73609f;
        if (str2 != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, str2);
        }
        Context context = iVar.f73604a;
        if (Build.VERSION.SDK_INT >= 33) {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).versionName;
            str.getClass();
        } else {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            str.getClass();
        }
        httpURLConnection.setRequestProperty("X-Garmin-Paired-App-Version", com.nimbusds.jose.shaded.gson.internal.a.h(context.getPackageName(), ":", str, ",weather-lib:8.0.0"));
        String str3 = iVar.f73607d;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("X-Garmin-Firmware-Version", str3);
        }
        String str4 = iVar.f73606c;
        if (str4 != null) {
            httpURLConnection.setRequestProperty("X-Garmin-SW-Part-Number", str4);
        }
        String str5 = iVar.f73605b;
        if (str5 != null) {
            httpURLConnection.setRequestProperty("X-Garmin-Unit-ID", str5);
        }
    }
}
