package k90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements r53.i<z80.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f103450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f103451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l90.d f103452c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f103453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f103454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l90.d f103455c;

        /* JADX INFO: renamed from: k90.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceDiscoveryUseCase$startDeviceScanning$$inlined$filter$1$2", f = "BleDeviceDiscoveryUseCase.kt", l = {53, 50}, m = "emit", v = 2)
        public static final class C1984a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f103456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f103457b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f103459d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public r53.j f103460e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public z80.b.a f103461f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f103462g;

            public C1984a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f103456a = obj;
                this.f103457b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, d dVar, l90.d dVar2) {
            this.f103453a = jVar;
            this.f103454b = dVar;
            this.f103455c = dVar2;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0091  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
        
            if (r6.emit(r11, r0) == r1) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) {
            C1984a c1984a;
            Object obj2;
            int i14;
            r53.j jVar;
            r53.j jVar2;
            r53.j jVar3;
            if (dVar instanceof C1984a) {
                c1984a = (C1984a) dVar;
                int i15 = c1984a.f103457b;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    c1984a.f103457b = i15 - Integer.MIN_VALUE;
                } else {
                    c1984a = new C1984a(dVar);
                }
            } else {
                c1984a = new C1984a(dVar);
            }
            Object objA = c1984a.f103456a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = c1984a.f103457b;
            boolean z14 = true;
            if (i16 != 0) {
                if (i16 == 1) {
                    int i17 = c1984a.f103462g;
                    obj2 = c1984a.f103461f;
                    r53.j jVar4 = c1984a.f103460e;
                    Object obj3 = c1984a.f103459d;
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
            jVar = this.f103453a;
            if (!z15) {
                if (z14) {
                    c1984a.f103459d = null;
                    c1984a.f103460e = null;
                    c1984a.f103461f = null;
                    c1984a.f103462g = i14;
                    c1984a.f103457b = 2;
                }
                return Unit.INSTANCE;
            }
            k90.a aVar2 = this.f103454b.f103445c;
            z80.b.a aVar3 = (z80.b.a) obj2;
            dk2.d dVar2 = aVar3.f202977a;
            c1984a.f103459d = obj;
            c1984a.f103460e = jVar;
            c1984a.f103461f = aVar3;
            c1984a.f103462g = 0;
            c1984a.f103457b = 1;
            objA = aVar2.a(dVar2, this.f103455c, c1984a);
            if (objA != aVar) {
                jVar3 = jVar;
                jVar2 = jVar;
            }
            jVar3 = jVar;
            return aVar;
            boolean zBooleanValue = ((Boolean) objA).booleanValue();
            if (!zBooleanValue) {
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "DeviceDiscoveryUseCase", "Device found but filtered out: " + obj2);
            }
            jVar3 = jVar2;
            z14 = zBooleanValue;
            if (z14) {
                c1984a.f103459d = null;
                c1984a.f103460e = null;
                c1984a.f103461f = null;
                c1984a.f103462g = i14;
                c1984a.f103457b = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public e(r53.i iVar, d dVar, l90.d dVar2) {
        this.f103450a = iVar;
        this.f103451b = dVar;
        this.f103452c = dVar2;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super z80.b> jVar, t13.d dVar) {
        Object objCollect = this.f103450a.collect(new a(jVar, this.f103451b, this.f103452c), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
