package qc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import lc.u0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lqc2/r;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "otherAppValidIT2AccessToken", "thisAppIT2ClientId", "thisAppITClientIdLoggingOnly", "Lsc2/l;", "thisAppDI2Client", "thisAppGC1ConsumerKey", "Lnc2/d;", "thisAppIntegrityTokenProvider", "", "isAccountSetupExchange", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsc2/l;Ljava/lang/String;Lnc2/d;Z)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f144439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve2.e f144440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f144442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f144443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sc2.l f144444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f144445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nc2.d f144446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f144447i;

    public r(Context context, ve2.e eVar, String str, String str2, String str3, sc2.l lVar, String str4, nc2.d dVar, boolean z14) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        lVar.getClass();
        str4.getClass();
        this.f144439a = context;
        this.f144440b = eVar;
        this.f144441c = str;
        this.f144442d = str2;
        this.f144443e = str3;
        this.f144444f = lVar;
        this.f144445g = str4;
        this.f144446h = dVar;
        this.f144447i = z14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(r rVar, Logger logger, sc2.m mVar, v13.c cVar) throws Exception {
        p pVar;
        rVar.getClass();
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f144434c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f144434c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(rVar, cVar);
            }
        } else {
            pVar = new p(rVar, cVar);
        }
        Object objE0 = pVar.f144432a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f144434c;
        if (i15 == 0) {
            o13.r.b(objE0);
            logger.debug("calling 'DI2ForGC1Request'...");
            b bVar = new b(rVar.f144439a, rVar.f144440b, mVar.f158528b, rVar.f144445g, null, 16, null);
            pVar.f144434c = 1;
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new a(bVar, null), pVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        wc2.a aVar2 = (wc2.a) objE0;
        if (aVar2 instanceof wc2.a.b) {
            T t7 = ((wc2.a.b) aVar2).f184316a;
            t7.getClass();
            return (sc2.j) t7;
        }
        if (aVar2 instanceof wc2.a.C3415a) {
            throw ((wc2.a.C3415a) aVar2).f184312a;
        }
        u0.r();
        return null;
    }
}
