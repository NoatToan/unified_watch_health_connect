package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lrc2/i;", "T", "Lrc2/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/slf4j/Logger;", "logger", "", "it2AccessToken", "Ljava/net/URL;", "url", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lorg/slf4j/Logger;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i<T> extends j<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f151911g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, Logger logger, String str, URL url, String str2) {
        super(context, logger, FirebasePerformance.HttpMethod.GET, url, str2);
        context.getClass();
        logger.getClass();
        str.getClass();
        url.getClass();
        str2.getClass();
        this.f151911g = str;
    }

    public final wc2.a d() {
        Logger logger = this.f151915a;
        try {
            HttpURLConnection httpURLConnection = this.f151919e;
            if (httpURLConnection == null) {
                throw new Exception("connection is null");
            }
            httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + this.f151911g);
            httpURLConnection.connect();
            Integer numA = a();
            if (numA != null && 200 == numA.intValue()) {
                String strH = nd2.c.h(httpURLConnection);
                if (strH == null || d53.w.J(strH)) {
                    throw new Exception("empty response body");
                }
                logger.debug("200 GET " + httpURLConnection.getURL());
                return new wc2.a.b(sc2.r.a(strH), 200);
            }
            URL url = httpURLConnection.getURL();
            url.getClass();
            return nd2.c.a(logger, url, httpURLConnection, numA);
        } catch (RateLimitException e4) {
            return new wc2.a.C3415a(e4, new Integer(e4.getServerResponseCode()), e4.getError(), null, 8, null);
        } catch (Exception e14) {
            logger.error(((Object) (0 == 0 ? "" : null)) + StringUtils.SPACE + this.f151917c, (Throwable) e14);
            return new wc2.a.C3415a(e14, null, null, null, 12, null);
        }
    }
}
