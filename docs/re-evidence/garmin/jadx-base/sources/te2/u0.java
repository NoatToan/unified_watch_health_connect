package te2;

import android.content.Context;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import java.net.UnknownHostException;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lte2/u0;", "Lte2/u;", "Landroid/content/Context;", "appContext", "Lve2/d;", "account", "Lve2/l;", "mobileAuthConfig", "Lre2/b$c;", "mode", "Lve2/c;", "credentialUpdateDelegate", "<init>", "(Landroid/content/Context;Lve2/d;Lve2/l;Lre2/b$c;Lve2/c;)V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 extends u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f164318q = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f164319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final re2.b.c f164320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ve2.e f164321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f164322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sc2.j f164323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dd2.b f164324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sc2.o f164325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sc2.m f164326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sc2.l f164327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sc2.l f164328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f164329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nc2.d f164330p;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Context context, ve2.d dVar, ve2.l lVar, re2.b.c cVar, ve2.c cVar2) {
        super("GetOAuth1GCCredentials", cVar, context);
        context.getClass();
        dVar.getClass();
        lVar.getClass();
        cVar.getClass();
        this.f164319e = context;
        this.f164320f = cVar;
        ve2.e eVar = dVar.f177690a;
        this.f164321g = eVar;
        this.f164322h = dVar.f177691b;
        dd2.a aVar = dVar.f177695f;
        this.f164323i = aVar != null ? aVar.f59204a : null;
        this.f164324j = lVar.a(eVar);
        dd2.a aVar2 = dVar.f177695f;
        this.f164325k = aVar2 != null ? aVar2.f59205b : null;
        this.f164326l = aVar2 != null ? aVar2.f59206c : null;
        this.f164327m = lVar.b(eVar);
        this.f164328n = lVar.c(eVar);
        this.f164329o = lVar.d();
        this.f164330p = lVar.f177765f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r6 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(u0 u0Var, v13.c cVar) throws Exception {
        z0 z0Var;
        u0Var.getClass();
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i14 = z0Var.f164412c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z0Var.f164412c = i14 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(u0Var, cVar);
            }
        } else {
            z0Var = new z0(u0Var, cVar);
        }
        Object objE = z0Var.f164410a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = z0Var.f164412c;
        if (i15 == 0) {
            o13.r.b(objE);
            z0Var.f164412c = 1;
            objE = u0Var.e(false, z0Var);
            if (objE != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objE);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        sc2.j jVar = (sc2.j) objE;
        if (jVar != null) {
            return jVar;
        }
        return null;
        sc2.j jVar2 = (sc2.j) objE;
        if (jVar2 != null) {
            return jVar2;
        }
        z0Var.f164412c = 2;
        objE = u0Var.f(z0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object e(boolean z14, v13.c cVar) throws Exception {
        a1 a1Var;
        boolean z15 = z14;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i14 = a1Var.f163958d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a1Var.f163958d = i14 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, cVar);
            }
        } else {
            a1Var = new a1(this, cVar);
        }
        Object objE0 = a1Var.f163956b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a1Var.f163958d;
        Logger logger = this.f164316c;
        if (i15 == 0) {
            o13.r.b(objE0);
            sc2.m mVar = this.f164326l;
            if (mVar == null || !mVar.d(logger)) {
                logger.warn((z15 ? "attemptWithThisAppDI2: step2" : "attemptWithThisAppDI2:").concat(" no usable credential"));
                return null;
            }
            dd2.b bVar = this.f164324j;
            if (bVar == null) {
                String str = z15 ? "attemptWithThisAppDI2: step2" : "attemptWithThisAppDI2:";
                logger.warn(str + " no 'GC1' consumer for environment " + this.f164321g.name());
                return null;
            }
            logger.debug((z15 ? "attemptWithThisAppDI2: step2" : "attemptWithThisAppDI2:").concat(" calling 'DI2ThisAppForGC1Request'..."));
            qc2.b bVar2 = new qc2.b(this.f164319e, this.f164321g, mVar.f158528b, bVar.f59210a, this.f164330p);
            a1Var.f163955a = z15;
            a1Var.f163958d = 1;
            x53.c cVar2 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new qc2.a(bVar2, null), a1Var);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z15 = a1Var.f163955a;
            o13.r.b(objE0);
        }
        wc2.a aVar2 = (wc2.a) objE0;
        if (aVar2 instanceof wc2.a.b) {
            logger.debug((z15 ? "attemptWithThisAppDI2: step2" : "attemptWithThisAppDI2:").concat(" success"));
            return ((wc2.a.b) aVar2).f184316a;
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            return null;
        }
        Exception exc = ((wc2.a.C3415a) aVar2).f184312a;
        if ((exc instanceof RateLimitException) || (exc instanceof UnknownHostException)) {
            throw exc;
        }
        logger.warn(z15 ? "attemptWithThisAppDI2: step2" : "attemptWithThisAppDI2:", (Throwable) exc);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v13.c cVar) throws Exception {
        b1 b1Var;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i14 = b1Var.f163976c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b1Var.f163976c = i14 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object objE0 = b1Var.f163974a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = b1Var.f163976c;
        Logger logger = this.f164316c;
        if (i15 == 0) {
            o13.r.b(objE0);
            sc2.o oVar = this.f164325k;
            if (oVar != null) {
                String str = oVar.f158544a;
                if (str == null) {
                    if (logger != null) {
                        logger.error("accessToken is null from a non-null 'OAuth2ITData' object");
                    }
                } else if (!d53.w.J(str)) {
                    String str2 = oVar.f158546c;
                    if (str2 == null) {
                        if (logger != null) {
                            logger.error("refreshToken is null from a non-null 'OAuth2ITData' object");
                        }
                    } else {
                        if (!d53.w.J(str2)) {
                            if (this.f164327m == null) {
                                com.airbnb.lottie.animation.keyframe.a.A("attemptWithThisAppIT2: no 'DI2' client for environment ", this.f164321g.name(), logger);
                                return null;
                            }
                            logger.warn("attemptWithThisAppIT2: step 1 calling 'IT2ThisAppForDI2Request'...");
                            pc2.n nVar = new pc2.n(this.f164319e, this.f164321g, oVar.f158544a, this.f164327m, this.f164330p, false);
                            b1Var.f163976c = 1;
                            x53.c cVar2 = o53.s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new pc2.m(nVar, null), b1Var);
                            if (objE0 != obj) {
                            }
                        }
                        if (logger != null) {
                            logger.error("refreshToken is blank from a non-null 'OAuth2ITData' object");
                        }
                    }
                } else if (logger != null) {
                    logger.error("accessToken is blank from a non-null 'OAuth2ITData' object");
                }
            }
            logger.warn("attemptWithThisAppIT2: no usable 'IT2' credential");
            return null;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objE0);
                return objE0;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objE0);
        wc2.a aVar = (wc2.a) objE0;
        if (aVar instanceof wc2.a.b) {
            logger.debug("attemptWithThisAppIT2: step1 IT2 for DI2 success");
            b1Var.f163976c = 2;
            Object objE = e(true, b1Var);
            return objE == obj ? obj : objE;
        }
        if (!(aVar instanceof wc2.a.C3415a)) {
            return null;
        }
        Exception exc = ((wc2.a.C3415a) aVar).f184312a;
        if ((exc instanceof RateLimitException) || (exc instanceof UnknownHostException)) {
            throw exc;
        }
        logger.warn("attemptWithThisAppIT2", (Throwable) exc);
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lte2/u0$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
