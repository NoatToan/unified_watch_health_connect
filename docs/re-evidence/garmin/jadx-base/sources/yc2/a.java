package yc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyc2/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f196738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f196739e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URL f196740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HttpURLConnection f196741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f196742c;

    static {
        new C3680a(null);
    }

    public a(Context context) {
        context.getClass();
        if (f196738d == null) {
            f196738d = wc2.c.b(context, "networking-core", "5.1.1");
        }
        if (f196739e == null) {
            f196739e = wc2.c.a(context);
        }
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f196741b;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
        }
    }

    public final void b(Logger logger, URL url, String str, String str2) throws IOException {
        logger.getClass();
        this.f196740a = url;
        logger.debug(str + StringUtils.SPACE + url);
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        this.f196741b = httpURLConnection;
        httpURLConnection.setRequestMethod(str);
        if (str.equalsIgnoreCase(FirebasePerformance.HttpMethod.POST)) {
            httpURLConnection.setDoOutput(true);
        }
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty(HttpHeaders.CACHE_CONTROL, "no-cache");
        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, f196738d);
        httpURLConnection.setRequestProperty("X-Garmin-User-Agent", f196739e);
        httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, str2);
    }

    /* JADX INFO: renamed from: yc2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc2/a$a;", "", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3680a {
        public /* synthetic */ C3680a(j jVar) {
            this();
        }

        private C3680a() {
        }
    }
}
