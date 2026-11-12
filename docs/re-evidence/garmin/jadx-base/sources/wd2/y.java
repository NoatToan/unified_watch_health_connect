package wd2;

import android.content.Context;
import com.garmin.android.library.livetrack.LivetrackService;
import com.garmin.android.library.livetrack.data.LocalDatabase;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager$notifyDeviceConnected$1", f = "LivetrackManager.kt", l = {195, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 211, 215}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f184671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xd2.x0 f184672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f184674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f184675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f184676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e0 e0Var, q qVar, l lVar, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f184674d = e0Var;
        this.f184675e = qVar;
        this.f184676f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f184674d, this.f184675e, this.f184676f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00a8 A[EDGE_INSN: B:100:0x00a8->B:32:0x00a8 BREAK  A[LOOP:0: B:25:0x0088->B:30:0x00a0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0 A[LOOP:0: B:25:0x0088->B:30:0x00a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Code duplicated, block: B:73:0x0149  */
    /* JADX WARN: Code duplicated, block: B:99:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
    
        if (r3.d(r2, r19) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0171, code lost:
    
        if (r2.d(r3, r19) == r1) goto L82;
     */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.content.Context, xd2.x0] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.y0<com.garmin.android.library.livetrack.d> y0Var;
        Context applicationContext;
        xd2.x0 x0Var;
        Object objI;
        Iterator it;
        e0 e0Var;
        Object next;
        be2.g gVar;
        e0 e0Var2;
        Logger logger;
        androidx.lifecycle.y0<com.garmin.android.library.livetrack.d> y0Var2;
        ?? r14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184673c;
        l lVar = this.f184676f;
        q qVar = this.f184675e;
        e0 e0Var3 = this.f184674d;
        if (i14 == 0) {
            o13.r.b(obj);
            String str = e0Var3.f184437e;
            long j8 = e0Var3.f184433a;
            if (str == null || str.length() == 0) {
                if (qVar.f184567b == null) {
                    Logger logger2 = q.f184565h;
                    if (logger2 != null) {
                        wr.g.v("Device ", j8, ": NO livetrack in progress, APP: NO livetrack in progress", logger2);
                    }
                    q.a aVar2 = q.f184563f;
                    Context contextF = lVar.getF104144a().f();
                    this.f184673c = 1;
                } else {
                    Logger logger3 = q.f184565h;
                    if (logger3 != null) {
                        wr.g.v("Device ", j8, ": NO livetrack in progress, APP: livetrack service on", logger3);
                    }
                    g1 g1Var = qVar.f184567b;
                    if (g1Var != null) {
                        LivetrackService livetrackService = g1Var.f184472d;
                        if (livetrackService != null) {
                            livetrackService.e(e0Var3.f184433a, e0Var3.f184436d, e0Var3, g1Var.f184469a);
                        } else {
                            g1Var.f184471c.error("Not initialized");
                        }
                        LivetrackService livetrackService2 = g1Var.f184472d;
                        if (livetrackService2 != null && (y0Var = livetrackService2.f50163c) != null) {
                            g1Var.f184473e.n(y0Var, g1Var.f184474f);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            Logger logger4 = q.f184565h;
            if (logger4 != null) {
                wr.g.v("Device ", j8, ": livetrack in progress, APP: checks local persistence", logger4);
            }
            applicationContext = lVar.getF104144a().f().getApplicationContext();
            LocalDatabase.a aVar3 = LocalDatabase.f50198a;
            applicationContext.getClass();
            x0Var = new xd2.x0(aVar3.a(applicationContext), xd2.b1.f190056a);
            this.f184671a = applicationContext;
            this.f184672b = x0Var;
            this.f184673c = 2;
            objI = x0Var.i(this);
            if (objI != aVar) {
                it = ((Iterable) objI).iterator();
                while (true) {
                    if (it.hasNext()) {
                        e0Var = e0Var3;
                        next = null;
                        break;
                    }
                    next = it.next();
                    e0Var = e0Var3;
                    if (e0Var3.f184433a == ((be2.g) next).f17765a) {
                        break;
                        break;
                    }
                    e0Var3 = e0Var;
                }
                gVar = (be2.g) next;
                if (gVar == null) {
                }
                e0Var2 = e0Var;
                if (qVar.f184567b != null) {
                    logger = q.f184565h;
                    if (logger != null) {
                        wr.g.v("Device ", e0Var2.f184433a, ": livetrack in progress, APP: no livetrack service, should start tracking", logger);
                    }
                    qVar.f(e0Var2, lVar);
                } else {
                    logger = q.f184565h;
                    if (logger != null) {
                        wr.g.v("Device ", e0Var2.f184433a, ": livetrack in progress, APP: no livetrack service, should start tracking", logger);
                    }
                    qVar.f(e0Var2, lVar);
                }
                return Unit.INSTANCE;
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                xd2.x0 x0Var2 = this.f184672b;
                Context context = this.f184671a;
                o13.r.b(obj);
                x0Var = x0Var2;
                applicationContext = context;
                objI = obj;
                it = ((Iterable) objI).iterator();
                while (true) {
                    if (it.hasNext()) {
                        e0Var = e0Var3;
                        next = null;
                        break;
                    }
                    next = it.next();
                    e0Var = e0Var3;
                    if (e0Var3.f184433a == ((be2.g) next).f17765a) {
                        break;
                    }
                    e0Var3 = e0Var;
                }
                gVar = (be2.g) next;
                if (gVar == null && gVar.f17770f) {
                    Logger logger5 = q.f184565h;
                    e0 e0Var4 = e0Var;
                    if (logger5 != null) {
                        wr.g.v("Device ", e0Var4.f184433a, ": livetrack in progress, APP: should stop on device", logger5);
                    }
                    applicationContext.getClass();
                    if (de2.a0.c(applicationContext, e0Var4.f184440h, de2.a0.b(0L, p13.j0.f134944a)) instanceof de2.g0.b.d) {
                        Logger logger6 = q.f184565h;
                        if (logger6 != null) {
                            logger6.debug("delete session info");
                        }
                        long j14 = e0Var4.f184433a;
                        this.f184671a = applicationContext;
                        r14 = 0;
                        this.f184672b = null;
                        this.f184673c = 3;
                        if (x0Var.b(j14, this) != aVar) {
                        }
                        return aVar;
                    }
                    if (qVar.f184567b == null) {
                        q.a aVar4 = q.f184563f;
                        this.f184671a = r14;
                        this.f184672b = r14;
                        this.f184673c = 4;
                    }
                } else {
                    e0Var2 = e0Var;
                    if (qVar.f184567b != null || gVar == null) {
                        logger = q.f184565h;
                        if (logger != null) {
                            wr.g.v("Device ", e0Var2.f184433a, ": livetrack in progress, APP: no livetrack service, should start tracking", logger);
                        }
                        qVar.f(e0Var2, lVar);
                    } else {
                        Logger logger7 = q.f184565h;
                        if (logger7 != null) {
                            wr.g.v("Device ", e0Var2.f184433a, ": livetrack in progress, APP: livetrack service on", logger7);
                        }
                        g1 g1Var2 = qVar.f184567b;
                        if (g1Var2 != null) {
                            e0Var2.getClass();
                            LivetrackService livetrackService3 = g1Var2.f184472d;
                            if (livetrackService3 != null) {
                                livetrackService3.e(e0Var2.f184433a, e0Var2.f184436d, e0Var2, g1Var2.f184469a);
                            } else {
                                g1Var2.f184471c.error("Not initialized");
                            }
                            LivetrackService livetrackService4 = g1Var2.f184472d;
                            if (livetrackService4 != null && (y0Var2 = livetrackService4.f50163c) != null) {
                                g1Var2.f184473e.n(y0Var2, g1Var2.f184474f);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 == 3) {
                applicationContext = this.f184671a;
                o13.r.b(obj);
            } else if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r14 = 0;
            if (qVar.f184567b == null) {
                q.a aVar5 = q.f184563f;
                this.f184671a = r14;
                this.f184672b = r14;
                this.f184673c = 4;
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        return Unit.INSTANCE;
    }
}
