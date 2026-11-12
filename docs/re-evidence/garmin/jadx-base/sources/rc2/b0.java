package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import i3.e5;
import java.net.HttpURLConnection;
import java.net.URL;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrc2/b0;", "Lrc2/j;", "Lsc2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "customerGUID", "Lsc2/g;", "theITSSOSystemType", "Lo13/p;", "Lsc2/a;", "credential", "serviceURL", "mfaToken", "destinationAppID", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Lsc2/g;Lo13/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 extends j<sc2.f> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f151868n = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f151869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sc2.g f151870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.p<sc2.a, String> f151871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f151872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f151873k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f151874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public sc2.q f151875m;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f151877b;

        static {
            int[] iArr = new int[sc2.g.values().length];
            try {
                iArr[sc2.g.PORTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sc2.g.CAS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f151876a = iArr;
            int[] iArr2 = new int[sc2.a.values().length];
            try {
                iArr2[sc2.a.f158478d.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[sc2.a.f158477c.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[sc2.a.f158476b.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f151877b = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(Context context, ve2.e eVar, String str, sc2.g gVar, o13.p<? extends sc2.a, String> pVar, String str2, String str3, String str4, String str5) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        gVar.getClass();
        pVar.getClass();
        str2.getClass();
        str4.getClass();
        str5.getClass();
        Logger loggerB = nd2.c.b("ITLoginTokenRequest");
        loggerB.getClass();
        super(context, loggerB, FirebasePerformance.HttpMethod.POST, new URL(tn.k.g(eVar.f177719a, "/sso/requestToken")), str5);
        this.f151869g = str;
        this.f151870h = gVar;
        this.f151871i = pVar;
        this.f151872j = str2;
        this.f151873k = str3;
        this.f151874l = str4;
    }

    @Override // rc2.j
    public final Object c(t13.d<? super wc2.a<? extends sc2.f>> dVar) {
        String strF;
        String strConcat;
        Logger logger = this.f151915a;
        o13.p<sc2.a, String> pVar = this.f151871i;
        sc2.a aVar = pVar.f128594a;
        String str = pVar.f128595b;
        int i14 = a.f151877b[aVar.ordinal()];
        if (i14 == 1) {
            this.f151875m = sc2.q.OAUTH2_IT;
            strF = e5.f(str, "&accesstoken=");
        } else if (i14 == 2) {
            this.f151875m = sc2.q.OAUTH2_DI;
            strF = e5.f(str, "&connectAccessToken2=");
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            this.f151875m = sc2.q.OAUTH1_GC;
            strF = e5.f(str, "&connectAccessToken=");
        }
        String strN = fb1.c.n("&customerGUID=", this.f151869g);
        int i15 = a.f151876a[this.f151870h.ordinal()];
        String str2 = this.f151874l;
        if (i15 == 1) {
            strConcat = "&appid=".concat(nd2.c.i(str2));
        } else {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            strConcat = "&appid=".concat(nd2.c.i(d53.u.w(str2, ' ', '_')));
        }
        String strConcat2 = "&service=".concat(nd2.c.i(this.f151872j));
        String str3 = this.f151873k;
        String strConcat3 = (str3 == null || d53.w.J(str3)) ? "" : "&mfaToken=".concat(str3);
        StringBuilder sbI = p6.b.i("version=4", strF, strN, strConcat, strConcat2);
        sbI.append(strConcat3);
        byte[] bArrO = d53.u.o(sbI.toString());
        try {
            HttpURLConnection httpURLConnection = this.f151919e;
            if (httpURLConnection == null) {
                throw new Exception("connection is null");
            }
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArrO.length));
            httpURLConnection.getOutputStream().write(bArrO);
            Integer numA = a();
            if (numA != null && 200 == numA.intValue()) {
                return d();
            }
            URL url = httpURLConnection.getURL();
            url.getClass();
            return nd2.c.a(logger, url, httpURLConnection, numA);
        } catch (RateLimitException e4) {
            return new wc2.a.C3415a(e4, new Integer(e4.getServerResponseCode()), e4.getError(), null, 8, null);
        } catch (Exception e14) {
            logger.error(((Object) (0 != 0 ? null : "")) + StringUtils.SPACE + this.f151917c, (Throwable) e14);
            return new wc2.a.C3415a(e14, null, null, null, 12, null);
        }
    }

    public final wc2.a.b d() throws Exception {
        String strH = nd2.c.h(this.f151919e);
        if (strH == null || d53.w.J(strH)) {
            q2.u("empty response body");
            return null;
        }
        JSONObject jSONObject = new JSONObject(strH);
        String strOptString = jSONObject.optString("logintoken", "");
        strOptString.getClass();
        if (d53.w.J(strOptString)) {
            q2.u("response body did not contain 'logintoken'");
            return null;
        }
        String strG = "200 POST " + this.f151917c;
        if (nd2.c.f125412a) {
            strG = e5.g(strG, "\n", jSONObject.toString(4));
        }
        this.f151915a.debug(strG);
        sc2.q qVar = this.f151875m;
        if (qVar != null) {
            return new wc2.a.b(new sc2.f(strOptString, this.f151872j, qVar), 200);
        }
        p005kotlin.jvm.internal.s.m("grantor");
        throw null;
    }

    public /* synthetic */ b0(Context context, ve2.e eVar, String str, sc2.g gVar, o13.p pVar, String str2, String str3, String str4, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, eVar, str, gVar, pVar, str2, (i14 & 64) != 0 ? null : str3, str4, str5);
    }
}
