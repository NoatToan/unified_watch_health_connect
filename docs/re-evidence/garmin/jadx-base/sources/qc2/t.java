package qc2;

import android.content.Context;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.firebase.perf.FirebasePerformance;
import d53.u;
import d53.w;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqc2/t;", "Lqc2/k;", "Lsc2/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "Lsc2/h;", "theITServiceTicket", "", "gc1ConsumerKey", "gc1ConsumerSecret", "Lnc2/d;", "integrityTokenProvider", "<init>", "(Landroid/content/Context;Lve2/e;Lsc2/h;Ljava/lang/String;Ljava/lang/String;Lnc2/d;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends k<sc2.k> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f144450l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sc2.h f144451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nc2.d f144452k;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Context context, ve2.e eVar, sc2.h hVar, String str, String str2, nc2.d dVar) {
        context.getClass();
        eVar.getClass();
        hVar.getClass();
        str.getClass();
        str2.getClass();
        Logger logger = LoggerFactory.getLogger("NC#".concat("ITTicketForGC1Request"));
        logger.getClass();
        super(context, logger, eVar, FirebasePerformance.HttpMethod.GET, a0.j("/oauth-service/oauth/preauthorized?accepts-mfa-tokens=true&ticket=", hVar.f158506b, "&login-url=", hVar.f158505a), null, new dd2.c("", "", str, str2), null, SyslogConstants.LOG_LOCAL4, null);
        this.f144451j = hVar;
        this.f144452k = dVar;
    }

    @Override // qc2.k
    public final Object b(k.b bVar) {
        sc2.h hVar = this.f144451j;
        String strJ = a0.j("service_ticket=", nd2.c.i(hVar.f158506b), "&service_url=", nd2.c.i(hVar.f158505a));
        nc2.d dVar = this.f144452k;
        return dVar == null ? new nc2.e(null, null) : dVar.a(u.o(strJ), bVar);
    }

    @Override // qc2.k
    public final wc2.a<sc2.k> c() {
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
        Collection collectionS0;
        CharSequence charSequence;
        sc2.k.f158521c.getClass();
        str.getClass();
        List listG = new d53.k("&").g(0, str);
        if (listG.isEmpty()) {
            collectionS0 = j0.f134944a;
            break;
        }
        ListIterator listIterator = listG.listIterator(listG.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                collectionS0 = j0.f134944a;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                collectionS0 = h0.S0(listG, listIterator.nextIndex() + 1);
                break;
            }
        }
        ve2.k kVar = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        for (String str2 : (String[]) collectionS0.toArray(new String[0])) {
            if (u.y(str2, "oauth_token=", true)) {
                obj = w.X(str2, new char[]{'='}).get(1);
            } else if (u.y(str2, "oauth_token_secret=", true)) {
                obj2 = w.X(str2, new char[]{'='}).get(1);
            } else if (u.y(str2, "mfa_token=", true)) {
                obj3 = w.X(str2, new char[]{'='}).get(1);
            } else if (u.y(str2, "mfa_expiration_timestamp=", true)) {
                obj4 = w.X(str2, new char[]{'='}).get(1);
            }
        }
        CharSequence charSequence2 = (CharSequence) obj;
        if (charSequence2 == null || w.J(charSequence2)) {
            q2.u("server body 'oauth_token' is non-existent, null, or blank");
            return null;
        }
        CharSequence charSequence3 = (CharSequence) obj2;
        if (charSequence3 == null || w.J(charSequence3)) {
            q2.u("server body 'oauth_token_secret' is non-existent, null, or blank");
            return null;
        }
        CharSequence charSequence4 = (CharSequence) obj3;
        if (charSequence4 != null && !w.J(charSequence4) && (charSequence = (CharSequence) obj4) != null && !w.J(charSequence)) {
            obj4.getClass();
            kVar = new ve2.k((String) obj3, Long.valueOf(nd2.c.f((String) obj4)));
        }
        obj.getClass();
        obj2.getClass();
        sc2.k kVar2 = new sc2.k(kVar, new sc2.j((String) obj, (String) obj2));
        String str3 = "200 GET " + this.f144420f;
        if (nd2.c.f125412a) {
            str3 = str3 + "\n" + kVar2;
        }
        this.f144415a.debug(str3);
        return new wc2.a.b(kVar2, 200);
    }

    public /* synthetic */ t(Context context, ve2.e eVar, sc2.h hVar, String str, String str2, nc2.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, eVar, hVar, str, str2, (i14 & 32) != 0 ? null : dVar);
    }
}
