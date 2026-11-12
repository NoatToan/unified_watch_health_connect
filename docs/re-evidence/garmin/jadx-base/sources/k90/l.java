package k90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Ll90/g;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceTypeDiscoveryUseCase$startDeviceTypeDiscovery$1", f = "BleDeviceTypeDiscoveryUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<q53.t<? super l90.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f103513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l90.h f103514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f103515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<l90.b> f103516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f103517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l90.b f103518f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceTypeDiscoveryUseCase$startDeviceTypeDiscovery$1$1", f = "BleDeviceTypeDiscoveryUseCase.kt", l = {71, 77}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f103521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f103522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ConcurrentLinkedQueue<dk2.d> f103523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap<dk2.d, Boolean> f103524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q53.t<l90.g> f103525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k f103526h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List<l90.b> f103527i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j8, AtomicBoolean atomicBoolean, ConcurrentLinkedQueue<dk2.d> concurrentLinkedQueue, ConcurrentHashMap<dk2.d, Boolean> concurrentHashMap, q53.t<? super l90.g> tVar, k kVar, List<l90.b> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f103521c = j8;
            this.f103522d = atomicBoolean;
            this.f103523e = concurrentLinkedQueue;
            this.f103524f = concurrentHashMap;
            this.f103525g = tVar;
            this.f103526h = kVar;
            this.f103527i = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f103521c, this.f103522d, this.f103523e, this.f103524f, this.f103525g, this.f103526h, this.f103527i, dVar);
            aVar.f103520b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0050  */
        /* JADX WARN: Code duplicated, block: B:23:0x0059 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x006e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x006d A[EDGE_INSN: B:25:0x006d->B:20:0x006d BREAK  A[LOOP:0: B:14:0x0048->B:26:0x0048], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x0048 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x0048 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        
            if (o53.m0.b(r3, r12) == r1) goto L20;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ConcurrentLinkedQueue<dk2.d> concurrentLinkedQueue;
            dk2.d dVarPoll;
            o53.b0 b0Var = (o53.b0) this.f103520b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f103519a;
            long j8 = this.f103521c;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                while (true) {
                    concurrentLinkedQueue = this.f103523e;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    dVarPoll = concurrentLinkedQueue.poll();
                    if (dVarPoll != null) {
                        this.f103520b = null;
                        this.f103519a = 2;
                        if (l.a(this.f103524f, this.f103525g, this.f103526h, this.f103527i, dVarPoll, this) == aVar) {
                            break;
                        }
                    }
                }
                return aVar;
            }
            o13.r.b(obj);
            this.f103520b = b0Var;
            this.f103519a = 1;
            this.f103522d.set(true);
            a2 a2Var = a2.DEVICE_SETUP;
            String strF = androidx.room.a0.f(j8, "First phase timer over after ", " ms");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceTypeDiscoveryUseCase", strF);
            while (true) {
                concurrentLinkedQueue = this.f103523e;
                if (!concurrentLinkedQueue.isEmpty()) {
                    return Unit.INSTANCE;
                }
                dVarPoll = concurrentLinkedQueue.poll();
                if (dVarPoll != null) {
                    this.f103520b = null;
                    this.f103519a = 2;
                    if (l.a(this.f103524f, this.f103525g, this.f103526h, this.f103527i, dVarPoll, this) == aVar) {
                        break;
                        break;
                    }
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceTypeDiscoveryUseCase$startDeviceTypeDiscovery$1$2", f = "BleDeviceTypeDiscoveryUseCase.kt", l = {83, 89}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f103530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f103531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ConcurrentLinkedQueue<dk2.d> f103532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap<dk2.d, Boolean> f103533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q53.t<l90.g> f103534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k f103535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List<l90.b> f103536i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j8, AtomicBoolean atomicBoolean, ConcurrentLinkedQueue<dk2.d> concurrentLinkedQueue, ConcurrentHashMap<dk2.d, Boolean> concurrentHashMap, q53.t<? super l90.g> tVar, k kVar, List<l90.b> list, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f103530c = j8;
            this.f103531d = atomicBoolean;
            this.f103532e = concurrentLinkedQueue;
            this.f103533f = concurrentHashMap;
            this.f103534g = tVar;
            this.f103535h = kVar;
            this.f103536i = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f103530c, this.f103531d, this.f103532e, this.f103533f, this.f103534g, this.f103535h, this.f103536i, dVar);
            bVar.f103529b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0050  */
        /* JADX WARN: Code duplicated, block: B:23:0x0059 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x006e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x006d A[EDGE_INSN: B:25:0x006d->B:20:0x006d BREAK  A[LOOP:0: B:14:0x0048->B:26:0x0048], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x0048 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x0048 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        
            if (o53.m0.b(r3, r12) == r1) goto L20;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ConcurrentLinkedQueue<dk2.d> concurrentLinkedQueue;
            dk2.d dVarPoll;
            o53.b0 b0Var = (o53.b0) this.f103529b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f103528a;
            long j8 = this.f103530c;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                while (true) {
                    concurrentLinkedQueue = this.f103532e;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    dVarPoll = concurrentLinkedQueue.poll();
                    if (dVarPoll != null) {
                        this.f103529b = null;
                        this.f103528a = 2;
                        if (l.a(this.f103533f, this.f103534g, this.f103535h, this.f103536i, dVarPoll, this) == aVar) {
                            break;
                        }
                    }
                }
                return aVar;
            }
            o13.r.b(obj);
            this.f103529b = b0Var;
            this.f103528a = 1;
            this.f103531d.set(true);
            a2 a2Var = a2.DEVICE_SETUP;
            String strF = androidx.room.a0.f(j8, "Second phase timer over after ", " ms");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceTypeDiscoveryUseCase", strF);
            while (true) {
                concurrentLinkedQueue = this.f103532e;
                if (!concurrentLinkedQueue.isEmpty()) {
                    return Unit.INSTANCE;
                }
                dVarPoll = concurrentLinkedQueue.poll();
                if (dVarPoll != null) {
                    this.f103529b = null;
                    this.f103528a = 2;
                    if (l.a(this.f103533f, this.f103534g, this.f103535h, this.f103536i, dVarPoll, this) == aVar) {
                        break;
                        break;
                    }
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceTypeDiscoveryUseCase$startDeviceTypeDiscovery$1$3", f = "BleDeviceTypeDiscoveryUseCase.kt", l = {95, 97}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f103539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q53.t<l90.g> f103540d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(long j8, q53.t<? super l90.g> tVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f103539c = j8;
            this.f103540d = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = new c(this.f103539c, this.f103540d, dVar);
            cVar.f103538b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r7.f103540d.h(r8, r7) == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f103538b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f103537a;
            long j8 = this.f103539c;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f103538b = b0Var;
                this.f103537a = 1;
                if (o53.m0.b(j8, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            a2 a2Var = a2.DEVICE_SETUP;
            String strF = androidx.room.a0.f(j8, "Third phase timer over after ", " ms");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceTypeDiscoveryUseCase", strF);
            l90.g.b bVar = l90.g.b.f111557a;
            this.f103538b = null;
            this.f103537a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceTypeDiscoveryUseCase$startDeviceTypeDiscovery$1$4", f = "BleDeviceTypeDiscoveryUseCase.kt", l = {116}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f103543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f103544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Long f103545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f103546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ l90.b f103547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ConcurrentLinkedQueue<dk2.d> f103548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ConcurrentLinkedQueue<dk2.d> f103549i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ q53.t<l90.g> f103550j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap<dk2.d, Boolean> f103551k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<l90.b> f103552l;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f103553a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Long f103554b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f103555c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f103556d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ k f103557e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ l90.b f103558f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ ConcurrentLinkedQueue<dk2.d> f103559g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ ConcurrentLinkedQueue<dk2.d> f103560h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ q53.t<l90.g> f103561i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ ConcurrentHashMap<dk2.d, Boolean> f103562j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ List<l90.b> f103563k;

            /* JADX WARN: Multi-variable type inference failed */
            public a(AtomicBoolean atomicBoolean, Long l14, o53.b0 b0Var, AtomicBoolean atomicBoolean2, k kVar, l90.b bVar, ConcurrentLinkedQueue<dk2.d> concurrentLinkedQueue, ConcurrentLinkedQueue<dk2.d> concurrentLinkedQueue2, q53.t<? super l90.g> tVar, ConcurrentHashMap<dk2.d, Boolean> concurrentHashMap, List<l90.b> list) {
                this.f103553a = atomicBoolean;
                this.f103554b = l14;
                this.f103555c = b0Var;
                this.f103556d = atomicBoolean2;
                this.f103557e = kVar;
                this.f103558f = bVar;
                this.f103559g = concurrentLinkedQueue;
                this.f103560h = concurrentLinkedQueue2;
                this.f103561i = tVar;
                this.f103562j = concurrentHashMap;
                this.f103563k = list;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) throws Throwable {
                Set setG1;
                Set setG2;
                String str;
                String str2;
                Set setG3;
                String str3;
                z80.b bVar = (z80.b) obj;
                if (!(bVar instanceof z80.b.a)) {
                    Object objH = this.f103561i.h(l90.g.b.f111557a, dVar);
                    return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
                }
                dk2.d dVar2 = ((z80.b.a) bVar).f202977a;
                boolean z14 = this.f103553a.get();
                Long l14 = this.f103554b;
                if (z14) {
                    if (l14 != null) {
                        Long l15 = dVar2.f60243g;
                        long jLongValue = l14.longValue();
                        if (l15 == null || l15.longValue() != jLongValue) {
                            i2.f36769a.getClass();
                            i2.a.b(a2.DEVICE_SETUP, "DeviceTypeDiscoveryUseCase", "Device filtered out by antId: " + dVar2);
                            return Unit.INSTANCE;
                        }
                    }
                    Object objA = l.a(this.f103562j, this.f103561i, this.f103557e, this.f103563k, dVar2, dVar);
                    return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
                }
                boolean z15 = this.f103556d.get();
                ConcurrentLinkedQueue<dk2.d> concurrentLinkedQueue = this.f103559g;
                l90.b bVar2 = this.f103558f;
                k kVar = this.f103557e;
                if (z15) {
                    if (l14 != null) {
                        Long l16 = dVar2.f60243g;
                        long jLongValue2 = l14.longValue();
                        if (l16 == null || l16.longValue() != jLongValue2) {
                            i2.f36769a.getClass();
                            i2.a.b(a2.DEVICE_SETUP, "DeviceTypeDiscoveryUseCase", "Device filtered out by antId: " + dVar2);
                            return Unit.INSTANCE;
                        }
                    }
                    int i14 = k.f103507d;
                    kVar.getClass();
                    yl2.b bVar3 = bVar2.f111530o;
                    if (bVar3 == null || (str3 = bVar3.f197832a) == null || (setG3 = p13.h0.g1(d53.w.W(str3, new String[]{","}))) == null) {
                        setG3 = p13.l0.f134950a;
                    }
                    if (setG3.contains(dVar2.f60239c)) {
                        Object objA2 = l.a(this.f103562j, this.f103561i, this.f103557e, this.f103563k, dVar2, dVar);
                        return objA2 == u13.a.COROUTINE_SUSPENDED ? objA2 : Unit.INSTANCE;
                    }
                    concurrentLinkedQueue.add(dVar2);
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "DeviceTypeDiscoveryUseCase", "Buffered device during second phase: " + dVar2);
                } else {
                    if (l14 != null) {
                        Long l17 = dVar2.f60243g;
                        long jLongValue3 = l14.longValue();
                        if (l17 == null || l17.longValue() != jLongValue3) {
                            i2.f36769a.getClass();
                            i2.a.b(a2.DEVICE_SETUP, "DeviceTypeDiscoveryUseCase", "Device filtered out by antId: " + dVar2);
                            return Unit.INSTANCE;
                        }
                    }
                    int i15 = k.f103507d;
                    kVar.getClass();
                    yl2.b bVar4 = bVar2.f111530o;
                    if (bVar4 == null || (str2 = bVar4.f197832a) == null || (setG1 = p13.h0.g1(d53.w.W(str2, new String[]{","}))) == null) {
                        setG1 = p13.l0.f134950a;
                    }
                    if (setG1.contains(dVar2.f60239c) && dVar2.f()) {
                        Object objA3 = l.a(this.f103562j, this.f103561i, this.f103557e, this.f103563k, dVar2, dVar);
                        return objA3 == u13.a.COROUTINE_SUSPENDED ? objA3 : Unit.INSTANCE;
                    }
                    yl2.b bVar5 = bVar2.f111530o;
                    if (bVar5 == null || (str = bVar5.f197832a) == null || (setG2 = p13.h0.g1(d53.w.W(str, new String[]{","}))) == null) {
                        setG2 = p13.l0.f134950a;
                    }
                    if (setG2.contains(dVar2.f60239c)) {
                        this.f103560h.add(dVar2);
                        i2.f36769a.getClass();
                        i2.a.b(a2.DEVICE_SETUP, "DeviceTypeDiscoveryUseCase", "Buffered device to second phase: " + dVar2);
                    } else {
                        concurrentLinkedQueue.add(dVar2);
                        i2.f36769a.getClass();
                        i2.a.b(a2.DEVICE_SETUP, "DeviceTypeDiscoveryUseCase", "Buffered device to third phase: " + dVar2);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<z80.b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f103564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f103565b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f103566c;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f103567a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f103568b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ o53.b0 f103569c;

                /* JADX INFO: renamed from: k90.l$d$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceTypeDiscoveryUseCase$startDeviceTypeDiscovery$1$4$invokeSuspend$$inlined$filter$1$2", f = "BleDeviceTypeDiscoveryUseCase.kt", l = {53, 50}, m = "emit", v = 2)
                public static final class C1986a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f103570a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f103571b;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public Object f103573d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public r53.j f103574e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public z80.b.a f103575f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public int f103576g;

                    public C1986a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f103570a = obj;
                        this.f103571b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, k kVar, o53.b0 b0Var) {
                    this.f103567a = jVar;
                    this.f103568b = kVar;
                    this.f103569c = b0Var;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x0093  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
                
                    if (r6.emit(r11, r0) == r1) goto L29;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // r53.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, t13.d dVar) {
                    C1986a c1986a;
                    Object obj2;
                    int i14;
                    r53.j jVar;
                    r53.j jVar2;
                    r53.j jVar3;
                    if (dVar instanceof C1986a) {
                        c1986a = (C1986a) dVar;
                        int i15 = c1986a.f103571b;
                        if ((i15 & Integer.MIN_VALUE) != 0) {
                            c1986a.f103571b = i15 - Integer.MIN_VALUE;
                        } else {
                            c1986a = new C1986a(dVar);
                        }
                    } else {
                        c1986a = new C1986a(dVar);
                    }
                    Object objA = c1986a.f103570a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i16 = c1986a.f103571b;
                    boolean z14 = true;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            int i17 = c1986a.f103576g;
                            obj2 = c1986a.f103575f;
                            r53.j jVar4 = c1986a.f103574e;
                            Object obj3 = c1986a.f103573d;
                            o13.r.b(objA);
                            i14 = i17;
                            obj = obj3;
                            jVar2 = jVar4;
                        } else {
                            if (i16 != 2) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            o13.r.b(objA);
                        }
                        return Unit.INSTANCE;
                    }
                    o13.r.b(objA);
                    obj2 = (z80.b) obj;
                    boolean z15 = obj2 instanceof z80.b.a;
                    i14 = 0;
                    jVar = this.f103567a;
                    if (!z15) {
                        if (z14) {
                            c1986a.f103573d = null;
                            c1986a.f103574e = null;
                            c1986a.f103575f = null;
                            c1986a.f103576g = i14;
                            c1986a.f103571b = 2;
                        }
                        return Unit.INSTANCE;
                    }
                    h hVar = this.f103568b.f103510c;
                    z80.b.a aVar2 = (z80.b.a) obj2;
                    dk2.d dVar2 = aVar2.f202977a;
                    c1986a.f103573d = obj;
                    c1986a.f103574e = jVar;
                    c1986a.f103575f = aVar2;
                    c1986a.f103576g = 0;
                    c1986a.f103571b = 1;
                    objA = hVar.a(dVar2, c1986a);
                    if (objA != aVar) {
                        jVar3 = jVar;
                        jVar2 = jVar;
                    }
                    jVar3 = jVar;
                    return aVar;
                    boolean zBooleanValue = ((Boolean) objA).booleanValue();
                    if (!zBooleanValue) {
                        a2 a2Var = a2.DEVICE_SETUP;
                        String str = "Device filtered out during scanning " + ((z80.b.a) obj2).f202977a;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "DeviceTypeDiscoveryUseCase", str);
                    }
                    jVar3 = jVar2;
                    z14 = zBooleanValue;
                    if (z14) {
                        c1986a.f103573d = null;
                        c1986a.f103574e = null;
                        c1986a.f103575f = null;
                        c1986a.f103576g = i14;
                        c1986a.f103571b = 2;
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(r53.i iVar, k kVar, o53.b0 b0Var) {
                this.f103564a = iVar;
                this.f103565b = kVar;
                this.f103566c = b0Var;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super z80.b> jVar, t13.d dVar) {
                Object objCollect = this.f103564a.collect(new a(jVar, this.f103565b, this.f103566c), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(k kVar, AtomicBoolean atomicBoolean, Long l14, AtomicBoolean atomicBoolean2, l90.b bVar, ConcurrentLinkedQueue<dk2.d> concurrentLinkedQueue, ConcurrentLinkedQueue<dk2.d> concurrentLinkedQueue2, q53.t<? super l90.g> tVar, ConcurrentHashMap<dk2.d, Boolean> concurrentHashMap, List<l90.b> list, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f103543c = kVar;
            this.f103544d = atomicBoolean;
            this.f103545e = l14;
            this.f103546f = atomicBoolean2;
            this.f103547g = bVar;
            this.f103548h = concurrentLinkedQueue;
            this.f103549i = concurrentLinkedQueue2;
            this.f103550j = tVar;
            this.f103551k = concurrentHashMap;
            this.f103552l = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f103543c, this.f103544d, this.f103545e, this.f103546f, this.f103547g, this.f103548h, this.f103549i, this.f103550j, this.f103551k, this.f103552l, dVar);
            dVar2.f103542b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f103542b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f103541a;
            if (i14 == 0) {
                o13.r.b(obj);
                k kVar = this.f103543c;
                b bVar = new b(kVar.f103508a.a(3600000L), kVar, b0Var);
                a aVar2 = new a(this.f103544d, this.f103545e, b0Var, this.f103546f, this.f103543c, this.f103547g, this.f103548h, this.f103549i, this.f103550j, this.f103551k, this.f103552l);
                this.f103542b = null;
                this.f103541a = 1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l90.h hVar, k kVar, List<l90.b> list, Long l14, l90.b bVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f103514b = hVar;
        this.f103515c = kVar;
        this.f103516d = list;
        this.f103517e = l14;
        this.f103518f = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        if (r1.h(r5, r3) == r4) goto L30;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00b7, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ConcurrentHashMap concurrentHashMap, q53.t tVar, k kVar, List list, dk2.d dVar, t13.d dVar2) throws Throwable {
        m mVar;
        q53.t tVar2;
        dk2.d dVar3;
        l90.b bVar;
        if (dVar2 instanceof m) {
            mVar = (m) dVar2;
            int i14 = mVar.f103584d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f103584d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar2);
            }
        } else {
            mVar = new m(dVar2);
        }
        Object obj = mVar.f103583c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f103584d;
        if (i15 != 0) {
            if (i15 == 1) {
                dVar3 = mVar.f103582b;
                tVar2 = mVar.f103581a;
                o13.r.b(obj);
                bVar = (l90.b) obj;
                if (bVar != null) {
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "DeviceTypeDiscoveryUseCase", "Sending device found: " + dVar3 + " with device info: " + bVar);
                    l90.g.a aVar2 = new l90.g.a(dVar3, bVar, null, 4, null);
                    mVar.f103581a = null;
                    mVar.f103582b = null;
                    mVar.f103584d = 2;
                }
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        Boolean bool = (Boolean) concurrentHashMap.get(dVar);
        if (bool == null || !bool.equals(Boolean.valueOf(dVar.f()))) {
            concurrentHashMap.put(dVar, Boolean.valueOf(dVar.f()));
            a2 a2Var = a2.DEVICE_SETUP;
            String str = "New device found readyToPair[" + dVar.f() + "]: " + dVar;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceTypeDiscoveryUseCase", str);
            d0 d0Var = kVar.f103509b;
            mVar.f103581a = tVar;
            mVar.f103582b = dVar;
            mVar.f103584d = 1;
            Object objB = d0Var.b(dVar, list, mVar);
            if (objB != aVar) {
                tVar2 = tVar;
                obj = objB;
                dVar3 = dVar;
                bVar = (l90.b) obj;
                if (bVar != null) {
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "DeviceTypeDiscoveryUseCase", "Sending device found: " + dVar3 + " with device info: " + bVar);
                    l90.g.a aVar3 = new l90.g.a(dVar3, bVar, null, 4, null);
                    mVar.f103581a = null;
                    mVar.f103582b = null;
                    mVar.f103584d = 2;
                }
            }
            return aVar;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "DeviceTypeDiscoveryUseCase", "Device already found with same state, skipping " + dVar);
        return Unit.INSTANCE;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f103514b, this.f103515c, this.f103516d, this.f103517e, this.f103518f, dVar);
        lVar.f103513a = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super l90.g> tVar, t13.d<? super Unit> dVar) {
        return ((l) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f103513a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l90.h hVar = this.f103514b;
        long j8 = hVar.f111558a;
        long j14 = j8 + hVar.f111559b;
        long j15 = j14 + hVar.f111560c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        ConcurrentLinkedQueue concurrentLinkedQueue2 = new ConcurrentLinkedQueue();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ge1.b.T(tVar, null, null, new a(j8, atomicBoolean, concurrentLinkedQueue, concurrentHashMap, tVar, this.f103515c, this.f103516d, null), 3);
        ge1.b.T(tVar, null, null, new b(j14, atomicBoolean2, concurrentLinkedQueue2, concurrentHashMap, tVar, this.f103515c, this.f103516d, null), 3);
        ge1.b.T(tVar, null, null, new c(j15, tVar, null), 3);
        ge1.b.T(tVar, null, null, new d(this.f103515c, atomicBoolean2, this.f103517e, atomicBoolean, this.f103518f, concurrentLinkedQueue2, concurrentLinkedQueue, tVar, concurrentHashMap, this.f103516d, null), 3);
        return Unit.INSTANCE;
    }
}
