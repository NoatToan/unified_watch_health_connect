package te2;

import android.content.Context;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lte2/d1;", "Lte2/j;", "Landroid/content/Context;", "appContext", "Ldd2/a;", "credentials", "Lve2/l;", "mobileAuthConfig", "Lve2/e;", "environment", "", "customerGUID", "", "skipUsingOtherAppsCredentials", "Lve2/k;", "mfaTokenData", "Lre2/b$c;", "mode", "Lve2/c;", "credentialUpdateDelegate", "<init>", "(Landroid/content/Context;Ldd2/a;Lve2/l;Lve2/e;Ljava/lang/String;ZLve2/k;Lre2/b$c;Lve2/c;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d1 extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, dd2.a aVar, ve2.l lVar, ve2.e eVar, String str, boolean z14, ve2.k kVar, re2.b.c cVar, ve2.c cVar2) {
        super("GetOAuth2DICredentials", false, context, aVar, lVar, eVar, str, z14, kVar, cVar, cVar2);
        context.getClass();
        aVar.getClass();
        lVar.getClass();
        eVar.getClass();
        str.getClass();
        cVar.getClass();
    }

    @Override // te2.j
    public final Object j(sc2.m mVar, t13.d<? super sc2.m> dVar) throws Throwable {
        if (mVar != null) {
            Logger logger = this.f164316c;
            if (mVar.d(logger)) {
                uc2.a aVar = uc2.a.f169996a;
                sc2.a aVar2 = sc2.a.f158477c;
                aVar.getClass();
                uc2.b bVarD = uc2.a.d(aVar2);
                long j8 = mVar.f158530d;
                if (bVarD != null) {
                    long j14 = bVarD.f170004d;
                    if (nd2.c.e(j8)) {
                        re2.l0.f152316a.getClass();
                        logger.warn("getOrRefresh: DI2 expired for this app and rate limiting in effect, throwing exception ".concat(re2.l0.a(j14)));
                        throw new RateLimitException(bVarD.f170001a, "", null, bVarD.f170004d, 4, null);
                    }
                    re2.l0.f152316a.getClass();
                    logger.warn("getOrRefresh: DI2 not expired and rate limiting in effect, returning credential ".concat(re2.l0.a(j14)));
                    return mVar;
                }
                if (!nd2.c.d(j8)) {
                    logger.debug("getOrRefresh: DI2 not expired for this app, returning credential");
                    return mVar;
                }
                if (nd2.c.e(mVar.f158531e)) {
                    logger.warn("getOrRefresh: DI2 refresh token expired, refresh impossible");
                    return null;
                }
                logger.debug("getOrRefresh: DI2 expired or expiring within 1 hour for this app, refresh token not expired, attempting refresh");
                x53.c cVar = o53.s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new h(this, mVar, false, null), (v13.c) dVar);
                return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : (sc2.m) objE0;
            }
        }
        return null;
    }

    public /* synthetic */ d1(Context context, dd2.a aVar, ve2.l lVar, ve2.e eVar, String str, boolean z14, ve2.k kVar, re2.b.c cVar, ve2.c cVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, aVar, lVar, eVar, str, (i14 & 32) != 0 ? false : z14, kVar, cVar, cVar2);
    }
}
