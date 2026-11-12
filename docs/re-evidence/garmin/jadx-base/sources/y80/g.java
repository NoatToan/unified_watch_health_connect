package y80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.device.setup.data.model.ScanFailedApplicationRegistrationException;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lz80/b;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.BleDeviceScanRepositoryImpl$startDeviceScan$1", f = "BleDeviceScanRepositoryImpl.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<q53.t<? super z80.b>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f195130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f195131d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y80/g$a", "Ldk2/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements dk2.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q53.t<z80.b> f195132a;

        /* JADX INFO: renamed from: y80.g$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3630a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f195133a;

            static {
                int[] iArr = new int[dk2.f.values().length];
                try {
                    iArr[dk2.f.DISCOVERY_TIMEOUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[dk2.f.SCAN_FAILED_APPLICATION_REGISTRATION_FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f195133a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(q53.t<? super z80.b> tVar) {
            this.f195132a = tVar;
        }

        @Override // dk2.e
        public final void a(dk2.h hVar) {
            hVar.getClass();
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDeviceScanRepository", "onDeviceFound() - device = " + hVar);
            if (hVar instanceof dk2.d) {
                this.f195132a.i(new z80.b.a((dk2.d) hVar));
            } else {
                i2.a.b(a2Var, "BleDeviceScanRepository", "onDeviceFound() - Ignoring non-BLE device: " + hVar);
            }
        }

        @Override // dk2.e
        public final void b(dk2.f fVar) {
            fVar.getClass();
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "BleDeviceScanRepository", "onDiscoveryFailed() - failure = " + fVar);
            int i14 = C3630a.f195133a[fVar.ordinal()];
            q53.t<z80.b> tVar = this.f195132a;
            if (i14 == 1) {
                q53.m.a(tVar.i(z80.b.c.f202979a));
            } else if (i14 != 2) {
                q53.m.a(tVar.i(z80.b.C3784b.f202978a));
            } else {
                tVar.q(new ScanFailedApplicationRegistrationException());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, long j8, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f195130c = fVar;
        this.f195131d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f195130c, this.f195131d, dVar);
        gVar.f195129b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super z80.b> tVar, t13.d<? super Unit> dVar) {
        return ((g) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f195129b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195128a;
        if (i14 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.DEVICE_SETUP;
            i2.a aVar2 = i2.f36769a;
            aVar2.getClass();
            i2.a.b(a2Var, "BleDeviceScanRepository", "Stopping previous device scan if any");
            f fVar = this.f195130c;
            fVar.getClass();
            o13.t tVar2 = fVar.f195118b;
            aVar2.getClass();
            i2.a.b(a2Var, "BleDeviceScanRepository", "stopDeviceScan() - Stopping device scan");
            ((dk2.g) tVar2.getValue()).b();
            StringBuilder sb3 = new StringBuilder("startDeviceScan() - scanTimeoutMillis = ");
            long j8 = this.f195131d;
            sb3.append(j8);
            i2.a.b(a2Var, "BleDeviceScanRepository", sb3.toString());
            ((dk2.g) tVar2.getValue()).a(lv.e.a(), new a(tVar), (int) (j8 / ((long) 1000)), fVar.f195117a);
            xr.a aVar3 = new xr.a(10, tVar, fVar);
            this.f195129b = null;
            this.f195128a = 1;
            if (q53.r.a(tVar, aVar3, this) == aVar) {
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
