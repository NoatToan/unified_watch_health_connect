package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.android.gms.wallet.WalletConstants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrc2/i0;", "Lrc2/j;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "customerGUID", "mfaToken", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 extends j<Object> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f151912h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f151913g;

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(Context context, ve2.e eVar, String str, String str2, String str3) throws JSONException {
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        Logger logger = LoggerFactory.getLogger("NC#".concat("ITValidateMFATokenRequest"));
        logger.getClass();
        super(context, logger, FirebasePerformance.HttpMethod.POST, new URL(tn.k.g(eVar.f177719a, "/sso/mfaValidate")), str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaToken", str2);
        jSONObject.put("customerGUID", str);
        String string = jSONObject.toString();
        string.getClass();
        this.f151913g = d53.u.o(string);
    }

    public static ve2.k d(JSONObject jSONObject) throws JSONException, ParseException {
        String string = jSONObject.getString("mfaExpirationTimestamp");
        string.getClass();
        return new ve2.k(jSONObject.getString("mfaToken"), Long.valueOf(nd2.c.f(string)));
    }

    @Override // rc2.j
    public final Object c(t13.d<? super wc2.a<? extends Object>> dVar) {
        byte[] bArr = this.f151913g;
        Logger logger = this.f151915a;
        try {
            HttpURLConnection httpURLConnection = this.f151919e;
            if (httpURLConnection == null) {
                throw new Exception("connection is null");
            }
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr.length));
            httpURLConnection.getOutputStream().write(bArr);
            Integer numA = a();
            if (numA != null && numA.intValue() == 200) {
                String strH = nd2.c.h(httpURLConnection);
                if (strH == null || d53.w.J(strH)) {
                    throw new Exception("empty response body");
                }
                JSONObject jSONObject = new JSONObject(strH);
                ve2.k kVarD = d(jSONObject);
                String str = "200 POST " + httpURLConnection.getURL();
                if (nd2.c.f125412a) {
                    str = str + "\n" + jSONObject.toString(4);
                }
                logger.debug(str);
                return new wc2.a.b(kVarD, 200);
            }
            if (numA != null && numA.intValue() == 404) {
                logger.warn("404 " + httpURLConnection.getURL());
                return new wc2.a.b(Unit.INSTANCE, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
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
