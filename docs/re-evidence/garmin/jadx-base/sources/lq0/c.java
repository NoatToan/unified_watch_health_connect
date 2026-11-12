package lq0;

import android.os.Handler;
import c22.o;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import cq0.j;
import e23.l;
import e23.p;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.j0;
import tj1.s;
import tj1.t;
import tj1.u;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llq0/c;", "Lkq0/b;", "Landroid/os/Handler;", "serviceHandler", "<init>", "(Landroid/os/Handler;)V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements kq0.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f114315g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f114316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f114317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<l20.a> f114318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f114319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kq0.h f114320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2177c f114321f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.service.middleware.NetworkMiddleware$endEmergencyNotifyContactsIAmOkay$1", f = "NetworkMiddleware.kt", l = {159}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f114322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jq0.c f114323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f114324c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class a extends q implements l<List<? extends String>, Unit> {
            public a(Object obj) {
                super(1, obj, c.class, "endEmergencyNotifyContactsIAmOkay", "endEmergencyNotifyContactsIAmOkay(Ljava/util/List;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                list2.getClass();
                c cVar = (c) this.receiver;
                int i14 = c.f114315g;
                cVar.b(list2);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: lq0.c$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class C2176b extends q implements l<List<? extends String>, Unit> {
            public C2176b(Object obj) {
                super(1, obj, c.class, "endEmergencyNotifyContactsIAmOkay", "endEmergencyNotifyContactsIAmOkay(Ljava/util/List;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                list2.getClass();
                c cVar = (c) this.receiver;
                int i14 = c.f114315g;
                cVar.b(list2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jq0.c cVar, c cVar2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f114323b = cVar;
            this.f114324c = cVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f114323b, this.f114324c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f114322a;
            if (i14 == 0) {
                r.b(obj);
                dq0.c.f60700b.getClass();
                dq0.c cVarA = dq0.c.a.a();
                this.f114322a = 1;
                obj = f0.J(cVarA, new dq0.d(cVarA, this.f114323b, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            kq0.a.a("NetworkMiddleware", "endEmergencyNotifyContactsIAmOkay: API status is [" + v2Var + "]");
            boolean z14 = v2Var instanceof v2.b;
            c cVar = this.f114324c;
            if (z14) {
                u uVar = (u) ((v2.b) v2Var).f47386a;
                List<t> listD = uVar.d();
                if (listD == null || listD.isEmpty()) {
                    List<s> listB = uVar.b();
                    if (listB == null || listB.isEmpty()) {
                        kq0.a.a("NetworkMiddleware", "endEmergencyNotifyContactsIAmOkay: result has no successes and no failures. This should not have happened.");
                        kq0.h hVar = cVar.f114320e;
                        if (hVar == null) {
                            p005kotlin.jvm.internal.s.m("store");
                            throw null;
                        }
                        hVar.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.e(cq0.f.FROM_GCM_UNABLE_TO_NOTIFY_EMERGENCY_CONTACTS));
                    } else {
                        List<String> listF = uVar.f();
                        if (listF.isEmpty()) {
                            kq0.a.a("NetworkMiddleware", "endEmergencyNotifyContactsIAmOkay: result has failures but no contacts make sense to retry");
                            kq0.h hVar2 = cVar.f114320e;
                            if (hVar2 == null) {
                                p005kotlin.jvm.internal.s.m("store");
                                throw null;
                            }
                            hVar2.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.e(cq0.f.FROM_GCM_UNABLE_TO_NOTIFY_EMERGENCY_CONTACTS));
                        } else {
                            cVar.c(new a(cVar), listF, cVar.f114319d.incrementAndGet());
                        }
                    }
                } else {
                    kq0.h hVar3 = cVar.f114320e;
                    if (hVar3 == null) {
                        p005kotlin.jvm.internal.s.m("store");
                        throw null;
                    }
                    hVar3.a(com.garmin.android.apps.connectmobile.incidentdetection.service.a.c.f36883c);
                    kq0.h hVar4 = cVar.f114320e;
                    if (hVar4 == null) {
                        p005kotlin.jvm.internal.s.m("store");
                        throw null;
                    }
                    hVar4.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.e(cq0.f.FROM_GCM_I_AM_OKAY));
                }
            } else {
                v2.a aVar2 = v2Var instanceof v2.a ? (v2.a) v2Var : null;
                int iIncrementAndGet = cVar.f114319d.incrementAndGet();
                if (aVar2 == null || ((num = aVar2.f47384b) != null && num.intValue() == 404)) {
                    kq0.a.a("NetworkMiddleware", "callGCSNotifyContactsIAmOkay: error = " + aVar2 + "; retried " + (iIncrementAndGet - 1) + " times without success");
                    kq0.h hVar5 = cVar.f114320e;
                    if (hVar5 == null) {
                        p005kotlin.jvm.internal.s.m("store");
                        throw null;
                    }
                    hVar5.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.e(cq0.f.FROM_GCM_UNABLE_TO_NOTIFY_EMERGENCY_CONTACTS));
                } else {
                    cVar.c(new C2176b(cVar), j0.f134944a, iIncrementAndGet);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: lq0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"lq0/c$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Ll20/r;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2177c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<l20.r> {
        public C2177c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            c cVar3 = c.this;
            if (cVar != cVar2) {
                kq0.c cVar4 = kq0.c.f106153a;
                int iIncrementAndGet = cVar3.f114319d.incrementAndGet();
                cVar4.getClass();
                long jA = kq0.c.a(iIncrementAndGet);
                if (jA > 0) {
                    j jVar = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
                    Handler handler = cVar3.f114316a;
                    if (handler != null) {
                        handler.postDelayed(new l0.e(2, jVar, this), jA);
                    }
                } else {
                    kq0.a.a("NetworkMiddleware", "handleActionIncidentDetected: getEmergencyContactsFromGC operation is failed");
                }
            }
            if (cVar == cVar2) {
                cVar3.f114319d.set(0);
                List<l20.a> list = cVar3.f114318c;
                if (list != null) {
                    kq0.h hVar = cVar3.f114320e;
                    if (hVar != null) {
                        hVar.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.d(list));
                    } else {
                        p005kotlin.jvm.internal.s.m("store");
                        throw null;
                    }
                }
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, l20.r rVar) {
            l20.r rVar2 = rVar;
            eVar.getClass();
            rVar2.getClass();
            c.this.f114318c = rVar2.f();
        }
    }

    static {
        new a(null);
    }

    public c(Handler handler) {
        this.f114316a = handler;
        this.f114317b = -1L;
        this.f114319d = new AtomicInteger(0);
        this.f114321f = new C2177c();
    }

    @Override // kq0.b
    public final void a(com.garmin.android.apps.connectmobile.incidentdetection.service.a aVar, kq0.g gVar, kq0.h hVar) {
        aVar.getClass();
        gVar.getClass();
        this.f114320e = hVar;
        this.f114317b = gVar.f106159c;
        List<l20.a> list = gVar.f106163g;
        this.f114318c = list;
        boolean z14 = aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.f;
        AtomicInteger atomicInteger = this.f114319d;
        if (z14 && (list == null || list.isEmpty())) {
            atomicInteger.set(0);
            ((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)).q(this.f114321f);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.o) {
            if (list != null) {
                atomicInteger.set(0);
                b(j0.f134944a);
            } else {
                kq0.a.a("NetworkMiddleware", "process: currentState.contactList is null, not taking any actions");
            }
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.c) {
            kq0.a.a("NetworkMiddleware", "callGCToCancelLiveTrack");
            ((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)).p(this.f114317b);
            hVar.a(com.garmin.android.apps.connectmobile.incidentdetection.service.a.h.f36890c);
        }
        if ((aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.e) && ((com.garmin.android.apps.connectmobile.incidentdetection.service.a.e) aVar).f36885c == cq0.f.FROM_DEVICE_FINISH_UNKNOWN_COMMUNICATION) {
            kq0.a.a("NetworkMiddleware", "clear up live track state ");
            ((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)).g(this.f114317b);
        }
    }

    public final void b(List<String> list) {
        String strD = hb2.h.d(hb2.h.a(((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).getF104108a()));
        kq0.h hVar = this.f114320e;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("store");
            throw null;
        }
        jq0.c cVar = new jq0.c(strD, ((kq0.g) hVar.f106172d.getValue()).f106158b, list);
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new b(cVar, this, null), 3);
    }

    public final void c(l lVar, List list, int i14) {
        kq0.c.f106153a.getClass();
        long jA = kq0.c.a(i14);
        if (jA <= 0) {
            StringBuilder sb3 = new StringBuilder("retryEmergencyContactNotifications: retried ");
            sb3.append(i14 - 1);
            sb3.append(" times without success");
            kq0.a.a("NetworkMiddleware", sb3.toString());
            kq0.h hVar = this.f114320e;
            if (hVar != null) {
                hVar.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.e(cq0.f.FROM_GCM_UNABLE_TO_NOTIFY_EMERGENCY_CONTACTS));
                return;
            } else {
                p005kotlin.jvm.internal.s.m("store");
                throw null;
            }
        }
        try {
            kq0.a.a("NetworkMiddleware", "retryEmergencyContactNotifications: result has failures and we haven't finished retrying yet; retrying contacts " + list + " with function " + lVar);
        } catch (Throwable unused) {
            kq0.a.a("NetworkMiddleware", "retryEmergencyContactNotifications: result has failures and we haven't finished retrying yet; retrying contacts " + list);
        }
        Handler handler = this.f114316a;
        if (handler != null) {
            handler.postDelayed(new cq0.e(lVar, list, 1), jA);
        }
        kq0.a.a("NetworkMiddleware", "retryEmergencyContactNotifications: retry attempt " + i14 + " scheduled to fire in " + jA + " milliseconds");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llq0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ c(Handler handler, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : handler);
    }
}
