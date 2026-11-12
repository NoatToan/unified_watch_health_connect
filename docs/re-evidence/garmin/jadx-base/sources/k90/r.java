package k90;

import android.bluetooth.BluetoothDevice;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements r53.i<z80.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f103594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f103595b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f103596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f103597b;

        /* JADX INFO: renamed from: k90.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BtcDeviceDiscoveryUseCase$startDeviceDiscovery$$inlined$filter$1$2", f = "BtcDeviceDiscoveryUseCase.kt", l = {53, 50}, m = "emit", v = 2)
        public static final class C1987a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f103598a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f103599b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f103601d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public r53.j f103602e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public z80.c.a f103603f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f103604g;

            public C1987a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f103598a = obj;
                this.f103599b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, q qVar) {
            this.f103596a = jVar;
            this.f103597b = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
        
            if (r6.emit(r12, r0) == r1) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) {
            C1987a c1987a;
            Object obj2;
            int i14;
            r53.j jVar;
            r53.j jVar2;
            r53.j jVar3;
            if (dVar instanceof C1987a) {
                c1987a = (C1987a) dVar;
                int i15 = c1987a.f103599b;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    c1987a.f103599b = i15 - Integer.MIN_VALUE;
                } else {
                    c1987a = new C1987a(dVar);
                }
            } else {
                c1987a = new C1987a(dVar);
            }
            Object objA = c1987a.f103598a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = c1987a.f103599b;
            boolean z14 = true;
            if (i16 != 0) {
                if (i16 == 1) {
                    int i17 = c1987a.f103604g;
                    obj2 = c1987a.f103603f;
                    r53.j jVar4 = c1987a.f103602e;
                    Object obj3 = c1987a.f103601d;
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
            obj2 = (z80.c) obj;
            boolean z15 = obj2 instanceof z80.c.a;
            i14 = 0;
            jVar = this.f103596a;
            if (!z15) {
                if (z14) {
                    c1987a.f103601d = null;
                    c1987a.f103602e = null;
                    c1987a.f103603f = null;
                    c1987a.f103604g = i14;
                    c1987a.f103599b = 2;
                }
                return Unit.INSTANCE;
            }
            n nVar = this.f103597b.f103593b;
            z80.c.a aVar2 = (z80.c.a) obj2;
            BluetoothDevice bluetoothDevice = aVar2.f202980a;
            c1987a.f103601d = obj;
            c1987a.f103602e = jVar;
            c1987a.f103603f = aVar2;
            c1987a.f103604g = 0;
            c1987a.f103599b = 1;
            objA = nVar.a(bluetoothDevice, c1987a);
            if (objA != aVar) {
                jVar3 = jVar;
                jVar2 = jVar;
            }
            jVar3 = jVar;
            return aVar;
            boolean zBooleanValue = ((Boolean) objA).booleanValue();
            if (zBooleanValue) {
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "BtcDeviceDiscoveryUseCase", "Valid BTC device found: " + obj2);
            } else {
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "BtcDeviceDiscoveryUseCase", "BTC Device found but filtered out: " + obj2);
            }
            jVar3 = jVar2;
            z14 = zBooleanValue;
            if (z14) {
                c1987a.f103601d = null;
                c1987a.f103602e = null;
                c1987a.f103603f = null;
                c1987a.f103604g = i14;
                c1987a.f103599b = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public r(r53.i iVar, q qVar) {
        this.f103594a = iVar;
        this.f103595b = qVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super z80.c> jVar, t13.d dVar) {
        Object objCollect = this.f103594a.collect(new a(jVar, this.f103595b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
