package ta0;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;
import r53.l1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDiscoveryViewModel$startDeviceDiscovery$1", f = "DeviceDiscoveryViewModel.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f163250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f163251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f163252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l90.d f163253d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f163254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l90.d f163255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f163256c;

        public a(x xVar, l90.d dVar, o53.b0 b0Var) {
            this.f163254a = xVar;
            this.f163255b = dVar;
            this.f163256c = b0Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            List list = (List) obj;
            x xVar = this.f163254a;
            k90.d dVar2 = xVar.f163459c;
            dVar2.getClass();
            list.getClass();
            dVar2.f103446d.clear();
            a2 a2Var = a2.DEVICE_SETUP;
            StringBuilder sb3 = new StringBuilder("Starting device scan with filter: ");
            l90.d dVar3 = this.f163255b;
            sb3.append(dVar3);
            String string = sb3.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceDiscoveryUseCase", string);
            Object objCollect = r53.s.E(new k90.f(new k90.e(dVar2.f103443a.a(300000L), dVar2, dVar3), dVar2, list), new c2(new k90.g(dVar2, null))).collect(new b0(this.f163256c, xVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<List<? extends l90.b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f163257a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f163258a;

            /* JADX INFO: renamed from: ta0.c0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDiscoveryViewModel$startDeviceDiscovery$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "DeviceDiscoveryViewModel.kt", l = {52}, m = "emit", v = 2)
            public static final class C3074a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f163259a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f163260b;

                public C3074a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f163259a = obj;
                    this.f163260b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f163258a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3074a c3074a;
                if (dVar instanceof C3074a) {
                    c3074a = (C3074a) dVar;
                    int i14 = c3074a.f163260b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3074a.f163260b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3074a = new C3074a(dVar);
                    }
                } else {
                    c3074a = new C3074a(dVar);
                }
                Object obj2 = c3074a.f163259a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3074a.f163260b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    Object obj3 = ((o13.q) obj).f128597a;
                    if (obj3 instanceof o13.q.b) {
                        obj3 = null;
                    }
                    if (obj3 != null) {
                        c3074a.f163260b = 1;
                        if (this.f163258a.emit(obj3, c3074a) == aVar) {
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
            this.f163257a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super List<? extends l90.b>> jVar, t13.d dVar) {
            Object objCollect = this.f163257a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(x xVar, l90.d dVar, t13.d<? super c0> dVar2) {
        super(2, dVar2);
        this.f163252c = xVar;
        this.f163253d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c0 c0Var = new c0(this.f163252c, this.f163253d, dVar);
        c0Var.f163251b = obj;
        return c0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f163251b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f163250a;
        if (i14 == 0) {
            o13.r.b(obj);
            x xVar = this.f163252c;
            b bVar = new b(new l1(xVar.f163469m));
            a aVar2 = new a(xVar, this.f163253d, b0Var);
            this.f163251b = null;
            this.f163250a = 1;
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
