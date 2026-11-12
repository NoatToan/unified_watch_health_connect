package po2;

import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\t\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lpo2/k0;", "R", "", "", "jobPollingIntervalInMs", "syncPollingIntervalInMs", "deviceId", "<init>", "(JJJ)V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class k0<R> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f139256j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f139257k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f139258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f139259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f139260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q53.t<? super R> f139261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f139262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k0<R>.b f139263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v0 f139264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f139265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f139266i;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpo2/k0$b;", "", "", "timeoutInMilliSeconds", "Lkotlin/Function1;", "Lpo2/v0;", "", "onTimerReady", "<init>", "(Lpo2/k0;JLe23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f139267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.l<v0, Unit> f139268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0<R> f139269c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(k0 k0Var, long j8, e23.l<? super v0, Unit> lVar) {
            lVar.getClass();
            this.f139269c = k0Var;
            this.f139267a = j8;
            this.f139268b = lVar;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f139257k = gt2.b.f79005a.h("PAY#NEW_FITPAY#TransitCardOperationFlowBuilder");
    }

    public k0(long j8, long j14, long j15) {
        this.f139258a = j8;
        this.f139259b = j14;
        this.f139260c = j15;
    }

    public final r53.b a(to2.a aVar, String str, wo2.a aVar2) {
        aVar.getClass();
        str.getClass();
        aVar2.getClass();
        return r53.s.f(new m0(this, aVar, str, aVar2, null));
    }

    public Object b(t13.d dVar, Throwable th3) {
        q53.t<? super R> tVar = this.f139261d;
        if (tVar != null) {
            tVar.q(th3);
            return Unit.INSTANCE;
        }
        p005kotlin.jvm.internal.s.m("producerScope");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Object obj, v13.c cVar) {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f139303c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f139303c = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object obj2 = n0Var.f139301a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f139303c;
        if (i15 == 0) {
            o13.r.b(obj2);
            n0Var.f139303c = 1;
            if (q(obj, n0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj2);
        }
        q53.t<? super R> tVar = this.f139261d;
        if (tVar != null) {
            tVar.q(null);
            return Unit.INSTANCE;
        }
        p005kotlin.jvm.internal.s.m("producerScope");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, v13.c cVar) {
        q0 q0Var;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f139344d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f139344d = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        Object objN = q0Var.f139342b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var.f139344d;
        try {
            if (i15 == 0) {
                o13.r.b(objN);
                zn2.u0 u0Var = zn2.u0.f205864a;
                q0Var.f139341a = str;
                q0Var.f139344d = 1;
                u0Var.getClass();
                objN = zn2.u0.g().N(str, q0Var);
                if (objN == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = q0Var.f139341a;
                o13.r.b(objN);
            }
            return ((fo2.l0) ao2.b.b((c83.a0) objN)).getReason();
        } catch (Throwable th3) {
            f139257k.warn("Failed to get error code from " + str, th3);
            return null;
        }
    }

    public final q53.t e() {
        q53.t<? super R> tVar = this.f139261d;
        if (tVar != null) {
            return tVar;
        }
        p005kotlin.jvm.internal.s.m("producerScope");
        throw null;
    }

    public final void f(String str) {
        str.getClass();
        ge1.b.T(e(), null, null, new r0(str, this, null), 3);
    }

    public final void g() {
        ge1.b.T(e(), null, null, new s0(this, null), 3);
    }

    public Object h(to2.h hVar, t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    public Object i(to2.h hVar, t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    public Object j(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    public Object k(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    public Object l(r0 r0Var) {
        return Unit.INSTANCE;
    }

    public Object m(to2.h hVar, t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    public Object n(int i14, r0 r0Var) {
        return Unit.INSTANCE;
    }

    public Object o(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    public Object p(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    public final Object q(Object obj, v13.c cVar) {
        q53.t<? super R> tVar = this.f139261d;
        if (tVar == null) {
            p005kotlin.jvm.internal.s.m("producerScope");
            throw null;
        }
        if (tVar.d()) {
            f139257k.warn("Drop " + obj + " to sent since producerScope has been closed.");
            return Unit.INSTANCE;
        }
        q53.t<? super R> tVar2 = this.f139261d;
        if (tVar2 != null) {
            Object objH = tVar2.h(obj, cVar);
            return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
        }
        p005kotlin.jvm.internal.s.m("producerScope");
        throw null;
    }

    public final void r() {
        this.f139262e = System.currentTimeMillis();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpo2/k0$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "TIMEOUT_TIME", "J", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(a aVar, k0 k0Var, e23.l lVar) {
            aVar.getClass();
            a aVar2 = k0.f139256j;
            k0Var.f139263f = new b(k0Var, 180000L, lVar);
        }

        private a() {
        }
    }
}
