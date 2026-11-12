package te2;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lte2/h0;", "Lte2/u;", "Landroid/content/Context;", "ctx", "Lve2/d;", "garminAccount", "Lve2/l;", "mobileAuthConfig", "", "Lre2/b$b;", "eventListeners", "<init>", "(Landroid/content/Context;Lve2/d;Lve2/l;Ljava/util/List;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f164059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ve2.d f164060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ve2.l f164061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<re2.b.InterfaceC2863b> f164062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AccountManager f164063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Account f164064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<String> f164065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dd2.b f164066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sc2.l f164067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f164068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f164069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ve2.e f164070p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(Context context, ve2.d dVar, ve2.l lVar, List<? extends re2.b.InterfaceC2863b> list) {
        super("ContinueAsHandler", re2.b.c.DEFAULT, context);
        context.getClass();
        dVar.getClass();
        lVar.getClass();
        list.getClass();
        this.f164059e = context;
        this.f164060f = dVar;
        this.f164061g = lVar;
        this.f164062h = list;
        this.f164065k = p13.j0.f134944a;
        this.f164066l = lVar.a(dVar.f177690a);
        this.f164067m = lVar.b(this.f164060f.f177690a);
        sc2.l lVarC = lVar.c(this.f164060f.f177690a);
        this.f164068n = lVarC != null ? lVarC.f158524a : null;
        this.f164069o = lVar.d();
        this.f164070p = this.f164060f.f177690a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r13 == r2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(h0 h0Var, v13.c cVar) throws Throwable {
        d0 d0Var;
        sc2.m mVar;
        Logger logger = h0Var.f164316c;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i14 = d0Var.f164004c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d0Var.f164004c = i14 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(h0Var, cVar);
            }
        } else {
            d0Var = new d0(h0Var, cVar);
        }
        Object objG = d0Var.f164002a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = d0Var.f164004c;
        if (i15 == 0) {
            o13.r.b(objG);
            d0Var.f164004c = 1;
            objG = h0Var.g(d0Var);
            if (objG != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objG);
        } else if (i15 == 2) {
            o13.r.b(objG);
            mVar = (sc2.m) objG;
            if (mVar != null) {
                return new dd2.a(null, null, mVar, 3, null);
            }
            logger.debug("x4DI2, exhausted credentials IT2");
            d0Var.f164004c = 3;
            objG = h0Var.i(d0Var);
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        sc2.m mVar2 = (sc2.m) objG;
        if (mVar2 != null) {
            return new dd2.a(null, null, mVar2, 3, null);
        }
        logger.debug("x4DI2, exhausted credentials GC1");
        return null;
        sc2.m mVar3 = (sc2.m) objG;
        if (mVar3 != null) {
            return new dd2.a(null, null, mVar3, 3, null);
        }
        logger.debug("x4DI2, exhausted credentials DI2");
        d0Var.f164004c = 2;
        objG = h0Var.l(d0Var);
        if (objG != obj) {
            mVar = (sc2.m) objG;
            if (mVar != null) {
                return new dd2.a(null, null, mVar, 3, null);
            }
            logger.debug("x4DI2, exhausted credentials IT2");
            d0Var.f164004c = 3;
            objG = h0Var.i(d0Var);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r12 == r2) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(h0 h0Var, v13.c cVar) throws Throwable {
        e0 e0Var;
        Logger logger = h0Var.f164316c;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f164017c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f164017c = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(h0Var, cVar);
            }
        } else {
            e0Var = new e0(h0Var, cVar);
        }
        Object objJ = e0Var.f164015a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f164017c;
        if (i15 == 0) {
            o13.r.b(objJ);
            e0Var.f164017c = 1;
            objJ = h0Var.j(e0Var);
            if (objJ != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objJ);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        sc2.j jVar = (sc2.j) objJ;
        if (jVar != null) {
            return new dd2.a(jVar, null, null, 6, null);
        }
        logger.debug("x4GC1, exhausted credentials IT2");
        return null;
        sc2.j jVar2 = (sc2.j) objJ;
        if (jVar2 != null) {
            return new dd2.a(jVar2, null, null, 6, null);
        }
        logger.debug("x4GC1, exhausted credentials GC1");
        e0Var.f164017c = 2;
        objJ = h0Var.m(e0Var);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r13 == r2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(h0 h0Var, v13.c cVar) throws Throwable {
        f0 f0Var;
        sc2.o oVar;
        Logger logger = h0Var.f164316c;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f164025c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f164025c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(h0Var, cVar);
            }
        } else {
            f0Var = new f0(h0Var, cVar);
        }
        Object objN = f0Var.f164023a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f164025c;
        if (i15 == 0) {
            o13.r.b(objN);
            f0Var.f164025c = 1;
            objN = h0Var.n(f0Var);
            if (objN != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objN);
        } else if (i15 == 2) {
            o13.r.b(objN);
            oVar = (sc2.o) objN;
            if (oVar != null) {
                return new dd2.a(null, oVar, null, 5, null);
            }
            logger.debug("x4IT2, exhausted credentials DI2");
            f0Var.f164025c = 3;
            objN = h0Var.k(f0Var);
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objN);
        }
        sc2.o oVar2 = (sc2.o) objN;
        if (oVar2 != null) {
            return new dd2.a(null, oVar2, null, 5, null);
        }
        logger.debug("x4IT2, exhausted credentials GC1");
        return null;
        sc2.o oVar3 = (sc2.o) objN;
        if (oVar3 != null) {
            return new dd2.a(null, oVar3, null, 5, null);
        }
        logger.debug("x4IT2, exhausted credentials IT2");
        f0Var.f164025c = 2;
        objN = h0Var.h(f0Var);
        if (objN != obj) {
            oVar = (sc2.o) objN;
            if (oVar != null) {
                return new dd2.a(null, oVar, null, 5, null);
            }
            logger.debug("x4IT2, exhausted credentials DI2");
            f0Var.f164025c = 3;
            objN = h0Var.k(f0Var);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:29:0x007e->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e0 -> B:45:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x010e -> B:54:0x010f). Please report as a decompilation issue!!! */
    public final Object g(v13.c cVar) throws Throwable {
        v vVar;
        Iterator<String> it;
        String next;
        String strO;
        Context context;
        ve2.e eVar;
        Object objA;
        String str;
        String str2;
        Context context2;
        sc2.l lVar;
        Iterator<String> it3;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f164344i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f164344i = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objE0 = vVar.f164342g;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f164344i;
        sc2.l lVar2 = this.f164067m;
        int i16 = 1;
        Logger logger = this.f164316c;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                if (!this.f164065k.isEmpty() && lVar2 != null) {
                    logger.debug("attemptDI2ForDI2...");
                    it = this.f164065k.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        strO = o("attemptDI2ForDI2", next);
                        if (strO != null) {
                            context = this.f164059e;
                            eVar = this.f164070p;
                            vVar.f164336a = it;
                            vVar.f164337b = next;
                            vVar.f164338c = lVar2;
                            vVar.f164339d = strO;
                            vVar.f164340e = eVar;
                            vVar.f164341f = context;
                            vVar.f164344i = i16;
                            objA = a(vVar);
                            if (objA != obj) {
                                str = next;
                                objE0 = objA;
                                str2 = strO;
                                context2 = context;
                                lVar = lVar2;
                                it3 = it;
                                pc2.d dVar = new pc2.d(context2, eVar, str2, lVar, (String) objE0, this.f164061g.f177765f);
                                vVar.f164336a = it3;
                                vVar.f164337b = str;
                                vVar.f164338c = null;
                                vVar.f164339d = null;
                                vVar.f164340e = null;
                                vVar.f164341f = null;
                                vVar.f164344i = 2;
                                x53.c cVar2 = o53.s0.f129406a;
                                objE0 = ge1.b.e0(x53.b.f189152a, new pc2.c(dVar, null), vVar);
                                if (objE0 != obj) {
                                    it = it3;
                                }
                            }
                            return obj;
                        }
                    }
                }
                return null;
            }
            if (i15 == 1) {
                Context context3 = vVar.f164341f;
                ve2.e eVar2 = vVar.f164340e;
                String str3 = vVar.f164339d;
                sc2.l lVar3 = vVar.f164338c;
                String str4 = vVar.f164337b;
                Iterator<String> it4 = vVar.f164336a;
                try {
                    try {
                        try {
                            try {
                                o13.r.b(objE0);
                                context2 = context3;
                                str = str4;
                                str2 = str3;
                                eVar = eVar2;
                                it = it4;
                                lVar = lVar3;
                            } catch (Throwable th3) {
                                th = th3;
                                it = it4;
                                if (!(th instanceof RateLimitException)) {
                                    com.airbnb.lottie.animation.keyframe.a.A("attemptDI2ForDI2: ", th.getMessage(), logger);
                                    throw th;
                                }
                                logger.warn("attemptDI2ForDI2", th);
                                i16 = 1;
                                while (it.hasNext()) {
                                    next = it.next();
                                    strO = o("attemptDI2ForDI2", next);
                                    if (strO != null) {
                                        context = this.f164059e;
                                        eVar = this.f164070p;
                                        vVar.f164336a = it;
                                        vVar.f164337b = next;
                                        vVar.f164338c = lVar2;
                                        vVar.f164339d = strO;
                                        vVar.f164340e = eVar;
                                        vVar.f164341f = context;
                                        vVar.f164344i = i16;
                                        objA = a(vVar);
                                        if (objA != obj) {
                                            str = next;
                                            objE0 = objA;
                                            str2 = strO;
                                            context2 = context;
                                            lVar = lVar2;
                                        }
                                        return obj;
                                    }
                                }
                                return null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        it = it3;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    it = it3;
                    if (!(th instanceof RateLimitException)) {
                        com.airbnb.lottie.animation.keyframe.a.A("attemptDI2ForDI2: ", th.getMessage(), logger);
                        throw th;
                    }
                    logger.warn("attemptDI2ForDI2", th);
                    i16 = 1;
                    while (it.hasNext()) {
                        next = it.next();
                        strO = o("attemptDI2ForDI2", next);
                        if (strO != null) {
                            context = this.f164059e;
                            eVar = this.f164070p;
                            vVar.f164336a = it;
                            vVar.f164337b = next;
                            vVar.f164338c = lVar2;
                            vVar.f164339d = strO;
                            vVar.f164340e = eVar;
                            vVar.f164341f = context;
                            vVar.f164344i = i16;
                            objA = a(vVar);
                            if (objA != obj) {
                                str = next;
                                objE0 = objA;
                                str2 = strO;
                                context2 = context;
                                lVar = lVar2;
                                it3 = it;
                                pc2.d dVar2 = new pc2.d(context2, eVar, str2, lVar, (String) objE0, this.f164061g.f177765f);
                                vVar.f164336a = it3;
                                vVar.f164337b = str;
                                vVar.f164338c = null;
                                vVar.f164339d = null;
                                vVar.f164340e = null;
                                vVar.f164341f = null;
                                vVar.f164344i = 2;
                                x53.c cVar3 = o53.s0.f129406a;
                                objE0 = ge1.b.e0(x53.b.f189152a, new pc2.c(dVar2, null), vVar);
                                if (objE0 != obj) {
                                    it = it3;
                                    sc2.m mVar = ((sc2.n) wc2.b.a((wc2.a) objE0)).f158542b;
                                    logger.debug("attemptDI2ForDI2: success using credential from [" + str + "]");
                                    return mVar;
                                }
                            }
                            return obj;
                        }
                    }
                    return null;
                }
                it3 = it;
                pc2.d dVar3 = new pc2.d(context2, eVar, str2, lVar, (String) objE0, this.f164061g.f177765f);
                vVar.f164336a = it3;
                vVar.f164337b = str;
                vVar.f164338c = null;
                vVar.f164339d = null;
                vVar.f164340e = null;
                vVar.f164341f = null;
                vVar.f164344i = 2;
                x53.c cVar4 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new pc2.c(dVar3, null), vVar);
                if (objE0 != obj) {
                    it = it3;
                }
                return obj;
            }
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = vVar.f164337b;
            it = vVar.f164336a;
            o13.r.b(objE0);
        } catch (Throwable th7) {
            th = th7;
        }
        sc2.m mVar2 = ((sc2.n) wc2.b.a((wc2.a) objE0)).f158542b;
        logger.debug("attemptDI2ForDI2: success using credential from [" + str + "]");
        return mVar2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008b -> B:33:0x008e). Please report as a decompilation issue!!! */
    public final Object h(v13.c cVar) {
        w wVar;
        Iterator<String> it;
        String next;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f164360e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f164360e = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        w wVar2 = wVar;
        Object objE0 = wVar2.f164358c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar2.f164360e;
        Logger logger = this.f164316c;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                if (!this.f164065k.isEmpty() && this.f164068n != null) {
                    logger.debug("attemptDI2ForIT2...");
                    it = this.f164065k.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        String strO = o("attemptDI2ForIT2", next);
                        if (strO != null) {
                            rc2.a aVar2 = new rc2.a(this.f164059e, this.f164070p, strO, this.f164068n, this.f164069o);
                            wVar2.f164356a = it;
                            wVar2.f164357b = next;
                            wVar2.f164360e = 1;
                            x53.c cVar2 = o53.s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new rc2.b(aVar2, null), wVar2);
                            if (objE0 == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
                return null;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            next = wVar2.f164357b;
            it = wVar2.f164356a;
            o13.r.b(objE0);
        } catch (Throwable th3) {
            if (th3 instanceof RateLimitException) {
                com.airbnb.lottie.animation.keyframe.a.A("attemptDI2ForIT2: ", th3.getMessage(), logger);
                throw th3;
            }
            logger.warn("attemptDI2ForIT2", th3);
            Unit unit = Unit.INSTANCE;
        }
        sc2.o oVar = ((sc2.c) wc2.b.a((wc2.a) objE0)).f158488a;
        logger.debug("attemptDI2ForIT2: success using credential from [" + next + "]");
        return oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a7 -> B:31:0x00a8). Please report as a decompilation issue!!! */
    public final Object i(v13.c cVar) {
        x xVar;
        Iterator<String> it;
        String str;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f164374e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f164374e = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object objE0 = xVar.f164372c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f164374e;
        Object obj = null;
        dd2.b bVar = this.f164066l;
        Logger logger = this.f164316c;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                if (!this.f164065k.isEmpty() && bVar != null) {
                    logger.debug("attemptGC1ForDI2...");
                    it = this.f164065k.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        sc2.j jVarP = p("attemptGC1ForDI2", next);
                        if (jVarP != null) {
                            qc2.h hVar = new qc2.h(this.f164059e, this.f164070p, next, new sc2.j(jVarP.f158514a, jVarP.f158515b), bVar.f59210a, bVar.f59211b, this.f164061g.f177765f, null);
                            xVar.f164370a = it;
                            xVar.f164371b = next;
                            xVar.f164374e = 1;
                            x53.c cVar2 = o53.s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new qc2.g(hVar, null), xVar);
                            if (objE0 == aVar) {
                                return aVar;
                            }
                            str = next;
                        }
                    }
                }
                return obj;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = xVar.f164371b;
            it = xVar.f164370a;
            o13.r.b(objE0);
        } catch (Throwable th3) {
            if (th3 instanceof RateLimitException) {
                com.airbnb.lottie.animation.keyframe.a.A("attemptGC1ForDI2: ", th3.getMessage(), logger);
                throw th3;
            }
            logger.warn("attemptGC1ForDI2", th3);
            obj = null;
        }
        sc2.m mVar = ((sc2.n) objE0).f158542b;
        logger.debug("attemptGC1ForDI2: success using credential from [" + str + "]");
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0094 -> B:32:0x0095). Please report as a decompilation issue!!! */
    public final Object j(v13.c cVar) {
        y yVar;
        Iterator<String> it;
        String str;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f164392e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f164392e = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objE0 = yVar.f164390c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f164392e;
        dd2.b bVar = this.f164066l;
        Logger logger = this.f164316c;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                if (!this.f164065k.isEmpty() && bVar != null) {
                    logger.debug("attemptGC1ForGC1...");
                    it = this.f164065k.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        sc2.j jVarP = p("attemptGC1ForGC1", next);
                        if (jVarP != null) {
                            qc2.d dVar = new qc2.d(this.f164059e, this.f164070p, jVarP, next, bVar.f59210a, bVar.f59211b);
                            yVar.f164388a = it;
                            yVar.f164389b = next;
                            yVar.f164392e = 1;
                            x53.c cVar2 = o53.s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new qc2.c(dVar, null), yVar);
                            if (objE0 == aVar) {
                                return aVar;
                            }
                            str = next;
                        }
                    }
                }
                return null;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = yVar.f164389b;
            it = yVar.f164388a;
            o13.r.b(objE0);
        } catch (Throwable th3) {
            if (th3 instanceof RateLimitException) {
                com.airbnb.lottie.animation.keyframe.a.A("attemptGC1ForGC1: ", th3.getMessage(), logger);
                throw th3;
            }
            logger.warn("attemptGC1ForGC1", th3);
            Unit unit = Unit.INSTANCE;
        }
        sc2.j jVar = (sc2.j) wc2.b.a((wc2.a) objE0);
        logger.debug("attemptGC1ForGC1: success using credential from [" + str + "]");
        return jVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:61|34|(7:37|69|38|39|65|40|(1:43))|42) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:37|69|38|39|65|40|(1:43)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(1:7)|8|(3:(1:(4:12|67|13|14)(2:17|18))(11:19|71|20|21|69|38|39|65|40|(1:43)|42)|55|(5:57|76|(3:32|(4:61|34|(7:37|69|38|39|65|40|(1:43))|42)(1:77)|30)|75|60)(2:58|59))(3:25|(4:29|76|(3:32|(4:61|34|(7:37|69|38|39|65|40|(1:43))|42)(1:77)|30)|75)|60)|63|44|45) */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[LOOP:0: B:30:0x007e->B:77:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
    
        r11 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0113, code lost:
    
        r11 = r7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e2 -> B:63:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(v13.c cVar) throws Throwable {
        z zVar;
        Iterator<String> it;
        String str;
        String str2;
        String str3;
        ve2.e eVar;
        Context context;
        Iterator<String> it3;
        String str4;
        String next;
        sc2.j jVarP;
        Context context2;
        ve2.e eVar2;
        String str5;
        String str6;
        Object objA;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f164409j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f164409j = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object objE0 = zVar.f164407h;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f164409j;
        String str7 = this.f164068n;
        Logger logger = this.f164316c;
        if (i15 == 0) {
            o13.r.b(objE0);
            if (!this.f164065k.isEmpty() && str7 != null) {
                logger.debug("attemptGC1ForIT2...");
                it = this.f164065k.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    jVarP = p("attemptGC1ForIT2", next);
                    if (jVarP != null) {
                        context2 = this.f164059e;
                        eVar2 = this.f164070p;
                        str5 = jVarP.f158514a;
                        str6 = this.f164069o;
                        zVar.f164400a = it;
                        zVar.f164401b = next;
                        zVar.f164402c = str6;
                        zVar.f164403d = str7;
                        zVar.f164404e = str5;
                        zVar.f164405f = eVar2;
                        zVar.f164406g = context2;
                        zVar.f164409j = 1;
                        objA = a(zVar);
                        if (objA != obj) {
                            str2 = str7;
                            str = str6;
                            str3 = str5;
                            str4 = next;
                            objE0 = objA;
                            eVar = eVar2;
                            context = context2;
                            it3 = it;
                            rc2.c cVar2 = new rc2.c(context, eVar, str3, str2, str, (String) objE0);
                            zVar.f164400a = it3;
                            zVar.f164401b = str4;
                            zVar.f164402c = null;
                            zVar.f164403d = null;
                            zVar.f164404e = null;
                            zVar.f164405f = null;
                            zVar.f164406g = null;
                            zVar.f164409j = 2;
                            x53.c cVar3 = o53.s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new rc2.d(cVar2, null), zVar);
                            if (objE0 != obj) {
                                it = it3;
                            }
                        }
                        return obj;
                    }
                }
            }
            return null;
        }
        if (i15 == 1) {
            Context context3 = zVar.f164406g;
            ve2.e eVar3 = zVar.f164405f;
            String str8 = zVar.f164404e;
            String str9 = zVar.f164403d;
            String str10 = zVar.f164402c;
            String str11 = zVar.f164401b;
            it3 = zVar.f164400a;
            try {
                o13.r.b(objE0);
                str = str10;
                str3 = str8;
                context = context3;
                str4 = str11;
                str2 = str9;
                eVar = eVar3;
            } catch (Throwable th3) {
                th = th3;
                it = it3;
                if (th instanceof RateLimitException) {
                    com.airbnb.lottie.animation.keyframe.a.A("attemptGC1ForIT2: ", th.getMessage(), logger);
                    throw th;
                }
                logger.warn("attemptGC1ForIT2", th);
                while (it.hasNext()) {
                    next = it.next();
                    jVarP = p("attemptGC1ForIT2", next);
                    if (jVarP != null) {
                        context2 = this.f164059e;
                        eVar2 = this.f164070p;
                        str5 = jVarP.f158514a;
                        str6 = this.f164069o;
                        zVar.f164400a = it;
                        zVar.f164401b = next;
                        zVar.f164402c = str6;
                        zVar.f164403d = str7;
                        zVar.f164404e = str5;
                        zVar.f164405f = eVar2;
                        zVar.f164406g = context2;
                        zVar.f164409j = 1;
                        objA = a(zVar);
                        if (objA != obj) {
                            str2 = str7;
                            str = str6;
                            str3 = str5;
                            str4 = next;
                            objE0 = objA;
                            eVar = eVar2;
                            context = context2;
                            it3 = it;
                        }
                        return obj;
                    }
                }
                return null;
            }
            rc2.c cVar4 = new rc2.c(context, eVar, str3, str2, str, (String) objE0);
            zVar.f164400a = it3;
            zVar.f164401b = str4;
            zVar.f164402c = null;
            zVar.f164403d = null;
            zVar.f164404e = null;
            zVar.f164405f = null;
            zVar.f164406g = null;
            zVar.f164409j = 2;
            x53.c cVar5 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new rc2.d(cVar4, null), zVar);
            if (objE0 != obj) {
                it = it3;
            }
            return obj;
        }
        if (i15 != 2) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str4 = zVar.f164401b;
        it = zVar.f164400a;
        try {
            o13.r.b(objE0);
        } catch (Throwable th4) {
            th = th4;
            if (th instanceof RateLimitException) {
                com.airbnb.lottie.animation.keyframe.a.A("attemptGC1ForIT2: ", th.getMessage(), logger);
                throw th;
            }
            logger.warn("attemptGC1ForIT2", th);
            while (it.hasNext()) {
                next = it.next();
                jVarP = p("attemptGC1ForIT2", next);
                if (jVarP != null) {
                    context2 = this.f164059e;
                    eVar2 = this.f164070p;
                    str5 = jVarP.f158514a;
                    str6 = this.f164069o;
                    zVar.f164400a = it;
                    zVar.f164401b = next;
                    zVar.f164402c = str6;
                    zVar.f164403d = str7;
                    zVar.f164404e = str5;
                    zVar.f164405f = eVar2;
                    zVar.f164406g = context2;
                    zVar.f164409j = 1;
                    objA = a(zVar);
                    if (objA != obj) {
                        str2 = str7;
                        str = str6;
                        str3 = str5;
                        str4 = next;
                        objE0 = objA;
                        eVar = eVar2;
                        context = context2;
                        it3 = it;
                        rc2.c cVar6 = new rc2.c(context, eVar, str3, str2, str, (String) objE0);
                        zVar.f164400a = it3;
                        zVar.f164401b = str4;
                        zVar.f164402c = null;
                        zVar.f164403d = null;
                        zVar.f164404e = null;
                        zVar.f164405f = null;
                        zVar.f164406g = null;
                        zVar.f164409j = 2;
                        x53.c cVar7 = o53.s0.f129406a;
                        objE0 = ge1.b.e0(x53.b.f189152a, new rc2.d(cVar6, null), zVar);
                        if (objE0 != obj) {
                            it = it3;
                        }
                    }
                    return obj;
                }
            }
            return null;
        }
        if (th instanceof RateLimitException) {
            com.airbnb.lottie.animation.keyframe.a.A("attemptGC1ForIT2: ", th.getMessage(), logger);
            throw th;
        }
        logger.warn("attemptGC1ForIT2", th);
        while (it.hasNext()) {
            next = it.next();
            jVarP = p("attemptGC1ForIT2", next);
            if (jVarP != null) {
                context2 = this.f164059e;
                eVar2 = this.f164070p;
                str5 = jVarP.f158514a;
                str6 = this.f164069o;
                zVar.f164400a = it;
                zVar.f164401b = next;
                zVar.f164402c = str6;
                zVar.f164403d = str7;
                zVar.f164404e = str5;
                zVar.f164405f = eVar2;
                zVar.f164406g = context2;
                zVar.f164409j = 1;
                objA = a(zVar);
                if (objA != obj) {
                    str2 = str7;
                    str = str6;
                    str3 = str5;
                    str4 = next;
                    objE0 = objA;
                    eVar = eVar2;
                    context = context2;
                    it3 = it;
                    rc2.c cVar8 = new rc2.c(context, eVar, str3, str2, str, (String) objE0);
                    zVar.f164400a = it3;
                    zVar.f164401b = str4;
                    zVar.f164402c = null;
                    zVar.f164403d = null;
                    zVar.f164404e = null;
                    zVar.f164405f = null;
                    zVar.f164406g = null;
                    zVar.f164409j = 2;
                    x53.c cVar9 = o53.s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new rc2.d(cVar8, null), zVar);
                    if (objE0 != obj) {
                        it = it3;
                    }
                }
                return obj;
            }
        }
        return null;
        sc2.o oVar = ((sc2.c) wc2.b.a((wc2.a) objE0)).f158488a;
        logger.debug("attemptGC1ForIT2: success using credential from [" + str4 + "]");
        return oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009f -> B:33:0x00a2). Please report as a decompilation issue!!! */
    public final Object l(v13.c cVar) {
        a0 a0Var;
        Iterator<String> it;
        String next;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f163954e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f163954e = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objE0 = a0Var.f163952c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f163954e;
        Object obj = null;
        Logger logger = this.f164316c;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                if (!this.f164065k.isEmpty() && this.f164067m != null && this.f164068n != null) {
                    logger.debug("attemptIT2ForDI2...");
                    it = this.f164065k.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        String strQ = q("attemptIT2ForDI2", next);
                        if (strQ != null) {
                            pc2.l lVar = new pc2.l(this.f164059e, this.f164070p, strQ, this.f164068n, this.f164069o, this.f164067m, this.f164061g.f177765f, true);
                            a0Var.f163950a = it;
                            a0Var.f163951b = next;
                            a0Var.f163954e = 1;
                            x53.c cVar2 = o53.s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new pc2.k(lVar, null), a0Var);
                            if (objE0 == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
                return obj;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            next = a0Var.f163951b;
            it = a0Var.f163950a;
            o13.r.b(objE0);
        } catch (Throwable th3) {
            if (th3 instanceof RateLimitException) {
                com.airbnb.lottie.animation.keyframe.a.A("attemptIT2ForDI2: ", th3.getMessage(), logger);
                throw th3;
            }
            logger.warn("attemptIT2ForDI2", th3);
            obj = null;
        }
        sc2.m mVar = (sc2.m) objE0;
        logger.debug("attemptIT2ForDI2: success using credential from [" + next + "]");
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079 A[Catch: all -> 0x0038, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0038, blocks: (B:12:0x0032, B:31:0x0079), top: B:54:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc A[PHI: r8 r10
      0x00dc: PHI (r8v5 boolean) = (r8v2 boolean), (r8v6 boolean) binds: [B:30:0x0077, B:45:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r10v3 java.util.Iterator<java.lang.String>) = (r10v2 java.util.Iterator<java.lang.String>), (r10v4 java.util.Iterator<java.lang.String>) binds: [B:30:0x0077, B:45:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0039 -> B:43:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0077 -> B:46:0x00dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:37:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d3 -> B:43:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x009d -> B:39:0x00d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(v13.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.h0.m(v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0081 -> B:32:0x0084). Please report as a decompilation issue!!! */
    public final Object n(v13.c cVar) {
        c0 c0Var;
        Iterator<String> it;
        String next;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f163987e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f163987e = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        c0 c0Var2 = c0Var;
        Object objH = c0Var2.f163985c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var2.f163987e;
        Logger logger = this.f164316c;
        try {
            if (i15 == 0) {
                o13.r.b(objH);
                if (this.f164065k.isEmpty() || this.f164068n == null) {
                    return null;
                }
                logger.debug("attemptIT2ForIT2...");
                it = this.f164065k.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    String strQ = q("attemptIT2ForIT2", next);
                    if (strQ != null) {
                        rc2.e eVar = new rc2.e(this.f164059e, this.f164070p, this.f164068n, strQ, this.f164069o);
                        c0Var2.f163983a = it;
                        c0Var2.f163984b = next;
                        c0Var2.f163987e = 1;
                        objH = eVar.h(c0Var2);
                        if (objH == aVar) {
                            return aVar;
                        }
                    }
                }
                return null;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            next = c0Var2.f163984b;
            it = c0Var2.f163983a;
            o13.r.b(objH);
        } catch (Throwable th3) {
            if (th3 instanceof RateLimitException) {
                com.airbnb.lottie.animation.keyframe.a.A("attemptIT2ForIT2: ", th3.getMessage(), logger);
                throw th3;
            }
            logger.warn("attemptIT2ForIT2", th3);
        }
        sc2.o oVar = ((sc2.c) wc2.b.a((wc2.a) objH)).f158488a;
        logger.debug("attemptIT2ForIT2: success using credential from [" + next + "]");
        return oVar;
    }

    public final String o(String str, String str2) {
        String userData;
        AccountManager accountManager = this.f164063i;
        Logger logger = this.f164316c;
        if (accountManager == null) {
            logger.error("getOtherAppDI2AccessToken: acctMgr is null");
            return null;
        }
        Account account = this.f164064j;
        if (account == null) {
            logger.error("getOtherAppDI2AccessToken: sysAcct is null");
            return null;
        }
        try {
            String userData2 = accountManager.getUserData(account, str2 + ".OAUTH2_DI_ACS_TOK");
            if (userData2 != null && !d53.w.J(userData2)) {
                AccountManager accountManager2 = this.f164063i;
                if (accountManager2 != null) {
                    userData = accountManager2.getUserData(this.f164064j, str2 + ".OAUTH2_DI_ACS_TOK_EXP_UTC");
                } else {
                    userData = null;
                }
                if (userData != null && !d53.w.J(userData)) {
                    if (!nd2.c.e(Long.parseLong(userData))) {
                        return userData2;
                    }
                    logger.debug(str + ": cannot use [" + str2 + "] credentials, expired access token");
                    return null;
                }
                logger.debug(str + ": cannot use [" + str2 + "] credentials, null or empty access token expiration date");
                return null;
            }
            logger.debug(str + ": cannot use [" + str2 + "] credentials, null or empty access token");
            return null;
        } catch (Throwable th3) {
            logger.warn(str, th3);
            return null;
        }
    }

    public final sc2.j p(String str, String str2) {
        String userData;
        AccountManager accountManager = this.f164063i;
        Logger logger = this.f164316c;
        if (accountManager == null) {
            logger.error("getOtherAppGC1: acctMgr is null");
            return null;
        }
        Account account = this.f164064j;
        if (account == null) {
            logger.error("getOtherAppGC1: sysAcct is null");
            return null;
        }
        try {
            String userData2 = accountManager.getUserData(account, str2 + ".OAUTH1_CONNECT_USR_TOK");
            if (userData2 != null && !d53.w.J(userData2)) {
                AccountManager accountManager2 = this.f164063i;
                if (accountManager2 != null) {
                    userData = accountManager2.getUserData(this.f164064j, str2 + ".OAUTH1_CONNECT_USR_SEC");
                } else {
                    userData = null;
                }
                if (userData != null && !d53.w.J(userData)) {
                    return new sc2.j(userData2, userData);
                }
                logger.debug(str + ": cannot use [" + str2 + "] credential, null or empty user secret");
                return null;
            }
            logger.debug(str + ": cannot use [" + str2 + "] credential, null or empty user token");
            return null;
        } catch (Throwable th3) {
            logger.warn(str, th3);
            return null;
        }
    }

    public final String q(String str, String str2) {
        String userData;
        AccountManager accountManager = this.f164063i;
        Logger logger = this.f164316c;
        if (accountManager == null) {
            logger.error("getOtherAppIT2AccessToken: acctMgr is null");
            return null;
        }
        Account account = this.f164064j;
        if (account == null) {
            logger.error("getOtherAppIT2AccessToken: sysAcct is null");
            return null;
        }
        try {
            String userData2 = accountManager.getUserData(account, str2 + ".OAUTH2_IT_ACS_TOK");
            if (userData2 != null && !d53.w.J(userData2)) {
                AccountManager accountManager2 = this.f164063i;
                if (accountManager2 != null) {
                    userData = accountManager2.getUserData(this.f164064j, str2 + ".OAUTH2_IT_ACS_TOK_EXP_UTC");
                } else {
                    userData = null;
                }
                if (userData != null && !d53.w.J(userData)) {
                    if (!nd2.c.e(Long.parseLong(userData))) {
                        return userData2;
                    }
                    logger.debug(str + ": cannot use [" + str2 + "] credentials, expired access token");
                    return null;
                }
                logger.debug(str + ": cannot use [" + str2 + "] credentials, null or empty access token expiration date");
                return null;
            }
            logger.debug(str + ": cannot use [" + str2 + "] credentials, null or empty access token");
            return null;
        } catch (Throwable th3) {
            logger.warn(str, th3);
            return null;
        }
    }
}
