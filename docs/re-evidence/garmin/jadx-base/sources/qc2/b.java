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
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqc2/b;", "Lqc2/k;", "Lsc2/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "thisAppOrOtherAppDI2AccessToken", "thisAppGC1ConsumerKey", "Lnc2/d;", "integrityTokenProvider", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Lnc2/d;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends k<sc2.j> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f144384l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f144385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nc2.d f144386k;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, ve2.e eVar, String str, String str2, nc2.d dVar) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        Logger loggerB = nd2.c.b("DI2ForGC1Request");
        loggerB.getClass();
        super(context, loggerB, eVar, FirebasePerformance.HttpMethod.POST, "/oauth-service/oauth/exchange/user/1.0", str, null, "consumer_key=".concat(nd2.c.i(str2)), 64, null);
        this.f144385j = str;
        this.f144386k = dVar;
    }

    @Override // qc2.k
    public final Object b(k.b bVar) {
        nc2.d dVar = this.f144386k;
        return dVar == null ? new nc2.e(null, null) : dVar.a(u.o(this.f144385j), bVar);
    }

    @Override // qc2.k
    public final wc2.a<sc2.j> c() {
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

    public final wc2.a.b d(String str) throws Exception {
        sc2.j.f158513c.getClass();
        sc2.j jVarA = sc2.j.a.a(str);
        String str2 = "200 POST " + this.f144420f;
        if (nd2.c.f125412a) {
            str2 = str2 + "\n" + jVarA;
        }
        this.f144415a.debug(str2);
        return new wc2.a.b(jVarA, 200);
    }

    public /* synthetic */ b(Context context, ve2.e eVar, String str, String str2, nc2.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, eVar, str, str2, (i14 & 16) != 0 ? null : dVar);
    }
}
