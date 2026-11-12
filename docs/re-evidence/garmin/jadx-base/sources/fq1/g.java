package fq1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.u1;
import com.garmin.android.apps.connectmobile.v1;
import com.garmin.android.library.livetrack.data.LocalDatabase;
import o53.b0;
import o53.m0;
import o53.s0;
import o53.z;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.x;
import xd2.b1;
import xd2.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfq1/g;", "Lfq1/s;", "Lf12/b;", "userAccount", "<init>", "(Lf12/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f73241b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.b f73242a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.init.async.DeviceServicesAndLiveTrackInitializer", f = "DeviceServicesAndLiveTrackInitializer.kt", l = {24}, m = "execute", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f73243a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f73245c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f73243a = obj;
            this.f73245c |= Integer.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.init.async.DeviceServicesAndLiveTrackInitializer$execute$2", f = "DeviceServicesAndLiveTrackInitializer.kt", l = {29}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73246a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new c(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73246a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f73246a = 1;
                if (m0.b(500L, this) == aVar) {
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

    public g(f12.b bVar) {
        bVar.getClass();
        this.f73242a = bVar;
    }

    @Override // fq1.s
    public final z a() {
        x53.c cVar = s0.f129406a;
        return u53.o.f168762a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f73245c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f73245c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f73243a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f73245c;
        if (i15 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            c cVar2 = new c(null);
            bVar.f73245c = 1;
            if (ge1.b.e0(bVar2, cVar2, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "DeviceServicesAndLiveTrackInitializer", "Initializing device services and live track");
        f73241b.getClass();
        a.a(this.f73242a);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfq1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(f12.b bVar) {
            bVar.getClass();
            if (bVar.c()) {
                v1 v1Var = v1.f47374a;
                GarminConnectMobileApp.f28685g.getClass();
                Context contextA = GarminConnectMobileApp.a.a();
                v1Var.getClass();
                Context applicationContext = contextA.getApplicationContext();
                v1.f47377d.debug("initDeviceServices()");
                if (!v1.c(contextA) || v1.f47376c == v1.a.CONNECTED) {
                    v1.d(contextA);
                } else {
                    v1.f47375b.add(new u1(contextA, 0));
                    applicationContext.getClass();
                    v1.e(applicationContext);
                }
                wd2.l lVar = (wd2.l) KoinJavaComponent.get$default(wd2.l.class, null, null, 6, null);
                lVar.getClass();
                wd2.q qVarC = wd2.q.f184563f.c();
                synchronized (qVarC) {
                    Context applicationContext2 = lVar.getF104144a().f().getApplicationContext();
                    LocalDatabase.a aVar = LocalDatabase.f50198a;
                    applicationContext2.getClass();
                    ge1.b.T(qVarC, null, null, new x(lVar, new x0(aVar.a(applicationContext2), b1.f190056a), qVarC, null), 3).J(new vu1.b(qVarC, 13));
                }
                nu0.d.f127896a.getClass();
                nu0.d.f127897b.debug("LivetrackLibraryHook", "observeLivetrackState");
                wd2.m.b().g(nu0.d.f127898c);
            }
        }

        private a() {
        }
    }
}
