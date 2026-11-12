package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrc2/k;", "Lrc2/j;", "Lsc2/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "logTag", "Lve2/e;", "environment", "thisAppITClientIdLoggingOnly", "grantType", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lve2/e;Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k extends j<sc2.c> {
    /* JADX WARN: Illegal instructions before constructor call */
    public k(Context context, String str, ve2.e eVar, String str2, String str3) {
        context.getClass();
        str.getClass();
        eVar.getClass();
        str2.getClass();
        str3.getClass();
        Logger loggerB = nd2.c.b(str);
        loggerB.getClass();
        super(context, loggerB, FirebasePerformance.HttpMethod.POST, new URL(j20.x.d(eVar.f177721c, "/oauth/", str3, "/token?grant_type=", str3)), str2);
    }

    @Override // rc2.j
    public final Object c(t13.d<? super wc2.a<? extends sc2.c>> dVar) {
        URL url = this.f151917c;
        Logger logger = this.f151915a;
        try {
            f();
            Integer numA = a();
            if (numA != null && 200 == numA.intValue()) {
                return e();
            }
            return nd2.c.a(logger, url, this.f151919e, numA);
        } catch (RateLimitException e4) {
            return new wc2.a.C3415a(e4, new Integer(e4.getServerResponseCode()), e4.getError(), null, 8, null);
        } catch (Exception e14) {
            logger.error(((Object) (0 == 0 ? "" : null)) + StringUtils.SPACE + url, (Throwable) e14);
            return new wc2.a.C3415a(e14, null, null, null, 12, null);
        }
    }

    public abstract byte[] d();

    public final wc2.a.b e() throws Exception {
        String strH = nd2.c.h(this.f151919e);
        if (strH == null || d53.w.J(strH)) {
            q2.u("empty response body");
            return null;
        }
        JSONObject jSONObject = new JSONObject(strH);
        int i14 = jSONObject.getInt("expires_in");
        Calendar calendarC = nd2.c.c();
        calendarC.add(13, i14);
        String string = jSONObject.getString("access_token");
        string.getClass();
        long timeInMillis = calendarC.getTimeInMillis();
        String string2 = jSONObject.getString("refresh_token");
        string2.getClass();
        sc2.o oVar = new sc2.o(string, timeInMillis, string2, jSONObject.optString("customerId", ""));
        String strOptString = jSONObject.optString("mfaToken", "");
        String strOptString2 = jSONObject.optString("mfaExpirationTimestamp", "");
        strOptString.getClass();
        boolean zJ = d53.w.J(strOptString);
        Logger logger = this.f151915a;
        ve2.k kVar = null;
        if (!zJ) {
            strOptString2.getClass();
            if (!d53.w.J(strOptString2)) {
                try {
                    kVar = new ve2.k(strOptString, Long.valueOf(nd2.c.f(strOptString2)));
                } catch (Exception e4) {
                    logger.error("handleResponse200: MFATokenData", (Throwable) e4);
                }
            }
        }
        String str = "200 POST " + this.f151917c;
        if (nd2.c.f125412a) {
            str = str + "\n" + oVar + "\n" + (kVar != null ? kVar : "");
        }
        logger.debug(str);
        return new wc2.a.b(new sc2.c(oVar, kVar, strH), 200);
    }

    public final void f() throws IOException {
        byte[] bArrD = d();
        HttpURLConnection httpURLConnection = this.f151919e;
        if (httpURLConnection != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "en_US");
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_CHARSET, "UTF-8");
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArrD.length));
            g(httpURLConnection);
            httpURLConnection.getOutputStream().write(bArrD);
        }
    }

    public abstract void g(HttpURLConnection httpURLConnection);
}
