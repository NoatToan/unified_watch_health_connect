package dk2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import e23.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import o13.r;
import o53.b0;
import o53.c2;
import o53.m0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.j0;
import u53.o;
import v13.i;
import zy2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0002:\u0001\u0013BE\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B?\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Ldk2/a;", "Ldk2/e;", "", "Lek2/b;", "filterer", "Lik2/d;", "scanner", "callback", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lek2/a;", "criteria", "", "timeoutSeconds", "Lhk2/d;", "probeFunc", "<init>", "(Lek2/b;Lik2/d;Ldk2/e;Landroid/content/Context;Lek2/a;ILhk2/d;)V", "(Lik2/d;Ldk2/e;Landroid/content/Context;Lek2/a;ILhk2/d;)V", "b", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f60211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final cz2.d f60212j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ek2.b f60213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik2.d f60214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f60215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hk2.d f60216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f60217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f60218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f60219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hk2.b f60220h;

    /* JADX INFO: renamed from: dk2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.discovery.ActiveDiscoveryCheck$1", f = "ActiveDiscoveryCheck.kt", l = {96}, m = "invokeSuspend")
    public static final class C1280a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f60222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f60223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1280a(int i14, a aVar, t13.d<? super C1280a> dVar) {
            super(2, dVar);
            this.f60222b = i14;
            this.f60223c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1280a(this.f60222b, this.f60223c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1280a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f60221a;
            if (i14 == 0) {
                r.b(obj);
                long j8 = ((long) this.f60222b) * 1000;
                this.f60221a = 1;
                if (m0.b(j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.f60223c.b(f.DISCOVERY_TIMEOUT);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.discovery.ActiveDiscoveryCheck$onDeviceFound$1", f = "ActiveDiscoveryCheck.kt", l = {}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f60225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f60225b = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f60225b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = a.this;
            hk2.b bVar = aVar2.f60220h;
            if (bVar != null) {
                h hVar = this.f60225b;
                hk2.d dVar = aVar2.f60216d;
                hVar.getClass();
                synchronized (bVar.f84231g) {
                    hk2.b.c cVar = bVar.f84231g.get(hVar.getF60238b());
                    if (cVar != null) {
                        if (cVar.f84235a) {
                            z14 = false;
                        } else {
                            bVar.a(hVar.getF60238b(), hVar);
                            HashMap<String, hk2.b.c> map = bVar.f84231g;
                            String f60238b = hVar.getF60238b();
                            long jB = bVar.b(hVar);
                            z14 = true;
                            map.put(f60238b, new hk2.b.c(true, hVar, jB));
                        }
                        Unit unit = Unit.INSTANCE;
                        if (z14) {
                            hk2.b.f84223k.debug("cancelProbe " + hVar.getF60238b());
                            if (dVar != null) {
                                dVar.a(hVar.getF60238b());
                            }
                        }
                    }
                }
            }
            ek2.b bVar2 = a.this.f60213a;
            h hVar2 = this.f60225b;
            bVar2.getClass();
            hVar2.getClass();
            synchronized (bVar2.f64515b) {
                bVar2.f(hVar2, bVar2.b());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.discovery.ActiveDiscoveryCheck$onDiscoveryFailed$1", f = "ActiveDiscoveryCheck.kt", l = {}, m = "invokeSuspend")
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f60226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f60227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar, a aVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f60226a = fVar;
            this.f60227b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f60226a, this.f60227b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            f fVar = f.DISCOVERY_TIMEOUT;
            a aVar2 = this.f60227b;
            f fVar2 = this.f60226a;
            if (fVar2 == fVar) {
                aVar2.f60215c.getClass();
            }
            aVar2.f60215c.b(fVar2);
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
        g.f60256e.getClass();
        f60211i = g.f60257f;
        cz2.a.f56879a.getClass();
        f60212j = cz2.a.C1219a.f56881b;
    }

    private a(ek2.b bVar, ik2.d dVar, e eVar, Context context, ek2.a aVar, int i14, hk2.d dVar2) {
        fk2.d next;
        Object next2;
        this.f60213a = bVar;
        this.f60214b = dVar;
        this.f60215c = eVar;
        this.f60216d = dVar2;
        x53.c cVar = s0.f129406a;
        this.f60217e = zl.a.e("ActiveDiscoveryCheck", x53.b.f189152a.plus(ge1.b.h()));
        this.f60218f = new AtomicBoolean(true);
        bVar.getClass();
        aVar.getClass();
        synchronized (bVar.f64515b) {
            try {
                bVar.f64520g.clear();
                bVar.f64521h.clear();
                bVar.f64519f.clear();
                bVar.f64519f.addAll(aVar.f64510a);
                bVar.f64516c = this;
                bVar.f64517d = bVar.f64514a.millis() / ((long) 1000);
                Timer timer = bVar.f64518e;
                if (timer != null) {
                    timer.cancel();
                }
                Iterator<fk2.d> it = bVar.f64519f.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long jA = next.getF71939b();
                        do {
                            fk2.d next3 = it.next();
                            long jA2 = next3.getF71939b();
                            if (jA < jA2) {
                                next = next3;
                                jA = jA2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                fk2.d dVar3 = next;
                long jA3 = dVar3 != null ? dVar3.getF71939b() : 30L;
                if (jA3 > 0) {
                    Timer timer2 = new Timer();
                    bVar.f64518e = timer2;
                    timer2.schedule(new ek2.c(bVar, jA3), 5000L, 5000L);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f60214b.a(aVar, this);
        if (this.f60216d != null) {
            hk2.b.f84221i.getClass();
            hk2.b bVar2 = hk2.b.f84224l;
            if (bVar2 == null) {
                bVar2 = new hk2.b(context != null ? context.getApplicationContext() : null);
                hk2.b.f84224l = bVar2;
            }
            this.f60220h = bVar2;
            Iterator<T> it3 = aVar.f64510a.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!(((fk2.d) next2) instanceof fk2.b));
            fk2.b bVar3 = next2 instanceof fk2.b ? (fk2.b) next2 : null;
            Collection<String> collection = bVar3 != null ? bVar3.f71942a : j0.f134944a;
            hk2.b bVar4 = this.f60220h;
            hk2.d dVar4 = this.f60216d;
            if (dVar4 != null && bVar4 != null) {
                g.f60256e.getClass();
                long j8 = g.f60258g;
                if (j8 > 0) {
                    ge1.b.T(this.f60217e, null, null, new dk2.c(collection, j8, this, null), 3);
                } else {
                    bVar4.c(collection, dVar4, this);
                }
            }
        } else {
            this.f60220h = null;
        }
        this.f60219g = i14 > 0 ? ge1.b.T(this.f60217e, x53.b.f189152a, null, new C1280a(i14, this, null), 2) : null;
    }

    @Override // dk2.e
    public final void a(h hVar) {
        hVar.getClass();
        x53.c cVar = s0.f129406a;
        ge1.b.T(this.f60217e, x53.b.f189152a, null, new c(hVar, null), 2);
    }

    @Override // dk2.e
    public final void b(f fVar) {
        fVar.getClass();
        f60211i.a(null, "onDiscoveryFailed " + fVar);
        if (this.f60218f.get() && this.f60213a.c()) {
            c();
            x53.c cVar = s0.f129406a;
            ge1.b.T(this.f60217e, o.f168762a, null, new d(fVar, this, null), 2);
        }
    }

    public final void c() {
        if (this.f60218f.compareAndSet(true, false)) {
            c2 c2Var = this.f60219g;
            if (c2Var != null) {
                c2Var.c(null);
            }
            if (this.f60213a.c()) {
                f60211i.debug("stopDiscovery");
                ek2.b bVar = this.f60213a;
                synchronized (bVar.f64515b) {
                    try {
                        Timer timer = bVar.f64518e;
                        if (timer != null) {
                            timer.cancel();
                        }
                        bVar.f64516c = null;
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                hk2.b bVar2 = this.f60220h;
                if (bVar2 != null) {
                    synchronized (bVar2.f84230f) {
                        bVar2.f84232h = null;
                    }
                }
                this.f60214b.b();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldk2/a$b;", "", "<init>", "()V", "Lzy2/k;", "LOGGER", "Lzy2/k;", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ a(ik2.d dVar, e eVar, Context context, ek2.a aVar, int i14, hk2.d dVar2, int i15, j jVar) {
        this(dVar, eVar, context, aVar, i14, (i15 & 32) != 0 ? null : dVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ik2.d dVar, e eVar, Context context, ek2.a aVar, int i14, hk2.d dVar2) {
        this(new ek2.b(f60212j), dVar, eVar, context, aVar, i14, dVar2);
        dVar.getClass();
        eVar.getClass();
        aVar.getClass();
    }
}
