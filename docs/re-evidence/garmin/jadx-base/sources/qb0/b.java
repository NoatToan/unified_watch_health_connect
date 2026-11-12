package qb0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.e1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import o53.b0;
import o53.c2;
import ok2.g0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lqb0/b;", "Landroidx/lifecycle/u1;", "Lyr1/r;", "Lq90/c;", "pairedDevice", "Ll80/b;", "gdiDelegate", "Llc0/f;", "getBluetoothStateUseCase", "Ly90/h;", "triggerDeviceSetupSyncUseCase", "Llc0/a;", "checkDeviceFirmwareUpdateUseCase", "Ly90/g;", "skipUserInitiatedFailedSyncUseCase", "Llc0/g;", "initiateDeviceSoftwareUpdateUseCase", "Ly90/b;", "deviceSetupFirmwareUpdateRequiredUseCase", "<init>", "(Lq90/c;Ll80/b;Llc0/f;Ly90/h;Llc0/a;Ly90/g;Llc0/g;Ly90/b;)V", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 implements yr1.r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f143957q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q90.c f143958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.b f143959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lc0.f f143960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y90.h f143961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lc0.a f143962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y90.g f143963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lc0.g f143964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y90.b f143965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f143966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f143967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f143968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f143969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d90.f f143970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o13.t f143971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c2 f143972o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f143973p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.sync.DeviceSetupSyncViewModel$1", f = "DeviceSetupSyncViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143974a;

        /* JADX INFO: renamed from: qb0.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2717a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f143976a;

            public C2717a(b bVar) {
                this.f143976a = bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Object value;
                z90.b bVar;
                int i14;
                if (!((Boolean) obj).booleanValue()) {
                    b bVar2 = this.f143976a;
                    p2 p2Var = bVar2.f143966i;
                    do {
                        value = p2Var.getValue();
                        bVar = z90.b.NO_BLUETOOTH;
                        i14 = bVar2.f143973p + 1;
                        bVar2.f143973p = i14;
                    } while (!p2Var.b(value, new sb0.b(false, 0.0f, false, bVar, i14, 7, null)));
                }
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143974a;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = b.this;
                r53.b bVarA = bVar.f143960c.a();
                C2717a c2717a = new C2717a(bVar);
                this.f143974a = 1;
                if (bVarA.collect(c2717a, this) == aVar) {
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

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f143978b;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.USER_INITIATED_HIGHEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.USER_INITIATED_PREFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.USER_INITIATED_GENERAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g0.IMMEDIATE_MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g0.AUTOMATIC_PREFERRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f143977a = iArr;
            int[] iArr2 = new int[ok2.e.values().length];
            try {
                iArr2[ok2.e.f132643k.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            f143978b = iArr2;
        }
    }

    static {
        new C2718b(null);
    }

    public b(q90.c cVar, l80.b bVar, lc0.f fVar, y90.h hVar, lc0.a aVar, y90.g gVar, lc0.g gVar2, y90.b bVar2) {
        cVar.getClass();
        bVar.getClass();
        fVar.getClass();
        hVar.getClass();
        aVar.getClass();
        gVar.getClass();
        gVar2.getClass();
        bVar2.getClass();
        this.f143958a = cVar;
        this.f143959b = bVar;
        this.f143960c = fVar;
        this.f143961d = hVar;
        this.f143962e = aVar;
        this.f143963f = gVar;
        this.f143964g = gVar2;
        this.f143965h = bVar2;
        p2 p2VarA = q2.a(new sb0.b(false, 0.0f, false, null, 0, 31, null));
        this.f143966i = p2VarA;
        this.f143967j = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f143968k = p2VarA2;
        this.f143969l = p2VarA2;
        d90.f fVar2 = cVar.f143495c.f111531p.f58441g;
        this.f143970m = fVar2;
        this.f143971n = o13.m.b(new q42.d(this, 3));
        if ((fVar2 instanceof d90.f.e) || (fVar2 instanceof d90.f.C1248f) || (fVar2 instanceof d90.f.d)) {
            dv.a.a().f61318a = false;
            bVar.j();
        } else {
            bVar.r();
        }
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    @Override // yr1.r
    public final void B1(al2.c cVar) {
        p2 p2Var;
        Object value;
        a2 a2Var = a2.DEVICE_SETUP;
        String strE = org.apache.commons.lang3.e.e(cVar.f3775a.getF92746j(), "Sync started for device unit id: ");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceSetupSyncViewModel", strE);
        c2 c2Var = this.f143972o;
        if (c2Var != null) {
            c2Var.c(null);
        }
        do {
            p2Var = this.f143966i;
            value = p2Var.getValue();
        } while (!p2Var.b(value, sb0.b.a((sb0.b) value, 0.0f, false, 30)));
    }

    @Override // yr1.r
    public final void F1(al2.a aVar, boolean z14) {
        p2 p2Var;
        Object value;
        a2 a2Var = a2.DEVICE_SETUP;
        String str = "Sync progress for device unit id: " + aVar.f3759a.getF92746j() + ", percent: " + aVar.a() + ", firmwareUpdateStarted: " + z14;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceSetupSyncViewModel", str);
        c2 c2Var = this.f143972o;
        if (c2Var != null) {
            c2Var.c(null);
        }
        do {
            p2Var = this.f143966i;
            value = p2Var.getValue();
        } while (!p2Var.b(value, sb0.b.a((sb0.b) value, aVar.a(), z14, 25)));
    }

    @Override // yr1.r
    public final void g5(al2.c cVar, boolean z14) {
        z90.b bVar;
        Object value;
        int i14;
        Object value2;
        Object value3;
        a2 a2Var = a2.DEVICE_SETUP;
        rs2.c cVar2 = cVar.f3775a;
        long f92746j = cVar2.getF92746j();
        g0 g0Var = cVar.f3776b;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceSetupSyncViewModel", "Sync finished for device unit id: " + f92746j + ", successful: " + z14 + " transferType: " + g0Var);
        c2 c2Var = this.f143972o;
        if (c2Var != null) {
            c2Var.c(null);
        }
        int i15 = c.f143977a[g0Var.ordinal()];
        if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 4 && i15 != 5) {
            i2.a.b(a2Var, "DeviceSetupSyncViewModel", "Ignore " + g0Var + " sync finish callback and wait for USER_INITIATED sync callback");
            return;
        }
        x4().e();
        p2 p2Var = this.f143966i;
        if (z14) {
            if (this.f143970m instanceof d90.f.C1248f) {
                i2.a.b(a2Var, "DeviceSetupSyncViewModel", "Sync successful for Sync 2.0 with firmware update, initiate remote device firmware update");
                this.f143964g.a(this.f143958a.f143494b);
            }
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, new sb0.b(false, 100.0f, false, z90.b.SUCCESS, 0, 21, null)));
            return;
        }
        if (yr1.e.d(cVar2.getF92741e())) {
            String f92741e = cVar2.getF92741e();
            this.f143963f.getClass();
            if (y90.g.a(f92741e, cVar)) {
                i2.a.b(a2Var, "DeviceSetupSyncViewModel", "Skip sync errors for Sync 2.0 and proceed to next step");
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, new sb0.b(false, 0.0f, false, z90.b.SUCCESS, 0, 23, null)));
                return;
            }
        }
        CoreTransferException coreTransferException = cVar.f3778d;
        ok2.e failure = coreTransferException != null ? coreTransferException.getFailure() : null;
        i2.a.b(a2Var, "DeviceSetupSyncViewModel", "Sync failed for device unit id: " + cVar2.getF92746j() + ", transfer failure: " + failure);
        if ((failure == null ? -1 : c.f143978b[failure.ordinal()]) == 1) {
            bVar = z90.b.NO_NETWORK;
        } else if (e1.a()) {
            boolean z15 = false;
            if (failure != null) {
                if (failure.f132657a == ok2.e.a.SERVER) {
                    z15 = true;
                }
            }
            bVar = z15 ? z90.b.SERVER_ERROR : z90.b.GENERIC_ERROR;
        } else {
            bVar = z90.b.NO_BLUETOOTH;
        }
        z90.b bVar2 = bVar;
        do {
            value = p2Var.getValue();
            i14 = this.f143973p + 1;
            this.f143973p = i14;
        } while (!p2Var.b(value, new sb0.b(false, 0.0f, false, bVar2, i14, 7, null)));
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        x4().e();
        this.f143959b.j();
    }

    public final yr1.q x4() {
        return (yr1.q) this.f143971n.getValue();
    }

    /* JADX INFO: renamed from: qb0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqb0/b$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SYNC_TIMEOUT", "J", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2718b {
        public /* synthetic */ C2718b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2718b() {
        }
    }
}
