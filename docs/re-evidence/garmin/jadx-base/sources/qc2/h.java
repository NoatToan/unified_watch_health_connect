package qc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import d53.w;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lqc2/h;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "otherAppPackageName", "Lsc2/j;", "otherAppGC1Data", "thisAppConsumerKey", "thisAppConsumerSecret", "Lnc2/d;", "thisAppIntegrityTokenProvider", "Lve2/k;", "mfaTokenData", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Lsc2/j;Ljava/lang/String;Ljava/lang/String;Lnc2/d;Lve2/k;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f144400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve2.e f144401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sc2.j f144403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f144404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f144405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nc2.d f144406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ve2.k f144407h;

    public h(Context context, ve2.e eVar, String str, sc2.j jVar, String str2, String str3, nc2.d dVar, ve2.k kVar) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        jVar.getClass();
        str2.getClass();
        str3.getClass();
        this.f144400a = context;
        this.f144401b = eVar;
        this.f144402c = str;
        this.f144403d = jVar;
        this.f144404e = str2;
        this.f144405f = str3;
        this.f144406g = dVar;
        this.f144407h = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(h hVar, Logger logger, v13.c cVar) throws Exception {
        e eVar;
        hVar.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f144393c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f144393c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(hVar, cVar);
            }
        } else {
            eVar = new e(hVar, cVar);
        }
        Object objE0 = eVar.f144391a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f144393c;
        if (i15 == 0) {
            o13.r.b(objE0);
            logger.debug("calling 'GC1ForGC1Request'...");
            d dVar = new d(hVar.f144400a, hVar.f144401b, hVar.f144403d, hVar.f144402c, hVar.f144404e, hVar.f144405f);
            eVar.f144393c = 1;
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new c(dVar, null), eVar);
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
        Object objA = wc2.b.a((wc2.a) objE0);
        objA.getClass();
        return (sc2.j) objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(h hVar, Logger logger, sc2.j jVar, v13.c cVar) throws Exception {
        f fVar;
        String str;
        Long l14;
        hVar.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f144396c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f144396c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(hVar, cVar);
            }
        } else {
            fVar = new f(hVar, cVar);
        }
        Object objE0 = fVar.f144394a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f144396c;
        if (i15 == 0) {
            o13.r.b(objE0);
            logger.debug("calling 'GC1ThisAppForDI2Request'...");
            ve2.k kVar = hVar.f144407h;
            if (kVar != null) {
                String str2 = kVar.f177753a;
                if (str2 == null || w.J(str2) || (l14 = kVar.f177754b) == null || nd2.c.e(l14.longValue())) {
                    str2 = null;
                }
                str = str2;
            } else {
                str = null;
            }
            j jVar2 = new j(hVar.f144400a, hVar.f144401b, new dd2.c(jVar.f158514a, jVar.f158515b, hVar.f144404e, hVar.f144405f), str, hVar.f144406g);
            fVar.f144396c = 1;
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new i(jVar2, null), fVar);
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
        Object objA = wc2.b.a((wc2.a) objE0);
        objA.getClass();
        return (sc2.n) objA;
    }

    public /* synthetic */ h(Context context, ve2.e eVar, String str, sc2.j jVar, String str2, String str3, nc2.d dVar, ve2.k kVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(context, eVar, str, jVar, str2, str3, (i14 & 64) != 0 ? null : dVar, kVar);
    }
}
