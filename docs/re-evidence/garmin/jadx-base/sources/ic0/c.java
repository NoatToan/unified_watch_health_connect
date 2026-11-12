package ic0;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDIDeviceStatus;
import e23.p;
import i3.d6;
import java.util.LinkedHashMap;
import java.util.Map;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.u0;
import q53.t;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lic0/c;", "Lic0/a;", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lbc0/b;", "batteryStatusObserver", "Llc0/h;", "isScreenlessDeviceUseCase", "Lda2/d;", "gdi", "Lo53/z;", "ioDispatcher", "<init>", "(Lo53/b0;Lbc0/b;Llc0/h;Lda2/d;Lo53/z;)V", "c", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements ic0.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f92561g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f92562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bc0.b f92563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lc0.h f92564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final da2.d f92565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f92566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f92567f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.data.InMemoryDeviceBatteryStatusRepository$1", f = "InMemoryDeviceBatteryStatusRepository.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<t<? super Object>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f92568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92569b;

        /* JADX INFO: renamed from: ic0.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ic0/c$a$a", "Lla2/a;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1770a implements la2.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t<Object> f92571a;

            public C1770a(t<Object> tVar) {
                this.f92571a = tVar;
            }

            @Override // la2.a
            public final void onDeviceConnected(la2.b bVar) {
                this.f92571a.i(bVar);
            }

            @Override // la2.a
            public final void onDeviceConnectingFailure(la2.c cVar) {
            }

            @Override // la2.a
            public final void onDeviceDisconnected(la2.h hVar) {
                this.f92571a.i(hVar);
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = c.this.new a(dVar);
            aVar.f92569b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(t<? super Object> tVar, t13.d<? super Unit> dVar) {
            return ((a) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            t tVar = (t) this.f92569b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f92568a;
            if (i14 == 0) {
                r.b(obj);
                C1770a c1770a = new C1770a(tVar);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "DeviceBatteryStatusRepository", "Registering device connection callback");
                c cVar = c.this;
                cVar.f92565d.f58886a.b(c1770a);
                d6 d6Var = new d6(tVar, 9, cVar, c1770a);
                this.f92569b = null;
                this.f92568a = 1;
                if (q53.r.a(tVar, d6Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.data.InMemoryDeviceBatteryStatusRepository$2", f = "InMemoryDeviceBatteryStatusRepository.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<Object, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f92572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92573b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = c.this.new b(dVar);
            bVar.f92573b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((b) create(obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            LinkedHashMap linkedHashMapN;
            Object obj2 = this.f92573b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f92572a;
            if (i14 == 0) {
                r.b(obj);
                boolean z14 = obj2 instanceof la2.b;
                c cVar = c.this;
                if (z14) {
                    if (c0.g(cVar.f92562a)) {
                        DeviceProfile deviceProfile = ((la2.b) obj2).f111632a;
                        String strE = org.apache.commons.lang3.e.e(deviceProfile.getF92746j(), "Device connected, fetching battery status for device unit id ");
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var, "DeviceBatteryStatusRepository", strE);
                        long f92746j = deviceProfile.getF92746j();
                        this.f92573b = null;
                        this.f92572a = 1;
                        if (cVar.a(f92746j, this) == aVar) {
                            return aVar;
                        }
                    }
                } else if (obj2 instanceof la2.h) {
                    b0 b0Var = cVar.f92562a;
                    p2 p2Var = cVar.f92567f;
                    if (c0.g(b0Var)) {
                        long f92746j2 = ((la2.h) obj2).f111673a.getF92746j();
                        if (((Map) p2Var.getValue()).containsKey(new Long(f92746j2))) {
                            String strE2 = org.apache.commons.lang3.e.e(f92746j2, "Device disconnected, removing cached battery status for device unit id ");
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.b(a2Var2, "DeviceBatteryStatusRepository", strE2);
                            do {
                                value = p2Var.getValue();
                                linkedHashMapN = u0.n((Map) value);
                                linkedHashMapN.remove(new Long(f92746j2));
                            } while (!p2Var.b(value, linkedHashMapN));
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92575a;

        static {
            int[] iArr = new int[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.values().length];
            try {
                iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.CHARGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.FULLY_CHARGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f92575a = iArr;
        }
    }

    static {
        new C1771c(null);
    }

    public c(b0 b0Var, bc0.b bVar, lc0.h hVar, da2.d dVar, z zVar) {
        b0Var.getClass();
        bVar.getClass();
        hVar.getClass();
        dVar.getClass();
        zVar.getClass();
        this.f92562a = b0Var;
        this.f92563b = bVar;
        this.f92564c = hVar;
        this.f92565d = dVar;
        this.f92566e = zVar;
        this.f92567f = q2.a(new LinkedHashMap());
        s.C(new m1(s.f(new a(null)), new b(null)), b0Var);
    }

    @Override // ic0.a
    public final Object a(long j8, v13.c cVar) {
        return ge1.b.e0(this.f92566e, new ic0.d(this, j8, null), cVar);
    }

    @Override // ic0.a
    public final p2 b() {
        ge1.b.T(this.f92562a, null, null, new e(this, null), 3);
        return this.f92567f;
    }

    /* JADX INFO: renamed from: ic0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lic0/c$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1771c {
        public /* synthetic */ C1771c(j jVar) {
            this();
        }

        private C1771c() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(b0 b0Var, bc0.b bVar, lc0.h hVar, da2.d dVar, z zVar, int i14, j jVar) {
        if ((i14 & 8) != 0) {
            dVar = da2.d.b();
            dVar.getClass();
        }
        da2.d dVar2 = dVar;
        if ((i14 & 16) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(b0Var, bVar, hVar, dVar2, zVar);
    }
}
