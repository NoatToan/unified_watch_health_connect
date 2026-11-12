package pc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import o13.r;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpc2/l;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "otherAppIT2AccessToken", "thisAppIT2ClientId", "thisAppITClientIdLoggingOnly", "Lsc2/l;", "thisAppDI2Client", "Lnc2/d;", "integrityTokenProvider", "", "isAccountSetupExchange", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsc2/l;Lnc2/d;Z)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f137346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve2.e f137347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f137349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f137350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sc2.l f137351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nc2.d f137352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f137353h;

    public l(Context context, ve2.e eVar, String str, String str2, String str3, sc2.l lVar, nc2.d dVar, boolean z14) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        lVar.getClass();
        this.f137346a = context;
        this.f137347b = eVar;
        this.f137348c = str;
        this.f137349d = str2;
        this.f137350e = str3;
        this.f137351f = lVar;
        this.f137352g = dVar;
        this.f137353h = z14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(l lVar, Logger logger, v13.c cVar) {
        i iVar;
        lVar.getClass();
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f137339c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f137339c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(lVar, cVar);
            }
        } else {
            iVar = new i(lVar, cVar);
        }
        Object objH = iVar.f137337a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f137339c;
        if (i15 == 0) {
            r.b(objH);
            logger.debug("calling 'IT2ForIT2Request'...");
            rc2.e eVar = new rc2.e(lVar.f137346a, lVar.f137347b, lVar.f137349d, lVar.f137348c, lVar.f137350e);
            iVar.f137339c = 1;
            objH = eVar.h(iVar);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objH);
        }
        return ((sc2.c) wc2.b.a((wc2.a) objH)).f158488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(l lVar, Logger logger, sc2.o oVar, v13.c cVar) throws Throwable {
        j jVar;
        lVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f137342c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f137342c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(lVar, cVar);
            }
        } else {
            jVar = new j(lVar, cVar);
        }
        Object objE0 = jVar.f137340a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f137342c;
        if (i15 == 0) {
            r.b(objE0);
            logger.debug("calling 'IT2ThisAppForDI2Request'...");
            n nVar = new n(lVar.f137346a, lVar.f137347b, oVar.f158544a, lVar.f137351f, lVar.f137352g, lVar.f137353h);
            jVar.f137342c = 1;
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new m(nVar, null), jVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        return ((sc2.n) wc2.b.a((wc2.a) objE0)).f158542b;
    }
}
