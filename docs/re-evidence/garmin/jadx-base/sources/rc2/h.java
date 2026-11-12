package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.lib.networking.authentication.exceptions.InvalidOAuth2TokenException;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import i3.e5;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.l0;
import p13.p0;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrc2/h;", "Lrc2/j;", "Lsc2/p;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "it2AccessToken", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends j<sc2.p> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f151908g;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context, ve2.e eVar, String str, String str2) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        Logger loggerB = nd2.c.b("IT2ValidateAccessTokenRequest");
        loggerB.getClass();
        super(context, loggerB, FirebasePerformance.HttpMethod.POST, new URL(tn.k.g(eVar.f177721c, "/api/oauth/tokeninfodetail")), str2);
        this.f151908g = str;
    }

    @Override // rc2.j
    public final Object c(t13.d<? super wc2.a<? extends sc2.p>> dVar) {
        Logger logger = this.f151915a;
        byte[] bArrO = d53.u.o("access_token=".concat(nd2.c.i(this.f151908g)));
        try {
            HttpURLConnection httpURLConnection = this.f151919e;
            httpURLConnection.getClass();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArrO.length));
            httpURLConnection.getOutputStream().write(bArrO);
            Integer numA = a();
            if (numA != null && numA.intValue() == 200) {
                return d();
            }
            if (numA != null && numA.intValue() == 400) {
                return e();
            }
            URL url = httpURLConnection.getURL();
            url.getClass();
            return nd2.c.a(logger, url, this.f151919e, numA);
        } catch (RateLimitException e4) {
            return new wc2.a.C3415a(e4, new Integer(e4.getServerResponseCode()), e4.getError(), null, 8, null);
        } catch (Exception e14) {
            logger.error(((Object) (0 == 0 ? "" : null)) + StringUtils.SPACE + this.f151917c, (Throwable) e14);
            return new wc2.a.C3415a(e14, null, null, null, 12, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    public final wc2.a.b d() throws Exception {
        Set setG1;
        String strH = nd2.c.h(this.f151919e);
        if (strH == null || d53.w.J(strH)) {
            q2.u("empty response body");
            return null;
        }
        JSONObject jSONObject = new JSONObject(strH);
        int i14 = jSONObject.getInt("expires_in");
        Calendar calendarC = nd2.c.c();
        calendarC.add(13, i14);
        long timeInMillis = calendarC.getTimeInMillis();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Action.SCOPE_ATTRIBUTE);
        boolean z14 = false;
        if (jSONArrayOptJSONArray != null) {
            j23.l lVarO = j23.t.o(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList(p13.y.r(lVarO, 10));
            Iterator<Integer> it = lVarO.iterator();
            while (((j23.k) it).f96801c) {
                arrayList.add(jSONArrayOptJSONArray.getString(((p0) it).nextInt()));
            }
            setG1 = p13.h0.g1(arrayList);
            if (setG1 == null) {
                setG1 = l0.f134950a;
            }
        } else {
            setG1 = l0.f134950a;
        }
        Set set = setG1;
        boolean zHas = jSONObject.has("mfa_check_passed");
        Logger logger = this.f151915a;
        if (zHas) {
            z14 = jSONObject.getBoolean("mfa_check_passed");
        } else {
            logger.error("handleResponse200: 'mfa_check_passed' missing in response JSON, setting 'OAuth2ITTokenInfo.hasMFAClaim' to FALSE");
        }
        boolean z15 = z14;
        String string = jSONObject.getString("audience");
        string.getClass();
        String string2 = jSONObject.getString("user_id");
        string2.getClass();
        String strOptString = jSONObject.optString("customer_managed_status", "");
        strOptString.getClass();
        sc2.p pVar = new sc2.p(string, string2, set, timeInMillis, z15, strOptString);
        String strG = "200 POST " + this.f151917c;
        if (nd2.c.f125412a) {
            strG = e5.g(strG, "\n", jSONObject.toString(4));
        }
        logger.debug(strG);
        return new wc2.a.b(pVar, 200);
    }

    public final wc2.a.C3415a e() {
        this.f151915a.warn("400 (InvalidOAuth2TokenException) POST " + this.f151917c);
        return new wc2.a.C3415a(new InvalidOAuth2TokenException(), 400, null, null, 12, null);
    }
}
