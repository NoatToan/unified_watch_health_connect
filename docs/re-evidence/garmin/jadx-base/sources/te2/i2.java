package te2;

import android.content.Context;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lte2/i2;", "Lte2/s;", "Landroid/content/Context;", "appContext", "Lve2/d;", "account", "Lve2/l;", "mobileAuthConfig", "Lre2/b$c;", "mode", "Lve2/c;", "credentialUpdateDelegate", "<init>", "(Landroid/content/Context;Lve2/d;Lve2/l;Lre2/b$c;Lve2/c;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i2 extends s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.mobileauth.biz.RefreshOAuth2ITCredentials", f = "RefreshOAuth2ITCredentials.kt", l = {36, 45, 49}, m = "getOrRefresh")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sc2.o f164096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f164097b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f164099d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f164097b = obj;
            this.f164099d |= Integer.MIN_VALUE;
            return i2.this.j(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Context context, ve2.d dVar, ve2.l lVar, re2.b.c cVar, ve2.c cVar2) {
        super("RefreshOAuth2ITCredentials", true, context, dVar, lVar, cVar, cVar2);
        context.getClass();
        dVar.getClass();
        lVar.getClass();
        cVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r12 == r1) goto L36;
     */
    @Override // te2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(sc2.o oVar, t13.d<? super sc2.o> dVar) throws Throwable {
        a aVar;
        sc2.o oVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f164099d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f164099d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objE0 = aVar.f164097b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f164099d;
        Logger logger = this.f164316c;
        if (i15 != 0) {
            if (i15 == 1) {
                oVar = aVar.f164096a;
                o13.r.b(objE0);
                oVar2 = (sc2.o) objE0;
                if (oVar2 != null) {
                    logger.warn("getOrRefresh: IT2 still valid, app should be calling 'AuthenticationHelper.getOAuth2ITCredentials()'");
                    return oVar2;
                }
                logger.debug("getOrRefresh: IT2 TTL indicates should not be expired - but server reports not valid");
                aVar.f164096a = null;
                aVar.f164099d = 2;
                x53.c cVar = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new r(this, oVar, null), aVar);
            } else {
                if (i15 != 2) {
                    if (i15 == 3) {
                        o13.r.b(objE0);
                        return (sc2.o) objE0;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE0);
            }
            return (sc2.o) objE0;
        }
        o13.r.b(objE0);
        if (oVar == null) {
            return null;
        }
        logger.debug("getOrRefresh: found IT2 credential on this account");
        if (nd2.c.d(oVar.f158545b)) {
            logger.debug("getOrRefresh: IT2 expired, attempting refresh...");
            aVar.f164099d = 3;
            x53.c cVar2 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new r(this, oVar, null), aVar);
        } else {
            re2.b bVar = re2.b.f152215a;
            ve2.e eVar = this.f164286g.f177690a;
            aVar.f164096a = oVar;
            aVar.f164099d = 1;
            bVar.getClass();
            x53.c cVar3 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new re2.e0(eVar, oVar, true, null), aVar);
            if (objE0 != aVar2) {
                oVar2 = (sc2.o) objE0;
                if (oVar2 != null) {
                    logger.warn("getOrRefresh: IT2 still valid, app should be calling 'AuthenticationHelper.getOAuth2ITCredentials()'");
                    return oVar2;
                }
                logger.debug("getOrRefresh: IT2 TTL indicates should not be expired - but server reports not valid");
                aVar.f164096a = null;
                aVar.f164099d = 2;
                x53.c cVar4 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new r(this, oVar, null), aVar);
            }
        }
        return aVar2;
    }
}
