package te2;

import android.content.Context;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lte2/h2;", "Lte2/j;", "Landroid/content/Context;", "appContext", "Ldd2/a;", "credentials", "Lve2/l;", "mobileAuthConfig", "Lve2/e;", "environment", "", "customerGUID", "", "skipUsingOtherAppsCredentials", "Lve2/k;", "mfaTokenData", "Lre2/b$c;", "mode", "Lve2/c;", "credentialUpdateDelegate", "<init>", "(Landroid/content/Context;Ldd2/a;Lve2/l;Lve2/e;Ljava/lang/String;ZLve2/k;Lre2/b$c;Lve2/c;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h2 extends j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.mobileauth.biz.RefreshOAuth2DICredentials", f = "RefreshOAuth2DICredentials.kt", l = {52, 58, 62}, m = "getOrRefresh")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sc2.m f164074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f164075b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f164077d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f164075b = obj;
            this.f164077d |= Integer.MIN_VALUE;
            return h2.this.j(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, dd2.a aVar, ve2.l lVar, ve2.e eVar, String str, boolean z14, ve2.k kVar, re2.b.c cVar, ve2.c cVar2) {
        super("RefreshOAuth2DICredentials", true, context, aVar, lVar, eVar, str, z14, kVar, cVar, cVar2);
        context.getClass();
        aVar.getClass();
        lVar.getClass();
        eVar.getClass();
        str.getClass();
        cVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // te2.j
    public final Object j(sc2.m mVar, t13.d<? super sc2.m> dVar) throws Throwable {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f164077d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f164077d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objE0 = aVar.f164075b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f164077d;
        Logger logger = this.f164316c;
        if (i15 == 0) {
            o13.r.b(objE0);
            if (mVar == null || !mVar.d(logger)) {
                return null;
            }
            logger.debug("getOrRefresh: found DI2 credential on this account");
            if (nd2.c.d(mVar.f158530d)) {
                logger.debug("getOrRefresh: DI2 expired, attempting refresh...");
                aVar.f164077d = 3;
                x53.c cVar = o53.s0.f129406a;
                Object objE1 = ge1.b.e0(x53.b.f189152a, new h(this, mVar, false, null), aVar);
                if (objE1 != aVar2) {
                    return objE1;
                }
            } else {
                sc2.l lVarB = this.f164103h.b(this.f164104i);
                lVarB.getClass();
                aVar.f164074a = mVar;
                aVar.f164077d = 1;
                x53.c cVar2 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new i(this, mVar, lVarB, null), aVar);
                if (objE0 != aVar2) {
                }
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objE0);
                return objE0;
            }
            if (i15 == 3) {
                o13.r.b(objE0);
                return objE0;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mVar = aVar.f164074a;
        o13.r.b(objE0);
        sc2.m mVar2 = (sc2.m) objE0;
        if (mVar2 != null) {
            logger.warn("getOrRefresh: DI2 still valid, app should be calling 'AuthenticationHelper.getOAuth2DICredentials()'");
            return mVar2;
        }
        logger.debug("getOrRefresh: DI2 TTL indicates should not be expired - but server reports not valid");
        aVar.f164074a = null;
        aVar.f164077d = 2;
        x53.c cVar3 = o53.s0.f129406a;
        Object objE2 = ge1.b.e0(x53.b.f189152a, new h(this, mVar, true, null), aVar);
        return objE2 == aVar2 ? aVar2 : objE2;
    }
}
