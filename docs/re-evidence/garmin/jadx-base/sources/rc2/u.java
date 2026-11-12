package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.firebase.perf.FirebasePerformance;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrc2/u;", "Lrc2/j;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "customerGUID", "mfaToken", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends j<Unit> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f151951g = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(Context context, ve2.e eVar, String str, String str2, String str3) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        Logger loggerB = nd2.c.b("ITDeleteMFATokenRequest");
        loggerB.getClass();
        super(context, loggerB, FirebasePerformance.HttpMethod.DELETE, new URL(j20.x.d(eVar.f177719a, "/sso/deleteMFAToken/", str2, "/", str)), str3);
    }

    @Override // rc2.j
    public final Object c(t13.d<? super wc2.a<? extends Unit>> dVar) {
        Logger logger = this.f151915a;
        try {
            HttpURLConnection httpURLConnection = this.f151919e;
            if (httpURLConnection == null) {
                throw new Exception("connection is null");
            }
            Integer numA = a();
            if (numA == null || numA.intValue() != 200) {
                if (numA != null && numA.intValue() == 404) {
                }
                URL url = httpURLConnection.getURL();
                url.getClass();
                return nd2.c.a(logger, url, httpURLConnection, numA);
            }
            logger.debug(numA + StringUtils.SPACE + httpURLConnection.getURL());
            Unit unit = Unit.INSTANCE;
            numA.getClass();
            return new wc2.a.b(unit, numA.intValue());
        } catch (RateLimitException e4) {
            return new wc2.a.C3415a(e4, new Integer(e4.getServerResponseCode()), e4.getError(), null, 8, null);
        } catch (Exception e14) {
            logger.error(((Object) (0 == 0 ? "" : null)) + StringUtils.SPACE + this.f151917c, (Throwable) e14);
            return new wc2.a.C3415a(e14, null, null, null, 12, null);
        }
    }
}
