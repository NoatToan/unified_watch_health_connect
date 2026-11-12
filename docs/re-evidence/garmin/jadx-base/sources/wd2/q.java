package wd2;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Parcelable;
import com.garmin.android.library.livetrack.LivetrackService;
import com.garmin.android.library.livetrack.data.LocalDatabase;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lwd2/q;", "Lo53/b0;", "Lwd2/g1$b;", "<init>", "()V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements o53.b0, g1.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f184563f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static q f184564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Logger f184565h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.m1 f184566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g1 f184567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.y0<f<com.garmin.android.library.livetrack.d>> f184568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iz1.g f184569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f184570e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager$startLivetrack$1", f = "LivetrackManager.kt", l = {97}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f184571a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f184573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e0 f184574d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, e0 e0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f184573c = lVar;
            this.f184574d = e0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return q.this.new b(this.f184573c, this.f184574d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.y0<com.garmin.android.library.livetrack.d> y0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f184571a;
            q qVar = q.this;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = q.f184563f;
                qVar.d(this.f184573c);
                g1 g1Var = qVar.f184567b;
                if (g1Var != null) {
                    this.f184571a = 1;
                    if (g1Var.f(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            g1 g1Var2 = qVar.f184567b;
            if (g1Var2 != null) {
                e0 e0Var = this.f184574d;
                e0Var.getClass();
                if (g1Var2.d()) {
                    LivetrackService livetrackService = g1Var2.f184472d;
                    if (livetrackService != null && (y0Var = livetrackService.f50163c) != null) {
                        g1Var2.f184473e.n(y0Var, g1Var2.f184474f);
                    }
                    LivetrackService livetrackService2 = g1Var2.f184472d;
                    if (livetrackService2 != null) {
                        livetrackService2.i(e0Var, g1Var2.f184469a);
                    }
                } else {
                    g1Var2.f184471c.error("startLivetrack: Not foreground started");
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager$stopIfNecessary$1$1", f = "LivetrackManager.kt", l = {358}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f184575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f184576b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f184576b = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f184576b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f184575a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = q.f184563f;
                this.f184575a = 1;
                if (aVar2.d(this.f184576b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private q() {
        this.f184566a = g8.i.c();
        this.f184568c = new androidx.lifecycle.y0<>();
        this.f184569d = new iz1.g(this, 29);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r10 == r0) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(q qVar, l lVar, ge2.e eVar, v13.c cVar) {
        b0 b0Var;
        Context applicationContext;
        Context context;
        o13.p pVar;
        Logger logger;
        g1 g1Var;
        qVar.getClass();
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f184393f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f184393f = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(qVar, cVar);
            }
        } else {
            b0Var = new b0(qVar, cVar);
        }
        b0 b0Var2 = b0Var;
        Object objB = b0Var2.f184391d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var2.f184393f;
        if (i15 == 0) {
            o13.r.b(objB);
            qVar.d(lVar);
            applicationContext = lVar.f().f().getApplicationContext();
            g1 g1Var2 = qVar.f184567b;
            if (g1Var2 != null) {
                applicationContext.getClass();
                b0Var2.f184388a = eVar;
                b0Var2.f184389b = applicationContext;
                b0Var2.f184393f = 1;
                objB = g1Var2.b(applicationContext, b0Var2);
                if (objB != aVar) {
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        if (i15 == 1) {
            applicationContext = b0Var2.f184389b;
            eVar = b0Var2.f184388a;
            o13.r.b(objB);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pVar = b0Var2.f184390c;
            context = b0Var2.f184389b;
            o13.r.b(objB);
        }
        logger = f184565h;
        if (logger != null) {
            logger.debug("Unbind from service");
        }
        g1Var = qVar.f184567b;
        if (g1Var != null) {
            context.getClass();
            g1Var.h(context, ((Number) pVar.f128594a).longValue());
        }
        return Unit.INSTANCE;
        ge2.e eVar2 = eVar;
        context = applicationContext;
        pVar = (o13.p) objB;
        if (pVar != null) {
            Logger logger2 = f184565h;
            if (logger2 != null) {
                logger2.debug("Migrating livetrack settings");
            }
            g1 g1Var3 = qVar.f184567b;
            if (g1Var3 != null) {
                b0Var2.f184388a = null;
                b0Var2.f184389b = context;
                b0Var2.f184390c = pVar;
                b0Var2.f184393f = 2;
                LivetrackService livetrackService = g1Var3.f184472d;
                if (livetrackService != null) {
                    objB = livetrackService.g(-1L, eVar2, g1Var3.f184469a, b0Var2);
                    if (objB != aVar) {
                        objB = (Boolean) objB;
                    }
                } else {
                    objB = null;
                }
            } else {
                logger = f184565h;
                if (logger != null) {
                    logger.debug("Unbind from service");
                }
                g1Var = qVar.f184567b;
                if (g1Var != null) {
                    context.getClass();
                    g1Var.h(context, ((Number) pVar.f128594a).longValue());
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // wd2.g1.b
    public final void a() {
        g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j8, v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f184588c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f184588c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objC = rVar.f184586a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f184588c;
        if (i15 == 0) {
            o13.r.b(objC);
            g1 g1Var = this.f184567b;
            if (g1Var != null) {
                rVar.f184588c = 1;
                LivetrackService livetrackService = g1Var.f184472d;
                objC = livetrackService != null ? livetrackService.c(j8, rVar) : null;
                if (objC == aVar) {
                    return aVar;
                }
            }
            return new a2(null, null, 3, null);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objC);
        a2 a2Var = (a2) objC;
        if (a2Var != null) {
            return a2Var;
        }
        return new a2(null, null, 3, null);
    }

    public final void d(l lVar) {
        androidx.lifecycle.w0<com.garmin.android.library.livetrack.d> w0Var;
        if (this.f184567b == null) {
            this.f184567b = new g1(lVar, this);
        }
        g1 g1Var = this.f184567b;
        if (g1Var != null && (w0Var = g1Var.f184473e) != null) {
            w0Var.g(this.f184569d);
        }
        xd2.b1 b1Var = xd2.b1.f190056a;
        Context contextF = lVar.f().f();
        b1Var.getClass();
        SharedPreferences sharedPreferences = contextF.getSharedPreferences("livetrack.preferences", 0);
        sharedPreferences.getClass();
        xd2.b1.f190057b = sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public final boolean e(Long l14) {
        Set<z1> setB;
        Set<z1> setB2;
        g1 g1Var = this.f184567b;
        if (l14 == null) {
            if (g1Var == null) {
                setB = p13.l0.f134950a;
            } else {
                LivetrackService livetrackService = g1Var.f184472d;
                setB = livetrackService != null ? livetrackService.b() : p13.l0.f134950a;
                if (setB == null) {
                    setB = p13.l0.f134950a;
                }
            }
            return !setB.isEmpty();
        }
        if (g1Var == null) {
            setB2 = p13.l0.f134950a;
        } else {
            LivetrackService livetrackService2 = g1Var.f184472d;
            setB2 = livetrackService2 != null ? livetrackService2.b() : p13.l0.f134950a;
            if (setB2 == null) {
                setB2 = p13.l0.f134950a;
            }
        }
        for (Object obj : setB2) {
            if (((z1) obj).f184693a == l14.longValue()) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final synchronized void f(e0 e0Var, l lVar) {
        e0Var.getClass();
        lVar.getClass();
        ge1.b.T(this, null, null, new b(lVar, e0Var, null), 3);
    }

    public final void g() {
        int i14;
        g1 g1Var = this.f184567b;
        if (g1Var != null) {
            ConcurrentHashMap concurrentHashMap = g1Var.f184475g;
            LivetrackService livetrackService = g1Var.f184472d;
            Context applicationContext = livetrackService != null ? livetrackService.getApplicationContext() : null;
            if (e(null)) {
                Logger logger = f184565h;
                if (logger != null) {
                    logger.debug("stopIfNecessary: is livetracking = true, won't stop");
                    return;
                }
                return;
            }
            if (concurrentHashMap.isEmpty()) {
                i14 = 0;
            } else {
                Iterator it = concurrentHashMap.entrySet().iterator();
                i14 = 0;
                while (it.hasNext()) {
                    if (((Number) ((Map.Entry) it.next()).getKey()).longValue() != g1Var.f184477i) {
                        i14++;
                    }
                }
            }
            if (i14 > 0) {
                Logger logger2 = f184565h;
                if (logger2 != null) {
                    logger2.debug("stopIfNecessary: is livetracking = false, but has external bindings, just remove from foreground");
                }
                g1Var.c();
                return;
            }
            if (g1Var.f184478j) {
                return;
            }
            Logger logger3 = f184565h;
            if (logger3 != null) {
                logger3.debug("stopIfNecessary: is livetracking = false, 0 external bindings, complete stop");
            }
            if (g1Var.d()) {
                g1Var.c();
            }
            Context applicationContext2 = g1Var.f184469a.f().f().getApplicationContext();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                ServiceConnection serviceConnection = (ServiceConnection) entry.getValue();
                applicationContext2.getClass();
                g1Var.i(applicationContext2, jLongValue, serviceConnection);
            }
            concurrentHashMap.clear();
            applicationContext2.getClass();
            Intent intent = new Intent(applicationContext2, (Class<?>) LivetrackService.class);
            intent.putExtra("EXTRA_SERVICE_NOTIFICATION_INFO", (Parcelable) null);
            applicationContext2.stopService(intent);
            ge1.b.T(this, null, null, new c(applicationContext, null), 3);
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF183565a() {
        x53.c cVar = o53.s0.f129406a;
        return u53.o.f168762a.plus(this.f184566a);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwd2/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lwd2/q;", "instance", "Lwd2/q;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            if (r4.a(r1, r0) == r7) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        
            if (r4.b(r0) == r7) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            return r7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object a(a aVar, Context context, Long l14, v13.c cVar) {
            n nVar;
            aVar.getClass();
            if (cVar instanceof n) {
                nVar = (n) cVar;
                int i14 = nVar.f184532c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    nVar.f184532c = i14 - Integer.MIN_VALUE;
                } else {
                    nVar = new n(aVar, cVar);
                }
            } else {
                nVar = new n(aVar, cVar);
            }
            Object obj = nVar.f184530a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = nVar.f184532c;
            if (i15 == 0) {
                o13.r.b(obj);
                if (context != null) {
                    Logger logger = q.f184565h;
                    if (logger != null) {
                        logger.debug("Deleting all local publishers.");
                    }
                    if (l14 != null) {
                        long jLongValue = l14.longValue();
                        zd2.a aVarF = LocalDatabase.f50198a.a(context).f();
                        nVar.f184532c = 1;
                    } else {
                        zd2.a aVarF2 = LocalDatabase.f50198a.a(context).f();
                        nVar.f184532c = 2;
                    }
                } else {
                    Logger logger2 = q.f184565h;
                    if (logger2 != null) {
                        logger2.warn("Null Context, can't delete local publishers");
                    }
                }
            } else {
                if (i15 != 1 && i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object b(Context context, v13.c cVar) {
            o oVar;
            if (cVar instanceof o) {
                oVar = (o) cVar;
                int i14 = oVar.f184541d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    oVar.f184541d = i14 - Integer.MIN_VALUE;
                } else {
                    oVar = new o(this, cVar);
                }
            } else {
                oVar = new o(this, cVar);
            }
            Object obj = oVar.f184539b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = oVar.f184541d;
            if (i15 == 0) {
                o13.r.b(obj);
                if (context != null) {
                    Logger logger = q.f184565h;
                    if (logger != null) {
                        logger.debug("Deleting all local Livetrack related data");
                    }
                    LocalDatabase localDatabaseA = LocalDatabase.f50198a.a(context);
                    oVar.f184538a = context;
                    oVar.f184541d = 1;
                    if (localDatabaseA.e(oVar) == aVar) {
                        return aVar;
                    }
                } else {
                    Logger logger2 = q.f184565h;
                    if (logger2 != null) {
                        logger2.warn("Null Context, can't delete local Livetrack data");
                    }
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = oVar.f184538a;
            o13.r.b(obj);
            xd2.b1.f190056a.getClass();
            context.getClass();
            SharedPreferences sharedPreferences = context.getSharedPreferences("livetrack.preferences", 0);
            sharedPreferences.getClass();
            xd2.b1.f190057b = sharedPreferences;
            sharedPreferences.edit().clear().apply();
            return Unit.INSTANCE;
        }

        public final synchronized q c() {
            q qVar;
            try {
                if (q.f184564g == null) {
                    q.f184564g = new q(null);
                    if (q.f184565h == null) {
                        q.f184565h = i2.a("LivetrackManager");
                    }
                    Logger logger = q.f184565h;
                    if (logger != null) {
                        logger.debug("Created instance");
                    }
                }
                qVar = q.f184564g;
                qVar.getClass();
            } catch (Throwable th3) {
                throw th3;
            }
            return qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object d(Context context, v13.c cVar) {
            p pVar;
            if (cVar instanceof p) {
                pVar = (p) cVar;
                int i14 = pVar.f184553c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    pVar.f184553c = i14 - Integer.MIN_VALUE;
                } else {
                    pVar = new p(this, cVar);
                }
            } else {
                pVar = new p(this, cVar);
            }
            Object obj = pVar.f184551a;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = pVar.f184553c;
            if (i15 == 0) {
                o13.r.b(obj);
                Logger logger = q.f184565h;
                if (logger != null) {
                    logger.debug("Releasing resources");
                }
                q qVar = q.f184564g;
                if (qVar != null && qVar.f184570e) {
                    pVar.f184553c = 1;
                    if (b(context, pVar) == obj2) {
                        return obj2;
                    }
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            synchronized (he2.a.f83529a) {
                try {
                    Logger logger2 = he2.a.f83531c;
                    if (logger2 != null) {
                        logger2.debug("Destroying");
                    }
                    he2.a.f83530b = null;
                    he2.a.f83531c = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return Unit.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ q(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
