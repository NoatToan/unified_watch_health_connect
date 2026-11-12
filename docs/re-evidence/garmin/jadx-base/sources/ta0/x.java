package ta0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.s3;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.a2;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lta0/x;", "Landroidx/lifecycle/u1;", "Lk90/a0;", "getCompatibleDevicesUseCase", "Lk90/c0;", "getDeviceCategoriesUseCase", "Lk90/d;", "bleDeviceDiscoveryUseCase", "Lk90/k;", "bleDeviceTypeDiscoveryUseCase", "Lc22/k;", "appConfigDelegate", "Llc0/f;", "getBluetoothStateUseCase", "<init>", "(Lk90/a0;Lk90/c0;Lk90/d;Lk90/k;Lc22/k;Llc0/f;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends u1 {
    public static final int B;
    public final ConcurrentHashMap<String, bm2.a> A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k90.a0 f163457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k90.c0 f163458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k90.d f163459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k90.k f163460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c22.k f163461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e2 f163462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f163463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f163464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f163465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e2 f163466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f163467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f163468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f163469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f163470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f163471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f163472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f163473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f163474r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2 f163475t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b2 f163476v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p2 f163477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b2 f163478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c2 f163479y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o53.r<l90.c> f163480z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lo13/q;", "", "Ll90/b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDiscoveryViewModel$compatibleDevices$1", f = "DeviceDiscoveryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super o13.q<? extends List<? extends l90.b>>>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return x.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super o13.q<? extends List<? extends l90.b>>> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x xVar = x.this;
            xVar.getClass();
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceDiscoveryViewModel", "Fetching compatible devices");
            ge1.b.T(v1.a(xVar), null, null, new z(xVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDiscoveryViewModel$showDeviceUnitId$1", f = "DeviceDiscoveryViewModel.kt", l = {95}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f163482a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return x.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f163482a;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = x.this.f163477w;
                s3.f23252a.getClass();
                Boolean boolValueOf = Boolean.valueOf(s3.a("ROLE_MBTESTER"));
                this.f163482a = 1;
                p2Var.k(null, boolValueOf);
                if (Unit.INSTANCE == aVar) {
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

    static {
        new a(null);
        B = 8;
    }

    public x(k90.a0 a0Var, k90.c0 c0Var, k90.d dVar, k90.k kVar, c22.k kVar2, lc0.f fVar) {
        a0Var.getClass();
        c0Var.getClass();
        dVar.getClass();
        kVar.getClass();
        kVar2.getClass();
        fVar.getClass();
        this.f163457a = a0Var;
        this.f163458b = c0Var;
        this.f163459c = dVar;
        this.f163460d = kVar;
        this.f163461e = kVar2;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f163462f = e2VarB;
        this.f163463g = r53.s.c(e2VarB);
        p2 p2VarA = q2.a(null);
        this.f163464h = p2VarA;
        this.f163465i = r53.s.d(p2VarA);
        e2 e2VarB2 = g2.b(0, 0, null, 7);
        this.f163466j = e2VarB2;
        this.f163467k = r53.s.c(e2VarB2);
        p2 p2VarA2 = q2.a(null);
        this.f163468l = p2VarA2;
        r53.v vVar = new r53.v(new b(null), p2VarA2);
        w9.a aVarA = v1.a(this);
        k2.a aVar = k2.f150703a;
        this.f163469m = r53.s.K(vVar, aVarA, k2.a.a(aVar, 2), null);
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        p2 p2VarA3 = q2.a(k0Var);
        this.f163470n = p2VarA3;
        this.f163471o = r53.s.d(p2VarA3);
        Boolean bool = Boolean.FALSE;
        p2 p2VarA4 = q2.a(bool);
        this.f163472p = p2VarA4;
        this.f163473q = p2VarA4;
        p2 p2VarA5 = q2.a(null);
        this.f163474r = p2VarA5;
        this.f163475t = p2VarA5;
        this.f163476v = r53.s.K(fVar.a(), v1.a(this), k2.a.a(aVar, 3), Boolean.TRUE);
        p2 p2VarA6 = q2.a(bool);
        this.f163477w = p2VarA6;
        this.f163478x = r53.s.K(new r53.v(new c(null), r53.s.d(p2VarA6)), v1.a(this), k2.a.a(aVar, 2), bool);
        this.A = new ConcurrentHashMap<>();
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        p2 p2Var2;
        Object value2;
        c2 c2Var = this.f163479y;
        if (c2Var != null) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceDiscoveryViewModel", "Cancelling device discovery job");
            c2Var.c(null);
            this.f163479y = null;
        }
        do {
            p2Var = this.f163472p;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.FALSE));
        do {
            p2Var2 = this.f163464h;
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, null));
    }

    public final void y4(l90.c cVar) {
        cVar.getClass();
        i2.f36769a.getClass();
        i2.a.b(com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP, "DeviceDiscoveryViewModel", "confirmDeviceDetected() - " + cVar);
        o53.r<l90.c> rVar = this.f163480z;
        if (rVar != null) {
            rVar.p(cVar);
        }
    }

    public final l90.k z4(l90.b bVar, dk2.d dVar) {
        gm2.b.f78015a.getClass();
        dVar.getClass();
        Long l14 = dVar.f60244h;
        String str = dVar.f60238b;
        String str2 = dVar.f60237a;
        String str3 = dVar.f60242f;
        Integer num = dVar.f60241e;
        int iIntValue = num != null ? num.intValue() : 0;
        String str4 = dVar.f60239c;
        if (str4 == null) {
            str4 = "";
        }
        Long l15 = dVar.f60243g;
        bm2.a aVar = new bm2.a(str, str2, str3, iIntValue, str4, l15 != null ? l15.longValue() : -1L, l14 != null ? l14.longValue() : -1L);
        this.A.put(dVar.f60238b, aVar);
        return new l90.k(l14 != null ? l14.longValue() : -1L, dVar.f60238b, dVar.f(), (aVar.f18892g & 256) == 256, bVar.f111531p.f58437c.f58413b ? dVar.f60242f : null, bVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lta0/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
