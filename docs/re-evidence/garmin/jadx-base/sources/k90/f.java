package k90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements r53.i<l90.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f103470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f103471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f103472c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f103473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f103474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f103475c;

        /* JADX INFO: renamed from: k90.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceDiscoveryUseCase$startDeviceScanning$$inlined$mapNotNull$1$2", f = "BleDeviceDiscoveryUseCase.kt", l = {56, 75}, m = "emit", v = 2)
        public static final class C1985a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f103476a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f103477b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public r53.j f103479d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public dk2.d f103480e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f103481f;

            public C1985a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f103476a = obj;
                this.f103477b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, d dVar, List list) {
            this.f103473a = jVar;
            this.f103474b = dVar;
            this.f103475c = list;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
        
            if (r11.emit(r10, r2) == r3) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) throws Throwable {
            C1985a c1985a;
            r53.j jVar;
            int i14;
            Object c2132a;
            dk2.d dVar2;
            r53.j jVar2;
            r53.j jVar3;
            if (dVar instanceof C1985a) {
                c1985a = (C1985a) dVar;
                int i15 = c1985a.f103477b;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    c1985a.f103477b = i15 - Integer.MIN_VALUE;
                } else {
                    c1985a = new C1985a(dVar);
                }
            } else {
                c1985a = new C1985a(dVar);
            }
            Object obj2 = c1985a.f103476a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = c1985a.f103477b;
            d dVar3 = this.f103474b;
            if (i16 != 0) {
                if (i16 == 1) {
                    i14 = c1985a.f103481f;
                    dk2.d dVar4 = c1985a.f103480e;
                    r53.j jVar4 = c1985a.f103479d;
                    o13.r.b(obj2);
                    dVar2 = dVar4;
                    jVar2 = jVar4;
                } else {
                    if (i16 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                jVar3 = jVar;
                return Unit.INSTANCE;
            }
            o13.r.b(obj2);
            z80.b bVar = (z80.b) obj;
            boolean z14 = bVar instanceof z80.b.a;
            jVar = this.f103473a;
            if (!z14) {
                i14 = 0;
                c2132a = l90.a.b.f111513a;
                if (c2132a != null) {
                    jVar3 = jVar;
                    c1985a.f103479d = null;
                    c1985a.f103480e = null;
                    c1985a.f103481f = i14;
                    c1985a.f103477b = 2;
                }
                jVar3 = jVar;
                return Unit.INSTANCE;
            }
            dk2.d dVar5 = ((z80.b.a) bVar).f202977a;
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "DeviceDiscoveryUseCase", "Device found, fetching device info for: " + dVar5);
            d0 d0Var = dVar3.f103444b;
            c1985a.f103479d = jVar;
            c1985a.f103480e = dVar5;
            c1985a.f103481f = 0;
            c1985a.f103477b = 1;
            Object objB = d0Var.b(dVar5, this.f103475c, c1985a);
            if (objB != aVar) {
                dVar2 = dVar5;
                obj2 = objB;
                i14 = 0;
                jVar2 = jVar;
            }
            return aVar;
            l90.b bVar2 = (l90.b) obj2;
            if (bVar2 != null) {
                a2 a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeviceDiscoveryUseCase", "Device info retrieved: " + bVar2);
                boolean zIsEmpty = dVar3.f103446d.isEmpty();
                dVar3.f103446d.put(dVar2.f60238b, new o13.p<>(dVar2, bVar2));
                if (zIsEmpty) {
                    i2.a.b(a2Var, "DeviceDiscoveryUseCase", "First device found, navigating to confirm device screen");
                    c2132a = new l90.a.C2132a(bVar2, dVar2, null, 4, null);
                } else {
                    c2132a = null;
                }
            } else {
                c2132a = null;
            }
            jVar3 = jVar2;
            if (c2132a != null) {
                jVar3 = jVar;
                c1985a.f103479d = null;
                c1985a.f103480e = null;
                c1985a.f103481f = i14;
                c1985a.f103477b = 2;
            }
            jVar3 = jVar;
            return Unit.INSTANCE;
        }
    }

    public f(r53.i iVar, d dVar, List list) {
        this.f103470a = iVar;
        this.f103471b = dVar;
        this.f103472c = list;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super l90.a> jVar, t13.d dVar) {
        Object objCollect = this.f103470a.collect(new a(jVar, this.f103471b, this.f103472c), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
