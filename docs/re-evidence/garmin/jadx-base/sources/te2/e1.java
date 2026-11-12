package te2;

import android.content.Context;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lte2/e1;", "Lte2/s;", "Landroid/content/Context;", "appContext", "Lve2/d;", "account", "Lve2/l;", "mobileAuthConfig", "Lre2/b$c;", "mode", "Lve2/c;", "credentialUpdateDelegate", "<init>", "(Landroid/content/Context;Lve2/d;Lve2/l;Lre2/b$c;Lve2/c;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 extends s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(Context context, ve2.d dVar, ve2.l lVar, re2.b.c cVar, ve2.c cVar2) {
        super("GetOAuth2ITCredentials", false, context, dVar, lVar, cVar, cVar2);
        context.getClass();
        dVar.getClass();
        lVar.getClass();
        cVar.getClass();
    }

    @Override // te2.s
    public final Object j(sc2.o oVar, t13.d<? super sc2.o> dVar) throws Throwable {
        if (oVar == null) {
            return null;
        }
        uc2.a aVar = uc2.a.f169996a;
        sc2.a aVar2 = sc2.a.f158478d;
        aVar.getClass();
        uc2.b bVarD = uc2.a.d(aVar2);
        long j8 = oVar.f158545b;
        Logger logger = this.f164316c;
        if (bVarD == null) {
            if (!nd2.c.d(j8)) {
                logger.debug("getOrRefresh: IT2 not expired for this app, returning credential");
                return oVar;
            }
            logger.debug("getOrRefresh: IT2 expired or expiring within 1 hour for this app, attempting refresh");
            x53.c cVar = o53.s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new r(this, oVar, null), (v13.c) dVar);
            return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : (sc2.o) objE0;
        }
        long j14 = bVarD.f170004d;
        if (nd2.c.e(j8)) {
            re2.l0.f152316a.getClass();
            logger.warn("getOrRefresh: IT2 expired for this app and rate limiting in effect, throwing exception ".concat(re2.l0.a(j14)));
            throw new RateLimitException(bVarD.f170001a, "", null, bVarD.f170004d, 4, null);
        }
        re2.l0.f152316a.getClass();
        logger.warn("getOrRefresh: IT2 not expired and rate limiting in effect, returning credential ".concat(re2.l0.a(j14)));
        return oVar;
    }
}
