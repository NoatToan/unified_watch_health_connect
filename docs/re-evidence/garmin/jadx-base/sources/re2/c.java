package re2;

import android.content.Context;
import lc.u0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.e2;
import te2.j2;
import te2.w1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$bindMFATokenToOAuth2DI$2", f = "AuthenticationHelper.kt", l = {2247, 2253, 2262, 2274, 2284}, m = "invokeSuspend")
public final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f152265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ve2.e f152266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dd2.b f152267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ve2.l f152268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f152269e;

    public c(t13.d<? super c> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return new c(dVar).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f5 A[PHI: r15
      0x00f5: PHI (r15v20 java.lang.Object) = (r15v19 java.lang.Object), (r15v0 java.lang.Object) binds: [B:36:0x00f2, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    /* JADX WARN: Code duplicated, block: B:47:0x011b  */
    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
    
        if (r1.w(r2, r15, r14) == r0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        String str;
        ve2.e eVar;
        b bVar;
        dd2.b bVarA;
        ve2.l lVar;
        Object objN;
        ve2.e eVar2;
        dd2.b bVar2;
        wc2.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152269e;
        if (i14 == 0) {
            o13.r.b(obj);
            b bVar3 = b.f152215a;
            sc2.a aVar3 = sc2.a.f158476b;
            bVar3.getClass();
            b.J("bindMFATokenToOAuth2DI", aVar3);
            e2 e2Var = new e2();
            this.f152269e = 1;
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new w1(e2Var, true, true, null), this);
            if (obj != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                String str2 = this.f152265a;
                o13.r.b(obj);
                str = str2;
                obj.getClass();
                eVar = ((ve2.d) obj).f177690a;
                bVar = b.f152215a;
                bVar.getClass();
                bVarA = b.m().a(eVar);
                if (bVarA != null) {
                    throw new IllegalAccessException(fb1.c.n("bindMFATokenToOAuth2DI: no GC1 consumer defined for environment ", eVar.name()));
                }
                bVar.L();
                b.f152216b.debug("bindMFATokenToOAuth2DI");
                lVar = b.f152220f;
                lVar.getClass();
                this.f152265a = str;
                this.f152266b = eVar;
                this.f152267c = bVarA;
                this.f152268d = lVar;
                this.f152269e = 3;
                objN = b.n(this);
                if (objN != aVar2) {
                    eVar2 = eVar;
                    obj = objN;
                    bVar2 = bVarA;
                    sc2.j jVar = (sc2.j) obj;
                    qc2.j jVar2 = new qc2.j(b.f152215a.b(), eVar2, new dd2.c(jVar.f158514a, jVar.f158515b, bVar2.f59210a, bVar2.f59211b), str, lVar.f177765f);
                    this.f152265a = null;
                    this.f152266b = null;
                    this.f152267c = null;
                    this.f152268d = null;
                    this.f152269e = 4;
                    x53.c cVar2 = s0.f129406a;
                    obj = ge1.b.e0(x53.b.f189152a, new qc2.i(jVar2, null), this);
                    if (obj != aVar2) {
                        aVar = (wc2.a) obj;
                        if (aVar instanceof wc2.a.b) {
                            if (!(aVar instanceof wc2.a.C3415a)) {
                                u0.r();
                                return null;
                            }
                            Logger logger = b.f152216b;
                            Exception exc = ((wc2.a.C3415a) aVar).f184312a;
                            logger.error("bindMFATokenToOAuth2DI: GC1ThisAppForDI2Request", (Throwable) exc);
                            throw exc;
                        }
                        sc2.m mVar = ((sc2.n) ((wc2.a.b) aVar).f184316a).f158542b;
                        j2 j2Var = j2.f164115a;
                        Context contextB = b.f152215a.b();
                        this.f152269e = 5;
                    }
                }
                return aVar2;
            }
            if (i14 == 3) {
                lVar = this.f152268d;
                bVar2 = this.f152267c;
                ve2.e eVar3 = this.f152266b;
                str = this.f152265a;
                o13.r.b(obj);
                eVar2 = eVar3;
                sc2.j jVar3 = (sc2.j) obj;
                qc2.j jVar4 = new qc2.j(b.f152215a.b(), eVar2, new dd2.c(jVar3.f158514a, jVar3.f158515b, bVar2.f59210a, bVar2.f59211b), str, lVar.f177765f);
                this.f152265a = null;
                this.f152266b = null;
                this.f152267c = null;
                this.f152268d = null;
                this.f152269e = 4;
                x53.c cVar3 = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new qc2.i(jVar4, null), this);
                if (obj != aVar2) {
                    aVar = (wc2.a) obj;
                    if (aVar instanceof wc2.a.b) {
                        if (!(aVar instanceof wc2.a.C3415a)) {
                            u0.r();
                            return null;
                        }
                        Logger logger2 = b.f152216b;
                        Exception exc2 = ((wc2.a.C3415a) aVar).f184312a;
                        logger2.error("bindMFATokenToOAuth2DI: GC1ThisAppForDI2Request", (Throwable) exc2);
                        throw exc2;
                    }
                    sc2.m mVar2 = ((sc2.n) ((wc2.a.b) aVar).f184316a).f158542b;
                    j2 j2Var2 = j2.f164115a;
                    Context contextB2 = b.f152215a.b();
                    this.f152269e = 5;
                }
                return aVar2;
            }
            if (i14 == 4) {
                o13.r.b(obj);
                aVar = (wc2.a) obj;
                if (aVar instanceof wc2.a.b) {
                    if (!(aVar instanceof wc2.a.C3415a)) {
                        u0.r();
                        return null;
                    }
                    Logger logger3 = b.f152216b;
                    Exception exc3 = ((wc2.a.C3415a) aVar).f184312a;
                    logger3.error("bindMFATokenToOAuth2DI: GC1ThisAppForDI2Request", (Throwable) exc3);
                    throw exc3;
                }
                sc2.m mVar3 = ((sc2.n) ((wc2.a.b) aVar).f184316a).f158542b;
                j2 j2Var3 = j2.f164115a;
                Context contextB3 = b.f152215a.b();
                this.f152269e = 5;
            } else {
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        String str3 = (String) obj;
        if (str3 == null || d53.w.J(str3)) {
            return Unit.INSTANCE;
        }
        b bVar4 = b.f152215a;
        this.f152265a = str3;
        this.f152269e = 2;
        bVar4.getClass();
        Object objJ = b.j(this);
        if (objJ != aVar2) {
            str = str3;
            obj = objJ;
            obj.getClass();
            eVar = ((ve2.d) obj).f177690a;
            bVar = b.f152215a;
            bVar.getClass();
            bVarA = b.m().a(eVar);
            if (bVarA != null) {
                throw new IllegalAccessException(fb1.c.n("bindMFATokenToOAuth2DI: no GC1 consumer defined for environment ", eVar.name()));
            }
            bVar.L();
            b.f152216b.debug("bindMFATokenToOAuth2DI");
            lVar = b.f152220f;
            lVar.getClass();
            this.f152265a = str;
            this.f152266b = eVar;
            this.f152267c = bVarA;
            this.f152268d = lVar;
            this.f152269e = 3;
            objN = b.n(this);
            if (objN != aVar2) {
                eVar2 = eVar;
                obj = objN;
                bVar2 = bVarA;
                sc2.j jVar5 = (sc2.j) obj;
                qc2.j jVar6 = new qc2.j(b.f152215a.b(), eVar2, new dd2.c(jVar5.f158514a, jVar5.f158515b, bVar2.f59210a, bVar2.f59211b), str, lVar.f177765f);
                this.f152265a = null;
                this.f152266b = null;
                this.f152267c = null;
                this.f152268d = null;
                this.f152269e = 4;
                x53.c cVar4 = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new qc2.i(jVar6, null), this);
                if (obj != aVar2) {
                    aVar = (wc2.a) obj;
                    if (aVar instanceof wc2.a.b) {
                        if (!(aVar instanceof wc2.a.C3415a)) {
                            u0.r();
                            return null;
                        }
                        Logger logger4 = b.f152216b;
                        Exception exc4 = ((wc2.a.C3415a) aVar).f184312a;
                        logger4.error("bindMFATokenToOAuth2DI: GC1ThisAppForDI2Request", (Throwable) exc4);
                        throw exc4;
                    }
                    sc2.m mVar4 = ((sc2.n) ((wc2.a.b) aVar).f184316a).f158542b;
                    j2 j2Var4 = j2.f164115a;
                    Context contextB4 = b.f152215a.b();
                    this.f152269e = 5;
                }
            }
        }
        return aVar2;
    }
}
