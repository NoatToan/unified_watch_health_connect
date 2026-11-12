package qc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.firebase.perf.FirebasePerformance;
import d53.w;
import i3.e5;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqc2/m;", "Lqc2/k;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "di2AccessToken", "Ldd2/c;", "gc1Credential", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ldd2/c;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends k<Boolean> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f144428j = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(Context context, ve2.e eVar, String str, dd2.c cVar) {
        context.getClass();
        eVar.getClass();
        Logger loggerB = nd2.c.b("GCIsMFAEnabledRequest");
        loggerB.getClass();
        super(context, loggerB, eVar, FirebasePerformance.HttpMethod.GET, "/oauth-service/oauth/isMFAEnabled", str, cVar, null, 128, null);
    }

    @Override // qc2.k
    public final Object b(k.b bVar) {
        return new nc2.e(null, null);
    }

    @Override // qc2.k
    public final wc2.a<Boolean> c() {
        Logger logger = this.f144415a;
        try {
            HttpURLConnection httpURLConnection = this.f144421g;
            if (httpURLConnection == null) {
                throw new Exception("connection is null");
            }
            int iG = oc.b.g(httpURLConnection);
            Integer numValueOf = Integer.valueOf(iG);
            if (200 != iG) {
                URL url = httpURLConnection.getURL();
                url.getClass();
                return nd2.c.a(logger, url, httpURLConnection, numValueOf);
            }
            String strH = nd2.c.h(this.f144421g);
            if (strH == null || w.J(strH)) {
                throw new Exception("empty response body");
            }
            return d(strH);
        } catch (RateLimitException e4) {
            return new wc2.a.C3415a(e4, Integer.valueOf(e4.getServerResponseCode()), e4.getError(), null, 8, null);
        } catch (Exception e14) {
            logger.error(((Object) (0 == 0 ? "" : null)) + StringUtils.SPACE + this.f144420f, (Throwable) e14);
            return new wc2.a.C3415a(e14, null, null, null, 12, null);
        }
    }

    public final wc2.a.b d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean("mfaEnabled", false);
        String strG = "200 GET " + this.f144420f;
        if (nd2.c.f125412a) {
            strG = e5.g(strG, "\n", jSONObject.toString(4));
        }
        this.f144415a.debug(strG);
        return new wc2.a.b(Boolean.valueOf(zOptBoolean), 200);
    }

    public /* synthetic */ m(Context context, ve2.e eVar, String str, dd2.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, eVar, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : cVar);
    }
}
