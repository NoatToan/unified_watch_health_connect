package ta0;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.l1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDiscoveryViewModel$startDeviceDiscovery$3", f = "DeviceDiscoveryViewModel.kt", l = {223}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f163275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f163276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f163277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l90.b f163278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f163279e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f163280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l90.b f163281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l90.h f163282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f163283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f163284e;

        public a(x xVar, l90.b bVar, l90.h hVar, Long l14, o53.b0 b0Var) {
            this.f163280a = xVar;
            this.f163281b = bVar;
            this.f163282c = hVar;
            this.f163283d = l14;
            this.f163284e = b0Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            List list = (List) obj;
            x xVar = this.f163280a;
            k90.k kVar = xVar.f163460d;
            kVar.getClass();
            l90.b bVar = this.f163281b;
            bVar.getClass();
            list.getClass();
            l90.h hVar = this.f163282c;
            hVar.getClass();
            Object objCollect = r53.s.e(r53.s.i(new k90.l(hVar, kVar, list, this.f163283d, bVar, null)), Integer.MAX_VALUE, q53.a.SUSPEND).collect(new d0(this.f163284e, xVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<List<? extends l90.b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f163285a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f163286a;

            /* JADX INFO: renamed from: ta0.e0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDiscoveryViewModel$startDeviceDiscovery$3$invokeSuspend$$inlined$mapNotNull$1$2", f = "DeviceDiscoveryViewModel.kt", l = {52}, m = "emit", v = 2)
            public static final class C3075a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f163287a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f163288b;

                public C3075a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f163287a = obj;
                    this.f163288b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f163286a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3075a c3075a;
                if (dVar instanceof C3075a) {
                    c3075a = (C3075a) dVar;
                    int i14 = c3075a.f163288b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3075a.f163288b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3075a = new C3075a(dVar);
                    }
                } else {
                    c3075a = new C3075a(dVar);
                }
                Object obj2 = c3075a.f163287a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3075a.f163288b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    Object obj3 = ((o13.q) obj).f128597a;
                    if (obj3 instanceof o13.q.b) {
                        obj3 = null;
                    }
                    if (obj3 != null) {
                        c3075a.f163288b = 1;
                        if (this.f163286a.emit(obj3, c3075a) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(r53.i iVar) {
            this.f163285a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super List<? extends l90.b>> jVar, t13.d dVar) {
            Object objCollect = this.f163285a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(x xVar, l90.b bVar, Long l14, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f163277c = xVar;
        this.f163278d = bVar;
        this.f163279e = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f163277c, this.f163278d, this.f163279e, dVar);
        e0Var.f163276b = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f163276b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f163275a;
        if (i14 == 0) {
            o13.r.b(obj);
            x xVar = this.f163277c;
            c22.k kVar = xVar.f163461e;
            c22.k kVar2 = xVar.f163461e;
            long j8 = 1000;
            long jD = kVar.d("garmin_first_phase_scan_for_devices_time") * j8;
            long jD2 = kVar2.d("garmin_second_phase_scan_for_devices_time") * j8;
            long jD3 = kVar2.d("garmin_third_phase_scan_for_devices_time") * j8;
            if (jD <= 0) {
                jD = AbstractComponentTracker.LINGERING_TIMEOUT;
            }
            long j14 = jD;
            if (jD2 <= 0) {
                jD2 = 5000;
            }
            l90.h hVar = new l90.h(j14, jD2, jD3 > 0 ? jD3 : 5000L);
            b bVar = new b(new l1(xVar.f163469m));
            a aVar2 = new a(this.f163277c, this.f163278d, hVar, this.f163279e, b0Var);
            this.f163276b = null;
            this.f163275a = 1;
            if (bVar.collect(aVar2, this) == aVar) {
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
