package qc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.firebase.perf.FirebasePerformance;
import d53.u;
import d53.w;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqc2/j;", "Lqc2/k;", "Lsc2/n;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "Ldd2/c;", "thisAppGC1Credential", "", "mfaToken", "Lnc2/d;", "integrityTokenProvider", "<init>", "(Landroid/content/Context;Lve2/e;Ldd2/c;Ljava/lang/String;Lnc2/d;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends k<sc2.n> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f144410l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dd2.c f144411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nc2.d f144412k;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(Context context, ve2.e eVar, dd2.c cVar, String str, nc2.d dVar) {
        context.getClass();
        eVar.getClass();
        cVar.getClass();
        Logger loggerB = nd2.c.b("GC1ThisAppForDI2Request");
        loggerB.getClass();
        String str2 = (str == null || w.J(str)) ? null : str;
        super(context, loggerB, eVar, FirebasePerformance.HttpMethod.POST, "/oauth-service/oauth/exchange/user/2.0", null, cVar, str2 != null ? "mfa_token=".concat(nd2.c.i(str2)) : null, 32, null);
        this.f144411j = cVar;
        this.f144412k = dVar;
    }

    @Override // qc2.k
    public final Object b(k.b bVar) {
        String str = this.f144411j.f59212a;
        nc2.d dVar = this.f144412k;
        return dVar == null ? new nc2.e(null, null) : dVar.a(u.o(str), bVar);
    }

    @Override // qc2.k
    public final wc2.a<sc2.n> c() {
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

    public final wc2.a.b d(String str) throws JSONException {
        sc2.n.f158540c.getClass();
        sc2.n nVarA = sc2.n.a.a(str);
        String str2 = "200 POST " + this.f144420f;
        if (nd2.c.f125412a) {
            str2 = str2 + "\n" + nVarA;
        }
        this.f144415a.debug(str2);
        return new wc2.a.b(nVarA, 200);
    }

    public /* synthetic */ j(Context context, ve2.e eVar, dd2.c cVar, String str, nc2.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, eVar, cVar, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : dVar);
    }
}
