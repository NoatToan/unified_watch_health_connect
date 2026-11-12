package wd2;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Parcelable;
import com.garmin.android.library.livetrack.LivetrackService;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lwd2/g1;", "", "Lwd2/l;", "appDelegate", "Lwd2/g1$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lwd2/l;Lwd2/g1$b;)V", "b", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f184468k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f184469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f184470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f184471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LivetrackService f184472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.w0<com.garmin.android.library.livetrack.d> f184473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f184474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f184475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f184476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f184477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f184478j;

    public interface b {
        void a();
    }

    static {
        new a(null);
    }

    public g1(l lVar, b bVar) {
        lVar.getClass();
        this.f184469a = lVar;
        this.f184470b = bVar;
        this.f184471c = i2.a("LivetrackServiceController");
        this.f184473e = new androidx.lifecycle.w0<>();
        this.f184474f = new h0(this, 1);
        this.f184475g = new ConcurrentHashMap(1);
        this.f184476h = new AtomicLong(0L);
        this.f184477i = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v13.c cVar) {
        h1 h1Var;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i14 = h1Var.f184490c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h1Var.f184490c = i14 - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(this, cVar);
            }
        } else {
            h1Var = new h1(this, cVar);
        }
        Object objB = h1Var.f184488a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = h1Var.f184490c;
        Logger logger = this.f184471c;
        if (i15 == 0) {
            o13.r.b(objB);
            logger.debug("Binding self");
            Context applicationContext = this.f184469a.f().f().getApplicationContext();
            applicationContext.getClass();
            h1Var.f184490c = 1;
            objB = b(applicationContext, h1Var);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        o13.p pVar = (o13.p) objB;
        if (pVar != null) {
            this.f184477i = ((Number) pVar.f128594a).longValue();
        } else {
            logger.error("Error binding self");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable b(Context context, v13.c cVar) {
        i1 i1Var;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i14 = i1Var.f184505c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i1Var.f184505c = i14 - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(this, cVar);
            }
        } else {
            i1Var = new i1(this, cVar);
        }
        Object objE0 = i1Var.f184503a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i1Var.f184505c;
        if (i15 == 0) {
            o13.r.b(objE0);
            this.f184478j = true;
            Intent intent = new Intent(context, (Class<?>) LivetrackService.class);
            intent.putExtra("EXTRA_SERVICE_NOTIFICATION_INFO", (Parcelable) null);
            i1Var.f184505c = 1;
            objE0 = ge1.b.e0(o53.s0.f129406a, new com.garmin.android.library.livetrack.h(context, intent, this, null), i1Var);
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
        o13.p pVar = (o13.p) objE0;
        if (pVar == null) {
            this.f184478j = false;
            b bVar = this.f184470b;
            if (bVar != null) {
                bVar.a();
            }
            return null;
        }
        A a14 = pVar.f128594a;
        this.f184478j = false;
        AtomicLong atomicLong = this.f184476h;
        long andIncrement = atomicLong.getAndIncrement();
        if (andIncrement == Long.MAX_VALUE) {
            atomicLong.set(0L);
        }
        Long l14 = new Long(andIncrement);
        B b14 = pVar.f128595b;
        ConcurrentHashMap concurrentHashMap = this.f184475g;
        concurrentHashMap.put(l14, b14);
        this.f184472d = (LivetrackService) a14;
        this.f184471c.debug("Storing new ServiceConnection with id " + andIncrement + ", total count = " + concurrentHashMap.size());
        return new o13.p(new Long(andIncrement), a14);
    }

    public final void c() {
        boolean zD = d();
        Logger logger = this.f184471c;
        if (!zD) {
            logger.warn("Service not started, cannot remove from foreground");
            return;
        }
        logger.debug("Removing service from foreground");
        LivetrackService livetrackService = this.f184472d;
        if (livetrackService != null) {
            livetrackService.stopForeground(true);
        }
        Context applicationContext = this.f184469a.f().f().getApplicationContext();
        applicationContext.getClass();
        h(applicationContext, this.f184477i);
        this.f184477i = -1L;
    }

    public final boolean d() {
        return this.f184477i != -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j8, v13.c cVar) {
        j1 j1Var;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i14 = j1Var.f184514c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j1Var.f184514c = i14 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(this, cVar);
            }
        } else {
            j1Var = new j1(this, cVar);
        }
        Object obj = j1Var.f184512a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j1Var.f184514c;
        if (i15 == 0) {
            o13.r.b(obj);
            LivetrackService livetrackService = this.f184472d;
            if (livetrackService != null) {
                j1Var.f184514c = 1;
                if (livetrackService.f(j8, this.f184469a, j1Var) == aVar) {
                    return aVar;
                }
            } else {
                this.f184471c.error("Not initialized");
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v13.c cVar) {
        k1 k1Var;
        if (cVar instanceof k1) {
            k1Var = (k1) cVar;
            int i14 = k1Var.f184521c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k1Var.f184521c = i14 - Integer.MIN_VALUE;
            } else {
                k1Var = new k1(this, cVar);
            }
        } else {
            k1Var = new k1(this, cVar);
        }
        Object obj = k1Var.f184519a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = k1Var.f184521c;
        Logger logger = this.f184471c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (d()) {
                    logger.warn("Service already started");
                } else {
                    logger.debug("Starting foreground service and binding self");
                    l lVar = this.f184469a;
                    Context applicationContext = lVar.f().f().getApplicationContext();
                    kd0.e1 e1VarF = lVar.f();
                    applicationContext.getClass();
                    e1VarF.getClass();
                    j22.b.f96736a.getClass();
                    if (!j22.b.b(applicationContext)) {
                        return Unit.INSTANCE;
                    }
                    y1 y1VarE = lVar.f().e();
                    Intent intent = new Intent(applicationContext, (Class<?>) LivetrackService.class);
                    intent.putExtra("EXTRA_SERVICE_NOTIFICATION_INFO", y1VarE);
                    a7.b.startForegroundService(applicationContext, intent);
                    k1Var.f184521c = 1;
                    if (a(k1Var) == obj2) {
                        return obj2;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        } catch (IllegalStateException e4) {
            ds.e0.v("Foreground service is not started ", e4.getMessage(), logger);
        }
        return Unit.INSTANCE;
    }

    public final void g(long j8, c2 c2Var) {
        z1 z1Var;
        LivetrackService livetrackService;
        Object next;
        c2Var.getClass();
        LivetrackService livetrackService2 = this.f184472d;
        if (livetrackService2 != null) {
            Iterator<T> it = livetrackService2.b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (j8 != ((z1) next).f184693a);
            z1Var = (z1) next;
        } else {
            z1Var = null;
        }
        if (z1Var == null || (livetrackService = this.f184472d) == null) {
            return;
        }
        Logger logger = livetrackService.f50162b;
        wr.g.w("Stop livetrack for ", j8, logger);
        if (livetrackService.f50164d == null) {
            logger.error("App Delegate is not initialized, did you call startLivetrack()?");
        } else {
            ge1.b.T(livetrackService, null, null, new x0(livetrackService, j8, c2Var, null), 3);
        }
    }

    public final void h(Context context, long j8) {
        context.getClass();
        ServiceConnection serviceConnection = (ServiceConnection) this.f184475g.remove(Long.valueOf(j8));
        if (serviceConnection != null) {
            i(context, j8, serviceConnection);
            return;
        }
        this.f184471c.error("Unknown bindId: " + j8);
    }

    public final void i(Context context, long j8, ServiceConnection serviceConnection) {
        b bVar;
        Logger logger = this.f184471c;
        ConcurrentHashMap concurrentHashMap = this.f184475g;
        if (serviceConnection != null) {
            try {
                context.unbindService(serviceConnection);
                logger.debug("Unbound service for ServiceConnection with id " + j8 + ", total bounded count = " + concurrentHashMap.size());
                if (concurrentHashMap.isEmpty()) {
                    this.f184472d = null;
                }
                if (j8 == this.f184477i || (bVar = this.f184470b) == null) {
                    return;
                }
                bVar.a();
            } catch (IllegalArgumentException e4) {
                logger.error("Trying to unbind an unregistered service with the id " + j8 + ", total bounded count = " + concurrentHashMap.size(), (Throwable) e4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object j(long j8, ge2.a aVar, v13.c cVar) {
        l1 l1Var;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i14 = l1Var.f184525c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l1Var.f184525c = i14 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        l1 l1Var2 = l1Var;
        Object obj = l1Var2.f184523a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = l1Var2.f184525c;
        if (i15 == 0) {
            o13.r.b(obj);
            LivetrackService livetrackService = this.f184472d;
            if (livetrackService != null) {
                l1Var2.f184525c = 1;
                if (livetrackService.l(j8, aVar, this.f184469a, l1Var2) == aVar2) {
                    return aVar2;
                }
            } else {
                this.f184471c.error("Not initialized");
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lwd2/g1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "ID_SELF_UNBOUND", "J", "UNKNOWN_DEVICE_ID", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
